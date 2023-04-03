package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"T", "La52;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 1})
@v21(mo48631c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", mo48632f = "FlowLiveData.kt", mo48633l = {96, 100, 101}, mo48634m = "invokeSuspend")
/* compiled from: FlowLiveData.kt */
public final class FlowLiveDataConversions$asFlow$1 extends SuspendLambda implements fd2<a52<? super T>, ns0<? super r37>, Object> {
    public final /* synthetic */ LiveData $this_asFlow;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lr37;", "onChanged", "(Ljava/lang/Object;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 1})
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$a */
    /* compiled from: FlowLiveData.kt */
    public static final class C0693a<T> implements pf4<T> {

        /* renamed from: a */
        public final /* synthetic */ fd0 f3896a;

        public C0693a(fd0 fd0) {
            this.f3896a = fd0;
        }

        public final void onChanged(T t) {
            this.f3896a.offer(t);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1(LiveData liveData, ns0 ns0) {
        super(2, ns0);
        this.$this_asFlow = liveData;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.$this_asFlow, ns0);
        flowLiveDataConversions$asFlow$1.L$0 = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((FlowLiveDataConversions$asFlow$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: a52} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5 A[Catch:{ all -> 0x00d4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r14.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0053
            if (r1 == r4) goto L_0x0043
            if (r1 == r3) goto L_0x002b
            if (r1 != r2) goto L_0x0023
            java.lang.Object r1 = r14.L$2
            md0 r1 = (p000.md0) r1
            java.lang.Object r4 = r14.L$1
            pf4 r4 = (p000.pf4) r4
            java.lang.Object r6 = r14.L$0
            a52 r6 = (p000.a52) r6
            p000.hg5.m45199b(r15)     // Catch:{ all -> 0x003f }
            r15 = r1
            goto L_0x0088
        L_0x0023:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x002b:
            java.lang.Object r1 = r14.L$2
            md0 r1 = (p000.md0) r1
            java.lang.Object r4 = r14.L$1
            pf4 r4 = (p000.pf4) r4
            java.lang.Object r6 = r14.L$0
            a52 r6 = (p000.a52) r6
            p000.hg5.m45199b(r15)     // Catch:{ all -> 0x003f }
            r7 = r6
            r6 = r4
            r4 = r1
            r1 = r14
            goto L_0x009d
        L_0x003f:
            r15 = move-exception
        L_0x0040:
            r1 = r14
            goto L_0x00dd
        L_0x0043:
            java.lang.Object r1 = r14.L$2
            pf4 r1 = (p000.pf4) r1
            java.lang.Object r4 = r14.L$1
            fd0 r4 = (p000.fd0) r4
            java.lang.Object r6 = r14.L$0
            a52 r6 = (p000.a52) r6
            p000.hg5.m45199b(r15)
            goto L_0x0083
        L_0x0053:
            p000.hg5.m45199b(r15)
            java.lang.Object r15 = r14.L$0
            r6 = r15
            a52 r6 = (p000.a52) r6
            r15 = -1
            r1 = 6
            fd0 r15 = p000.od0.m70236b(r15, r5, r5, r1, r5)
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$a r1 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$a
            r1.<init>(r15)
            vm3 r7 = p000.qh1.m71266c()
            vm3 r7 = r7.mo55551K()
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 r8 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1
            r8.<init>(r14, r1, r5)
            r14.L$0 = r6
            r14.L$1 = r15
            r14.L$2 = r1
            r14.label = r4
            java.lang.Object r4 = p000.b50.m55768e(r7, r8, r14)
            if (r4 != r0) goto L_0x0082
            return r0
        L_0x0082:
            r4 = r15
        L_0x0083:
            md0 r15 = r4.iterator()     // Catch:{ all -> 0x00d9 }
            r4 = r1
        L_0x0088:
            r1 = r14
        L_0x0089:
            r1.L$0 = r6     // Catch:{ all -> 0x00d7 }
            r1.L$1 = r4     // Catch:{ all -> 0x00d7 }
            r1.L$2 = r15     // Catch:{ all -> 0x00d7 }
            r1.label = r3     // Catch:{ all -> 0x00d7 }
            java.lang.Object r7 = r15.mo55581a(r1)     // Catch:{ all -> 0x00d7 }
            if (r7 != r0) goto L_0x0098
            return r0
        L_0x0098:
            r13 = r4
            r4 = r15
            r15 = r7
            r7 = r6
            r6 = r13
        L_0x009d:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ all -> 0x00d4 }
            boolean r15 = r15.booleanValue()     // Catch:{ all -> 0x00d4 }
            if (r15 == 0) goto L_0x00bc
            java.lang.Object r15 = r4.next()     // Catch:{ all -> 0x00d4 }
            r1.L$0 = r7     // Catch:{ all -> 0x00d4 }
            r1.L$1 = r6     // Catch:{ all -> 0x00d4 }
            r1.L$2 = r4     // Catch:{ all -> 0x00d4 }
            r1.label = r2     // Catch:{ all -> 0x00d4 }
            java.lang.Object r15 = r7.emit(r15, r1)     // Catch:{ all -> 0x00d4 }
            if (r15 != r0) goto L_0x00b8
            return r0
        L_0x00b8:
            r15 = r4
            r4 = r6
            r6 = r7
            goto L_0x0089
        L_0x00bc:
            ih2 r7 = p000.ih2.f38385a
            vm3 r15 = p000.qh1.m71266c()
            vm3 r8 = r15.mo55551K()
            r9 = 0
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 r10 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2
            r10.<init>(r1, r6, r5)
            r11 = 2
            r12 = 0
            p000.y23 unused = p000.d50.m56748b(r7, r8, r9, r10, r11, r12)
            r37 r15 = p000.r37.f33317a
            return r15
        L_0x00d4:
            r15 = move-exception
            r4 = r6
            goto L_0x00dd
        L_0x00d7:
            r15 = move-exception
            goto L_0x00dd
        L_0x00d9:
            r15 = move-exception
            r4 = r1
            goto L_0x0040
        L_0x00dd:
            ih2 r6 = p000.ih2.f38385a
            vm3 r0 = p000.qh1.m71266c()
            vm3 r7 = r0.mo55551K()
            r8 = 0
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 r9 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2
            r9.<init>(r1, r4, r5)
            r10 = 2
            r11 = 0
            p000.y23 unused = p000.d50.m56748b(r6, r7, r8, r9, r10, r11)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FlowLiveDataConversions$asFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
