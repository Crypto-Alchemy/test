package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.ActiveTokenListMode;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/common/ActiveTokenListMode;", "mode", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/common/ActiveTokenListMode;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AllTokensListFragment.kt */
public final class AllTokensListFragment$observeViewModel$1 extends Lambda implements rc2<ActiveTokenListMode, r37> {
    public final /* synthetic */ AllTokensListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AllTokensListFragment$observeViewModel$1(AllTokensListFragment allTokensListFragment) {
        super(1);
        this.this$0 = allTokensListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ActiveTokenListMode) obj);
        return r37.f33317a;
    }

    public final void invoke(ActiveTokenListMode activeTokenListMode) {
        vx2.m53591g(activeTokenListMode, "mode");
        gw0 x = this.this$0.f41889Q;
        vx2.m53588d(x);
        x.mo8737c();
    }
}
