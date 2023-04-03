package p000;

/* renamed from: cc1 */
/* compiled from: Density.kt */
public final /* synthetic */ class cc1 {
    /* renamed from: a */
    public static float m11822a(dc1 dc1, long j) {
        if (io6.m19758g(go6.m18277g(j), io6.f13355b.mo21605b())) {
            return go6.m18278h(j) * dc1.mo3631v() * dc1.getDensity();
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    /* renamed from: b */
    public static float m11823b(dc1 dc1, float f) {
        return f * dc1.getDensity();
    }

    /* renamed from: c */
    public static long m11824c(dc1 dc1, long j) {
        boolean z;
        if (j != xi1.f19843a.mo27746a()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return w36.m29258a(dc1.mo18680y(xi1.m30116e(j)), dc1.mo18680y(xi1.m30115d(j)));
        }
        return t36.f17886a.mo26030a();
    }
}
