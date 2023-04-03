package com.walletconnect.android.pairing.engine.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.android.pairing.engine.domain.PairingEngine$resubscribeToPairingFlow$2$2", mo48632f = "PairingEngine.kt", mo48633l = {214}, mo48634m = "invokeSuspend")
/* compiled from: PairingEngine.kt */
public final class PairingEngine$resubscribeToPairingFlow$2$2 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {

    /* renamed from: $e */
    public final /* synthetic */ Exception f27216$e;
    public int label;
    public final /* synthetic */ PairingEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairingEngine$resubscribeToPairingFlow$2$2(PairingEngine pairingEngine, Exception exc, ns0<? super PairingEngine$resubscribeToPairingFlow$2$2> ns0) {
        super(2, ns0);
        this.this$0 = pairingEngine;
        this.f27216$e = exc;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new PairingEngine$resubscribeToPairingFlow$2$2(this.this$0, this.f27216$e, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((PairingEngine$resubscribeToPairingFlow$2$2) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            r04<InternalError> p = this.this$0.mo40471p();
            InternalError internalError = new InternalError(this.f27216$e);
            this.label = 1;
            if (p.emit(internalError, this) == d) {
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
