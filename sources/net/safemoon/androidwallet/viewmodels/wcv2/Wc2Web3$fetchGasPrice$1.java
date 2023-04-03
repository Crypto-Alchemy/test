package net.safemoon.androidwallet.viewmodels.wcv2;

import com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.wcv2.Wc2Web3", mo48632f = "Wc2Web3.kt", mo48633l = {68}, mo48634m = "fetchGasPrice")
/* compiled from: Wc2Web3.kt */
public final class Wc2Web3$fetchGasPrice$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Wc2Web3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Wc2Web3$fetchGasPrice$1(Wc2Web3 wc2Web3, ns0<? super Wc2Web3$fetchGasPrice$1> ns0) {
        super(ns0);
        this.this$0 = wc2Web3;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo62036y((WCEthereumTransaction) null, this);
    }
}
