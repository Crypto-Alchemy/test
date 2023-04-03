package p000;

/* renamed from: ys5 */
/* compiled from: SeekParameters */
public final class ys5 {

    /* renamed from: c */
    public static final ys5 f20331c;

    /* renamed from: d */
    public static final ys5 f20332d = new ys5(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: e */
    public static final ys5 f20333e = new ys5(Long.MAX_VALUE, 0);

    /* renamed from: f */
    public static final ys5 f20334f = new ys5(0, Long.MAX_VALUE);

    /* renamed from: g */
    public static final ys5 f20335g;

    /* renamed from: a */
    public final long f20336a;

    /* renamed from: b */
    public final long f20337b;

    static {
        ys5 ys5 = new ys5(0, 0);
        f20331c = ys5;
        f20335g = ys5;
    }

    public ys5(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        C2725kr.m20981a(j2 < 0 ? false : z2);
        this.f20336a = j;
        this.f20337b = j2;
    }

    /* renamed from: a */
    public long mo28203a(long j, long j2, long j3) {
        boolean z;
        long j4 = this.f20336a;
        if (j4 == 0 && this.f20337b == 0) {
            return j;
        }
        long P0 = w67.m29325P0(j, j4, Long.MIN_VALUE);
        long b = w67.m29344b(j, this.f20337b, Long.MAX_VALUE);
        boolean z2 = true;
        if (P0 > j2 || j2 > b) {
            z = false;
        } else {
            z = true;
        }
        if (P0 > j3 || j3 > b) {
            z2 = false;
        }
        if (!z || !z2) {
            if (z) {
                return j2;
            }
            if (z2) {
                return j3;
            }
            return P0;
        } else if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
            return j2;
        } else {
            return j3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ys5.class != obj.getClass()) {
            return false;
        }
        ys5 ys5 = (ys5) obj;
        if (this.f20336a == ys5.f20336a && this.f20337b == ys5.f20337b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f20336a) * 31) + ((int) this.f20337b);
    }
}
