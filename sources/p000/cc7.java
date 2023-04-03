package p000;

import android.view.ViewGroup;

/* renamed from: cc7 */
/* compiled from: ViewGroupCompat */
public final class cc7 {

    /* renamed from: cc7$a */
    /* compiled from: ViewGroupCompat */
    public static class C1674a {
        /* renamed from: a */
        public static int m11826a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        /* renamed from: b */
        public static boolean m11827b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        /* renamed from: c */
        public static void m11828c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    /* renamed from: a */
    public static boolean m11825a(ViewGroup viewGroup) {
        return C1674a.m11827b(viewGroup);
    }
}
