package p000;

import java.math.BigInteger;
import java.security.SecureRandom;
import p000.ul1;

/* renamed from: to5 */
public class to5 extends ul1.C9407c {

    /* renamed from: j */
    public static final BigInteger f44781j = vo5.f45335h;

    /* renamed from: k */
    public static final zl1[] f44782k = {new vo5(tl1.f44772b)};

    /* renamed from: i */
    public wo5 f44783i = new wo5(this, (zl1) null, (zl1) null);

    /* renamed from: to5$a */
    public class C9365a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f44784a;

        /* renamed from: b */
        public final /* synthetic */ int[] f44785b;

        public C9365a(int i, int[] iArr) {
            this.f44784a = i;
            this.f44785b = iArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            int[] e = i34.m58829e();
            int[] e2 = i34.m58829e();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f44784a; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 7; i5++) {
                    int i6 = e[i5];
                    int[] iArr = this.f44785b;
                    e[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    e2[i5] = e2[i5] ^ (iArr[(i2 + 7) + i5] & i4);
                }
                i2 += 14;
            }
            return mo66100c(e, e2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            int[] e = i34.m58829e();
            int[] e2 = i34.m58829e();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f44784a; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 7; i5++) {
                    int i6 = e[i5];
                    int[] iArr = this.f44785b;
                    e[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    e2[i5] = e2[i5] ^ (iArr[(i2 + 7) + i5] & i4);
                }
                i2 += 14;
            }
            return mo66100c(e, e2);
        }

        /* renamed from: c */
        public final nm1 mo66100c(int[] iArr, int[] iArr2) {
            return to5.this.mo50665i(new vo5(iArr), new vo5(iArr2), to5.f44782k);
        }

        public int getSize() {
            return this.f44784a;
        }
    }

    public to5() {
        super(f44781j);
        this.f45110b = mo50666m(tl1.f44771a);
        this.f45111c = mo50666m(BigInteger.valueOf(5));
        this.f45112d = new BigInteger(1, zl2.m75083a("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.f45113e = BigInteger.valueOf(1);
        this.f45114f = 2;
    }

    /* renamed from: B */
    public zl1 mo50660B(SecureRandom secureRandom) {
        int[] e = i34.m58829e();
        uo5.m72939j(secureRandom, e);
        return new vo5(e);
    }

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 2;
    }

    /* renamed from: c */
    public ul1 mo50662c() {
        return new to5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        int[] iArr = new int[(i2 * 7 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            i34.m58827c(((vo5) nm1.mo62744n()).f45337g, 0, iArr, i3);
            int i5 = i3 + 7;
            i34.m58827c(((vo5) nm1.mo62745o()).f45337g, 0, iArr, i5);
            i3 = i5 + 7;
        }
        return new C9365a(i2, iArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new wo5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new wo5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new vo5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return f44781j.bitLength();
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f44783i;
    }
}
