package p000;

import android.view.ViewGroup;

/* renamed from: do3 */
/* compiled from: MarginLayoutParamsCompat */
public final class do3 {

    /* renamed from: do3$a */
    /* compiled from: MarginLayoutParamsCompat */
    public static class C2188a {
        /* renamed from: a */
        public static int m15251a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        /* renamed from: b */
        public static int m15252b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        /* renamed from: c */
        public static int m15253c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        /* renamed from: d */
        public static boolean m15254d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        /* renamed from: e */
        public static void m15255e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.resolveLayoutDirection(i);
        }

        /* renamed from: f */
        public static void m15256f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setLayoutDirection(i);
        }

        /* renamed from: g */
        public static void m15257g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginEnd(i);
        }

        /* renamed from: h */
        public static void m15258h(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginStart(i);
        }
    }

    /* renamed from: a */
    public static int m15247a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C2188a.m15252b(marginLayoutParams);
    }

    /* renamed from: b */
    public static int m15248b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C2188a.m15253c(marginLayoutParams);
    }

    /* renamed from: c */
    public static void m15249c(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C2188a.m15257g(marginLayoutParams, i);
    }

    /* renamed from: d */
    public static void m15250d(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C2188a.m15258h(marginLayoutParams, i);
    }
}
