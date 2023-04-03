package p000;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: n42 */
/* compiled from: flexibleTypes.kt */
public final class n42 {
    /* renamed from: a */
    public static final i42 m64515a(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        w47 K0 = xc3.mo64506K0();
        vx2.m53589e(K0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (i42) K0;
    }

    /* renamed from: b */
    public static final boolean m64516b(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        return xc3.mo64506K0() instanceof i42;
    }

    /* renamed from: c */
    public static final d36 m64517c(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        w47 K0 = xc3.mo64506K0();
        if (K0 instanceof i42) {
            return ((i42) K0).mo52399P0();
        }
        if (K0 instanceof d36) {
            return (d36) K0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public static final d36 m64518d(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        w47 K0 = xc3.mo64506K0();
        if (K0 instanceof i42) {
            return ((i42) K0).mo52400Q0();
        }
        if (K0 instanceof d36) {
            return (d36) K0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
