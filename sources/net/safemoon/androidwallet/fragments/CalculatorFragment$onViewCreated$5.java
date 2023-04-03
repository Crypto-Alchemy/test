package net.safemoon.androidwallet.fragments;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Ljava/math/BigDecimal;", "it", "Lr37;", "invoke", "(Ljava/math/BigDecimal;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CalculatorFragment.kt */
public final class CalculatorFragment$onViewCreated$5 extends Lambda implements rc2<BigDecimal, r37> {
    public final /* synthetic */ CalculatorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalculatorFragment$onViewCreated$5(CalculatorFragment calculatorFragment) {
        super(1);
        this.this$0 = calculatorFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BigDecimal) obj);
        return r37.f33317a;
    }

    public final void invoke(BigDecimal bigDecimal) {
        if (vx2.m53586b(this.this$0.mo57452j0().mo61013w().getValue(), Boolean.TRUE)) {
            this.this$0.mo57442B0();
            e92 M = this.this$0.f41921y;
            vx2.m53588d(M);
            M.f28436D.setText(this.this$0.getString(R.string.undefined_result));
        } else if (bigDecimal != null && this.this$0.mo57444Y(bigDecimal)) {
            e92 M2 = this.this$0.f41921y;
            vx2.m53588d(M2);
            M2.f28436D.setText(this.this$0.f41913X.format(bigDecimal));
        }
    }
}
