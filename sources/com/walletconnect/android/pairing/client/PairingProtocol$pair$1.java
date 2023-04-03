package com.walletconnect.android.pairing.client;

import com.walletconnect.android.pairing.engine.domain.PairingEngine;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.tt0;
import p000.ut0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.android.pairing.client.PairingProtocol$pair$1", mo48632f = "PairingProtocol.kt", mo48633l = {58}, mo48634m = "invokeSuspend")
/* compiled from: PairingProtocol.kt */
public final class PairingProtocol$pair$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ rc2<tt0.C6538c, r37> $onError;
    public final /* synthetic */ rc2<ut0.C6577b, r37> $onSuccess;
    public final /* synthetic */ ut0.C6577b $pair;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairingProtocol$pair$1(ut0.C6577b bVar, rc2<? super tt0.C6538c, r37> rc2, rc2<? super ut0.C6577b, r37> rc22, ns0<? super PairingProtocol$pair$1> ns0) {
        super(2, ns0);
        this.$pair = bVar;
        this.$onError = rc2;
        this.$onSuccess = rc22;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new PairingProtocol$pair$1(this.$pair, this.$onError, this.$onSuccess, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((PairingProtocol$pair$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            PairingProtocol pairingProtocol = PairingProtocol.f27189a;
            final ut0.C6577b bVar = this.$pair;
            final rc2<tt0.C6538c, r37> rc2 = this.$onError;
            final rc2<ut0.C6577b, r37> rc22 = this.$onSuccess;
            C55591 r1 = new pc2<r37>() {
                public final void invoke() {
                    try {
                        PairingEngine e = PairingProtocol.f27190b;
                        if (e == null) {
                            vx2.m53605u("pairingEngine");
                            e = null;
                        }
                        String a = bVar.mo48510a();
                        final rc2<ut0.C6577b, r37> rc2 = rc22;
                        final ut0.C6577b bVar = bVar;
                        C55601 r2 = new pc2<r37>() {
                            public final void invoke() {
                                rc2.invoke(bVar);
                            }
                        };
                        final rc2<tt0.C6538c, r37> rc22 = rc2;
                        e.mo40480y(a, r2, new rc2<Throwable, r37>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Throwable) obj);
                                return r37.f33317a;
                            }

                            public final void invoke(Throwable th) {
                                vx2.m53591g(th, "error");
                                rc22.invoke(new tt0.C6538c(th));
                            }
                        });
                    } catch (Exception e2) {
                        rc2.invoke(new tt0.C6538c(e2));
                    }
                }
            };
            final rc2<tt0.C6538c, r37> rc23 = this.$onError;
            C55622 r3 = new rc2<Throwable, r37>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return r37.f33317a;
                }

                public final void invoke(Throwable th) {
                    vx2.m53591g(th, "throwable");
                    PairingProtocol.f27189a.mo40457h().mo40252a(th);
                    rc23.invoke(new tt0.C6538c(th));
                }
            };
            this.label = 1;
            if (pairingProtocol.mo40455f(r1, r3, this) == d) {
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
