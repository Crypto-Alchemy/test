package net.safemoon.androidwallet.viewmodels.blockChainClass;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3", mo48632f = "WalletWeb3.kt", mo48633l = {34}, mo48634m = "fetchGasSuspended")
/* compiled from: WalletWeb3.kt */
public final class WalletWeb3$fetchGasSuspended$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WalletWeb3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletWeb3$fetchGasSuspended$1(WalletWeb3 walletWeb3, ns0<? super WalletWeb3$fetchGasSuspended$1> ns0) {
        super(ns0);
        this.this$0 = walletWeb3;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61875e(this);
    }
}
