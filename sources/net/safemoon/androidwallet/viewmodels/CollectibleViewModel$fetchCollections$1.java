package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CollectibleViewModel", mo48632f = "CollectibleViewModel.kt", mo48633l = {495, 516, 532, 538, 543, 553, 574, 590, 598, 600, 607, 612, 625, 626, 633, 646}, mo48634m = "fetchCollections")
/* compiled from: CollectibleViewModel.kt */
public final class CollectibleViewModel$fetchCollections$1 extends ContinuationImpl {
    public int I$0;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CollectibleViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleViewModel$fetchCollections$1(CollectibleViewModel collectibleViewModel, ns0<? super CollectibleViewModel$fetchCollections$1> ns0) {
        super(ns0);
        this.this$0 = collectibleViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61067u(0, 0, 0, this);
    }
}
