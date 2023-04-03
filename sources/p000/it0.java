package p000;

import java.math.BigInteger;

/* renamed from: it0 */
/* compiled from: ContractGasProvider */
public interface it0 {
    @Deprecated
    BigInteger getGasLimit();

    BigInteger getGasLimit(String str);

    @Deprecated
    BigInteger getGasPrice();

    BigInteger getGasPrice(String str);
}
