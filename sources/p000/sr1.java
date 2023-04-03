package p000;

import java.math.BigInteger;

/* renamed from: sr1 */
/* compiled from: EthBlockNumber */
public class sr1 extends ag5<String> {
    public BigInteger getBlockNumber() {
        return pc4.decodeQuantity((String) getResult());
    }
}
