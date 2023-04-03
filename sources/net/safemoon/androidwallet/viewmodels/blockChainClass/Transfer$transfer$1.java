package net.safemoon.androidwallet.viewmodels.blockChainClass;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer", mo48632f = "Transfer.kt", mo48633l = {74}, mo48634m = "transfer")
/* compiled from: Transfer.kt */
public final class Transfer$transfer$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Transfer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Transfer$transfer$1(Transfer transfer, ns0<? super Transfer$transfer$1> ns0) {
        super(ns0);
        this.this$0 = transfer;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61872t(this);
    }
}
