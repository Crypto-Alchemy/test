package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, mo44877d2 = {"", "Key", "Value", "Ls26;", "Lvk4;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", mo48632f = "PageFetcherSnapshot.kt", mo48633l = {595, 160, 607}, mo48634m = "invokeSuspend")
/* compiled from: PageFetcherSnapshot.kt */
public final class PageFetcherSnapshot$pageEventFlow$1 extends SuspendLambda implements fd2<s26<vk4<Value>>, ns0<? super r37>, Object> {
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$1(PageFetcherSnapshot pageFetcherSnapshot, ns0 ns0) {
        super(2, ns0);
        this.this$0 = pageFetcherSnapshot;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        PageFetcherSnapshot$pageEventFlow$1 pageFetcherSnapshot$pageEventFlow$1 = new PageFetcherSnapshot$pageEventFlow$1(this.this$0, ns0);
        pageFetcherSnapshot$pageEventFlow$1.L$0 = obj;
        return pageFetcherSnapshot$pageEventFlow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcherSnapshot$pageEventFlow$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r13.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0049
            if (r1 == r4) goto L_0x0035
            if (r1 == r3) goto L_0x002b
            if (r1 != r2) goto L_0x0023
            java.lang.Object r0 = r13.L$2
            y04 r0 = (p000.y04) r0
            java.lang.Object r1 = r13.L$1
            androidx.paging.PageFetcherSnapshotState$a r1 = (androidx.paging.PageFetcherSnapshotState.C1180a) r1
            java.lang.Object r2 = r13.L$0
            s26 r2 = (p000.s26) r2
            p000.hg5.m45199b(r14)
            goto L_0x00fc
        L_0x0023:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x002b:
            java.lang.Object r1 = r13.L$0
            s26 r1 = (p000.s26) r1
            p000.hg5.m45199b(r14)
            r14 = r1
            goto L_0x00e1
        L_0x0035:
            java.lang.Object r1 = r13.L$3
            y04 r1 = (p000.y04) r1
            java.lang.Object r4 = r13.L$2
            androidx.paging.PageFetcherSnapshotState$a r4 = (androidx.paging.PageFetcherSnapshotState.C1180a) r4
            java.lang.Object r6 = r13.L$1
            uc5 r6 = (p000.uc5) r6
            java.lang.Object r7 = r13.L$0
            s26 r7 = (p000.s26) r7
            p000.hg5.m45199b(r14)
            goto L_0x00b6
        L_0x0049:
            p000.hg5.m45199b(r14)
            java.lang.Object r14 = r13.L$0
            s26 r14 = (p000.s26) r14
            androidx.paging.PageFetcherSnapshot r1 = r13.this$0
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.f6165c
            r12 = 0
            boolean r1 = r1.compareAndSet(r12, r4)
            if (r1 == 0) goto L_0x011e
            r7 = 0
            r8 = 0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2 r9 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2
            r9.<init>(r13, r14, r5)
            r10 = 3
            r11 = 0
            r6 = r14
            p000.y23 unused = p000.d50.m56748b(r6, r7, r8, r9, r10, r11)
            r1 = 6
            fd0 r1 = p000.od0.m70236b(r12, r5, r5, r1, r5)
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3 r9 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3
            r9.<init>(r13, r1, r5)
            p000.y23 unused = p000.d50.m56748b(r6, r7, r8, r9, r10, r11)
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4 r9 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4
            r9.<init>(r13, r1, r5)
            p000.y23 unused = p000.d50.m56748b(r6, r7, r8, r9, r10, r11)
            androidx.paging.PageFetcherSnapshot r1 = r13.this$0
            boolean r1 = r1.f6174l
            if (r1 == 0) goto L_0x00ce
            androidx.paging.PageFetcherSnapshot r1 = r13.this$0
            uc5 r6 = r1.mo8685t()
            if (r6 == 0) goto L_0x00ce
            androidx.paging.PageFetcherSnapshot r1 = r13.this$0
            fl4 r1 = r1.f6176n
            if (r1 == 0) goto L_0x0098
            goto L_0x00c3
        L_0x0098:
            androidx.paging.PageFetcherSnapshot r1 = r13.this$0
            androidx.paging.PageFetcherSnapshotState$a r1 = r1.f6167e
            y04 r7 = r1.f6204a
            r13.L$0 = r14
            r13.L$1 = r6
            r13.L$2 = r1
            r13.L$3 = r7
            r13.label = r4
            java.lang.Object r4 = r7.mo55746a(r5, r13)
            if (r4 != r0) goto L_0x00b3
            return r0
        L_0x00b3:
            r4 = r1
            r1 = r7
            r7 = r14
        L_0x00b6:
            androidx.paging.PageFetcherSnapshotState r14 = r4.f6205b     // Catch:{ all -> 0x00c9 }
            fl4 r14 = r14.mo8695g(r5)     // Catch:{ all -> 0x00c9 }
            r1.mo55747b(r5)
            r1 = r14
            r14 = r7
        L_0x00c3:
            androidx.paging.LoadType r4 = androidx.paging.LoadType.REFRESH
            r6.mo26731a(r4, r1)
            goto L_0x00ce
        L_0x00c9:
            r14 = move-exception
            r1.mo55747b(r5)
            throw r14
        L_0x00ce:
            androidx.paging.PageFetcherSnapshot r1 = r13.this$0
            r13.L$0 = r14
            r13.L$1 = r5
            r13.L$2 = r5
            r13.L$3 = r5
            r13.label = r3
            java.lang.Object r1 = r1.mo8681p(r13)
            if (r1 != r0) goto L_0x00e1
            return r0
        L_0x00e1:
            androidx.paging.PageFetcherSnapshot r1 = r13.this$0
            androidx.paging.PageFetcherSnapshotState$a r1 = r1.f6167e
            y04 r3 = r1.f6204a
            r13.L$0 = r14
            r13.L$1 = r1
            r13.L$2 = r3
            r13.label = r2
            java.lang.Object r2 = r3.mo55746a(r5, r13)
            if (r2 != r0) goto L_0x00fa
            return r0
        L_0x00fa:
            r2 = r14
            r0 = r3
        L_0x00fc:
            androidx.paging.PageFetcherSnapshotState r14 = r1.f6205b     // Catch:{ all -> 0x0119 }
            yi3 r14 = r14.mo8704p()     // Catch:{ all -> 0x0119 }
            androidx.paging.LoadType r1 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x0119 }
            xi3 r14 = r14.mo28080d(r1)     // Catch:{ all -> 0x0119 }
            r0.mo55747b(r5)
            boolean r14 = r14 instanceof p000.xi3.C3603a
            if (r14 != 0) goto L_0x0116
            androidx.paging.PageFetcherSnapshot r14 = r13.this$0
            r14.mo8690y(r2)
        L_0x0116:
            r37 r14 = p000.r37.f33317a
            return r14
        L_0x0119:
            r14 = move-exception
            r0.mo55747b(r5)
            throw r14
        L_0x011e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?"
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
