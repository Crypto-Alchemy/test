package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"T", "value", "Lr37;", "emit", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: Distinct.kt */
public final class DistinctFlowImpl$collect$2<T> implements a52 {

    /* renamed from: a */
    public final /* synthetic */ DistinctFlowImpl<T> f40390a;

    /* renamed from: d */
    public final /* synthetic */ Ref$ObjectRef<Object> f40391d;

    /* renamed from: e */
    public final /* synthetic */ a52<T> f40392e;

    public DistinctFlowImpl$collect$2(DistinctFlowImpl<T> distinctFlowImpl, Ref$ObjectRef<Object> ref$ObjectRef, a52<? super T> a52) {
        this.f40390a = distinctFlowImpl;
        this.f40391d = ref$ObjectRef;
        this.f40392e = a52;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r6, p000.ns0<? super p000.r37> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = (kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = new kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p000.hg5.m45199b(r7)
            goto L_0x0067
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            p000.hg5.m45199b(r7)
            kotlinx.coroutines.flow.DistinctFlowImpl<T> r7 = r5.f40390a
            rc2<T, java.lang.Object> r7 = r7.f40388d
            java.lang.Object r7 = r7.invoke(r6)
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.f40391d
            T r2 = r2.element
            xj6 r4 = p000.yb4.f46149a
            if (r2 == r4) goto L_0x0058
            kotlinx.coroutines.flow.DistinctFlowImpl<T> r4 = r5.f40390a
            fd2<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f40389e
            java.lang.Object r2 = r4.invoke(r2, r7)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0055
            goto L_0x0058
        L_0x0055:
            r37 r6 = p000.r37.f33317a
            return r6
        L_0x0058:
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.f40391d
            r2.element = r7
            a52<T> r7 = r5.f40392e
            r0.label = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r37 r6 = p000.r37.f33317a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2.emit(java.lang.Object, ns0):java.lang.Object");
    }
}
