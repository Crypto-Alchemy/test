package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.TransactionHistoryViewModel", mo48632f = "TransactionHistoryViewModel.kt", mo48633l = {115, 115}, mo48634m = "loadPriceAlert")
/* compiled from: TransactionHistoryViewModel.kt */
public final class TransactionHistoryViewModel$loadPriceAlert$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TransactionHistoryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransactionHistoryViewModel$loadPriceAlert$1(TransactionHistoryViewModel transactionHistoryViewModel, ns0<? super TransactionHistoryViewModel$loadPriceAlert$1> ns0) {
        super(ns0);
        this.this$0 = transactionHistoryViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61748n((String) null, (String) null, this);
    }
}
