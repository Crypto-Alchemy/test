package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H@"}, mo44877d2 = {"T1", "T2", "R", "La52;", "", "", "it", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", mo48632f = "Zip.kt", mo48633l = {33, 33}, mo48634m = "invokeSuspend")
/* compiled from: Zip.kt */
public final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements id2<a52<? super R>, Object[], ns0<? super r37>, Object> {
    public final /* synthetic */ id2<T1, T2, ns0<? super R>, Object> $transform;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$1$1(id2<? super T1, ? super T2, ? super ns0<? super R>, ? extends Object> id2, ns0<? super FlowKt__ZipKt$combine$1$1> ns0) {
        super(3, ns0);
        this.$transform = id2;
    }

    public final Object invoke(a52<? super R> a52, Object[] objArr, ns0<? super r37> ns0) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.$transform, ns0);
        flowKt__ZipKt$combine$1$1.L$0 = a52;
        flowKt__ZipKt$combine$1$1.L$1 = objArr;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(r37.f33317a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: a52} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            p000.hg5.m45199b(r7)
            goto L_0x004c
        L_0x0012:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001a:
            java.lang.Object r1 = r6.L$0
            a52 r1 = (p000.a52) r1
            p000.hg5.m45199b(r7)
            goto L_0x0040
        L_0x0022:
            p000.hg5.m45199b(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            a52 r1 = (p000.a52) r1
            java.lang.Object r7 = r6.L$1
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            id2<T1, T2, ns0<? super R>, java.lang.Object> r4 = r6.$transform
            r5 = 0
            r5 = r7[r5]
            r7 = r7[r3]
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r4.invoke(r5, r7, r6)
            if (r7 != r0) goto L_0x0040
            return r0
        L_0x0040:
            r3 = 0
            r6.L$0 = r3
            r6.label = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L_0x004c
            return r0
        L_0x004c:
            r37 r7 = p000.r37.f33317a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
