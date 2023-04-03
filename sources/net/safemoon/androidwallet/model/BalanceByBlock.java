package net.safemoon.androidwallet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/BalanceByBlock;", "", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "result", "getResult", "setResult", "status", "getStatus", "setStatus", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: BalanceByBlock.kt */
public final class BalanceByBlock {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("status")
    @Expose
    private String status;

    public final String getMessage() {
        return this.message;
    }

    public final String getResult() {
        return this.result;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setResult(String str) {
        this.result = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }
}
