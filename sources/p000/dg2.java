package p000;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* renamed from: dg2 */
/* compiled from: GhostViewHolder */
public class dg2 extends FrameLayout {

    /* renamed from: a */
    public ViewGroup f10706a;

    /* renamed from: d */
    public boolean f10707d = true;

    public dg2(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f10706a = viewGroup;
        viewGroup.setTag(e35.ghost_view_holder, this);
        ic7.m19556b(this.f10706a).mo19232c(this);
    }

    /* renamed from: b */
    public static dg2 m15101b(ViewGroup viewGroup) {
        return (dg2) viewGroup.getTag(e35.ghost_view_holder);
    }

    /* renamed from: d */
    public static void m15102d(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m15102d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* renamed from: e */
    public static boolean m15103e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() == view2.getZ()) {
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(ic7.m19555a(viewGroup, i));
                if (childAt == view) {
                    return false;
                }
                if (childAt == view2) {
                    break;
                }
            }
            return true;
        } else if (view.getZ() > view2.getZ()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m15104f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return m15103e(view, view2);
            }
        }
        if (arrayList2.size() == min) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo18761a(fg2 fg2) {
        ArrayList arrayList = new ArrayList();
        m15102d(fg2.f11827e, arrayList);
        int c = mo18762c(arrayList);
        if (c < 0 || c >= getChildCount()) {
            addView(fg2);
        } else {
            addView(fg2, c);
        }
    }

    /* renamed from: c */
    public final int mo18762c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            m15102d(((fg2) getChildAt(i2)).f11827e, arrayList2);
            if (m15104f(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    /* renamed from: g */
    public void mo18763g() {
        if (this.f10707d) {
            ic7.m19556b(this.f10706a).mo19233d(this);
            ic7.m19556b(this.f10706a).mo19232c(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewAdded(View view) {
        if (this.f10707d) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f10706a.setTag(e35.ghost_view_holder, (Object) null);
            ic7.m19556b(this.f10706a).mo19233d(this);
            this.f10707d = false;
        }
    }
}
