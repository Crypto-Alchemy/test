package p000;

import java.io.IOException;
import java.math.BigInteger;
import org.web3j.p025tx.exceptions.ContractCallException;
import org.web3j.protocol.exceptions.TransactionException;

/* renamed from: yt6 */
/* compiled from: TransactionManager */
public abstract class yt6 {
    public static final int DEFAULT_POLLING_ATTEMPTS_PER_TX_HASH = 40;
    public static final long DEFAULT_POLLING_FREQUENCY = 15000;
    public static final String REVERT_ERR_STR = "Contract Call has been reverted by the EVM with the reason: '%s'.";
    private final String fromAddress;
    private final bu6 transactionReceiptProcessor;

    public yt6(bu6 bu6, String str) {
        this.transactionReceiptProcessor = bu6;
        this.fromAddress = str;
    }

    public static void assertCallNotReverted(tr1 tr1) {
        if (tr1.isReverted()) {
            throw new ContractCallException(String.format(REVERT_ERR_STR, new Object[]{tr1.getRevertReason()}));
        }
    }

    private au6 processResponse(ss1 ss1) throws IOException, TransactionException {
        if (!ss1.hasError()) {
            return this.transactionReceiptProcessor.waitForTransactionReceipt(ss1.getTransactionHash());
        }
        throw new RuntimeException("Error processing transaction request: " + ss1.getError().getMessage());
    }

    public au6 executeTransaction(BigInteger bigInteger, BigInteger bigInteger2, String str, String str2, BigInteger bigInteger3) throws IOException, TransactionException {
        return executeTransaction(bigInteger, bigInteger2, str, str2, bigInteger3, false);
    }

    public au6 executeTransactionEIP1559(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, String str2, BigInteger bigInteger4) throws IOException, TransactionException {
        return executeTransactionEIP1559(bigInteger, bigInteger2, bigInteger3, str, str2, bigInteger4, false);
    }

    public abstract gs1 getCode(String str, x61 x61) throws IOException;

    public String getFromAddress() {
        return this.fromAddress;
    }

    public abstract String sendCall(String str, String str2, x61 x61) throws IOException;

    public ss1 sendTransaction(BigInteger bigInteger, BigInteger bigInteger2, String str, String str2, BigInteger bigInteger3) throws IOException {
        return sendTransaction(bigInteger, bigInteger2, str, str2, bigInteger3, false);
    }

    public abstract ss1 sendTransaction(BigInteger bigInteger, BigInteger bigInteger2, String str, String str2, BigInteger bigInteger3, boolean z) throws IOException;

    public ss1 sendTransactionEIP1559(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, String str2, BigInteger bigInteger4) throws IOException {
        return sendTransactionEIP1559(bigInteger, bigInteger2, bigInteger3, str, str2, bigInteger4, false);
    }

    public abstract ss1 sendTransactionEIP1559(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, String str2, BigInteger bigInteger4, boolean z) throws IOException;

    public au6 executeTransaction(BigInteger bigInteger, BigInteger bigInteger2, String str, String str2, BigInteger bigInteger3, boolean z) throws IOException, TransactionException {
        return processResponse(sendTransaction(bigInteger, bigInteger2, str, str2, bigInteger3, z));
    }

    public au6 executeTransactionEIP1559(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, String str2, BigInteger bigInteger4, boolean z) throws IOException, TransactionException {
        return processResponse(sendTransactionEIP1559(bigInteger, bigInteger2, bigInteger3, str, str2, bigInteger4, z));
    }

    public yt6(vj7 vj7, String str) {
        this((bu6) new zr4(vj7, DEFAULT_POLLING_FREQUENCY, 40), str);
    }

    public yt6(vj7 vj7, int i, long j, String str) {
        this((bu6) new zr4(vj7, j, i), str);
    }
}
