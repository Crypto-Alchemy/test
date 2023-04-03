package net.safemoon.androidwallet.fragments;

import android.widget.TextView;
import com.google.android.material.textview.MaterialTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "total", "Lr37;", "invoke", "(Ljava/lang/Double;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapMigrationFragment.kt */
public final class SwapMigrationFragment$onViewCreated$2 extends Lambda implements rc2<Double, r37> {
    public final /* synthetic */ SwapMigrationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationFragment$onViewCreated$2(SwapMigrationFragment swapMigrationFragment) {
        super(1);
        this.this$0 = swapMigrationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Double) obj);
        return r37.f33317a;
    }

    public final void invoke(Double d) {
        if (d != null) {
            xa2 h0 = this.this$0.f42181H;
            xa2 xa2 = null;
            if (h0 == null) {
                vx2.m53605u("binding");
                h0 = null;
            }
            TextView textView = h0.f35562E;
            vx2.m53590f(textView, "binding.txtSymbol");
            ol0.m70342V(textView);
            xa2 h02 = this.this$0.f42181H;
            if (h02 == null) {
                vx2.m53605u("binding");
            } else {
                xa2 = h02;
            }
            MaterialTextView materialTextView = xa2.f35559B;
            vx2.m53590f(materialTextView, "binding.tvTotal");
            ol0.m70333M(materialTextView, d.doubleValue(), false);
        }
    }
}
