package com.walletconnect.android.pairing.handler;

import kotlin.Metadata;
import p000.tt0;
import p000.ut0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J&\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&J&\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&J&\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&J#\u0010\u0012\u001a\u00020\u00062\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\"\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, mo44877d2 = {"Lcom/walletconnect/android/pairing/handler/PairingControllerInterface;", "", "Lut0$a;", "activate", "Lkotlin/Function1;", "Ltt0$c;", "Lr37;", "onError", "c", "Lut0$c;", "updateExpiry", "d", "Lut0$d;", "updateMetadata", "f", "", "", "method", "b", "([Ljava/lang/String;)V", "Lxz5;", "Les6;", "e", "()Lxz5;", "topicExpiredFlow", "Lz42;", "Ljava/lang/InternalError;", "a", "()Lz42;", "findWrongMethodsFlow", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PairingControllerInterface.kt */
public interface PairingControllerInterface {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: PairingControllerInterface.kt */
    public static final class DefaultImpls {
        /* renamed from: a */
        public static /* synthetic */ void m42315a(PairingControllerInterface pairingControllerInterface, ut0.C6576a aVar, rc2 rc2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    rc2 = PairingControllerInterface$activate$1.INSTANCE;
                }
                pairingControllerInterface.mo40496c(aVar, rc2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: activate");
        }

        /* renamed from: b */
        public static /* synthetic */ void m42316b(PairingControllerInterface pairingControllerInterface, ut0.C6578c cVar, rc2 rc2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    rc2 = PairingControllerInterface$updateExpiry$1.INSTANCE;
                }
                pairingControllerInterface.mo40497d(cVar, rc2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateExpiry");
        }

        /* renamed from: c */
        public static /* synthetic */ void m42317c(PairingControllerInterface pairingControllerInterface, ut0.C6579d dVar, rc2 rc2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    rc2 = PairingControllerInterface$updateMetadata$1.INSTANCE;
                }
                pairingControllerInterface.mo40499f(dVar, rc2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMetadata");
        }
    }

    /* renamed from: a */
    z42<InternalError> mo40494a();

    /* renamed from: b */
    void mo40495b(String... strArr);

    /* renamed from: c */
    void mo40496c(ut0.C6576a aVar, rc2<? super tt0.C6538c, r37> rc2);

    /* renamed from: d */
    void mo40497d(ut0.C6578c cVar, rc2<? super tt0.C6538c, r37> rc2);

    /* renamed from: e */
    xz5<es6> mo40498e();

    /* renamed from: f */
    void mo40499f(ut0.C6579d dVar, rc2<? super tt0.C6538c, r37> rc2);
}
