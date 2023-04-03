package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: sp5 */
public class sp5 extends zl1.C9679a {

    /* renamed from: g */
    public long[] f44591g;

    public sp5() {
        this.f44591g = f34.m57568g();
    }

    public sp5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.f44591g = rp5.m71624e(bigInteger);
    }

    public sp5(long[] jArr) {
        this.f44591g = jArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        long[] g = f34.m57568g();
        rp5.m71620a(this.f44591g, ((sp5) zl1).f44591g, g);
        return new sp5(g);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        long[] g = f34.m57568g();
        rp5.m71622c(this.f44591g, g);
        return new sp5(g);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        return mo50984j(zl1.mo50980g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sp5)) {
            return false;
        }
        return f34.m57572k(this.f44591g, ((sp5) obj).f44591g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return 113;
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        long[] g = f34.m57568g();
        rp5.m71629j(this.f44591g, g);
        return new sp5(g);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return f34.m57577p(this.f44591g);
    }

    public int hashCode() {
        return C9367tq.m72442z(this.f44591g, 0, 2) ^ 113009;
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return f34.m57579r(this.f44591g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        long[] g = f34.m57568g();
        rp5.m71630k(this.f44591g, ((sp5) zl1).f44591g, g);
        return new sp5(g);
    }

    /* renamed from: k */
    public zl1 mo50985k(zl1 zl1, zl1 zl12, zl1 zl13) {
        return mo50986l(zl1, zl12, zl13);
    }

    /* renamed from: l */
    public zl1 mo50986l(zl1 zl1, zl1 zl12, zl1 zl13) {
        long[] jArr = this.f44591g;
        long[] jArr2 = ((sp5) zl1).f44591g;
        long[] jArr3 = ((sp5) zl12).f44591g;
        long[] jArr4 = ((sp5) zl13).f44591g;
        long[] i = f34.m57570i();
        rp5.m71631l(jArr, jArr2, i);
        rp5.m71631l(jArr3, jArr4, i);
        long[] g = f34.m57568g();
        rp5.m71632m(i, g);
        return new sp5(g);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        return this;
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        long[] g = f34.m57568g();
        rp5.m71633n(this.f44591g, g);
        return new sp5(g);
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        long[] g = f34.m57568g();
        rp5.m71634o(this.f44591g, g);
        return new sp5(g);
    }

    /* renamed from: p */
    public zl1 mo50990p(zl1 zl1, zl1 zl12) {
        long[] jArr = this.f44591g;
        long[] jArr2 = ((sp5) zl1).f44591g;
        long[] jArr3 = ((sp5) zl12).f44591g;
        long[] i = f34.m57570i();
        rp5.m71635p(jArr, i);
        rp5.m71631l(jArr2, jArr3, i);
        long[] g = f34.m57568g();
        rp5.m71632m(i, g);
        return new sp5(g);
    }

    /* renamed from: q */
    public zl1 mo50991q(int i) {
        if (i < 1) {
            return this;
        }
        long[] g = f34.m57568g();
        rp5.m71636q(this.f44591g, i, g);
        return new sp5(g);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        return mo50975a(zl1);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return (this.f44591g[0] & 1) != 0;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return f34.m57586y(this.f44591g);
    }

    /* renamed from: u */
    public zl1 mo50995u() {
        long[] g = f34.m57568g();
        rp5.m71625f(this.f44591g, g);
        return new sp5(g);
    }

    /* renamed from: v */
    public boolean mo50996v() {
        return true;
    }

    /* renamed from: w */
    public int mo50997w() {
        return rp5.m71637r(this.f44591g);
    }
}
