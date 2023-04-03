package net.safemoon.androidwallet.fragments.collectibles;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.collectible.RoomNFT;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lh74;", "invoke", "()Lh74;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CollectionsFragment.kt */
public final class CollectionsFragment$nftsAdapter$2 extends Lambda implements pc2<h74> {
    public final /* synthetic */ CollectionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionsFragment$nftsAdapter$2(CollectionsFragment collectionsFragment) {
        super(0);
        this.this$0 = collectionsFragment;
    }

    public final h74 invoke() {
        final CollectionsFragment collectionsFragment = this.this$0;
        return new h74(new rc2<RoomNFT, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((RoomNFT) obj);
                return r37.f33317a;
            }

            public final void invoke(RoomNFT roomNFT) {
                vx2.m53591g(roomNFT, "it");
                CollectionsFragment collectionsFragment = collectionsFragment;
                collectionsFragment.mo57989N(collectionsFragment.mo57985C(), roomNFT);
            }
        });
    }
}
