package p000;

import java.math.BigInteger;

/* renamed from: a11 */
public class a11 implements we0 {

    /* renamed from: a */
    public BigInteger f36342a;

    /* renamed from: d */
    public BigInteger f36343d;

    /* renamed from: e */
    public BigInteger f36344e;

    /* renamed from: g */
    public b11 f36345g;

    public a11(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, b11 b11) {
        this.f36342a = bigInteger3;
        this.f36344e = bigInteger;
        this.f36343d = bigInteger2;
        this.f36345g = b11;
    }

    /* renamed from: a */
    public BigInteger mo50033a() {
        return this.f36342a;
    }

    /* renamed from: b */
    public BigInteger mo50034b() {
        return this.f36344e;
    }

    /* renamed from: c */
    public BigInteger mo50035c() {
        return this.f36343d;
    }

    /* renamed from: d */
    public b11 mo50036d() {
        return this.f36345g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a11)) {
            return false;
        }
        a11 a11 = (a11) obj;
        return a11.mo50034b().equals(this.f36344e) && a11.mo50035c().equals(this.f36343d) && a11.mo50033a().equals(this.f36342a);
    }

    public int hashCode() {
        return (mo50034b().hashCode() ^ mo50035c().hashCode()) ^ mo50033a().hashCode();
    }
}
