package p000;

import java.io.IOException;
import org.web3j.protocol.exceptions.TransactionException;

/* renamed from: bu6 */
/* compiled from: TransactionReceiptProcessor */
public abstract class bu6 {
    private final vj7 web3j;

    public bu6(vj7 vj7) {
        this.web3j = vj7;
    }

    public qi4<? extends au6> sendTransactionReceiptRequest(String str) throws IOException, TransactionException {
        ks1 send = this.web3j.ethGetTransactionReceipt(str).send();
        if (!send.hasError()) {
            return send.getTransactionReceipt();
        }
        throw new TransactionException("Error processing request: " + send.getError().getMessage());
    }

    public abstract au6 waitForTransactionReceipt(String str) throws IOException, TransactionException;
}
