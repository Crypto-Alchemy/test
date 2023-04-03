package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo44877d2 = {"Ljw5;", "Ly23;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "kotlinx.coroutines.JobSupport$children$1", mo48632f = "JobSupport.kt", mo48633l = {952, 954}, mo48634m = "invokeSuspend")
/* compiled from: JobSupport.kt */
public final class JobSupport$children$1 extends RestrictedSuspendLambda implements fd2<jw5<? super y23>, ns0<? super r37>, Object> {
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ JobSupport this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(JobSupport jobSupport, ns0<? super JobSupport$children$1> ns0) {
        super(2, ns0);
        this.this$0 = jobSupport;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.this$0, ns0);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    public final Object invoke(jw5<? super y23> jw5, ns0<? super r37> ns0) {
        return ((JobSupport$children$1) create(jw5, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002b
            if (r1 == r3) goto L_0x0027
            if (r1 != r2) goto L_0x001f
            java.lang.Object r1 = r7.L$2
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.lang.Object r3 = r7.L$1
            bk3 r3 = (p000.bk3) r3
            java.lang.Object r4 = r7.L$0
            jw5 r4 = (p000.jw5) r4
            p000.hg5.m45199b(r8)
            r8 = r7
            goto L_0x007e
        L_0x001f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0027:
            p000.hg5.m45199b(r8)
            goto L_0x0083
        L_0x002b:
            p000.hg5.m45199b(r8)
            java.lang.Object r8 = r7.L$0
            jw5 r8 = (p000.jw5) r8
            kotlinx.coroutines.JobSupport r1 = r7.this$0
            java.lang.Object r1 = r1.mo55512i0()
            boolean r4 = r1 instanceof p000.ie0
            if (r4 == 0) goto L_0x0049
            ie0 r1 = (p000.ie0) r1
            je0 r1 = r1.f38376k
            r7.label = r3
            java.lang.Object r8 = r8.mo52541a(r1, r7)
            if (r8 != r0) goto L_0x0083
            return r0
        L_0x0049:
            boolean r3 = r1 instanceof p000.mt2
            if (r3 == 0) goto L_0x0083
            mt2 r1 = (p000.mt2) r1
            e84 r1 = r1.mo51283c()
            if (r1 == 0) goto L_0x0083
            java.lang.Object r3 = r1.mo55691n()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r8
            r8 = r7
            r6 = r3
            r3 = r1
            r1 = r6
        L_0x0060:
            boolean r5 = p000.vx2.m53586b(r1, r3)
            if (r5 != 0) goto L_0x0083
            boolean r5 = r1 instanceof p000.ie0
            if (r5 == 0) goto L_0x007e
            r5 = r1
            ie0 r5 = (p000.ie0) r5
            je0 r5 = r5.f38376k
            r8.L$0 = r4
            r8.L$1 = r3
            r8.L$2 = r1
            r8.label = r2
            java.lang.Object r5 = r4.mo52541a(r5, r8)
            if (r5 != r0) goto L_0x007e
            return r0
        L_0x007e:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.mo55692o()
            goto L_0x0060
        L_0x0083:
            r37 r8 = p000.r37.f33317a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
