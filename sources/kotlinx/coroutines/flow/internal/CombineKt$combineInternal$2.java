package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@"}, mo44877d2 = {"R", "T", "Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", mo48632f = "Combine.kt", mo48633l = {57, 79, 82}, mo48634m = "invokeSuspend")
/* compiled from: Combine.kt */
public final class CombineKt$combineInternal$2 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ pc2<T[]> $arrayFactory;
    public final /* synthetic */ z42<T>[] $flows;
    public final /* synthetic */ a52<R> $this_combineInternal;
    public final /* synthetic */ id2<a52<? super R>, T[], ns0<? super r37>, Object> $transform;
    public int I$0;
    public int I$1;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2(z42<? extends T>[] z42Arr, pc2<T[]> pc2, id2<? super a52<? super R>, ? super T[], ? super ns0<? super r37>, ? extends Object> id2, a52<? super R> a52, ns0<? super CombineKt$combineInternal$2> ns0) {
        super(2, ns0);
        this.$flows = z42Arr;
        this.$arrayFactory = pc2;
        this.$transform = id2;
        this.$this_combineInternal = a52;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, ns0);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CombineKt$combineInternal$2) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ec A[LOOP:1: B:26:0x00ec->B:32:0x010f, LOOP_START, PHI: r3 r10 
      PHI: (r3v3 int) = (r3v2 int), (r3v4 int) binds: [B:23:0x00e7, B:32:0x010f] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v3 wt2) = (r10v2 wt2), (r10v16 wt2) binds: [B:23:0x00e7, B:32:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0076
            if (r2 == r6) goto L_0x0052
            if (r2 == r5) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            int r2 = r0.I$1
            int r3 = r0.I$0
            java.lang.Object r7 = r0.L$2
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.L$1
            fd0 r8 = (p000.fd0) r8
            java.lang.Object r9 = r0.L$0
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            p000.hg5.m45199b(r24)
            r13 = r3
            r14 = r9
            r3 = r2
            r2 = r7
            r7 = r8
            r8 = r0
            goto L_0x0165
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            int r2 = r0.I$1
            int r3 = r0.I$0
            java.lang.Object r7 = r0.L$2
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.L$1
            fd0 r8 = (p000.fd0) r8
            java.lang.Object r9 = r0.L$0
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            p000.hg5.m45199b(r24)
            r13 = r3
            r14 = r9
            r3 = r2
            r2 = r7
            r7 = r8
            r8 = r0
            goto L_0x00c7
        L_0x0052:
            int r2 = r0.I$1
            int r3 = r0.I$0
            java.lang.Object r7 = r0.L$2
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.L$1
            fd0 r8 = (p000.fd0) r8
            java.lang.Object r9 = r0.L$0
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            p000.hg5.m45199b(r24)
            r10 = r24
            qd0 r10 = (p000.qd0) r10
            java.lang.Object r10 = r10.mo65445l()
            r15 = r9
            r9 = r0
            r22 = r7
            r7 = r2
            r2 = r22
            goto L_0x00e1
        L_0x0076:
            p000.hg5.m45199b(r24)
            java.lang.Object r2 = r0.L$0
            hu0 r2 = (p000.hu0) r2
            z42<T>[] r7 = r0.$flows
            int r13 = r7.length
            if (r13 != 0) goto L_0x0085
            r37 r1 = p000.r37.f33317a
            return r1
        L_0x0085:
            java.lang.Object[] r14 = new java.lang.Object[r13]
            xj6 r8 = p000.yb4.f46150b
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            r7 = r14
            p000.C6706xq.m54505s(r7, r8, r9, r10, r11, r12)
            r7 = 6
            r8 = 0
            fd0 r21 = p000.od0.m70236b(r13, r8, r8, r7, r8)
            java.util.concurrent.atomic.AtomicInteger r12 = new java.util.concurrent.atomic.AtomicInteger
            r12.<init>(r13)
            r11 = r3
        L_0x009d:
            if (r11 >= r13) goto L_0x00c2
            r8 = 0
            r9 = 0
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 r10 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1
            z42<T>[] r7 = r0.$flows
            r20 = 0
            r15 = r10
            r16 = r7
            r17 = r11
            r18 = r12
            r19 = r21
            r15.<init>(r16, r17, r18, r19, r20)
            r15 = 3
            r16 = 0
            r7 = r2
            r11 = r15
            r15 = r12
            r12 = r16
            p000.y23 unused = p000.d50.m56748b(r7, r8, r9, r10, r11, r12)
            int r11 = r17 + 1
            r12 = r15
            goto L_0x009d
        L_0x00c2:
            byte[] r2 = new byte[r13]
            r8 = r0
            r7 = r21
        L_0x00c7:
            int r3 = r3 + r6
            byte r3 = (byte) r3
            r8.L$0 = r14
            r8.L$1 = r7
            r8.L$2 = r2
            r8.I$0 = r13
            r8.I$1 = r3
            r8.label = r6
            java.lang.Object r10 = r7.mo52175D(r8)
            if (r10 != r1) goto L_0x00dc
            return r1
        L_0x00dc:
            r9 = r8
            r15 = r14
            r8 = r7
            r7 = r3
            r3 = r13
        L_0x00e1:
            java.lang.Object r10 = p000.qd0.m71227f(r10)
            wt2 r10 = (p000.wt2) r10
            if (r10 != 0) goto L_0x00ec
            r37 r1 = p000.r37.f33317a
            return r1
        L_0x00ec:
            int r11 = r10.mo49265c()
            r12 = r15[r11]
            java.lang.Object r10 = r10.mo49266d()
            r15[r11] = r10
            xj6 r10 = p000.yb4.f46150b
            if (r12 != r10) goto L_0x00fe
            int r3 = r3 + -1
        L_0x00fe:
            byte r10 = r2[r11]
            if (r10 == r7) goto L_0x0111
            byte r10 = (byte) r7
            r2[r11] = r10
            java.lang.Object r10 = r8.mo52183r()
            java.lang.Object r10 = p000.qd0.m71227f(r10)
            wt2 r10 = (p000.wt2) r10
            if (r10 != 0) goto L_0x00ec
        L_0x0111:
            if (r3 != 0) goto L_0x0168
            pc2<T[]> r10 = r9.$arrayFactory
            java.lang.Object r10 = r10.invoke()
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            if (r10 != 0) goto L_0x013a
            id2<a52<? super R>, T[], ns0<? super r37>, java.lang.Object> r10 = r9.$transform
            a52<R> r11 = r9.$this_combineInternal
            r9.L$0 = r15
            r9.L$1 = r8
            r9.L$2 = r2
            r9.I$0 = r3
            r9.I$1 = r7
            r9.label = r5
            java.lang.Object r10 = r10.invoke(r11, r15, r9)
            if (r10 != r1) goto L_0x0134
            return r1
        L_0x0134:
            r13 = r3
            r3 = r7
            r7 = r8
            r8 = r9
            r14 = r15
            goto L_0x00c7
        L_0x013a:
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 14
            r18 = 0
            r11 = r15
            r12 = r10
            r5 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            p000.C6706xq.m54499m(r11, r12, r13, r14, r15, r16, r17)
            id2<a52<? super R>, T[], ns0<? super r37>, java.lang.Object> r11 = r9.$transform
            a52<R> r12 = r9.$this_combineInternal
            r9.L$0 = r5
            r9.L$1 = r8
            r9.L$2 = r2
            r9.I$0 = r3
            r9.I$1 = r7
            r9.label = r4
            java.lang.Object r10 = r11.invoke(r12, r10, r9)
            if (r10 != r1) goto L_0x0169
            return r1
        L_0x0165:
            r5 = 2
            goto L_0x00c7
        L_0x0168:
            r5 = r15
        L_0x0169:
            r13 = r3
            r14 = r5
            r3 = r7
            r7 = r8
            r8 = r9
            goto L_0x0165
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
