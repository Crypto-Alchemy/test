package p000;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.web3j.crypto.transaction.type.TransactionType;
import p000.c16;

/* renamed from: eg3 */
/* compiled from: LegacyTransaction */
public class eg3 implements bp2 {
    private String data;
    private BigInteger gasLimit;
    private BigInteger gasPrice;
    private BigInteger nonce;

    /* renamed from: to */
    private String f37541to;
    private TransactionType type;
    private BigInteger value;

    public eg3(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, BigInteger bigInteger4, String str2) {
        this(TransactionType.LEGACY, bigInteger, bigInteger2, bigInteger3, str, bigInteger4, str2);
    }

    public static eg3 createContractTransaction(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, String str) {
        return new eg3(bigInteger, bigInteger2, bigInteger3, "", bigInteger4, str);
    }

    public static eg3 createEtherTransaction(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, BigInteger bigInteger4) {
        return new eg3(bigInteger, bigInteger2, bigInteger3, str, bigInteger4, "");
    }

    public static eg3 createTransaction(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, String str2) {
        return createTransaction(bigInteger, bigInteger2, bigInteger3, str, BigInteger.ZERO, str2);
    }

    public List<gh5> asRlpValues(c16.C6919a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fh5.create(getNonce()));
        arrayList.add(fh5.create(getGasPrice()));
        arrayList.add(fh5.create(getGasLimit()));
        String to = getTo();
        if (to == null || to.length() <= 0) {
            arrayList.add(fh5.create(""));
        } else {
            arrayList.add(fh5.create(pc4.hexStringToByteArray(to)));
        }
        arrayList.add(fh5.create(getValue()));
        arrayList.add(fh5.create(pc4.hexStringToByteArray(getData())));
        if (aVar != null) {
            arrayList.add(fh5.create(f70.trimLeadingZeroes(aVar.getV())));
            arrayList.add(fh5.create(f70.trimLeadingZeroes(aVar.getR())));
            arrayList.add(fh5.create(f70.trimLeadingZeroes(aVar.getS())));
        }
        return arrayList;
    }

    public String getData() {
        return this.data;
    }

    public BigInteger getGasLimit() {
        return this.gasLimit;
    }

    public BigInteger getGasPrice() {
        return this.gasPrice;
    }

    public BigInteger getNonce() {
        return this.nonce;
    }

    public String getTo() {
        return this.f37541to;
    }

    public TransactionType getType() {
        return this.type;
    }

    public BigInteger getValue() {
        return this.value;
    }

    @Deprecated
    public eg3(TransactionType transactionType, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, BigInteger bigInteger4, String str2) {
        this.type = transactionType;
        this.nonce = bigInteger;
        this.gasPrice = bigInteger2;
        this.gasLimit = bigInteger3;
        this.f37541to = str;
        this.value = bigInteger4;
        this.data = str2 != null ? pc4.cleanHexPrefix(str2) : null;
    }

    public static eg3 createTransaction(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, BigInteger bigInteger4, String str2) {
        return new eg3(bigInteger, bigInteger2, bigInteger3, str, bigInteger4, str2);
    }
}
