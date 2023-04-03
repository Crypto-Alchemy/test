package net.safemoon.androidwallet.fragments.collectibles;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: TransferNftFragment.kt */
public final class TransferNftFragment$wallet$2 extends Lambda implements pc2<Wallet> {
    public final /* synthetic */ TransferNftFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferNftFragment$wallet$2(TransferNftFragment transferNftFragment) {
        super(0);
        this.this$0 = transferNftFragment;
    }

    public final Wallet invoke() {
        Context requireContext = this.this$0.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        return ol0.m70351c(requireContext);
    }
}
