package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel", mo48632f = "CustomContractTokenViewModel.kt", mo48633l = {227}, mo48634m = "isBlackListed")
/* compiled from: CustomContractTokenViewModel.kt */
public final class CustomContractTokenViewModel$isBlackListed$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CustomContractTokenViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomContractTokenViewModel$isBlackListed$1(CustomContractTokenViewModel customContractTokenViewModel, ns0<? super CustomContractTokenViewModel$isBlackListed$1> ns0) {
        super(ns0);
        this.this$0 = customContractTokenViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61150B((String) null, this);
    }
}
