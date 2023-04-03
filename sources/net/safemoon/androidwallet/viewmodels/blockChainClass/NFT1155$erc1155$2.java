package net.safemoon.androidwallet.viewmodels.blockChainClass;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.ERC1155;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/ERC1155;", "kotlin.jvm.PlatformType", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: NFT1155.kt */
public final class NFT1155$erc1155$2 extends Lambda implements pc2<ERC1155> {
    public final /* synthetic */ NFT1155 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NFT1155$erc1155$2(NFT1155 nft1155) {
        super(0);
        this.this$0 = nft1155;
    }

    public final ERC1155 invoke() {
        String y = this.this$0.mo61846y();
        vj7 w = this.this$0.mo61890w();
        cw0 h = this.this$0.mo61878h();
        NFT1155 nft1155 = this.this$0;
        BigInteger j = nft1155.mo61880j();
        vx2.m53590f(j, "GAS_LIMIT");
        return ERC1155.m64649p(y, w, h, nft1155.mo61883n(j));
    }
}
