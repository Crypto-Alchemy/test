package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: or5 */
public class or5 extends zl1.C9679a {

    /* renamed from: g */
    public long[] f43756g;

    public or5() {
        this.f43756g = o34.m70127c();
    }

    public or5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.f43756g = nr5.m70053h(bigInteger);
    }

    public or5(long[] jArr) {
        this.f43756g = jArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        long[] c = o34.m70127c();
        nr5.m70047b(this.f43756g, ((or5) zl1).f43756g, c);
        return new or5(c);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        long[] c = o34.m70127c();
        nr5.m70051f(this.f43756g, c);
        return new or5(c);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        return mo50984j(zl1.mo50980g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof or5)) {
            return false;
        }
        return o34.m70129e(this.f43756g, ((or5) obj).f43756g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return 571;
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        long[] c = o34.m70127c();
        nr5.m70059n(this.f43756g, c);
        return new or5(c);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return o34.m70130f(this.f43756g);
    }

    public int hashCode() {
        return C9367tq.m72442z(this.f43756g, 0, 9) ^ 5711052;
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return o34.m70131g(this.f43756g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        long[] c = o34.m70127c();
        nr5.m70060o(this.f43756g, ((or5) zl1).f43756g, c);
        return new or5(c);
    }

    /* renamed from: k */
    public zl1 mo50985k(zl1 zl1, zl1 zl12, zl1 zl13) {
        return mo50986l(zl1, zl12, zl13);
    }

    /* renamed from: l */
    public zl1 mo50986l(zl1 zl1, zl1 zl12, zl1 zl13) {
        long[] jArr = this.f43756g;
        long[] jArr2 = ((or5) zl1).f43756g;
        long[] jArr3 = ((or5) zl12).f43756g;
        long[] jArr4 = ((or5) zl13).f43756g;
        long[] d = o34.m70128d();
        nr5.m70061p(jArr, jArr2, d);
        nr5.m70061p(jArr3, jArr4, d);
        long[] c = o34.m70127c();
        nr5.m70065t(d, c);
        return new or5(c);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        return this;
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        long[] c = o34.m70127c();
        nr5.m70067v(this.f43756g, c);
        return new or5(c);
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        long[] c = o34.m70127c();
        nr5.m70068w(this.f43756g, c);
        return new or5(c);
    }

    /* renamed from: p */
    public zl1 mo50990p(zl1 zl1, zl1 zl12) {
        long[] jArr = this.f43756g;
        long[] jArr2 = ((or5) zl1).f43756g;
        long[] jArr3 = ((or5) zl12).f43756g;
        long[] d = o34.m70128d();
        nr5.m70069x(jArr, d);
        nr5.m70061p(jArr2, jArr3, d);
        long[] c = o34.m70127c();
        nr5.m70065t(d, c);
        return new or5(c);
    }

    /* renamed from: q */
    public zl1 mo50991q(int i) {
        if (i < 1) {
            return this;
        }
        long[] c = o34.m70127c();
        nr5.m70070y(this.f43756g, i, c);
        return new or5(c);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        return mo50975a(zl1);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return (this.f43756g[0] & 1) != 0;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return o34.m70132h(this.f43756g);
    }

    /* renamed from: u */
    public zl1 mo50995u() {
        long[] c = o34.m70127c();
        nr5.m70054i(this.f43756g, c);
        return new or5(c);
    }

    /* renamed from: v */
    public boolean mo50996v() {
        return true;
    }

    /* renamed from: w */
    public int mo50997w() {
        return nr5.m70071z(this.f43756g);
    }
}
