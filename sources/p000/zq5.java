package p000;

import java.math.BigInteger;
import p000.ul1;

/* renamed from: zq5 */
public class zq5 extends ul1.C9406b {

    /* renamed from: k */
    public static final zl1[] f46483k = {new yq5(tl1.f44772b)};

    /* renamed from: j */
    public ar5 f46484j = new ar5(this, (zl1) null, (zl1) null);

    /* renamed from: zq5$a */
    public class C9709a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f46485a;

        /* renamed from: b */
        public final /* synthetic */ long[] f46486b;

        public C9709a(int i, long[] jArr) {
            this.f46485a = i;
            this.f46486b = jArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            long[] j = j34.m59225j();
            long[] j2 = j34.m59225j();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f46485a; i3++) {
                long j3 = (long) (((i3 ^ i) - 1) >> 31);
                for (int i4 = 0; i4 < 4; i4++) {
                    long j4 = j[i4];
                    long[] jArr = this.f46486b;
                    j[i4] = j4 ^ (jArr[i2 + i4] & j3);
                    j2[i4] = j2[i4] ^ (jArr[(i2 + 4) + i4] & j3);
                }
                i2 += 8;
            }
            return mo67382c(j, j2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            long[] j = j34.m59225j();
            long[] j2 = j34.m59225j();
            int i2 = i * 4 * 2;
            for (int i3 = 0; i3 < 4; i3++) {
                long[] jArr = this.f46486b;
                j[i3] = jArr[i2 + i3];
                j2[i3] = jArr[i2 + 4 + i3];
            }
            return mo67382c(j, j2);
        }

        /* renamed from: c */
        public final nm1 mo67382c(long[] jArr, long[] jArr2) {
            return zq5.this.mo50665i(new yq5(jArr), new yq5(jArr2), zq5.f46483k);
        }

        public int getSize() {
            return this.f46485a;
        }
    }

    public zq5() {
        super(239, 158, 0, 0);
        this.f45110b = mo50666m(BigInteger.valueOf(0));
        this.f45111c = mo50666m(BigInteger.valueOf(1));
        this.f45112d = new BigInteger(1, zl2.m75083a("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.f45113e = BigInteger.valueOf(4);
        this.f45114f = 6;
    }

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 6;
    }

    /* renamed from: H */
    public boolean mo50699H() {
        return true;
    }

    /* renamed from: c */
    public ul1 mo50662c() {
        return new zq5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        long[] jArr = new long[(i2 * 4 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            j34.m59222g(((yq5) nm1.mo62744n()).f46263g, 0, jArr, i3);
            int i5 = i3 + 4;
            j34.m59222g(((yq5) nm1.mo62745o()).f46263g, 0, jArr, i5);
            i3 = i5 + 4;
        }
        return new C9709a(i2, jArr);
    }

    /* renamed from: f */
    public gm1 mo51274f() {
        return new zf7();
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new ar5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new ar5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new yq5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return 239;
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f46484j;
    }
}
