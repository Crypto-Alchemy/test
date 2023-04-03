package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", mo48632f = "RepeatOnLifecycle.kt", mo48633l = {84}, mo48634m = "invokeSuspend")
/* compiled from: RepeatOnLifecycle.kt */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ fd2<hu0, ns0<? super r37>, Object> $block;
    public final /* synthetic */ Lifecycle.State $state;
    public final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    public int label;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
    @v21(mo48631c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", mo48632f = "RepeatOnLifecycle.kt", mo48633l = {166}, mo48634m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 */
    /* compiled from: RepeatOnLifecycle.kt */
    public static final class C07011 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C07011(lifecycle, state, hu0, fd2, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C07011) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r16
                java.lang.Object r0 = p000.wx2.m54101d()
                int r2 = r1.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0038
                if (r2 != r4) goto L_0x0030
                java.lang.Object r0 = r1.L$5
                fd2 r0 = (p000.fd2) r0
                java.lang.Object r0 = r1.L$4
                hu0 r0 = (p000.hu0) r0
                java.lang.Object r0 = r1.L$3
                androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
                java.lang.Object r0 = r1.L$2
                androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                java.lang.Object r0 = r1.L$1
                r2 = r0
                kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
                java.lang.Object r0 = r1.L$0
                r5 = r0
                kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
                p000.hg5.m45199b(r17)     // Catch:{ all -> 0x002d }
                goto L_0x00a4
            L_0x002d:
                r0 = move-exception
                goto L_0x00bf
            L_0x0030:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0038:
                p000.hg5.m45199b(r17)
                androidx.lifecycle.Lifecycle r2 = r4
                androidx.lifecycle.Lifecycle$State r2 = r2.mo6296b()
                androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.DESTROYED
                if (r2 != r5) goto L_0x0048
                r37 r0 = p000.r37.f33317a
                return r0
            L_0x0048:
                kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
                r2.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
                r13.<init>()
                androidx.lifecycle.Lifecycle$State r5 = r5     // Catch:{ all -> 0x00bc }
                androidx.lifecycle.Lifecycle r14 = r4     // Catch:{ all -> 0x00bc }
                hu0 r8 = r6     // Catch:{ all -> 0x00bc }
                fd2<hu0, ns0<? super r37>, java.lang.Object> r12 = r7     // Catch:{ all -> 0x00bc }
                r1.L$0 = r2     // Catch:{ all -> 0x00bc }
                r1.L$1 = r13     // Catch:{ all -> 0x00bc }
                r1.L$2 = r5     // Catch:{ all -> 0x00bc }
                r1.L$3 = r14     // Catch:{ all -> 0x00bc }
                r1.L$4 = r8     // Catch:{ all -> 0x00bc }
                r1.L$5 = r12     // Catch:{ all -> 0x00bc }
                r1.label = r4     // Catch:{ all -> 0x00bc }
                na0 r15 = new na0     // Catch:{ all -> 0x00bc }
                ns0 r6 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m47425c(r16)     // Catch:{ all -> 0x00bc }
                r15.<init>(r6, r4)     // Catch:{ all -> 0x00bc }
                r15.mo56425x()     // Catch:{ all -> 0x00bc }
                androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.Lifecycle.Event.upTo(r5)     // Catch:{ all -> 0x00bc }
                androidx.lifecycle.Lifecycle$Event r9 = androidx.lifecycle.Lifecycle.Event.downFrom(r5)     // Catch:{ all -> 0x00bc }
                r5 = 0
                y04 r11 = p000.z04.m74724b(r5, r4, r3)     // Catch:{ all -> 0x00bc }
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r10 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch:{ all -> 0x00bc }
                r5 = r10
                r7 = r2
                r3 = r10
                r10 = r15
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00bc }
                r13.element = r3     // Catch:{ all -> 0x00bc }
                r10 = r3
                androidx.lifecycle.e r10 = (androidx.lifecycle.C0715e) r10     // Catch:{ all -> 0x00bc }
                r14.mo6295a(r10)     // Catch:{ all -> 0x00bc }
                java.lang.Object r3 = r15.mo56421s()     // Catch:{ all -> 0x00bc }
                java.lang.Object r5 = p000.wx2.m54101d()     // Catch:{ all -> 0x00bc }
                if (r3 != r5) goto L_0x009f
                p000.a31.m31656c(r16)     // Catch:{ all -> 0x00bc }
            L_0x009f:
                if (r3 != r0) goto L_0x00a2
                return r0
            L_0x00a2:
                r5 = r2
                r2 = r13
            L_0x00a4:
                T r0 = r5.element
                y23 r0 = (p000.y23) r0
                if (r0 == 0) goto L_0x00ae
                r3 = 0
                p000.y23.C9621a.m74226a(r0, r3, r4, r3)
            L_0x00ae:
                T r0 = r2.element
                androidx.lifecycle.e r0 = (androidx.lifecycle.C0715e) r0
                if (r0 == 0) goto L_0x00b9
                androidx.lifecycle.Lifecycle r2 = r4
                r2.mo6297c(r0)
            L_0x00b9:
                r37 r0 = p000.r37.f33317a
                return r0
            L_0x00bc:
                r0 = move-exception
                r5 = r2
                r2 = r13
            L_0x00bf:
                T r3 = r5.element
                y23 r3 = (p000.y23) r3
                if (r3 == 0) goto L_0x00c9
                r5 = 0
                p000.y23.C9621a.m74226a(r3, r5, r4, r5)
            L_0x00c9:
                T r2 = r2.element
                androidx.lifecycle.e r2 = (androidx.lifecycle.C0715e) r2
                if (r2 == 0) goto L_0x00d4
                androidx.lifecycle.Lifecycle r3 = r4
                r3.mo6297c(r2)
            L_0x00d4:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.C07011.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, fd2<? super hu0, ? super ns0<? super r37>, ? extends Object> fd2, ns0<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> ns0) {
        super(2, ns0);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = fd2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, ns0);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            final hu0 hu0 = (hu0) this.L$0;
            vm3 K = qh1.m71266c().mo55551K();
            final Lifecycle lifecycle = this.$this_repeatOnLifecycle;
            final Lifecycle.State state = this.$state;
            final fd2<hu0, ns0<? super r37>, Object> fd2 = this.$block;
            C07011 r3 = new C07011((ns0<? super C07011>) null);
            this.label = 1;
            if (b50.m55768e(K, r3, this) == d) {
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
