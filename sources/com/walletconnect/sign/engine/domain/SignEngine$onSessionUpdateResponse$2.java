package com.walletconnect.sign.engine.domain;

import com.walletconnect.sign.engine.model.EngineDO;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SignEngine.kt */
public final class SignEngine$onSessionUpdateResponse$2 extends Lambda implements pc2<r37> {
    public final /* synthetic */ SignEngine this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "com.walletconnect.sign.engine.domain.SignEngine$onSessionUpdateResponse$2$1", mo48632f = "SignEngine.kt", mo48633l = {901}, mo48634m = "invokeSuspend")
    /* renamed from: com.walletconnect.sign.engine.domain.SignEngine$onSessionUpdateResponse$2$1 */
    /* compiled from: SignEngine.kt */
    public static final class C56481 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C56481(signEngine, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C56481) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                r04 k = signEngine.f27669m;
                EngineDO.C5672n.C5673a aVar = new EngineDO.C5672n.C5673a("Unable to update the session");
                this.label = 1;
                if (k.emit(aVar, this) == d) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignEngine$onSessionUpdateResponse$2(SignEngine signEngine) {
        super(0);
        this.this$0 = signEngine;
    }

    public final void invoke() {
        hu0 a = bh7.m32535a();
        final SignEngine signEngine = this.this$0;
        y23 unused = d50.m56748b(a, (CoroutineContext) null, (CoroutineStart) null, new C56481((ns0<? super C56481>) null), 3, (Object) null);
    }
}
