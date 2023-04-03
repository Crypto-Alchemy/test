package p000;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: kt4 */
/* compiled from: PopupWindowCompat */
public final class kt4 {

    /* renamed from: kt4$a */
    /* compiled from: PopupWindowCompat */
    public static class C2729a {
        /* renamed from: a */
        public static void m21075a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* renamed from: kt4$b */
    /* compiled from: PopupWindowCompat */
    public static class C2730b {
        /* renamed from: a */
        public static boolean m21076a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        /* renamed from: b */
        public static int m21077b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        /* renamed from: c */
        public static void m21078c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        /* renamed from: d */
        public static void m21079d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    /* renamed from: a */
    public static void m21072a(PopupWindow popupWindow, boolean z) {
        C2730b.m21078c(popupWindow, z);
    }

    /* renamed from: b */
    public static void m21073b(PopupWindow popupWindow, int i) {
        C2730b.m21079d(popupWindow, i);
    }

    /* renamed from: c */
    public static void m21074c(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        C2729a.m21075a(popupWindow, view, i, i2, i3);
    }
}
