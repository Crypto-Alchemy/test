package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"T", "value", "Lr37;", "emit", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: Transform.kt */
public final class FlowKt__TransformKt$withIndex$1$1<T> implements a52 {

    /* renamed from: a */
    public final /* synthetic */ a52<wt2<? extends T>> f40426a;

    /* renamed from: d */
    public final /* synthetic */ Ref$IntRef f40427d;

    public FlowKt__TransformKt$withIndex$1$1(a52<? super wt2<? extends T>> a52, Ref$IntRef ref$IntRef) {
        this.f40426a = a52;
        this.f40427d = ref$IntRef;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r8, p000.ns0<? super p000.r37> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p000.hg5.m45199b(r9)
            goto L_0x004e
        L_0x0029:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0031:
            p000.hg5.m45199b(r9)
            a52<wt2<? extends T>> r9 = r7.f40426a
            wt2 r2 = new wt2
            kotlin.jvm.internal.Ref$IntRef r4 = r7.f40427d
            int r5 = r4.element
            int r6 = r5 + 1
            r4.element = r6
            if (r5 < 0) goto L_0x0051
            r2.<init>(r5, r8)
            r0.label = r3
            java.lang.Object r8 = r9.emit(r2, r0)
            if (r8 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r37 r8 = p000.r37.f33317a
            return r8
        L_0x0051:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "Index overflow has happened"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1.emit(java.lang.Object, ns0):java.lang.Object");
    }
}
