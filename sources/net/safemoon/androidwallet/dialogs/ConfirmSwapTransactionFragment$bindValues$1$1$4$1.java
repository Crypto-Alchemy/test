package net.safemoon.androidwallet.dialogs;

import com.google.android.material.textfield.TextInputEditText;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$d;", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$d;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ConfirmSwapTransactionFragment.kt */
public final class ConfirmSwapTransactionFragment$bindValues$1$1$4$1 extends Lambda implements rc2<SwapViewModel.C8789d, r37> {
    public final /* synthetic */ Swap $swap;
    public final /* synthetic */ j92 $this_run;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfirmSwapTransactionFragment$bindValues$1$1$4$1(j92 j92, Swap swap) {
        super(1);
        this.$this_run = j92;
        this.$swap = swap;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SwapViewModel.C8789d) obj);
        return r37.f33317a;
    }

    public final void invoke(SwapViewModel.C8789d dVar) {
        if (dVar != null) {
            BigDecimal r = ol0.m70376r(dVar.mo61647d(), 18);
            TextInputEditText textInputEditText = this.$this_run.f30268l;
            String i = r != null ? ol0.m70363i(r.doubleValue()) : null;
            TokenType.C8246a aVar = TokenType.Companion;
            Integer num = this.$swap.chainId;
            vx2.m53590f(num, "swap.chainId");
            String nativeToken = aVar.mo57099b(num.intValue()).getNativeToken();
            textInputEditText.setText(i + " " + nativeToken);
        }
    }
}
