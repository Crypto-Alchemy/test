package net.safemoon.androidwallet.model.walletConnect;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignMessageKey;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "PUBKEY", "MESSAGE", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCSolanaSignMessage.kt */
public enum WCSolanaSignMessageKey {
    PUBKEY(PublicResolver.FUNC_PUBKEY),
    MESSAGE(ThrowableDeserializer.PROP_NAME_MESSAGE);
    
    private final String key;

    private WCSolanaSignMessageKey(String str) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }
}
