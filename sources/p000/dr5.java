package p000;

import java.math.BigInteger;
import p000.ul1;

/* renamed from: dr5 */
public class dr5 extends ul1.C9406b {

    /* renamed from: k */
    public static final zl1[] f37381k = {new cr5(tl1.f44772b)};

    /* renamed from: j */
    public er5 f37382j = new er5(this, (zl1) null, (zl1) null);

    /* renamed from: dr5$a */
    public class C7000a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f37383a;

        /* renamed from: b */
        public final /* synthetic */ long[] f37384b;

        public C7000a(int i, long[] jArr) {
            this.f37383a = i;
            this.f37384b = jArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            long[] c = k34.m59677c();
            long[] c2 = k34.m59677c();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f37383a; i3++) {
                long j = (long) (((i3 ^ i) - 1) >> 31);
                for (int i4 = 0; i4 < 5; i4++) {
                    long j2 = c[i4];
                    long[] jArr = this.f37384b;
                    c[i4] = j2 ^ (jArr[i2 + i4] & j);
                    c2[i4] = c2[i4] ^ (jArr[(i2 + 5) + i4] & j);
                }
                i2 += 10;
            }
            return mo51275c(c, c2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            long[] c = k34.m59677c();
            long[] c2 = k34.m59677c();
            int i2 = i * 5 * 2;
            for (int i3 = 0; i3 < 5; i3++) {
                long[] jArr = this.f37384b;
                c[i3] = jArr[i2 + i3];
                c2[i3] = jArr[i2 + 5 + i3];
            }
            return mo51275c(c, c2);
        }

        /* renamed from: c */
        public final nm1 mo51275c(long[] jArr, long[] jArr2) {
            return dr5.this.mo50665i(new cr5(jArr), new cr5(jArr2), dr5.f37381k);
        }

        public int getSize() {
            return this.f37383a;
        }
    }

    public dr5() {
        super(283, 5, 7, 12);
        this.f45110b = mo50666m(BigInteger.valueOf(0));
        this.f45111c = mo50666m(BigInteger.valueOf(1));
        this.f45112d = new BigInteger(1, zl2.m75083a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61"));
        this.f45113e = BigInteger.valueOf(4);
        this.f45114f = 6;
    }

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 6;
    }

    /* renamed from: H */
    public boolean mo50699H() {
        return true;
    }

    /* renamed from: c */
    public ul1 mo50662c() {
        return new dr5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        long[] jArr = new long[(i2 * 5 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            k34.m59675a(((cr5) nm1.mo62744n()).f37194g, 0, jArr, i3);
            int i5 = i3 + 5;
            k34.m59675a(((cr5) nm1.mo62745o()).f37194g, 0, jArr, i5);
            i3 = i5 + 5;
        }
        return new C7000a(i2, jArr);
    }

    /* renamed from: f */
    public gm1 mo51274f() {
        return new zf7();
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new er5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new er5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new cr5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return 283;
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f37382j;
    }
}
