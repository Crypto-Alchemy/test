package p000;

import java.math.BigInteger;
import java.security.SecureRandom;
import p000.ul1;

/* renamed from: jp5 */
public class jp5 extends ul1.C9407c {

    /* renamed from: j */
    public static final BigInteger f38757j = lp5.f40675h;

    /* renamed from: k */
    public static final zl1[] f38758k = {new lp5(tl1.f44772b)};

    /* renamed from: i */
    public mp5 f38759i = new mp5(this, (zl1) null, (zl1) null);

    /* renamed from: jp5$a */
    public class C7302a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f38760a;

        /* renamed from: b */
        public final /* synthetic */ int[] f38761b;

        public C7302a(int i, int[] iArr) {
            this.f38760a = i;
            this.f38761b = iArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            int[] j = p34.m70886j(12);
            int[] j2 = p34.m70886j(12);
            int i2 = 0;
            for (int i3 = 0; i3 < this.f38760a; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 12; i5++) {
                    int i6 = j[i5];
                    int[] iArr = this.f38761b;
                    j[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    j2[i5] = j2[i5] ^ (iArr[(i2 + 12) + i5] & i4);
                }
                i2 += 24;
            }
            return mo52765c(j, j2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            int[] j = p34.m70886j(12);
            int[] j2 = p34.m70886j(12);
            int i2 = i * 12 * 2;
            for (int i3 = 0; i3 < 12; i3++) {
                int[] iArr = this.f38761b;
                j[i3] = iArr[i2 + i3];
                j2[i3] = iArr[i2 + 12 + i3];
            }
            return mo52765c(j, j2);
        }

        /* renamed from: c */
        public final nm1 mo52765c(int[] iArr, int[] iArr2) {
            return jp5.this.mo50665i(new lp5(iArr), new lp5(iArr2), jp5.f38758k);
        }

        public int getSize() {
            return this.f38760a;
        }
    }

    public jp5() {
        super(f38757j);
        this.f45110b = mo50666m(new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.f45111c = mo50666m(new BigInteger(1, zl2.m75083a("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.f45112d = new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.f45113e = BigInteger.valueOf(1);
        this.f45114f = 2;
    }

    /* renamed from: B */
    public zl1 mo50660B(SecureRandom secureRandom) {
        int[] j = p34.m70886j(12);
        kp5.m63572k(secureRandom, j);
        return new lp5(j);
    }

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 2;
    }

    /* renamed from: c */
    public ul1 mo50662c() {
        return new jp5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        int[] iArr = new int[(i2 * 12 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            p34.m70885i(12, ((lp5) nm1.mo62744n()).f40676g, 0, iArr, i3);
            int i5 = i3 + 12;
            p34.m70885i(12, ((lp5) nm1.mo62745o()).f40676g, 0, iArr, i5);
            i3 = i5 + 12;
        }
        return new C7302a(i2, iArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new mp5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new mp5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new lp5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return f38757j.bitLength();
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f38759i;
    }
}
