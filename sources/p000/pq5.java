package p000;

import java.math.BigInteger;
import p000.ul1;

/* renamed from: pq5 */
public class pq5 extends ul1.C9406b {

    /* renamed from: k */
    public static final zl1[] f44091k = {new mq5(tl1.f44772b)};

    /* renamed from: j */
    public qq5 f44092j = new qq5(this, (zl1) null, (zl1) null);

    /* renamed from: pq5$a */
    public class C9185a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f44093a;

        /* renamed from: b */
        public final /* synthetic */ long[] f44094b;

        public C9185a(int i, long[] jArr) {
            this.f44093a = i;
            this.f44094b = jArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            long[] j = j34.m59225j();
            long[] j2 = j34.m59225j();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f44093a; i3++) {
                long j3 = (long) (((i3 ^ i) - 1) >> 31);
                for (int i4 = 0; i4 < 4; i4++) {
                    long j4 = j[i4];
                    long[] jArr = this.f44094b;
                    j[i4] = j4 ^ (jArr[i2 + i4] & j3);
                    j2[i4] = j2[i4] ^ (jArr[(i2 + 4) + i4] & j3);
                }
                i2 += 8;
            }
            return mo65343c(j, j2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            long[] j = j34.m59225j();
            long[] j2 = j34.m59225j();
            int i2 = i * 4 * 2;
            for (int i3 = 0; i3 < 4; i3++) {
                long j3 = j[i3];
                long[] jArr = this.f44094b;
                j[i3] = j3 ^ jArr[i2 + i3];
                j2[i3] = j2[i3] ^ jArr[(i2 + 4) + i3];
            }
            return mo65343c(j, j2);
        }

        /* renamed from: c */
        public final nm1 mo65343c(long[] jArr, long[] jArr2) {
            return pq5.this.mo50665i(new mq5(jArr), new mq5(jArr2), pq5.f44091k);
        }

        public int getSize() {
            return this.f44093a;
        }
    }

    public pq5() {
        super(193, 15, 0, 0);
        this.f45110b = mo50666m(new BigInteger(1, zl2.m75083a("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.f45111c = mo50666m(new BigInteger(1, zl2.m75083a("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.f45112d = new BigInteger(1, zl2.m75083a("010000000000000000000000015AAB561B005413CCD4EE99D5"));
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
        return new pq5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        long[] jArr = new long[(i2 * 4 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            j34.m59222g(((mq5) nm1.mo62744n()).f41000g, 0, jArr, i3);
            int i5 = i3 + 4;
            j34.m59222g(((mq5) nm1.mo62745o()).f41000g, 0, jArr, i5);
            i3 = i5 + 4;
        }
        return new C9185a(i2, jArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new qq5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new qq5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new mq5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return 193;
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f44092j;
    }
}
