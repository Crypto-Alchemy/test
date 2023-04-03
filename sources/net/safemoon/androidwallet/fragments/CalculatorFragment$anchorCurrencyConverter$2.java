package net.safemoon.androidwallet.fragments;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.dialogs.AnchorCurrencyConverter;
import net.safemoon.androidwallet.viewmodels.SelectFiatViewModel;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/dialogs/AnchorCurrencyConverter;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CalculatorFragment.kt */
public final class CalculatorFragment$anchorCurrencyConverter$2 extends Lambda implements pc2<AnchorCurrencyConverter> {
    public final /* synthetic */ CalculatorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalculatorFragment$anchorCurrencyConverter$2(CalculatorFragment calculatorFragment) {
        super(0);
        this.this$0 = calculatorFragment;
    }

    public final AnchorCurrencyConverter invoke() {
        Context requireContext = this.this$0.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        SelectFiatViewModel S = this.this$0.mo57455m0();
        e92 M = this.this$0.f41921y;
        return new AnchorCurrencyConverter(requireContext, S, M != null ? M.mo42169b() : null, C83691.INSTANCE);
    }
}
