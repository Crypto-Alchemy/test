package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: yq5 */
public class yq5 extends zl1.C9679a {

    /* renamed from: g */
    public long[] f46263g;

    public yq5() {
        this.f46263g = j34.m59225j();
    }

    public yq5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        this.f46263g = xq5.m74085e(bigInteger);
    }

    public yq5(long[] jArr) {
        this.f46263g = jArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        long[] j = j34.m59225j();
        xq5.m74081a(this.f46263g, ((yq5) zl1).f46263g, j);
        return new yq5(j);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        long[] j = j34.m59225j();
        xq5.m74083c(this.f46263g, j);
        return new yq5(j);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        return mo50984j(zl1.mo50980g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yq5)) {
            return false;
        }
        return j34.m59230o(this.f46263g, ((yq5) obj).f46263g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return 239;
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        long[] j = j34.m59225j();
        xq5.m74092l(this.f46263g, j);
        return new yq5(j);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return j34.m59236u(this.f46263g);
    }

    public int hashCode() {
        return C9367tq.m72442z(this.f46263g, 0, 4) ^ 23900158;
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return j34.m59238w(this.f46263g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        long[] j = j34.m59225j();
        xq5.m74093m(this.f46263g, ((yq5) zl1).f46263g, j);
        return new yq5(j);
    }

    /* renamed from: k */
    public zl1 mo50985k(zl1 zl1, zl1 zl12, zl1 zl13) {
        return mo50986l(zl1, zl12, zl13);
    }

    /* renamed from: l */
    public zl1 mo50986l(zl1 zl1, zl1 zl12, zl1 zl13) {
        long[] jArr = this.f46263g;
        long[] jArr2 = ((yq5) zl1).f46263g;
        long[] jArr3 = ((yq5) zl12).f46263g;
        long[] jArr4 = ((yq5) zl13).f46263g;
        long[] l = j34.m59227l();
        xq5.m74094n(jArr, jArr2, l);
        xq5.m74094n(jArr3, jArr4, l);
        long[] j = j34.m59225j();
        xq5.m74095o(l, j);
        return new yq5(j);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        return this;
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        long[] j = j34.m59225j();
        xq5.m74096p(this.f46263g, j);
        return new yq5(j);
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        long[] j = j34.m59225j();
        xq5.m74097q(this.f46263g, j);
        return new yq5(j);
    }

    /* renamed from: p */
    public zl1 mo50990p(zl1 zl1, zl1 zl12) {
        long[] jArr = this.f46263g;
        long[] jArr2 = ((yq5) zl1).f46263g;
        long[] jArr3 = ((yq5) zl12).f46263g;
        long[] l = j34.m59227l();
        xq5.m74098r(jArr, l);
        xq5.m74094n(jArr2, jArr3, l);
        long[] j = j34.m59225j();
        xq5.m74095o(l, j);
        return new yq5(j);
    }

    /* renamed from: q */
    public zl1 mo50991q(int i) {
        if (i < 1) {
            return this;
        }
        long[] j = j34.m59225j();
        xq5.m74099s(this.f46263g, i, j);
        return new yq5(j);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        return mo50975a(zl1);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return (this.f46263g[0] & 1) != 0;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return j34.m59215K(this.f46263g);
    }

    /* renamed from: u */
    public zl1 mo50995u() {
        long[] j = j34.m59225j();
        xq5.m74086f(this.f46263g, j);
        return new yq5(j);
    }

    /* renamed from: v */
    public boolean mo50996v() {
        return true;
    }

    /* renamed from: w */
    public int mo50997w() {
        return xq5.m74100t(this.f46263g);
    }
}
