package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: cr5 */
public class cr5 extends zl1.C9679a {

    /* renamed from: g */
    public long[] f37194g;

    public cr5() {
        this.f37194g = k34.m59677c();
    }

    public cr5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.f37194g = br5.m56148e(bigInteger);
    }

    public cr5(long[] jArr) {
        this.f37194g = jArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        long[] c = k34.m59677c();
        br5.m56144a(this.f37194g, ((cr5) zl1).f37194g, c);
        return new cr5(c);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        long[] c = k34.m59677c();
        br5.m56146c(this.f37194g, c);
        return new cr5(c);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        return mo50984j(zl1.mo50980g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cr5)) {
            return false;
        }
        return k34.m59679e(this.f37194g, ((cr5) obj).f37194g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return 283;
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        long[] c = k34.m59677c();
        br5.m56155l(this.f37194g, c);
        return new cr5(c);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return k34.m59680f(this.f37194g);
    }

    public int hashCode() {
        return C9367tq.m72442z(this.f37194g, 0, 5) ^ 2831275;
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return k34.m59681g(this.f37194g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        long[] c = k34.m59677c();
        br5.m56156m(this.f37194g, ((cr5) zl1).f37194g, c);
        return new cr5(c);
    }

    /* renamed from: k */
    public zl1 mo50985k(zl1 zl1, zl1 zl12, zl1 zl13) {
        return mo50986l(zl1, zl12, zl13);
    }

    /* renamed from: l */
    public zl1 mo50986l(zl1 zl1, zl1 zl12, zl1 zl13) {
        long[] jArr = this.f37194g;
        long[] jArr2 = ((cr5) zl1).f37194g;
        long[] jArr3 = ((cr5) zl12).f37194g;
        long[] jArr4 = ((cr5) zl13).f37194g;
        long[] k = p34.m70887k(9);
        br5.m56157n(jArr, jArr2, k);
        br5.m56157n(jArr3, jArr4, k);
        long[] c = k34.m59677c();
        br5.m56158o(k, c);
        return new cr5(c);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        return this;
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        long[] c = k34.m59677c();
        br5.m56159p(this.f37194g, c);
        return new cr5(c);
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        long[] c = k34.m59677c();
        br5.m56160q(this.f37194g, c);
        return new cr5(c);
    }

    /* renamed from: p */
    public zl1 mo50990p(zl1 zl1, zl1 zl12) {
        long[] jArr = this.f37194g;
        long[] jArr2 = ((cr5) zl1).f37194g;
        long[] jArr3 = ((cr5) zl12).f37194g;
        long[] k = p34.m70887k(9);
        br5.m56161r(jArr, k);
        br5.m56157n(jArr2, jArr3, k);
        long[] c = k34.m59677c();
        br5.m56158o(k, c);
        return new cr5(c);
    }

    /* renamed from: q */
    public zl1 mo50991q(int i) {
        if (i < 1) {
            return this;
        }
        long[] c = k34.m59677c();
        br5.m56162s(this.f37194g, i, c);
        return new cr5(c);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        return mo50975a(zl1);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return (this.f37194g[0] & 1) != 0;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return k34.m59682h(this.f37194g);
    }

    /* renamed from: u */
    public zl1 mo50995u() {
        long[] c = k34.m59677c();
        br5.m56149f(this.f37194g, c);
        return new cr5(c);
    }

    /* renamed from: v */
    public boolean mo50996v() {
        return true;
    }

    /* renamed from: w */
    public int mo50997w() {
        return br5.m56163t(this.f37194g);
    }
}
