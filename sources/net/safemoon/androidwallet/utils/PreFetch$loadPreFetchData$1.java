package net.safemoon.androidwallet.utils;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.utils.PreFetch", mo48632f = "PreFetchData.kt", mo48633l = {48, 49, 51}, mo48634m = "loadPreFetchData")
/* compiled from: PreFetchData.kt */
public final class PreFetch$loadPreFetchData$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PreFetch this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreFetch$loadPreFetchData$1(PreFetch preFetch, ns0<? super PreFetch$loadPreFetchData$1> ns0) {
        super(ns0);
        this.this$0 = preFetch;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo60929d(this);
    }
}
