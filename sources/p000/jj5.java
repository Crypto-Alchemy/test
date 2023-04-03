package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: jj5 */
public class jj5 extends zl1.C9680b {

    /* renamed from: h */
    public static final BigInteger f38737h = new BigInteger(1, zl2.m75083a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));

    /* renamed from: g */
    public int[] f38738g;

    public jj5() {
        this.f38738g = j34.m59224i();
    }

    public jj5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f38737h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        this.f38738g = ij5.m58976d(bigInteger);
    }

    public jj5(int[] iArr) {
        this.f38738g = iArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        int[] i = j34.m59224i();
        ij5.m58973a(this.f38738g, ((jj5) zl1).f38738g, i);
        return new jj5(i);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        int[] i = j34.m59224i();
        ij5.m58974b(this.f38738g, i);
        return new jj5(i);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        int[] i = j34.m59224i();
        ij5.m58977e(((jj5) zl1).f38738g, i);
        ij5.m58979g(i, this.f38738g, i);
        return new jj5(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jj5)) {
            return false;
        }
        return j34.m59229n(this.f38738g, ((jj5) obj).f38738g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return f38737h.bitLength();
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        int[] i = j34.m59224i();
        ij5.m58977e(this.f38738g, i);
        return new jj5(i);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return j34.m59235t(this.f38738g);
    }

    public int hashCode() {
        return f38737h.hashCode() ^ C9367tq.m72441y(this.f38738g, 0, 8);
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return j34.m59237v(this.f38738g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        int[] i = j34.m59224i();
        ij5.m58979g(this.f38738g, ((jj5) zl1).f38738g, i);
        return new jj5(i);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        int[] i = j34.m59224i();
        ij5.m58981i(this.f38738g, i);
        return new jj5(i);
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        int[] iArr = this.f38738g;
        if (j34.m59237v(iArr) || j34.m59235t(iArr)) {
            return this;
        }
        int[] i = j34.m59224i();
        ij5.m58986n(iArr, i);
        ij5.m58979g(i, iArr, i);
        int[] i2 = j34.m59224i();
        ij5.m58987o(i, 2, i2);
        ij5.m58979g(i2, i, i2);
        int[] i3 = j34.m59224i();
        ij5.m58987o(i2, 2, i3);
        ij5.m58979g(i3, i, i3);
        ij5.m58987o(i3, 6, i);
        ij5.m58979g(i, i3, i);
        int[] i4 = j34.m59224i();
        ij5.m58987o(i, 12, i4);
        ij5.m58979g(i4, i, i4);
        ij5.m58987o(i4, 6, i);
        ij5.m58979g(i, i3, i);
        ij5.m58986n(i, i3);
        ij5.m58979g(i3, iArr, i3);
        ij5.m58987o(i3, 31, i4);
        ij5.m58979g(i4, i3, i);
        ij5.m58987o(i4, 32, i4);
        ij5.m58979g(i4, i, i4);
        ij5.m58987o(i4, 62, i4);
        ij5.m58979g(i4, i, i4);
        ij5.m58987o(i4, 4, i4);
        ij5.m58979g(i4, i2, i4);
        ij5.m58987o(i4, 32, i4);
        ij5.m58979g(i4, iArr, i4);
        ij5.m58987o(i4, 62, i4);
        ij5.m58986n(i4, i2);
        if (j34.m59229n(iArr, i2)) {
            return new jj5(i4);
        }
        return null;
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        int[] i = j34.m59224i();
        ij5.m58986n(this.f38738g, i);
        return new jj5(i);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        int[] i = j34.m59224i();
        ij5.m58989q(this.f38738g, ((jj5) zl1).f38738g, i);
        return new jj5(i);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return j34.m59232q(this.f38738g, 0) == 1;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return j34.m59214J(this.f38738g);
    }
}
