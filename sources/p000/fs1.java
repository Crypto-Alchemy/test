package p000;

import java.math.BigInteger;

/* renamed from: fs1 */
/* compiled from: EthGetBlockTransactionCountByNumber */
public class fs1 extends ag5<String> {
    public BigInteger getTransactionCount() {
        return pc4.decodeQuantity((String) getResult());
    }
}
