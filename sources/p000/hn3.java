package p000;

import java.io.IOException;
import java.math.BigInteger;
import org.web3j.protocol.exceptions.TransactionException;

/* renamed from: hn3 */
/* compiled from: ManagedTransaction */
public abstract class hn3 {
    public static final BigInteger GAS_PRICE = BigInteger.valueOf(22000000000L);
    public pq1 ensResolver;
    public yt6 transactionManager;
    public vj7 web3j;

    public hn3(vj7 vj7, yt6 yt6) {
        this(new pq1(vj7), vj7, yt6);
    }

    public String call(String str, String str2, x61 x61) throws IOException {
        return this.transactionManager.sendCall(str, str2, x61);
    }

    public long getSyncThreshold() {
        return this.ensResolver.getSyncThreshold();
    }

    public BigInteger requestCurrentGasPrice() throws IOException {
        return this.web3j.ethGasPrice().send().getGasPrice();
    }

    public au6 send(String str, String str2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) throws IOException, TransactionException {
        return this.transactionManager.executeTransaction(bigInteger2, bigInteger3, str, str2, bigInteger);
    }

    public au6 sendEIP1559(String str, String str2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) throws IOException, TransactionException {
        return this.transactionManager.executeTransactionEIP1559(bigInteger3, bigInteger4, bigInteger2, str, str2, bigInteger);
    }

    public void setSyncThreshold(long j) {
        this.ensResolver.setSyncThreshold(j);
    }

    public hn3(pq1 pq1, vj7 vj7, yt6 yt6) {
        this.transactionManager = yt6;
        this.ensResolver = pq1;
        this.web3j = vj7;
    }

    public au6 send(String str, String str2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, boolean z) throws IOException, TransactionException {
        return this.transactionManager.executeTransaction(bigInteger2, bigInteger3, str, str2, bigInteger, z);
    }
}
