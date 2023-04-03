package p000;

import java.io.IOException;
import java.math.BigInteger;
import org.web3j.p025tx.exceptions.TxHashMismatchException;
import org.web3j.protocol.core.DefaultBlockParameterName;

/* renamed from: i75 */
/* compiled from: RawTransactionManager */
public class i75 extends yt6 {
    private final long chainId;
    public final cw0 credentials;
    public cz6 txHashVerifier;
    private final vj7 web3j;

    public i75(vj7 vj7, cw0 cw0, long j) {
        super(vj7, cw0.getAddress());
        this.txHashVerifier = new cz6();
        this.web3j = vj7;
        this.credentials = cw0;
        this.chainId = j;
    }

    public gs1 getCode(String str, x61 x61) throws IOException {
        return this.web3j.ethGetCode(str, x61).send();
    }

    public BigInteger getNonce() throws IOException {
        return this.web3j.ethGetTransactionCount(this.credentials.getAddress(), DefaultBlockParameterName.PENDING).send().getTransactionCount();
    }

    public cz6 getTxHashVerifier() {
        return this.txHashVerifier;
    }

    public String sendCall(String str, String str2, x61 x61) throws IOException {
        tr1 send = this.web3j.ethCall(qt6.createEthCallTransaction(getFromAddress(), str, str2), x61).send();
        yt6.assertCallNotReverted(send);
        return send.getValue();
    }

    public ss1 sendTransaction(BigInteger bigInteger, BigInteger bigInteger2, String str, String str2, BigInteger bigInteger3, boolean z) throws IOException {
        return signAndSend(h75.createTransaction(getNonce(), bigInteger, bigInteger2, str, bigInteger3, str2));
    }

    public ss1 sendTransactionEIP1559(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, String str2, BigInteger bigInteger4, boolean z) throws IOException {
        return signAndSend(h75.createTransaction(getNonce(), (BigInteger) null, bigInteger3, str, bigInteger4, str2, bigInteger, bigInteger2));
    }

    public void setTxHashVerifier(cz6 cz6) {
        this.txHashVerifier = cz6;
    }

    public String sign(h75 h75) {
        byte[] bArr;
        long j = this.chainId;
        if (j > -1) {
            bArr = vt6.signMessage(h75, j, this.credentials);
        } else {
            bArr = vt6.signMessage(h75, this.credentials);
        }
        return pc4.toHexString(bArr);
    }

    public ss1 signAndSend(h75 h75) throws IOException {
        String sign = sign(h75);
        ss1 send = this.web3j.ethSendRawTransaction(sign).send();
        if (send != null && !send.hasError()) {
            String sha3 = jl2.sha3(sign);
            String transactionHash = send.getTransactionHash();
            if (!this.txHashVerifier.verify(sha3, transactionHash)) {
                throw new TxHashMismatchException(sha3, transactionHash);
            }
        }
        return send;
    }

    public i75(vj7 vj7, cw0 cw0, long j, bu6 bu6) {
        super(bu6, cw0.getAddress());
        this.txHashVerifier = new cz6();
        this.web3j = vj7;
        this.credentials = cw0;
        this.chainId = j;
    }

    public i75(vj7 vj7, cw0 cw0, long j, int i, long j2) {
        super(vj7, i, j2, cw0.getAddress());
        this.txHashVerifier = new cz6();
        this.web3j = vj7;
        this.credentials = cw0;
        this.chainId = j;
    }

    public i75(vj7 vj7, cw0 cw0) {
        this(vj7, cw0, -1);
    }

    public i75(vj7 vj7, cw0 cw0, int i, int i2) {
        this(vj7, cw0, -1, i, (long) i2);
    }
}
