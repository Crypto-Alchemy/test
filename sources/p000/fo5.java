package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: fo5 */
public class fo5 extends zl1.C9680b {

    /* renamed from: h */
    public static final BigInteger f37856h = new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));

    /* renamed from: g */
    public int[] f37857g;

    public fo5() {
        this.f37857g = g34.m58020d();
    }

    public fo5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f37856h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.f37857g = eo5.m57413c(bigInteger);
    }

    public fo5(int[] iArr) {
        this.f37857g = iArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        int[] d = g34.m58020d();
        eo5.m57411a(this.f37857g, ((fo5) zl1).f37857g, d);
        return new fo5(d);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        int[] d = g34.m58020d();
        eo5.m57412b(this.f37857g, d);
        return new fo5(d);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        int[] d = g34.m58020d();
        eo5.m57414d(((fo5) zl1).f37857g, d);
        eo5.m57416f(d, this.f37857g, d);
        return new fo5(d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fo5)) {
            return false;
        }
        return g34.m58022f(this.f37857g, ((fo5) obj).f37857g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return f37856h.bitLength();
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        int[] d = g34.m58020d();
        eo5.m57414d(this.f37857g, d);
        return new fo5(d);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return g34.m58026j(this.f37857g);
    }

    public int hashCode() {
        return f37856h.hashCode() ^ C9367tq.m72441y(this.f37857g, 0, 5);
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return g34.m58027k(this.f37857g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        int[] d = g34.m58020d();
        eo5.m57416f(this.f37857g, ((fo5) zl1).f37857g, d);
        return new fo5(d);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        int[] d = g34.m58020d();
        eo5.m57418h(this.f37857g, d);
        return new fo5(d);
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        int[] iArr = this.f37857g;
        if (g34.m58027k(iArr) || g34.m58026j(iArr)) {
            return this;
        }
        int[] d = g34.m58020d();
        eo5.m57423m(iArr, d);
        eo5.m57416f(d, iArr, d);
        int[] d2 = g34.m58020d();
        eo5.m57424n(d, 2, d2);
        eo5.m57416f(d2, d, d2);
        eo5.m57424n(d2, 4, d);
        eo5.m57416f(d, d2, d);
        eo5.m57424n(d, 8, d2);
        eo5.m57416f(d2, d, d2);
        eo5.m57424n(d2, 16, d);
        eo5.m57416f(d, d2, d);
        eo5.m57424n(d, 32, d2);
        eo5.m57416f(d2, d, d2);
        eo5.m57424n(d2, 64, d);
        eo5.m57416f(d, d2, d);
        eo5.m57423m(d, d2);
        eo5.m57416f(d2, iArr, d2);
        eo5.m57424n(d2, 29, d2);
        eo5.m57423m(d2, d);
        if (g34.m58022f(iArr, d)) {
            return new fo5(d2);
        }
        return null;
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        int[] d = g34.m58020d();
        eo5.m57423m(this.f37857g, d);
        return new fo5(d);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        int[] d = g34.m58020d();
        eo5.m57425o(this.f37857g, ((fo5) zl1).f37857g, d);
        return new fo5(d);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return g34.m58024h(this.f37857g, 0) == 1;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return g34.m58037u(this.f37857g);
    }
}
