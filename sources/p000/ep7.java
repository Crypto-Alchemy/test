package p000;

import com.github.mikephil.charting.utils.Utils;
import p000.kz3;
import p000.xs5;

/* renamed from: ep7 */
/* compiled from: XingSeeker */
public final class ep7 implements at5 {

    /* renamed from: a */
    public final long f11309a;

    /* renamed from: b */
    public final int f11310b;

    /* renamed from: c */
    public final long f11311c;

    /* renamed from: d */
    public final long f11312d;

    /* renamed from: e */
    public final long f11313e;

    /* renamed from: f */
    public final long[] f11314f;

    public ep7(long j, int i, long j2) {
        this(j, i, j2, -1, (long[]) null);
    }

    /* renamed from: a */
    public static ep7 m16286a(long j, long j2, kz3.C2735a aVar, gm4 gm4) {
        int H;
        long j3 = j;
        kz3.C2735a aVar2 = aVar;
        int i = aVar2.f14393g;
        int i2 = aVar2.f14390d;
        int n = gm4.mo20689n();
        if ((n & 1) != 1 || (H = gm4.mo20666H()) == 0) {
            return null;
        }
        long J0 = w67.m29313J0((long) H, ((long) i) * 1000000, (long) i2);
        if ((n & 6) != 6) {
            return new ep7(j2, aVar2.f14389c, J0);
        }
        long F = gm4.mo20664F();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) gm4.mo20662D();
        }
        if (j3 != -1) {
            long j4 = j2 + F;
            if (j3 != j4) {
                gk3.m18132i("XingSeeker", "XING data size mismatch: " + j3 + ", " + j4);
            }
        }
        return new ep7(j2, aVar2.f14389c, J0, F, jArr);
    }

    /* renamed from: b */
    public final long mo19453b(int i) {
        return (this.f11311c * ((long) i)) / 100;
    }

    /* renamed from: c */
    public long mo11141c(long j) {
        long j2;
        double d;
        long j3 = j - this.f11309a;
        if (!mo11156h() || j3 <= ((long) this.f11310b)) {
            return 0;
        }
        long[] jArr = (long[]) C2725kr.m20989i(this.f11314f);
        double d2 = (((double) j3) * 256.0d) / ((double) this.f11312d);
        int i = w67.m29358i(jArr, (long) d2, true, true);
        long b = mo19453b(i);
        long j4 = jArr[i];
        int i2 = i + 1;
        long b2 = mo19453b(i2);
        if (i == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i2];
        }
        if (j4 == j2) {
            d = Utils.DOUBLE_EPSILON;
        } else {
            d = (d2 - ((double) j4)) / ((double) (j2 - j4));
        }
        return b + Math.round(d * ((double) (b2 - b)));
    }

    /* renamed from: f */
    public xs5.C3641a mo11155f(long j) {
        double d;
        if (!mo11156h()) {
            return new xs5.C3641a(new zs5(0, this.f11309a + ((long) this.f11310b)));
        }
        long r = w67.m29376r(j, 0, this.f11311c);
        double d2 = (((double) r) * 100.0d) / ((double) this.f11311c);
        double d3 = Utils.DOUBLE_EPSILON;
        if (d2 > Utils.DOUBLE_EPSILON) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = (long[]) C2725kr.m20989i(this.f11314f);
                double d4 = (double) jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = (double) jArr[i + 1];
                }
                d3 = d4 + ((d2 - ((double) i)) * (d - d4));
            }
        }
        return new xs5.C3641a(new zs5(r, this.f11309a + w67.m29376r(Math.round((d3 / 256.0d) * ((double) this.f11312d)), (long) this.f11310b, this.f11312d - 1)));
    }

    /* renamed from: g */
    public long mo11142g() {
        return this.f11313e;
    }

    /* renamed from: h */
    public boolean mo11156h() {
        if (this.f11314f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public long mo11157i() {
        return this.f11311c;
    }

    public ep7(long j, int i, long j2, long j3, long[] jArr) {
        this.f11309a = j;
        this.f11310b = i;
        this.f11311c = j2;
        this.f11314f = jArr;
        this.f11312d = j3;
        this.f11313e = j3 != -1 ? j + j3 : -1;
    }
}
