package p000;

import java.math.BigInteger;
import org.web3j.crypto.transaction.type.TransactionType;

/* renamed from: h75 */
/* compiled from: RawTransaction */
public class h75 {
    private final bp2 transaction;

    public h75(bp2 bp2) {
        this.transaction = bp2;
    }

    public static h75 createContractTransaction(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, String str) {
        return new h75(eg3.createContractTransaction(bigInteger, bigInteger2, bigInteger3, bigInteger4, str));
    }

    public static h75 createEtherTransaction(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, BigInteger bigInteger4) {
        return new h75(eg3.createEtherTransaction(bigInteger, bigInteger2, bigInteger3, str, bigInteger4));
    }

    public static h75 createTransaction(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, String str2) {
        return createTransaction(bigInteger, bigInteger2, bigInteger3, str, BigInteger.ZERO, str2);
    }

    public String getData() {
        return this.transaction.getData();
    }

    public BigInteger getGasLimit() {
        return this.transaction.getGasLimit();
    }

    public BigInteger getGasPrice() {
        return this.transaction.getGasPrice();
    }

    public BigInteger getNonce() {
        return this.transaction.getNonce();
    }

    public String getTo() {
        return this.transaction.getTo();
    }

    public bp2 getTransaction() {
        return this.transaction;
    }

    public TransactionType getType() {
        return this.transaction.getType();
    }

    public BigInteger getValue() {
        return this.transaction.getValue();
    }

    public static h75 createTransaction(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, BigInteger bigInteger4, String str2) {
        return new h75(eg3.createTransaction(bigInteger, bigInteger2, bigInteger3, str, bigInteger4, str2));
    }

    public h75(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, BigInteger bigInteger4, String str2) {
        this(new eg3(bigInteger, bigInteger2, bigInteger3, str, bigInteger4, str2));
    }

    public static h75 createEtherTransaction(long j, BigInteger bigInteger, BigInteger bigInteger2, String str, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        return new h75(ot6.createEtherTransaction(j, bigInteger, bigInteger2, str, bigInteger3, bigInteger4, bigInteger5));
    }

    public static h75 createTransaction(long j, BigInteger bigInteger, BigInteger bigInteger2, String str, BigInteger bigInteger3, String str2, BigInteger bigInteger4, BigInteger bigInteger5) {
        return new h75(ot6.createTransaction(j, bigInteger, bigInteger2, str, bigInteger3, str2, bigInteger4, bigInteger5));
    }
}
