package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: lp5 */
public class lp5 extends zl1.C9680b {

    /* renamed from: h */
    public static final BigInteger f40675h = new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));

    /* renamed from: g */
    public int[] f40676g;

    public lp5() {
        this.f40676g = p34.m70886j(12);
    }

    public lp5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f40675h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.f40676g = kp5.m63566e(bigInteger);
    }

    public lp5(int[] iArr) {
        this.f40676g = iArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        int[] j = p34.m70886j(12);
        kp5.m63562a(this.f40676g, ((lp5) zl1).f40676g, j);
        return new lp5(j);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        int[] j = p34.m70886j(12);
        kp5.m63564c(this.f40676g, j);
        return new lp5(j);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        int[] j = p34.m70886j(12);
        kp5.m63567f(((lp5) zl1).f40676g, j);
        kp5.m63569h(j, this.f40676g, j);
        return new lp5(j);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lp5)) {
            return false;
        }
        return p34.m70890n(12, this.f40676g, ((lp5) obj).f40676g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return f40675h.bitLength();
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        int[] j = p34.m70886j(12);
        kp5.m63567f(this.f40676g, j);
        return new lp5(j);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return p34.m70901y(12, this.f40676g);
    }

    public int hashCode() {
        return f40675h.hashCode() ^ C9367tq.m72441y(this.f40676g, 0, 12);
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return p34.m70902z(12, this.f40676g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        int[] j = p34.m70886j(12);
        kp5.m63569h(this.f40676g, ((lp5) zl1).f40676g, j);
        return new lp5(j);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        int[] j = p34.m70886j(12);
        kp5.m63570i(this.f40676g, j);
        return new lp5(j);
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        int[] iArr = this.f40676g;
        if (p34.m70902z(12, iArr) || p34.m70901y(12, iArr)) {
            return this;
        }
        int[] j = p34.m70886j(12);
        int[] j2 = p34.m70886j(12);
        int[] j3 = p34.m70886j(12);
        int[] j4 = p34.m70886j(12);
        kp5.m63575n(iArr, j);
        kp5.m63569h(j, iArr, j);
        kp5.m63576o(j, 2, j2);
        kp5.m63569h(j2, j, j2);
        kp5.m63575n(j2, j2);
        kp5.m63569h(j2, iArr, j2);
        kp5.m63576o(j2, 5, j3);
        kp5.m63569h(j3, j2, j3);
        kp5.m63576o(j3, 5, j4);
        kp5.m63569h(j4, j2, j4);
        kp5.m63576o(j4, 15, j2);
        kp5.m63569h(j2, j4, j2);
        kp5.m63576o(j2, 2, j3);
        kp5.m63569h(j, j3, j);
        kp5.m63576o(j3, 28, j3);
        kp5.m63569h(j2, j3, j2);
        kp5.m63576o(j2, 60, j3);
        kp5.m63569h(j3, j2, j3);
        kp5.m63576o(j3, 120, j2);
        kp5.m63569h(j2, j3, j2);
        kp5.m63576o(j2, 15, j2);
        kp5.m63569h(j2, j4, j2);
        kp5.m63576o(j2, 33, j2);
        kp5.m63569h(j2, j, j2);
        kp5.m63576o(j2, 64, j2);
        kp5.m63569h(j2, iArr, j2);
        kp5.m63576o(j2, 30, j);
        kp5.m63575n(j, j2);
        if (p34.m70890n(12, iArr, j2)) {
            return new lp5(j);
        }
        return null;
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        int[] j = p34.m70886j(12);
        kp5.m63575n(this.f40676g, j);
        return new lp5(j);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        int[] j = p34.m70886j(12);
        kp5.m63578q(this.f40676g, ((lp5) zl1).f40676g, j);
        return new lp5(j);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return p34.m70895s(this.f40676g, 0) == 1;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return p34.m70874R(12, this.f40676g);
    }
}
