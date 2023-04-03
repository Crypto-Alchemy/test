package p000;

import java.math.BigInteger;
import java.util.List;

/* renamed from: au6 */
/* compiled from: TransactionReceipt */
public class au6 {
    private String blockHash;
    private String blockNumber;
    private String contractAddress;
    private String cumulativeGasUsed;
    private String from;
    private String gasUsed;
    private List<hk3> logs;
    private String logsBloom;
    private String revertReason;
    private String root;
    private String status;

    /* renamed from: to */
    private String f36577to;
    private String transactionHash;
    private String transactionIndex;

    public au6() {
    }

    public au6(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<hk3> list, String str12, String str13) {
        this.transactionHash = str;
        this.transactionIndex = str2;
        this.blockHash = str3;
        this.blockNumber = str4;
        this.cumulativeGasUsed = str5;
        this.gasUsed = str6;
        this.contractAddress = str7;
        this.root = str8;
        this.status = str9;
        this.from = str10;
        this.f36577to = str11;
        this.logs = list;
        this.logsBloom = str12;
        this.revertReason = str13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au6)) {
            return false;
        }
        au6 au6 = (au6) obj;
        if (getTransactionHash() == null ? au6.getTransactionHash() != null : !getTransactionHash().equals(au6.getTransactionHash())) {
            return false;
        }
        String str = this.transactionIndex;
        if (str == null ? au6.transactionIndex != null : !str.equals(au6.transactionIndex)) {
            return false;
        }
        if (getBlockHash() == null ? au6.getBlockHash() != null : !getBlockHash().equals(au6.getBlockHash())) {
            return false;
        }
        String str2 = this.blockNumber;
        if (str2 == null ? au6.blockNumber != null : !str2.equals(au6.blockNumber)) {
            return false;
        }
        String str3 = this.cumulativeGasUsed;
        if (str3 == null ? au6.cumulativeGasUsed != null : !str3.equals(au6.cumulativeGasUsed)) {
            return false;
        }
        String str4 = this.gasUsed;
        if (str4 == null ? au6.gasUsed != null : !str4.equals(au6.gasUsed)) {
            return false;
        }
        if (getContractAddress() == null ? au6.getContractAddress() != null : !getContractAddress().equals(au6.getContractAddress())) {
            return false;
        }
        if (getRoot() == null ? au6.getRoot() != null : !getRoot().equals(au6.getRoot())) {
            return false;
        }
        if (getStatus() == null ? au6.getStatus() != null : !getStatus().equals(au6.getStatus())) {
            return false;
        }
        if (getFrom() == null ? au6.getFrom() != null : !getFrom().equals(au6.getFrom())) {
            return false;
        }
        if (getTo() == null ? au6.getTo() != null : !getTo().equals(au6.getTo())) {
            return false;
        }
        if (getLogs() == null ? au6.getLogs() != null : !getLogs().equals(au6.getLogs())) {
            return false;
        }
        if (getLogsBloom() == null ? au6.getLogsBloom() != null : !getLogsBloom().equals(au6.getLogsBloom())) {
            return false;
        }
        if (getRevertReason() != null) {
            return getRevertReason().equals(au6.getRevertReason());
        }
        if (au6.getRevertReason() == null) {
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

    public String getContractAddress() {
        return this.contractAddress;
    }

    public BigInteger getCumulativeGasUsed() {
        return pc4.decodeQuantity(this.cumulativeGasUsed);
    }

    public String getCumulativeGasUsedRaw() {
        return this.cumulativeGasUsed;
    }

    public String getFrom() {
        return this.from;
    }

    public BigInteger getGasUsed() {
        return pc4.decodeQuantity(this.gasUsed);
    }

    public String getGasUsedRaw() {
        return this.gasUsed;
    }

    public List<hk3> getLogs() {
        return this.logs;
    }

    public String getLogsBloom() {
        return this.logsBloom;
    }

    public String getRevertReason() {
        return this.revertReason;
    }

    public String getRoot() {
        return this.root;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTo() {
        return this.f36577to;
    }

    public String getTransactionHash() {
        return this.transactionHash;
    }

    public BigInteger getTransactionIndex() {
        return pc4.decodeQuantity(this.transactionIndex);
    }

    public String getTransactionIndexRaw() {
        return this.transactionIndex;
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
        int i14 = 0;
        if (getTransactionHash() != null) {
            i = getTransactionHash().hashCode();
        } else {
            i = 0;
        }
        int i15 = i * 31;
        String str = this.transactionIndex;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i15 + i2) * 31;
        if (getBlockHash() != null) {
            i3 = getBlockHash().hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 31;
        String str2 = this.blockNumber;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (i17 + i4) * 31;
        String str3 = this.cumulativeGasUsed;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i19 = (i18 + i5) * 31;
        String str4 = this.gasUsed;
        if (str4 != null) {
            i6 = str4.hashCode();
        } else {
            i6 = 0;
        }
        int i20 = (i19 + i6) * 31;
        if (getContractAddress() != null) {
            i7 = getContractAddress().hashCode();
        } else {
            i7 = 0;
        }
        int i21 = (i20 + i7) * 31;
        if (getRoot() != null) {
            i8 = getRoot().hashCode();
        } else {
            i8 = 0;
        }
        int i22 = (i21 + i8) * 31;
        if (getStatus() != null) {
            i9 = getStatus().hashCode();
        } else {
            i9 = 0;
        }
        int i23 = (i22 + i9) * 31;
        if (getFrom() != null) {
            i10 = getFrom().hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (i23 + i10) * 31;
        if (getTo() != null) {
            i11 = getTo().hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (i24 + i11) * 31;
        if (getLogs() != null) {
            i12 = getLogs().hashCode();
        } else {
            i12 = 0;
        }
        int i26 = (i25 + i12) * 31;
        if (getLogsBloom() != null) {
            i13 = getLogsBloom().hashCode();
        } else {
            i13 = 0;
        }
        int i27 = (i26 + i13) * 31;
        if (getRevertReason() != null) {
            i14 = getRevertReason().hashCode();
        }
        return i27 + i14;
    }

    public boolean isStatusOK() {
        if (getStatus() == null) {
            return true;
        }
        return BigInteger.ONE.equals(pc4.decodeQuantity(getStatus()));
    }

    public void setBlockHash(String str) {
        this.blockHash = str;
    }

    public void setBlockNumber(String str) {
        this.blockNumber = str;
    }

    public void setContractAddress(String str) {
        this.contractAddress = str;
    }

    public void setCumulativeGasUsed(String str) {
        this.cumulativeGasUsed = str;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setGasUsed(String str) {
        this.gasUsed = str;
    }

    public void setLogs(List<hk3> list) {
        this.logs = list;
    }

    public void setLogsBloom(String str) {
        this.logsBloom = str;
    }

    public void setRevertReason(String str) {
        this.revertReason = str;
    }

    public void setRoot(String str) {
        this.root = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTo(String str) {
        this.f36577to = str;
    }

    public void setTransactionHash(String str) {
        this.transactionHash = str;
    }

    public void setTransactionIndex(String str) {
        this.transactionIndex = str;
    }

    public String toString() {
        return "TransactionReceipt{transactionHash='" + this.transactionHash + '\'' + ", transactionIndex='" + this.transactionIndex + '\'' + ", blockHash='" + this.blockHash + '\'' + ", blockNumber='" + this.blockNumber + '\'' + ", cumulativeGasUsed='" + this.cumulativeGasUsed + '\'' + ", gasUsed='" + this.gasUsed + '\'' + ", contractAddress='" + this.contractAddress + '\'' + ", root='" + this.root + '\'' + ", status='" + this.status + '\'' + ", from='" + this.from + '\'' + ", to='" + this.f36577to + '\'' + ", logs=" + this.logs + ", logsBloom='" + this.logsBloom + '\'' + ", revertReason='" + this.revertReason + '\'' + '}';
    }
}
