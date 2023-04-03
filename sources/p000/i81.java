package p000;

import java.math.BigInteger;

/* renamed from: i81 */
/* compiled from: DefaultGasProvider */
public class i81 extends h96 {
    public static final BigInteger GAS_LIMIT = BigInteger.valueOf(9000000);
    public static final BigInteger GAS_PRICE = BigInteger.valueOf(4100000000L);

    public i81() {
        super(GAS_PRICE, GAS_LIMIT);
    }
}
