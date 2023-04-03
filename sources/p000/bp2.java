package p000;

import java.math.BigInteger;
import java.util.List;
import org.web3j.crypto.transaction.type.TransactionType;
import p000.c16;

/* renamed from: bp2 */
/* compiled from: ITransaction */
public interface bp2 {
    List<gh5> asRlpValues(c16.C6919a aVar);

    String getData();

    BigInteger getGasLimit();

    BigInteger getGasPrice();

    BigInteger getNonce();

    String getTo();

    TransactionType getType();

    BigInteger getValue();
}
