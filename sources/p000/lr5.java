package p000;

import java.math.BigInteger;
import p000.ul1;

/* renamed from: lr5 */
public class lr5 extends ul1.C9406b {

    /* renamed from: k */
    public static final zl1[] f40687k = {new ir5(tl1.f44772b)};

    /* renamed from: j */
    public mr5 f40688j = new mr5(this, (zl1) null, (zl1) null);

    /* renamed from: lr5$a */
    public class C7848a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f40689a;

        /* renamed from: b */
        public final /* synthetic */ long[] f40690b;

        public C7848a(int i, long[] jArr) {
            this.f40689a = i;
            this.f40690b = jArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            long[] c = m34.m64062c();
            long[] c2 = m34.m64062c();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f40689a; i3++) {
                long j = (long) (((i3 ^ i) - 1) >> 31);
                for (int i4 = 0; i4 < 7; i4++) {
                    long j2 = c[i4];
                    long[] jArr = this.f40690b;
                    c[i4] = j2 ^ (jArr[i2 + i4] & j);
                    c2[i4] = c2[i4] ^ (jArr[(i2 + 7) + i4] & j);
                }
                i2 += 14;
            }
            return mo55970c(c, c2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            long[] c = m34.m64062c();
            long[] c2 = m34.m64062c();
            int i2 = i * 7 * 2;
            for (int i3 = 0; i3 < 7; i3++) {
                long[] jArr = this.f40690b;
                c[i3] = jArr[i2 + i3];
                c2[i3] = jArr[i2 + 7 + i3];
            }
            return mo55970c(c, c2);
        }

        /* renamed from: c */
        public final nm1 mo55970c(long[] jArr, long[] jArr2) {
            return lr5.this.mo50665i(new ir5(jArr), new ir5(jArr2), lr5.f40687k);
        }

        public int getSize() {
            return this.f40689a;
        }
    }

    public lr5() {
        super(409, 87, 0, 0);
        this.f45110b = mo50666m(BigInteger.valueOf(1));
        this.f45111c = mo50666m(new BigInteger(1, zl2.m75083a("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        this.f45112d = new BigInteger(1, zl2.m75083a("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
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
        return new lr5();
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
        return new C7848a(i2, jArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new mr5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new mr5(this, zl1, zl12, zl1Arr);
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
        return this.f40688j;
    }
}
