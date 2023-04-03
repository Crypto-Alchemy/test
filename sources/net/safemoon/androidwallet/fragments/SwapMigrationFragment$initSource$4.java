package net.safemoon.androidwallet.fragments;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.textview.MaterialTextView;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/Double;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapMigrationFragment.kt */
public final class SwapMigrationFragment$initSource$4 extends Lambda implements rc2<Double, r37> {
    public final /* synthetic */ SwapMigrationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationFragment$initSource$4(SwapMigrationFragment swapMigrationFragment) {
        super(1);
        this.this$0 = swapMigrationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Double) obj);
        return r37.f33317a;
    }

    public final void invoke(Double d) {
        fe7 j0 = this.this$0.f42184M;
        if (j0 == null) {
            vx2.m53605u("bindingSource");
            j0 = null;
        }
        SwapMigrationFragment swapMigrationFragment = this.this$0;
        double d2 = Utils.DOUBLE_EPSILON;
        if (vx2.m53585a(d, Utils.DOUBLE_EPSILON)) {
            j0.f28843p.setVisibility(4);
        } else {
            j0.f28843p.setVisibility(0);
        }
        MaterialTextView materialTextView = j0.f28843p;
        Object[] objArr = new Object[2];
        objArr[0] = rz1.f44501a.mo65772b();
        if (d != null) {
            d2 = d.doubleValue();
        }
        objArr[1] = ol0.m70374p(sz1.m72124a(d2), 0, (RoundingMode) null, false, 7, (Object) null);
        materialTextView.setText(swapMigrationFragment.getString(R.string.text_swap_current_price, objArr));
    }
}
