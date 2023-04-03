package p000;

import com.google.android.gms.internal.clearcut.C4068l;
import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.clearcut.zzge$zzs;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: mv8 */
public final class mv8 extends lr8<mv8> implements Cloneable {

    /* renamed from: A */
    public boolean f31838A = false;

    /* renamed from: B */
    public qv8[] f31839B = qv8.m50889i();

    /* renamed from: C */
    public byte[] f31840C;

    /* renamed from: H */
    public C4068l f31841H;

    /* renamed from: I */
    public byte[] f31842I;

    /* renamed from: L */
    public String f31843L;

    /* renamed from: M */
    public String f31844M;

    /* renamed from: P */
    public su8 f31845P;

    /* renamed from: Q */
    public String f31846Q;

    /* renamed from: U */
    public long f31847U;

    /* renamed from: X */
    public vu8 f31848X;

    /* renamed from: Y */
    public byte[] f31849Y;

    /* renamed from: Z */
    public String f31850Z;

    /* renamed from: b1 */
    public zzge$zzs f31851b1;

    /* renamed from: e */
    public long f31852e = 0;

    /* renamed from: e0 */
    public int f31853e0;

    /* renamed from: e1 */
    public boolean f31854e1;

    /* renamed from: g */
    public long f31855g = 0;

    /* renamed from: k */
    public long f31856k = 0;

    /* renamed from: k0 */
    public int[] f31857k0;

    /* renamed from: r */
    public String f31858r = "";

    /* renamed from: s */
    public int f31859s = 0;

    /* renamed from: v0 */
    public long f31860v0;

    /* renamed from: x */
    public String f31861x = "";

    /* renamed from: y */
    public int f31862y = 0;

    public mv8() {
        byte[] bArr = ws8.f35426h;
        this.f31840C = bArr;
        this.f31841H = null;
        this.f31842I = bArr;
        this.f31843L = "";
        this.f31844M = "";
        this.f31845P = null;
        this.f31846Q = "";
        this.f31847U = pq1.DEFAULT_SYNC_THRESHOLD;
        this.f31848X = null;
        this.f31849Y = bArr;
        this.f31850Z = "";
        this.f31853e0 = 0;
        this.f31857k0 = ws8.f35419a;
        this.f31860v0 = 0;
        this.f31851b1 = null;
        this.f31854e1 = false;
        this.f31388d = null;
        this.f20992a = -1;
    }

