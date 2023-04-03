package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel$c;", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/viewmodels/SwapMigrationViewModel$c;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapMigrationFragment.kt */
public final class SwapMigrationFragment$onViewCreated$10 extends Lambda implements rc2<SwapMigrationViewModel.C8740c, r37> {
    public final /* synthetic */ SwapMigrationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationFragment$onViewCreated$10(SwapMigrationFragment swapMigrationFragment) {
        super(1);
        this.this$0 = swapMigrationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SwapMigrationViewModel.C8740c) obj);
        return r37.f33317a;
    }

    public final void invoke(SwapMigrationViewModel.C8740c cVar) {
        xa2 h0 = this.this$0.f42181H;
        if (h0 == null) {
            vx2.m53605u("binding");
            h0 = null;
        }
        h0.f35566d.setEnabled(cVar != null && !vx2.m53586b(cVar.mo61489a(), "ERROR"));
    }
}
