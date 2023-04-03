package net.safemoon.androidwallet.fragments;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lho2;", "invoke", "()Lho2;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: WalletFragment.kt */
public final class WalletFragment$iHomeActivity$2 extends Lambda implements pc2<ho2> {
    public final /* synthetic */ WalletFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletFragment$iHomeActivity$2(WalletFragment walletFragment) {
        super(0);
        this.this$0 = walletFragment;
    }

    public final ho2 invoke() {
        if (!(this.this$0.requireActivity() instanceof ho2)) {
            return null;
        }
        FragmentActivity requireActivity = this.this$0.requireActivity();
        vx2.m53589e(requireActivity, "null cannot be cast to non-null type net.safemoon.androidwallet.interfaces.IHomeActivity");
        return (ho2) requireActivity;
    }
}
