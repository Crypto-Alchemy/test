package net.safemoon.androidwallet.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.dl4;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.repository.TransactionDataSource", mo48632f = "TransactionDataSource.kt", mo48633l = {56, 95, 161, 193, 200, 255}, mo48634m = "load")
/* compiled from: TransactionDataSource.kt */
public final class TransactionDataSource$load$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TransactionDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransactionDataSource$load$1(TransactionDataSource transactionDataSource, ns0<? super TransactionDataSource$load$1> ns0) {
        super(ns0);
        this.this$0 = transactionDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8656f((dl4.C2171a<Integer>) null, this);
    }
}
