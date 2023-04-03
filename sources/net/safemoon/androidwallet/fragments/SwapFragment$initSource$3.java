package net.safemoon.androidwallet.fragments;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import java.math.BigDecimal;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Ljava/math/BigDecimal;", "it", "Lr37;", "invoke", "(Ljava/math/BigDecimal;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$initSource$3 extends Lambda implements rc2<BigDecimal, r37> {
    public final /* synthetic */ SwapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$initSource$3(SwapFragment swapFragment) {
        super(1);
        this.this$0 = swapFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BigDecimal) obj);
        return r37.f33317a;
    }

    public final void invoke(BigDecimal bigDecimal) {
        fe7 w0 = this.this$0.f42160q1;
        if (w0 == null) {
            vx2.m53605u("bindingSource");
            w0 = null;
        }
        SwapFragment swapFragment = this.this$0;
        if (bigDecimal != null) {
            AppCompatTextView appCompatTextView = w0.f28836i;
            String string = swapFragment.getString(R.string.text_swap_coin_bal);
            vx2.m53590f(string, "getString(R.string.text_swap_coin_bal)");
            double doubleValue = bigDecimal.doubleValue();
            Context requireContext = swapFragment.requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            String format = String.format(string, Arrays.copyOf(new Object[]{ol0.m70383y(doubleValue, requireContext)}, 1));
            vx2.m53590f(format, "format(this, *args)");
            appCompatTextView.setText(format);
            return;
        }
        w0.f28836i.setText(swapFragment.getString(R.string.loading));
    }
}
