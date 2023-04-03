package com.walletconnect.auth.engine.domain;

import com.walletconnect.auth.common.json_rpc.AuthParams;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Lrf7;", "request", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.auth.engine.domain.AuthEngine$collectJsonRpcRequests$2", mo48632f = "AuthEngine.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: AuthEngine.kt */
public final class AuthEngine$collectJsonRpcRequests$2 extends SuspendLambda implements fd2<rf7, ns0<? super r37>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AuthEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthEngine$collectJsonRpcRequests$2(AuthEngine authEngine, ns0<? super AuthEngine$collectJsonRpcRequests$2> ns0) {
        super(2, ns0);
        this.this$0 = authEngine;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        AuthEngine$collectJsonRpcRequests$2 authEngine$collectJsonRpcRequests$2 = new AuthEngine$collectJsonRpcRequests$2(this.this$0, ns0);
        authEngine$collectJsonRpcRequests$2.L$0 = obj;
        return authEngine$collectJsonRpcRequests$2;
    }

    public final Object invoke(rf7 rf7, ns0<? super r37> ns0) {
        return ((AuthEngine$collectJsonRpcRequests$2) create(rf7, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            rf7 rf7 = (rf7) this.L$0;
            AuthEngine authEngine = this.this$0;
            rg0 c = rf7.mo47399c();
            vx2.m53589e(c, "null cannot be cast to non-null type com.walletconnect.auth.common.json_rpc.AuthParams.RequestParams");
            authEngine.mo40677s(rf7, (AuthParams.RequestParams) c);
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
