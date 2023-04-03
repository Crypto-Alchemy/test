package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: mq5 */
public class mq5 extends zl1.C9679a {

    /* renamed from: g */
    public long[] f41000g;

    public mq5() {
        this.f41000g = j34.m59225j();
    }

    public mq5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.f41000g = lq5.m63954e(bigInteger);
    }

    public mq5(long[] jArr) {
        this.f41000g = jArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        long[] j = j34.m59225j();
        lq5.m63950a(this.f41000g, ((mq5) zl1).f41000g, j);
        return new mq5(j);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        long[] j = j34.m59225j();
        lq5.m63952c(this.f41000g, j);
        return new mq5(j);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        return mo50984j(zl1.mo50980g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mq5)) {
            return false;
        }
        return j34.m59230o(this.f41000g, ((mq5) obj).f41000g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return 193;
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        long[] j = j34.m59225j();
        lq5.m63961l(this.f41000g, j);
        return new mq5(j);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return j34.m59236u(this.f41000g);
    }

    public int hashCode() {
        return C9367tq.m72442z(this.f41000g, 0, 4) ^ 1930015;
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return j34.m59238w(this.f41000g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        long[] j = j34.m59225j();
        lq5.m63962m(this.f41000g, ((mq5) zl1).f41000g, j);
        return new mq5(j);
    }

    /* renamed from: k */
    public zl1 mo50985k(zl1 zl1, zl1 zl12, zl1 zl13) {
        return mo50986l(zl1, zl12, zl13);
    }

    /* renamed from: l */
    public zl1 mo50986l(zl1 zl1, zl1 zl12, zl1 zl13) {
        long[] jArr = this.f41000g;
        long[] jArr2 = ((mq5) zl1).f41000g;
        long[] jArr3 = ((mq5) zl12).f41000g;
        long[] jArr4 = ((mq5) zl13).f41000g;
        long[] l = j34.m59227l();
        lq5.m63963n(jArr, jArr2, l);
        lq5.m63963n(jArr3, jArr4, l);
        long[] j = j34.m59225j();
        lq5.m63964o(l, j);
        return new mq5(j);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        return this;
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        long[] j = j34.m59225j();
        lq5.m63965p(this.f41000g, j);
        return new mq5(j);
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        long[] j = j34.m59225j();
        lq5.m63966q(this.f41000g, j);
        return new mq5(j);
    }

    /* renamed from: p */
    public zl1 mo50990p(zl1 zl1, zl1 zl12) {
        long[] jArr = this.f41000g;
        long[] jArr2 = ((mq5) zl1).f41000g;
        long[] jArr3 = ((mq5) zl12).f41000g;
        long[] l = j34.m59227l();
        lq5.m63967r(jArr, l);
        lq5.m63963n(jArr2, jArr3, l);
        long[] j = j34.m59225j();
        lq5.m63964o(l, j);
        return new mq5(j);
    }

    /* renamed from: q */
    public zl1 mo50991q(int i) {
        if (i < 1) {
            return this;
        }
        long[] j = j34.m59225j();
        lq5.m63968s(this.f41000g, i, j);
        return new mq5(j);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        return mo50975a(zl1);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return (this.f41000g[0] & 1) != 0;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return j34.m59215K(this.f41000g);
    }

    /* renamed from: u */
    public zl1 mo50995u() {
        long[] j = j34.m59225j();
        lq5.m63955f(this.f41000g, j);
        return new mq5(j);
    }

    /* renamed from: v */
    public boolean mo50996v() {
        return true;
    }

    /* renamed from: w */
    public int mo50997w() {
        return lq5.m63969t(this.f41000g);
    }
}
