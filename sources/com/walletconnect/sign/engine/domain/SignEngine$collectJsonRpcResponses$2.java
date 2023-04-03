package com.walletconnect.sign.engine.domain;

import com.walletconnect.sign.common.model.p016vo.clientsync.session.params.SignParams;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Lsf7;", "response", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.sign.engine.domain.SignEngine$collectJsonRpcResponses$2", mo48632f = "SignEngine.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: SignEngine.kt */
public final class SignEngine$collectJsonRpcResponses$2 extends SuspendLambda implements fd2<sf7, ns0<? super r37>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SignEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignEngine$collectJsonRpcResponses$2(SignEngine signEngine, ns0<? super SignEngine$collectJsonRpcResponses$2> ns0) {
        super(2, ns0);
        this.this$0 = signEngine;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        SignEngine$collectJsonRpcResponses$2 signEngine$collectJsonRpcResponses$2 = new SignEngine$collectJsonRpcResponses$2(this.this$0, ns0);
        signEngine$collectJsonRpcResponses$2.L$0 = obj;
        return signEngine$collectJsonRpcResponses$2;
    }

    public final Object invoke(sf7 sf7, ns0<? super r37> ns0) {
        return ((SignEngine$collectJsonRpcResponses$2) create(sf7, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            sf7 sf7 = (sf7) this.L$0;
            rg0 a = sf7.mo47755a();
            if (a instanceof SignParams.SessionProposeParams) {
                this.this$0.mo41204N(sf7, (SignParams.SessionProposeParams) a);
            } else if (a instanceof SignParams.SessionSettleParams) {
                this.this$0.mo41209S(sf7);
            } else if (a instanceof SignParams.UpdateNamespacesParams) {
                this.this$0.mo41211U(sf7);
            } else if (a instanceof SignParams.SessionRequestParams) {
                this.this$0.mo41207Q(sf7, (SignParams.SessionRequestParams) a);
            }
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
