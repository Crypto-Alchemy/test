package androidx.paging;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo44877d2 = {"androidx/paging/PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1", "La52;", "value", "Lr37;", "emit", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1 */
/* compiled from: Collect.kt */
public final class C1155x8e1fc4b5 implements a52<vk4<Value>> {

    /* renamed from: a */
    public final /* synthetic */ PageFetcher$injectRemoteEvents$1 f6159a;

    /* renamed from: d */
    public final /* synthetic */ s26 f6160d;

    /* renamed from: e */
    public final /* synthetic */ l04 f6161e;

    public C1155x8e1fc4b5(PageFetcher$injectRemoteEvents$1 pageFetcher$injectRemoteEvents$1, s26 s26, l04 l04) {
        this.f6159a = pageFetcher$injectRemoteEvents$1;
        this.f6160d = s26;
        this.f6161e = l04;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(java.lang.Object r17, p000.ns0 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof androidx.paging.C1155x8e1fc4b5.C11561
            if (r2 == 0) goto L_0x0017
            r2 = r1
            androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1$1 r2 = (androidx.paging.C1155x8e1fc4b5.C11561) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1$1 r2 = new androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x003d
            if (r4 == r7) goto L_0x0038
            if (r4 == r6) goto L_0x0038
            if (r4 != r5) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0038:
            p000.hg5.m45199b(r1)
            goto L_0x00c7
        L_0x003d:
            p000.hg5.m45199b(r1)
            r1 = r17
            vk4 r1 = (p000.vk4) r1
            boolean r4 = r1 instanceof p000.vk4.C3493b
            if (r4 == 0) goto L_0x0082
            l04 r4 = r0.f6161e
            r8 = r1
            vk4$b r8 = (p000.vk4.C3493b) r8
            il0 r1 = r8.mo27186d()
            yi3 r1 = r1.mo21565f()
            androidx.paging.PageFetcher$injectRemoteEvents$1 r5 = r0.f6159a
            tc5 r5 = r5.$accessor
            t86 r5 = r5.getState()
            java.lang.Object r5 = r5.getValue()
            yi3 r5 = (p000.yi3) r5
            r4.mo22616f(r1, r5)
            s26 r1 = r0.f6160d
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            l04 r4 = r0.f6161e
            il0 r13 = r4.mo22618h()
            r14 = 15
            r15 = 0
            vk4$b r4 = p000.vk4.C3493b.m28857c(r8, r9, r10, r11, r12, r13, r14, r15)
            r2.label = r7
            java.lang.Object r1 = r1.mo26027u(r4, r2)
            if (r1 != r3) goto L_0x00c7
            return r3
        L_0x0082:
            boolean r4 = r1 instanceof p000.vk4.C3492a
            if (r4 == 0) goto L_0x00a4
            l04 r4 = r0.f6161e
            r5 = r1
            vk4$a r5 = (p000.vk4.C3492a) r5
            androidx.paging.LoadType r5 = r5.mo27177a()
            r7 = 0
            xi3$c$a r8 = p000.xi3.C3605c.f19851d
            xi3$c r8 = r8.mo27759b()
            r4.mo22617g(r5, r7, r8)
            s26 r4 = r0.f6160d
            r2.label = r6
            java.lang.Object r1 = r4.mo26027u(r1, r2)
            if (r1 != r3) goto L_0x00c7
            return r3
        L_0x00a4:
            boolean r4 = r1 instanceof p000.vk4.C3495c
            if (r4 == 0) goto L_0x00c7
            l04 r4 = r0.f6161e
            r6 = r1
            vk4$c r6 = (p000.vk4.C3495c) r6
            androidx.paging.LoadType r7 = r6.mo27200c()
            boolean r8 = r6.mo27198a()
            xi3 r6 = r6.mo27199b()
            r4.mo22617g(r7, r8, r6)
            s26 r4 = r0.f6160d
            r2.label = r5
            java.lang.Object r1 = r4.mo26027u(r1, r2)
            if (r1 != r3) goto L_0x00c7
            return r3
        L_0x00c7:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C1155x8e1fc4b5.emit(java.lang.Object, ns0):java.lang.Object");
    }
}
