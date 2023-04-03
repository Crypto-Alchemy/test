package net.safemoon.androidwallet.model.rpc2.bitcoin;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jt\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0012R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BlockChainTransactionList;", "", "address", "", "finalBalance", "", "hash160", "nTx", "nUnredeemed", "totalReceived", "totalSent", "txs", "", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/Tx;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getAddress", "()Ljava/lang/String;", "getFinalBalance", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHash160", "getNTx", "getNUnredeemed", "getTotalReceived", "getTotalSent", "getTxs", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BlockChainTransactionList;", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: BlockChainTransactionList.kt */
public final class BlockChainTransactionList {
    @SerializedName("address")
    private final String address;
    @SerializedName("final_balance")
    private final Integer finalBalance;
    @SerializedName("hash160")
    private final String hash160;
    @SerializedName("n_tx")
    private final Integer nTx;
    @SerializedName("n_unredeemed")
    private final Integer nUnredeemed;
    @SerializedName("total_received")
    private final Integer totalReceived;
    @SerializedName("total_sent")
    private final Integer totalSent;
    @SerializedName("txs")
    private final List<C8602Tx> txs;

    public BlockChainTransactionList(String str, Integer num, String str2, Integer num2, Integer num3, Integer num4, Integer num5, List<C8602Tx> list) {
        this.address = str;
        this.finalBalance = num;
        this.hash160 = str2;
        this.nTx = num2;
        this.nUnredeemed = num3;
        this.totalReceived = num4;
        this.totalSent = num5;
        this.txs = list;
    }

    public static /* synthetic */ BlockChainTransactionList copy$default(BlockChainTransactionList blockChainTransactionList, String str, Integer num, String str2, Integer num2, Integer num3, Integer num4, Integer num5, List list, int i, Object obj) {
        BlockChainTransactionList blockChainTransactionList2 = blockChainTransactionList;
        int i2 = i;
        return blockChainTransactionList.copy((i2 & 1) != 0 ? blockChainTransactionList2.address : str, (i2 & 2) != 0 ? blockChainTransactionList2.finalBalance : num, (i2 & 4) != 0 ? blockChainTransactionList2.hash160 : str2, (i2 & 8) != 0 ? blockChainTransactionList2.nTx : num2, (i2 & 16) != 0 ? blockChainTransactionList2.nUnredeemed : num3, (i2 & 32) != 0 ? blockChainTransactionList2.totalReceived : num4, (i2 & 64) != 0 ? blockChainTransactionList2.totalSent : num5, (i2 & 128) != 0 ? blockChainTransactionList2.txs : list);
    }

    public final String component1() {
        return this.address;
    }

    public final Integer component2() {
        return this.finalBalance;
    }

    public final String component3() {
        return this.hash160;
    }

    public final Integer component4() {
        return this.nTx;
    }

    public final Integer component5() {
        return this.nUnredeemed;
    }

    public final Integer component6() {
        return this.totalReceived;
    }

    public final Integer component7() {
        return this.totalSent;
    }

    public final List<C8602Tx> component8() {
        return this.txs;
    }

    public final BlockChainTransactionList copy(String str, Integer num, String str2, Integer num2, Integer num3, Integer num4, Integer num5, List<C8602Tx> list) {
        return new BlockChainTransactionList(str, num, str2, num2, num3, num4, num5, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockChainTransactionList)) {
            return false;
        }
        BlockChainTransactionList blockChainTransactionList = (BlockChainTransactionList) obj;
        return vx2.m53586b(this.address, blockChainTransactionList.address) && vx2.m53586b(this.finalBalance, blockChainTransactionList.finalBalance) && vx2.m53586b(this.hash160, blockChainTransactionList.hash160) && vx2.m53586b(this.nTx, blockChainTransactionList.nTx) && vx2.m53586b(this.nUnredeemed, blockChainTransactionList.nUnredeemed) && vx2.m53586b(this.totalReceived, blockChainTransactionList.totalReceived) && vx2.m53586b(this.totalSent, blockChainTransactionList.totalSent) && vx2.m53586b(this.txs, blockChainTransactionList.txs);
    }

    public final String getAddress() {
        return this.address;
    }

    public final Integer getFinalBalance() {
        return this.finalBalance;
    }

    public final String getHash160() {
        return this.hash160;
    }

    public final Integer getNTx() {
        return this.nTx;
    }

    public final Integer getNUnredeemed() {
        return this.nUnredeemed;
    }

    public final Integer getTotalReceived() {
        return this.totalReceived;
    }

    public final Integer getTotalSent() {
        return this.totalSent;
    }

    public final List<C8602Tx> getTxs() {
        return this.txs;
    }

    public int hashCode() {
        String str = this.address;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.finalBalance;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.hash160;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.nTx;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.nUnredeemed;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.totalReceived;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.totalSent;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<C8602Tx> list = this.txs;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        String str = this.address;
        Integer num = this.finalBalance;
        String str2 = this.hash160;
        Integer num2 = this.nTx;
        Integer num3 = this.nUnredeemed;
        Integer num4 = this.totalReceived;
        Integer num5 = this.totalSent;
        List<C8602Tx> list = this.txs;
        return "BlockChainTransactionList(address=" + str + ", finalBalance=" + num + ", hash160=" + str2 + ", nTx=" + num2 + ", nUnredeemed=" + num3 + ", totalReceived=" + num4 + ", totalSent=" + num5 + ", txs=" + list + ")";
    }
}
