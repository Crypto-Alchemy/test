package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CMCListViewModel", mo48632f = "CMCListViewModel.kt", mo48633l = {47, 51}, mo48634m = "getCMCCoin")
/* compiled from: CMCListViewModel.kt */
public final class CMCListViewModel$getCMCCoin$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CMCListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CMCListViewModel$getCMCCoin$1(CMCListViewModel cMCListViewModel, ns0<? super CMCListViewModel$getCMCCoin$1> ns0) {
        super(ns0);
        this.this$0 = cMCListViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo60979n(this);
    }
}
