package net.safemoon.androidwallet.model.walletConnect;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/walletConnect/WCSolanaSignMessage;", "", "pubkey", "", "message", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getPubkey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCSolanaSignMessage.kt */
public final class WCSolanaSignMessage {
    private final String message;
    private final String pubkey;

    public WCSolanaSignMessage(String str, String str2) {
        vx2.m53591g(str, PublicResolver.FUNC_PUBKEY);
        vx2.m53591g(str2, ThrowableDeserializer.PROP_NAME_MESSAGE);
        this.pubkey = str;
        this.message = str2;
    }

    public static /* synthetic */ WCSolanaSignMessage copy$default(WCSolanaSignMessage wCSolanaSignMessage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wCSolanaSignMessage.pubkey;
        }
        if ((i & 2) != 0) {
            str2 = wCSolanaSignMessage.message;
        }
        return wCSolanaSignMessage.copy(str, str2);
    }

    public final String component1() {
        return this.pubkey;
    }

    public final String component2() {
        return this.message;
    }

    public final WCSolanaSignMessage copy(String str, String str2) {
        vx2.m53591g(str, PublicResolver.FUNC_PUBKEY);
        vx2.m53591g(str2, ThrowableDeserializer.PROP_NAME_MESSAGE);
        return new WCSolanaSignMessage(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCSolanaSignMessage)) {
            return false;
        }
        WCSolanaSignMessage wCSolanaSignMessage = (WCSolanaSignMessage) obj;
        return vx2.m53586b(this.pubkey, wCSolanaSignMessage.pubkey) && vx2.m53586b(this.message, wCSolanaSignMessage.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPubkey() {
        return this.pubkey;
    }

    public int hashCode() {
        return (this.pubkey.hashCode() * 31) + this.message.hashCode();
    }

    public String toString() {
        String str = this.pubkey;
        String str2 = this.message;
        return "WCSolanaSignMessage(pubkey=" + str + ", message=" + str2 + ")";
    }
}
