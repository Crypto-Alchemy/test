package p000;

import java.math.BigInteger;
import java.security.SecureRandom;
import p000.ul1;

/* renamed from: po5 */
public class po5 extends ul1.C9407c {

    /* renamed from: j */
    public static final BigInteger f44077j = ro5.f44437h;

    /* renamed from: k */
    public static final zl1[] f44078k = {new ro5(tl1.f44772b)};

    /* renamed from: i */
    public so5 f44079i = new so5(this, (zl1) null, (zl1) null);

    /* renamed from: po5$a */
    public class C9183a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f44080a;

        /* renamed from: b */
        public final /* synthetic */ int[] f44081b;

        public C9183a(int i, int[] iArr) {
            this.f44080a = i;
            this.f44081b = iArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            int[] h = h34.m58433h();
            int[] h2 = h34.m58433h();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f44080a; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 6; i5++) {
                    int i6 = h[i5];
                    int[] iArr = this.f44081b;
                    h[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    h2[i5] = h2[i5] ^ (iArr[(i2 + 6) + i5] & i4);
                }
                i2 += 12;
            }
            return mo65328c(h, h2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            int[] h = h34.m58433h();
            int[] h2 = h34.m58433h();
            int i2 = i * 6 * 2;
            for (int i3 = 0; i3 < 6; i3++) {
                int[] iArr = this.f44081b;
                h[i3] = iArr[i2 + i3];
                h2[i3] = iArr[i2 + 6 + i3];
            }
            return mo65328c(h, h2);
        }

        /* renamed from: c */
        public final nm1 mo65328c(int[] iArr, int[] iArr2) {
            return po5.this.mo50665i(new ro5(iArr), new ro5(iArr2), po5.f44078k);
        }

        public int getSize() {
            return this.f44080a;
        }
    }

    public po5() {
        super(f44077j);
        this.f45110b = mo50666m(new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.f45111c = mo50666m(new BigInteger(1, zl2.m75083a("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.f45112d = new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.f45113e = BigInteger.valueOf(1);
        this.f45114f = 2;
    }

    /* renamed from: B */
    public zl1 mo50660B(SecureRandom secureRandom) {
        int[] h = h34.m58433h();
        qo5.m71301k(secureRandom, h);
        return new ro5(h);
    }

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 2;
    }

    /* renamed from: c */
    public ul1 mo50662c() {
        return new po5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        int[] iArr = new int[(i2 * 6 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            h34.m58430e(((ro5) nm1.mo62744n()).f44438g, 0, iArr, i3);
            int i5 = i3 + 6;
            h34.m58430e(((ro5) nm1.mo62745o()).f44438g, 0, iArr, i5);
            i3 = i5 + 6;
        }
        return new C9183a(i2, iArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new so5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new so5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new ro5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return f44077j.bitLength();
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f44079i;
    }
}
