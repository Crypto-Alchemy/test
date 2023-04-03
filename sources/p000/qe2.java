package p000;

import java.math.BigInteger;

/* renamed from: qe2 */
public class qe2 extends C6965d6 {

    /* renamed from: a */
    public final ul1 f44185a;

    /* renamed from: b */
    public final pe2 f44186b;

    public qe2(ul1 ul1, pe2 pe2) {
        if (ul1 == null || ul1.mo66323w() == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.f44185a = ul1;
        this.f44186b = pe2;
    }

    /* renamed from: c */
    public nm1 mo51131c(nm1 nm1, BigInteger bigInteger) {
        if (this.f44185a.mo66315l(nm1.mo62740i())) {
            BigInteger[] c = this.f44186b.mo65295c(bigInteger.mod(nm1.mo62740i().mo66323w()));
            BigInteger bigInteger2 = c[0];
            BigInteger bigInteger3 = c[1];
            return this.f44186b.mo65636a() ? sl1.m71964c(this.f44186b, nm1, bigInteger2, bigInteger3) : sl1.m71965d(nm1, bigInteger2, zp1.m75181c(this.f44186b, nm1), bigInteger3);
        }
        throw new IllegalStateException();
    }
}
