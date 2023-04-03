package com.walletconnect.auth.client;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.lu1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Lbq1;", "event", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.auth.client.AuthProtocol$setResponderDelegate$1", mo48632f = "AuthProtocol.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: AuthProtocol.kt */
public final class AuthProtocol$setResponderDelegate$1 extends SuspendLambda implements fd2<bq1, ns0<? super r37>, Object> {
    public final /* synthetic */ C6324ot $delegate;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthProtocol$setResponderDelegate$1(C6324ot otVar, ns0<? super AuthProtocol$setResponderDelegate$1> ns0) {
        super(2, ns0);
        this.$delegate = otVar;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        AuthProtocol$setResponderDelegate$1 authProtocol$setResponderDelegate$1 = new AuthProtocol$setResponderDelegate$1(this.$delegate, ns0);
        authProtocol$setResponderDelegate$1.L$0 = obj;
        return authProtocol$setResponderDelegate$1;
    }

    public final Object invoke(bq1 bq1, ns0<? super r37> ns0) {
        return ((AuthProtocol$setResponderDelegate$1) create(bq1, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            bq1 bq1 = (bq1) this.L$0;
            if (bq1 instanceof pp0) {
                this.$delegate.mo41566b(vx2.m53591g((pp0) bq1, "<this>"));
            } else if (bq1 instanceof vi5) {
                this.$delegate.mo41567c(vx2.m53591g((vi5) bq1, "<this>"));
            } else if (bq1 instanceof lu1.C6229a) {
                this.$delegate.mo41565a(vx2.m53591g((lu1.C6229a) bq1, "<this>"));
            }
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
