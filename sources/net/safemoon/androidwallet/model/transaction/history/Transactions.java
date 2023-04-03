package net.safemoon.androidwallet.model.transaction.history;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003JV\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\bHÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR \u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001c¨\u0006,"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/history/Transactions;", "", "blockTime", "", "slot", "change", "Lnet/safemoon/androidwallet/model/transaction/history/SolSplData;", "txHash", "", "fee", "status", "(Ljava/lang/Integer;Ljava/lang/Integer;Lnet/safemoon/androidwallet/model/transaction/history/SolSplData;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getBlockTime", "()Ljava/lang/Integer;", "setBlockTime", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getChange", "()Lnet/safemoon/androidwallet/model/transaction/history/SolSplData;", "setChange", "(Lnet/safemoon/androidwallet/model/transaction/history/SolSplData;)V", "getFee", "setFee", "getSlot", "setSlot", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "getTxHash", "setTxHash", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Lnet/safemoon/androidwallet/model/transaction/history/SolSplData;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lnet/safemoon/androidwallet/model/transaction/history/Transactions;", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolSplFromExplorer.kt */
public final class Transactions {
    @SerializedName("blockTime")
    private Integer blockTime;
    @SerializedName("change")
    private SolSplData change;
    @SerializedName("fee")
    private Integer fee;
    @SerializedName("slot")
    private Integer slot;
    @SerializedName("status")
    private String status;
    @SerializedName("txHash")
    private String txHash;

    public Transactions() {
        this((Integer) null, (Integer) null, (SolSplData) null, (String) null, (Integer) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public Transactions(Integer num, Integer num2, SolSplData solSplData, String str, Integer num3, String str2) {
        this.blockTime = num;
        this.slot = num2;
        this.change = solSplData;
        this.txHash = str;
        this.fee = num3;
        this.status = str2;
    }

    public static /* synthetic */ Transactions copy$default(Transactions transactions, Integer num, Integer num2, SolSplData solSplData, String str, Integer num3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = transactions.blockTime;
        }
        if ((i & 2) != 0) {
            num2 = transactions.slot;
        }
        Integer num4 = num2;
        if ((i & 4) != 0) {
            solSplData = transactions.change;
        }
        SolSplData solSplData2 = solSplData;
        if ((i & 8) != 0) {
            str = transactions.txHash;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            num3 = transactions.fee;
        }
        Integer num5 = num3;
        if ((i & 32) != 0) {
            str2 = transactions.status;
        }
        return transactions.copy(num, num4, solSplData2, str3, num5, str2);
    }

    public final Integer component1() {
        return this.blockTime;
    }

    public final Integer component2() {
        return this.slot;
    }

    public final SolSplData component3() {
        return this.change;
    }

    public final String component4() {
        return this.txHash;
    }

    public final Integer component5() {
        return this.fee;
    }

    public final String component6() {
        return this.status;
    }

    public final Transactions copy(Integer num, Integer num2, SolSplData solSplData, String str, Integer num3, String str2) {
        return new Transactions(num, num2, solSplData, str, num3, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transactions)) {
            return false;
        }
        Transactions transactions = (Transactions) obj;
        return vx2.m53586b(this.blockTime, transactions.blockTime) && vx2.m53586b(this.slot, transactions.slot) && vx2.m53586b(this.change, transactions.change) && vx2.m53586b(this.txHash, transactions.txHash) && vx2.m53586b(this.fee, transactions.fee) && vx2.m53586b(this.status, transactions.status);
    }

    public final Integer getBlockTime() {
        return this.blockTime;
    }

    public final SolSplData getChange() {
        return this.change;
    }

    public final Integer getFee() {
        return this.fee;
    }

    public final Integer getSlot() {
        return this.slot;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTxHash() {
        return this.txHash;
    }

    public int hashCode() {
        Integer num = this.blockTime;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.slot;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        SolSplData solSplData = this.change;
        int hashCode3 = (hashCode2 + (solSplData == null ? 0 : solSplData.hashCode())) * 31;
        String str = this.txHash;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.fee;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.status;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode5 + i;
    }

    public final void setBlockTime(Integer num) {
        this.blockTime = num;
    }

    public final void setChange(SolSplData solSplData) {
        this.change = solSplData;
    }

    public final void setFee(Integer num) {
        this.fee = num;
    }

    public final void setSlot(Integer num) {
        this.slot = num;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setTxHash(String str) {
        this.txHash = str;
    }

    public String toString() {
        Integer num = this.blockTime;
        Integer num2 = this.slot;
        SolSplData solSplData = this.change;
        String str = this.txHash;
        Integer num3 = this.fee;
        String str2 = this.status;
        return "Transactions(blockTime=" + num + ", slot=" + num2 + ", change=" + solSplData + ", txHash=" + str + ", fee=" + num3 + ", status=" + str2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Transactions(java.lang.Integer r6, java.lang.Integer r7, net.safemoon.androidwallet.model.transaction.history.SolSplData r8, java.lang.String r9, java.lang.Integer r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0018
            net.safemoon.androidwallet.model.transaction.history.SolSplData r8 = new net.safemoon.androidwallet.model.transaction.history.SolSplData
            r8.<init>()
        L_0x0018:
            r2 = r8
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001f
            r3 = r0
            goto L_0x0020
        L_0x001f:
            r3 = r9
        L_0x0020:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0026
            r4 = r0
            goto L_0x0027
        L_0x0026:
            r4 = r10
        L_0x0027:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002d
            r12 = r0
            goto L_0x002e
        L_0x002d:
            r12 = r11
        L_0x002e:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.transaction.history.Transactions.<init>(java.lang.Integer, java.lang.Integer, net.safemoon.androidwallet.model.transaction.history.SolSplData, java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
