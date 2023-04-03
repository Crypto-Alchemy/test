package com.walletconnect.android.pairing.client;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aq1;
import p000.ll4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Laq1;", "event", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.android.pairing.client.PairingProtocol$setDelegate$1", mo48632f = "PairingProtocol.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: PairingProtocol.kt */
public final class PairingProtocol$setDelegate$1 extends SuspendLambda implements fd2<aq1, ns0<? super r37>, Object> {
    public final /* synthetic */ ll4.C6221a $delegate;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairingProtocol$setDelegate$1(ll4.C6221a aVar, ns0<? super PairingProtocol$setDelegate$1> ns0) {
        super(2, ns0);
        this.$delegate = aVar;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        PairingProtocol$setDelegate$1 pairingProtocol$setDelegate$1 = new PairingProtocol$setDelegate$1(this.$delegate, ns0);
        pairingProtocol$setDelegate$1.L$0 = obj;
        return pairingProtocol$setDelegate$1;
    }

    public final Object invoke(aq1 aq1, ns0<? super r37> ns0) {
        return ((PairingProtocol$setDelegate$1) create(aq1, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            aq1 aq1 = (aq1) this.L$0;
            if (aq1 instanceof aq1.C3819a) {
                this.$delegate.mo45446e(vx2.m53591g((aq1.C3819a) aq1, "<this>"));
            }
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
