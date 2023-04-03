package net.safemoon.androidwallet.model.nft;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/nft/NFTTransferResponse;", "", "type", "Lnet/safemoon/androidwallet/model/nft/NFTType;", "hash", "", "error", "(Lnet/safemoon/androidwallet/model/nft/NFTType;Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getHash", "getType", "()Lnet/safemoon/androidwallet/model/nft/NFTType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: NFTTransferResponse.kt */
public final class NFTTransferResponse {
    private final String error;
    private final String hash;
    private final NFTType type;

    public NFTTransferResponse(NFTType nFTType, String str, String str2) {
        this.type = nFTType;
        this.hash = str;
        this.error = str2;
    }

    public static /* synthetic */ NFTTransferResponse copy$default(NFTTransferResponse nFTTransferResponse, NFTType nFTType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            nFTType = nFTTransferResponse.type;
        }
        if ((i & 2) != 0) {
            str = nFTTransferResponse.hash;
        }
        if ((i & 4) != 0) {
            str2 = nFTTransferResponse.error;
        }
        return nFTTransferResponse.copy(nFTType, str, str2);
    }

    public final NFTType component1() {
        return this.type;
    }

    public final String component2() {
        return this.hash;
    }

    public final String component3() {
        return this.error;
    }

    public final NFTTransferResponse copy(NFTType nFTType, String str, String str2) {
        return new NFTTransferResponse(nFTType, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NFTTransferResponse)) {
            return false;
        }
        NFTTransferResponse nFTTransferResponse = (NFTTransferResponse) obj;
        return this.type == nFTTransferResponse.type && vx2.m53586b(this.hash, nFTTransferResponse.hash) && vx2.m53586b(this.error, nFTTransferResponse.error);
    }

    public final String getError() {
        return this.error;
    }

    public final String getHash() {
        return this.hash;
    }

    public final NFTType getType() {
        return this.type;
    }

    public int hashCode() {
        NFTType nFTType = this.type;
        int i = 0;
        int hashCode = (nFTType == null ? 0 : nFTType.hashCode()) * 31;
        String str = this.hash;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        NFTType nFTType = this.type;
        String str = this.hash;
        String str2 = this.error;
        return "NFTTransferResponse(type=" + nFTType + ", hash=" + str + ", error=" + str2 + ")";
    }
}
