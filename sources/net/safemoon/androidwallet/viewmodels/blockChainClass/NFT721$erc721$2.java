package net.safemoon.androidwallet.viewmodels.blockChainClass;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.ERC721;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/ERC721;", "kotlin.jvm.PlatformType", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: NFT721.kt */
public final class NFT721$erc721$2 extends Lambda implements pc2<ERC721> {
    public final /* synthetic */ NFT721 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NFT721$erc721$2(NFT721 nft721) {
        super(0);
        this.this$0 = nft721;
    }

    public final ERC721 invoke() {
        String x = this.this$0.mo61848x();
        vj7 w = this.this$0.mo61890w();
        cw0 h = this.this$0.mo61878h();
        NFT721 nft721 = this.this$0;
        BigInteger j = nft721.mo61880j();
        vx2.m53590f(j, "GAS_LIMIT");
        return ERC721.m64661n(x, w, h, nft721.mo61883n(j));
    }
}
