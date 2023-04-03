package p000;

import sun.misc.Unsafe;

/* renamed from: oa9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class oa9 extends ra9 {
    public oa9(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final void mo45731a(Object obj, long j, byte b) {
        if (ta9.f34215i) {
            ta9.m52164d(obj, j, b);
        } else {
            ta9.m52165e(obj, j, b);
        }
    }

    /* renamed from: b */
    public final boolean mo45732b(Object obj, long j) {
        if (ta9.f34215i) {
            return ta9.m52156A(obj, j);
        }
        return ta9.m52157B(obj, j);
    }

    /* renamed from: c */
    public final void mo45733c(Object obj, long j, boolean z) {
        if (ta9.f34215i) {
            ta9.m52164d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            ta9.m52165e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final float mo45734d(Object obj, long j) {
        return Float.intBitsToFloat(mo47363k(obj, j));
    }

    /* renamed from: e */
    public final void mo45735e(Object obj, long j, float f) {
        mo47364l(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: f */
    public final double mo45736f(Object obj, long j) {
        return Double.longBitsToDouble(mo47365m(obj, j));
    }

    /* renamed from: g */
    public final void mo45737g(Object obj, long j, double d) {
        mo47366n(obj, j, Double.doubleToLongBits(d));
    }
}
