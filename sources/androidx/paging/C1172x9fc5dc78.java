package androidx.paging;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lz42;", "La52;", "collector", "Lr37;", "a", "(La52;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1 */
/* compiled from: SafeCollector.common.kt */
public final class C1172x9fc5dc78 implements z42<gf7> {

    /* renamed from: a */
    public final /* synthetic */ z42 f6187a;

    /* renamed from: d */
    public final /* synthetic */ PageFetcherSnapshot$startConsumingHints$1 f6188d;

    public C1172x9fc5dc78(z42 z42, PageFetcherSnapshot$startConsumingHints$1 pageFetcherSnapshot$startConsumingHints$1) {
        this.f6187a = z42;
        this.f6188d = pageFetcherSnapshot$startConsumingHints$1;
    }

    /* renamed from: a */
    public Object mo8646a(final a52 a52, ns0 ns0) {
        Object a = this.f6187a.mo8646a(new a52<gf7>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r7, p000.ns0 r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof androidx.paging.C1172x9fc5dc78.C11732.C11741
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (androidx.paging.C1172x9fc5dc78.C11732.C11741) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = p000.wx2.m54101d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p000.hg5.m45199b(r8)
                    goto L_0x0078
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    p000.hg5.m45199b(r8)
                    a52 r8 = r3
                    r2 = r7
                    gf7 r2 = (p000.gf7) r2
                    int r4 = r2.mo20567d()
                    int r4 = r4 * -1
                    androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1 r5 = r2
                    androidx.paging.PageFetcherSnapshot$startConsumingHints$1 r5 = r5.f6188d
                    androidx.paging.PageFetcherSnapshot r5 = r5.this$0
                    bl4 r5 = r5.f6172j
                    int r5 = r5.f8183f
                    if (r4 > r5) goto L_0x0064
                    int r2 = r2.mo20566c()
                    int r2 = r2 * -1
                    androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1 r4 = r2
                    androidx.paging.PageFetcherSnapshot$startConsumingHints$1 r4 = r4.f6188d
                    androidx.paging.PageFetcherSnapshot r4 = r4.this$0
                    bl4 r4 = r4.f6172j
                    int r4 = r4.f8183f
                    if (r2 <= r4) goto L_0x0062
                    goto L_0x0064
                L_0x0062:
                    r2 = 0
                    goto L_0x0065
                L_0x0064:
                    r2 = r3
                L_0x0065:
                    java.lang.Boolean r2 = p000.a40.m31670a(r2)
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L_0x007b
                    r0.label = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x0078
                    return r1
                L_0x0078:
                    r37 r7 = p000.r37.f33317a
                    goto L_0x007d
                L_0x007b:
                    r37 r7 = p000.r37.f33317a
                L_0x007d:
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C1172x9fc5dc78.C11732.emit(java.lang.Object, ns0):java.lang.Object");
            }
        }, ns0);
        if (a == wx2.m54101d()) {
            return a;
        }
        return r37.f33317a;
    }
}
