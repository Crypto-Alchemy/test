package p000;

import java.math.BigInteger;

/* renamed from: es1 */
/* compiled from: EthGetBlockTransactionCountByHash */
public class es1 extends ag5<String> {
    public BigInteger getTransactionCount() {
        return pc4.decodeQuantity((String) getResult());
    }
}
