package net.safemoon.androidwallet.worker.nfts.solana;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.repository.dataSource.collection.NftDataSource;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/repository/dataSource/collection/NftDataSource;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaNftWorker.kt */
public final class SolanaNftWorker$nftDataSource$2 extends Lambda implements pc2<NftDataSource> {
    public final /* synthetic */ SolanaNftWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SolanaNftWorker$nftDataSource$2(SolanaNftWorker solanaNftWorker) {
        super(0);
        this.this$0 = solanaNftWorker;
    }

    public final NftDataSource invoke() {
        return new NftDataSource(this.this$0.mo62356z().mo57115W());
    }
}
