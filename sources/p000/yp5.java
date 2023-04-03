package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: yp5 */
public class yp5 extends zl1.C9679a {

    /* renamed from: g */
    public long[] f46246g;

    public yp5() {
        this.f46246g = h34.m58434i();
    }

    public yp5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.f46246g = xp5.m74066e(bigInteger);
    }

    public yp5(long[] jArr) {
        this.f46246g = jArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        long[] i = h34.m58434i();
        xp5.m74062a(this.f46246g, ((yp5) zl1).f46246g, i);
        return new yp5(i);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        long[] i = h34.m58434i();
        xp5.m74064c(this.f46246g, i);
        return new yp5(i);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        return mo50984j(zl1.mo50980g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yp5)) {
            return false;
        }
        return h34.m58439n(this.f46246g, ((yp5) obj).f46246g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return 131;
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        long[] i = h34.m58434i();
        xp5.m74072k(this.f46246g, i);
        return new yp5(i);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return h34.m58445t(this.f46246g);
    }

    public int hashCode() {
        return C9367tq.m72442z(this.f46246g, 0, 3) ^ 131832;
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return h34.m58447v(this.f46246g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        long[] i = h34.m58434i();
        xp5.m74073l(this.f46246g, ((yp5) zl1).f46246g, i);
        return new yp5(i);
    }

    /* renamed from: k */
    public zl1 mo50985k(zl1 zl1, zl1 zl12, zl1 zl13) {
        return mo50986l(zl1, zl12, zl13);
    }

    /* renamed from: l */
    public zl1 mo50986l(zl1 zl1, zl1 zl12, zl1 zl13) {
        long[] jArr = this.f46246g;
        long[] jArr2 = ((yp5) zl1).f46246g;
        long[] jArr3 = ((yp5) zl12).f46246g;
        long[] jArr4 = ((yp5) zl13).f46246g;
        long[] k = p34.m70887k(5);
        xp5.m74074m(jArr, jArr2, k);
        xp5.m74074m(jArr3, jArr4, k);
        long[] i = h34.m58434i();
        xp5.m74075n(k, i);
        return new yp5(i);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        return this;
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        long[] i = h34.m58434i();
        xp5.m74076o(this.f46246g, i);
        return new yp5(i);
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        long[] i = h34.m58434i();
        xp5.m74077p(this.f46246g, i);
        return new yp5(i);
    }

    /* renamed from: p */
    public zl1 mo50990p(zl1 zl1, zl1 zl12) {
        long[] jArr = this.f46246g;
        long[] jArr2 = ((yp5) zl1).f46246g;
        long[] jArr3 = ((yp5) zl12).f46246g;
        long[] k = p34.m70887k(5);
        xp5.m74078q(jArr, k);
        xp5.m74074m(jArr2, jArr3, k);
        long[] i = h34.m58434i();
        xp5.m74075n(k, i);
        return new yp5(i);
    }

    /* renamed from: q */
    public zl1 mo50991q(int i) {
        if (i < 1) {
            return this;
        }
        long[] i2 = h34.m58434i();
        xp5.m74079r(this.f46246g, i, i2);
        return new yp5(i2);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        return mo50975a(zl1);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return (this.f46246g[0] & 1) != 0;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return h34.m58425I(this.f46246g);
    }

    /* renamed from: u */
    public zl1 mo50995u() {
        long[] i = h34.m58434i();
        xp5.m74067f(this.f46246g, i);
        return new yp5(i);
    }

    /* renamed from: v */
    public boolean mo50996v() {
        return true;
    }

    /* renamed from: w */
    public int mo50997w() {
        return xp5.m74080s(this.f46246g);
    }
}
