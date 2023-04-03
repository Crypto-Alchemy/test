package net.safemoon.androidwallet.fragments;

import android.content.res.Resources;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CalculatorFragment.kt */
public final class CalculatorFragment$onViewCreated$9 extends Lambda implements rc2<Integer, r37> {
    public final /* synthetic */ CalculatorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalculatorFragment$onViewCreated$9(CalculatorFragment calculatorFragment) {
        super(1);
        this.this$0 = calculatorFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Integer) obj);
        return r37.f33317a;
    }

    public final void invoke(Integer num) {
        e92 M;
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (num != null && num.intValue() == R.id.btnBag) {
            e92 M2 = this.this$0.f41921y;
            if (M2 != null && (materialButton2 = M2.f28456m) != null) {
                materialButton2.setIcon(uf5.m28223f(materialButton2.getResources(), R.drawable.ic_money_bag, (Resources.Theme) null));
                materialButton2.setText("");
            }
        } else if (num != null && num.intValue() == R.id.btnPercentageOfTraditional && (M = this.this$0.f41921y) != null && (materialButton = M.f28456m) != null) {
            materialButton.setIconResource(0);
            materialButton.setText("%");
        }
    }
}
