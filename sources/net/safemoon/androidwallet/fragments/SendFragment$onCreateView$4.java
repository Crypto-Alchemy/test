package net.safemoon.androidwallet.fragments;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "total", "Lr37;", "invoke", "(Ljava/lang/Double;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SendFragment.kt */
public final class SendFragment$onCreateView$4 extends Lambda implements rc2<Double, r37> {
    public final /* synthetic */ SendFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendFragment$onCreateView$4(SendFragment sendFragment) {
        super(1);
        this.this$0 = sendFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Double) obj);
        return r37.f33317a;
    }

    public final void invoke(Double d) {
        if (d != null) {
            qa2 v = this.this$0.f42090r;
            vx2.m53588d(v);
            TextView textView = v.f33037k;
            vx2.m53590f(textView, "binding!!.txtSymbol");
            ol0.m70342V(textView);
            qa2 v2 = this.this$0.f42090r;
            vx2.m53588d(v2);
            TextView textView2 = v2.f33036j;
            vx2.m53590f(textView2, "binding!!.tvWalletBlnc");
            ol0.m70333M(textView2, d.doubleValue(), false);
        }
    }
}
