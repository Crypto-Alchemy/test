package androidx.paging;

import androidx.paging.PageFetcher$injectRemoteEvents$1;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo44877d2 = {"androidx/paging/PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1", "La52;", "value", "Lr37;", "emit", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 */
/* compiled from: Collect.kt */
public final class C1153x43858827 implements a52<yi3> {

    /* renamed from: a */
    public final /* synthetic */ PageFetcher$injectRemoteEvents$1.C11622 f6157a;

    /* renamed from: d */
    public final /* synthetic */ Ref$ObjectRef f6158d;

    public C1153x43858827(PageFetcher$injectRemoteEvents$1.C11622 r1, Ref$ObjectRef ref$ObjectRef) {
        this.f6157a = r1;
        this.f6158d = ref$ObjectRef;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(java.lang.Object r9, p000.ns0 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.paging.C1153x43858827.C11541
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1$1 r0 = (androidx.paging.C1153x43858827.C11541) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1$1 r0 = new androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0059
            if (r2 == r5) goto L_0x004d
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r9 = r0.L$1
            yi3 r9 = (p000.yi3) r9
            java.lang.Object r0 = r0.L$0
            androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 r0 = (androidx.paging.C1153x43858827) r0
            p000.hg5.m45199b(r10)
            goto L_0x0105
        L_0x0038:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0040:
            java.lang.Object r9 = r0.L$1
            yi3 r9 = (p000.yi3) r9
            java.lang.Object r2 = r0.L$0
            androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 r2 = (androidx.paging.C1153x43858827) r2
            p000.hg5.m45199b(r10)
            goto L_0x00cd
        L_0x004d:
            java.lang.Object r9 = r0.L$1
            yi3 r9 = (p000.yi3) r9
            java.lang.Object r2 = r0.L$0
            androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 r2 = (androidx.paging.C1153x43858827) r2
            p000.hg5.m45199b(r10)
            goto L_0x0096
        L_0x0059:
            p000.hg5.m45199b(r10)
            yi3 r9 = (p000.yi3) r9
            kotlin.jvm.internal.Ref$ObjectRef r10 = r8.f6158d
            T r10 = r10.element
            yi3 r10 = (p000.yi3) r10
            xi3 r10 = r10.mo28084g()
            xi3 r2 = r9.mo28084g()
            boolean r10 = p000.vx2.m53586b(r10, r2)
            r10 = r10 ^ r5
            if (r10 == 0) goto L_0x0095
            androidx.paging.PageFetcher$injectRemoteEvents$1$2 r10 = r8.f6157a
            l04 r10 = r1
            androidx.paging.LoadType r2 = androidx.paging.LoadType.REFRESH
            xi3 r6 = r9.mo28084g()
            r10.mo22617g(r2, r5, r6)
            androidx.paging.PageFetcher$injectRemoteEvents$1$2 r10 = r8.f6157a
            androidx.paging.PageFetcher$injectRemoteEvents$1$1 r10 = r3
            xi3 r6 = r9.mo28084g()
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r10.invoke((androidx.paging.LoadType) r2, (p000.xi3) r6, (p000.ns0<? super p000.r37>) r0)
            if (r10 != r1) goto L_0x0095
            return r1
        L_0x0095:
            r2 = r8
        L_0x0096:
            kotlin.jvm.internal.Ref$ObjectRef r10 = r2.f6158d
            T r10 = r10.element
            yi3 r10 = (p000.yi3) r10
            xi3 r10 = r10.mo28083f()
            xi3 r6 = r9.mo28083f()
            boolean r10 = p000.vx2.m53586b(r10, r6)
            r10 = r10 ^ r5
            if (r10 == 0) goto L_0x00cd
            androidx.paging.PageFetcher$injectRemoteEvents$1$2 r10 = r2.f6157a
            l04 r10 = r1
            androidx.paging.LoadType r6 = androidx.paging.LoadType.PREPEND
            xi3 r7 = r9.mo28083f()
            r10.mo22617g(r6, r5, r7)
            androidx.paging.PageFetcher$injectRemoteEvents$1$2 r10 = r2.f6157a
            androidx.paging.PageFetcher$injectRemoteEvents$1$1 r10 = r3
            xi3 r7 = r9.mo28083f()
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r10.invoke((androidx.paging.LoadType) r6, (p000.xi3) r7, (p000.ns0<? super p000.r37>) r0)
            if (r10 != r1) goto L_0x00cd
            return r1
        L_0x00cd:
            kotlin.jvm.internal.Ref$ObjectRef r10 = r2.f6158d
            T r10 = r10.element
            yi3 r10 = (p000.yi3) r10
            xi3 r10 = r10.mo28081e()
            xi3 r4 = r9.mo28081e()
            boolean r10 = p000.vx2.m53586b(r10, r4)
            r10 = r10 ^ r5
            if (r10 == 0) goto L_0x0106
            androidx.paging.PageFetcher$injectRemoteEvents$1$2 r10 = r2.f6157a
            l04 r10 = r1
            androidx.paging.LoadType r4 = androidx.paging.LoadType.APPEND
            xi3 r6 = r9.mo28081e()
            r10.mo22617g(r4, r5, r6)
            androidx.paging.PageFetcher$injectRemoteEvents$1$2 r10 = r2.f6157a
            androidx.paging.PageFetcher$injectRemoteEvents$1$1 r10 = r3
            xi3 r5 = r9.mo28081e()
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r10 = r10.invoke((androidx.paging.LoadType) r4, (p000.xi3) r5, (p000.ns0<? super p000.r37>) r0)
            if (r10 != r1) goto L_0x0104
            return r1
        L_0x0104:
            r0 = r2
        L_0x0105:
            r2 = r0
        L_0x0106:
            kotlin.jvm.internal.Ref$ObjectRef r10 = r2.f6158d
            r10.element = r9
            r37 r9 = p000.r37.f33317a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C1153x43858827.emit(java.lang.Object, ns0):java.lang.Object");
    }
}
