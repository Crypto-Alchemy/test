package p000;

import java.math.BigInteger;

/* renamed from: pt6 */
/* compiled from: Transaction */
public class pt6 {
    private static final int CHAIN_ID_INC = 35;
    private static final int LOWER_REAL_V = 27;
    private String blockHash;
    private String blockNumber;
    private String creates;
    private String from;
    private String gas;
    private String gasPrice;
    private String hash;
    private String input;
    private String nonce;
    private String publicKey;

    /* renamed from: r */
    private String f44119r;
    private String raw;

    /* renamed from: s */
    private String f44120s;

    /* renamed from: to */
    private String f44121to;
    private String transactionIndex;

    /* renamed from: v */
    private long f44122v;
    private String value;

    public pt6() {
    }

    public pt6(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, long j) {
        this.hash = str;
        this.nonce = str2;
        this.blockHash = str3;
        this.blockNumber = str4;
        this.transactionIndex = str5;
        this.from = str6;
        this.f44121to = str7;
        this.value = str8;
        this.gasPrice = str10;
        this.gas = str9;
        this.input = str11;
        this.creates = str12;
        this.publicKey = str13;
        this.raw = str14;
        this.f44119r = str15;
        this.f44120s = str16;
        this.f44122v = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt6)) {
            return false;
        }
        pt6 pt6 = (pt6) obj;
        if (getV() != pt6.getV()) {
            return false;
        }
        if (getHash() == null ? pt6.getHash() != null : !getHash().equals(pt6.getHash())) {
            return false;
        }
        if (getNonceRaw() == null ? pt6.getNonceRaw() != null : !getNonceRaw().equals(pt6.getNonceRaw())) {
            return false;
        }
        if (getBlockHash() == null ? pt6.getBlockHash() != null : !getBlockHash().equals(pt6.getBlockHash())) {
            return false;
        }
        if (getBlockNumberRaw() == null ? pt6.getBlockNumberRaw() != null : !getBlockNumberRaw().equals(pt6.getBlockNumberRaw())) {
            return false;
        }
        if (getTransactionIndexRaw() == null ? pt6.getTransactionIndexRaw() != null : !getTransactionIndexRaw().equals(pt6.getTransactionIndexRaw())) {
            return false;
        }
        if (getFrom() == null ? pt6.getFrom() != null : !getFrom().equals(pt6.getFrom())) {
            return false;
        }
        if (getTo() == null ? pt6.getTo() != null : !getTo().equals(pt6.getTo())) {
            return false;
        }
        if (getValueRaw() == null ? pt6.getValueRaw() != null : !getValueRaw().equals(pt6.getValueRaw())) {
            return false;
        }
        if (getGasPriceRaw() == null ? pt6.getGasPriceRaw() != null : !getGasPriceRaw().equals(pt6.getGasPriceRaw())) {
            return false;
        }
        if (getGasRaw() == null ? pt6.getGasRaw() != null : !getGasRaw().equals(pt6.getGasRaw())) {
            return false;
        }
        if (getInput() == null ? pt6.getInput() != null : !getInput().equals(pt6.getInput())) {
            return false;
        }
        if (getCreates() == null ? pt6.getCreates() != null : !getCreates().equals(pt6.getCreates())) {
            return false;
        }
        if (getPublicKey() == null ? pt6.getPublicKey() != null : !getPublicKey().equals(pt6.getPublicKey())) {
            return false;
        }
        if (getRaw() == null ? pt6.getRaw() != null : !getRaw().equals(pt6.getRaw())) {
            return false;
        }
        if (getR() == null ? pt6.getR() != null : !getR().equals(pt6.getR())) {
            return false;
        }
        if (getS() != null) {
            return getS().equals(pt6.getS());
        }
        if (pt6.getS() == null) {
            return true;
        }
        return false;
    }

    public String getBlockHash() {
        return this.blockHash;
    }

    public BigInteger getBlockNumber() {
        return pc4.decodeQuantity(this.blockNumber);
    }

    public String getBlockNumberRaw() {
        return this.blockNumber;
    }

    public Long getChainId() {
        long j = this.f44122v;
        if (j == 27 || j == 28) {
            return null;
        }
        return Long.valueOf((j - 35) / 2);
    }

    public String getCreates() {
        return this.creates;
    }

    public String getFrom() {
        return this.from;
    }

    public BigInteger getGas() {
        return pc4.decodeQuantity(this.gas);
    }

    public BigInteger getGasPrice() {
        return pc4.decodeQuantity(this.gasPrice);
    }

    public String getGasPriceRaw() {
        return this.gasPrice;
    }

    public String getGasRaw() {
        return this.gas;
    }

    public String getHash() {
        return this.hash;
    }

    public String getInput() {
        return this.input;
    }

    public BigInteger getNonce() {
        return pc4.decodeQuantity(this.nonce);
    }

    public String getNonceRaw() {
        return this.nonce;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public String getR() {
        return this.f44119r;
    }

    public String getRaw() {
        return this.raw;
    }

    public String getS() {
        return this.f44120s;
    }

    public String getTo() {
        return this.f44121to;
    }

    public BigInteger getTransactionIndex() {
        return pc4.decodeQuantity(this.transactionIndex);
    }

    public String getTransactionIndexRaw() {
        return this.transactionIndex;
    }

    public long getV() {
        return this.f44122v;
    }

    public BigInteger getValue() {
        return pc4.decodeQuantity(this.value);
    }

    public String getValueRaw() {
        return this.value;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        if (getHash() != null) {
            i = getHash().hashCode();
        } else {
            i = 0;
        }
        int i17 = i * 31;
        if (getNonceRaw() != null) {
            i2 = getNonceRaw().hashCode();
        } else {
            i2 = 0;
        }
        int i18 = (i17 + i2) * 31;
        if (getBlockHash() != null) {
            i3 = getBlockHash().hashCode();
        } else {
            i3 = 0;
        }
        int i19 = (i18 + i3) * 31;
        if (getBlockNumberRaw() != null) {
            i4 = getBlockNumberRaw().hashCode();
        } else {
            i4 = 0;
        }
        int i20 = (i19 + i4) * 31;
        if (getTransactionIndexRaw() != null) {
            i5 = getTransactionIndexRaw().hashCode();
        } else {
            i5 = 0;
        }
        int i21 = (i20 + i5) * 31;
        if (getFrom() != null) {
            i6 = getFrom().hashCode();
        } else {
            i6 = 0;
        }
        int i22 = (i21 + i6) * 31;
        if (getTo() != null) {
            i7 = getTo().hashCode();
        } else {
            i7 = 0;
        }
        int i23 = (i22 + i7) * 31;
        if (getValueRaw() != null) {
            i8 = getValueRaw().hashCode();
        } else {
            i8 = 0;
        }
        int i24 = (i23 + i8) * 31;
        if (getGasPriceRaw() != null) {
            i9 = getGasPriceRaw().hashCode();
        } else {
            i9 = 0;
        }
        int i25 = (i24 + i9) * 31;
        if (getGasRaw() != null) {
            i10 = getGasRaw().hashCode();
        } else {
            i10 = 0;
        }
        int i26 = (i25 + i10) * 31;
        if (getInput() != null) {
            i11 = getInput().hashCode();
        } else {
            i11 = 0;
        }
        int i27 = (i26 + i11) * 31;
        if (getCreates() != null) {
            i12 = getCreates().hashCode();
        } else {
            i12 = 0;
        }
        int i28 = (i27 + i12) * 31;
        if (getPublicKey() != null) {
            i13 = getPublicKey().hashCode();
        } else {
            i13 = 0;
        }
        int i29 = (i28 + i13) * 31;
        if (getRaw() != null) {
            i14 = getRaw().hashCode();
        } else {
            i14 = 0;
        }
        int i30 = (i29 + i14) * 31;
        if (getR() != null) {
            i15 = getR().hashCode();
        } else {
            i15 = 0;
        }
        int i31 = (i30 + i15) * 31;
        if (getS() != null) {
            i16 = getS().hashCode();
        }
        return ((i31 + i16) * 31) + BigInteger.valueOf(getV()).hashCode();
    }

    public void setBlockHash(String str) {
        this.blockHash = str;
    }

    public void setBlockNumber(String str) {
        this.blockNumber = str;
    }

    public void setCreates(String str) {
        this.creates = str;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setGas(String str) {
        this.gas = str;
    }

    public void setGasPrice(String str) {
        this.gasPrice = str;
    }

    public void setHash(String str) {
        this.hash = str;
    }

    public void setInput(String str) {
        this.input = str;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setPublicKey(String str) {
        this.publicKey = str;
    }

    public void setR(String str) {
        this.f44119r = str;
    }

    public void setRaw(String str) {
        this.raw = str;
    }

    public void setS(String str) {
        this.f44120s = str;
    }

    public void setTo(String str) {
        this.f44121to = str;
    }

    public void setTransactionIndex(String str) {
        this.transactionIndex = str;
    }

    public void setV(Object obj) {
        if (obj instanceof String) {
            this.f44122v = yl0.longValueExact(pc4.toBigInt((String) obj));
        } else if (obj instanceof Integer) {
            this.f44122v = ((Integer) obj).longValue();
        } else {
            this.f44122v = ((Long) obj).longValue();
        }
    }

    public void setValue(String str) {
        this.value = str;
    }
}
