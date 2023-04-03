package p000;

import android.view.View;
import android.view.ViewParent;

/* renamed from: me7 */
/* compiled from: ViewTreeLifecycleOwner */
public class me7 {
    /* renamed from: a */
    public static ug3 m22274a(View view) {
        ug3 ug3 = (ug3) view.getTag(t35.view_tree_lifecycle_owner);
        if (ug3 != null) {
            return ug3;
        }
        ViewParent parent = view.getParent();
        while (ug3 == null && (parent instanceof View)) {
            View view2 = (View) parent;
            ug3 = (ug3) view2.getTag(t35.view_tree_lifecycle_owner);
            parent = view2.getParent();
        }
        return ug3;
    }

    /* renamed from: b */
    public static void m22275b(View view, ug3 ug3) {
        view.setTag(t35.view_tree_lifecycle_owner, ug3);
    }
}
