package com.walletconnect.auth.engine.domain;

import com.walletconnect.android.internal.common.JsonRpcResponse;
import com.walletconnect.android.internal.common.cacao.Cacao;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C6372pt;
import p000.lu1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.auth.engine.domain.AuthEngine$onAuthRequestResponse$3", mo48632f = "AuthEngine.kt", mo48633l = {214}, mo48634m = "invokeSuspend")
/* compiled from: AuthEngine.kt */
public final class AuthEngine$onAuthRequestResponse$3 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ Cacao $cacao;
    public final /* synthetic */ JsonRpcResponse $response;
    public int label;
    public final /* synthetic */ AuthEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthEngine$onAuthRequestResponse$3(AuthEngine authEngine, JsonRpcResponse jsonRpcResponse, Cacao cacao, ns0<? super AuthEngine$onAuthRequestResponse$3> ns0) {
        super(2, ns0);
        this.this$0 = authEngine;
        this.$response = jsonRpcResponse;
        this.$cacao = cacao;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new AuthEngine$onAuthRequestResponse$3(this.this$0, this.$response, this.$cacao, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((AuthEngine$onAuthRequestResponse$3) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            r04 g = this.this$0.f27336m;
            lu1.C6230b bVar = new lu1.C6230b(this.$response.getId(), new C6372pt.C6374b(this.$cacao));
            this.label = 1;
            if (g.emit(bVar, this) == d) {
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
