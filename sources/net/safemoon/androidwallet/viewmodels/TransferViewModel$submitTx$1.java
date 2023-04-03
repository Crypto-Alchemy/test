package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import net.safemoon.androidwallet.viewmodels.TransferViewModel;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.TransferViewModel", mo48632f = "TransferViewModel.kt", mo48633l = {352, 354, 381, 396, 438, 455, 468, 483}, mo48634m = "submitTx")
/* compiled from: TransferViewModel.kt */
public final class TransferViewModel$submitTx$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TransferViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferViewModel$submitTx$1(TransferViewModel transferViewModel, ns0<? super TransferViewModel$submitTx$1> ns0) {
        super(ns0);
        this.this$0 = transferViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61770s((IToken) null, (TransferViewModel.C8863b) null, this);
    }
}
