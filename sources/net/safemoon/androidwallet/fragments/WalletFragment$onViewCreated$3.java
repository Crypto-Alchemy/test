package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.fragments.WalletFragment$onViewCreated$3", mo48632f = "WalletFragment.kt", mo48633l = {168}, mo48634m = "invokeSuspend")
/* compiled from: WalletFragment.kt */
public final class WalletFragment$onViewCreated$3 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ WalletFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletFragment$onViewCreated$3(WalletFragment walletFragment, ns0<? super WalletFragment$onViewCreated$3> ns0) {
        super(2, ns0);
        this.this$0 = walletFragment;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new WalletFragment$onViewCreated$3(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((WalletFragment$onViewCreated$3) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            WalletFragment walletFragment = this.this$0;
            this.label = 1;
            if (walletFragment.mo57939c0(this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
