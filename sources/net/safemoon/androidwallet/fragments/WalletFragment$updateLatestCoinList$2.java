package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.Coin;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo44877d2 = {"Lcl4;", "Lnet/safemoon/androidwallet/model/Coin;", "it", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.fragments.WalletFragment$updateLatestCoinList$2", mo48632f = "WalletFragment.kt", mo48633l = {266}, mo48634m = "invokeSuspend")
/* compiled from: WalletFragment.kt */
public final class WalletFragment$updateLatestCoinList$2 extends SuspendLambda implements fd2<cl4<Coin>, ns0<? super r37>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ WalletFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletFragment$updateLatestCoinList$2(WalletFragment walletFragment, ns0<? super WalletFragment$updateLatestCoinList$2> ns0) {
        super(2, ns0);
        this.this$0 = walletFragment;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        WalletFragment$updateLatestCoinList$2 walletFragment$updateLatestCoinList$2 = new WalletFragment$updateLatestCoinList$2(this.this$0, ns0);
        walletFragment$updateLatestCoinList$2.L$0 = obj;
        return walletFragment$updateLatestCoinList$2;
    }

    public final Object invoke(cl4<Coin> cl4, ns0<? super r37> ns0) {
        return ((WalletFragment$updateLatestCoinList$2) create(cl4, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            cl4 cl4 = (cl4) this.L$0;
            bi0 B = this.this$0.f42276B;
            if (B != null) {
                this.label = 1;
                if (B.mo8739e(cl4, this) == d) {
                    return d;
                }
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
