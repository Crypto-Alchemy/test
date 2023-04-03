package p000;

import java.math.BigInteger;
import java.security.SecureRandom;
import p000.ul1;

/* renamed from: xo5 */
public class xo5 extends ul1.C9407c {

    /* renamed from: j */
    public static final BigInteger f45986j = zo5.f46457h;

    /* renamed from: k */
    public static final zl1[] f45987k = {new zo5(tl1.f44772b)};

    /* renamed from: i */
    public ap5 f45988i = new ap5(this, (zl1) null, (zl1) null);

    /* renamed from: xo5$a */
    public class C9605a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f45989a;

        /* renamed from: b */
        public final /* synthetic */ int[] f45990b;

        public C9605a(int i, int[] iArr) {
            this.f45989a = i;
            this.f45990b = iArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            int[] e = i34.m58829e();
            int[] e2 = i34.m58829e();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f45989a; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 7; i5++) {
                    int i6 = e[i5];
                    int[] iArr = this.f45990b;
                    e[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    e2[i5] = e2[i5] ^ (iArr[(i2 + 7) + i5] & i4);
                }
                i2 += 14;
            }
            return mo66907c(e, e2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            int[] e = i34.m58829e();
            int[] e2 = i34.m58829e();
            int i2 = i * 7 * 2;
            for (int i3 = 0; i3 < 7; i3++) {
                int[] iArr = this.f45990b;
                e[i3] = iArr[i2 + i3];
                e2[i3] = iArr[i2 + 7 + i3];
            }
            return mo66907c(e, e2);
        }

        /* renamed from: c */
        public final nm1 mo66907c(int[] iArr, int[] iArr2) {
            return xo5.this.mo50665i(new zo5(iArr), new zo5(iArr2), xo5.f45987k);
        }

        public int getSize() {
            return this.f45989a;
        }
    }

    public xo5() {
        super(f45986j);
        this.f45110b = mo50666m(new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.f45111c = mo50666m(new BigInteger(1, zl2.m75083a("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.f45112d = new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.f45113e = BigInteger.valueOf(1);
        this.f45114f = 2;
    }

    /* renamed from: B */
    public zl1 mo50660B(SecureRandom secureRandom) {
        int[] e = i34.m58829e();
        yo5.m74542k(secureRandom, e);
        return new zo5(e);
    }

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 2;
    }

    /* renamed from: c */
    public ul1 mo50662c() {
        return new xo5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        int[] iArr = new int[(i2 * 7 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            i34.m58827c(((zo5) nm1.mo62744n()).f46458g, 0, iArr, i3);
            int i5 = i3 + 7;
            i34.m58827c(((zo5) nm1.mo62745o()).f46458g, 0, iArr, i5);
            i3 = i5 + 7;
        }
        return new C9605a(i2, iArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new ap5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new ap5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new zo5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return f45986j.bitLength();
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f45988i;
    }
}
