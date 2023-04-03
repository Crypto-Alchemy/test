package net.safemoon.androidwallet.model.request;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepName;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@KeepName
@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\b\u0010 \u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u001c¨\u0006!"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/request/EvmRequestTransaction;", "Lnet/safemoon/androidwallet/model/request/RequestTransaction;", "_transactionHash", "", "_from", "_to", "_amount", "", "_symbol", "gasPrice", "", "_chainName", "_requestTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "get_amount", "()D", "get_chainName", "()Ljava/lang/String;", "get_from", "get_requestTime", "get_symbol", "get_to", "get_transactionHash", "getGasPrice", "()J", "gasUsed", "getGasUsed", "setGasUsed", "(Ljava/lang/String;)V", "transactionIndex", "getTransactionIndex", "setTransactionIndex", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: EvmRequestTransaction.kt */
public final class EvmRequestTransaction extends RequestTransaction {
    private final double _amount;
    private final String _chainName;
    private final String _from;
    private final String _requestTime;
    private final String _symbol;
    private final String _to;
    private final String _transactionHash;
    @SerializedName("gasPrice")
    @Expose
    private final long gasPrice;
    @SerializedName("gasUsed")
    @Expose
    private String gasUsed;
    @SerializedName("transactionIndex")
    @Expose
    private String transactionIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EvmRequestTransaction(String str, String str2, String str3, double d, String str4, long j, String str5, String str6) {
        super(str, str2, str3, d, str4, str5, str6, 0, 128, (DefaultConstructorMarker) null);
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        vx2.m53591g(str7, "_transactionHash");
        vx2.m53591g(str8, "_from");
        vx2.m53591g(str9, "_to");
        vx2.m53591g(str4, "_symbol");
        vx2.m53591g(str5, "_chainName");
        vx2.m53591g(str6, "_requestTime");
        this._transactionHash = str7;
        this._from = str8;
        this._to = str9;
        this._amount = d;
        this._symbol = str4;
        this.gasPrice = j;
        this._chainName = str5;
        this._requestTime = str6;
    }

    public final long getGasPrice() {
        return this.gasPrice;
    }

    public final String getGasUsed() {
        return this.gasUsed;
    }

    public final String getTransactionIndex() {
        return this.transactionIndex;
    }

    public final double get_amount() {
        return this._amount;
    }

    public final String get_chainName() {
        return this._chainName;
    }

    public final String get_from() {
        return this._from;
    }

    public final String get_requestTime() {
        return this._requestTime;
    }

    public final String get_symbol() {
        return this._symbol;
    }

    public final String get_to() {
        return this._to;
    }

    public final String get_transactionHash() {
        return this._transactionHash;
    }

    public final void setGasUsed(String str) {
        this.gasUsed = str;
    }

    public final void setTransactionIndex(String str) {
        this.transactionIndex = str;
    }

    public String toString() {
        String json = new Gson().toJson((Object) this);
        vx2.m53590f(json, "Gson().toJson(this)");
        return json;
    }
}
