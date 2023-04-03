package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H@¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "R", "La52;", "it", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", mo48632f = "PageFetcherSnapshot.kt", mo48633l = {109, 130}, mo48634m = "invokeSuspend")
/* renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 */
/* compiled from: FlowExt.kt */
public final class C1164xe29ec4fd extends SuspendLambda implements id2<a52<? super cf2>, Integer, ns0<? super r37>, Object> {
    public final /* synthetic */ LoadType $loadType$inlined;
    public int I$0;
    private /* synthetic */ Object L$0;
    private /* synthetic */ Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1164xe29ec4fd(ns0 ns0, PageFetcherSnapshot pageFetcherSnapshot, LoadType loadType) {
        super(3, ns0);
        this.this$0 = pageFetcherSnapshot;
        this.$loadType$inlined = loadType;
    }

    public final ns0<r37> create(a52<? super cf2> a52, Integer num, ns0<? super r37> ns0) {
        vx2.m53591g(a52, "$this$create");
        vx2.m53591g(ns0, "continuation");
        C1164xe29ec4fd pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 = new C1164xe29ec4fd(ns0, this.this$0, this.$loadType$inlined);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.L$0 = a52;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.L$1 = num;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((C1164xe29ec4fd) create((a52) obj, obj2, (ns0) obj3)).invokeSuspend(r37.f33317a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: a52} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x002e
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            p000.hg5.m45199b(r12)
            goto L_0x00bc
        L_0x0014:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001c:
            int r1 = r11.I$0
            java.lang.Object r5 = r11.L$2
            y04 r5 = (p000.y04) r5
            java.lang.Object r6 = r11.L$1
            androidx.paging.PageFetcherSnapshotState$a r6 = (androidx.paging.PageFetcherSnapshotState.C1180a) r6
            java.lang.Object r7 = r11.L$0
            a52 r7 = (p000.a52) r7
            p000.hg5.m45199b(r12)
            goto L_0x0059
        L_0x002e:
            p000.hg5.m45199b(r12)
            java.lang.Object r12 = r11.L$0
            r7 = r12
            a52 r7 = (p000.a52) r7
            java.lang.Object r12 = r11.L$1
            java.lang.Number r12 = (java.lang.Number) r12
            int r1 = r12.intValue()
            androidx.paging.PageFetcherSnapshot r12 = r11.this$0
            androidx.paging.PageFetcherSnapshotState$a r6 = r12.f6167e
            y04 r5 = r6.f6204a
            r11.L$0 = r7
            r11.L$1 = r6
            r11.L$2 = r5
            r11.I$0 = r1
            r11.label = r3
            java.lang.Object r12 = r5.mo55746a(r4, r11)
            if (r12 != r0) goto L_0x0059
            return r0
        L_0x0059:
            androidx.paging.PageFetcherSnapshotState r12 = r6.f6205b     // Catch:{ all -> 0x00bf }
            yi3 r6 = r12.mo8704p()     // Catch:{ all -> 0x00bf }
            androidx.paging.LoadType r8 = r11.$loadType$inlined     // Catch:{ all -> 0x00bf }
            xi3 r6 = r6.mo28080d(r8)     // Catch:{ all -> 0x00bf }
            xi3$c$a r8 = p000.xi3.C3605c.f19851d     // Catch:{ all -> 0x00bf }
            xi3$c r9 = r8.mo27758a()     // Catch:{ all -> 0x00bf }
            boolean r6 = p000.vx2.m53586b(r6, r9)     // Catch:{ all -> 0x00bf }
            r9 = 0
            if (r6 == 0) goto L_0x007e
            cf2[] r12 = new p000.cf2[r9]     // Catch:{ all -> 0x00bf }
            z42 r12 = p000.e52.m57231w(r12)     // Catch:{ all -> 0x00bf }
            r5.mo55747b(r4)
            goto L_0x00ad
        L_0x007e:
            yi3 r6 = r12.mo8704p()     // Catch:{ all -> 0x00bf }
            androidx.paging.LoadType r10 = r11.$loadType$inlined     // Catch:{ all -> 0x00bf }
            xi3 r6 = r6.mo28080d(r10)     // Catch:{ all -> 0x00bf }
            boolean r6 = r6 instanceof p000.xi3.C3603a     // Catch:{ all -> 0x00bf }
            if (r6 != 0) goto L_0x0095
            androidx.paging.LoadType r6 = r11.$loadType$inlined     // Catch:{ all -> 0x00bf }
            xi3$c r8 = r8.mo27759b()     // Catch:{ all -> 0x00bf }
            r12.mo8709u(r6, r8)     // Catch:{ all -> 0x00bf }
        L_0x0095:
            r37 r12 = p000.r37.f33317a     // Catch:{ all -> 0x00bf }
            r5.mo55747b(r4)
            androidx.paging.PageFetcherSnapshot r12 = r11.this$0
            r04 r12 = r12.f6163a
            if (r1 != 0) goto L_0x00a3
            r3 = r9
        L_0x00a3:
            z42 r12 = p000.e52.m57222n(r12, r3)
            androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1 r3 = new androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1
            r3.<init>(r12, r1)
            r12 = r3
        L_0x00ad:
            r11.L$0 = r4
            r11.L$1 = r4
            r11.L$2 = r4
            r11.label = r2
            java.lang.Object r12 = r12.mo8646a(r7, r11)
            if (r12 != r0) goto L_0x00bc
            return r0
        L_0x00bc:
            r37 r12 = p000.r37.f33317a
            return r12
        L_0x00bf:
            r12 = move-exception
            r5.mo55747b(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C1164xe29ec4fd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
