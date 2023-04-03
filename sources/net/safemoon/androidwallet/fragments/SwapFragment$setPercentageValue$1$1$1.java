package net.safemoon.androidwallet.fragments;

import androidx.fragment.app.FragmentActivity;
import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Ljava/math/BigDecimal;", "it", "Lr37;", "invoke", "(Ljava/math/BigDecimal;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$setPercentageValue$1$1$1 extends Lambda implements rc2<BigDecimal, r37> {
    public final /* synthetic */ BigDecimal $balance;
    public final /* synthetic */ SwapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$setPercentageValue$1$1$1(BigDecimal bigDecimal, SwapFragment swapFragment) {
        super(1);
        this.$balance = bigDecimal;
        this.this$0 = swapFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BigDecimal) obj);
        return r37.f33317a;
    }

    public final void invoke(BigDecimal bigDecimal) {
        BigDecimal bigDecimal2 = this.$balance;
        vx2.m53590f(bigDecimal2, "balance");
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        vx2.m53590f(bigDecimal, "it?: BigDecimal.ZERO");
        BigDecimal subtract = bigDecimal2.subtract(bigDecimal);
        vx2.m53590f(subtract, "this.subtract(other)");
        double doubleValue = subtract.doubleValue();
        if (doubleValue > Utils.DOUBLE_EPSILON) {
            fe7 w0 = this.this$0.f42160q1;
            if (w0 == null) {
                vx2.m53605u("bindingSource");
                w0 = null;
            }
            w0.f28840m.setText(ol0.m70365j(doubleValue));
        } else {
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                String string = this.this$0.getResources().getString(R.string.swap_error_insufficient_balance);
                vx2.m53590f(string, "resources.getString(R.st…ror_insufficient_balance)");
                ol0.m70348a0(activity, string);
            }
        }
        this.this$0.mo57703X0();
    }
}
