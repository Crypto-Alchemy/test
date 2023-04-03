package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CalculatorFragment.kt */
public final class CalculatorFragment$bind$1$2 extends Lambda implements rc2<Fiat, r37> {
    public final /* synthetic */ e92 $this_run;
    public final /* synthetic */ CalculatorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalculatorFragment$bind$1$2(CalculatorFragment calculatorFragment, e92 e92) {
        super(1);
        this.this$0 = calculatorFragment;
        this.$this_run = e92;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Fiat) obj);
        return r37.f33317a;
    }

    public final void invoke(Fiat fiat) {
        if (fiat != null) {
            CalculatorFragment calculatorFragment = this.this$0;
            e92 e92 = this.$this_run;
            calculatorFragment.mo57453k0().notifyDataSetChanged();
            e92.f28442J.f29301e.setText(rz1.f44501a.mo65773c(fiat.getSymbol()));
        }
    }
}
