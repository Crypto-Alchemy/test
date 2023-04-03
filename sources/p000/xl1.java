package p000;

import java.math.BigInteger;

/* renamed from: xl1 */
public class xl1 implements tl1 {

    /* renamed from: g */
    public final ul1 f45960g;

    /* renamed from: h */
    public final byte[] f45961h;

    /* renamed from: i */
    public final nm1 f45962i;

    /* renamed from: j */
    public final BigInteger f45963j;

    /* renamed from: k */
    public final BigInteger f45964k;

    /* renamed from: l */
    public BigInteger f45965l;

    public xl1(co7 co7) {
        this(co7.mo50929r(), co7.mo50930s(), co7.mo50932w(), co7.mo50931t(), co7.mo50928A());
    }

    public xl1(ul1 ul1, nm1 nm1, BigInteger bigInteger, BigInteger bigInteger2) {
        this(ul1, nm1, bigInteger, bigInteger2, (byte[]) null);
    }

    public xl1(ul1 ul1, nm1 nm1, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f45965l = null;
        if (ul1 == null) {
            throw new NullPointerException("curve");
        } else if (bigInteger != null) {
            this.f45960g = ul1;
            this.f45962i = m73983g(ul1, nm1);
            this.f45963j = bigInteger;
            this.f45964k = bigInteger2;
            this.f45961h = C9367tq.m72422f(bArr);
        } else {
            throw new NullPointerException("n");
        }
    }

    /* renamed from: g */
    public static nm1 m73983g(ul1 ul1, nm1 nm1) {
        if (nm1 != null) {
            nm1 A = sl1.m71971j(ul1, nm1).mo62725A();
            if (A.mo62751u()) {
                throw new IllegalArgumentException("Point at infinity");
            } else if (A.mo62753w()) {
                return A;
            } else {
                throw new IllegalArgumentException("Point not on curve");
            }
        } else {
            throw new NullPointerException("Point cannot be null");
        }
    }

    /* renamed from: a */
    public ul1 mo66881a() {
        return this.f45960g;
    }

    /* renamed from: b */
    public nm1 mo66882b() {
        return this.f45962i;
    }

    /* renamed from: c */
    public BigInteger mo66883c() {
        return this.f45964k;
    }

    /* renamed from: d */
    public BigInteger mo66884d() {
        return this.f45963j;
    }

    /* renamed from: e */
    public byte[] mo66885e() {
        return C9367tq.m72422f(this.f45961h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl1)) {
            return false;
        }
        xl1 xl1 = (xl1) obj;
        return this.f45960g.mo66315l(xl1.f45960g) && this.f45962i.mo62735e(xl1.f45962i) && this.f45963j.equals(xl1.f45963j);
    }

    /* renamed from: f */
    public BigInteger mo66887f(BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new NullPointerException("Scalar cannot be null");
        } else if (bigInteger.compareTo(tl1.f44772b) >= 0 && bigInteger.compareTo(mo66884d()) < 0) {
            return bigInteger;
        } else {
            throw new IllegalArgumentException("Scalar is not in the interval [1, n - 1]");
        }
    }

    /* renamed from: h */
    public nm1 mo66888h(nm1 nm1) {
        return m73983g(mo66881a(), nm1);
    }

    public int hashCode() {
        return ((((this.f45960g.hashCode() ^ 1028) * 257) ^ this.f45962i.hashCode()) * 257) ^ this.f45963j.hashCode();
    }
}
