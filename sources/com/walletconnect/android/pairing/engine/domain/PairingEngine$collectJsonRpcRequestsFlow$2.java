package com.walletconnect.android.pairing.engine.domain;

import com.walletconnect.android.pairing.model.PairingParams;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Lrf7;", "request", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.android.pairing.engine.domain.PairingEngine$collectJsonRpcRequestsFlow$2", mo48632f = "PairingEngine.kt", mo48633l = {201}, mo48634m = "invokeSuspend")
/* compiled from: PairingEngine.kt */
public final class PairingEngine$collectJsonRpcRequestsFlow$2 extends SuspendLambda implements fd2<rf7, ns0<? super r37>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ PairingEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairingEngine$collectJsonRpcRequestsFlow$2(PairingEngine pairingEngine, ns0<? super PairingEngine$collectJsonRpcRequestsFlow$2> ns0) {
        super(2, ns0);
        this.this$0 = pairingEngine;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        PairingEngine$collectJsonRpcRequestsFlow$2 pairingEngine$collectJsonRpcRequestsFlow$2 = new PairingEngine$collectJsonRpcRequestsFlow$2(this.this$0, ns0);
        pairingEngine$collectJsonRpcRequestsFlow$2.L$0 = obj;
        return pairingEngine$collectJsonRpcRequestsFlow$2;
    }

    public final Object invoke(rf7 rf7, ns0<? super r37> ns0) {
        return ((PairingEngine$collectJsonRpcRequestsFlow$2) create(rf7, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            rf7 rf7 = (rf7) this.L$0;
            rg0 c = rf7.mo47399c();
            if (c instanceof PairingParams.DeleteParams) {
                this.label = 1;
                if (this.this$0.mo40478w(rf7, (PairingParams.DeleteParams) c, this) == d) {
                    return d;
                }
            } else if (c instanceof PairingParams.C5576a) {
                this.this$0.mo40479x(rf7);
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
