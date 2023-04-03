package p000;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.web3j.crypto.transaction.type.TransactionType;
import p000.c16;

/* renamed from: ot6 */
/* compiled from: Transaction1559 */
public class ot6 extends eg3 {
    private long chainId;
    private BigInteger maxFeePerGas;
    private BigInteger maxPriorityFeePerGas;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ot6(long j, BigInteger bigInteger, BigInteger bigInteger2, String str, BigInteger bigInteger3, String str2, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(TransactionType.EIP1559, bigInteger, (BigInteger) null, bigInteger2, str, bigInteger3, str2);
        this.chainId = j;
        this.maxPriorityFeePerGas = bigInteger4;
        this.maxFeePerGas = bigInteger5;
    }

    public static ot6 createEtherTransaction(long j, BigInteger bigInteger, BigInteger bigInteger2, String str, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        return new ot6(j, bigInteger, bigInteger2, str, bigInteger3, "", bigInteger4, bigInteger5);
    }

    public static ot6 createTransaction(long j, BigInteger bigInteger, BigInteger bigInteger2, String str, BigInteger bigInteger3, String str2, BigInteger bigInteger4, BigInteger bigInteger5) {
        return new ot6(j, bigInteger, bigInteger2, str, bigInteger3, str2, bigInteger4, bigInteger5);
    }

    public List<gh5> asRlpValues(c16.C6919a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fh5.create(getChainId()));
        arrayList.add(fh5.create(getNonce()));
        arrayList.add(fh5.create(getMaxPriorityFeePerGas()));
        arrayList.add(fh5.create(getMaxFeePerGas()));
        arrayList.add(fh5.create(getGasLimit()));
        String to = getTo();
        if (to == null || to.length() <= 0) {
            arrayList.add(fh5.create(""));
        } else {
            arrayList.add(fh5.create(pc4.hexStringToByteArray(to)));
        }
        arrayList.add(fh5.create(getValue()));
        arrayList.add(fh5.create(pc4.hexStringToByteArray(getData())));
        arrayList.add(new eh5(new gh5[0]));
        if (aVar != null) {
            arrayList.add(fh5.create((long) c16.getRecId(aVar, getChainId())));
            arrayList.add(fh5.create(f70.trimLeadingZeroes(aVar.getR())));
            arrayList.add(fh5.create(f70.trimLeadingZeroes(aVar.getS())));
        }
        return arrayList;
    }

    public long getChainId() {
        return this.chainId;
    }

    public BigInteger getGasPrice() {
        throw new UnsupportedOperationException("not available for 1559 transaction");
    }

    public BigInteger getMaxFeePerGas() {
        return this.maxFeePerGas;
    }

    public BigInteger getMaxPriorityFeePerGas() {
        return this.maxPriorityFeePerGas;
    }
}
