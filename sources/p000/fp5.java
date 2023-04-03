package p000;

import java.math.BigInteger;
import java.security.SecureRandom;
import p000.ul1;

/* renamed from: fp5 */
public class fp5 extends ul1.C9407c {

    /* renamed from: j */
    public static final BigInteger f37863j = hp5.f38249h;

    /* renamed from: k */
    public static final zl1[] f37864k = {new hp5(tl1.f44772b)};

    /* renamed from: i */
    public ip5 f37865i = new ip5(this, (zl1) null, (zl1) null);

    /* renamed from: fp5$a */
    public class C7092a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f37866a;

        /* renamed from: b */
        public final /* synthetic */ int[] f37867b;

        public C7092a(int i, int[] iArr) {
            this.f37866a = i;
            this.f37867b = iArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            int[] i2 = j34.m59224i();
            int[] i3 = j34.m59224i();
            int i4 = 0;
            for (int i5 = 0; i5 < this.f37866a; i5++) {
                int i6 = ((i5 ^ i) - 1) >> 31;
                for (int i7 = 0; i7 < 8; i7++) {
                    int i8 = i2[i7];
                    int[] iArr = this.f37867b;
                    i2[i7] = i8 ^ (iArr[i4 + i7] & i6);
                    i3[i7] = i3[i7] ^ (iArr[(i4 + 8) + i7] & i6);
                }
                i4 += 16;
            }
            return mo51738c(i2, i3);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            int[] i2 = j34.m59224i();
            int[] i3 = j34.m59224i();
            int i4 = i * 8 * 2;
            for (int i5 = 0; i5 < 8; i5++) {
                int[] iArr = this.f37867b;
                i2[i5] = iArr[i4 + i5];
                i3[i5] = iArr[i4 + 8 + i5];
            }
            return mo51738c(i2, i3);
        }

        /* renamed from: c */
        public final nm1 mo51738c(int[] iArr, int[] iArr2) {
            return fp5.this.mo50665i(new hp5(iArr), new hp5(iArr2), fp5.f37864k);
        }

        public int getSize() {
            return this.f37866a;
        }
    }

    public fp5() {
        super(f37863j);
        this.f45110b = mo50666m(new BigInteger(1, zl2.m75083a("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f45111c = mo50666m(new BigInteger(1, zl2.m75083a("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B")));
        this.f45112d = new BigInteger(1, zl2.m75083a("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"));
        this.f45113e = BigInteger.valueOf(1);
        this.f45114f = 2;
    }

    /* renamed from: B */
    public zl1 mo50660B(SecureRandom secureRandom) {
        int[] i = j34.m59224i();
        gp5.m58197k(secureRandom, i);
        return new hp5(i);
    }

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 2;
    }

    /* renamed from: c */
    public ul1 mo50662c() {
        return new fp5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        int[] iArr = new int[(i2 * 8 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            j34.m59221f(((hp5) nm1.mo62744n()).f38250g, 0, iArr, i3);
            int i5 = i3 + 8;
            j34.m59221f(((hp5) nm1.mo62745o()).f38250g, 0, iArr, i5);
            i3 = i5 + 8;
        }
        return new C7092a(i2, iArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new ip5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new ip5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new hp5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return f37863j.bitLength();
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f37865i;
    }
}
