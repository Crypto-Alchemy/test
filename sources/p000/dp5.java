package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: dp5 */
public class dp5 extends zl1.C9680b {

    /* renamed from: h */
    public static final BigInteger f37363h = new BigInteger(1, zl2.m75083a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));

    /* renamed from: g */
    public int[] f37364g;

    public dp5() {
        this.f37364g = j34.m59224i();
    }

    public dp5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f37363h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.f37364g = cp5.m56491c(bigInteger);
    }

    public dp5(int[] iArr) {
        this.f37364g = iArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        int[] i = j34.m59224i();
        cp5.m56489a(this.f37364g, ((dp5) zl1).f37364g, i);
        return new dp5(i);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        int[] i = j34.m59224i();
        cp5.m56490b(this.f37364g, i);
        return new dp5(i);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        int[] i = j34.m59224i();
        cp5.m56492d(((dp5) zl1).f37364g, i);
        cp5.m56494f(i, this.f37364g, i);
        return new dp5(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dp5)) {
            return false;
        }
        return j34.m59229n(this.f37364g, ((dp5) obj).f37364g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return f37363h.bitLength();
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        int[] i = j34.m59224i();
        cp5.m56492d(this.f37364g, i);
        return new dp5(i);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return j34.m59235t(this.f37364g);
    }

    public int hashCode() {
        return f37363h.hashCode() ^ C9367tq.m72441y(this.f37364g, 0, 8);
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return j34.m59237v(this.f37364g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        int[] i = j34.m59224i();
        cp5.m56494f(this.f37364g, ((dp5) zl1).f37364g, i);
        return new dp5(i);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        int[] i = j34.m59224i();
        cp5.m56496h(this.f37364g, i);
        return new dp5(i);
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        int[] iArr = this.f37364g;
        if (j34.m59237v(iArr) || j34.m59235t(iArr)) {
            return this;
        }
        int[] i = j34.m59224i();
        cp5.m56501m(iArr, i);
        cp5.m56494f(i, iArr, i);
        int[] i2 = j34.m59224i();
        cp5.m56501m(i, i2);
        cp5.m56494f(i2, iArr, i2);
        int[] i3 = j34.m59224i();
        cp5.m56502n(i2, 3, i3);
        cp5.m56494f(i3, i2, i3);
        cp5.m56502n(i3, 3, i3);
        cp5.m56494f(i3, i2, i3);
        cp5.m56502n(i3, 2, i3);
        cp5.m56494f(i3, i, i3);
        int[] i4 = j34.m59224i();
        cp5.m56502n(i3, 11, i4);
        cp5.m56494f(i4, i3, i4);
        cp5.m56502n(i4, 22, i3);
        cp5.m56494f(i3, i4, i3);
        int[] i5 = j34.m59224i();
        cp5.m56502n(i3, 44, i5);
        cp5.m56494f(i5, i3, i5);
        int[] i6 = j34.m59224i();
        cp5.m56502n(i5, 88, i6);
        cp5.m56494f(i6, i5, i6);
        cp5.m56502n(i6, 44, i5);
        cp5.m56494f(i5, i3, i5);
        cp5.m56502n(i5, 3, i3);
        cp5.m56494f(i3, i2, i3);
        cp5.m56502n(i3, 23, i3);
        cp5.m56494f(i3, i4, i3);
        cp5.m56502n(i3, 6, i3);
        cp5.m56494f(i3, i, i3);
        cp5.m56502n(i3, 2, i3);
        cp5.m56501m(i3, i);
        if (j34.m59229n(iArr, i)) {
            return new dp5(i3);
        }
        return null;
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        int[] i = j34.m59224i();
        cp5.m56501m(this.f37364g, i);
        return new dp5(i);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        int[] i = j34.m59224i();
        cp5.m56503o(this.f37364g, ((dp5) zl1).f37364g, i);
        return new dp5(i);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return j34.m59232q(this.f37364g, 0) == 1;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return j34.m59214J(this.f37364g);
    }
}
