package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lz42;", "La52;", "collector", "Lr37;", "a", "(La52;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: SafeCollector.common.kt */
public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 implements z42<T> {

    /* renamed from: a */
    public final /* synthetic */ z42 f40422a;

    /* renamed from: d */
    public final /* synthetic */ fd2 f40423d;

    public FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(z42 z42, fd2 fd2) {
        this.f40422a = z42;
        this.f40423d = fd2;
    }

    /* renamed from: a */
    public Object mo8646a(final a52 a52, ns0 ns0) {
        z42 z42 = this.f40422a;
        final fd2 fd2 = this.f40423d;
        Object a = z42.mo8646a(new a52() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r6, p000.ns0<? super p000.r37> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C77862.C77871
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C77862.C77871) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = p000.wx2.m54101d()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003e
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    p000.hg5.m45199b(r7)
                    goto L_0x006a
                L_0x002c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0034:
                    java.lang.Object r6 = r0.L$1
                    a52 r6 = (p000.a52) r6
                    java.lang.Object r2 = r0.L$0
                    p000.hg5.m45199b(r7)
                    goto L_0x005c
                L_0x003e:
                    p000.hg5.m45199b(r7)
                    a52 r7 = r4
                    fd2 r2 = r2
                    r0.L$0 = r6
                    r0.L$1 = r7
                    r0.label = r4
                    r4 = 6
                    p000.pu2.m50114c(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    p000.pu2.m50114c(r4)
                    if (r2 != r1) goto L_0x005a
                    return r1
                L_0x005a:
                    r2 = r6
                    r6 = r7
                L_0x005c:
                    r7 = 0
                    r0.L$0 = r7
                    r0.L$1 = r7
                    r0.label = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L_0x006a
                    return r1
                L_0x006a:
                    r37 r6 = p000.r37.f33317a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.C77862.emit(java.lang.Object, ns0):java.lang.Object");
            }
        }, ns0);
        if (a == wx2.m54101d()) {
            return a;
        }
        return r37.f33317a;
    }
}
