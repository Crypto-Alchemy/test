package net.safemoon.androidwallet.activity;

import android.text.Editable;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: WalletManageActivity.kt */
public final class WalletManageActivity$onPostCreate$1$1$2$1$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ Editable $it;
    public final /* synthetic */ WalletManageActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletManageActivity$onPostCreate$1$1$2$1$1(WalletManageActivity walletManageActivity, Editable editable) {
        super(0);
        this.this$0 = walletManageActivity;
        this.$it = editable;
    }

    public final void invoke() {
        Wallet S0 = this.this$0.mo56960t1();
        if (S0 != null) {
            Editable editable = this.$it;
            WalletManageActivity walletManageActivity = this.this$0;
            S0.setName(StringsKt__StringsKt.m63090V0(editable).toString());
            walletManageActivity.f8530x.mo61246E(S0);
            if (S0.isLinked()) {
                walletManageActivity.f41520e1 = true;
                walletManageActivity.mo56964y1(S0);
                return;
            }
            walletManageActivity.f8528r.mo22266k();
            walletManageActivity.onBackPressed();
        }
    }
}
