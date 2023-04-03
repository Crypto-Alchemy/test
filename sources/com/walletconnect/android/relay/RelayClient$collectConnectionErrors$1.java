package com.walletconnect.android.relay;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.ec5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Lec5$b;", "event", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.android.relay.RelayClient$collectConnectionErrors$1", mo48632f = "RelayClient.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: RelayClient.kt */
public final class RelayClient$collectConnectionErrors$1 extends SuspendLambda implements fd2<ec5.C5775b, ns0<? super r37>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public RelayClient$collectConnectionErrors$1(ns0<? super RelayClient$collectConnectionErrors$1> ns0) {
        super(2, ns0);
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        RelayClient$collectConnectionErrors$1 relayClient$collectConnectionErrors$1 = new RelayClient$collectConnectionErrors$1(ns0);
        relayClient$collectConnectionErrors$1.L$0 = obj;
        return relayClient$collectConnectionErrors$1;
    }

    public final Object invoke(ec5.C5775b bVar, ns0<? super r37> ns0) {
        return ((RelayClient$collectConnectionErrors$1) create(bVar, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            ec5.C5775b bVar = (ec5.C5775b) this.L$0;
            RelayClient relayClient = RelayClient.f27245g;
            relayClient.mo40735h().log(String.valueOf(bVar));
            relayClient.mo40538y(bVar);
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
