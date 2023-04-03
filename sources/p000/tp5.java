package p000;

import java.math.BigInteger;
import p000.ul1;

/* renamed from: tp5 */
public class tp5 extends ul1.C9406b {

    /* renamed from: k */
    public static final zl1[] f44797k = {new sp5(tl1.f44772b)};

    /* renamed from: j */
    public up5 f44798j = new up5(this, (zl1) null, (zl1) null);

    /* renamed from: tp5$a */
    public class C9366a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f44799a;

        /* renamed from: b */
        public final /* synthetic */ long[] f44800b;

        public C9366a(int i, long[] jArr) {
            this.f44799a = i;
            this.f44800b = jArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            long[] g = f34.m57568g();
            long[] g2 = f34.m57568g();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f44799a; i3++) {
                long j = (long) (((i3 ^ i) - 1) >> 31);
                for (int i4 = 0; i4 < 2; i4++) {
                    long j2 = g[i4];
                    long[] jArr = this.f44800b;
                    g[i4] = j2 ^ (jArr[i2 + i4] & j);
                    g2[i4] = g2[i4] ^ (jArr[(i2 + 2) + i4] & j);
                }
                i2 += 4;
            }
            return mo66115c(g, g2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            long[] g = f34.m57568g();
            long[] g2 = f34.m57568g();
            int i2 = i * 2 * 2;
            for (int i3 = 0; i3 < 2; i3++) {
                long[] jArr = this.f44800b;
                g[i3] = jArr[i2 + i3];
                g2[i3] = jArr[i2 + 2 + i3];
            }
            return mo66115c(g, g2);
        }

        /* renamed from: c */
        public final nm1 mo66115c(long[] jArr, long[] jArr2) {
            return tp5.this.mo50665i(new sp5(jArr), new sp5(jArr2), tp5.f44797k);
        }

        public int getSize() {
            return this.f44799a;
        }
    }

    public tp5() {
        super(113, 9, 0, 0);
        this.f45110b = mo50666m(new BigInteger(1, zl2.m75083a("003088250CA6E7C7FE649CE85820F7")));
        this.f45111c = mo50666m(new BigInteger(1, zl2.m75083a("00E8BEE4D3E2260744188BE0E9C723")));
        this.f45112d = new BigInteger(1, zl2.m75083a("0100000000000000D9CCEC8A39E56F"));
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
        return new tp5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        long[] jArr = new long[(i2 * 2 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            f34.m57565d(((sp5) nm1.mo62744n()).f44591g, 0, jArr, i3);
            int i5 = i3 + 2;
            f34.m57565d(((sp5) nm1.mo62745o()).f44591g, 0, jArr, i5);
            i3 = i5 + 2;
        }
        return new C9366a(i2, jArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new up5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new up5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new sp5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return 113;
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f44798j;
    }
}
