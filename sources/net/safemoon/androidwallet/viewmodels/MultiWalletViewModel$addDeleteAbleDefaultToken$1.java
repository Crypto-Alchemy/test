package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MultiWalletViewModel", mo48632f = "MultiWalletViewModel.kt", mo48633l = {294}, mo48634m = "addDeleteAbleDefaultToken")
/* compiled from: MultiWalletViewModel.kt */
public final class MultiWalletViewModel$addDeleteAbleDefaultToken$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MultiWalletViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiWalletViewModel$addDeleteAbleDefaultToken$1(MultiWalletViewModel multiWalletViewModel, ns0<? super MultiWalletViewModel$addDeleteAbleDefaultToken$1> ns0) {
        super(ns0);
        this.this$0 = multiWalletViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61252l(false, this);
    }
}
