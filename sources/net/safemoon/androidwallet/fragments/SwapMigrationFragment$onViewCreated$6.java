package net.safemoon.androidwallet.fragments;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/math/BigDecimal;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapMigrationFragment.kt */
public final class SwapMigrationFragment$onViewCreated$6 extends Lambda implements rc2<BigDecimal, r37> {
    public final /* synthetic */ SwapMigrationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationFragment$onViewCreated$6(SwapMigrationFragment swapMigrationFragment) {
        super(1);
        this.this$0 = swapMigrationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BigDecimal) obj);
        return r37.f33317a;
    }

    public final void invoke(BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            SwapMigrationFragment swapMigrationFragment = this.this$0;
            swapMigrationFragment.mo57762F0().mo61456V().postValue(null);
            fe7 j0 = swapMigrationFragment.f42184M;
            if (j0 == null) {
                vx2.m53605u("bindingSource");
                j0 = null;
            }
            j0.f28840m.requestFocus();
            fe7 j02 = swapMigrationFragment.f42184M;
            if (j02 == null) {
                vx2.m53605u("bindingSource");
                j02 = null;
            }
            j02.f28840m.setText(ol0.m70360g0(bigDecimal, 0, 1, (Object) null));
        }
    }
}
