package net.safemoon.androidwallet.fragments.walletconnect;

import androidx.lifecycle.C0729l;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lad7;", "VM", "Landroidx/lifecycle/l$b;", "invoke", "()Landroidx/lifecycle/l$b;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: net.safemoon.androidwallet.fragments.walletconnect.WalletConnectDetailFragment$special$$inlined$navGraphViewModels$default$3 */
/* compiled from: NavGraphViewModelLazy.kt */
public final class C8583x5e970d46 extends Lambda implements pc2<C0729l.C0733b> {
    public final /* synthetic */ ef3 $backStackEntry;
    public final /* synthetic */ i93 $backStackEntry$metadata;
    public final /* synthetic */ pc2 $factoryProducer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8583x5e970d46(pc2 pc2, ef3 ef3, i93 i93) {
        super(0);
        this.$factoryProducer = pc2;
        this.$backStackEntry = ef3;
        this.$backStackEntry$metadata = i93;
    }

    public final C0729l.C0733b invoke() {
        C0729l.C0733b bVar;
        pc2 pc2 = this.$factoryProducer;
        if (pc2 != null && (bVar = (C0729l.C0733b) pc2.invoke()) != null) {
            return bVar;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.$backStackEntry.getValue();
        vx2.m53587c(navBackStackEntry, "backStackEntry");
        C0729l.C0733b defaultViewModelProviderFactory = navBackStackEntry.getDefaultViewModelProviderFactory();
        vx2.m53587c(defaultViewModelProviderFactory, "backStackEntry.defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}
