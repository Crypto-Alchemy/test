package com.walletconnect.sign.client;

import com.walletconnect.sign.engine.model.EngineDO;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Lbq1;", "event", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.sign.client.SignProtocol$setWalletDelegate$1", mo48632f = "SignProtocol.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: SignProtocol.kt */
public final class SignProtocol$setWalletDelegate$1 extends SuspendLambda implements fd2<bq1, ns0<? super r37>, Object> {
    public final /* synthetic */ o16 $delegate;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignProtocol$setWalletDelegate$1(o16 o16, ns0<? super SignProtocol$setWalletDelegate$1> ns0) {
        super(2, ns0);
        this.$delegate = o16;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        SignProtocol$setWalletDelegate$1 signProtocol$setWalletDelegate$1 = new SignProtocol$setWalletDelegate$1(this.$delegate, ns0);
        signProtocol$setWalletDelegate$1.L$0 = obj;
        return signProtocol$setWalletDelegate$1;
    }

    public final Object invoke(bq1 bq1, ns0<? super r37> ns0) {
        return ((SignProtocol$setWalletDelegate$1) create(bq1, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            bq1 bq1 = (bq1) this.L$0;
            if (bq1 instanceof EngineDO.C5667j) {
                this.$delegate.mo41568a(vx2.m53591g((EngineDO.C5667j) bq1, "<this>"));
            } else if (bq1 instanceof EngineDO.C5669l) {
                this.$delegate.mo41574g(og0.m49297f((EngineDO.C5669l) bq1));
            } else if (bq1 instanceof EngineDO.C5663f) {
                this.$delegate.mo41569b(vx2.m53591g((EngineDO.C5663f) bq1, "<this>"));
            } else if (bq1 instanceof EngineDO.C5675o) {
                this.$delegate.mo41573f(og0.m49298g((EngineDO.C5675o) bq1));
            } else if (bq1 instanceof EngineDO.C5672n) {
                this.$delegate.mo41571d(og0.m49299h((EngineDO.C5672n) bq1));
            } else if (bq1 instanceof pp0) {
                this.$delegate.mo41572e(vx2.m53591g((pp0) bq1, "<this>"));
            } else if (bq1 instanceof vi5) {
                this.$delegate.mo41570c(vx2.m53591g((vi5) bq1, "<this>"));
            }
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
