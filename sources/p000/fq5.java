package p000;

import java.math.BigInteger;
import p000.ul1;

/* renamed from: fq5 */
public class fq5 extends ul1.C9406b {

    /* renamed from: k */
    public static final zl1[] f37879k = {new eq5(tl1.f44772b)};

    /* renamed from: j */
    public gq5 f37880j = new gq5(this, (zl1) null, (zl1) null);

    /* renamed from: fq5$a */
    public class C7093a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f37881a;

        /* renamed from: b */
        public final /* synthetic */ long[] f37882b;

        public C7093a(int i, long[] jArr) {
            this.f37881a = i;
            this.f37882b = jArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            long[] i2 = h34.m58434i();
            long[] i3 = h34.m58434i();
            int i4 = 0;
            for (int i5 = 0; i5 < this.f37881a; i5++) {
                long j = (long) (((i5 ^ i) - 1) >> 31);
                for (int i6 = 0; i6 < 3; i6++) {
                    long j2 = i2[i6];
                    long[] jArr = this.f37882b;
                    i2[i6] = j2 ^ (jArr[i4 + i6] & j);
                    i3[i6] = i3[i6] ^ (jArr[(i4 + 3) + i6] & j);
                }
                i4 += 6;
            }
            return mo51751c(i2, i3);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            long[] i2 = h34.m58434i();
            long[] i3 = h34.m58434i();
            int i4 = i * 3 * 2;
            for (int i5 = 0; i5 < 3; i5++) {
                long[] jArr = this.f37882b;
                i2[i5] = jArr[i4 + i5];
                i3[i5] = jArr[i4 + 3 + i5];
            }
            return mo51751c(i2, i3);
        }

        /* renamed from: c */
        public final nm1 mo51751c(long[] jArr, long[] jArr2) {
            return fq5.this.mo50665i(new eq5(jArr), new eq5(jArr2), fq5.f37879k);
        }

        public int getSize() {
            return this.f37881a;
        }
    }

    public fq5() {
        super(163, 3, 6, 7);
        zl1 m = mo50666m(BigInteger.valueOf(1));
        this.f45110b = m;
        this.f45111c = m;
        this.f45112d = new BigInteger(1, zl2.m75083a("04000000000000000000020108A2E0CC0D99F8A5EF"));
        this.f45113e = BigInteger.valueOf(2);
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
        return new fq5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        long[] jArr = new long[(i2 * 3 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            h34.m58431f(((eq5) nm1.mo62744n()).f37593g, 0, jArr, i3);
            int i5 = i3 + 3;
            h34.m58431f(((eq5) nm1.mo62745o()).f37593g, 0, jArr, i5);
            i3 = i5 + 3;
        }
        return new C7093a(i2, jArr);
    }

    /* renamed from: f */
    public gm1 mo51274f() {
        return new zf7();
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new gq5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new gq5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new eq5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return 163;
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f37880j;
    }
}
