package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u00103\u001a\u00020\u0005¢\u0006\u0004\b4\u00101J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J!\u0010*\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u00052\u0006\u0010)\u001a\u00020\u0005H\u0002¢\u0006\u0004\b*\u0010\u000bR\u0016\u0010-\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R*\u0010\f\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00008V@VX\u000e¢\u0006\u0012\u0012\u0004\b2\u0010\u0013\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u0002\u0004\n\u0002\b\u0019¨\u00065"}, mo44877d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "Lb7;", "Lv86;", "Lu04;", "", "Lge2;", "expect", "update", "", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "value", "b", "(Ljava/lang/Object;)Z", "Lr37;", "emit", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "g", "()V", "La52;", "collector", "", "a", "(La52;Lns0;)Ljava/lang/Object;", "o", "()Lv86;", "", "size", "", "p", "(I)[Lv86;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lz42;", "d", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lz42;", "expectedState", "newState", "q", "k", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "initialState", "<init>", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: StateFlow.kt */
public final class StateFlowImpl<T> extends C6850b7<v86> implements u04<T>, z42, ge2<T> {
    private volatile /* synthetic */ Object _state;

    /* renamed from: k */
    public int f40449k;

    public StateFlowImpl(Object obj) {
        this._state = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: v86} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlinx.coroutines.flow.StateFlowImpl} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b9 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ce A[Catch:{ all -> 0x0073 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d6 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo8646a(p000.a52<? super T> r11, p000.ns0<?> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.StateFlowImpl$collect$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.StateFlowImpl$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.StateFlowImpl$collect$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0076
            if (r2 == r6) goto L_0x0061
            if (r2 == r5) goto L_0x004a
            if (r2 != r4) goto L_0x0042
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            y23 r2 = (p000.y23) r2
            java.lang.Object r6 = r0.L$2
            v86 r6 = (p000.v86) r6
            java.lang.Object r7 = r0.L$1
            a52 r7 = (p000.a52) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            p000.hg5.m45199b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00a6
        L_0x0042:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004a:
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            y23 r2 = (p000.y23) r2
            java.lang.Object r6 = r0.L$2
            v86 r6 = (p000.v86) r6
            java.lang.Object r7 = r0.L$1
            a52 r7 = (p000.a52) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            p000.hg5.m45199b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00d0
        L_0x0061:
            java.lang.Object r11 = r0.L$2
            r6 = r11
            v86 r6 = (p000.v86) r6
            java.lang.Object r11 = r0.L$1
            a52 r11 = (p000.a52) r11
            java.lang.Object r2 = r0.L$0
            r8 = r2
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            p000.hg5.m45199b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x0097
        L_0x0073:
            r11 = move-exception
            goto L_0x00ec
        L_0x0076:
            p000.hg5.m45199b(r12)
            d7 r12 = r10.mo50502i()
            v86 r12 = (p000.v86) r12
            boolean r2 = r11 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch:{ all -> 0x00e9 }
            if (r2 == 0) goto L_0x0095
            r2 = r11
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r2     // Catch:{ all -> 0x00e9 }
            r0.L$0 = r10     // Catch:{ all -> 0x00e9 }
            r0.L$1 = r11     // Catch:{ all -> 0x00e9 }
            r0.L$2 = r12     // Catch:{ all -> 0x00e9 }
            r0.label = r6     // Catch:{ all -> 0x00e9 }
            java.lang.Object r2 = r2.mo55663a(r0)     // Catch:{ all -> 0x00e9 }
            if (r2 != r1) goto L_0x0095
            return r1
        L_0x0095:
            r8 = r10
            r6 = r12
        L_0x0097:
            kotlin.coroutines.CoroutineContext r12 = r0.getContext()     // Catch:{ all -> 0x0073 }
            y23$b r2 = p000.y23.f46117l     // Catch:{ all -> 0x0073 }
            kotlin.coroutines.CoroutineContext$a r12 = r12.get(r2)     // Catch:{ all -> 0x0073 }
            y23 r12 = (p000.y23) r12     // Catch:{ all -> 0x0073 }
            r7 = r11
            r2 = r12
            r11 = r3
        L_0x00a6:
            java.lang.Object r12 = r8._state     // Catch:{ all -> 0x0073 }
            if (r2 == 0) goto L_0x00ad
            p000.g33.m58013j(r2)     // Catch:{ all -> 0x0073 }
        L_0x00ad:
            if (r11 == 0) goto L_0x00b5
            boolean r9 = p000.vx2.m53586b(r11, r12)     // Catch:{ all -> 0x0073 }
            if (r9 != 0) goto L_0x00d0
        L_0x00b5:
            xj6 r11 = p000.yb4.f46149a     // Catch:{ all -> 0x0073 }
            if (r12 != r11) goto L_0x00bb
            r11 = r3
            goto L_0x00bc
        L_0x00bb:
            r11 = r12
        L_0x00bc:
            r0.L$0 = r8     // Catch:{ all -> 0x0073 }
            r0.L$1 = r7     // Catch:{ all -> 0x0073 }
            r0.L$2 = r6     // Catch:{ all -> 0x0073 }
            r0.L$3 = r2     // Catch:{ all -> 0x0073 }
            r0.L$4 = r12     // Catch:{ all -> 0x0073 }
            r0.label = r5     // Catch:{ all -> 0x0073 }
            java.lang.Object r11 = r7.emit(r11, r0)     // Catch:{ all -> 0x0073 }
            if (r11 != r1) goto L_0x00cf
            return r1
        L_0x00cf:
            r11 = r12
        L_0x00d0:
            boolean r12 = r6.mo66462g()     // Catch:{ all -> 0x0073 }
            if (r12 != 0) goto L_0x00a6
            r0.L$0 = r8     // Catch:{ all -> 0x0073 }
            r0.L$1 = r7     // Catch:{ all -> 0x0073 }
            r0.L$2 = r6     // Catch:{ all -> 0x0073 }
            r0.L$3 = r2     // Catch:{ all -> 0x0073 }
            r0.L$4 = r11     // Catch:{ all -> 0x0073 }
            r0.label = r4     // Catch:{ all -> 0x0073 }
            java.lang.Object r12 = r6.mo66459d(r0)     // Catch:{ all -> 0x0073 }
            if (r12 != r1) goto L_0x00a6
            return r1
        L_0x00e9:
            r11 = move-exception
            r8 = r10
            r6 = r12
        L_0x00ec:
            r8.mo50505l(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.mo8646a(a52, ns0):java.lang.Object");
    }

    /* renamed from: b */
    public boolean mo55645b(T t) {
        setValue(t);
        return true;
    }

    /* renamed from: d */
    public z42<T> mo51907d(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return u86.m72661d(this, coroutineContext, i, bufferOverflow);
    }

    /* renamed from: e */
    public boolean mo55657e(T t, T t2) {
        if (t == null) {
            t = yb4.f46149a;
        }
        if (t2 == null) {
            t2 = yb4.f46149a;
        }
        return mo55661q(t, t2);
    }

    public Object emit(T t, ns0<? super r37> ns0) {
        setValue(t);
        return r37.f33317a;
    }

    /* renamed from: g */
    public void mo55646g() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public T getValue() {
        T t = yb4.f46149a;
        T t2 = this._state;
        if (t2 == t) {
            return null;
        }
        return t2;
    }

    /* renamed from: o */
    public v86 mo50503j() {
        return new v86();
    }

    /* renamed from: p */
    public v86[] mo50504k(int i) {
        return new v86[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        r8 = (p000.v86[]) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        if (r8 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        r2 = r8.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0032, code lost:
        if (r3 >= r2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0034, code lost:
        r4 = r8[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0036, code lost:
        if (r4 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0038, code lost:
        r4.mo66461f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003e, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r8 = r6.f40449k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0041, code lost:
        if (r8 != r7) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0043, code lost:
        r6.f40449k = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0046, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0047, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r7 = mo50507n();
        r2 = p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004e, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x004f, code lost:
        r5 = r8;
        r8 = r7;
        r7 = r5;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo55661q(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r6.mo50507n()
            monitor-enter(r6)
            java.lang.Object r0 = r6._state     // Catch:{ all -> 0x005c }
            r1 = 0
            if (r7 == 0) goto L_0x0011
            boolean r7 = p000.vx2.m53586b(r0, r7)     // Catch:{ all -> 0x005c }
            if (r7 != 0) goto L_0x0011
            monitor-exit(r6)
            return r1
        L_0x0011:
            boolean r7 = p000.vx2.m53586b(r0, r8)     // Catch:{ all -> 0x005c }
            r0 = 1
            if (r7 == 0) goto L_0x001a
            monitor-exit(r6)
            return r0
        L_0x001a:
            r6._state = r8     // Catch:{ all -> 0x005c }
            int r7 = r6.f40449k     // Catch:{ all -> 0x005c }
            r8 = r7 & 1
            if (r8 != 0) goto L_0x0056
            int r7 = r7 + r0
            r6.f40449k = r7     // Catch:{ all -> 0x005c }
            d7[] r8 = r6.mo50507n()     // Catch:{ all -> 0x005c }
            r37 r2 = p000.r37.f33317a     // Catch:{ all -> 0x005c }
            monitor-exit(r6)
        L_0x002c:
            v86[] r8 = (p000.v86[]) r8
            if (r8 == 0) goto L_0x003e
            int r2 = r8.length
            r3 = r1
        L_0x0032:
            if (r3 >= r2) goto L_0x003e
            r4 = r8[r3]
            if (r4 == 0) goto L_0x003b
            r4.mo66461f()
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x0032
        L_0x003e:
            monitor-enter(r6)
            int r8 = r6.f40449k     // Catch:{ all -> 0x0053 }
            if (r8 != r7) goto L_0x0048
            int r7 = r7 + r0
            r6.f40449k = r7     // Catch:{ all -> 0x0053 }
            monitor-exit(r6)
            return r0
        L_0x0048:
            d7[] r7 = r6.mo50507n()     // Catch:{ all -> 0x0053 }
            r37 r2 = p000.r37.f33317a     // Catch:{ all -> 0x0053 }
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x002c
        L_0x0053:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0056:
            int r7 = r7 + 2
            r6.f40449k = r7     // Catch:{ all -> 0x005c }
            monitor-exit(r6)
            return r0
        L_0x005c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.mo55661q(java.lang.Object, java.lang.Object):boolean");
    }

    public void setValue(T t) {
        if (t == null) {
            t = yb4.f46149a;
        }
        mo55661q((Object) null, t);
    }
}
