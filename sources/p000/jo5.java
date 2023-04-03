package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: jo5 */
public class jo5 extends zl1.C9680b {

    /* renamed from: h */
    public static final BigInteger f38752h = new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));

    /* renamed from: g */
    public int[] f38753g;

    public jo5() {
        this.f38753g = g34.m58020d();
    }

    public jo5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f38752h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.f38753g = io5.m59035c(bigInteger);
    }

    public jo5(int[] iArr) {
        this.f38753g = iArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        int[] d = g34.m58020d();
        io5.m59033a(this.f38753g, ((jo5) zl1).f38753g, d);
        return new jo5(d);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        int[] d = g34.m58020d();
        io5.m59034b(this.f38753g, d);
        return new jo5(d);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        int[] d = g34.m58020d();
        io5.m59036d(((jo5) zl1).f38753g, d);
        io5.m59038f(d, this.f38753g, d);
        return new jo5(d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jo5)) {
            return false;
        }
        return g34.m58022f(this.f38753g, ((jo5) obj).f38753g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return f38752h.bitLength();
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        int[] d = g34.m58020d();
        io5.m59036d(this.f38753g, d);
        return new jo5(d);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return g34.m58026j(this.f38753g);
    }

    public int hashCode() {
        return f38752h.hashCode() ^ C9367tq.m72441y(this.f38753g, 0, 5);
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return g34.m58027k(this.f38753g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        int[] d = g34.m58020d();
        io5.m59038f(this.f38753g, ((jo5) zl1).f38753g, d);
        return new jo5(d);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        int[] d = g34.m58020d();
        io5.m59040h(this.f38753g, d);
        return new jo5(d);
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        int[] iArr = this.f38753g;
        if (g34.m58027k(iArr) || g34.m58026j(iArr)) {
            return this;
        }
        int[] d = g34.m58020d();
        io5.m59045m(iArr, d);
        io5.m59038f(d, iArr, d);
        int[] d2 = g34.m58020d();
        io5.m59045m(d, d2);
        io5.m59038f(d2, iArr, d2);
        int[] d3 = g34.m58020d();
        io5.m59045m(d2, d3);
        io5.m59038f(d3, iArr, d3);
        int[] d4 = g34.m58020d();
        io5.m59046n(d3, 3, d4);
        io5.m59038f(d4, d2, d4);
        io5.m59046n(d4, 7, d3);
        io5.m59038f(d3, d4, d3);
        io5.m59046n(d3, 3, d4);
        io5.m59038f(d4, d2, d4);
        int[] d5 = g34.m58020d();
        io5.m59046n(d4, 14, d5);
        io5.m59038f(d5, d3, d5);
        io5.m59046n(d5, 31, d3);
        io5.m59038f(d3, d5, d3);
        io5.m59046n(d3, 62, d5);
        io5.m59038f(d5, d3, d5);
        io5.m59046n(d5, 3, d3);
        io5.m59038f(d3, d2, d3);
        io5.m59046n(d3, 18, d3);
        io5.m59038f(d3, d4, d3);
        io5.m59046n(d3, 2, d3);
        io5.m59038f(d3, iArr, d3);
        io5.m59046n(d3, 3, d3);
        io5.m59038f(d3, d, d3);
        io5.m59046n(d3, 6, d3);
        io5.m59038f(d3, d2, d3);
        io5.m59046n(d3, 2, d3);
        io5.m59038f(d3, iArr, d3);
        io5.m59045m(d3, d);
        if (g34.m58022f(iArr, d)) {
            return new jo5(d3);
        }
        return null;
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        int[] d = g34.m58020d();
        io5.m59045m(this.f38753g, d);
        return new jo5(d);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        int[] d = g34.m58020d();
        io5.m59047o(this.f38753g, ((jo5) zl1).f38753g, d);
        return new jo5(d);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return g34.m58024h(this.f38753g, 0) == 1;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return g34.m58037u(this.f38753g);
    }
}
