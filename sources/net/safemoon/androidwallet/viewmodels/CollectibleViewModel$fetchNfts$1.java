package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.collectible.RoomCollection;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CollectibleViewModel$fetchNfts$1", mo48632f = "CollectibleViewModel.kt", mo48633l = {659}, mo48634m = "invokeSuspend")
/* compiled from: CollectibleViewModel.kt */
public final class CollectibleViewModel$fetchNfts$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ RoomCollection $collection;
    public int label;
    public final /* synthetic */ CollectibleViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleViewModel$fetchNfts$1(CollectibleViewModel collectibleViewModel, RoomCollection roomCollection, ns0<? super CollectibleViewModel$fetchNfts$1> ns0) {
        super(2, ns0);
        this.this$0 = collectibleViewModel;
        this.$collection = roomCollection;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CollectibleViewModel$fetchNfts$1(this.this$0, this.$collection, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CollectibleViewModel$fetchNfts$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            this.this$0.mo61051T().postValue(a40.m31670a(true));
            String marketPlace = this.$collection.getMarketPlace();
            if (marketPlace != null) {
                int hashCode = marketPlace.hashCode();
                if (hashCode != 279271610) {
                    if (hashCode == 1957750149) {
                        str = "MORALIS";
                    } else if (hashCode == 2113850942) {
                        str = "MORALIS_SOLANA";
                    }
                    marketPlace.equals(str);
                } else if (!(!marketPlace.equals("OPEN_SEA") || this.$collection.getId() == null || this.$collection.getSlug() == null)) {
                    CollectibleViewModel collectibleViewModel = this.this$0;
                    int chain = this.$collection.getChain();
                    Long id = this.$collection.getId();
                    vx2.m53588d(id);
                    long longValue = id.longValue();
                    String slug = this.$collection.getSlug();
                    vx2.m53588d(slug);
                    this.label = 1;
                    if (collectibleViewModel.mo61068v(chain, longValue, slug, 100, 0, this) == d) {
                        return d;
                    }
                }
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.mo61051T().postValue(a40.m31670a(false));
        return r37.f33317a;
    }
}
