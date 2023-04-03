package net.safemoon.androidwallet.activity;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lfj7;", "invoke", "()Lfj7;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwitchWalletActivity.kt */
public final class SwitchWalletActivity$walletAdapter$2 extends Lambda implements pc2<fj7> {
    public final /* synthetic */ SwitchWalletActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchWalletActivity$walletAdapter$2(SwitchWalletActivity switchWalletActivity) {
        super(0);
        this.this$0 = switchWalletActivity;
    }

    public final fj7 invoke() {
        SwitchWalletActivity switchWalletActivity = this.this$0;
        Wallet c = ol0.m70351c(switchWalletActivity);
        final SwitchWalletActivity switchWalletActivity2 = this.this$0;
        C82021 r3 = new rc2<Wallet, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Wallet) obj);
                return r37.f33317a;
            }

            public final void invoke(Wallet wallet2) {
                vx2.m53591g(wallet2, "wallet");
                switchWalletActivity2.mo56920Z().mo61245D(wallet2);
                AKTHomeActivity.m64858g1(switchWalletActivity2);
            }
        };
        final SwitchWalletActivity switchWalletActivity3 = this.this$0;
        return new fj7(switchWalletActivity, c, r3, new rc2<Wallet, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Wallet) obj);
                return r37.f33317a;
            }

            public final void invoke(Wallet wallet2) {
                vx2.m53591g(wallet2, "wallet");
                WalletManageActivity.f41504q1.mo56966a(switchWalletActivity3, wallet2);
            }
        }, C82043.INSTANCE);
    }
}
