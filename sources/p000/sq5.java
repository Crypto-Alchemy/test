package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: sq5 */
public class sq5 extends zl1.C9679a {

    /* renamed from: g */
    public long[] f44596g;

    public sq5() {
        this.f44596g = j34.m59225j();
    }

    public sq5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        this.f44596g = rq5.m71643e(bigInteger);
    }

    public sq5(long[] jArr) {
        this.f44596g = jArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        long[] j = j34.m59225j();
        rq5.m71639a(this.f44596g, ((sq5) zl1).f44596g, j);
        return new sq5(j);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        long[] j = j34.m59225j();
        rq5.m71641c(this.f44596g, j);
        return new sq5(j);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        return mo50984j(zl1.mo50980g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sq5)) {
            return false;
        }
        return j34.m59230o(this.f44596g, ((sq5) obj).f44596g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return 233;
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        long[] j = j34.m59225j();
        rq5.m71650l(this.f44596g, j);
        return new sq5(j);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return j34.m59236u(this.f44596g);
    }

    public int hashCode() {
        return C9367tq.m72442z(this.f44596g, 0, 4) ^ 2330074;
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return j34.m59238w(this.f44596g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        long[] j = j34.m59225j();
        rq5.m71651m(this.f44596g, ((sq5) zl1).f44596g, j);
        return new sq5(j);
    }

    /* renamed from: k */
    public zl1 mo50985k(zl1 zl1, zl1 zl12, zl1 zl13) {
        return mo50986l(zl1, zl12, zl13);
    }

    /* renamed from: l */
    public zl1 mo50986l(zl1 zl1, zl1 zl12, zl1 zl13) {
        long[] jArr = this.f44596g;
        long[] jArr2 = ((sq5) zl1).f44596g;
        long[] jArr3 = ((sq5) zl12).f44596g;
        long[] jArr4 = ((sq5) zl13).f44596g;
        long[] l = j34.m59227l();
        rq5.m71652n(jArr, jArr2, l);
        rq5.m71652n(jArr3, jArr4, l);
        long[] j = j34.m59225j();
        rq5.m71653o(l, j);
        return new sq5(j);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        return this;
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        long[] j = j34.m59225j();
        rq5.m71654p(this.f44596g, j);
        return new sq5(j);
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        long[] j = j34.m59225j();
        rq5.m71655q(this.f44596g, j);
        return new sq5(j);
    }

    /* renamed from: p */
    public zl1 mo50990p(zl1 zl1, zl1 zl12) {
        long[] jArr = this.f44596g;
        long[] jArr2 = ((sq5) zl1).f44596g;
        long[] jArr3 = ((sq5) zl12).f44596g;
        long[] l = j34.m59227l();
        rq5.m71656r(jArr, l);
        rq5.m71652n(jArr2, jArr3, l);
        long[] j = j34.m59225j();
        rq5.m71653o(l, j);
        return new sq5(j);
    }

    /* renamed from: q */
    public zl1 mo50991q(int i) {
        if (i < 1) {
            return this;
        }
        long[] j = j34.m59225j();
        rq5.m71657s(this.f44596g, i, j);
        return new sq5(j);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        return mo50975a(zl1);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return (this.f44596g[0] & 1) != 0;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return j34.m59215K(this.f44596g);
    }

    /* renamed from: u */
    public zl1 mo50995u() {
        long[] j = j34.m59225j();
        rq5.m71644f(this.f44596g, j);
        return new sq5(j);
    }

    /* renamed from: v */
    public boolean mo50996v() {
        return true;
    }

    /* renamed from: w */
    public int mo50997w() {
        return rq5.m71658t(this.f44596g);
    }
}
