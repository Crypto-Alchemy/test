package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: sx0 */
public class sx0 extends zl1.C9680b {

    /* renamed from: h */
    public static final BigInteger f44617h = j34.m59214J(rx0.f44490a);

    /* renamed from: i */
    public static final int[] f44618i = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    /* renamed from: g */
    public int[] f44619g;

    public sx0() {
        this.f44619g = j34.m59224i();
    }

    public sx0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f44617h) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.f44619g = rx0.m71698d(bigInteger);
    }

    public sx0(int[] iArr) {
        this.f44619g = iArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        int[] i = j34.m59224i();
        rx0.m71695a(this.f44619g, ((sx0) zl1).f44619g, i);
        return new sx0(i);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        int[] i = j34.m59224i();
        rx0.m71696b(this.f44619g, i);
        return new sx0(i);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        int[] i = j34.m59224i();
        rx0.m71699e(((sx0) zl1).f44619g, i);
        rx0.m71701g(i, this.f44619g, i);
        return new sx0(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sx0)) {
            return false;
        }
        return j34.m59229n(this.f44619g, ((sx0) obj).f44619g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return f44617h.bitLength();
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        int[] i = j34.m59224i();
        rx0.m71699e(this.f44619g, i);
        return new sx0(i);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return j34.m59235t(this.f44619g);
    }

    public int hashCode() {
        return f44617h.hashCode() ^ C9367tq.m72441y(this.f44619g, 0, 8);
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return j34.m59237v(this.f44619g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        int[] i = j34.m59224i();
        rx0.m71701g(this.f44619g, ((sx0) zl1).f44619g, i);
        return new sx0(i);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        int[] i = j34.m59224i();
        rx0.m71703i(this.f44619g, i);
        return new sx0(i);
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        int[] iArr = this.f44619g;
        if (j34.m59237v(iArr) || j34.m59235t(iArr)) {
            return this;
        }
        int[] i = j34.m59224i();
        rx0.m71708n(iArr, i);
        rx0.m71701g(i, iArr, i);
        rx0.m71708n(i, i);
        rx0.m71701g(i, iArr, i);
        int[] i2 = j34.m59224i();
        rx0.m71708n(i, i2);
        rx0.m71701g(i2, iArr, i2);
        int[] i3 = j34.m59224i();
        rx0.m71709o(i2, 3, i3);
        rx0.m71701g(i3, i, i3);
        rx0.m71709o(i3, 4, i);
        rx0.m71701g(i, i2, i);
        rx0.m71709o(i, 4, i3);
        rx0.m71701g(i3, i2, i3);
        rx0.m71709o(i3, 15, i2);
        rx0.m71701g(i2, i3, i2);
        rx0.m71709o(i2, 30, i3);
        rx0.m71701g(i3, i2, i3);
        rx0.m71709o(i3, 60, i2);
        rx0.m71701g(i2, i3, i2);
        rx0.m71709o(i2, 11, i3);
        rx0.m71701g(i3, i, i3);
        rx0.m71709o(i3, 120, i);
        rx0.m71701g(i, i2, i);
        rx0.m71708n(i, i);
        rx0.m71708n(i, i2);
        if (j34.m59229n(iArr, i2)) {
            return new sx0(i);
        }
        rx0.m71701g(i, f44618i, i);
        rx0.m71708n(i, i2);
        if (j34.m59229n(iArr, i2)) {
            return new sx0(i);
        }
        return null;
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        int[] i = j34.m59224i();
        rx0.m71708n(this.f44619g, i);
        return new sx0(i);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        int[] i = j34.m59224i();
        rx0.m71712r(this.f44619g, ((sx0) zl1).f44619g, i);
        return new sx0(i);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return j34.m59232q(this.f44619g, 0) == 1;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return j34.m59214J(this.f44619g);
    }
}
