package net.safemoon.androidwallet.model.rpc2.solana;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceRequest;", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaRequest;", "walletAddress", "", "(Ljava/lang/String;)V", "getWalletAddress", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaBalanceRequest.kt */
public final class SolanaBalanceRequest extends SolanaRequest {
    private final String walletAddress;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SolanaBalanceRequest(String str) {
        super("getBalance", ck0.m33058f(str));
        vx2.m53591g(str, "walletAddress");
        this.walletAddress = str;
    }

    public static /* synthetic */ SolanaBalanceRequest copy$default(SolanaBalanceRequest solanaBalanceRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = solanaBalanceRequest.walletAddress;
        }
        return solanaBalanceRequest.copy(str);
    }

    public final String component1() {
        return this.walletAddress;
    }

    public final SolanaBalanceRequest copy(String str) {
        vx2.m53591g(str, "walletAddress");
        return new SolanaBalanceRequest(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SolanaBalanceRequest) && vx2.m53586b(this.walletAddress, ((SolanaBalanceRequest) obj).walletAddress);
    }

    public final String getWalletAddress() {
        return this.walletAddress;
    }

    public int hashCode() {
        return this.walletAddress.hashCode();
    }

    public String toString() {
        String str = this.walletAddress;
        return "SolanaBalanceRequest(walletAddress=" + str + ")";
    }
}
