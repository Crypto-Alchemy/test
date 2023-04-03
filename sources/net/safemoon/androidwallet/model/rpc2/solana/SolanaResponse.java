package net.safemoon.androidwallet.model.rpc2.solana;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.trustwallet.walletconnect.WCClientKt;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaResponse;", "", "()V", "error", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaError;", "getError", "()Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaError;", "jsonrpc", "", "getJsonrpc", "()Ljava/lang/String;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaResponse.kt */
public class SolanaResponse {
    @SerializedName("error")
    @Expose
    private final SolanaError error;
    @SerializedName("jsonrpc")
    @Expose
    private final String jsonrpc = WCClientKt.JSONRPC_VERSION;

    public final SolanaError getError() {
        return this.error;
    }

    public final String getJsonrpc() {
        return this.jsonrpc;
    }
}
