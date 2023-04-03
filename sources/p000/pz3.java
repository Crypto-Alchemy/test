package p000;

/* renamed from: pz3 */
/* compiled from: MultiImageTranscoderFactory */
public class pz3 implements zr2 {

    /* renamed from: a */
    public final int f16707a;

    /* renamed from: b */
    public final boolean f16708b;

    /* renamed from: c */
    public final zr2 f16709c;

    /* renamed from: d */
    public final Integer f16710d;

    /* renamed from: e */
    public final boolean f16711e;

    public pz3(int i, boolean z, zr2 zr2, Integer num, boolean z2) {
        this.f16707a = i;
        this.f16708b = z;
        this.f16709c = zr2;
        this.f16710d = num;
        this.f16711e = z2;
    }

    /* renamed from: a */
    public final yr2 mo24867a(rq2 rq2, boolean z) {
        zr2 zr2 = this.f16709c;
        if (zr2 == null) {
            return null;
        }
        return zr2.createImageTranscoder(rq2, z);
    }

    /* renamed from: b */
    public final yr2 mo24868b(rq2 rq2, boolean z) {
        Integer num = this.f16710d;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return mo24869c(rq2, z);
        }
        if (intValue == 1) {
            return mo24870d(rq2, z);
        }
        throw new IllegalArgumentException("Invalid ImageTranscoderType");
    }

    /* renamed from: c */
    public final yr2 mo24869c(rq2 rq2, boolean z) {
        return s34.m26578a(this.f16707a, this.f16708b, this.f16711e).createImageTranscoder(rq2, z);
    }

    public yr2 createImageTranscoder(rq2 rq2, boolean z) {
        yr2 a = mo24867a(rq2, z);
        if (a == null) {
            a = mo24868b(rq2, z);
        }
        if (a == null && q34.m25367a()) {
            a = mo24869c(rq2, z);
        }
        if (a == null) {
            return mo24870d(rq2, z);
        }
        return a;
    }

    /* renamed from: d */
    public final yr2 mo24870d(rq2 rq2, boolean z) {
        return new o26(this.f16707a).createImageTranscoder(rq2, z);
    }
}
