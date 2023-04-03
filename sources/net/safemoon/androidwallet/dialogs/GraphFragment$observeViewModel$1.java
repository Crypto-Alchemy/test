package net.safemoon.androidwallet.dialogs;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.cmc.coinPrice.CoinPriceStats;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStats;", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStats;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: GraphFragment.kt */
public final class GraphFragment$observeViewModel$1 extends Lambda implements rc2<CoinPriceStats, r37> {
    public final /* synthetic */ GraphFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphFragment$observeViewModel$1(GraphFragment graphFragment) {
        super(1);
        this.this$0 = graphFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CoinPriceStats) obj);
        return r37.f33317a;
    }

    public final void invoke(CoinPriceStats coinPriceStats) {
        if ((coinPriceStats != null ? coinPriceStats.getData() : null) == null || coinPriceStats.getData().getQuote().isEmpty()) {
            this.this$0.mo57269v0();
            this.this$0.mo57268u0(false);
            return;
        }
        this.this$0.mo57268u0(true);
        this.this$0.mo57262h0(coinPriceStats.getData().getId());
    }
}
