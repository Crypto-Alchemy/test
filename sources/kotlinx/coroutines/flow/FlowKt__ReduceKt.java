package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aG\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, mo44877d2 = {"T", "Lz42;", "Lkotlin/Function2;", "Lns0;", "", "", "predicate", "a", "(Lz42;Lfd2;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/flow/FlowKt")
/* compiled from: Reduce.kt */
public final /* synthetic */ class FlowKt__ReduceKt {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m63363a(p000.z42<? extends T> r4, p000.fd2<? super T, ? super p000.ns0<? super java.lang.Boolean>, ? extends java.lang.Object> r5, p000.ns0<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r4 = r0.L$2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2) r4
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
            java.lang.Object r0 = r0.L$0
            fd2 r0 = (p000.fd2) r0
            p000.hg5.m45199b(r6)     // Catch:{ AbortFlowException -> 0x0035 }
            goto L_0x006a
        L_0x0035:
            r6 = move-exception
            goto L_0x0067
        L_0x0037:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003f:
            p000.hg5.m45199b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            xj6 r2 = p000.yb4.f46149a
            r6.element = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2
            r2.<init>(r5, r6)
            r0.L$0 = r5     // Catch:{ AbortFlowException -> 0x0062 }
            r0.L$1 = r6     // Catch:{ AbortFlowException -> 0x0062 }
            r0.L$2 = r2     // Catch:{ AbortFlowException -> 0x0062 }
            r0.label = r3     // Catch:{ AbortFlowException -> 0x0062 }
            java.lang.Object r4 = r4.mo8646a(r2, r0)     // Catch:{ AbortFlowException -> 0x0062 }
            if (r4 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r0 = r5
            r5 = r6
            goto L_0x006a
        L_0x0062:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L_0x0067:
            p000.d52.m56750a(r6, r4)
        L_0x006a:
            T r4 = r5.element
            xj6 r5 = p000.yb4.f46149a
            if (r4 == r5) goto L_0x0071
            return r4
        L_0x0071:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.m63363a(z42, fd2, ns0):java.lang.Object");
    }
}
