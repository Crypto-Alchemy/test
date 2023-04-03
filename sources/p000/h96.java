package p000;

import java.math.BigInteger;

/* renamed from: h96 */
/* compiled from: StaticGasProvider */
public class h96 implements it0 {
    private BigInteger gasLimit;
    private BigInteger gasPrice;

    public h96(BigInteger bigInteger, BigInteger bigInteger2) {
        this.gasPrice = bigInteger;
        this.gasLimit = bigInteger2;
    }

    public BigInteger getGasLimit(String str) {
        return this.gasLimit;
    }

    public BigInteger getGasPrice(String str) {
        return this.gasPrice;
    }

    public BigInteger getGasLimit() {
        return this.gasLimit;
    }

    public BigInteger getGasPrice() {
        return this.gasPrice;
    }
}
