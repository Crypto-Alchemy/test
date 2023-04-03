package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: zo5 */
public class zo5 extends zl1.C9680b {

    /* renamed from: h */
    public static final BigInteger f46457h = new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));

    /* renamed from: g */
    public int[] f46458g;

    public zo5() {
        this.f46458g = i34.m58829e();
    }

    public zo5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f46457h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.f46458g = yo5.m74535d(bigInteger);
    }

    public zo5(int[] iArr) {
        this.f46458g = iArr;
    }

    /* renamed from: u */
    public static void m75149u(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7) {
        yo5.m74538g(iArr5, iArr3, iArr7);
        yo5.m74538g(iArr7, iArr, iArr7);
        yo5.m74538g(iArr4, iArr2, iArr6);
        yo5.m74532a(iArr6, iArr7, iArr6);
        yo5.m74538g(iArr4, iArr3, iArr7);
        i34.m58828d(iArr6, iArr4);
        yo5.m74538g(iArr5, iArr2, iArr5);
        yo5.m74532a(iArr5, iArr7, iArr5);
        yo5.m74545n(iArr5, iArr6);
        yo5.m74538g(iArr6, iArr, iArr6);
    }

    /* renamed from: v */
    public static void m75150v(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        i34.m58828d(iArr, iArr4);
        int[] e = i34.m58829e();
        int[] e2 = i34.m58829e();
        for (int i = 0; i < 7; i++) {
            i34.m58828d(iArr2, e);
            i34.m58828d(iArr3, e2);
            int i2 = 1 << i;
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                m75151w(iArr2, iArr3, iArr4, iArr5);
            }
            m75149u(iArr, e, e2, iArr2, iArr3, iArr4, iArr5);
        }
    }

    /* renamed from: w */
    public static void m75151w(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        yo5.m74538g(iArr2, iArr, iArr2);
        yo5.m74549r(iArr2, iArr2);
        yo5.m74545n(iArr, iArr4);
        yo5.m74532a(iArr3, iArr4, iArr);
        yo5.m74538g(iArr3, iArr4, iArr3);
        yo5.m74544m(p34.m70865I(7, iArr3, 2, 0), iArr3);
    }

    /* renamed from: x */
    public static boolean m75152x(int[] iArr) {
        int[] e = i34.m58829e();
        int[] e2 = i34.m58829e();
        i34.m58828d(iArr, e);
        for (int i = 0; i < 7; i++) {
            i34.m58828d(e, e2);
            yo5.m74546o(e, 1 << i, e);
            yo5.m74538g(e, e2, e);
        }
        yo5.m74546o(e, 95, e);
        return i34.m58835k(e);
    }

    /* renamed from: y */
    public static boolean m75153y(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] e = i34.m58829e();
        i34.m58828d(iArr2, e);
        int[] e2 = i34.m58829e();
        e2[0] = 1;
        int[] e3 = i34.m58829e();
        m75150v(iArr, e, e2, e3, iArr3);
        int[] e4 = i34.m58829e();
        int[] e5 = i34.m58829e();
        for (int i = 1; i < 96; i++) {
            i34.m58828d(e, e4);
            i34.m58828d(e2, e5);
            m75151w(e, e2, e3, iArr3);
            if (i34.m58836l(e)) {
                yo5.m74536e(e5, iArr3);
                yo5.m74538g(iArr3, e4, iArr3);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        int[] e = i34.m58829e();
        yo5.m74532a(this.f46458g, ((zo5) zl1).f46458g, e);
        return new zo5(e);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        int[] e = i34.m58829e();
        yo5.m74533b(this.f46458g, e);
        return new zo5(e);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        int[] e = i34.m58829e();
        yo5.m74536e(((zo5) zl1).f46458g, e);
        yo5.m74538g(e, this.f46458g, e);
        return new zo5(e);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zo5)) {
            return false;
        }
        return i34.m58831g(this.f46458g, ((zo5) obj).f46458g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return f46457h.bitLength();
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        int[] e = i34.m58829e();
        yo5.m74536e(this.f46458g, e);
        return new zo5(e);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return i34.m58835k(this.f46458g);
    }

    public int hashCode() {
        return f46457h.hashCode() ^ C9367tq.m72441y(this.f46458g, 0, 7);
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return i34.m58836l(this.f46458g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        int[] e = i34.m58829e();
        yo5.m74538g(this.f46458g, ((zo5) zl1).f46458g, e);
        return new zo5(e);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        int[] e = i34.m58829e();
        yo5.m74540i(this.f46458g, e);
        return new zo5(e);
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        int[] iArr = this.f46458g;
        if (i34.m58836l(iArr) || i34.m58835k(iArr)) {
            return this;
        }
        int[] e = i34.m58829e();
        yo5.m74540i(iArr, e);
        int[] n = hw3.m58720n(yo5.f46234a);
        int[] e2 = i34.m58829e();
        if (!m75152x(iArr)) {
            return null;
        }
        while (!m75153y(e, n, e2)) {
            yo5.m74533b(n, n);
        }
        yo5.m74545n(e2, n);
        if (i34.m58831g(iArr, n)) {
            return new zo5(e2);
        }
        return null;
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        int[] e = i34.m58829e();
        yo5.m74545n(this.f46458g, e);
        return new zo5(e);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        int[] e = i34.m58829e();
        yo5.m74548q(this.f46458g, ((zo5) zl1).f46458g, e);
        return new zo5(e);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return i34.m58833i(this.f46458g, 0) == 1;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return i34.m58845u(this.f46458g);
    }
}
