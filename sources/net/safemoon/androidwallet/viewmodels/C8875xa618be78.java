package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.viewmodels.TransferViewModel$getTransactionStatus$1;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.TransferViewModel$getTransactionStatus$1$1", mo48632f = "TransferViewModel.kt", mo48633l = {242}, mo48634m = "invokeSuspend$loadSolTransactionStatus")
/* renamed from: net.safemoon.androidwallet.viewmodels.TransferViewModel$getTransactionStatus$1$1$loadSolTransactionStatus$1 */
/* compiled from: TransferViewModel.kt */
public final class C8875xa618be78 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public C8875xa618be78(ns0<? super C8875xa618be78> ns0) {
        super(ns0);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TransferViewModel$getTransactionStatus$1.C88701.m69132a((TokenType) null, (String) null, (TransferViewModel) null, this);
    }
}
