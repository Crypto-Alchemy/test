package net.safemoon.androidwallet.worker.nfts.solana;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/repository/dataSource/collection/CollectionDataSource;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaNftWorker.kt */
public final class SolanaNftWorker$collectionDataSource$2 extends Lambda implements pc2<CollectionDataSource> {
    public final /* synthetic */ SolanaNftWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SolanaNftWorker$collectionDataSource$2(SolanaNftWorker solanaNftWorker) {
        super(0);
        this.this$0 = solanaNftWorker;
    }

    public final CollectionDataSource invoke() {
        return new CollectionDataSource(this.this$0.mo62356z().mo57112T(), this.this$0.mo62356z().mo57115W());
    }
}
