package net.safemoon.androidwallet.dialogs;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.dialogs.WalletConnectInterfaceFragment;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/content/DialogInterface;", "it", "Lr37;", "invoke", "(Landroid/content/DialogInterface;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: WalletConnectInterfaceFragment.kt */
public final class WalletConnectInterfaceFragment$onViewCreated$2$4$1 extends Lambda implements rc2<DialogInterface, r37> {
    public final /* synthetic */ WalletConnectInterfaceFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnectInterfaceFragment$onViewCreated$2$4$1(WalletConnectInterfaceFragment walletConnectInterfaceFragment) {
        super(1);
        this.this$0 = walletConnectInterfaceFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DialogInterface) obj);
        return r37.f33317a;
    }

    public final void invoke(DialogInterface dialogInterface) {
        vx2.m53591g(dialogInterface, "it");
        WalletConnectInterfaceFragment.C8323b O = this.this$0.f41816e0;
        if (O != null) {
            O.mo57328c(WalletConnectInterfaceFragment.WalletConnectVersion.V1);
        }
    }
}
