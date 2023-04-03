package net.safemoon.androidwallet.fragments;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/math/BigDecimal;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$onViewCreated$14 extends Lambda implements rc2<BigDecimal, r37> {
    public final /* synthetic */ SwapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$onViewCreated$14(SwapFragment swapFragment) {
        super(1);
        this.this$0 = swapFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BigDecimal) obj);
        return r37.f33317a;
    }

    public final void invoke(BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            SwapFragment swapFragment = this.this$0;
            swapFragment.mo57712g1().mo61630w0().postValue(null);
            fe7 w0 = swapFragment.f42160q1;
            if (w0 == null) {
                vx2.m53605u("bindingSource");
                w0 = null;
            }
            w0.f28840m.requestFocus();
            fe7 w02 = swapFragment.f42160q1;
            if (w02 == null) {
                vx2.m53605u("bindingSource");
                w02 = null;
            }
            w02.f28840m.setText(ol0.m70360g0(bigDecimal, 0, 1, (Object) null));
        }
    }
}
