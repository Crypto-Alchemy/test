package com.walletconnect.android.pairing.client;

import com.walletconnect.android.pairing.engine.domain.PairingEngine;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineStart;
import p000.ll4;
import p000.tt0;
import p000.ut0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J8\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\nH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J7\u0010\u0016\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0002R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \u0002\u0004\n\u0002\b\u0019¨\u0006#"}, mo44877d2 = {"Lcom/walletconnect/android/pairing/client/PairingProtocol;", "Lll4;", "Lr37;", "i", "()V", "Lll4$a;", "delegate", "j", "Lut0$b;", "pair", "Lkotlin/Function1;", "onSuccess", "Ltt0$c;", "onError", "a", "", "Ltt0$d;", "b", "Lkotlin/Function0;", "onConnection", "", "errorLambda", "f", "(Lpc2;Lrc2;Lns0;)Ljava/lang/Object;", "g", "Lcom/walletconnect/android/pairing/engine/domain/PairingEngine;", "Lcom/walletconnect/android/pairing/engine/domain/PairingEngine;", "pairingEngine", "Lsk3;", "c", "Lef3;", "h", "()Lsk3;", "logger", "<init>", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PairingProtocol.kt */
public final class PairingProtocol implements ll4 {

    /* renamed from: a */
    public static final PairingProtocol f27189a = new PairingProtocol();

    /* renamed from: b */
    public static PairingEngine f27190b;

    /* renamed from: c */
    public static final ef3 f27191c = C6169a.m47232a(PairingProtocol$logger$2.INSTANCE);

    /* renamed from: a */
    public void mo40453a(ut0.C6577b bVar, rc2<? super ut0.C6577b, r37> rc2, rc2<? super tt0.C6538c, r37> rc22) throws IllegalStateException {
        vx2.m53591g(bVar, "pair");
        vx2.m53591g(rc2, "onSuccess");
        vx2.m53591g(rc22, "onError");
        mo40456g();
        y23 unused = d50.m56748b(bh7.m32535a(), qh1.m71265b(), (CoroutineStart) null, new PairingProtocol$pair$1(bVar, rc22, rc2, (ns0<? super PairingProtocol$pair$1>) null), 2, (Object) null);
    }

    /* renamed from: b */
    public List<tt0.C6539d> mo40454b() throws IllegalStateException {
        mo40456g();
        PairingEngine pairingEngine = f27190b;
        if (pairingEngine == null) {
            vx2.m53605u("pairingEngine");
            pairingEngine = null;
        }
        List<kl4> r = pairingEngine.mo40473r();
        ArrayList arrayList = new ArrayList(dk0.m43495u(r, 10));
        for (kl4 d : r) {
            arrayList.add(ml4.m48366d(d));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: rc2<? super java.lang.Throwable, r37>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo40455f(p000.pc2<p000.r37> r7, p000.rc2<? super java.lang.Throwable, p000.r37> r8, p000.ns0<? super p000.r37> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.walletconnect.android.pairing.client.PairingProtocol$awaitConnection$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.walletconnect.android.pairing.client.PairingProtocol$awaitConnection$1 r0 = (com.walletconnect.android.pairing.client.PairingProtocol$awaitConnection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.walletconnect.android.pairing.client.PairingProtocol$awaitConnection$1 r0 = new com.walletconnect.android.pairing.client.PairingProtocol$awaitConnection$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r7 = r0.L$0
            r8 = r7
            rc2 r8 = (p000.rc2) r8
            p000.hg5.m45199b(r9)     // Catch:{ Exception -> 0x004c }
            goto L_0x0050
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            p000.hg5.m45199b(r9)
            r4 = 5000(0x1388, double:2.4703E-320)
            com.walletconnect.android.pairing.client.PairingProtocol$awaitConnection$3 r9 = new com.walletconnect.android.pairing.client.PairingProtocol$awaitConnection$3     // Catch:{ Exception -> 0x004c }
            r2 = 0
            r9.<init>(r7, r2)     // Catch:{ Exception -> 0x004c }
            r0.L$0 = r8     // Catch:{ Exception -> 0x004c }
            r0.label = r3     // Catch:{ Exception -> 0x004c }
            java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.m63232c(r4, r9, r0)     // Catch:{ Exception -> 0x004c }
            if (r7 != r1) goto L_0x0050
            return r1
        L_0x004c:
            r7 = move-exception
            r8.invoke(r7)
        L_0x0050:
            r37 r7 = p000.r37.f33317a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.walletconnect.android.pairing.client.PairingProtocol.mo40455f(pc2, rc2, ns0):java.lang.Object");
    }

    /* renamed from: g */
    public final void mo40456g() throws IllegalStateException {
        boolean z;
        if (f27190b != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("CoreClient needs to be initialized first using the initialize function".toString());
        }
    }

    /* renamed from: h */
    public final sk3 mo40457h() {
        return (sk3) f27191c.getValue();
    }

    /* renamed from: i */
    public final void mo40458i() {
        f27190b = (PairingEngine) hc3.m45112a().mo51892b().mo51636g().mo56284d().mo64988f(ua5.m52727b(PairingEngine.class), (oz4) null, (pc2<? extends ul4>) null);
    }

    /* renamed from: j */
    public final void mo40459j(ll4.C6221a aVar) {
        vx2.m53591g(aVar, "delegate");
        mo40456g();
        PairingEngine pairingEngine = f27190b;
        if (pairingEngine == null) {
            vx2.m53605u("pairingEngine");
            pairingEngine = null;
        }
        e52.m57232x(e52.m57202C(pairingEngine.mo40470o(), new PairingProtocol$setDelegate$1(aVar, (ns0<? super PairingProtocol$setDelegate$1>) null)), bh7.m32535a());
    }
}
