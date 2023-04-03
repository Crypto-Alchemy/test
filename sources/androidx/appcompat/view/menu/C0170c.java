package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.C0182i;
import androidx.appcompat.view.menu.C0184j;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.c */
/* compiled from: ListMenuPresenter */
public class C0170c implements C0182i, AdapterView.OnItemClickListener {

    /* renamed from: A */
    public int f748A;

    /* renamed from: a */
    public Context f749a;

    /* renamed from: d */
    public LayoutInflater f750d;

    /* renamed from: e */
    public C0173e f751e;

    /* renamed from: g */
    public ExpandedMenuView f752g;

    /* renamed from: k */
    public int f753k;

    /* renamed from: r */
    public int f754r;

    /* renamed from: s */
    public int f755s;

    /* renamed from: x */
    public C0182i.C0183a f756x;

    /* renamed from: y */
    public C0171a f757y;

    /* renamed from: androidx.appcompat.view.menu.c$a */
    /* compiled from: ListMenuPresenter */
    public class C0171a extends BaseAdapter {

        /* renamed from: a */
        public int f758a = -1;

        public C0171a() {
            mo1358a();
        }

        /* renamed from: a */
        public void mo1358a() {
            C0177g x = C0170c.this.f751e.mo1455x();
            if (x != null) {
                ArrayList<C0177g> B = C0170c.this.f751e.mo1375B();
                int size = B.size();
                for (int i = 0; i < size; i++) {
                    if (B.get(i) == x) {
                        this.f758a = i;
                        return;
                    }
                }
            }
            this.f758a = -1;
        }

        /* renamed from: b */
        public C0177g getItem(int i) {
            ArrayList<C0177g> B = C0170c.this.f751e.mo1375B();
            int i2 = i + C0170c.this.f753k;
            int i3 = this.f758a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return B.get(i2);
        }

        public int getCount() {
            int size = C0170c.this.f751e.mo1375B().size() - C0170c.this.f753k;
            if (this.f758a < 0) {
                return size;
            }
            return size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0170c cVar = C0170c.this;
                view = cVar.f750d.inflate(cVar.f755s, viewGroup, false);
            }
            ((C0184j.C0185a) view).mo1260c(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo1358a();
            super.notifyDataSetChanged();
        }
    }

    public C0170c(Context context, int i) {
        this(i, 0);
        this.f749a = context;
        this.f750d = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter mo1353a() {
        if (this.f757y == null) {
            this.f757y = new C0171a();
        }
        return this.f757y;
    }

    /* renamed from: b */
    public void mo1304b(C0173e eVar, boolean z) {
        C0182i.C0183a aVar = this.f756x;
        if (aVar != null) {
            aVar.mo1168b(eVar, z);
        }
    }

    /* renamed from: c */
    public C0184j mo1354c(ViewGroup viewGroup) {
        if (this.f752g == null) {
            this.f752g = (ExpandedMenuView) this.f750d.inflate(i45.abc_expanded_menu_layout, viewGroup, false);
            if (this.f757y == null) {
                this.f757y = new C0171a();
            }
            this.f752g.setAdapter(this.f757y);
            this.f752g.setOnItemClickListener(this);
        }
        return this.f752g;
    }

    /* renamed from: d */
    public boolean mo1306d(C0173e eVar, C0177g gVar) {
        return false;
    }

    /* renamed from: e */
    public void mo1307e(C0182i.C0183a aVar) {
        this.f756x = aVar;
    }

    /* renamed from: f */
    public void mo1331f(Parcelable parcelable) {
        mo1355m((Bundle) parcelable);
    }

    /* renamed from: g */
    public boolean mo1308g(C0189l lVar) {
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        new C0176f(lVar).mo1459d((IBinder) null);
        C0182i.C0183a aVar = this.f756x;
        if (aVar == null) {
            return true;
        }
        aVar.mo1169c(lVar);
        return true;
    }

    public int getId() {
        return this.f748A;
    }

    /* renamed from: h */
    public Parcelable mo1332h() {
        if (this.f752g == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        mo1356n(bundle);
        return bundle;
    }

    /* renamed from: i */
    public void mo1310i(boolean z) {
        C0171a aVar = this.f757y;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: j */
    public boolean mo1333j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo1311k(C0173e eVar, C0177g gVar) {
        return false;
    }

    /* renamed from: l */
    public void mo1312l(Context context, C0173e eVar) {
        if (this.f754r != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f754r);
            this.f749a = contextThemeWrapper;
            this.f750d = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f749a != null) {
            this.f749a = context;
            if (this.f750d == null) {
                this.f750d = LayoutInflater.from(context);
            }
        }
        this.f751e = eVar;
        C0171a aVar = this.f757y;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: m */
    public void mo1355m(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f752g.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: n */
    public void mo1356n(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f752g;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f751e.mo1387O(this.f757y.getItem(i), this, 0);
    }

    public C0170c(int i, int i2) {
        this.f755s = i;
        this.f754r = i2;
    }
}
