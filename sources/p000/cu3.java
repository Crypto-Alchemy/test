package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0172d;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0177g;
import androidx.appcompat.view.menu.C0182i;

/* renamed from: cu3 */
/* compiled from: MenuPopup */
public abstract class cu3 implements w06, C0182i, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Rect f10295a;

    /* renamed from: A */
    public static C0172d m14506A(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0172d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0172d) listAdapter;
    }

    /* renamed from: q */
    public static int m14507q(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: z */
    public static boolean m14508z(C0173e eVar) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo1306d(C0173e eVar, C0177g gVar) {
        return false;
    }

    public int getId() {
        return 0;
    }

    /* renamed from: k */
    public boolean mo1311k(C0173e eVar, C0177g gVar) {
        return false;
    }

    /* renamed from: l */
    public void mo1312l(Context context, C0173e eVar) {
    }

    /* renamed from: m */
    public abstract void mo1334m(C0173e eVar);

    /* renamed from: n */
    public boolean mo1335n() {
        return true;
    }

    /* renamed from: o */
    public Rect mo18288o() {
        return this.f10295a;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C0173e eVar = m14506A(listAdapter).f760a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (mo1335n()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        eVar.mo1387O(menuItem, this, i2);
    }

    /* renamed from: r */
    public abstract void mo1339r(View view);

    /* renamed from: s */
    public void mo18290s(Rect rect) {
        this.f10295a = rect;
    }

    /* renamed from: t */
    public abstract void mo1340t(boolean z);

    /* renamed from: u */
    public abstract void mo1341u(int i);

    /* renamed from: v */
    public abstract void mo1342v(int i);

    /* renamed from: w */
    public abstract void mo1343w(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: x */
    public abstract void mo1344x(boolean z);

    /* renamed from: y */
    public abstract void mo1345y(int i);
}
