package net.safemoon.androidwallet.model.walletConnect;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.trustwallet.walletconnect.WCClientKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaResponse;", "", "result", "Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignature;", "id", "", "jsonrpc", "", "(Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignature;ILjava/lang/String;)V", "getId", "()I", "getJsonrpc", "()Ljava/lang/String;", "getResult", "()Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignature;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCSolanaSignTransaction.kt */
public class WCSolanaResponse {
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private final int f42488id;
    @SerializedName("jsonrpc")
    @Expose
    private final String jsonrpc;
    @SerializedName("result")
    @Expose
    private final WCSolanaSignature result;

    public WCSolanaResponse(WCSolanaSignature wCSolanaSignature, int i, String str) {
        vx2.m53591g(wCSolanaSignature, "result");
        vx2.m53591g(str, "jsonrpc");
        this.result = wCSolanaSignature;
        this.f42488id = i;
        this.jsonrpc = str;
    }

    public final int getId() {
        return this.f42488id;
    }

    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    public final WCSolanaSignature getResult() {
        return this.result;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WCSolanaResponse(WCSolanaSignature wCSolanaSignature, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(wCSolanaSignature, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? WCClientKt.JSONRPC_VERSION : str);
    }
}
