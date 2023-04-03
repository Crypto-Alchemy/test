package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"T", "value", "Lr37;", "emit", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: Limit.kt */
public final class FlowKt__LimitKt$dropWhile$1$1<T> implements a52 {

    /* renamed from: a */
    public final /* synthetic */ Ref$BooleanRef f40412a;

    /* renamed from: d */
    public final /* synthetic */ a52<T> f40413d;

    /* renamed from: e */
    public final /* synthetic */ fd2<T, ns0<? super Boolean>, Object> f40414e;

    public FlowKt__LimitKt$dropWhile$1$1(Ref$BooleanRef ref$BooleanRef, a52<? super T> a52, fd2<? super T, ? super ns0<? super Boolean>, ? extends Object> fd2) {
        this.f40412a = ref$BooleanRef;
        this.f40413d = a52;
        this.f40414e = fd2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r7, p000.ns0<? super p000.r37> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r5) goto L_0x0041
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            p000.hg5.m45199b(r8)
            goto L_0x0088
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            java.lang.Object r7 = r0.L$1
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1) r2
            p000.hg5.m45199b(r8)
            goto L_0x006c
        L_0x0041:
            p000.hg5.m45199b(r8)
            goto L_0x0059
        L_0x0045:
            p000.hg5.m45199b(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f40412a
            boolean r8 = r8.element
            if (r8 == 0) goto L_0x005c
            a52<T> r8 = r6.f40413d
            r0.label = r5
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r37 r7 = p000.r37.f33317a
            return r7
        L_0x005c:
            fd2<T, ns0<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f40414e
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r2 = r6
        L_0x006c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x008b
            kotlin.jvm.internal.Ref$BooleanRef r8 = r2.f40412a
            r8.element = r5
            a52<T> r8 = r2.f40413d
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L_0x0088
            return r1
        L_0x0088:
            r37 r7 = p000.r37.f33317a
            return r7
        L_0x008b:
            r37 r7 = p000.r37.f33317a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1.emit(java.lang.Object, ns0):java.lang.Object");
    }
}
