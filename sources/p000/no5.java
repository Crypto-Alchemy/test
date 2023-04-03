package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: no5 */
public class no5 extends zl1.C9680b {

    /* renamed from: h */
    public static final BigInteger f43522h = new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));

    /* renamed from: g */
    public int[] f43523g;

    public no5() {
        this.f43523g = h34.m58433h();
    }

    public no5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f43522h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.f43523g = mo5.m64370c(bigInteger);
    }

    public no5(int[] iArr) {
        this.f43523g = iArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        int[] h = h34.m58433h();
        mo5.m64368a(this.f43523g, ((no5) zl1).f43523g, h);
        return new no5(h);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        int[] h = h34.m58433h();
        mo5.m64369b(this.f43523g, h);
        return new no5(h);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        int[] h = h34.m58433h();
        mo5.m64371d(((no5) zl1).f43523g, h);
        mo5.m64373f(h, this.f43523g, h);
        return new no5(h);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof no5)) {
            return false;
        }
        return h34.m58438m(this.f43523g, ((no5) obj).f43523g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return f43522h.bitLength();
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        int[] h = h34.m58433h();
        mo5.m64371d(this.f43523g, h);
        return new no5(h);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return h34.m58444s(this.f43523g);
    }

    public int hashCode() {
        return f43522h.hashCode() ^ C9367tq.m72441y(this.f43523g, 0, 6);
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return h34.m58446u(this.f43523g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        int[] h = h34.m58433h();
        mo5.m64373f(this.f43523g, ((no5) zl1).f43523g, h);
        return new no5(h);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        int[] h = h34.m58433h();
        mo5.m64375h(this.f43523g, h);
        return new no5(h);
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        int[] iArr = this.f43523g;
        if (h34.m58446u(iArr) || h34.m58444s(iArr)) {
            return this;
        }
        int[] h = h34.m58433h();
        mo5.m64380m(iArr, h);
        mo5.m64373f(h, iArr, h);
        int[] h2 = h34.m58433h();
        mo5.m64380m(h, h2);
        mo5.m64373f(h2, iArr, h2);
        int[] h3 = h34.m58433h();
        mo5.m64381n(h2, 3, h3);
        mo5.m64373f(h3, h2, h3);
        mo5.m64381n(h3, 2, h3);
        mo5.m64373f(h3, h, h3);
        mo5.m64381n(h3, 8, h);
        mo5.m64373f(h, h3, h);
        mo5.m64381n(h, 3, h3);
        mo5.m64373f(h3, h2, h3);
        int[] h4 = h34.m58433h();
        mo5.m64381n(h3, 16, h4);
        mo5.m64373f(h4, h, h4);
        mo5.m64381n(h4, 35, h);
        mo5.m64373f(h, h4, h);
        mo5.m64381n(h, 70, h4);
        mo5.m64373f(h4, h, h4);
        mo5.m64381n(h4, 19, h);
        mo5.m64373f(h, h3, h);
        mo5.m64381n(h, 20, h);
        mo5.m64373f(h, h3, h);
        mo5.m64381n(h, 4, h);
        mo5.m64373f(h, h2, h);
        mo5.m64381n(h, 6, h);
        mo5.m64373f(h, h2, h);
        mo5.m64380m(h, h);
        mo5.m64380m(h, h2);
        if (h34.m58438m(iArr, h2)) {
            return new no5(h);
        }
        return null;
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        int[] h = h34.m58433h();
        mo5.m64380m(this.f43523g, h);
        return new no5(h);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        int[] h = h34.m58433h();
        mo5.m64382o(this.f43523g, ((no5) zl1).f43523g, h);
        return new no5(h);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return h34.m58441p(this.f43523g, 0) == 1;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return h34.m58424H(this.f43523g);
    }
}
