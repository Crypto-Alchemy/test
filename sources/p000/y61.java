package p000;

import java.math.BigInteger;

/* renamed from: y61 */
/* compiled from: DefaultBlockParameterNumber */
public class y61 implements x61 {
    private BigInteger blockNumber;

    public y61(BigInteger bigInteger) {
        this.blockNumber = bigInteger;
    }

    public BigInteger getBlockNumber() {
        return this.blockNumber;
    }

    @k73
    public String getValue() {
        return pc4.encodeQuantity(this.blockNumber);
    }

    public y61(long j) {
        this(BigInteger.valueOf(j));
    }
}
