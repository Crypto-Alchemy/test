package net.safemoon.androidwallet.viewmodels.blockChainClass;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime", mo48632f = "BlockTime.kt", mo48633l = {23, 24}, mo48634m = "getBlockTime")
/* compiled from: BlockTime.kt */
public final class BlockTime$getBlockTime$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BlockTime this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockTime$getBlockTime$1(BlockTime blockTime, ns0<? super BlockTime$getBlockTime$1> ns0) {
        super(ns0);
        this.this$0 = blockTime;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61805k(this);
    }
}
