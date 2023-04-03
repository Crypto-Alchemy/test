package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CollectibleViewModel$loadCollections$2", mo48632f = "CollectibleViewModel.kt", mo48633l = {483}, mo48634m = "invokeSuspend")
/* compiled from: CollectibleViewModel.kt */
public final class CollectibleViewModel$loadCollections$2 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ int $chainId;
    public final /* synthetic */ int $limit;
    public final /* synthetic */ int $offset;
    public int label;
    public final /* synthetic */ CollectibleViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleViewModel$loadCollections$2(CollectibleViewModel collectibleViewModel, int i, int i2, int i3, ns0<? super CollectibleViewModel$loadCollections$2> ns0) {
        super(2, ns0);
        this.this$0 = collectibleViewModel;
        this.$chainId = i;
        this.$limit = i2;
        this.$offset = i3;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CollectibleViewModel$loadCollections$2(this.this$0, this.$chainId, this.$limit, this.$offset, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CollectibleViewModel$loadCollections$2) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            this.this$0.mo61051T().postValue(a40.m31670a(true));
            CollectibleViewModel collectibleViewModel = this.this$0;
            int i2 = this.$chainId;
            int i3 = this.$limit;
            int i4 = this.$offset;
            this.label = 1;
            if (collectibleViewModel.mo61067u(i2, i3, i4, this) == d) {
                return d;
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
