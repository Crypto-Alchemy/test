package p000;

import java.math.BigInteger;
import java.security.SecureRandom;
import p000.ul1;

/* renamed from: ho5 */
public class ho5 extends ul1.C9407c {

    /* renamed from: j */
    public static final BigInteger f38240j = jo5.f38752h;

    /* renamed from: k */
    public static final zl1[] f38241k = {new jo5(tl1.f44772b)};

    /* renamed from: i */
    public ko5 f38242i = new ko5(this, (zl1) null, (zl1) null);

    /* renamed from: ho5$a */
    public class C7187a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f38243a;

        /* renamed from: b */
        public final /* synthetic */ int[] f38244b;

        public C7187a(int i, int[] iArr) {
            this.f38243a = i;
            this.f38244b = iArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            int[] d = g34.m58020d();
            int[] d2 = g34.m58020d();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f38243a; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 5; i5++) {
                    int i6 = d[i5];
                    int[] iArr = this.f38244b;
                    d[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    d2[i5] = d2[i5] ^ (iArr[(i2 + 5) + i5] & i4);
                }
                i2 += 10;
            }
            return mo52292c(d, d2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            int[] d = g34.m58020d();
            int[] d2 = g34.m58020d();
            int i2 = i * 5 * 2;
            for (int i3 = 0; i3 < 5; i3++) {
                int[] iArr = this.f38244b;
                d[i3] = iArr[i2 + i3];
                d2[i3] = iArr[i2 + 5 + i3];
            }
            return mo52292c(d, d2);
        }

        /* renamed from: c */
        public final nm1 mo52292c(int[] iArr, int[] iArr2) {
            return ho5.this.mo50665i(new jo5(iArr), new jo5(iArr2), ho5.f38241k);
        }

        public int getSize() {
            return this.f38243a;
        }
    }

    public ho5() {
        super(f38240j);
        this.f45110b = mo50666m(new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.f45111c = mo50666m(new BigInteger(1, zl2.m75083a("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.f45112d = new BigInteger(1, zl2.m75083a("0100000000000000000000351EE786A818F3A1A16B"));
        this.f45113e = BigInteger.valueOf(1);
        this.f45114f = 2;
    }

    /* renamed from: B */
    public zl1 mo50660B(SecureRandom secureRandom) {
        int[] d = g34.m58020d();
        io5.m59042j(secureRandom, d);
        return new jo5(d);
    }

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 2;
    }

    /* renamed from: c */
    public ul1 mo50662c() {
        return new ho5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        int[] iArr = new int[(i2 * 5 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            g34.m58019c(((jo5) nm1.mo62744n()).f38753g, 0, iArr, i3);
            int i5 = i3 + 5;
            g34.m58019c(((jo5) nm1.mo62745o()).f38753g, 0, iArr, i5);
            i3 = i5 + 5;
        }
        return new C7187a(i2, iArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new ko5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new ko5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new jo5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return f38240j.bitLength();
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f38242i;
    }
}
