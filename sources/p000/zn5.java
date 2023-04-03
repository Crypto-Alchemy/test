package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: zn5 */
public class zn5 extends zl1.C9680b {

    /* renamed from: h */
    public static final BigInteger f46420h = new BigInteger(1, zl2.m75083a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: g */
    public int[] f46421g;

    public zn5() {
        this.f46421g = f34.m57567f();
    }

    public zn5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f46420h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.f46421g = yn5.m74483d(bigInteger);
    }

    public zn5(int[] iArr) {
        this.f46421g = iArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        int[] f = f34.m57567f();
        yn5.m74480a(this.f46421g, ((zn5) zl1).f46421g, f);
        return new zn5(f);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        int[] f = f34.m57567f();
        yn5.m74481b(this.f46421g, f);
        return new zn5(f);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        int[] f = f34.m57567f();
        yn5.m74484e(((zn5) zl1).f46421g, f);
        yn5.m74486g(f, this.f46421g, f);
        return new zn5(f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zn5)) {
            return false;
        }
        return f34.m57571j(this.f46421g, ((zn5) obj).f46421g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return f46420h.bitLength();
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        int[] f = f34.m57567f();
        yn5.m74484e(this.f46421g, f);
        return new zn5(f);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return f34.m57576o(this.f46421g);
    }

    public int hashCode() {
        return f46420h.hashCode() ^ C9367tq.m72441y(this.f46421g, 0, 4);
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return f34.m57578q(this.f46421g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        int[] f = f34.m57567f();
        yn5.m74486g(this.f46421g, ((zn5) zl1).f46421g, f);
        return new zn5(f);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        int[] f = f34.m57567f();
        yn5.m74488i(this.f46421g, f);
        return new zn5(f);
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        int[] iArr = this.f46421g;
        if (f34.m57578q(iArr) || f34.m57576o(iArr)) {
            return this;
        }
        int[] f = f34.m57567f();
        yn5.m74493n(iArr, f);
        yn5.m74486g(f, iArr, f);
        int[] f2 = f34.m57567f();
        yn5.m74494o(f, 2, f2);
        yn5.m74486g(f2, f, f2);
        int[] f3 = f34.m57567f();
        yn5.m74494o(f2, 4, f3);
        yn5.m74486g(f3, f2, f3);
        yn5.m74494o(f3, 2, f2);
        yn5.m74486g(f2, f, f2);
        yn5.m74494o(f2, 10, f);
        yn5.m74486g(f, f2, f);
        yn5.m74494o(f, 10, f3);
        yn5.m74486g(f3, f2, f3);
        yn5.m74493n(f3, f2);
        yn5.m74486g(f2, iArr, f2);
        yn5.m74494o(f2, 95, f2);
        yn5.m74493n(f2, f3);
        if (f34.m57571j(iArr, f3)) {
            return new zn5(f2);
        }
        return null;
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        int[] f = f34.m57567f();
        yn5.m74493n(this.f46421g, f);
        return new zn5(f);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        int[] f = f34.m57567f();
        yn5.m74496q(this.f46421g, ((zn5) zl1).f46421g, f);
        return new zn5(f);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return f34.m57574m(this.f46421g, 0) == 1;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return f34.m57585x(this.f46421g);
    }
}
