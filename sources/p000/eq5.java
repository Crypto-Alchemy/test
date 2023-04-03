package p000;

import java.math.BigInteger;
import p000.zl1;

/* renamed from: eq5 */
public class eq5 extends zl1.C9679a {

    /* renamed from: g */
    public long[] f37593g;

    public eq5() {
        this.f37593g = h34.m58434i();
    }

    public eq5(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.f37593g = dq5.m57026e(bigInteger);
    }

    public eq5(long[] jArr) {
        this.f37593g = jArr;
    }

    /* renamed from: a */
    public zl1 mo50975a(zl1 zl1) {
        long[] i = h34.m58434i();
        dq5.m57022a(this.f37593g, ((eq5) zl1).f37593g, i);
        return new eq5(i);
    }

    /* renamed from: b */
    public zl1 mo50976b() {
        long[] i = h34.m58434i();
        dq5.m57024c(this.f37593g, i);
        return new eq5(i);
    }

    /* renamed from: d */
    public zl1 mo50977d(zl1 zl1) {
        return mo50984j(zl1.mo50980g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eq5)) {
            return false;
        }
        return h34.m58439n(this.f37593g, ((eq5) obj).f37593g);
    }

    /* renamed from: f */
    public int mo50979f() {
        return 163;
    }

    /* renamed from: g */
    public zl1 mo50980g() {
        long[] i = h34.m58434i();
        dq5.m57032k(this.f37593g, i);
        return new eq5(i);
    }

    /* renamed from: h */
    public boolean mo50981h() {
        return h34.m58445t(this.f37593g);
    }

    public int hashCode() {
        return C9367tq.m72442z(this.f37593g, 0, 3) ^ 163763;
    }

    /* renamed from: i */
    public boolean mo50983i() {
        return h34.m58447v(this.f37593g);
    }

    /* renamed from: j */
    public zl1 mo50984j(zl1 zl1) {
        long[] i = h34.m58434i();
        dq5.m57033l(this.f37593g, ((eq5) zl1).f37593g, i);
        return new eq5(i);
    }

    /* renamed from: k */
    public zl1 mo50985k(zl1 zl1, zl1 zl12, zl1 zl13) {
        return mo50986l(zl1, zl12, zl13);
    }

    /* renamed from: l */
    public zl1 mo50986l(zl1 zl1, zl1 zl12, zl1 zl13) {
        long[] jArr = this.f37593g;
        long[] jArr2 = ((eq5) zl1).f37593g;
        long[] jArr3 = ((eq5) zl12).f37593g;
        long[] jArr4 = ((eq5) zl13).f37593g;
        long[] k = h34.m58436k();
        dq5.m57034m(jArr, jArr2, k);
        dq5.m57034m(jArr3, jArr4, k);
        long[] i = h34.m58434i();
        dq5.m57035n(k, i);
        return new eq5(i);
    }

    /* renamed from: m */
    public zl1 mo50987m() {
        return this;
    }

    /* renamed from: n */
    public zl1 mo50988n() {
        long[] i = h34.m58434i();
        dq5.m57036o(this.f37593g, i);
        return new eq5(i);
    }

    /* renamed from: o */
    public zl1 mo50989o() {
        long[] i = h34.m58434i();
        dq5.m57037p(this.f37593g, i);
        return new eq5(i);
    }

    /* renamed from: p */
    public zl1 mo50990p(zl1 zl1, zl1 zl12) {
        long[] jArr = this.f37593g;
        long[] jArr2 = ((eq5) zl1).f37593g;
        long[] jArr3 = ((eq5) zl12).f37593g;
        long[] k = h34.m58436k();
        dq5.m57038q(jArr, k);
        dq5.m57034m(jArr2, jArr3, k);
        long[] i = h34.m58434i();
        dq5.m57035n(k, i);
        return new eq5(i);
    }

    /* renamed from: q */
    public zl1 mo50991q(int i) {
        if (i < 1) {
            return this;
        }
        long[] i2 = h34.m58434i();
        dq5.m57039r(this.f37593g, i, i2);
        return new eq5(i2);
    }

    /* renamed from: r */
    public zl1 mo50992r(zl1 zl1) {
        return mo50975a(zl1);
    }

    /* renamed from: s */
    public boolean mo50993s() {
        return (this.f37593g[0] & 1) != 0;
    }

    /* renamed from: t */
    public BigInteger mo50994t() {
        return h34.m58425I(this.f37593g);
    }

    /* renamed from: u */
    public zl1 mo50995u() {
        long[] i = h34.m58434i();
        dq5.m57027f(this.f37593g, i);
        return new eq5(i);
    }

    /* renamed from: v */
    public boolean mo50996v() {
        return true;
    }

    /* renamed from: w */
    public int mo50997w() {
        return dq5.m57040s(this.f37593g);
    }
}