    /* renamed from: a */
    public final void mo29047a(gr8 gr8) throws IOException {
        long j = this.f31852e;
        if (j != 0) {
            gr8.mo42967u(1, j);
        }
        String str = this.f31858r;
        if (str != null && !str.equals("")) {
            gr8.mo42957b(2, this.f31858r);
        }
        qv8[] qv8Arr = this.f31839B;
        int i = 0;
        if (qv8Arr != null && qv8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                qv8[] qv8Arr2 = this.f31839B;
                if (i2 >= qv8Arr2.length) {
                    break;
                }
                qv8 qv8 = qv8Arr2[i2];
                if (qv8 != null) {
                    gr8.mo42958c(3, qv8);
                }
                i2++;
            }
        }
        byte[] bArr = this.f31840C;
        byte[] bArr2 = ws8.f35426h;
        if (!Arrays.equals(bArr, bArr2)) {
            gr8.mo42959d(4, this.f31840C);
        }
        if (!Arrays.equals(this.f31842I, bArr2)) {
            gr8.mo42959d(6, this.f31842I);
        }
        su8 su8 = this.f31845P;
        if (su8 != null) {
            gr8.mo42958c(7, su8);
        }
        String str2 = this.f31843L;
        if (str2 != null && !str2.equals("")) {
            gr8.mo42957b(8, this.f31843L);
        }
        C4068l lVar = this.f31841H;
        if (lVar != null) {
            gr8.mo42965o(9, lVar);
        }
        int i3 = this.f31859s;
        if (i3 != 0) {
            gr8.mo42964l(11, i3);
        }
        String str3 = this.f31844M;
        if (str3 != null && !str3.equals("")) {
            gr8.mo42957b(13, this.f31844M);
        }
        String str4 = this.f31846Q;
        if (str4 != null && !str4.equals("")) {
            gr8.mo42957b(14, this.f31846Q);
        }
        long j2 = this.f31847U;
        if (j2 != pq1.DEFAULT_SYNC_THRESHOLD) {
            gr8.mo42962j(15, 0);
            gr8.mo42968w(gr8.m44872v(j2));
        }
        vu8 vu8 = this.f31848X;
        if (vu8 != null) {
            gr8.mo42958c(16, vu8);
        }
        long j3 = this.f31855g;
        if (j3 != 0) {
            gr8.mo42967u(17, j3);
        }
        if (!Arrays.equals(this.f31849Y, bArr2)) {
            gr8.mo42959d(18, this.f31849Y);
        }
        int[] iArr = this.f31857k0;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f31857k0;
                if (i >= iArr2.length) {
                    break;
                }
                gr8.mo42964l(20, iArr2[i]);
                i++;
            }
        }
        zzge$zzs zzge_zzs = this.f31851b1;
        if (zzge_zzs != null) {
            gr8.mo42965o(23, zzge_zzs);
        }
        String str5 = this.f31850Z;
        if (str5 != null && !str5.equals("")) {
            gr8.mo42957b(24, this.f31850Z);
        }
        boolean z = this.f31854e1;
        if (z) {
            gr8.mo42963k(25, z);
        }
        String str6 = this.f31861x;
        if (str6 != null && !str6.equals("")) {
            gr8.mo42957b(26, this.f31861x);
        }
        super.mo29047a(gr8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mv8)) {
            return false;
        }
        mv8 mv8 = (mv8) obj;
        if (this.f31852e != mv8.f31852e || this.f31855g != mv8.f31855g) {
            return false;
        }
        String str = this.f31858r;
        if (str == null) {
            if (mv8.f31858r != null) {
                return false;
            }
        } else if (!str.equals(mv8.f31858r)) {
            return false;
        }
        if (this.f31859s != mv8.f31859s) {
            return false;
        }
        String str2 = this.f31861x;
        if (str2 == null) {
            if (mv8.f31861x != null) {
                return false;
            }
        } else if (!str2.equals(mv8.f31861x)) {
            return false;
        }
        if (!xr8.m54526c(this.f31839B, mv8.f31839B) || !Arrays.equals(this.f31840C, mv8.f31840C)) {
            return false;
        }
        C4068l lVar = this.f31841H;
        if (lVar == null) {
            if (mv8.f31841H != null) {
                return false;
            }
        } else if (!lVar.equals(mv8.f31841H)) {
            return false;
        }
        if (!Arrays.equals(this.f31842I, mv8.f31842I)) {
            return false;
        }
        String str3 = this.f31843L;
        if (str3 == null) {
            if (mv8.f31843L != null) {
                return false;
            }
        } else if (!str3.equals(mv8.f31843L)) {
            return false;
        }
        String str4 = this.f31844M;
        if (str4 == null) {
            if (mv8.f31844M != null) {
                return false;
            }
        } else if (!str4.equals(mv8.f31844M)) {
            return false;
        }
        su8 su8 = this.f31845P;
        if (su8 == null) {
            if (mv8.f31845P != null) {
                return false;
            }
        } else if (!su8.equals(mv8.f31845P)) {
            return false;
        }
        String str5 = this.f31846Q;
        if (str5 == null) {
            if (mv8.f31846Q != null) {
                return false;
            }
        } else if (!str5.equals(mv8.f31846Q)) {
            return false;
        }
        if (this.f31847U != mv8.f31847U) {
            return false;
        }
        vu8 vu8 = this.f31848X;
        if (vu8 == null) {
            if (mv8.f31848X != null) {
                return false;
            }
        } else if (!vu8.equals(mv8.f31848X)) {
            return false;
        }
        if (!Arrays.equals(this.f31849Y, mv8.f31849Y)) {
            return false;
        }
        String str6 = this.f31850Z;
        if (str6 == null) {
            if (mv8.f31850Z != null) {
                return false;
            }
        } else if (!str6.equals(mv8.f31850Z)) {
            return false;
        }
        if (!xr8.m54524a(this.f31857k0, mv8.f31857k0)) {
            return false;
        }
        zzge$zzs zzge_zzs = this.f31851b1;
        if (zzge_zzs == null) {
            if (mv8.f31851b1 != null) {
                return false;
            }
        } else if (!zzge_zzs.equals(mv8.f31851b1)) {
            return false;
        }
        if (this.f31854e1 != mv8.f31854e1) {
            return false;
        }
        qr8 qr8 = this.f31388d;
        if (qr8 != null && !qr8.mo47262a()) {
            return this.f31388d.equals(mv8.f31388d);
        }
        qr8 qr82 = mv8.f31388d;
        return qr82 == null || qr82.mo47262a();
    }

    /* renamed from: f */
    public final int mo29050f() {
        int[] iArr;
        int f = super.mo29050f();
        long j = this.f31852e;
        if (j != 0) {
            f += gr8.m44866m(1, j);
        }
        String str = this.f31858r;
        if (str != null && !str.equals("")) {
            f += gr8.m44863g(2, this.f31858r);
        }
        qv8[] qv8Arr = this.f31839B;
        int i = 0;
        if (qv8Arr != null && qv8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                qv8[] qv8Arr2 = this.f31839B;
                if (i2 >= qv8Arr2.length) {
                    break;
                }
                qv8 qv8 = qv8Arr2[i2];
                if (qv8 != null) {
                    f += gr8.m44864h(3, qv8);
                }
                i2++;
            }
        }
        byte[] bArr = this.f31840C;
        byte[] bArr2 = ws8.f35426h;
        if (!Arrays.equals(bArr, bArr2)) {
            f += gr8.m44865i(4, this.f31840C);
        }
        if (!Arrays.equals(this.f31842I, bArr2)) {
            f += gr8.m44865i(6, this.f31842I);
        }
        su8 su8 = this.f31845P;
        if (su8 != null) {
            f += gr8.m44864h(7, su8);
        }
        String str2 = this.f31843L;
        if (str2 != null && !str2.equals("")) {
            f += gr8.m44863g(8, this.f31843L);
        }
        C4068l lVar = this.f31841H;
        if (lVar != null) {
            f += zzbn.m33962O(9, lVar);
        }
        int i3 = this.f31859s;
        if (i3 != 0) {
            f += gr8.m44874y(11) + gr8.m44875z(i3);
        }
        String str3 = this.f31844M;
        if (str3 != null && !str3.equals("")) {
            f += gr8.m44863g(13, this.f31844M);
        }
        String str4 = this.f31846Q;
        if (str4 != null && !str4.equals("")) {
            f += gr8.m44863g(14, this.f31846Q);
        }
        long j2 = this.f31847U;
        if (j2 != pq1.DEFAULT_SYNC_THRESHOLD) {
            f += gr8.m44874y(15) + gr8.m44873x(gr8.m44872v(j2));
        }
        vu8 vu8 = this.f31848X;
        if (vu8 != null) {
            f += gr8.m44864h(16, vu8);
        }
        long j3 = this.f31855g;
        if (j3 != 0) {
            f += gr8.m44866m(17, j3);
        }
        if (!Arrays.equals(this.f31849Y, bArr2)) {
            f += gr8.m44865i(18, this.f31849Y);
        }
        int[] iArr2 = this.f31857k0;
        if (iArr2 != null && iArr2.length > 0) {
            int i4 = 0;
            while (true) {
                iArr = this.f31857k0;
                if (i >= iArr.length) {
                    break;
                }
                i4 += gr8.m44875z(iArr[i]);
                i++;
            }
            f = f + i4 + (iArr.length * 2);
        }
        zzge$zzs zzge_zzs = this.f31851b1;
        if (zzge_zzs != null) {
            f += zzbn.m33962O(23, zzge_zzs);
        }
        String str5 = this.f31850Z;
        if (str5 != null && !str5.equals("")) {
            f += gr8.m44863g(24, this.f31850Z);
        }
        if (this.f31854e1) {
            f += gr8.m44874y(25) + 1;
        }
        String str6 = this.f31861x;
        return (str6 == null || str6.equals("")) ? f : f + gr8.m44863g(26, this.f31861x);
    }

    /* renamed from: g */
    public final /* synthetic */ as8 mo29051g() throws CloneNotSupportedException {
        return (mv8) clone();
    }

    /* renamed from: h */
    public final /* synthetic */ lr8 mo45497h() throws CloneNotSupportedException {
        return (mv8) clone();
    }

    public final int hashCode() {
        long j = this.f31852e;
        long j2 = this.f31855g;
        int hashCode = (((((mv8.class.getName().hashCode() + 527) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31 * 31;
        String str = this.f31858r;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f31859s) * 31;
        String str2 = this.f31861x;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        int i2 = 1237;
        int f = ((((((hashCode2 + hashCode3) * 31 * 31) + 1237) * 31) + xr8.m54529f(this.f31839B)) * 31) + Arrays.hashCode(this.f31840C);
        C4068l lVar = this.f31841H;
        int hashCode4 = ((((f * 31) + (lVar == null ? 0 : lVar.hashCode())) * 31) + Arrays.hashCode(this.f31842I)) * 31;
        String str3 = this.f31843L;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f31844M;
        int hashCode6 = hashCode5 + (str4 == null ? 0 : str4.hashCode());
        su8 su8 = this.f31845P;
        int hashCode7 = ((hashCode6 * 31) + (su8 == null ? 0 : su8.hashCode())) * 31;
        String str5 = this.f31846Q;
        int hashCode8 = str5 == null ? 0 : str5.hashCode();
        long j3 = this.f31847U;
        vu8 vu8 = this.f31848X;
        int hashCode9 = (((((((hashCode7 + hashCode8) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (vu8 == null ? 0 : vu8.hashCode())) * 31) + Arrays.hashCode(this.f31849Y)) * 31;
        String str6 = this.f31850Z;
        int hashCode10 = str6 == null ? 0 : str6.hashCode();
        zzge$zzs zzge_zzs = this.f31851b1;
        int d = (((((hashCode9 + hashCode10) * 31 * 31) + xr8.m54527d(this.f31857k0)) * 31 * 31) + (zzge_zzs == null ? 0 : zzge_zzs.hashCode())) * 31;
        if (this.f31854e1) {
            i2 = 1231;
        }
        int i3 = (d + i2) * 31;
        qr8 qr8 = this.f31388d;
        if (qr8 != null && !qr8.mo47262a()) {
            i = this.f31388d.hashCode();
        }
        return i3 + i;
    }

    /* renamed from: i */
    public final mv8 clone() {
        try {
            mv8 mv8 = (mv8) super.clone();
            qv8[] qv8Arr = this.f31839B;
            if (qv8Arr != null && qv8Arr.length > 0) {
                mv8.f31839B = new qv8[qv8Arr.length];
                int i = 0;
                while (true) {
                    qv8[] qv8Arr2 = this.f31839B;
                    if (i >= qv8Arr2.length) {
                        break;
                    }
                    qv8 qv8 = qv8Arr2[i];
                    if (qv8 != null) {
                        mv8.f31839B[i] = (qv8) qv8.clone();
                    }
                    i++;
                }
            }
            C4068l lVar = this.f31841H;
            if (lVar != null) {
                mv8.f31841H = lVar;
            }
            su8 su8 = this.f31845P;
            if (su8 != null) {
                mv8.f31845P = (su8) su8.clone();
            }
            vu8 vu8 = this.f31848X;
            if (vu8 != null) {
                mv8.f31848X = (vu8) vu8.clone();
            }
            int[] iArr = this.f31857k0;
            if (iArr != null && iArr.length > 0) {
                mv8.f31857k0 = (int[]) iArr.clone();
            }
            zzge$zzs zzge_zzs = this.f31851b1;
            if (zzge_zzs != null) {
                mv8.f31851b1 = zzge_zzs;
            }
            return mv8;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
