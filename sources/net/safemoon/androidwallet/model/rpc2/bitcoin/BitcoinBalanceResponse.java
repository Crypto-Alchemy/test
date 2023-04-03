package net.safemoon.androidwallet.model.rpc2.bitcoin;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import org.web3j.abi.datatypes.Address;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J}\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0006HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0006HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015¨\u00060"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BitcoinBalanceResponse;", "", "address", "", "balance", "itemsOnPage", "", "page", "totalPages", "totalReceived", "totalSent", "txids", "", "txs", "unconfirmedBalance", "unconfirmedTxs", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;I)V", "getAddress", "()Ljava/lang/String;", "getBalance", "getItemsOnPage", "()I", "getPage", "getTotalPages", "getTotalReceived", "getTotalSent", "getTxids", "()Ljava/util/List;", "getTxs", "getUnconfirmedBalance", "getUnconfirmedTxs", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: BitcoinBalanceResponse.kt */
public final class BitcoinBalanceResponse {
    @SerializedName("address")
    private final String address;
    @SerializedName("balance")
    private final String balance;
    @SerializedName("itemsOnPage")
    private final int itemsOnPage;
    @SerializedName("page")
    private final int page;
    @SerializedName("totalPages")
    private final int totalPages;
    @SerializedName("totalReceived")
    private final String totalReceived;
    @SerializedName("totalSent")
    private final String totalSent;
    @SerializedName("txids")
    private final List<String> txids;
    @SerializedName("txs")
    private final int txs;
    @SerializedName("unconfirmedBalance")
    private final String unconfirmedBalance;
    @SerializedName("unconfirmedTxs")
    private final int unconfirmedTxs;

    public BitcoinBalanceResponse(String str, String str2, int i, int i2, int i3, String str3, String str4, List<String> list, int i4, String str5, int i5) {
        vx2.m53591g(str, Address.TYPE_NAME);
        vx2.m53591g(str2, "balance");
        vx2.m53591g(str3, "totalReceived");
        vx2.m53591g(str4, "totalSent");
        vx2.m53591g(list, "txids");
        vx2.m53591g(str5, "unconfirmedBalance");
        this.address = str;
        this.balance = str2;
        this.itemsOnPage = i;
        this.page = i2;
        this.totalPages = i3;
        this.totalReceived = str3;
        this.totalSent = str4;
        this.txids = list;
        this.txs = i4;
        this.unconfirmedBalance = str5;
        this.unconfirmedTxs = i5;
    }

