package com.walletconnect.foundation.network;

import com.walletconnect.foundation.network.model.RelayDTO;
import kotlin.Metadata;
import p000.ec5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lz42;", "La52;", "collector", "Lr37;", "a", "(La52;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SafeCollector.common.kt */
public final class BaseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1 implements z42<ec5.C5764a.C5769c.C5770a> {

    /* renamed from: a */
    public final /* synthetic */ z42 f27372a;

    public BaseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1(z42 z42) {
        this.f27372a = z42;
    }

    /* renamed from: a */
    public Object mo8646a(final a52 a52, ns0 ns0) {
        Object a = this.f27372a.mo8646a(new a52<RelayDTO.Subscription.Request>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, p000.ns0 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.walletconnect.foundation.network.BaseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1.C56052.C56061
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.walletconnect.foundation.network.BaseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1$2$1 r0 = (com.walletconnect.foundation.network.BaseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1.C56052.C56061) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.walletconnect.foundation.network.BaseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1$2$1 r0 = new com.walletconnect.foundation.network.BaseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = p000.wx2.m54101d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p000.hg5.m45199b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    p000.hg5.m45199b(r6)
                    a52 r6 = r3
                    com.walletconnect.foundation.network.model.RelayDTO$Subscription$Request r5 = (com.walletconnect.foundation.network.model.RelayDTO.Subscription.Request) r5
                    ec5$a$c$a r5 = p000.vx2.m53591g(r5, "<this>")
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    r37 r5 = p000.r37.f33317a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.walletconnect.foundation.network.BaseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1.C56052.emit(java.lang.Object, ns0):java.lang.Object");
            }
        }, ns0);
        if (a == wx2.m54101d()) {
            return a;
        }
        return r37.f33317a;
    }
}
