package p000;

import java.math.BigInteger;
import java.security.SecureRandom;
import p000.ul1;

/* renamed from: lo5 */
public class lo5 extends ul1.C9407c {

    /* renamed from: j */
    public static final BigInteger f40667j = no5.f43522h;

    /* renamed from: k */
    public static final zl1[] f40668k = {new no5(tl1.f44772b)};

    /* renamed from: i */
    public oo5 f40669i = new oo5(this, (zl1) null, (zl1) null);

    /* renamed from: lo5$a */
    public class C7846a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f40670a;

        /* renamed from: b */
        public final /* synthetic */ int[] f40671b;

        public C7846a(int i, int[] iArr) {
            this.f40670a = i;
            this.f40671b = iArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            int[] h = h34.m58433h();
            int[] h2 = h34.m58433h();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f40670a; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 6; i5++) {
                    int i6 = h[i5];
                    int[] iArr = this.f40671b;
                    h[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    h2[i5] = h2[i5] ^ (iArr[(i2 + 6) + i5] & i4);
                }
                i2 += 12;
            }
            return mo55944c(h, h2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            int[] h = h34.m58433h();
            int[] h2 = h34.m58433h();
            int i2 = i * 6 * 2;
            for (int i3 = 0; i3 < 6; i3++) {
                int[] iArr = this.f40671b;
                h[i3] = iArr[i2 + i3];
                h2[i3] = iArr[i2 + 6 + i3];
            }
            return mo55944c(h, h2);
        }

        /* renamed from: c */
        public final nm1 mo55944c(int[] iArr, int[] iArr2) {
            return lo5.this.mo50665i(new no5(iArr), new no5(iArr2), lo5.f40668k);
        }

        public int getSize() {
            return this.f40670a;
        }
    }

    public lo5() {
        super(f40667j);
        this.f45110b = mo50666m(tl1.f44771a);
        this.f45111c = mo50666m(BigInteger.valueOf(3));
        this.f45112d = new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.f45113e = BigInteger.valueOf(1);
        this.f45114f = 2;
    }

    /* renamed from: B */
    public zl1 mo50660B(SecureRandom secureRandom) {
        int[] h = h34.m58433h();
        mo5.m64377j(secureRandom, h);
        return new no5(h);
    }

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 2;
    }

    /* renamed from: c */
    public ul1 mo50662c() {
        return new lo5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        int[] iArr = new int[(i2 * 6 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            h34.m58430e(((no5) nm1.mo62744n()).f43523g, 0, iArr, i3);
            int i5 = i3 + 6;
            h34.m58430e(((no5) nm1.mo62745o()).f43523g, 0, iArr, i5);
            i3 = i5 + 6;
        }
        return new C7846a(i2, iArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new oo5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new oo5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new no5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return f40667j.bitLength();
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f40669i;
    }
}
