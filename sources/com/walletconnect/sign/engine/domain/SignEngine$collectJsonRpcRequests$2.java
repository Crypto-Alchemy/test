package com.walletconnect.sign.engine.domain;

import com.walletconnect.sign.common.model.p016vo.clientsync.session.params.SignParams;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Lrf7;", "request", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.sign.engine.domain.SignEngine$collectJsonRpcRequests$2", mo48632f = "SignEngine.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: SignEngine.kt */
public final class SignEngine$collectJsonRpcRequests$2 extends SuspendLambda implements fd2<rf7, ns0<? super r37>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SignEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignEngine$collectJsonRpcRequests$2(SignEngine signEngine, ns0<? super SignEngine$collectJsonRpcRequests$2> ns0) {
        super(2, ns0);
        this.this$0 = signEngine;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        SignEngine$collectJsonRpcRequests$2 signEngine$collectJsonRpcRequests$2 = new SignEngine$collectJsonRpcRequests$2(this.this$0, ns0);
        signEngine$collectJsonRpcRequests$2.L$0 = obj;
        return signEngine$collectJsonRpcRequests$2;
    }

    public final Object invoke(rf7 rf7, ns0<? super r37> ns0) {
        return ((SignEngine$collectJsonRpcRequests$2) create(rf7, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            rf7 rf7 = (rf7) this.L$0;
            rg0 c = rf7.mo47399c();
            if (c instanceof SignParams.SessionProposeParams) {
                this.this$0.mo41205O(rf7, (SignParams.SessionProposeParams) c);
            } else if (c instanceof SignParams.SessionSettleParams) {
                this.this$0.mo41208R(rf7, (SignParams.SessionSettleParams) c);
            } else if (c instanceof SignParams.SessionRequestParams) {
                this.this$0.mo41206P(rf7, (SignParams.SessionRequestParams) c);
            } else if (c instanceof SignParams.DeleteParams) {
                this.this$0.mo41201K(rf7, (SignParams.DeleteParams) c);
            } else if (c instanceof SignParams.EventParams) {
                this.this$0.mo41202L(rf7, (SignParams.EventParams) c);
            } else if (c instanceof SignParams.UpdateNamespacesParams) {
                this.this$0.mo41210T(rf7, (SignParams.UpdateNamespacesParams) c);
            } else if (c instanceof SignParams.ExtendParams) {
                this.this$0.mo41203M(rf7, (SignParams.ExtendParams) c);
            } else if (c instanceof SignParams.C5625a) {
                this.this$0.mo41200J(rf7);
            }
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
