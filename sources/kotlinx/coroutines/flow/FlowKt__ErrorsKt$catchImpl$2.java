package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"T", "it", "Lr37;", "emit", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: Errors.kt */
public final class FlowKt__ErrorsKt$catchImpl$2<T> implements a52 {

    /* renamed from: a */
    public final /* synthetic */ a52<T> f40403a;

    /* renamed from: d */
    public final /* synthetic */ Ref$ObjectRef<Throwable> f40404d;

    public FlowKt__ErrorsKt$catchImpl$2(a52<? super T> a52, Ref$ObjectRef<Throwable> ref$ObjectRef) {
        this.f40403a = a52;
        this.f40404d = ref$ObjectRef;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r5, p000.ns0<? super p000.r37> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r5 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2) r5
            p000.hg5.m45199b(r6)     // Catch:{ all -> 0x002d }
            goto L_0x0047
        L_0x002d:
            r6 = move-exception
            goto L_0x004c
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            p000.hg5.m45199b(r6)
            a52<T> r6 = r4.f40403a     // Catch:{ all -> 0x004a }
            r0.L$0 = r4     // Catch:{ all -> 0x004a }
            r0.label = r3     // Catch:{ all -> 0x004a }
            java.lang.Object r5 = r6.emit(r5, r0)     // Catch:{ all -> 0x004a }
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r37 r5 = p000.r37.f33317a
            return r5
        L_0x004a:
            r6 = move-exception
            r5 = r4
        L_0x004c:
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r5 = r5.f40404d
            r5.element = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2.emit(java.lang.Object, ns0):java.lang.Object");
    }
}
