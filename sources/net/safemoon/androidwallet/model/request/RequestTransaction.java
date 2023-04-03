package net.safemoon.androidwallet.model.request;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepName;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@KeepName
@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001d\b\u0017\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010(\u001a\u00020\u0003H\u0016R\u0016\u0010\u0006\u001a\u00020\u00078\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u001e\u0010\u000b\u001a\u00020\f8\u0016@\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010\b\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0012¨\u0006)"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/request/RequestTransaction;", "Ljava/io/Serializable;", "transactionHash", "", "from", "to", "amount", "", "symbol", "chainName", "requestTime", "sendPush", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAmount", "()D", "blockHash", "getBlockHash", "()Ljava/lang/String;", "setBlockHash", "(Ljava/lang/String;)V", "blockNumber", "getBlockNumber", "setBlockNumber", "getChainName", "getFrom", "getRequestTime", "getSendPush", "()I", "setSendPush", "(I)V", "status", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSymbol", "getTo", "getTransactionHash", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: RequestTransaction.kt */
public class RequestTransaction implements Serializable {
    @SerializedName("amount")
    @Expose
    private final double amount;
    @SerializedName("blockHash")
    @Expose
    private String blockHash;
    @SerializedName("blockNumber")
    @Expose
    private String blockNumber;
    @SerializedName("chainName")
    @Expose
    private final String chainName;
    @SerializedName("from")
    @Expose
    private final String from;
    @SerializedName("requestTime")
    @Expose
    private final String requestTime;
    @SerializedName("sendPush")
    @Expose
    private int sendPush;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("symbol")
    @Expose
    private final String symbol;
    @SerializedName("to")
    @Expose

    /* renamed from: to */
    private final String f42463to;
    @SerializedName("transactionHash")
    @Expose
    private final String transactionHash;

    public RequestTransaction(String str, String str2, String str3, double d, String str4, String str5, String str6, int i) {
        vx2.m53591g(str, "transactionHash");
        vx2.m53591g(str2, "from");
        vx2.m53591g(str3, "to");
        vx2.m53591g(str4, "symbol");
        vx2.m53591g(str5, "chainName");
        vx2.m53591g(str6, "requestTime");
        this.transactionHash = str;
        this.from = str2;
        this.f42463to = str3;
        this.amount = d;
        this.symbol = str4;
        this.chainName = str5;
        this.requestTime = str6;
        this.sendPush = i;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getBlockHash() {
        return this.blockHash;
    }

    public String getBlockNumber() {
        return this.blockNumber;
    }

    public String getChainName() {
        return this.chainName;
    }

    public String getFrom() {
        return this.from;
    }

    public String getRequestTime() {
        return this.requestTime;
    }

    public int getSendPush() {
        return this.sendPush;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getTo() {
        return this.f42463to;
    }

    public String getTransactionHash() {
        return this.transactionHash;
    }

    public void setBlockHash(String str) {
        this.blockHash = str;
    }

    public void setBlockNumber(String str) {
        this.blockNumber = str;
    }

    public void setSendPush(int i) {
        this.sendPush = i;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public String toString() {
        String json = new Gson().toJson((Object) this);
        vx2.m53590f(json, "Gson().toJson(this)");
        return json;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RequestTransaction(String str, String str2, String str3, double d, String str4, String str5, String str6, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d, str4, str5, str6, (i2 & 128) != 0 ? 1 : i);
    }
}
