package p000;

import java.math.BigInteger;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* renamed from: im1 */
public class im1 extends ECParameterSpec {

    /* renamed from: a */
    public String f38410a;

    public im1(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super(ellipticCurve, eCPoint, bigInteger, bigInteger2.intValue());
        this.f38410a = str;
    }

    /* renamed from: a */
    public String mo52498a() {
        return this.f38410a;
    }
}
