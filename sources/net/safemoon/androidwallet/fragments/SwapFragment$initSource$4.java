package net.safemoon.androidwallet.fragments;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.textview.MaterialTextView;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/Double;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$initSource$4 extends Lambda implements rc2<Double, r37> {
    public final /* synthetic */ SwapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$initSource$4(SwapFragment swapFragment) {
        super(1);
        this.this$0 = swapFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Double) obj);
        return r37.f33317a;
    }

    public final void invoke(Double d) {
        fe7 w0 = this.this$0.f42160q1;
        if (w0 == null) {
            vx2.m53605u("bindingSource");
            w0 = null;
        }
        SwapFragment swapFragment = this.this$0;
        double d2 = Utils.DOUBLE_EPSILON;
        if (vx2.m53585a(d, Utils.DOUBLE_EPSILON)) {
            w0.f28843p.setVisibility(4);
        } else {
            w0.f28843p.setVisibility(0);
        }
        MaterialTextView materialTextView = w0.f28843p;
        Object[] objArr = new Object[2];
        objArr[0] = rz1.f44501a.mo65772b();
        if (d != null) {
            d2 = d.doubleValue();
        }
        objArr[1] = ol0.m70374p(sz1.m72124a(d2), 5, (RoundingMode) null, false, 6, (Object) null);
        materialTextView.setText(swapFragment.getString(R.string.text_swap_current_price, objArr));
    }
}
