package p000;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* renamed from: h10 */
/* compiled from: BigIntegerMath */
public final class h10 {

    /* renamed from: a */
    public static final BigInteger f29413a = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* renamed from: b */
    public static final double f29414b = Math.log(10.0d);

    /* renamed from: c */
    public static final double f29415c = Math.log(2.0d);

    /* renamed from: a */
    public static BigInteger m45007a(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }
}
