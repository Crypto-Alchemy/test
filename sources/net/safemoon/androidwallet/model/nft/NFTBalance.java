package net.safemoon.androidwallet.model.nft;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/nft/NFTBalance;", "", "type", "Lnet/safemoon/androidwallet/model/nft/NFTType;", "balance", "", "(Lnet/safemoon/androidwallet/model/nft/NFTType;I)V", "getBalance", "()I", "getType", "()Lnet/safemoon/androidwallet/model/nft/NFTType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: NFTBalance.kt */
public final class NFTBalance {
    private final int balance;
    private final NFTType type;

    public NFTBalance(NFTType nFTType, int i) {
        vx2.m53591g(nFTType, "type");
        this.type = nFTType;
        this.balance = i;
    }

    public static /* synthetic */ NFTBalance copy$default(NFTBalance nFTBalance, NFTType nFTType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            nFTType = nFTBalance.type;
        }
        if ((i2 & 2) != 0) {
            i = nFTBalance.balance;
        }
        return nFTBalance.copy(nFTType, i);
    }

    public final NFTType component1() {
        return this.type;
    }

    public final int component2() {
        return this.balance;
    }

    public final NFTBalance copy(NFTType nFTType, int i) {
        vx2.m53591g(nFTType, "type");
        return new NFTBalance(nFTType, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NFTBalance)) {
            return false;
        }
        NFTBalance nFTBalance = (NFTBalance) obj;
        return this.type == nFTBalance.type && this.balance == nFTBalance.balance;
    }

    public final int getBalance() {
        return this.balance;
    }

    public final NFTType getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.balance;
    }

    public String toString() {
        NFTType nFTType = this.type;
        int i = this.balance;
        return "NFTBalance(type=" + nFTType + ", balance=" + i + ")";
    }
}
