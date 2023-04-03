package p000;

import java.math.BigInteger;
import java.security.SecureRandom;
import p000.ul1;

/* renamed from: do5 */
public class do5 extends ul1.C9407c {

    /* renamed from: j */
    public static final BigInteger f37353j = fo5.f37856h;

    /* renamed from: k */
    public static final zl1[] f37354k = {new fo5(tl1.f44772b)};

    /* renamed from: i */
    public go5 f37355i = new go5(this, (zl1) null, (zl1) null);

    /* renamed from: do5$a */
    public class C6992a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f37356a;

        /* renamed from: b */
        public final /* synthetic */ int[] f37357b;

        public C6992a(int i, int[] iArr) {
            this.f37356a = i;
            this.f37357b = iArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            int[] d = g34.m58020d();
            int[] d2 = g34.m58020d();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f37356a; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 5; i5++) {
                    int i6 = d[i5];
                    int[] iArr = this.f37357b;
                    d[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    d2[i5] = d2[i5] ^ (iArr[(i2 + 5) + i5] & i4);
                }
                i2 += 10;
            }
            return mo51241c(d, d2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            int[] d = g34.m58020d();
            int[] d2 = g34.m58020d();
            int i2 = i * 5 * 2;
            for (int i3 = 0; i3 < 5; i3++) {
                int[] iArr = this.f37357b;
                d[i3] = iArr[i2 + i3];
                d2[i3] = iArr[i2 + 5 + i3];
            }
            return mo51241c(d, d2);
        }

        /* renamed from: c */
        public final nm1 mo51241c(int[] iArr, int[] iArr2) {
            return do5.this.mo50665i(new fo5(iArr), new fo5(iArr2), do5.f37354k);
        }

        public int getSize() {
            return this.f37356a;
        }
    }

    public do5() {
        super(f37353j);
        this.f45110b = mo50666m(new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.f45111c = mo50666m(new BigInteger(1, zl2.m75083a("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.f45112d = new BigInteger(1, zl2.m75083a("0100000000000000000001F4C8F927AED3CA752257"));
        this.f45113e = BigInteger.valueOf(1);
        this.f45114f = 2;
    }

    /* renamed from: B */
    public zl1 mo50660B(SecureRandom secureRandom) {
        int[] d = g34.m58020d();
        eo5.m57420j(secureRandom, d);
        return new fo5(d);
    }

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 2;
    }

    /* renamed from: c */
    public ul1 mo50662c() {
        return new do5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        int[] iArr = new int[(i2 * 5 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            g34.m58019c(((fo5) nm1.mo62744n()).f37857g, 0, iArr, i3);
            int i5 = i3 + 5;
            g34.m58019c(((fo5) nm1.mo62745o()).f37857g, 0, iArr, i5);
            i3 = i5 + 5;
        }
        return new C6992a(i2, iArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new go5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new go5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new fo5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return f37353j.bitLength();
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f37355i;
    }
}
