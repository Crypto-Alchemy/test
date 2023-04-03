package p000;

import java.math.BigInteger;
import p000.ul1;

/* renamed from: jr5 */
public class jr5 extends ul1.C9406b {

    /* renamed from: k */
    public static final zl1[] f38774k = {new ir5(tl1.f44772b)};

    /* renamed from: j */
    public kr5 f38775j = new kr5(this, (zl1) null, (zl1) null);

    /* renamed from: jr5$a */
    public class C7306a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f38776a;

        /* renamed from: b */
        public final /* synthetic */ long[] f38777b;

        public C7306a(int i, long[] jArr) {
            this.f38776a = i;
            this.f38777b = jArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            long[] c = m34.m64062c();
            long[] c2 = m34.m64062c();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f38776a; i3++) {
                long j = (long) (((i3 ^ i) - 1) >> 31);
                for (int i4 = 0; i4 < 7; i4++) {
                    long j2 = c[i4];
                    long[] jArr = this.f38777b;
                    c[i4] = j2 ^ (jArr[i2 + i4] & j);
                    c2[i4] = c2[i4] ^ (jArr[(i2 + 7) + i4] & j);
                }
                i2 += 14;
            }
            return mo52772c(c, c2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            long[] c = m34.m64062c();
            long[] c2 = m34.m64062c();
            int i2 = i * 7 * 2;
            for (int i3 = 0; i3 < 7; i3++) {
                long[] jArr = this.f38777b;
                c[i3] = jArr[i2 + i3];
                c2[i3] = jArr[i2 + 7 + i3];
            }
            return mo52772c(c, c2);
        }

        /* renamed from: c */
        public final nm1 mo52772c(long[] jArr, long[] jArr2) {
            return jr5.this.mo50665i(new ir5(jArr), new ir5(jArr2), jr5.f38774k);
        }

        public int getSize() {
            return this.f38776a;
        }
    }

    public jr5() {
        super(409, 87, 0, 0);
        this.f45110b = mo50666m(BigInteger.valueOf(0));
        this.f45111c = mo50666m(BigInteger.valueOf(1));
        this.f45112d = new BigInteger(1, zl2.m75083a("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF"));
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
        return new jr5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        long[] jArr = new long[(i2 * 7 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            m34.m64060a(((ir5) nm1.mo62744n()).f38513g, 0, jArr, i3);
            int i5 = i3 + 7;
            m34.m64060a(((ir5) nm1.mo62745o()).f38513g, 0, jArr, i5);
            i3 = i5 + 7;
        }
        return new C7306a(i2, jArr);
    }

    /* renamed from: f */
    public gm1 mo51274f() {
        return new zf7();
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new kr5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new kr5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new ir5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return 409;
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f38775j;
    }
}
