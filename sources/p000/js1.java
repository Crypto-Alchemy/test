package p000;

import java.math.BigInteger;

/* renamed from: js1 */
/* compiled from: EthGetTransactionCount */
public class js1 extends ag5<String> {
    public BigInteger getTransactionCount() {
        return pc4.decodeQuantity((String) getResult());
    }
}
