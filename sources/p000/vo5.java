package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: vo5 */
public class vo5 extends zl1.C9680b {

    /* renamed from: h */
    public static final BigInteger f45335h = new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));

    /* renamed from: i */
    public static final int[] f45336i = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    /* renamed from: g */
    public int[] f45337g;

    public vo5() {
        this.f45337g = i34.m58829e();
    }

    public vo5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f45335h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.f45337g = uo5.m72932c(bigInteger);
    }

    public vo5(int[] iArr) {
        this.f45337g = iArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        int[] e = i34.m58829e();
        uo5.m72930a(this.f45337g, ((vo5) zl1).f45337g, e);
        return new vo5(e);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        int[] e = i34.m58829e();
        uo5.m72931b(this.f45337g, e);
        return new vo5(e);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        int[] e = i34.m58829e();
        uo5.m72933d(((vo5) zl1).f45337g, e);
        uo5.m72935f(e, this.f45337g, e);
        return new vo5(e);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vo5)) {
            return false;
        }
        return i34.m58831g(this.f45337g, ((vo5) obj).f45337g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return f45335h.bitLength();
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        int[] e = i34.m58829e();
        uo5.m72933d(this.f45337g, e);
        return new vo5(e);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return i34.m58835k(this.f45337g);
    }

    public int hashCode() {
        return f45335h.hashCode() ^ C9367tq.m72441y(this.f45337g, 0, 7);
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return i34.m58836l(this.f45337g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        int[] e = i34.m58829e();
        uo5.m72935f(this.f45337g, ((vo5) zl1).f45337g, e);
        return new vo5(e);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        int[] e = i34.m58829e();
        uo5.m72937h(this.f45337g, e);
        return new vo5(e);
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        int[] iArr = this.f45337g;
        if (i34.m58836l(iArr) || i34.m58835k(iArr)) {
            return this;
        }
        int[] e = i34.m58829e();
        uo5.m72942m(iArr, e);
        uo5.m72935f(e, iArr, e);
        uo5.m72942m(e, e);
        uo5.m72935f(e, iArr, e);
        int[] e2 = i34.m58829e();
        uo5.m72942m(e, e2);
        uo5.m72935f(e2, iArr, e2);
        int[] e3 = i34.m58829e();
        uo5.m72943n(e2, 4, e3);
        uo5.m72935f(e3, e2, e3);
        int[] e4 = i34.m58829e();
        uo5.m72943n(e3, 3, e4);
        uo5.m72935f(e4, e, e4);
        uo5.m72943n(e4, 8, e4);
        uo5.m72935f(e4, e3, e4);
        uo5.m72943n(e4, 4, e3);
        uo5.m72935f(e3, e2, e3);
        uo5.m72943n(e3, 19, e2);
        uo5.m72935f(e2, e4, e2);
        int[] e5 = i34.m58829e();
        uo5.m72943n(e2, 42, e5);
        uo5.m72935f(e5, e2, e5);
        uo5.m72943n(e5, 23, e2);
        uo5.m72935f(e2, e3, e2);
        uo5.m72943n(e2, 84, e3);
        uo5.m72935f(e3, e5, e3);
        uo5.m72943n(e3, 20, e3);
        uo5.m72935f(e3, e4, e3);
        uo5.m72943n(e3, 3, e3);
        uo5.m72935f(e3, iArr, e3);
        uo5.m72943n(e3, 2, e3);
        uo5.m72935f(e3, iArr, e3);
        uo5.m72943n(e3, 4, e3);
        uo5.m72935f(e3, e, e3);
        uo5.m72942m(e3, e3);
        uo5.m72942m(e3, e5);
        if (i34.m58831g(iArr, e5)) {
            return new vo5(e3);
        }
        uo5.m72935f(e3, f45336i, e3);
        uo5.m72942m(e3, e5);
        if (i34.m58831g(iArr, e5)) {
            return new vo5(e3);
        }
        return null;
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        int[] e = i34.m58829e();
        uo5.m72942m(this.f45337g, e);
        return new vo5(e);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        int[] e = i34.m58829e();
        uo5.m72944o(this.f45337g, ((vo5) zl1).f45337g, e);
        return new vo5(e);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return i34.m58833i(this.f45337g, 0) == 1;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return i34.m58845u(this.f45337g);
    }
}
