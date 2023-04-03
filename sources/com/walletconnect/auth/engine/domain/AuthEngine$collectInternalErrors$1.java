package com.walletconnect.auth.engine.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Ljava/lang/InternalError;", "exception", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.auth.engine.domain.AuthEngine$collectInternalErrors$1", mo48632f = "AuthEngine.kt", mo48633l = {274}, mo48634m = "invokeSuspend")
/* compiled from: AuthEngine.kt */
public final class AuthEngine$collectInternalErrors$1 extends SuspendLambda implements fd2<InternalError, ns0<? super r37>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AuthEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthEngine$collectInternalErrors$1(AuthEngine authEngine, ns0<? super AuthEngine$collectInternalErrors$1> ns0) {
        super(2, ns0);
        this.this$0 = authEngine;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        AuthEngine$collectInternalErrors$1 authEngine$collectInternalErrors$1 = new AuthEngine$collectInternalErrors$1(this.this$0, ns0);
        authEngine$collectInternalErrors$1.L$0 = obj;
        return authEngine$collectInternalErrors$1;
    }

    public final Object invoke(InternalError internalError, ns0<? super r37> ns0) {
        return ((AuthEngine$collectInternalErrors$1) create(internalError, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            r04 g = this.this$0.f27336m;
            vi5 vi5 = new vi5((InternalError) this.L$0);
            this.label = 1;
            if (g.emit(vi5, this) == d) {
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
