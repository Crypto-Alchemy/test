package p000;

import java.math.BigInteger;
import java.security.SecureRandom;
import p000.ul1;

/* renamed from: qx0 */
public class qx0 extends ul1.C9407c {

    /* renamed from: j */
    public static final BigInteger f44251j = sx0.f44617h;

    /* renamed from: k */
    public static final BigInteger f44252k;

    /* renamed from: l */
    public static final BigInteger f44253l = new BigInteger(1, zl2.m75083a("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864"));

    /* renamed from: m */
    public static final zl1[] f44254m;

    /* renamed from: i */
    public tx0 f44255i = new tx0(this, (zl1) null, (zl1) null);

    /* renamed from: qx0$a */
    public class C9224a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f44256a;

        /* renamed from: b */
        public final /* synthetic */ int[] f44257b;

        public C9224a(int i, int[] iArr) {
            this.f44256a = i;
            this.f44257b = iArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            int[] i2 = j34.m59224i();
            int[] i3 = j34.m59224i();
            int i4 = 0;
            for (int i5 = 0; i5 < this.f44256a; i5++) {
                int i6 = ((i5 ^ i) - 1) >> 31;
                for (int i7 = 0; i7 < 8; i7++) {
                    int i8 = i2[i7];
                    int[] iArr = this.f44257b;
                    i2[i7] = i8 ^ (iArr[i4 + i7] & i6);
                    i3[i7] = i3[i7] ^ (iArr[(i4 + 8) + i7] & i6);
                }
                i4 += 16;
            }
            return mo65536c(i2, i3);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            int[] i2 = j34.m59224i();
            int[] i3 = j34.m59224i();
            int i4 = i * 8 * 2;
            for (int i5 = 0; i5 < 8; i5++) {
                int[] iArr = this.f44257b;
                i2[i5] = iArr[i4 + i5];
                i3[i5] = iArr[i4 + 8 + i5];
            }
            return mo65536c(i2, i3);
        }

        /* renamed from: c */
        public final nm1 mo65536c(int[] iArr, int[] iArr2) {
            return qx0.this.mo50665i(new sx0(iArr), new sx0(iArr2), qx0.f44254m);
        }

        public int getSize() {
            return this.f44256a;
        }
    }

    static {
        BigInteger bigInteger = new BigInteger(1, zl2.m75083a("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144"));
        f44252k = bigInteger;
        f44254m = new zl1[]{new sx0(tl1.f44772b), new sx0(bigInteger)};
    }

    public qx0() {
        super(f44251j);
        this.f45110b = mo50666m(f44252k);
        this.f45111c = mo50666m(f44253l);
        this.f45112d = new BigInteger(1, zl2.m75083a("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.f45113e = BigInteger.valueOf(8);
        this.f45114f = 4;
    }

    /* renamed from: B */
    public zl1 mo50660B(SecureRandom secureRandom) {
        int[] i = j34.m59224i();
        rx0.m71705k(secureRandom, i);
        return new sx0(i);
    }

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 4;
    }

    /* renamed from: c */
    public ul1 mo50662c() {
        return new qx0();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        int[] iArr = new int[(i2 * 8 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            j34.m59221f(((sx0) nm1.mo62744n()).f44619g, 0, iArr, i3);
            int i5 = i3 + 8;
            j34.m59221f(((sx0) nm1.mo62745o()).f44619g, 0, iArr, i5);
            i3 = i5 + 8;
        }
        return new C9224a(i2, iArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new tx0(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new tx0(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new sx0(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return f44251j.bitLength();
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f44255i;
    }
}
