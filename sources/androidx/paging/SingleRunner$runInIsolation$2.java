package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lhu0;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.SingleRunner$runInIsolation$2", mo48632f = "SingleRunner.kt", mo48633l = {55, 59, 61, 61}, mo48634m = "invokeSuspend")
/* compiled from: SingleRunner.kt */
public final class SingleRunner$runInIsolation$2 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ rc2 $block;
    public final /* synthetic */ int $priority;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SingleRunner this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleRunner$runInIsolation$2(SingleRunner singleRunner, int i, rc2 rc2, ns0 ns0) {
        super(2, ns0);
        this.this$0 = singleRunner;
        this.$priority = i;
        this.$block = rc2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        SingleRunner$runInIsolation$2 singleRunner$runInIsolation$2 = new SingleRunner$runInIsolation$2(this.this$0, this.$priority, this.$block, ns0);
        singleRunner$runInIsolation$2.L$0 = obj;
        return singleRunner$runInIsolation$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((SingleRunner$runInIsolation$2) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r8.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 == r5) goto L_0x0034
            if (r1 == r4) goto L_0x002a
            if (r1 == r3) goto L_0x0025
            if (r1 == r2) goto L_0x001c
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001c:
            java.lang.Object r0 = r8.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            p000.hg5.m45199b(r9)
            goto L_0x00a0
        L_0x0025:
            p000.hg5.m45199b(r9)
            goto L_0x00a1
        L_0x002a:
            java.lang.Object r1 = r8.L$0
            y23 r1 = (p000.y23) r1
            p000.hg5.m45199b(r9)     // Catch:{ all -> 0x0032 }
            goto L_0x007c
        L_0x0032:
            r9 = move-exception
            goto L_0x008e
        L_0x0034:
            java.lang.Object r1 = r8.L$0
            y23 r1 = (p000.y23) r1
            p000.hg5.m45199b(r9)
            goto L_0x0067
        L_0x003c:
            p000.hg5.m45199b(r9)
            java.lang.Object r9 = r8.L$0
            hu0 r9 = (p000.hu0) r9
            kotlin.coroutines.CoroutineContext r9 = r9.mo6303A()
            y23$b r1 = p000.y23.f46117l
            kotlin.coroutines.CoroutineContext$a r9 = r9.get(r1)
            if (r9 == 0) goto L_0x00a4
            y23 r9 = (p000.y23) r9
            androidx.paging.SingleRunner r1 = r8.this$0
            androidx.paging.SingleRunner$Holder r1 = r1.f6237a
            int r6 = r8.$priority
            r8.L$0 = r9
            r8.label = r5
            java.lang.Object r1 = r1.mo8757b(r6, r9, r8)
            if (r1 != r0) goto L_0x0064
            return r0
        L_0x0064:
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x0067:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00a1
            rc2 r9 = r8.$block     // Catch:{ all -> 0x0032 }
            r8.L$0 = r1     // Catch:{ all -> 0x0032 }
            r8.label = r4     // Catch:{ all -> 0x0032 }
            java.lang.Object r9 = r9.invoke(r8)     // Catch:{ all -> 0x0032 }
            if (r9 != r0) goto L_0x007c
            return r0
        L_0x007c:
            androidx.paging.SingleRunner r9 = r8.this$0
            androidx.paging.SingleRunner$Holder r9 = r9.f6237a
            r2 = 0
            r8.L$0 = r2
            r8.label = r3
            java.lang.Object r9 = r9.mo8756a(r1, r8)
            if (r9 != r0) goto L_0x00a1
            return r0
        L_0x008e:
            androidx.paging.SingleRunner r3 = r8.this$0
            androidx.paging.SingleRunner$Holder r3 = r3.f6237a
            r8.L$0 = r9
            r8.label = r2
            java.lang.Object r1 = r3.mo8756a(r1, r8)
            if (r1 != r0) goto L_0x009f
            return r0
        L_0x009f:
            r0 = r9
        L_0x00a0:
            throw r0
        L_0x00a1:
            r37 r9 = p000.r37.f33317a
            return r9
        L_0x00a4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Internal error. coroutineScope should've created a job."
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner$runInIsolation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
