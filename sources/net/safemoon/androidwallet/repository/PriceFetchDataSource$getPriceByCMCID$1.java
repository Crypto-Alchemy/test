package net.safemoon.androidwallet.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.repository.PriceFetchDataSource", mo48632f = "PriceFetchDataSource.kt", mo48633l = {22, 45}, mo48634m = "getPriceByCMCID")
/* compiled from: PriceFetchDataSource.kt */
public final class PriceFetchDataSource$getPriceByCMCID$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PriceFetchDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PriceFetchDataSource$getPriceByCMCID$1(PriceFetchDataSource priceFetchDataSource, ns0<? super PriceFetchDataSource$getPriceByCMCID$1> ns0) {
        super(ns0);
        this.this$0 = priceFetchDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo60738e((String[]) null, this);
    }
}
