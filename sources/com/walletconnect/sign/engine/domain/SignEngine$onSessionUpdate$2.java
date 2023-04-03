package com.walletconnect.sign.engine.domain;

import com.walletconnect.android.internal.common.model.EnvelopeType;
import com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface;
import com.walletconnect.sign.common.model.p016vo.clientsync.session.params.SignParams;
import com.walletconnect.sign.engine.model.EngineDO;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SignEngine.kt */
public final class SignEngine$onSessionUpdate$2 extends Lambda implements pc2<r37> {
    public final /* synthetic */ ny2 $irnParams;
    public final /* synthetic */ SignParams.UpdateNamespacesParams $params;
    public final /* synthetic */ rf7 $request;
    public final /* synthetic */ SignEngine this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "com.walletconnect.sign.engine.domain.SignEngine$onSessionUpdate$2$1", mo48632f = "SignEngine.kt", mo48633l = {750}, mo48634m = "invokeSuspend")
    /* renamed from: com.walletconnect.sign.engine.domain.SignEngine$onSessionUpdate$2$1 */
    /* compiled from: SignEngine.kt */
    public static final class C56461 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C56461(signEngine, rf7, updateNamespacesParams, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C56461) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                r04 k = signEngine.f27669m;
                EngineDO.C5671m mVar = new EngineDO.C5671m(rf7.mo47400d(), gq1.m44829l(updateNamespacesParams.mo41149a()));
                this.label = 1;
                if (k.emit(mVar, this) == d) {
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
    public SignEngine$onSessionUpdate$2(SignEngine signEngine, rf7 rf7, ny2 ny2, SignParams.UpdateNamespacesParams updateNamespacesParams) {
        super(0);
        this.this$0 = signEngine;
        this.$request = rf7;
        this.$irnParams = ny2;
        this.$params = updateNamespacesParams;
    }

    public final void invoke() {
        JsonRpcInteractorInterface.DefaultImpls.m42232e(this.this$0.f27657a, this.$request, this.$irnParams, (EnvelopeType) null, (qm4) null, 12, (Object) null);
        hu0 a = bh7.m32535a();
        final SignEngine signEngine = this.this$0;
        final rf7 rf7 = this.$request;
        final SignParams.UpdateNamespacesParams updateNamespacesParams = this.$params;
        y23 unused = d50.m56748b(a, (CoroutineContext) null, (CoroutineStart) null, new C56461((ns0<? super C56461>) null), 3, (Object) null);
    }
}
