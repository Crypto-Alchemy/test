package net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.EVM", mo48632f = "EVM.kt", mo48633l = {44, 49, 56, 66}, mo48634m = "getEstimateGas")
/* compiled from: EVM.kt */
public final class EVM$getEstimateGas$1 extends ContinuationImpl {
    public double D$0;
    public double D$1;
    public double D$2;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EVM this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EVM$getEstimateGas$1(EVM evm, ns0<? super EVM$getEstimateGas$1> ns0) {
        super(ns0);
        this.this$0 = evm;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo56294e(Utils.DOUBLE_EPSILON, (String) null, (String) null, 0, this);
    }
}
