package p000;

import java.math.BigInteger;
import java.util.List;

/* renamed from: hk3 */
/* compiled from: Log */
public class hk3 {
    private String address;
    private String blockHash;
    private String blockNumber;
    private String data;
    private String logIndex;
    private boolean removed;
    private List<String> topics;
    private String transactionHash;
    private String transactionIndex;
    private String type;

    public hk3() {
    }

    public hk3(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list) {
        this.removed = z;
        this.logIndex = str;
        this.transactionIndex = str2;
        this.transactionHash = str3;
        this.blockHash = str4;
        this.blockNumber = str5;
        this.address = str6;
        this.data = str7;
        this.type = str8;
        this.topics = list;
    }

    private BigInteger convert(String str) {
        if (str != null) {
            return pc4.decodeQuantity(str);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk3)) {
            return false;
        }
        hk3 hk3 = (hk3) obj;
        if (isRemoved() != hk3.isRemoved()) {
            return false;
        }
        if (getLogIndexRaw() == null ? hk3.getLogIndexRaw() != null : !getLogIndexRaw().equals(hk3.getLogIndexRaw())) {
            return false;
        }
        if (getTransactionIndexRaw() == null ? hk3.getTransactionIndexRaw() != null : !getTransactionIndexRaw().equals(hk3.getTransactionIndexRaw())) {
            return false;
        }
        if (getTransactionHash() == null ? hk3.getTransactionHash() != null : !getTransactionHash().equals(hk3.getTransactionHash())) {
            return false;
        }
        if (getBlockHash() == null ? hk3.getBlockHash() != null : !getBlockHash().equals(hk3.getBlockHash())) {
            return false;
        }
        if (getBlockNumberRaw() == null ? hk3.getBlockNumberRaw() != null : !getBlockNumberRaw().equals(hk3.getBlockNumberRaw())) {
            return false;
        }
        if (getAddress() == null ? hk3.getAddress() != null : !getAddress().equals(hk3.getAddress())) {
            return false;
        }
        if (getData() == null ? hk3.getData() != null : !getData().equals(hk3.getData())) {
            return false;
        }
        if (getType() == null ? hk3.getType() != null : !getType().equals(hk3.getType())) {
            return false;
        }
        if (getTopics() != null) {
            return getTopics().equals(hk3.getTopics());
        }
        if (hk3.getTopics() == null) {
            return true;
        }
        return false;
    }

    public String getAddress() {
        return this.address;
    }

    public String getBlockHash() {
        return this.blockHash;
    }

    public BigInteger getBlockNumber() {
        return convert(this.blockNumber);
    }

    public String getBlockNumberRaw() {
        return this.blockNumber;
    }

    public String getData() {
        return this.data;
    }

    public BigInteger getLogIndex() {
        return convert(this.logIndex);
    }

    public String getLogIndexRaw() {
        return this.logIndex;
    }

    public List<String> getTopics() {
        return this.topics;
    }

    public String getTransactionHash() {
        return this.transactionHash;
    }

    public BigInteger getTransactionIndex() {
        return convert(this.transactionIndex);
    }

    public String getTransactionIndexRaw() {
        return this.transactionIndex;
    }

    public String getType() {
        return this.type;
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
        int i9 = (isRemoved() ? 1 : 0) * true;
        int i10 = 0;
        if (getLogIndexRaw() != null) {
            i = getLogIndexRaw().hashCode();
        } else {
            i = 0;
        }
        int i11 = (i9 + i) * 31;
        if (getTransactionIndexRaw() != null) {
            i2 = getTransactionIndexRaw().hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 31;
        if (getTransactionHash() != null) {
            i3 = getTransactionHash().hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 31;
        if (getBlockHash() != null) {
            i4 = getBlockHash().hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 31;
        if (getBlockNumberRaw() != null) {
            i5 = getBlockNumberRaw().hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 31;
        if (getAddress() != null) {
            i6 = getAddress().hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 31;
        if (getData() != null) {
            i7 = getData().hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 31;
        if (getType() != null) {
            i8 = getType().hashCode();
        } else {
            i8 = 0;
        }
        int i18 = (i17 + i8) * 31;
        if (getTopics() != null) {
            i10 = getTopics().hashCode();
        }
        return i18 + i10;
    }

    public boolean isRemoved() {
        return this.removed;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setBlockHash(String str) {
        this.blockHash = str;
    }

    public void setBlockNumber(String str) {
        this.blockNumber = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setLogIndex(String str) {
        this.logIndex = str;
    }

    public void setRemoved(boolean z) {
        this.removed = z;
    }

    public void setTopics(List<String> list) {
        this.topics = list;
    }

    public void setTransactionHash(String str) {
        this.transactionHash = str;
    }

    public void setTransactionIndex(String str) {
        this.transactionIndex = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "Log{removed=" + this.removed + ", logIndex='" + this.logIndex + '\'' + ", transactionIndex='" + this.transactionIndex + '\'' + ", transactionHash='" + this.transactionHash + '\'' + ", blockHash='" + this.blockHash + '\'' + ", blockNumber='" + this.blockNumber + '\'' + ", address='" + this.address + '\'' + ", data='" + this.data + '\'' + ", type='" + this.type + '\'' + ", topics=" + this.topics + '}';
    }
}
