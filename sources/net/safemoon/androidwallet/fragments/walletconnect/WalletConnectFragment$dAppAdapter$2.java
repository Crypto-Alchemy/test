package net.safemoon.androidwallet.fragments.walletconnect;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfoAndWallet;
import p000.qg7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lgz0;", "invoke", "()Lgz0;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: WalletConnectFragment.kt */
public final class WalletConnectFragment$dAppAdapter$2 extends Lambda implements pc2<gz0> {
    public final /* synthetic */ WalletConnectFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnectFragment$dAppAdapter$2(WalletConnectFragment walletConnectFragment) {
        super(0);
        this.this$0 = walletConnectFragment;
    }

    public final gz0 invoke() {
        Context applicationContext = this.this$0.requireActivity().getApplicationContext();
        vx2.m53590f(applicationContext, "requireActivity().applicationContext");
        final WalletConnectFragment walletConnectFragment = this.this$0;
        return new gz0(applicationContext, new rc2<RoomConnectedInfoAndWallet, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((RoomConnectedInfoAndWallet) obj);
                return r37.f33317a;
            }

            public final void invoke(RoomConnectedInfoAndWallet roomConnectedInfoAndWallet) {
                vx2.m53591g(roomConnectedInfoAndWallet, "it");
                WalletConnectFragment walletConnectFragment = walletConnectFragment;
                qg7.C9214a a = qg7.m71260a(roomConnectedInfoAndWallet.getDApp());
                vx2.m53590f(a, "actionToWalletConnectDetailFragment(it.dApp)");
                walletConnectFragment.mo50754k(a, true);
            }
        });
    }
}
