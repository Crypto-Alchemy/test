package p000;

import java.math.BigInteger;
import java.security.SecureRandom;
import p000.ul1;

/* renamed from: bp5 */
public class bp5 extends ul1.C9407c {

    /* renamed from: j */
    public static final BigInteger f36923j = dp5.f37363h;

    /* renamed from: k */
    public static final zl1[] f36924k = {new dp5(tl1.f44772b)};

    /* renamed from: i */
    public ep5 f36925i = new ep5(this, (zl1) null, (zl1) null);

    /* renamed from: bp5$a */
    public class C6873a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f36926a;

        /* renamed from: b */
        public final /* synthetic */ int[] f36927b;

        public C6873a(int i, int[] iArr) {
            this.f36926a = i;
            this.f36927b = iArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            int[] i2 = j34.m59224i();
            int[] i3 = j34.m59224i();
            int i4 = 0;
            for (int i5 = 0; i5 < this.f36926a; i5++) {
                int i6 = ((i5 ^ i) - 1) >> 31;
                for (int i7 = 0; i7 < 8; i7++) {
                    int i8 = i2[i7];
                    int[] iArr = this.f36927b;
                    i2[i7] = i8 ^ (iArr[i4 + i7] & i6);
                    i3[i7] = i3[i7] ^ (iArr[(i4 + 8) + i7] & i6);
                }
                i4 += 16;
            }
            return mo50689c(i2, i3);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            int[] i2 = j34.m59224i();
            int[] i3 = j34.m59224i();
            int i4 = i * 8 * 2;
            for (int i5 = 0; i5 < 8; i5++) {
                int[] iArr = this.f36927b;
                i2[i5] = iArr[i4 + i5];
                i3[i5] = iArr[i4 + 8 + i5];
            }
            return mo50689c(i2, i3);
        }

        /* renamed from: c */
        public final nm1 mo50689c(int[] iArr, int[] iArr2) {
            return bp5.this.mo50665i(new dp5(iArr), new dp5(iArr2), bp5.f36924k);
        }

        public int getSize() {
            return this.f36926a;
        }
    }

    public bp5() {
        super(f36923j);
        this.f45110b = mo50666m(tl1.f44771a);
        this.f45111c = mo50666m(BigInteger.valueOf(7));
        this.f45112d = new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
        this.f45113e = BigInteger.valueOf(1);
        this.f45114f = 2;
    }

    /* renamed from: B */
    public zl1 mo50660B(SecureRandom secureRandom) {
        int[] i = j34.m59224i();
        cp5.m56498j(secureRandom, i);
        return new dp5(i);
    }

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 2;
    }

    /* renamed from: c */
    public ul1 mo50662c() {
        return new bp5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        int[] iArr = new int[(i2 * 8 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            j34.m59221f(((dp5) nm1.mo62744n()).f37364g, 0, iArr, i3);
            int i5 = i3 + 8;
            j34.m59221f(((dp5) nm1.mo62745o()).f37364g, 0, iArr, i5);
            i3 = i5 + 8;
        }
        return new C6873a(i2, iArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new ep5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new ep5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new dp5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return f36923j.bitLength();
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f36925i;
    }
}
