package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SwapViewModel", mo48632f = "SwapViewModel.kt", mo48633l = {1477, 1489}, mo48634m = "getBestTradeForExact")
/* compiled from: SwapViewModel.kt */
public final class SwapViewModel$getBestTradeForExact$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SwapViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapViewModel$getBestTradeForExact$1(SwapViewModel swapViewModel, ns0<? super SwapViewModel$getBestTradeForExact$1> ns0) {
        super(ns0);
        this.this$0 = swapViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61586T((SwapViewModel.C8786a) null, this);
    }
}
