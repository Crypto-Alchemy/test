package net.safemoon.androidwallet.model;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/EthGasPrice;", "", "status", "", "message", "result", "Lnet/safemoon/androidwallet/model/Result;", "(Ljava/lang/String;Ljava/lang/String;Lnet/safemoon/androidwallet/model/Result;)V", "getMessage", "()Ljava/lang/String;", "getResult", "()Lnet/safemoon/androidwallet/model/Result;", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: EthGasPrice.kt */
public final class EthGasPrice {
    @SerializedName("message")
    @Expose
    private final String message;
    @SerializedName("result")
    @Expose
    private final Result result;
    @SerializedName("status")
    @Expose
    private final String status;

    public EthGasPrice(String str, String str2, Result result2) {
        vx2.m53591g(str, "status");
        vx2.m53591g(str2, ThrowableDeserializer.PROP_NAME_MESSAGE);
        vx2.m53591g(result2, "result");
        this.status = str;
        this.message = str2;
        this.result = result2;
    }

    public static /* synthetic */ EthGasPrice copy$default(EthGasPrice ethGasPrice, String str, String str2, Result result2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ethGasPrice.status;
        }
        if ((i & 2) != 0) {
            str2 = ethGasPrice.message;
        }
        if ((i & 4) != 0) {
            result2 = ethGasPrice.result;
        }
        return ethGasPrice.copy(str, str2, result2);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.message;
    }

    public final Result component3() {
        return this.result;
    }

    public final EthGasPrice copy(String str, String str2, Result result2) {
        vx2.m53591g(str, "status");
        vx2.m53591g(str2, ThrowableDeserializer.PROP_NAME_MESSAGE);
        vx2.m53591g(result2, "result");
        return new EthGasPrice(str, str2, result2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EthGasPrice)) {
            return false;
        }
        EthGasPrice ethGasPrice = (EthGasPrice) obj;
        return vx2.m53586b(this.status, ethGasPrice.status) && vx2.m53586b(this.message, ethGasPrice.message) && vx2.m53586b(this.result, ethGasPrice.result);
    }

    public final String getMessage() {
        return this.message;
    }

    public final Result getResult() {
        return this.result;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.status.hashCode() * 31) + this.message.hashCode()) * 31) + this.result.hashCode();
    }

    public String toString() {
        String str = this.status;
        String str2 = this.message;
        Result result2 = this.result;
        return "EthGasPrice(status=" + str + ", message=" + str2 + ", result=" + result2 + ")";
    }
}
