package p000;

import java.math.BigInteger;
import java.security.SecureRandom;
import p000.ul1;

/* renamed from: hj5 */
public class hj5 extends ul1.C9407c {

    /* renamed from: j */
    public static final BigInteger f38225j = jj5.f38737h;

    /* renamed from: k */
    public static final zl1[] f38226k = {new jj5(tl1.f44772b)};

    /* renamed from: i */
    public kj5 f38227i = new kj5(this, (zl1) null, (zl1) null);

    /* renamed from: hj5$a */
    public class C7184a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f38228a;

        /* renamed from: b */
        public final /* synthetic */ int[] f38229b;

        public C7184a(int i, int[] iArr) {
            this.f38228a = i;
            this.f38229b = iArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            int[] i2 = j34.m59224i();
            int[] i3 = j34.m59224i();
            int i4 = 0;
            for (int i5 = 0; i5 < this.f38228a; i5++) {
                int i6 = ((i5 ^ i) - 1) >> 31;
                for (int i7 = 0; i7 < 8; i7++) {
                    int i8 = i2[i7];
                    int[] iArr = this.f38229b;
                    i2[i7] = i8 ^ (iArr[i4 + i7] & i6);
                    i3[i7] = i3[i7] ^ (iArr[(i4 + 8) + i7] & i6);
                }
                i4 += 16;
            }
            return mo52205c(i2, i3);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            int[] i2 = j34.m59224i();
            int[] i3 = j34.m59224i();
            int i4 = i * 8 * 2;
            for (int i5 = 0; i5 < 8; i5++) {
                int[] iArr = this.f38229b;
                i2[i5] = iArr[i4 + i5];
                i3[i5] = iArr[i4 + 8 + i5];
            }
            return mo52205c(i2, i3);
        }

        /* renamed from: c */
        public final nm1 mo52205c(int[] iArr, int[] iArr2) {
            return hj5.this.mo50665i(new jj5(iArr), new jj5(iArr2), hj5.f38226k);
        }

        public int getSize() {
            return this.f38228a;
        }
    }

    public hj5() {
        super(f38225j);
        this.f45110b = mo50666m(new BigInteger(1, zl2.m75083a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC")));
        this.f45111c = mo50666m(new BigInteger(1, zl2.m75083a("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93")));
        this.f45112d = new BigInteger(1, zl2.m75083a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"));
        this.f45113e = BigInteger.valueOf(1);
        this.f45114f = 2;
    }

    /* renamed from: B */
    public zl1 mo50660B(SecureRandom secureRandom) {
        int[] i = j34.m59224i();
        ij5.m58983k(secureRandom, i);
        return new jj5(i);
    }

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 2;
    }

    /* renamed from: c */
    public ul1 mo50662c() {
        return new hj5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        int[] iArr = new int[(i2 * 8 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            j34.m59221f(((jj5) nm1.mo62744n()).f38738g, 0, iArr, i3);
            int i5 = i3 + 8;
            j34.m59221f(((jj5) nm1.mo62745o()).f38738g, 0, iArr, i5);
            i3 = i5 + 8;
        }
        return new C7184a(i2, iArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new kj5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new kj5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new jj5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return f38225j.bitLength();
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f38227i;
    }
}
