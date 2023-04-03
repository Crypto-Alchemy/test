package p000;

import java.math.BigInteger;

/* renamed from: l01 */
public class l01 implements we0 {

    /* renamed from: a */
    public BigInteger f40551a;

    /* renamed from: d */
    public BigInteger f40552d;

    /* renamed from: e */
    public BigInteger f40553e;

    /* renamed from: g */
    public BigInteger f40554g;

    /* renamed from: k */
    public int f40555k;

    /* renamed from: r */
    public int f40556r;

    /* renamed from: s */
    public m01 f40557s;

    public l01(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, m01 m01) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            } else if (i2 < i) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i <= bigInteger.bitLength() || bx4.m56192b("org.bouncycastle.dh.allow_unsafe_p_value")) {
            this.f40551a = bigInteger2;
            this.f40552d = bigInteger;
            this.f40553e = bigInteger3;
            this.f40555k = i;
            this.f40556r = i2;
            this.f40554g = bigInteger4;
            this.f40557s = m01;
            return;
        }
        throw new IllegalArgumentException("unsafe p value so small specific l required");
    }

    /* renamed from: a */
    public BigInteger mo55796a() {
        return this.f40551a;
    }

    /* renamed from: b */
    public BigInteger mo55797b() {
        return this.f40552d;
    }

    /* renamed from: c */
    public BigInteger mo55798c() {
        return this.f40553e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l01)) {
            return false;
        }
        l01 l01 = (l01) obj;
        if (mo55798c() != null) {
            if (!mo55798c().equals(l01.mo55798c())) {
                return false;
            }
        } else if (l01.mo55798c() != null) {
            return false;
        }
        return l01.mo55797b().equals(this.f40552d) && l01.mo55796a().equals(this.f40551a);
    }

    public int hashCode() {
        return (mo55797b().hashCode() ^ mo55796a().hashCode()) ^ (mo55798c() != null ? mo55798c().hashCode() : 0);
    }
}
