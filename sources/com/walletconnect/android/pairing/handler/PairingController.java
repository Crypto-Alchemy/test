package com.walletconnect.android.pairing.handler;

import com.walletconnect.android.pairing.engine.domain.PairingEngine;
import java.util.Arrays;
import kotlin.C6169a;
import kotlin.Metadata;
import p000.tt0;
import p000.ut0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\fH\u0016J$\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\fH\u0016J$\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\fH\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0002R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\b\u0010\u0018R!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8VX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR!\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8VX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\"\u0010#¨\u0006&"}, mo44877d2 = {"Lcom/walletconnect/android/pairing/handler/PairingController;", "Lcom/walletconnect/android/pairing/handler/PairingControllerInterface;", "Lr37;", "i", "()V", "", "", "method", "b", "([Ljava/lang/String;)V", "Lut0$a;", "activate", "Lkotlin/Function1;", "Ltt0$c;", "onError", "c", "Lut0$c;", "updateExpiry", "d", "Lut0$d;", "updateMetadata", "f", "h", "Lcom/walletconnect/android/pairing/engine/domain/PairingEngine;", "Lcom/walletconnect/android/pairing/engine/domain/PairingEngine;", "pairingEngine", "Lxz5;", "Les6;", "Lef3;", "e", "()Lxz5;", "topicExpiredFlow", "Lz42;", "Ljava/lang/InternalError;", "a", "()Lz42;", "findWrongMethodsFlow", "<init>", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PairingController.kt */
public final class PairingController implements PairingControllerInterface {

    /* renamed from: a */
    public static final PairingController f27217a = new PairingController();

    /* renamed from: b */
    public static PairingEngine f27218b;

    /* renamed from: c */
    public static final ef3 f27219c = C6169a.m47232a(PairingController$topicExpiredFlow$2.INSTANCE);

    /* renamed from: d */
    public static final ef3 f27220d = C6169a.m47232a(PairingController$findWrongMethodsFlow$2.INSTANCE);

    /* renamed from: a */
    public z42<InternalError> mo40494a() {
        return (z42) f27220d.getValue();
    }

    /* renamed from: b */
    public void mo40495b(String... strArr) throws IllegalStateException {
        vx2.m53591g(strArr, "method");
        mo40500h();
        PairingEngine pairingEngine = f27218b;
        if (pairingEngine == null) {
            vx2.m53605u("pairingEngine");
            pairingEngine = null;
        }
        pairingEngine.mo40481z((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: c */
    public void mo40496c(ut0.C6576a aVar, rc2<? super tt0.C6538c, r37> rc2) throws IllegalStateException {
        vx2.m53591g(aVar, "activate");
        vx2.m53591g(rc2, "onError");
        mo40500h();
        try {
            PairingEngine pairingEngine = f27218b;
            if (pairingEngine == null) {
                vx2.m53605u("pairingEngine");
                pairingEngine = null;
            }
            pairingEngine.mo40468m(aVar.mo48506a(), new PairingController$activate$1(rc2));
        } catch (Exception e) {
            rc2.invoke(new tt0.C6538c(e));
        }
    }

    /* renamed from: d */
    public void mo40497d(ut0.C6578c cVar, rc2<? super tt0.C6538c, r37> rc2) throws IllegalStateException {
        vx2.m53591g(cVar, "updateExpiry");
        vx2.m53591g(rc2, "onError");
        mo40500h();
        try {
            PairingEngine pairingEngine = f27218b;
            if (pairingEngine == null) {
                vx2.m53605u("pairingEngine");
                pairingEngine = null;
            }
            pairingEngine.mo40466B(cVar.mo48515b(), cVar.mo48514a(), new PairingController$updateExpiry$1(rc2));
        } catch (Exception e) {
            rc2.invoke(new tt0.C6538c(e));
        }
    }

    /* renamed from: e */
    public xz5<es6> mo40498e() {
        return (xz5) f27219c.getValue();
    }

    /* renamed from: f */
    public void mo40499f(ut0.C6579d dVar, rc2<? super tt0.C6538c, r37> rc2) throws IllegalStateException {
        vx2.m53591g(dVar, "updateMetadata");
        vx2.m53591g(rc2, "onError");
        mo40500h();
        try {
            PairingEngine pairingEngine = f27218b;
            if (pairingEngine == null) {
                vx2.m53605u("pairingEngine");
                pairingEngine = null;
            }
            pairingEngine.mo40467C(dVar.mo48521c(), vx2.m53591g(dVar.mo48520b(), "<this>"), dVar.mo48519a());
        } catch (Exception e) {
            rc2.invoke(new tt0.C6538c(e));
        }
    }

    /* renamed from: h */
    public final void mo40500h() throws IllegalStateException {
        boolean z;
        if (f27218b != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("CoreClient needs to be initialized first using the initialize function".toString());
        }
    }

    /* renamed from: i */
    public final void mo40501i() {
        f27218b = (PairingEngine) hc3.m45112a().mo51892b().mo51636g().mo56284d().mo64988f(ua5.m52727b(PairingEngine.class), (oz4) null, (pc2<? extends ul4>) null);
    }
}
