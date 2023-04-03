package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: ir5 */
public class ir5 extends zl1.C9679a {

    /* renamed from: g */
    public long[] f38513g;

    public ir5() {
        this.f38513g = m34.m64062c();
    }

    public ir5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.f38513g = hr5.m58669e(bigInteger);
    }

    public ir5(long[] jArr) {
        this.f38513g = jArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        long[] c = m34.m64062c();
        hr5.m58665a(this.f38513g, ((ir5) zl1).f38513g, c);
        return new ir5(c);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        long[] c = m34.m64062c();
        hr5.m58667c(this.f38513g, c);
        return new ir5(c);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        return mo50984j(zl1.mo50980g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ir5)) {
            return false;
        }
        return m34.m64064e(this.f38513g, ((ir5) obj).f38513g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return 409;
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        long[] c = m34.m64062c();
        hr5.m58676l(this.f38513g, c);
        return new ir5(c);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return m34.m64065f(this.f38513g);
    }

    public int hashCode() {
        return C9367tq.m72442z(this.f38513g, 0, 7) ^ 4090087;
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return m34.m64066g(this.f38513g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        long[] c = m34.m64062c();
        hr5.m58677m(this.f38513g, ((ir5) zl1).f38513g, c);
        return new ir5(c);
    }

    /* renamed from: k */
    public zl1 mo50985k(zl1 zl1, zl1 zl12, zl1 zl13) {
        return mo50986l(zl1, zl12, zl13);
    }

    /* renamed from: l */
    public zl1 mo50986l(zl1 zl1, zl1 zl12, zl1 zl13) {
        long[] jArr = this.f38513g;
        long[] jArr2 = ((ir5) zl1).f38513g;
        long[] jArr3 = ((ir5) zl12).f38513g;
        long[] jArr4 = ((ir5) zl13).f38513g;
        long[] k = p34.m70887k(13);
        hr5.m58678n(jArr, jArr2, k);
        hr5.m58678n(jArr3, jArr4, k);
        long[] c = m34.m64062c();
        hr5.m58679o(k, c);
        return new ir5(c);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        return this;
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        long[] c = m34.m64062c();
        hr5.m58680p(this.f38513g, c);
        return new ir5(c);
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        long[] c = m34.m64062c();
        hr5.m58681q(this.f38513g, c);
        return new ir5(c);
    }

    /* renamed from: p */
    public zl1 mo50990p(zl1 zl1, zl1 zl12) {
        long[] jArr = this.f38513g;
        long[] jArr2 = ((ir5) zl1).f38513g;
        long[] jArr3 = ((ir5) zl12).f38513g;
        long[] k = p34.m70887k(13);
        hr5.m58682r(jArr, k);
        hr5.m58678n(jArr2, jArr3, k);
        long[] c = m34.m64062c();
        hr5.m58679o(k, c);
        return new ir5(c);
    }

    /* renamed from: q */
    public zl1 mo50991q(int i) {
        if (i < 1) {
            return this;
        }
        long[] c = m34.m64062c();
        hr5.m58683s(this.f38513g, i, c);
        return new ir5(c);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        return mo50975a(zl1);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return (this.f38513g[0] & 1) != 0;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return m34.m64067h(this.f38513g);
    }

    /* renamed from: u */
    public zl1 mo50995u() {
        long[] c = m34.m64062c();
        hr5.m58670f(this.f38513g, c);
        return new ir5(c);
    }

    /* renamed from: v */
    public boolean mo50996v() {
        return true;
    }

    /* renamed from: w */
    public int mo50997w() {
        return hr5.m58684t(this.f38513g);
    }
}
