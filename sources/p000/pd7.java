package p000;

import android.view.View;
import android.view.ViewParent;

/* renamed from: pd7 */
/* compiled from: ViewParentCompat */
public final class pd7 {

    /* renamed from: pd7$a */
    /* compiled from: ViewParentCompat */
    public static class C3051a {
        /* renamed from: a */
        public static boolean m24826a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        /* renamed from: b */
        public static boolean m24827b(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }

        /* renamed from: c */
        public static void m24828c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        /* renamed from: d */
        public static void m24829d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }

        /* renamed from: e */
        public static void m24830e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        /* renamed from: f */
        public static boolean m24831f(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        /* renamed from: g */
        public static void m24832g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public static boolean m24819a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return C3051a.m24826a(viewParent, view, f, f2, z);
        } catch (AbstractMethodError unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedFling");
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m24820b(ViewParent viewParent, View view, float f, float f2) {
        try {
            return C3051a.m24827b(viewParent, view, f, f2);
        } catch (AbstractMethodError unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedPreFling");
            return false;
        }
    }

    /* renamed from: c */
    public static void m24821c(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof h54) {
            ((h54) viewParent).onNestedPreScroll(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                C3051a.m24828c(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedPreScroll");
            }
        }
    }

    /* renamed from: d */
    public static void m24822d(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof i54) {
            ((i54) viewParent2).onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent2 instanceof h54) {
            ((h54) viewParent2).onNestedScroll(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                C3051a.m24829d(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedScroll");
            }
        }
    }

    /* renamed from: e */
    public static void m24823e(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof h54) {
            ((h54) viewParent).onNestedScrollAccepted(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                C3051a.m24830e(viewParent, view, view2, i);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedScrollAccepted");
            }
        }
    }

    /* renamed from: f */
    public static boolean m24824f(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof h54) {
            return ((h54) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return C3051a.m24831f(viewParent, view, view2, i);
        } catch (AbstractMethodError unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onStartNestedScroll");
            return false;
        }
    }

    /* renamed from: g */
    public static void m24825g(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof h54) {
            ((h54) viewParent).onStopNestedScroll(view, i);
        } else if (i == 0) {
            try {
                C3051a.m24832g(viewParent, view);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onStopNestedScroll");
            }
        }
    }
}
