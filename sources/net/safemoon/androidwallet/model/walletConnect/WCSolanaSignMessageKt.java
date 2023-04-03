package net.safemoon.androidwallet.model.walletConnect;

import com.google.gson.JsonDeserializer;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo44877d2 = {"solanaSignMessageSerializer", "Lcom/google/gson/JsonDeserializer;", "Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignMessage;", "getSolanaSignMessageSerializer", "()Lcom/google/gson/JsonDeserializer;", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCSolanaSignMessage.kt */
public final class WCSolanaSignMessageKt {
    private static final JsonDeserializer<WCSolanaSignMessage> solanaSignMessageSerializer = xj2.m30137b(WCSolanaSignMessageKt$solanaSignMessageSerializer$1.INSTANCE);

    public static final JsonDeserializer<WCSolanaSignMessage> getSolanaSignMessageSerializer() {
        return solanaSignMessageSerializer;
    }
}
