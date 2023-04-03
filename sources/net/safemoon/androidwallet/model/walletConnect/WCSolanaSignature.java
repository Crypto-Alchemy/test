package net.safemoon.androidwallet.model.walletConnect;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignature;", "", "signature", "", "(Ljava/lang/String;)V", "getSignature", "()Ljava/lang/String;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCSolanaSignTransaction.kt */
public class WCSolanaSignature {
    @SerializedName("signature")
    @Expose
    private final String signature;

    public WCSolanaSignature(String str) {
        vx2.m53591g(str, "signature");
        this.signature = str;
    }

    public final String getSignature() {
        return this.signature;
    }
}
