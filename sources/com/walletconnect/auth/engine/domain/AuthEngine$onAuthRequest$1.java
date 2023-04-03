package com.walletconnect.auth.engine.domain;

import com.walletconnect.auth.common.json_rpc.AuthParams;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.lu1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.auth.engine.domain.AuthEngine$onAuthRequest$1", mo48632f = "AuthEngine.kt", mo48633l = {192}, mo48634m = "invokeSuspend")
/* compiled from: AuthEngine.kt */
public final class AuthEngine$onAuthRequest$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ AuthParams.RequestParams $authParams;
    public final /* synthetic */ rf7 $wcRequest;
    public int label;
    public final /* synthetic */ AuthEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthEngine$onAuthRequest$1(AuthEngine authEngine, rf7 rf7, AuthParams.RequestParams requestParams, ns0<? super AuthEngine$onAuthRequest$1> ns0) {
        super(2, ns0);
        this.this$0 = authEngine;
        this.$wcRequest = rf7;
        this.$authParams = requestParams;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new AuthEngine$onAuthRequest$1(this.this$0, this.$wcRequest, this.$authParams, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((AuthEngine$onAuthRequest$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            r04 g = this.this$0.f27336m;
            lu1.C6229a aVar = new lu1.C6229a(this.$wcRequest.mo47397a(), this.$authParams.mo40619a());
            this.label = 1;
            if (g.emit(aVar, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
