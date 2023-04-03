package net.safemoon.androidwallet.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.dl4;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.repository.LatestCoinDataSource", mo48632f = "LatestCoinDataSource.kt", mo48633l = {37}, mo48634m = "load")
/* compiled from: LatestCoinDataSource.kt */
public final class LatestCoinDataSource$load$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LatestCoinDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LatestCoinDataSource$load$1(LatestCoinDataSource latestCoinDataSource, ns0<? super LatestCoinDataSource$load$1> ns0) {
        super(ns0);
        this.this$0 = latestCoinDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8656f((dl4.C2171a<Integer>) null, this);
    }
}
