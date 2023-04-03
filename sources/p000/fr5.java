package p000;

import java.math.BigInteger;
import p000.ul1;

/* renamed from: fr5 */
public class fr5 extends ul1.C9406b {

    /* renamed from: k */
    public static final zl1[] f37900k = {new cr5(tl1.f44772b)};

    /* renamed from: j */
    public gr5 f37901j = new gr5(this, (zl1) null, (zl1) null);

    /* renamed from: fr5$a */
    public class C7101a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f37902a;

        /* renamed from: b */
        public final /* synthetic */ long[] f37903b;

        public C7101a(int i, long[] jArr) {
            this.f37902a = i;
            this.f37903b = jArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            long[] c = k34.m59677c();
            long[] c2 = k34.m59677c();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f37902a; i3++) {
                long j = (long) (((i3 ^ i) - 1) >> 31);
                for (int i4 = 0; i4 < 5; i4++) {
                    long j2 = c[i4];
                    long[] jArr = this.f37903b;
                    c[i4] = j2 ^ (jArr[i2 + i4] & j);
                    c2[i4] = c2[i4] ^ (jArr[(i2 + 5) + i4] & j);
                }
                i2 += 10;
            }
            return mo51774c(c, c2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            long[] c = k34.m59677c();
            long[] c2 = k34.m59677c();
            int i2 = i * 5 * 2;
            for (int i3 = 0; i3 < 5; i3++) {
                long[] jArr = this.f37903b;
                c[i3] = jArr[i2 + i3];
                c2[i3] = jArr[i2 + 5 + i3];
            }
            return mo51774c(c, c2);
        }

        /* renamed from: c */
        public final nm1 mo51774c(long[] jArr, long[] jArr2) {
            return fr5.this.mo50665i(new cr5(jArr), new cr5(jArr2), fr5.f37900k);
        }

        public int getSize() {
            return this.f37902a;
        }
    }

    public fr5() {
        super(283, 5, 7, 12);
        this.f45110b = mo50666m(BigInteger.valueOf(1));
        this.f45111c = mo50666m(new BigInteger(1, zl2.m75083a("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5")));
        this.f45112d = new BigInteger(1, zl2.m75083a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307"));
        this.f45113e = BigInteger.valueOf(2);
        this.f45114f = 6;
    }

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 6;
    }

    /* renamed from: H */
    public boolean mo50699H() {
        return false;
    }

    /* renamed from: c */
    public ul1 mo50662c() {
        return new fr5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        long[] jArr = new long[(i2 * 5 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            k34.m59675a(((cr5) nm1.mo62744n()).f37194g, 0, jArr, i3);
            int i5 = i3 + 5;
            k34.m59675a(((cr5) nm1.mo62745o()).f37194g, 0, jArr, i5);
            i3 = i5 + 5;
        }
        return new C7101a(i2, jArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new gr5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new gr5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new cr5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return 283;
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f37901j;
    }
}
