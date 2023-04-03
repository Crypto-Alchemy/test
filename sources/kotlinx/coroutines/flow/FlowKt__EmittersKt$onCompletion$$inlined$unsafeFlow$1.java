package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/flow/FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", "Lz42;", "La52;", "collector", "Lr37;", "a", "(La52;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: SafeCollector.common.kt */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 implements z42<T> {

    /* renamed from: a */
    public final /* synthetic */ z42 f40397a;

    /* renamed from: d */
    public final /* synthetic */ id2 f40398d;

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(z42 z42, id2 id2) {
        this.f40397a = z42;
        this.f40398d = id2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo8646a(p000.a52<? super T> r9, p000.ns0<? super p000.r37> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.C77741
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.C77741) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0054
            if (r2 == r5) goto L_0x0046
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.flow.internal.SafeCollector r9 = (kotlinx.coroutines.flow.internal.SafeCollector) r9
            p000.hg5.m45199b(r10)     // Catch:{ all -> 0x0034 }
            goto L_0x0088
        L_0x0034:
            r10 = move-exception
            goto L_0x0092
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003e:
            java.lang.Object r9 = r0.L$0
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            p000.hg5.m45199b(r10)
            goto L_0x00ac
        L_0x0046:
            java.lang.Object r9 = r0.L$1
            a52 r9 = (p000.a52) r9
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r2 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) r2
            p000.hg5.m45199b(r10)     // Catch:{ all -> 0x0052 }
            goto L_0x0067
        L_0x0052:
            r9 = move-exception
            goto L_0x0098
        L_0x0054:
            p000.hg5.m45199b(r10)
            z42 r10 = r8.f40397a     // Catch:{ all -> 0x0096 }
            r0.L$0 = r8     // Catch:{ all -> 0x0096 }
            r0.L$1 = r9     // Catch:{ all -> 0x0096 }
            r0.label = r5     // Catch:{ all -> 0x0096 }
            java.lang.Object r10 = r10.mo8646a(r9, r0)     // Catch:{ all -> 0x0096 }
            if (r10 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r2 = r8
        L_0x0067:
            kotlinx.coroutines.flow.internal.SafeCollector r10 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            r10.<init>(r9, r4)
            id2 r9 = r2.f40398d     // Catch:{ all -> 0x008e }
            r0.L$0 = r10     // Catch:{ all -> 0x008e }
            r0.L$1 = r6     // Catch:{ all -> 0x008e }
            r0.label = r3     // Catch:{ all -> 0x008e }
            r2 = 6
            p000.pu2.m50114c(r2)     // Catch:{ all -> 0x008e }
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch:{ all -> 0x008e }
            r0 = 7
            p000.pu2.m50114c(r0)     // Catch:{ all -> 0x008e }
            if (r9 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r9 = r10
        L_0x0088:
            r9.releaseIntercepted()
            r37 r9 = p000.r37.f33317a
            return r9
        L_0x008e:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0092:
            r9.releaseIntercepted()
            throw r10
        L_0x0096:
            r9 = move-exception
            r2 = r8
        L_0x0098:
            rp6 r10 = new rp6
            r10.<init>(r9)
            id2 r2 = r2.f40398d
            r0.L$0 = r9
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt__EmittersKt.m63345c(r10, r2, r9, r0)
            if (r10 != r1) goto L_0x00ac
            return r1
        L_0x00ac:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.mo8646a(a52, ns0):java.lang.Object");
    }
}
