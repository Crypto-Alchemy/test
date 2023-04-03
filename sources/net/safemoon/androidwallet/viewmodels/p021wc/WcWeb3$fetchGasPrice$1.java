package net.safemoon.androidwallet.viewmodels.p021wc;

import com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.wc.WcWeb3", mo48632f = "WcWeb3.kt", mo48633l = {43}, mo48634m = "fetchGasPrice")
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.WcWeb3$fetchGasPrice$1 */
/* compiled from: WcWeb3.kt */
public final class WcWeb3$fetchGasPrice$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WcWeb3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WcWeb3$fetchGasPrice$1(WcWeb3 wcWeb3, ns0<? super WcWeb3$fetchGasPrice$1> ns0) {
        super(ns0);
        this.this$0 = wcWeb3;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo62016y((WCEthereumTransaction) null, this);
    }
}
