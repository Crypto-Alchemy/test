package p000;

import java.math.BigInteger;
import p000.ul1;

/* renamed from: bq5 */
public class bq5 extends ul1.C9406b {

    /* renamed from: k */
    public static final zl1[] f36933k = {new yp5(tl1.f44772b)};

    /* renamed from: j */
    public cq5 f36934j = new cq5(this, (zl1) null, (zl1) null);

    /* renamed from: bq5$a */
    public class C6874a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f36935a;

        /* renamed from: b */
        public final /* synthetic */ long[] f36936b;

        public C6874a(int i, long[] jArr) {
            this.f36935a = i;
            this.f36936b = jArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            long[] i2 = h34.m58434i();
            long[] i3 = h34.m58434i();
            int i4 = 0;
            for (int i5 = 0; i5 < this.f36935a; i5++) {
                long j = (long) (((i5 ^ i) - 1) >> 31);
                for (int i6 = 0; i6 < 3; i6++) {
                    long j2 = i2[i6];
                    long[] jArr = this.f36936b;
                    i2[i6] = j2 ^ (jArr[i4 + i6] & j);
                    i3[i6] = i3[i6] ^ (jArr[(i4 + 3) + i6] & j);
                }
                i4 += 6;
            }
            return mo50700c(i2, i3);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            long[] i2 = h34.m58434i();
            long[] i3 = h34.m58434i();
            int i4 = i * 3 * 2;
            for (int i5 = 0; i5 < 3; i5++) {
                long[] jArr = this.f36936b;
                i2[i5] = jArr[i4 + i5];
                i3[i5] = jArr[i4 + 3 + i5];
            }
            return mo50700c(i2, i3);
        }

        /* renamed from: c */
        public final nm1 mo50700c(long[] jArr, long[] jArr2) {
            return bq5.this.mo50665i(new yp5(jArr), new yp5(jArr2), bq5.f36933k);
        }

        public int getSize() {
            return this.f36935a;
        }
    }

    public bq5() {
        super(131, 2, 3, 8);
        this.f45110b = mo50666m(new BigInteger(1, zl2.m75083a("03E5A88919D7CAFCBF415F07C2176573B2")));
        this.f45111c = mo50666m(new BigInteger(1, zl2.m75083a("04B8266A46C55657AC734CE38F018F2192")));
        this.f45112d = new BigInteger(1, zl2.m75083a("0400000000000000016954A233049BA98F"));
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
        return new bq5();
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
        return new C6874a(i2, jArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new cq5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new cq5(this, zl1, zl12, zl1Arr);
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
        return this.f36934j;
    }
}