    public static /* synthetic */ BitcoinBalanceResponse copy$default(BitcoinBalanceResponse bitcoinBalanceResponse, String str, String str2, int i, int i2, int i3, String str3, String str4, List list, int i4, String str5, int i5, int i6, Object obj) {
        BitcoinBalanceResponse bitcoinBalanceResponse2 = bitcoinBalanceResponse;
        int i7 = i6;
        return bitcoinBalanceResponse.copy((i7 & 1) != 0 ? bitcoinBalanceResponse2.address : str, (i7 & 2) != 0 ? bitcoinBalanceResponse2.balance : str2, (i7 & 4) != 0 ? bitcoinBalanceResponse2.itemsOnPage : i, (i7 & 8) != 0 ? bitcoinBalanceResponse2.page : i2, (i7 & 16) != 0 ? bitcoinBalanceResponse2.totalPages : i3, (i7 & 32) != 0 ? bitcoinBalanceResponse2.totalReceived : str3, (i7 & 64) != 0 ? bitcoinBalanceResponse2.totalSent : str4, (i7 & 128) != 0 ? bitcoinBalanceResponse2.txids : list, (i7 & 256) != 0 ? bitcoinBalanceResponse2.txs : i4, (i7 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? bitcoinBalanceResponse2.unconfirmedBalance : str5, (i7 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? bitcoinBalanceResponse2.unconfirmedTxs : i5);
    }

    public final String component1() {
        return this.address;
    }

    public final String component10() {
        return this.unconfirmedBalance;
    }

    public final int component11() {
        return this.unconfirmedTxs;
    }

    public final String component2() {
        return this.balance;
    }

    public final int component3() {
        return this.itemsOnPage;
    }

    public final int component4() {
        return this.page;
    }

    public final int component5() {
        return this.totalPages;
    }

    public final String component6() {
        return this.totalReceived;
    }

    public final String component7() {
        return this.totalSent;
    }

    public final List<String> component8() {
        return this.txids;
    }

    public final int component9() {
        return this.txs;
    }

    public final BitcoinBalanceResponse copy(String str, String str2, int i, int i2, int i3, String str3, String str4, List<String> list, int i4, String str5, int i5) {
        vx2.m53591g(str, Address.TYPE_NAME);
        vx2.m53591g(str2, "balance");
        String str6 = str3;
        vx2.m53591g(str6, "totalReceived");
        String str7 = str4;
        vx2.m53591g(str7, "totalSent");
        List<String> list2 = list;
        vx2.m53591g(list2, "txids");
        String str8 = str5;
        vx2.m53591g(str8, "unconfirmedBalance");
        return new BitcoinBalanceResponse(str, str2, i, i2, i3, str6, str7, list2, i4, str8, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinBalanceResponse)) {
            return false;
        }
        BitcoinBalanceResponse bitcoinBalanceResponse = (BitcoinBalanceResponse) obj;
        return vx2.m53586b(this.address, bitcoinBalanceResponse.address) && vx2.m53586b(this.balance, bitcoinBalanceResponse.balance) && this.itemsOnPage == bitcoinBalanceResponse.itemsOnPage && this.page == bitcoinBalanceResponse.page && this.totalPages == bitcoinBalanceResponse.totalPages && vx2.m53586b(this.totalReceived, bitcoinBalanceResponse.totalReceived) && vx2.m53586b(this.totalSent, bitcoinBalanceResponse.totalSent) && vx2.m53586b(this.txids, bitcoinBalanceResponse.txids) && this.txs == bitcoinBalanceResponse.txs && vx2.m53586b(this.unconfirmedBalance, bitcoinBalanceResponse.unconfirmedBalance) && this.unconfirmedTxs == bitcoinBalanceResponse.unconfirmedTxs;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getBalance() {
        return this.balance;
    }

    public final int getItemsOnPage() {
        return this.itemsOnPage;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public final String getTotalReceived() {
        return this.totalReceived;
    }

    public final String getTotalSent() {
        return this.totalSent;
    }

    public final List<String> getTxids() {
        return this.txids;
    }

    public final int getTxs() {
        return this.txs;
    }

    public final String getUnconfirmedBalance() {
        return this.unconfirmedBalance;
    }

    public final int getUnconfirmedTxs() {
        return this.unconfirmedTxs;
    }

    public int hashCode() {
        return (((((((((((((((((((this.address.hashCode() * 31) + this.balance.hashCode()) * 31) + this.itemsOnPage) * 31) + this.page) * 31) + this.totalPages) * 31) + this.totalReceived.hashCode()) * 31) + this.totalSent.hashCode()) * 31) + this.txids.hashCode()) * 31) + this.txs) * 31) + this.unconfirmedBalance.hashCode()) * 31) + this.unconfirmedTxs;
    }

    public String toString() {
        String str = this.address;
        String str2 = this.balance;
        int i = this.itemsOnPage;
        int i2 = this.page;
        int i3 = this.totalPages;
        String str3 = this.totalReceived;
        String str4 = this.totalSent;
        List<String> list = this.txids;
        int i4 = this.txs;
        String str5 = this.unconfirmedBalance;
        int i5 = this.unconfirmedTxs;
        return "BitcoinBalanceResponse(address=" + str + ", balance=" + str2 + ", itemsOnPage=" + i + ", page=" + i2 + ", totalPages=" + i3 + ", totalReceived=" + str3 + ", totalSent=" + str4 + ", txids=" + list + ", txs=" + i4 + ", unconfirmedBalance=" + str5 + ", unconfirmedTxs=" + i5 + ")";
    }
}
