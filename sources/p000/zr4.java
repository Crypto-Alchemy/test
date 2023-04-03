package p000;

import java.io.IOException;
import org.web3j.protocol.exceptions.TransactionException;

/* renamed from: zr4 */
/* compiled from: PollingTransactionReceiptProcessor */
public class zr4 extends bu6 {
    public final int attempts;
    public final long sleepDuration;

    public zr4(vj7 vj7, long j, int i) {
        super(vj7);
        this.sleepDuration = j;
        this.attempts = i;
    }

    private au6 getTransactionReceipt(String str, long j, int i) throws IOException, TransactionException {
        qi4<? extends au6> sendTransactionReceiptRequest = sendTransactionReceiptRequest(str);
        int i2 = 0;
        while (i2 < i) {
            if (sendTransactionReceiptRequest.mo47120c()) {
                return (au6) sendTransactionReceiptRequest.mo47119b();
            }
            try {
                Thread.sleep(j);
                sendTransactionReceiptRequest = sendTransactionReceiptRequest(str);
                i2++;
            } catch (InterruptedException e) {
                throw new TransactionException((Throwable) e);
            }
        }
        throw new TransactionException("Transaction receipt was not generated after " + ((j * ((long) i)) / 1000) + " seconds for transaction: " + str, str);
    }

    public au6 waitForTransactionReceipt(String str) throws IOException, TransactionException {
        return getTransactionReceipt(str, this.sleepDuration, this.attempts);
    }
}
