package p000;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: vo3 */
/* compiled from: MaterialShapeUtils */
public class vo3 {
    /* renamed from: a */
    public static eu0 m53439a(int i) {
        if (i == 0) {
            return new fi5();
        }
        if (i != 1) {
            return m53440b();
        }
        return new az0();
    }

    /* renamed from: b */
    public static eu0 m53440b() {
        return new fi5();
    }

    /* renamed from: c */
    public static mn1 m53441c() {
        return new mn1();
    }

    /* renamed from: d */
    public static void m53442d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof uo3) {
            ((uo3) background).mo48439Z(f);
        }
    }

    /* renamed from: e */
    public static void m53443e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof uo3) {
            m53444f(view, (uo3) background);
        }
    }

    /* renamed from: f */
    public static void m53444f(View view, uo3 uo3) {
        if (uo3.mo48432R()) {
            uo3.mo48444e0(pe7.m49901g(view));
        }
    }
}
