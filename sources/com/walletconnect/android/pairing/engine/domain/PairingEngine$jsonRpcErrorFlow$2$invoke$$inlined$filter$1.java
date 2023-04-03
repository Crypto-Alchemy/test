package com.walletconnect.android.pairing.engine.domain;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lz42;", "La52;", "collector", "Lr37;", "a", "(La52;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SafeCollector.common.kt */
public final class PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$filter$1 implements z42<rf7> {

    /* renamed from: a */
    public final /* synthetic */ z42 f27208a;

    /* renamed from: d */
    public final /* synthetic */ PairingEngine f27209d;

    public PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$filter$1(z42 z42, PairingEngine pairingEngine) {
        this.f27208a = z42;
        this.f27209d = pairingEngine;
    }

    /* renamed from: a */
    public Object mo8646a(final a52 a52, ns0 ns0) {
        z42 z42 = this.f27208a;
        final PairingEngine pairingEngine = this.f27209d;
        Object a = z42.mo8646a(new a52() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, p000.ns0 r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.walletconnect.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$filter$1.C55682.C55691
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    com.walletconnect.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$filter$1$2$1 r0 = (com.walletconnect.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$filter$1.C55682.C55691) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.walletconnect.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$filter$1$2$1 r0 = new com.walletconnect.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$filter$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = p000.wx2.m54101d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p000.hg5.m45199b(r7)
                    goto L_0x0053
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    p000.hg5.m45199b(r7)
                    a52 r7 = r4
                    r2 = r6
                    rf7 r2 = (p000.rf7) r2
                    com.walletconnect.android.pairing.engine.domain.PairingEngine r4 = r2
                    java.util.Set r4 = r4.f27199h
                    java.lang.String r2 = r2.mo47398b()
                    boolean r2 = r4.contains(r2)
                    r2 = r2 ^ r3
                    if (r2 == 0) goto L_0x0053
                    r0.label = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0053
                    return r1
                L_0x0053:
                    r37 r6 = p000.r37.f33317a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.walletconnect.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$filter$1.C55682.emit(java.lang.Object, ns0):java.lang.Object");
            }
        }, ns0);
        if (a == wx2.m54101d()) {
            return a;
        }
        return r37.f33317a;
    }
}
