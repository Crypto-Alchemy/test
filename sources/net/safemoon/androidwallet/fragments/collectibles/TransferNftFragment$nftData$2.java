package net.safemoon.androidwallet.fragments.collectibles;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.nft.NFTData;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/model/nft/NFTData;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: TransferNftFragment.kt */
public final class TransferNftFragment$nftData$2 extends Lambda implements pc2<NFTData> {
    public final /* synthetic */ TransferNftFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferNftFragment$nftData$2(TransferNftFragment transferNftFragment) {
        super(0);
        this.this$0 = transferNftFragment;
    }

    public final NFTData invoke() {
        Serializable serializable = this.this$0.requireArguments().getSerializable("nftData");
        vx2.m53589e(serializable, "null cannot be cast to non-null type net.safemoon.androidwallet.model.nft.NFTData");
        return (NFTData) serializable;
    }
}
