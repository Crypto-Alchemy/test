package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.fragments.SelectCurrencyFragment;
import net.safemoon.androidwallet.model.swap.Swap;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/swap/Swap;", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/swap/Swap;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SelectCurrencyFragment.kt */
public final class SelectCurrencyFragment$onViewCreated$2 extends Lambda implements rc2<Swap, r37> {
    public final /* synthetic */ SelectCurrencyFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectCurrencyFragment$onViewCreated$2(SelectCurrencyFragment selectCurrencyFragment) {
        super(1);
        this.this$0 = selectCurrencyFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Swap) obj);
        return r37.f33317a;
    }

    public final void invoke(Swap swap) {
        vx2.m53591g(swap, "it");
        SelectCurrencyFragment.SWAPPATH z = this.this$0.mo57643E();
        SelectCurrencyFragment.SWAPPATH swappath = SelectCurrencyFragment.SWAPPATH.Source;
        if (z == swappath && this.this$0.mo57642D().mo61604c0().getValue() != null) {
            Swap value = this.this$0.mo57642D().mo61604c0().getValue();
            vx2.m53588d(value);
            if (vx2.m53586b(value.address, swap.address)) {
                return;
            }
        }
        if (this.this$0.mo57643E() == SelectCurrencyFragment.SWAPPATH.Destination && this.this$0.mo57642D().mo61553B0().getValue() != null) {
            Swap value2 = this.this$0.mo57642D().mo61553B0().getValue();
            vx2.m53588d(value2);
            if (vx2.m53586b(value2.address, swap.address)) {
                return;
            }
        }
        if (this.this$0.mo57643E() == swappath) {
            this.this$0.mo57642D().mo61553B0().setValue(swap);
        } else {
            this.this$0.mo57642D().mo61604c0().setValue(swap);
        }
        a77.m55427e(this.this$0.requireActivity());
        this.this$0.getParentFragmentManager().mo5968e1();
    }
}
