package net.safemoon.androidwallet.fragments;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "total", "Lr37;", "invoke", "(Ljava/lang/Double;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SendtoFragment.kt */
public final class SendtoFragment$onCreateView$5 extends Lambda implements rc2<Double, r37> {
    public final /* synthetic */ SendtoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendtoFragment$onCreateView$5(SendtoFragment sendtoFragment) {
        super(1);
        this.this$0 = sendtoFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Double) obj);
        return r37.f33317a;
    }

    public final void invoke(Double d) {
        if (d != null) {
            ta2 G = this.this$0.f42125y;
            vx2.m53588d(G);
            TextView textView = G.f34198u;
            vx2.m53590f(textView, "binding!!.tvBalance");
            UserTokenItemDisplayModel I = this.this$0.f42110A;
            vx2.m53588d(I);
            double nativeBalance = I.getNativeBalance();
            UserTokenItemDisplayModel I2 = this.this$0.f42110A;
            vx2.m53588d(I2);
            ol0.m70339S(textView, nativeBalance, I2.getSymbol());
        }
    }
}
