package net.safemoon.androidwallet.model.nft;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, mo44877d2 = {"toNFTType", "Lnet/safemoon/androidwallet/model/nft/NFTType;", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: NFTType.kt */
public final class NFTTypeKt {
    public static final NFTType toNFTType(String str) {
        vx2.m53591g(str, "<this>");
        int hashCode = str.hashCode();
        if (hashCode != -1843460540) {
            if (hashCode != -775780618) {
                if (hashCode == 2053190592 && str.equals("ERC721")) {
                    return NFTType.ERC721;
                }
            } else if (str.equals("ERC1155")) {
                return NFTType.ERC1155;
            }
        } else if (str.equals("SOLANA")) {
            return NFTType.SOLANA;
        }
        return null;
    }
}
