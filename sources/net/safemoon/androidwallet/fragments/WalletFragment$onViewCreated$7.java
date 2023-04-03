package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.vh7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "isOpen", "Lr37;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: WalletFragment.kt */
public final class WalletFragment$onViewCreated$7 extends Lambda implements rc2<Boolean, r37> {
    public final /* synthetic */ WalletFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletFragment$onViewCreated$7(WalletFragment walletFragment) {
        super(1);
        this.this$0 = walletFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return r37.f33317a;
    }

    public final void invoke(Boolean bool) {
        vx2.m53590f(bool, "isOpen");
        if (bool.booleanValue()) {
            WalletFragment walletFragment = this.this$0;
            vh7.C9457a g = vh7.m73246g(true);
            vx2.m53590f(g, "actionNavigationWalletToTokenListFragment(true)");
            walletFragment.mo50753j(g);
            this.this$0.mo57931L().mo61231m().postValue(Boolean.FALSE);
        }
    }
}
