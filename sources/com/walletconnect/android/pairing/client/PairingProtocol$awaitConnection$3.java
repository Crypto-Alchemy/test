package com.walletconnect.android.pairing.client;

import com.walletconnect.android.CoreClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.android.pairing.client.PairingProtocol$awaitConnection$3", mo48632f = "PairingProtocol.kt", mo48633l = {128}, mo48634m = "invokeSuspend")
/* compiled from: PairingProtocol.kt */
public final class PairingProtocol$awaitConnection$3 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ pc2<r37> $onConnection;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairingProtocol$awaitConnection$3(pc2<r37> pc2, ns0<? super PairingProtocol$awaitConnection$3> ns0) {
        super(2, ns0);
        this.$onConnection = pc2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new PairingProtocol$awaitConnection$3(this.$onConnection, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((PairingProtocol$awaitConnection$3) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0 || i == 1) {
            hg5.m45199b(obj);
            while (!CoreClient.f27008a.mo40080c().mo40533a().getValue().booleanValue()) {
                this.label = 1;
                if (jb1.m59336a(100, this) == d) {
                    return d;
                }
            }
            this.$onConnection.invoke();
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
