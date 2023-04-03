package net.safemoon.androidwallet.dialogs;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.Coin;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/model/Coin;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: GraphTradingViewFragment.kt */
public final class GraphTradingViewFragment$coin$2 extends Lambda implements pc2<Coin> {
    public final /* synthetic */ GraphTradingViewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphTradingViewFragment$coin$2(GraphTradingViewFragment graphTradingViewFragment) {
        super(0);
        this.this$0 = graphTradingViewFragment;
    }

    public final Coin invoke() {
        Object serializable = this.this$0.requireArguments().getSerializable("argCoin");
        if (serializable == null) {
            serializable = new Coin();
        }
        return (Coin) serializable;
    }
}
