package p000;

import java.math.BigInteger;
import p000.ul1;

/* renamed from: rr5 */
public class rr5 extends ul1.C9406b {

    /* renamed from: k */
    public static final zl1[] f44448k = {new or5(tl1.f44772b)};

    /* renamed from: l */
    public static final or5 f44449l;

    /* renamed from: m */
    public static final or5 f44450m;

    /* renamed from: j */
    public sr5 f44451j = new sr5(this, (zl1) null, (zl1) null);

    /* renamed from: rr5$a */
    public class C9285a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f44452a;

        /* renamed from: b */
        public final /* synthetic */ long[] f44453b;

        public C9285a(int i, long[] jArr) {
            this.f44452a = i;
            this.f44453b = jArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            long[] c = o34.m70127c();
            long[] c2 = o34.m70127c();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f44452a; i3++) {
                long j = (long) (((i3 ^ i) - 1) >> 31);
                for (int i4 = 0; i4 < 9; i4++) {
                    long j2 = c[i4];
                    long[] jArr = this.f44453b;
                    c[i4] = j2 ^ (jArr[i2 + i4] & j);
                    c2[i4] = c2[i4] ^ (jArr[(i2 + 9) + i4] & j);
                }
                i2 += 18;
            }
            return mo65752c(c, c2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            long[] c = o34.m70127c();
            long[] c2 = o34.m70127c();
            int i2 = i * 9 * 2;
            for (int i3 = 0; i3 < 9; i3++) {
                long[] jArr = this.f44453b;
                c[i3] = jArr[i2 + i3];
                c2[i3] = jArr[i2 + 9 + i3];
            }
            return mo65752c(c, c2);
        }

        /* renamed from: c */
        public final nm1 mo65752c(long[] jArr, long[] jArr2) {
            return rr5.this.mo50665i(new or5(jArr), new or5(jArr2), rr5.f44448k);
        }

        public int getSize() {
            return this.f44452a;
        }
    }

    static {
        or5 or5 = new or5(new BigInteger(1, zl2.m75083a("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        f44449l = or5;
        f44450m = (or5) or5.mo50988n();
    }

    public rr5() {
        super(571, 2, 5, 10);
        this.f45110b = mo50666m(BigInteger.valueOf(1));
        this.f45111c = f44449l;
        this.f45112d = new BigInteger(1, zl2.m75083a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
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
        return new rr5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        long[] jArr = new long[(i2 * 9 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            o34.m70125a(((or5) nm1.mo62744n()).f43756g, 0, jArr, i3);
            int i5 = i3 + 9;
            o34.m70125a(((or5) nm1.mo62745o()).f43756g, 0, jArr, i5);
            i3 = i5 + 9;
        }
        return new C9285a(i2, jArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new sr5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new sr5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new or5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return 571;
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f44451j;
    }
}
