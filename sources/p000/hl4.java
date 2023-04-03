package p000;

import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: hl4 */
/* compiled from: PaintCompat */
public final class hl4 {

    /* renamed from: a */
    public static final ThreadLocal<jl4<Rect, Rect>> f12922a = new ThreadLocal<>();

    /* renamed from: hl4$a */
    /* compiled from: PaintCompat */
    public static class C2478a {
        /* renamed from: a */
        public static boolean m18967a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* renamed from: a */
    public static boolean m18966a(Paint paint, String str) {
        return C2478a.m18967a(paint, str);
    }
}
