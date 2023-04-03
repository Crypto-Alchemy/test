package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p000.ox0;

/* renamed from: nx0 */
/* compiled from: CursorAdapter */
public abstract class nx0 extends BaseAdapter implements Filterable, ox0.C3005a {

    /* renamed from: a */
    public boolean f15699a;

    /* renamed from: d */
    public boolean f15700d;

    /* renamed from: e */
    public Cursor f15701e;

    /* renamed from: g */
    public Context f15702g;

    /* renamed from: k */
    public int f15703k;

    /* renamed from: r */
    public C2926a f15704r;

    /* renamed from: s */
    public DataSetObserver f15705s;

    /* renamed from: x */
    public ox0 f15706x;

    /* renamed from: nx0$a */
    /* compiled from: CursorAdapter */
    public class C2926a extends ContentObserver {
        public C2926a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            nx0.this.mo23819h();
        }
    }

    /* renamed from: nx0$b */
    /* compiled from: CursorAdapter */
    public class C2927b extends DataSetObserver {
        public C2927b() {
        }

        public void onChanged() {
            nx0 nx0 = nx0.this;
            nx0.f15699a = true;
            nx0.notifyDataSetChanged();
        }

        public void onInvalidated() {
            nx0 nx0 = nx0.this;
            nx0.f15699a = false;
            nx0.notifyDataSetInvalidated();
        }
    }

    public nx0(Context context, Cursor cursor, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        mo23814e(context, cursor, i);
    }

    /* renamed from: a */
    public void mo22722a(Cursor cursor) {
        Cursor i = mo23820i(cursor);
        if (i != null) {
            i.close();
        }
    }

    /* renamed from: c */
    public Cursor mo23813c() {
        return this.f15701e;
    }

    public abstract CharSequence convertToString(Cursor cursor);

    /* renamed from: d */
    public abstract void mo22725d(View view, Context context, Cursor cursor);

    /* renamed from: e */
    public void mo23814e(Context context, Cursor cursor, int i) {
        int i2;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f15700d = true;
        } else {
            this.f15700d = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f15701e = cursor;
        this.f15699a = z;
        this.f15702g = context;
        if (z) {
            i2 = cursor.getColumnIndexOrThrow("_id");
        } else {
            i2 = -1;
        }
        this.f15703k = i2;
        if ((i & 2) == 2) {
            this.f15704r = new C2926a();
            this.f15705s = new C2927b();
        } else {
            this.f15704r = null;
            this.f15705s = null;
        }
        if (z) {
            C2926a aVar = this.f15704r;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f15705s;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: f */
    public abstract View mo19894f(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: g */
    public abstract View mo19895g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f15699a || (cursor = this.f15701e) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f15699a) {
            return null;
        }
        this.f15701e.moveToPosition(i);
        if (view == null) {
            view = mo19894f(this.f15702g, this.f15701e, viewGroup);
        }
        mo22725d(view, this.f15702g, this.f15701e);
        return view;
    }

    public Filter getFilter() {
        if (this.f15706x == null) {
            this.f15706x = new ox0(this);
        }
        return this.f15706x;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f15699a || (cursor = this.f15701e) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f15701e;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f15699a || (cursor = this.f15701e) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f15701e.getLong(this.f15703k);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f15699a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f15701e.moveToPosition(i)) {
            if (view == null) {
                view = mo19895g(this.f15702g, this.f15701e, viewGroup);
            }
            mo22725d(view, this.f15702g, this.f15701e);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    /* renamed from: h */
    public void mo23819h() {
        Cursor cursor;
        if (this.f15700d && (cursor = this.f15701e) != null && !cursor.isClosed()) {
            this.f15699a = this.f15701e.requery();
        }
    }

    /* renamed from: i */
    public Cursor mo23820i(Cursor cursor) {
        Cursor cursor2 = this.f15701e;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C2926a aVar = this.f15704r;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f15705s;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f15701e = cursor;
        if (cursor != null) {
            C2926a aVar2 = this.f15704r;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f15705s;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f15703k = cursor.getColumnIndexOrThrow("_id");
            this.f15699a = true;
            notifyDataSetChanged();
        } else {
            this.f15703k = -1;
            this.f15699a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
