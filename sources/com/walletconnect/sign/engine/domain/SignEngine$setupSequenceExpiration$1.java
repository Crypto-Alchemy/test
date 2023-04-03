package com.walletconnect.sign.engine.domain;

import com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Les6;", "sessionTopic", "Lr37;", "invoke", "(Les6;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SignEngine.kt */
public final class SignEngine$setupSequenceExpiration$1 extends Lambda implements rc2<es6, r37> {
    public final /* synthetic */ SignEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignEngine$setupSequenceExpiration$1(SignEngine signEngine) {
        super(1);
        this.this$0 = signEngine;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((es6) obj);
        return r37.f33317a;
    }

    public final void invoke(final es6 es6) {
        vx2.m53591g(es6, "sessionTopic");
        JsonRpcInteractorInterface f = this.this$0.f27657a;
        final SignEngine signEngine = this.this$0;
        JsonRpcInteractorInterface.DefaultImpls.m42234g(f, es6, new pc2<r37>() {
            public final void invoke() {
                signEngine.f27660d.mo41508k(es6);
                signEngine.f27659c.mo47352a(es6.mo42395a());
            }
        }, (rc2) null, 4, (Object) null);
    }
}
