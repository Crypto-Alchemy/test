package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: pp5 */
public class pp5 extends zl1.C9680b {

    /* renamed from: h */
    public static final BigInteger f44086h = new BigInteger(1, zl2.m75083a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: g */
    public int[] f44087g;

    public pp5() {
        this.f44087g = p34.m70886j(17);
    }

    public pp5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f44086h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.f44087g = op5.m70436c(bigInteger);
    }

    public pp5(int[] iArr) {
        this.f44087g = iArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        int[] j = p34.m70886j(17);
        op5.m70434a(this.f44087g, ((pp5) zl1).f44087g, j);
        return new pp5(j);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        int[] j = p34.m70886j(17);
        op5.m70435b(this.f44087g, j);
        return new pp5(j);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        int[] j = p34.m70886j(17);
        op5.m70439f(((pp5) zl1).f44087g, j);
        op5.m70441h(j, this.f44087g, j);
        return new pp5(j);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pp5)) {
            return false;
        }
        return p34.m70890n(17, this.f44087g, ((pp5) obj).f44087g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return f44086h.bitLength();
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        int[] j = p34.m70886j(17);
        op5.m70439f(this.f44087g, j);
        return new pp5(j);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return p34.m70901y(17, this.f44087g);
    }

    public int hashCode() {
        return f44086h.hashCode() ^ C9367tq.m72441y(this.f44087g, 0, 17);
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return p34.m70902z(17, this.f44087g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        int[] j = p34.m70886j(17);
        op5.m70441h(this.f44087g, ((pp5) zl1).f44087g, j);
        return new pp5(j);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        int[] j = p34.m70886j(17);
        op5.m70442i(this.f44087g, j);
        return new pp5(j);
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        int[] iArr = this.f44087g;
        if (p34.m70902z(17, iArr) || p34.m70901y(17, iArr)) {
            return this;
        }
        int[] j = p34.m70886j(17);
        int[] j2 = p34.m70886j(17);
        op5.m70448o(iArr, 519, j);
        op5.m70447n(j, j2);
        if (p34.m70890n(17, iArr, j2)) {
            return new pp5(j);
        }
        return null;
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        int[] j = p34.m70886j(17);
        op5.m70447n(this.f44087g, j);
        return new pp5(j);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        int[] j = p34.m70886j(17);
        op5.m70449p(this.f44087g, ((pp5) zl1).f44087g, j);
        return new pp5(j);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return p34.m70895s(this.f44087g, 0) == 1;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return p34.m70874R(17, this.f44087g);
    }
}
