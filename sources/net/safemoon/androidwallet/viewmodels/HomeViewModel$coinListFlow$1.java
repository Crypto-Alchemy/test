package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.model.AllCryptoList;
import net.safemoon.androidwallet.model.Coin;
import net.safemoon.androidwallet.repository.LatestCoinDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Ldl4;", "", "Lnet/safemoon/androidwallet/model/Coin;", "invoke", "()Ldl4;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$coinListFlow$1 extends Lambda implements pc2<dl4<Integer, Coin>> {
    public final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$coinListFlow$1(HomeViewModel homeViewModel) {
        super(0);
        this.this$0 = homeViewModel;
    }

    public final dl4<Integer, Coin> invoke() {
        ho3 l = C9384u3.m72571l();
        vx2.m53590f(l, "getMarketClient()");
        final HomeViewModel homeViewModel = this.this$0;
        return new LatestCoinDataSource(l, new LatestCoinDataSource.C8609a() {
            /* renamed from: a */
            public void mo60733a(AllCryptoList allCryptoList) {
                vx2.m53591g(allCryptoList, "newData");
                y23 unused = d50.m56748b(cd7.m11843a(homeViewModel), qh1.m71266c(), (CoroutineStart) null, new HomeViewModel$coinListFlow$1$1$onLoaded$1(homeViewModel, allCryptoList, (ns0<? super HomeViewModel$coinListFlow$1$1$onLoaded$1>) null), 2, (Object) null);
            }
        });
    }
}
