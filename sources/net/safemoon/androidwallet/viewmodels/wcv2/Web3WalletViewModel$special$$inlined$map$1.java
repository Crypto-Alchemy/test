package net.safemoon.androidwallet.viewmodels.wcv2;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lz42;", "La52;", "collector", "Lr37;", "a", "(La52;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SafeCollector.common.kt */
public final class Web3WalletViewModel$special$$inlined$map$1 implements z42<tj7> {

    /* renamed from: a */
    public final /* synthetic */ z42 f43186a;

    public Web3WalletViewModel$special$$inlined$map$1(z42 z42) {
        this.f43186a = z42;
    }

    /* renamed from: a */
    public Object mo8646a(final a52 a52, ns0 ns0) {
        Object a = this.f43186a.mo8646a(new a52() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r12, p000.ns0 r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof net.safemoon.androidwallet.viewmodels.wcv2.Web3WalletViewModel$special$$inlined$map$1.C89262.C89271
                    if (r0 == 0) goto L_0x0013
                    r0 = r13
                    net.safemoon.androidwallet.viewmodels.wcv2.Web3WalletViewModel$special$$inlined$map$1$2$1 r0 = (net.safemoon.androidwallet.viewmodels.wcv2.Web3WalletViewModel$special$$inlined$map$1.C89262.C89271) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    net.safemoon.androidwallet.viewmodels.wcv2.Web3WalletViewModel$special$$inlined$map$1$2$1 r0 = new net.safemoon.androidwallet.viewmodels.wcv2.Web3WalletViewModel$special$$inlined$map$1$2$1
                    r0.<init>(r11, r13)
                L_0x0018:
                    java.lang.Object r13 = r0.result
                    java.lang.Object r1 = p000.wx2.m54101d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    p000.hg5.m45199b(r13)
                    goto L_0x010f
                L_0x002a:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L_0x0032:
                    p000.hg5.m45199b(r13)
                    a52 r13 = r3
                    hg7 r12 = (p000.hg7) r12
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r4 = "VM: "
                    r2.append(r4)
                    r2.append(r12)
                    boolean r2 = r12 instanceof p000.hg7.C5915j
                    if (r2 == 0) goto L_0x00b4
                    hg7$j r12 = (p000.hg7.C5915j) r12
                    java.lang.String r2 = r12.mo43269d()
                    tt0$a r4 = r12.mo43267b()
                    r5 = 0
                    if (r4 == 0) goto L_0x0064
                    java.util.List r4 = r4.mo48170b()
                    if (r4 == 0) goto L_0x0064
                    java.lang.Object r4 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r4)
                    java.lang.String r4 = (java.lang.String) r4
                    goto L_0x0065
                L_0x0064:
                    r4 = r5
                L_0x0065:
                    tt0$a r6 = r12.mo43267b()
                    if (r6 == 0) goto L_0x006f
                    java.lang.String r5 = r6.mo48171c()
                L_0x006f:
                    hg7$j$a r6 = r12.mo43268c()
                    long r6 = r6.mo43273a()
                    java.lang.String r6 = java.lang.String.valueOf(r6)
                    hg7$j$a r7 = r12.mo43268c()
                    java.lang.String r7 = r7.mo43275c()
                    java.lang.String r8 = r12.mo43266a()
                    hg7$j$a r12 = r12.mo43268c()
                    java.lang.String r12 = r12.mo43274b()
                    r9 = 7
                    java.lang.String[] r9 = new java.lang.String[r9]
                    r10 = 0
                    r9[r10] = r2
                    r9[r3] = r4
                    r2 = 2
                    r9[r2] = r5
                    r2 = 3
                    r9[r2] = r6
                    r2 = 4
                    r9[r2] = r7
                    r2 = 5
                    r9[r2] = r8
                    r2 = 6
                    r9[r2] = r12
                    java.util.ArrayList r12 = p000.ck0.m33058f(r9)
                    j16 r2 = new j16
                    int r4 = r12.size()
                    r2.<init>(r12, r4)
                    goto L_0x0106
                L_0x00b4:
                    boolean r2 = r12 instanceof p000.hg7.C5898a
                    if (r2 == 0) goto L_0x00e2
                    com.walletconnect.web3.wallet.client.Web3Wallet r2 = com.walletconnect.web3.wallet.client.Web3Wallet.f27840a
                    ig7$a r4 = new ig7$a
                    hg7$a r12 = (p000.hg7.C5898a) r12
                    hg7$f r5 = r12.mo43185b()
                    java.lang.String r6 = p000.C9670z8.m74816b()
                    r4.<init>(r5, r6)
                    java.lang.String r2 = r2.mo41550e(r4)
                    if (r2 == 0) goto L_0x00da
                    mt r4 = new mt
                    long r5 = r12.mo43184a()
                    r4.<init>(r5, r2)
                    r2 = r4
                    goto L_0x0106
                L_0x00da:
                    java.lang.Exception r12 = new java.lang.Exception
                    java.lang.String r13 = "Error formatting message"
                    r12.<init>(r13)
                    throw r12
                L_0x00e2:
                    boolean r2 = r12 instanceof p000.hg7.C5911h
                    if (r2 == 0) goto L_0x00e9
                    h16 r2 = p000.h16.f38148a
                    goto L_0x0106
                L_0x00e9:
                    boolean r2 = r12 instanceof p000.hg7.C5914i
                    if (r2 == 0) goto L_0x00f0
                    i16 r2 = p000.i16.f38318a
                    goto L_0x0106
                L_0x00f0:
                    boolean r2 = r12 instanceof p000.hg7.C5920l.C5922b
                    if (r2 == 0) goto L_0x0104
                    k16 r2 = new k16
                    hg7$l$b r12 = (p000.hg7.C5920l.C5922b) r12
                    hg7$g r12 = r12.mo43288a()
                    java.lang.String r12 = r12.mo43246d()
                    r2.<init>(r12)
                    goto L_0x0106
                L_0x0104:
                    j74 r2 = p000.j74.f38616a
                L_0x0106:
                    r0.label = r3
                    java.lang.Object r12 = r13.emit(r2, r0)
                    if (r12 != r1) goto L_0x010f
                    return r1
                L_0x010f:
                    r37 r12 = p000.r37.f33317a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.wcv2.Web3WalletViewModel$special$$inlined$map$1.C89262.emit(java.lang.Object, ns0):java.lang.Object");
            }
        }, ns0);
        if (a == wx2.m54101d()) {
            return a;
        }
        return r37.f33317a;
    }
}
