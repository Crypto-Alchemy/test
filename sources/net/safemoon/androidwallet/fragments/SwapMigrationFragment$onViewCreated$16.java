package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.common.LoadingState;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/common/LoadingState;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/common/LoadingState;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapMigrationFragment.kt */
public final class SwapMigrationFragment$onViewCreated$16 extends Lambda implements rc2<LoadingState, r37> {
    public final /* synthetic */ SwapMigrationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationFragment$onViewCreated$16(SwapMigrationFragment swapMigrationFragment) {
        super(1);
        this.this$0 = swapMigrationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LoadingState) obj);
        return r37.f33317a;
    }

    public final void invoke(LoadingState loadingState) {
        if (loadingState != null) {
            SwapMigrationFragment swapMigrationFragment = this.this$0;
            if (loadingState == LoadingState.Loading) {
                String string = swapMigrationFragment.getString(R.string.swap_approving_title);
                vx2.m53590f(string, "getString(R.string.swap_approving_title)");
                String string2 = swapMigrationFragment.getString(R.string.swap_approving_msg);
                vx2.m53590f(string2, "getString(R.string.swap_approving_msg)");
                swapMigrationFragment.mo57769v1(false, string, string2);
                return;
            }
            swapMigrationFragment.mo57757A0();
        }
    }
}
