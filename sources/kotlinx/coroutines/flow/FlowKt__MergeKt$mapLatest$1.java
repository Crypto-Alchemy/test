package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H@"}, mo44877d2 = {"T", "R", "La52;", "it", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", mo48632f = "Merge.kt", mo48633l = {214, 214}, mo48634m = "invokeSuspend")
/* compiled from: Merge.kt */
public final class FlowKt__MergeKt$mapLatest$1 extends SuspendLambda implements id2<a52<? super R>, T, ns0<? super r37>, Object> {
    public final /* synthetic */ fd2<T, ns0<? super R>, Object> $transform;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__MergeKt$mapLatest$1(fd2<? super T, ? super ns0<? super R>, ? extends Object> fd2, ns0<? super FlowKt__MergeKt$mapLatest$1> ns0) {
        super(3, ns0);
        this.$transform = fd2;
    }

    public final Object invoke(a52<? super R> a52, T t, ns0<? super r37> ns0) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.$transform, ns0);
        flowKt__MergeKt$mapLatest$1.L$0 = a52;
        flowKt__MergeKt$mapLatest$1.L$1 = t;
        return flowKt__MergeKt$mapLatest$1.invokeSuspend(r37.f33317a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: a52} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            p000.hg5.m45199b(r6)
            goto L_0x0045
        L_0x0012:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x001a:
            java.lang.Object r1 = r5.L$0
            a52 r1 = (p000.a52) r1
            p000.hg5.m45199b(r6)
            goto L_0x0039
        L_0x0022:
            p000.hg5.m45199b(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            a52 r1 = (p000.a52) r1
            java.lang.Object r6 = r5.L$1
            fd2<T, ns0<? super R>, java.lang.Object> r4 = r5.$transform
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L_0x0039
            return r0
        L_0x0039:
            r3 = 0
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L_0x0045
            return r0
        L_0x0045:
            r37 r6 = p000.r37.f33317a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
