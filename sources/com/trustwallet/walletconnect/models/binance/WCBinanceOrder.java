package com.trustwallet.walletconnect.models.binance;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/binance/WCBinanceOrder;", "T", "", "accountNumber", "", "chainId", "data", "memo", "sequence", "source", "msgs", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAccountNumber", "()Ljava/lang/String;", "getChainId", "getData", "getMemo", "getMsgs", "()Ljava/util/List;", "getSequence", "getSource", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCBinanceOrder.kt */
public class WCBinanceOrder<T> {
    @SerializedName("account_number")
    private final String accountNumber;
    @SerializedName("chain_id")
    private final String chainId;
    private final String data;
    private final String memo;
    private final List<T> msgs;
    private final String sequence;
    private final String source;

    public WCBinanceOrder(String str, String str2, String str3, String str4, String str5, String str6, List<? extends T> list) {
        vx2.m53591g(str, "accountNumber");
        vx2.m53591g(str2, "chainId");
        vx2.m53591g(str5, "sequence");
        vx2.m53591g(str6, "source");
        vx2.m53591g(list, "msgs");
        this.accountNumber = str;
        this.chainId = str2;
        this.data = str3;
        this.memo = str4;
        this.sequence = str5;
        this.source = str6;
        this.msgs = list;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getChainId() {
        return this.chainId;
    }

    public final String getData() {
        return this.data;
    }

    public final String getMemo() {
        return this.memo;
    }

    public final List<T> getMsgs() {
        return this.msgs;
    }

    public final String getSequence() {
        return this.sequence;
    }

    public final String getSource() {
        return this.source;
    }
}
