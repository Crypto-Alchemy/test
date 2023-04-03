package com.walletconnect.android.internal.common.json_rpc.domain;

import kotlin.Metadata;
import kotlin.Pair;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lz42;", "La52;", "collector", "Lr37;", "a", "(La52;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$1$invokeSuspend$$inlined$map$1 */
/* compiled from: SafeCollector.common.kt */
public final class C5555xc6b50280 implements z42<Pair<? extends String, ? extends es6>> {

    /* renamed from: a */
    public final /* synthetic */ z42 f27113a;

    /* renamed from: d */
    public final /* synthetic */ JsonRpcInteractor f27114d;

    public C5555xc6b50280(z42 z42, JsonRpcInteractor jsonRpcInteractor) {
        this.f27113a = z42;
        this.f27114d = jsonRpcInteractor;
    }

    /* renamed from: a */
    public Object mo8646a(final a52 a52, ns0 ns0) {
        z42 z42 = this.f27113a;
        final JsonRpcInteractor jsonRpcInteractor = this.f27114d;
        Object a = z42.mo8646a(new a52() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, p000.ns0 r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.walletconnect.android.internal.common.json_rpc.domain.C5555xc6b50280.C55562.C55571
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.walletconnect.android.internal.common.json_rpc.domain.C5555xc6b50280.C55562.C55571) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$1$invokeSuspend$$inlined$map$1$2$1
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.result
                    java.lang.Object r1 = p000.wx2.m54101d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p000.hg5.m45199b(r9)
                    goto L_0x007f
                L_0x0029:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0031:
                    p000.hg5.m45199b(r9)
                    a52 r9 = r4
                    ec5$a$c$a r8 = (p000.ec5.C5764a.C5769c.C5770a) r8
                    es6 r2 = new es6
                    java.lang.String r4 = r8.mo42223d()
                    r2.<init>(r4)
                    com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor r4 = r2     // Catch:{ Exception -> 0x0050 }
                    xh0 r4 = r4.f27103b     // Catch:{ Exception -> 0x0050 }
                    java.lang.String r8 = r8.mo42222c()     // Catch:{ Exception -> 0x0050 }
                    java.lang.String r8 = r4.mo48705b(r2, r8)     // Catch:{ Exception -> 0x0050 }
                    goto L_0x0071
                L_0x0050:
                    r8 = move-exception
                    com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor r4 = r2
                    java.lang.String r8 = p000.ru1.m51327b(r8)
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r6 = "ManSub: "
                    r5.append(r6)
                    r5.append(r8)
                    java.lang.String r8 = r5.toString()
                    r4.mo40301y(r8)
                    cb6 r8 = p000.cb6.f21669a
                    java.lang.String r8 = p000.vx2.m53591g(r8, "<this>")
                L_0x0071:
                    kotlin.Pair r4 = new kotlin.Pair
                    r4.<init>(r8, r2)
                    r0.label = r3
                    java.lang.Object r8 = r9.emit(r4, r0)
                    if (r8 != r1) goto L_0x007f
                    return r1
                L_0x007f:
                    r37 r8 = p000.r37.f33317a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.walletconnect.android.internal.common.json_rpc.domain.C5555xc6b50280.C55562.emit(java.lang.Object, ns0):java.lang.Object");
            }
        }, ns0);
        if (a == wx2.m54101d()) {
            return a;
        }
        return r37.f33317a;
    }
}
