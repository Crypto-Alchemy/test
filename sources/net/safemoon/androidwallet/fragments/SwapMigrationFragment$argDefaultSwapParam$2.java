package net.safemoon.androidwallet.fragments;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SwapMigrationFragment.kt */
public final class SwapMigrationFragment$argDefaultSwapParam$2 extends Lambda implements pc2<UserTokenItemDisplayModel> {
    public final /* synthetic */ SwapMigrationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationFragment$argDefaultSwapParam$2(SwapMigrationFragment swapMigrationFragment) {
        super(0);
        this.this$0 = swapMigrationFragment;
    }

    public final UserTokenItemDisplayModel invoke() {
        try {
            Serializable serializable = this.this$0.requireArguments().getSerializable("SWAP_DEFAULT_PARAM");
            vx2.m53589e(serializable, "null cannot be cast to non-null type net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel");
            return (UserTokenItemDisplayModel) serializable;
        } catch (Exception unused) {
            return null;
        }
    }
}
