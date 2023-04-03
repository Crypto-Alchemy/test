package p000;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: mm1 */
public class mm1 implements AlgorithmParameterSpec {

    /* renamed from: a */
    public ul1 f40940a;

    /* renamed from: b */
    public byte[] f40941b;

    /* renamed from: c */
    public nm1 f40942c;

    /* renamed from: d */
    public BigInteger f40943d;

    /* renamed from: e */
    public BigInteger f40944e;

    public mm1(ul1 ul1, nm1 nm1, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f40940a = ul1;
        this.f40942c = nm1.mo62725A();
        this.f40943d = bigInteger;
        this.f40944e = bigInteger2;
        this.f40941b = bArr;
    }

    /* renamed from: a */
    public ul1 mo56270a() {
        return this.f40940a;
    }

    /* renamed from: b */
    public nm1 mo56271b() {
        return this.f40942c;
    }

    /* renamed from: c */
    public BigInteger mo56272c() {
        return this.f40944e;
    }

    /* renamed from: d */
    public BigInteger mo56273d() {
        return this.f40943d;
    }

    /* renamed from: e */
    public byte[] mo56274e() {
        return this.f40941b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mm1)) {
            return false;
        }
        mm1 mm1 = (mm1) obj;
        return mo56270a().mo66315l(mm1.mo56270a()) && mo56271b().mo62735e(mm1.mo56271b());
    }

    public int hashCode() {
        return mo56270a().hashCode() ^ mo56271b().hashCode();
    }
}
