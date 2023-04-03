package p000;

import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: pj2 */
/* compiled from: GravityCompat */
public final class pj2 {

    /* renamed from: pj2$a */
    /* compiled from: GravityCompat */
    public static class C3075a {
        /* renamed from: a */
        public static void m24972a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
        }

        /* renamed from: b */
        public static void m24973b(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        }

        /* renamed from: c */
        public static void m24974c(int i, Rect rect, Rect rect2, int i2) {
            Gravity.applyDisplay(i, rect, rect2, i2);
        }
    }

    /* renamed from: a */
    public static void m24970a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        C3075a.m24973b(i, i2, i3, rect, rect2, i4);
    }

    /* renamed from: b */
    public static int m24971b(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }
}
