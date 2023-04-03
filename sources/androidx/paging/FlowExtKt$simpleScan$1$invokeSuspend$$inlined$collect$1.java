package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo44877d2 = {"androidx/paging/FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1", "La52;", "value", "Lr37;", "emit", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: Collect.kt */
public final class FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1 implements a52<T> {

    /* renamed from: a */
    public final /* synthetic */ FlowExtKt$simpleScan$1 f6135a;

    /* renamed from: d */
    public final /* synthetic */ a52 f6136d;

    /* renamed from: e */
    public final /* synthetic */ Ref$ObjectRef f6137e;

    public FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1(FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1, a52 a52, Ref$ObjectRef ref$ObjectRef) {
        this.f6135a = flowExtKt$simpleScan$1;
        this.f6136d = a52;
        this.f6137e = ref$ObjectRef;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(java.lang.Object r8, p000.ns0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.paging.FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1.C11481
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.paging.FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1$1 r0 = (androidx.paging.FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1.C11481) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1$1 r0 = new androidx.paging.FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p000.hg5.m45199b(r9)
            goto L_0x007a
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            java.lang.Object r8 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref$ObjectRef) r8
            java.lang.Object r2 = r0.L$0
            androidx.paging.FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1 r2 = (androidx.paging.FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1) r2
            p000.hg5.m45199b(r9)
            goto L_0x0064
        L_0x0040:
            p000.hg5.m45199b(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = r7.f6137e
            androidx.paging.FlowExtKt$simpleScan$1 r2 = r7.f6135a
            id2 r2 = r2.$operation
            T r5 = r9.element
            r0.L$0 = r7
            r0.L$1 = r9
            r0.label = r4
            r4 = 6
            p000.pu2.m50114c(r4)
            java.lang.Object r8 = r2.invoke(r5, r8, r0)
            r2 = 7
            p000.pu2.m50114c(r2)
            if (r8 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r2 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x0064:
            r8.element = r9
            a52 r8 = r2.f6136d
            kotlin.jvm.internal.Ref$ObjectRef r9 = r2.f6137e
            T r9 = r9.element
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r37 r8 = p000.r37.f33317a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1.emit(java.lang.Object, ns0):java.lang.Object");
    }
}
