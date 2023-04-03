package p000;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: c27 */
/* compiled from: TypeWithEnhancement.kt */
public final class c27 {
    /* renamed from: a */
    public static final xc3 m56293a(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        if (xc3 instanceof b27) {
            return ((b27) xc3).mo50463b0();
        }
        return null;
    }

    /* renamed from: b */
    public static final w47 m56294b(w47 w47, xc3 xc3) {
        vx2.m53591g(w47, "<this>");
        vx2.m53591g(xc3, "origin");
        return m56296d(w47, m56293a(xc3));
    }

    /* renamed from: c */
    public static final w47 m56295c(w47 w47, xc3 xc3, rc2<? super xc3, ? extends xc3> rc2) {
        xc3 xc32;
        vx2.m53591g(w47, "<this>");
        vx2.m53591g(xc3, "origin");
        vx2.m53591g(rc2, "transform");
        xc3 a = m56293a(xc3);
        if (a != null) {
            xc32 = (xc3) rc2.invoke(a);
        } else {
            xc32 = null;
        }
        return m56296d(w47, xc32);
    }

    /* renamed from: d */
    public static final w47 m56296d(w47 w47, xc3 xc3) {
        vx2.m53591g(w47, "<this>");
        if (w47 instanceof b27) {
            return m56296d(((b27) w47).mo50462A0(), xc3);
        }
        if (xc3 == null || vx2.m53586b(xc3, w47)) {
            return w47;
        }
        if (w47 instanceof d36) {
            return new h36((d36) w47, xc3);
        }
        if (w47 instanceof i42) {
            return new m42((i42) w47, xc3);
        }
        throw new NoWhenBranchMatchedException();
    }
}
