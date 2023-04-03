package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$d;", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$d;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$onViewCreated$18 extends Lambda implements rc2<SwapViewModel.C8789d, r37> {
    public final /* synthetic */ SwapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$onViewCreated$18(SwapFragment swapFragment) {
        super(1);
        this.this$0 = swapFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SwapViewModel.C8789d) obj);
        return r37.f33317a;
    }

    public final void invoke(SwapViewModel.C8789d dVar) {
        xa2 u0 = this.this$0.f42150X;
        if (u0 == null) {
            vx2.m53605u("binding");
            u0 = null;
        }
        u0.f35566d.setEnabled(dVar != null && !vx2.m53586b(dVar.mo61645b(), "ERROR"));
    }
}
