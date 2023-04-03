package net.safemoon.androidwallet.model.rpc2.solana;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaSendTransactionMessageResponse;", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaResponse;", "()V", "result", "", "getResult", "()Ljava/lang/String;", "setResult", "(Ljava/lang/String;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaSendTransactionMessageResponse.kt */
public final class SolanaSendTransactionMessageResponse extends SolanaResponse {
    @SerializedName("result")
    @Expose
    private String result;

    public final String getResult() {
        return this.result;
    }

    public final void setResult(String str) {
        this.result = str;
    }
}
