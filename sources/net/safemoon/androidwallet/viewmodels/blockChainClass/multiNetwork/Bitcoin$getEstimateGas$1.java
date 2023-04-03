package net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Bitcoin", mo48632f = "Bitcoin.kt", mo48633l = {113}, mo48634m = "getEstimateGas")
/* compiled from: Bitcoin.kt */
public final class Bitcoin$getEstimateGas$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Bitcoin this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Bitcoin$getEstimateGas$1(Bitcoin bitcoin, ns0<? super Bitcoin$getEstimateGas$1> ns0) {
        super(ns0);
        this.this$0 = bitcoin;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo56294e(Utils.DOUBLE_EPSILON, (String) null, (String) null, 0, this);
    }
}
