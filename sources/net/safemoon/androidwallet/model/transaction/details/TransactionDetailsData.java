package net.safemoon.androidwallet.model.transaction.details;

import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003Jw\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014¨\u00062"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/details/TransactionDetailsData;", "", "hash", "", "status", "", "type", "from", "to", "amount", "", "tokenSymbol", "createdAt", "gasUsed", "transactionIndex", "chain", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()D", "getChain", "()Ljava/lang/String;", "getCreatedAt", "getFrom", "getGasUsed", "setGasUsed", "(Ljava/lang/String;)V", "getHash", "getStatus", "()Z", "getTo", "getTokenSymbol", "getTransactionIndex", "getType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: TransactionDetailsData.kt */
public final class TransactionDetailsData {
    @SerializedName("amount")
    private final double amount;
    @SerializedName("chain")
    private final String chain;
    @SerializedName("createdAt")
    private final String createdAt;
    @SerializedName("from")
    private final String from;
    @SerializedName("gasUsed")
    private String gasUsed;
    @SerializedName("transactionHash")
    private final String hash;
    @SerializedName("status")
    private final boolean status;
    @SerializedName("to")

    /* renamed from: to */
    private final String f42483to;
    @SerializedName("tokenSymbol")
    private final String tokenSymbol;
    @SerializedName("transactionIndex")
    private final String transactionIndex;
    @SerializedName("type")
    private final String type;

    public TransactionDetailsData(String str, boolean z, String str2, String str3, String str4, double d, String str5, String str6, String str7, String str8, String str9) {
        vx2.m53591g(str, "hash");
        vx2.m53591g(str2, "type");
        vx2.m53591g(str3, "from");
        vx2.m53591g(str4, "to");
        vx2.m53591g(str5, "tokenSymbol");
        vx2.m53591g(str6, "createdAt");
        vx2.m53591g(str7, "gasUsed");
        vx2.m53591g(str8, "transactionIndex");
        vx2.m53591g(str9, "chain");
        this.hash = str;
        this.status = z;
        this.type = str2;
        this.from = str3;
        this.f42483to = str4;
        this.amount = d;
        this.tokenSymbol = str5;
        this.createdAt = str6;
        this.gasUsed = str7;
        this.transactionIndex = str8;
        this.chain = str9;
    }

    public static /* synthetic */ TransactionDetailsData copy$default(TransactionDetailsData transactionDetailsData, String str, boolean z, String str2, String str3, String str4, double d, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        TransactionDetailsData transactionDetailsData2 = transactionDetailsData;
        int i2 = i;
        return transactionDetailsData.copy((i2 & 1) != 0 ? transactionDetailsData2.hash : str, (i2 & 2) != 0 ? transactionDetailsData2.status : z, (i2 & 4) != 0 ? transactionDetailsData2.type : str2, (i2 & 8) != 0 ? transactionDetailsData2.from : str3, (i2 & 16) != 0 ? transactionDetailsData2.f42483to : str4, (i2 & 32) != 0 ? transactionDetailsData2.amount : d, (i2 & 64) != 0 ? transactionDetailsData2.tokenSymbol : str5, (i2 & 128) != 0 ? transactionDetailsData2.createdAt : str6, (i2 & 256) != 0 ? transactionDetailsData2.gasUsed : str7, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? transactionDetailsData2.transactionIndex : str8, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? transactionDetailsData2.chain : str9);
    }

    public final String component1() {
        return this.hash;
    }

    public final String component10() {
        return this.transactionIndex;
    }

    public final String component11() {
        return this.chain;
    }

    public final boolean component2() {
        return this.status;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.from;
    }

    public final String component5() {
        return this.f42483to;
    }

    public final double component6() {
        return this.amount;
    }

    public final String component7() {
        return this.tokenSymbol;
    }

    public final String component8() {
        return this.createdAt;
    }

    public final String component9() {
        return this.gasUsed;
    }

    public final TransactionDetailsData copy(String str, boolean z, String str2, String str3, String str4, double d, String str5, String str6, String str7, String str8, String str9) {
        vx2.m53591g(str, "hash");
        String str10 = str2;
        vx2.m53591g(str10, "type");
        String str11 = str3;
        vx2.m53591g(str11, "from");
        String str12 = str4;
        vx2.m53591g(str12, "to");
        String str13 = str5;
        vx2.m53591g(str13, "tokenSymbol");
        String str14 = str6;
        vx2.m53591g(str14, "createdAt");
        String str15 = str7;
        vx2.m53591g(str15, "gasUsed");
        String str16 = str8;
        vx2.m53591g(str16, "transactionIndex");
        String str17 = str9;
        vx2.m53591g(str17, "chain");
        return new TransactionDetailsData(str, z, str10, str11, str12, d, str13, str14, str15, str16, str17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionDetailsData)) {
            return false;
        }
        TransactionDetailsData transactionDetailsData = (TransactionDetailsData) obj;
        return vx2.m53586b(this.hash, transactionDetailsData.hash) && this.status == transactionDetailsData.status && vx2.m53586b(this.type, transactionDetailsData.type) && vx2.m53586b(this.from, transactionDetailsData.from) && vx2.m53586b(this.f42483to, transactionDetailsData.f42483to) && Double.compare(this.amount, transactionDetailsData.amount) == 0 && vx2.m53586b(this.tokenSymbol, transactionDetailsData.tokenSymbol) && vx2.m53586b(this.createdAt, transactionDetailsData.createdAt) && vx2.m53586b(this.gasUsed, transactionDetailsData.gasUsed) && vx2.m53586b(this.transactionIndex, transactionDetailsData.transactionIndex) && vx2.m53586b(this.chain, transactionDetailsData.chain);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getChain() {
        return this.chain;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getGasUsed() {
        return this.gasUsed;
    }

    public final String getHash() {
        return this.hash;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public final String getTo() {
        return this.f42483to;
    }

    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public final String getTransactionIndex() {
        return this.transactionIndex;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.hash.hashCode() * 31;
        boolean z = this.status;
        if (z) {
            z = true;
        }
        return ((((((((((((((((((hashCode + (z ? 1 : 0)) * 31) + this.type.hashCode()) * 31) + this.from.hashCode()) * 31) + this.f42483to.hashCode()) * 31) + Double.doubleToLongBits(this.amount)) * 31) + this.tokenSymbol.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.gasUsed.hashCode()) * 31) + this.transactionIndex.hashCode()) * 31) + this.chain.hashCode();
    }

    public final void setGasUsed(String str) {
        vx2.m53591g(str, "<set-?>");
        this.gasUsed = str;
    }

    public String toString() {
        String str = this.hash;
        boolean z = this.status;
        String str2 = this.type;
        String str3 = this.from;
        String str4 = this.f42483to;
        double d = this.amount;
        String str5 = this.tokenSymbol;
        String str6 = this.createdAt;
        String str7 = this.gasUsed;
        String str8 = this.transactionIndex;
        String str9 = this.chain;
        return "TransactionDetailsData(hash=" + str + ", status=" + z + ", type=" + str2 + ", from=" + str3 + ", to=" + str4 + ", amount=" + d + ", tokenSymbol=" + str5 + ", createdAt=" + str6 + ", gasUsed=" + str7 + ", transactionIndex=" + str8 + ", chain=" + str9 + ")";
    }
}
