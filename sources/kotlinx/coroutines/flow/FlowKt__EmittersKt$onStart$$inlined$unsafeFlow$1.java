package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/flow/FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", "Lz42;", "La52;", "collector", "Lr37;", "a", "(La52;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: SafeCollector.common.kt */
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 implements z42<T> {

    /* renamed from: a */
    public final /* synthetic */ fd2 f40399a;

    /* renamed from: d */
    public final /* synthetic */ z42 f40400d;

    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(fd2 fd2, z42 z42) {
        this.f40399a = fd2;
        this.f40400d = z42;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo8646a(p000.a52<? super T> r7, p000.ns0<? super p000.r37> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.C77751
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.C77751) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p000.hg5.m45199b(r8)
            goto L_0x0083
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.flow.internal.SafeCollector r7 = (kotlinx.coroutines.flow.internal.SafeCollector) r7
            java.lang.Object r2 = r0.L$1
            a52 r2 = (p000.a52) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 r4 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1) r4
            p000.hg5.m45199b(r8)     // Catch:{ all -> 0x0044 }
            goto L_0x006e
        L_0x0044:
            r8 = move-exception
            goto L_0x008a
        L_0x0046:
            p000.hg5.m45199b(r8)
            kotlinx.coroutines.flow.internal.SafeCollector r8 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r8.<init>(r7, r2)
            fd2 r2 = r6.f40399a     // Catch:{ all -> 0x0086 }
            r0.L$0 = r6     // Catch:{ all -> 0x0086 }
            r0.L$1 = r7     // Catch:{ all -> 0x0086 }
            r0.L$2 = r8     // Catch:{ all -> 0x0086 }
            r0.label = r4     // Catch:{ all -> 0x0086 }
            r4 = 6
            p000.pu2.m50114c(r4)     // Catch:{ all -> 0x0086 }
            java.lang.Object r2 = r2.invoke(r8, r0)     // Catch:{ all -> 0x0086 }
            r4 = 7
            p000.pu2.m50114c(r4)     // Catch:{ all -> 0x0086 }
            if (r2 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r4 = r6
            r2 = r7
            r7 = r8
        L_0x006e:
            r7.releaseIntercepted()
            z42 r7 = r4.f40400d
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r7 = r7.mo8646a(r2, r0)
            if (r7 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r37 r7 = p000.r37.f33317a
            return r7
        L_0x0086:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x008a:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.mo8646a(a52, ns0):java.lang.Object");
    }
}
