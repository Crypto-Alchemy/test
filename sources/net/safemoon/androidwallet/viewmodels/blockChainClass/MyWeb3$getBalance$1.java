package net.safemoon.androidwallet.viewmodels.blockChainClass;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.MyWeb3", mo48632f = "MyWeb3.kt", mo48633l = {59}, mo48634m = "getBalance")
/* compiled from: MyWeb3.kt */
public final class MyWeb3$getBalance$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MyWeb3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyWeb3$getBalance$1(MyWeb3 myWeb3, ns0<? super MyWeb3$getBalance$1> ns0) {
        super(ns0);
        this.this$0 = myWeb3;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61835b(this);
    }
}
