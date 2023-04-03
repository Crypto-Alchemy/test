package p000;

import java.math.BigInteger;
import java.security.SecureRandom;
import p000.ul1;

/* renamed from: xn5 */
public class xn5 extends ul1.C9407c {

    /* renamed from: j */
    public static final BigInteger f45975j = zn5.f46420h;

    /* renamed from: k */
    public static final zl1[] f45976k = {new zn5(tl1.f44772b)};

    /* renamed from: i */
    public ao5 f45977i = new ao5(this, (zl1) null, (zl1) null);

    /* renamed from: xn5$a */
    public class C9602a extends C6925c6 {

        /* renamed from: a */
        public final /* synthetic */ int f45978a;

        /* renamed from: b */
        public final /* synthetic */ int[] f45979b;

        public C9602a(int i, int[] iArr) {
            this.f45978a = i;
            this.f45979b = iArr;
        }

        /* renamed from: a */
        public nm1 mo50669a(int i) {
            int[] f = f34.m57567f();
            int[] f2 = f34.m57567f();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f45978a; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 4; i5++) {
                    int i6 = f[i5];
                    int[] iArr = this.f45979b;
                    f[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    f2[i5] = f2[i5] ^ (iArr[(i2 + 4) + i5] & i4);
                }
                i2 += 8;
            }
            return mo66904c(f, f2);
        }

        /* renamed from: b */
        public nm1 mo50670b(int i) {
            int[] f = f34.m57567f();
            int[] f2 = f34.m57567f();
            int i2 = i * 4 * 2;
            for (int i3 = 0; i3 < 4; i3++) {
                int[] iArr = this.f45979b;
                f[i3] = iArr[i2 + i3];
                f2[i3] = iArr[i2 + 4 + i3];
            }
            return mo66904c(f, f2);
        }

        /* renamed from: c */
        public final nm1 mo66904c(int[] iArr, int[] iArr2) {
            return xn5.this.mo50665i(new zn5(iArr), new zn5(iArr2), xn5.f45976k);
        }

        public int getSize() {
            return this.f45978a;
        }
    }

    public xn5() {
        super(f45975j);
        this.f45110b = mo50666m(new BigInteger(1, zl2.m75083a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f45111c = mo50666m(new BigInteger(1, zl2.m75083a("E87579C11079F43DD824993C2CEE5ED3")));
        this.f45112d = new BigInteger(1, zl2.m75083a("FFFFFFFE0000000075A30D1B9038A115"));
        this.f45113e = BigInteger.valueOf(1);
        this.f45114f = 2;
    }

    /* renamed from: B */
    public zl1 mo50660B(SecureRandom secureRandom) {
        int[] f = f34.m57567f();
        yn5.m74490k(secureRandom, f);
        return new zn5(f);
    }

    /* renamed from: C */
    public boolean mo50661C(int i) {
        return i == 2;
    }

    /* renamed from: c */
    public ul1 mo50662c() {
        return new xn5();
    }

    /* renamed from: e */
    public fm1 mo50663e(nm1[] nm1Arr, int i, int i2) {
        int[] iArr = new int[(i2 * 4 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nm1 nm1 = nm1Arr[i + i4];
            f34.m57564c(((zn5) nm1.mo62744n()).f46421g, 0, iArr, i3);
            int i5 = i3 + 4;
            f34.m57564c(((zn5) nm1.mo62745o()).f46421g, 0, iArr, i5);
            i3 = i5 + 4;
        }
        return new C9602a(i2, iArr);
    }

    /* renamed from: h */
    public nm1 mo50664h(zl1 zl1, zl1 zl12) {
        return new ao5(this, zl1, zl12);
    }

    /* renamed from: i */
    public nm1 mo50665i(zl1 zl1, zl1 zl12, zl1[] zl1Arr) {
        return new ao5(this, zl1, zl12, zl1Arr);
    }

    /* renamed from: m */
    public zl1 mo50666m(BigInteger bigInteger) {
        return new zn5(bigInteger);
    }

    /* renamed from: t */
    public int mo50667t() {
        return f45975j.bitLength();
    }

    /* renamed from: u */
    public nm1 mo50668u() {
        return this.f45977i;
    }
}
