package com.walletconnect.auth.engine.domain;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "error", "Lr37;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AuthEngine.kt */
public final class AuthEngine$resubscribeToPendingRequestsTopics$2$1 extends Lambda implements rc2<Throwable, r37> {
    public final /* synthetic */ AuthEngine this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "com.walletconnect.auth.engine.domain.AuthEngine$resubscribeToPendingRequestsTopics$2$1$1", mo48632f = "AuthEngine.kt", mo48633l = {261}, mo48634m = "invokeSuspend")
    /* renamed from: com.walletconnect.auth.engine.domain.AuthEngine$resubscribeToPendingRequestsTopics$2$1$1 */
    /* compiled from: AuthEngine.kt */
    public static final class C55941 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C55941(authEngine, th, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C55941) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                r04 g = authEngine.f27336m;
                vi5 vi5 = new vi5(new InternalError(th));
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthEngine$resubscribeToPendingRequestsTopics$2$1(AuthEngine authEngine) {
        super(1);
        this.this$0 = authEngine;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return r37.f33317a;
    }

    public final void invoke(final Throwable th) {
        vx2.m53591g(th, "error");
        hu0 a = bh7.m32535a();
        final AuthEngine authEngine = this.this$0;
        y23 unused = d50.m56748b(a, (CoroutineContext) null, (CoroutineStart) null, new C55941((ns0<? super C55941>) null), 3, (Object) null);
    }
}
