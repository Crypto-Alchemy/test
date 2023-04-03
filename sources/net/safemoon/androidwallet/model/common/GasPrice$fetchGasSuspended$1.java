package net.safemoon.androidwallet.model.common;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.model.common.GasPrice", mo48632f = "Gas.kt", mo48633l = {72, 98}, mo48634m = "fetchGasSuspended")
/* compiled from: Gas.kt */
public final class GasPrice$fetchGasSuspended$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GasPrice this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GasPrice$fetchGasSuspended$1(GasPrice gasPrice, ns0<? super GasPrice$fetchGasSuspended$1> ns0) {
        super(ns0);
        this.this$0 = gasPrice;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchGasSuspended(0, (Gas) null, this);
    }
}
