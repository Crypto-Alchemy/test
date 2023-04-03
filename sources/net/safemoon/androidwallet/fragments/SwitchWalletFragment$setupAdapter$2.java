package net.safemoon.androidwallet.fragments;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.activity.WalletManageActivity;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/wallets/Wallet;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwitchWalletFragment.kt */
public final class SwitchWalletFragment$setupAdapter$2 extends Lambda implements rc2<Wallet, r37> {
    public final /* synthetic */ SwitchWalletFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchWalletFragment$setupAdapter$2(SwitchWalletFragment switchWalletFragment) {
        super(1);
        this.this$0 = switchWalletFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Wallet) obj);
        return r37.f33317a;
    }

    public final void invoke(Wallet wallet2) {
        vx2.m53591g(wallet2, "wallet");
        WalletManageActivity.C8206a aVar = WalletManageActivity.f41504q1;
        Context requireContext = this.this$0.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        aVar.mo56966a(requireContext, wallet2);
    }
}
