package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"T", "La52;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", mo48632f = "SimpleChannelFlow.kt", mo48633l = {46}, mo48634m = "invokeSuspend")
/* compiled from: SimpleChannelFlow.kt */
public final class SimpleChannelFlowKt$simpleChannelFlow$1 extends SuspendLambda implements fd2<a52<? super T>, ns0<? super r37>, Object> {
    public final /* synthetic */ fd2 $block;
    private /* synthetic */ Object L$0;
    public int label;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"T", "Lhu0;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
    @v21(mo48631c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", mo48632f = "SimpleChannelFlow.kt", mo48633l = {64, 65}, mo48634m = "invokeSuspend")
    /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1 */
    /* compiled from: SimpleChannelFlow.kt */
    public static final class C11901 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ SimpleChannelFlowKt$simpleChannelFlow$1 this$0;

        {
            this.this$0 = r1;
        }

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            vx2.m53591g(ns0, "completion");
            C11901 r0 = new C11901(this.this$0, a52, ns0);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C11901) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x006c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = p000.wx2.m54101d()
                int r1 = r12.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0032
                if (r1 == r3) goto L_0x0025
                if (r1 != r2) goto L_0x001d
                java.lang.Object r1 = r12.L$1
                md0 r1 = (p000.md0) r1
                java.lang.Object r5 = r12.L$0
                y23 r5 = (p000.y23) r5
                p000.hg5.m45199b(r13)
                r13 = r1
                r1 = r5
                goto L_0x0051
            L_0x001d:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0025:
                java.lang.Object r1 = r12.L$1
                md0 r1 = (p000.md0) r1
                java.lang.Object r5 = r12.L$0
                y23 r5 = (p000.y23) r5
                p000.hg5.m45199b(r13)
                r6 = r12
                goto L_0x0064
            L_0x0032:
                p000.hg5.m45199b(r13)
                java.lang.Object r13 = r12.L$0
                r5 = r13
                hu0 r5 = (p000.hu0) r5
                r13 = 0
                r1 = 6
                fd0 r13 = p000.od0.m70236b(r13, r4, r4, r1, r4)
                r6 = 0
                r7 = 0
                androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 r8 = new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1
                r8.<init>(r12, r13, r4)
                r9 = 3
                r10 = 0
                y23 r1 = p000.d50.m56748b(r5, r6, r7, r8, r9, r10)
                md0 r13 = r13.iterator()
            L_0x0051:
                r5 = r12
            L_0x0052:
                r5.L$0 = r1
                r5.L$1 = r13
                r5.label = r3
                java.lang.Object r6 = r13.mo55581a(r5)
                if (r6 != r0) goto L_0x005f
                return r0
            L_0x005f:
                r11 = r1
                r1 = r13
                r13 = r6
                r6 = r5
                r5 = r11
            L_0x0064:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L_0x0083
                java.lang.Object r13 = r1.next()
                a52 r7 = r5
                r6.L$0 = r5
                r6.L$1 = r1
                r6.label = r2
                java.lang.Object r13 = r7.emit(r13, r6)
                if (r13 != r0) goto L_0x007f
                return r0
            L_0x007f:
                r13 = r1
                r1 = r5
                r5 = r6
                goto L_0x0052
            L_0x0083:
                p000.y23.C9621a.m74226a(r5, r4, r3, r4)
                r37 r13 = p000.r37.f33317a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1.C11901.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleChannelFlowKt$simpleChannelFlow$1(fd2 fd2, ns0 ns0) {
        super(2, ns0);
        this.$block = fd2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$1 = new SimpleChannelFlowKt$simpleChannelFlow$1(this.$block, ns0);
        simpleChannelFlowKt$simpleChannelFlow$1.L$0 = obj;
        return simpleChannelFlowKt$simpleChannelFlow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((SimpleChannelFlowKt$simpleChannelFlow$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            final a52 a52 = (a52) this.L$0;
            C11901 r1 = new C11901(this, (ns0) null);
            this.label = 1;
            if (iu0.m59115e(r1, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
