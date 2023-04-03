package p000;

import java.math.BigInteger;
import p000.ul1;

/* renamed from: zp5 */
public class zp5 extends ul1.C9406b {

    /* renamed from: k */
    public static final zl1[] f46474k = {new yp5(tl1.f44772b)};

    /* renamed from: j */
    public aq5 f46475j = new aq5(this, (zl1) null, (zl1) null);

    /* renamed from: zp5$a */
    public class C9708a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f46476a;

        /* renamed from: b */
        public final /* synthetic */ long[] f46477b;

        public C9708a(int i, long[] jArr) {
            this.f46476a = i;
            this.f46477b = jArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            long[] i2 = h34.m58434i();
            long[] i3 = h34.m58434i();
            int i4 = 0;
            for (int i5 = 0; i5 < this.f46476a; i5++) {
                long j = (long) (((i5 ^ i) - 1) >> 31);
                for (int i6 = 0; i6 < 3; i6++) {
                    long j2 = i2[i6];
                    long[] jArr = this.f46477b;
                    i2[i6] = j2 ^ (jArr[i4 + i6] & j);
                    i3[i6] = i3[i6] ^ (jArr[(i4 + 3) + i6] & j);
                }
                i4 += 6;
            }
            return mo67380c(i2, i3);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            long[] i2 = h34.m58434i();
            long[] i3 = h34.m58434i();
            int i4 = i * 3 * 2;
            for (int i5 = 0; i5 < 3; i5++) {
                long[] jArr = this.f46477b;
                i2[i5] = jArr[i4 + i5];
                i3[i5] = jArr[i4 + 3 + i5];
            }
            return mo67380c(i2, i3);
        }

        /* renamed from: c */
        public final nm1 mo67380c(long[] jArr, long[] jArr2) {
            return zp5.this.mo50665i(new yp5(jArr), new yp5(jArr2), zp5.f46474k);
        }

        public int getSize() {
            return this.f46476a;
        }
    }

    public zp5() {
        super(131, 2, 3, 8);
        this.f45110b = mo50666m(new BigInteger(1, zl2.m75083a("07A11B09A76B562144418FF3FF8C2570B8")));
        this.f45111c = mo50666m(new BigInteger(1, zl2.m75083a("0217C05610884B63B9C6C7291678F9D341")));
        this.f45112d = new BigInteger(1, zl2.m75083a("0400000000000000023123953A9464B54D"));
        this.f45113e = BigInteger.valueOf(2);
        this.f45114f = 6;
    }

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 6;
    }

    /* renamed from: H */
    public boolean mo50699H() {
        return false;
    }

    /* renamed from: c */
    public ul1 mo50662c() {
        return new zp5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        long[] jArr = new long[(i2 * 3 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            h34.m58431f(((yp5) nm1.mo62744n()).f46246g, 0, jArr, i3);
            int i5 = i3 + 3;
            h34.m58431f(((yp5) nm1.mo62745o()).f46246g, 0, jArr, i5);
            i3 = i5 + 3;
        }
        return new C9708a(i2, jArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new aq5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new aq5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new yp5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return 131;
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f46475j;
    }
}
