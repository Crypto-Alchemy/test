package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: ro5 */
public class ro5 extends zl1.C9680b {

    /* renamed from: h */
    public static final BigInteger f44437h = new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));

    /* renamed from: g */
    public int[] f44438g;

    public ro5() {
        this.f44438g = h34.m58433h();
    }

    public ro5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f44437h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.f44438g = qo5.m71294d(bigInteger);
    }

    public ro5(int[] iArr) {
        this.f44438g = iArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        int[] h = h34.m58433h();
        qo5.m71291a(this.f44438g, ((ro5) zl1).f44438g, h);
        return new ro5(h);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        int[] h = h34.m58433h();
        qo5.m71292b(this.f44438g, h);
        return new ro5(h);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        int[] h = h34.m58433h();
        qo5.m71295e(((ro5) zl1).f44438g, h);
        qo5.m71297g(h, this.f44438g, h);
        return new ro5(h);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ro5)) {
            return false;
        }
        return h34.m58438m(this.f44438g, ((ro5) obj).f44438g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return f44437h.bitLength();
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        int[] h = h34.m58433h();
        qo5.m71295e(this.f44438g, h);
        return new ro5(h);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return h34.m58444s(this.f44438g);
    }

    public int hashCode() {
        return f44437h.hashCode() ^ C9367tq.m72441y(this.f44438g, 0, 6);
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return h34.m58446u(this.f44438g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        int[] h = h34.m58433h();
        qo5.m71297g(this.f44438g, ((ro5) zl1).f44438g, h);
        return new ro5(h);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        int[] h = h34.m58433h();
        qo5.m71299i(this.f44438g, h);
        return new ro5(h);
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        int[] iArr = this.f44438g;
        if (h34.m58446u(iArr) || h34.m58444s(iArr)) {
            return this;
        }
        int[] h = h34.m58433h();
        int[] h2 = h34.m58433h();
        qo5.m71304n(iArr, h);
        qo5.m71297g(h, iArr, h);
        qo5.m71305o(h, 2, h2);
        qo5.m71297g(h2, h, h2);
        qo5.m71305o(h2, 4, h);
        qo5.m71297g(h, h2, h);
        qo5.m71305o(h, 8, h2);
        qo5.m71297g(h2, h, h2);
        qo5.m71305o(h2, 16, h);
        qo5.m71297g(h, h2, h);
        qo5.m71305o(h, 32, h2);
        qo5.m71297g(h2, h, h2);
        qo5.m71305o(h2, 64, h);
        qo5.m71297g(h, h2, h);
        qo5.m71305o(h, 62, h);
        qo5.m71304n(h, h2);
        if (h34.m58438m(iArr, h2)) {
            return new ro5(h);
        }
        return null;
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        int[] h = h34.m58433h();
        qo5.m71304n(this.f44438g, h);
        return new ro5(h);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        int[] h = h34.m58433h();
        qo5.m71307q(this.f44438g, ((ro5) zl1).f44438g, h);
        return new ro5(h);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return h34.m58441p(this.f44438g, 0) == 1;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return h34.m58424H(this.f44438g);
    }
}
