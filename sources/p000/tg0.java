package p000;

import java.io.IOException;
import java.math.BigInteger;

/* renamed from: tg0 */
/* compiled from: ClientTransactionManager */
public class tg0 extends yt6 {
    private final vj7 web3j;

    public tg0(vj7 vj7, String str) {
        super(vj7, str);
        this.web3j = vj7;
    }

    public gs1 getCode(String str, x61 x61) throws IOException {
        return this.web3j.ethGetCode(str, x61).send();
    }

    public String sendCall(String str, String str2, x61 x61) throws IOException {
        tr1 send = this.web3j.ethCall(qt6.createEthCallTransaction(getFromAddress(), str, str2), x61).send();
        yt6.assertCallNotReverted(send);
        return send.getValue();
    }

    public ss1 sendTransaction(BigInteger bigInteger, BigInteger bigInteger2, String str, String str2, BigInteger bigInteger3, boolean z) throws IOException {
        return this.web3j.ethSendTransaction(new qt6(getFromAddress(), (BigInteger) null, bigInteger, bigInteger2, str, bigInteger3, str2)).send();
    }

    public ss1 sendTransactionEIP1559(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, String str2, BigInteger bigInteger4, boolean z) throws IOException {
        return this.web3j.ethSendTransaction(new qt6(getFromAddress(), (BigInteger) null, (BigInteger) null, bigInteger3, str, bigInteger4, str2, bigInteger, bigInteger2)).send();
    }

    public tg0(vj7 vj7, String str, int i, int i2) {
        super(vj7, i, (long) i2, str);
        this.web3j = vj7;
    }

    public tg0(vj7 vj7, String str, bu6 bu6) {
        super(bu6, str);
        this.web3j = vj7;
    }
}
