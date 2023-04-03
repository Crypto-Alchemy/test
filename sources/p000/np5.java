package p000;

import java.math.BigInteger;
import java.security.SecureRandom;
import p000.ul1;

/* renamed from: np5 */
public class np5 extends ul1.C9407c {

    /* renamed from: j */
    public static final BigInteger f43525j = pp5.f44086h;

    /* renamed from: k */
    public static final zl1[] f43526k = {new pp5(tl1.f44772b)};

    /* renamed from: i */
    public qp5 f43527i = new qp5(this, (zl1) null, (zl1) null);

    /* renamed from: np5$a */
    public class C9002a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f43528a;

        /* renamed from: b */
        public final /* synthetic */ int[] f43529b;

        public C9002a(int i, int[] iArr) {
            this.f43528a = i;
            this.f43529b = iArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            int[] j = p34.m70886j(17);
            int[] j2 = p34.m70886j(17);
            int i2 = 0;
            for (int i3 = 0; i3 < this.f43528a; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 17; i5++) {
                    int i6 = j[i5];
                    int[] iArr = this.f43529b;
                    j[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    j2[i5] = j2[i5] ^ (iArr[(i2 + 17) + i5] & i4);
                }
                i2 += 34;
            }
            return mo62777c(j, j2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            int[] j = p34.m70886j(17);
            int[] j2 = p34.m70886j(17);
            int i2 = i * 17 * 2;
            for (int i3 = 0; i3 < 17; i3++) {
                int i4 = j[i3];
                int[] iArr = this.f43529b;
                j[i3] = i4 ^ iArr[i2 + i3];
                j2[i3] = j2[i3] ^ iArr[(i2 + 17) + i3];
            }
            return mo62777c(j, j2);
        }

        /* renamed from: c */
        public final nm1 mo62777c(int[] iArr, int[] iArr2) {
            return np5.this.mo50665i(new pp5(iArr), new pp5(iArr2), np5.f43526k);
        }

        public int getSize() {
            return this.f43528a;
        }
    }

    public np5() {
        super(f43525j);
        this.f45110b = mo50666m(new BigInteger(1, zl2.m75083a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f45111c = mo50666m(new BigInteger(1, zl2.m75083a("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00")));
        this.f45112d = new BigInteger(1, zl2.m75083a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"));
        this.f45113e = BigInteger.valueOf(1);
        this.f45114f = 2;
    }

    /* renamed from: B */
    public zl1 mo50660B(SecureRandom secureRandom) {
        int[] j = p34.m70886j(17);
        op5.m70444k(secureRandom, j);
        return new pp5(j);
    }

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 2;
    }

    /* renamed from: c */
    public ul1 mo50662c() {
        return new np5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        int[] iArr = new int[(i2 * 17 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            p34.m70885i(17, ((pp5) nm1.mo62744n()).f44087g, 0, iArr, i3);
            int i5 = i3 + 17;
            p34.m70885i(17, ((pp5) nm1.mo62745o()).f44087g, 0, iArr, i5);
            i3 = i5 + 17;
        }
        return new C9002a(i2, iArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new qp5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new qp5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new pp5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return f43525j.bitLength();
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f43527i;
    }
}
