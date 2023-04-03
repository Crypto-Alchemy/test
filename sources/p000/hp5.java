package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: hp5 */
public class hp5 extends zl1.C9680b {

    /* renamed from: h */
    public static final BigInteger f38249h = new BigInteger(1, zl2.m75083a("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: g */
    public int[] f38250g;

    public hp5() {
        this.f38250g = j34.m59224i();
    }

    public hp5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f38249h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.f38250g = gp5.m58190d(bigInteger);
    }

    public hp5(int[] iArr) {
        this.f38250g = iArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        int[] i = j34.m59224i();
        gp5.m58187a(this.f38250g, ((hp5) zl1).f38250g, i);
        return new hp5(i);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        int[] i = j34.m59224i();
        gp5.m58188b(this.f38250g, i);
        return new hp5(i);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        int[] i = j34.m59224i();
        gp5.m58191e(((hp5) zl1).f38250g, i);
        gp5.m58193g(i, this.f38250g, i);
        return new hp5(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hp5)) {
            return false;
        }
        return j34.m59229n(this.f38250g, ((hp5) obj).f38250g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return f38249h.bitLength();
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        int[] i = j34.m59224i();
        gp5.m58191e(this.f38250g, i);
        return new hp5(i);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return j34.m59235t(this.f38250g);
    }

    public int hashCode() {
        return f38249h.hashCode() ^ C9367tq.m72441y(this.f38250g, 0, 8);
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return j34.m59237v(this.f38250g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        int[] i = j34.m59224i();
        gp5.m58193g(this.f38250g, ((hp5) zl1).f38250g, i);
        return new hp5(i);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        int[] i = j34.m59224i();
        gp5.m58195i(this.f38250g, i);
        return new hp5(i);
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        int[] iArr = this.f38250g;
        if (j34.m59237v(iArr) || j34.m59235t(iArr)) {
            return this;
        }
        int[] i = j34.m59224i();
        int[] i2 = j34.m59224i();
        gp5.m58200n(iArr, i);
        gp5.m58193g(i, iArr, i);
        gp5.m58201o(i, 2, i2);
        gp5.m58193g(i2, i, i2);
        gp5.m58201o(i2, 4, i);
        gp5.m58193g(i, i2, i);
        gp5.m58201o(i, 8, i2);
        gp5.m58193g(i2, i, i2);
        gp5.m58201o(i2, 16, i);
        gp5.m58193g(i, i2, i);
        gp5.m58201o(i, 32, i);
        gp5.m58193g(i, iArr, i);
        gp5.m58201o(i, 96, i);
        gp5.m58193g(i, iArr, i);
        gp5.m58201o(i, 94, i);
        gp5.m58200n(i, i2);
        if (j34.m59229n(iArr, i2)) {
            return new hp5(i);
        }
        return null;
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        int[] i = j34.m59224i();
        gp5.m58200n(this.f38250g, i);
        return new hp5(i);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        int[] i = j34.m59224i();
        gp5.m58203q(this.f38250g, ((hp5) zl1).f38250g, i);
        return new hp5(i);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return j34.m59232q(this.f38250g, 0) == 1;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return j34.m59214J(this.f38250g);
    }
}
