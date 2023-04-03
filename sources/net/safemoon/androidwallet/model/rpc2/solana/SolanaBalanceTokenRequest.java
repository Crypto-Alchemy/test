package net.safemoon.androidwallet.model.rpc2.solana;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenRequest;", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaRequest;", "walletAddress", "", "contractAddress", "(Ljava/lang/String;Ljava/lang/String;)V", "getContractAddress", "()Ljava/lang/String;", "getWalletAddress", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaBalanceTokenRequest.kt */
public final class SolanaBalanceTokenRequest extends SolanaRequest {
    private final String contractAddress;
    private final String walletAddress;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SolanaBalanceTokenRequest(String str, String str2) {
        super("getTokenAccountsByOwner", ck0.m33058f(str, new Mint(str2), new Encoding((String) null, 1, (DefaultConstructorMarker) null)));
        vx2.m53591g(str, "walletAddress");
        vx2.m53591g(str2, "contractAddress");
        this.walletAddress = str;
        this.contractAddress = str2;
    }

    public static /* synthetic */ SolanaBalanceTokenRequest copy$default(SolanaBalanceTokenRequest solanaBalanceTokenRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = solanaBalanceTokenRequest.walletAddress;
        }
        if ((i & 2) != 0) {
            str2 = solanaBalanceTokenRequest.contractAddress;
        }
        return solanaBalanceTokenRequest.copy(str, str2);
    }

    public final String component1() {
        return this.walletAddress;
    }

    public final String component2() {
        return this.contractAddress;
    }

    public final SolanaBalanceTokenRequest copy(String str, String str2) {
        vx2.m53591g(str, "walletAddress");
        vx2.m53591g(str2, "contractAddress");
        return new SolanaBalanceTokenRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SolanaBalanceTokenRequest)) {
            return false;
        }
        SolanaBalanceTokenRequest solanaBalanceTokenRequest = (SolanaBalanceTokenRequest) obj;
        return vx2.m53586b(this.walletAddress, solanaBalanceTokenRequest.walletAddress) && vx2.m53586b(this.contractAddress, solanaBalanceTokenRequest.contractAddress);
    }

    public final String getContractAddress() {
        return this.contractAddress;
    }

    public final String getWalletAddress() {
        return this.walletAddress;
    }

    public int hashCode() {
        return (this.walletAddress.hashCode() * 31) + this.contractAddress.hashCode();
    }

    public String toString() {
        String str = this.walletAddress;
        String str2 = this.contractAddress;
        return "SolanaBalanceTokenRequest(walletAddress=" + str + ", contractAddress=" + str2 + ")";
    }
}
