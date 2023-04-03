package net.safemoon.androidwallet.activity;

import android.content.DialogInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/content/DialogInterface;", "<anonymous parameter 0>", "Lr37;", "invoke", "(Landroid/content/DialogInterface;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwitchWalletActivity.kt */
public final class SwitchWalletActivity$touchListener$2$1$1$1 extends Lambda implements rc2<DialogInterface, r37> {
    public final /* synthetic */ List<Wallet> $it;
    public final /* synthetic */ int $position;
    public final /* synthetic */ SwitchWalletActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchWalletActivity$touchListener$2$1$1$1(SwitchWalletActivity switchWalletActivity, List<Wallet> list, int i) {
        super(1);
        this.this$0 = switchWalletActivity;
        this.$it = list;
        this.$position = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DialogInterface) obj);
        return r37.f33317a;
    }

    public final void invoke(DialogInterface dialogInterface) {
        vx2.m53591g(dialogInterface, "<anonymous parameter 0>");
        this.this$0.mo56920Z().mo61255q(this.$it.get(this.$position));
    }
}
