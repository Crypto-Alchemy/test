package com.walletconnect.sign.engine.domain;

import com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Les6;", "topic", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.sign.engine.domain.SignEngine$setupSequenceExpiration$2", mo48632f = "SignEngine.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: SignEngine.kt */
public final class SignEngine$setupSequenceExpiration$2 extends SuspendLambda implements fd2<es6, ns0<? super r37>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SignEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignEngine$setupSequenceExpiration$2(SignEngine signEngine, ns0<? super SignEngine$setupSequenceExpiration$2> ns0) {
        super(2, ns0);
        this.this$0 = signEngine;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        SignEngine$setupSequenceExpiration$2 signEngine$setupSequenceExpiration$2 = new SignEngine$setupSequenceExpiration$2(this.this$0, ns0);
        signEngine$setupSequenceExpiration$2.L$0 = obj;
        return signEngine$setupSequenceExpiration$2;
    }

    public final Object invoke(es6 es6, ns0<? super r37> ns0) {
        return ((SignEngine$setupSequenceExpiration$2) create(es6, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            List<String> m = this.this$0.f27660d.mo41510m((es6) this.L$0);
            SignEngine signEngine = this.this$0;
            for (String str : m) {
                JsonRpcInteractorInterface.DefaultImpls.m42234g(signEngine.f27657a, new es6(str), new SignEngine$setupSequenceExpiration$2$1$1(signEngine, str), (rc2) null, 4, (Object) null);
            }
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
