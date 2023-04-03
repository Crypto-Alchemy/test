package p000;

import p000.kz3;
import p000.xs5;

/* renamed from: r87 */
/* compiled from: VbriSeeker */
public final class r87 implements at5 {

    /* renamed from: a */
    public final long[] f17210a;

    /* renamed from: b */
    public final long[] f17211b;

    /* renamed from: c */
    public final long f17212c;

    /* renamed from: d */
    public final long f17213d;

    public r87(long[] jArr, long[] jArr2, long j, long j2) {
        this.f17210a = jArr;
        this.f17211b = jArr2;
        this.f17212c = j;
        this.f17213d = j2;
    }

    /* renamed from: a */
    public static r87 m26127a(long j, long j2, kz3.C2735a aVar, gm4 gm4) {
        int i;
        int i2;
        long j3 = j;
        kz3.C2735a aVar2 = aVar;
        gm4 gm42 = gm4;
        gm42.mo20675Q(10);
        int n = gm4.mo20689n();
        if (n <= 0) {
            return null;
        }
        int i3 = aVar2.f14390d;
        long j4 = (long) n;
        if (i3 >= 32000) {
            i = 1152;
        } else {
            i = 576;
        }
        long J0 = w67.m29313J0(j4, 1000000 * ((long) i), (long) i3);
        int J = gm4.mo20668J();
        int J2 = gm4.mo20668J();
        int J3 = gm4.mo20668J();
        gm42.mo20675Q(2);
        long j5 = j2 + ((long) aVar2.f14389c);
        long[] jArr = new long[J];
        long[] jArr2 = new long[J];
        int i4 = 0;
        long j6 = j2;
        while (i4 < J) {
            int i5 = J2;
            jArr[i4] = (((long) i4) * J0) / ((long) J);
            long j7 = j5;
            jArr2[i4] = Math.max(j6, j7);
            if (J3 == 1) {
                i2 = gm4.mo20662D();
            } else if (J3 == 2) {
                i2 = gm4.mo20668J();
            } else if (J3 == 3) {
                i2 = gm4.mo20665G();
            } else if (J3 != 4) {
                return null;
            } else {
                i2 = gm4.mo20666H();
            }
            long j8 = (long) i2;
            int i6 = i5;
            j6 += j8 * ((long) i6);
            i4++;
            jArr = jArr;
            J2 = i6;
            j5 = j7;
        }
        long[] jArr3 = jArr;
        if (!(j3 == -1 || j3 == j6)) {
            gk3.m18132i("VbriSeeker", "VBRI data size mismatch: " + j3 + ", " + j6);
        }
        return new r87(jArr3, jArr2, J0, j6);
    }

    /* renamed from: c */
    public long mo11141c(long j) {
        return this.f17210a[w67.m29358i(this.f17211b, j, true, true)];
    }

    /* renamed from: f */
    public xs5.C3641a mo11155f(long j) {
        int i = w67.m29358i(this.f17210a, j, true, true);
        zs5 zs5 = new zs5(this.f17210a[i], this.f17211b[i]);
        if (zs5.f20675a >= j || i == this.f17210a.length - 1) {
            return new xs5.C3641a(zs5);
        }
        int i2 = i + 1;
        return new xs5.C3641a(zs5, new zs5(this.f17210a[i2], this.f17211b[i2]));
    }

    /* renamed from: g */
    public long mo11142g() {
        return this.f17213d;
    }

    /* renamed from: h */
    public boolean mo11156h() {
        return true;
    }

    /* renamed from: i */
    public long mo11157i() {
        return this.f17212c;
    }
}
