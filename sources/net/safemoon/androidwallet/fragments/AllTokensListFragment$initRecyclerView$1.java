package net.safemoon.androidwallet.fragments;

import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.ActiveTokenListMode;
import net.safemoon.androidwallet.model.Coin;
import net.safemoon.androidwallet.utils.ChartParameter;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/Coin;", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/Coin;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AllTokensListFragment.kt */
public final class AllTokensListFragment$initRecyclerView$1 extends Lambda implements rc2<Coin, r37> {
    public final /* synthetic */ AllTokensListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AllTokensListFragment$initRecyclerView$1(AllTokensListFragment allTokensListFragment) {
        super(1);
        this.this$0 = allTokensListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Coin) obj);
        return r37.f33317a;
    }

    public final void invoke(Coin coin) {
        ChartParameter chartParameter;
        int i;
        vx2.m53591g(coin, "it");
        if (this.this$0.f41893Z == ActiveTokenListMode.GAINER || this.this$0.f41893Z == ActiveTokenListMode.LOSER) {
            chartParameter = new ChartParameter();
            AllTokensListFragment allTokensListFragment = this.this$0;
            String F = allTokensListFragment.mo57422F();
            if (vx2.m53586b(F, allTokensListFragment.f41895k)) {
                i = R.id.btn12Hours;
            } else if (vx2.m53586b(F, allTokensListFragment.f41897r)) {
                i = R.id.btn1Day;
            } else {
                i = vx2.m53586b(F, allTokensListFragment.f41898s) ? R.id.btn1Week : 0;
            }
            chartParameter.setDefaultInterval(i);
        } else {
            chartParameter = null;
        }
        FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
        vx2.m53590f(childFragmentManager, "childFragmentManager");
        new ce0(coin, childFragmentManager).mo50871g(chartParameter, C83661.INSTANCE);
    }
}
