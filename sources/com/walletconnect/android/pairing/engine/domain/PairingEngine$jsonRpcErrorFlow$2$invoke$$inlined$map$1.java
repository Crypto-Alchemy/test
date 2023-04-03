package com.walletconnect.android.pairing.engine.domain;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lz42;", "La52;", "collector", "Lr37;", "a", "(La52;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SafeCollector.common.kt */
public final class PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$map$1 implements z42<InternalError> {

    /* renamed from: a */
    public final /* synthetic */ z42 f27212a;

    public PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$map$1(z42 z42) {
        this.f27212a = z42;
    }

    /* renamed from: a */
    public Object mo8646a(final a52 a52, ns0 ns0) {
        Object a = this.f27212a.mo8646a(new a52() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, p000.ns0 r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.walletconnect.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$map$1.C55702.C55711
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.walletconnect.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$map$1$2$1 r0 = (com.walletconnect.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$map$1.C55702.C55711) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.walletconnect.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$map$1$2$1 r0 = new com.walletconnect.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$map$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = p000.wx2.m54101d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p000.hg5.m45199b(r8)
                    goto L_0x0058
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    p000.hg5.m45199b(r8)
                    a52 r8 = r3
                    rf7 r7 = (p000.rf7) r7
                    java.lang.InternalError r2 = new java.lang.InternalError
                    java.lang.Exception r4 = new java.lang.Exception
                    ay2$a r5 = new ay2$a
                    java.lang.String r7 = r7.mo47398b()
                    r5.<init>(r7)
                    java.lang.String r7 = r5.getMessage()
                    r4.<init>(r7)
                    r2.<init>(r4)
                    r0.label = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L_0x0058
                    return r1
                L_0x0058:
                    r37 r7 = p000.r37.f33317a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.walletconnect.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$map$1.C55702.emit(java.lang.Object, ns0):java.lang.Object");
            }
        }, ns0);
        if (a == wx2.m54101d()) {
            return a;
        }
        return r37.f33317a;
    }
}
