package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u00012B\u001f\u0012\u0006\u0010H\u001a\u00020\u0014\u0012\u0006\u0010J\u001a\u00020\u0014\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\be\u0010fJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0002J9\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00122\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J(\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH\u0002J\b\u0010#\u001a\u00020\u000bH\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010\u00052\u0006\u0010$\u001a\u00020\u0003H\u0002J\u0010\u0010&\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0003H\u0002J\u0012\u0010(\u001a\u0004\u0018\u00010\u00052\u0006\u0010'\u001a\u00020\rH\u0002J\u001b\u0010)\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J3\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010+0\u00122\u0014\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010+0\u0012H\u0002¢\u0006\u0004\b-\u0010.J!\u00102\u001a\u0002012\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/H@ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b4\u0010\nJ\u001b\u00105\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b5\u0010\u001aJ\u000f\u00106\u001a\u00020\rH\u0000¢\u0006\u0004\b6\u00107J%\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010+0\u00122\u0006\u00108\u001a\u00020\rH\u0000¢\u0006\u0004\b9\u0010:J\b\u0010;\u001a\u00020\u0003H\u0014J\u001f\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00122\u0006\u0010<\u001a\u00020\u0014H\u0014¢\u0006\u0004\b=\u0010>J\b\u0010?\u001a\u00020\u000bH\u0016J&\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u00142\u0006\u0010D\u001a\u00020CH\u0016R\u0014\u0010H\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0011R\u0014\u0010J\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0011R\u0014\u0010D\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010O\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010-R\u0016\u0010Q\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010-R\u0016\u0010S\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010\u0011R\u0016\u0010T\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010V\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\bU\u00107R\u0014\u0010Y\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010XR\u0014\u0010]\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\\\u00107R\u0014\u0010_\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\b^\u00107R\u001a\u0010d\u001a\u00028\u00008DX\u0004¢\u0006\f\u0012\u0004\bb\u0010c\u001a\u0004\b`\u0010a\u0002\u0004\n\u0002\b\u0019¨\u0006g"}, mo44877d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Lb7;", "Lzz5;", "Lr04;", "", "Lge2;", "value", "", "S", "(Ljava/lang/Object;)Z", "Lr37;", "F", "", "newHead", "C", "item", "I", "", "curBuffer", "", "curSize", "newSize", "R", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "H", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/SharedFlowImpl$a;", "emitter", "z", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "W", "A", "slot", "V", "U", "index", "N", "y", "(Lzz5;Lns0;)Ljava/lang/Object;", "Lns0;", "resumesIn", "J", "([Lns0;)[Lns0;", "La52;", "collector", "", "a", "(La52;Lns0;)Ljava/lang/Object;", "b", "emit", "Y", "()J", "oldIndex", "X", "(J)[Lns0;", "D", "size", "E", "(I)[Lzz5;", "g", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lz42;", "d", "k", "replay", "r", "bufferCapacity", "s", "Lkotlinx/coroutines/channels/BufferOverflow;", "x", "[Ljava/lang/Object;", "buffer", "replayIndex", "minCollectorIndex", "B", "bufferSize", "queueSize", "L", "head", "P", "()I", "replaySize", "Q", "totalSize", "K", "bufferEndIndex", "O", "queueEndIndex", "M", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "()V", "lastReplayedLocked", "<init>", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: SharedFlow.kt */
public class SharedFlowImpl<T> extends C6850b7<zz5> implements r04<T>, z42, ge2<T> {

    /* renamed from: A */
    public long f40431A;

    /* renamed from: B */
    public int f40432B;

    /* renamed from: C */
    public int f40433C;

    /* renamed from: k */
    public final int f40434k;

    /* renamed from: r */
    public final int f40435r;

    /* renamed from: s */
    public final BufferOverflow f40436s;

    /* renamed from: x */
    public Object[] f40437x;

    /* renamed from: y */
    public long f40438y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$a;", "Lzh1;", "Lr37;", "dispose", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "a", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "flow", "", "d", "J", "index", "", "e", "Ljava/lang/Object;", "value", "Lns0;", "g", "Lns0;", "cont", "<init>", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lns0;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.SharedFlowImpl$a */
    /* compiled from: SharedFlow.kt */
    public static final class C7789a implements zh1 {

        /* renamed from: a */
        public final SharedFlowImpl<?> f40439a;

        /* renamed from: d */
        public long f40440d;

        /* renamed from: e */
        public final Object f40441e;

        /* renamed from: g */
        public final ns0<r37> f40442g;

        public C7789a(SharedFlowImpl<?> sharedFlowImpl, long j, Object obj, ns0<? super r37> ns0) {
            this.f40439a = sharedFlowImpl;
            this.f40440d = j;
            this.f40441e = obj;
            this.f40442g = ns0;
        }

        public void dispose() {
            this.f40439a.mo55648z(this);
        }
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* renamed from: kotlinx.coroutines.flow.SharedFlowImpl$b */
    /* compiled from: SharedFlow.kt */
    public /* synthetic */ class C7790b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40443a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            f40443a = iArr;
        }
    }

    public SharedFlowImpl(int i, int i2, BufferOverflow bufferOverflow) {
        this.f40434k = i;
        this.f40435r = i2;
        this.f40436s = bufferOverflow;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: zz5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab A[Catch:{ all -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc A[Catch:{ all -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m63382B(kotlinx.coroutines.flow.SharedFlowImpl r8, p000.a52 r9, p000.ns0 r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.SharedFlowImpl$collect$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.SharedFlowImpl$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.SharedFlowImpl$collect$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0075
            if (r2 == r5) goto L_0x005e
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r8 = r0.L$3
            y23 r8 = (p000.y23) r8
            java.lang.Object r9 = r0.L$2
            zz5 r9 = (p000.zz5) r9
            java.lang.Object r2 = r0.L$1
            a52 r2 = (p000.a52) r2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.SharedFlowImpl r5 = (kotlinx.coroutines.flow.SharedFlowImpl) r5
            goto L_0x0054
        L_0x003c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0044:
            java.lang.Object r8 = r0.L$3
            y23 r8 = (p000.y23) r8
            java.lang.Object r9 = r0.L$2
            zz5 r9 = (p000.zz5) r9
            java.lang.Object r2 = r0.L$1
            a52 r2 = (p000.a52) r2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.SharedFlowImpl r5 = (kotlinx.coroutines.flow.SharedFlowImpl) r5
        L_0x0054:
            p000.hg5.m45199b(r10)     // Catch:{ all -> 0x005b }
            r10 = r2
            r2 = r8
            r8 = r5
            goto L_0x00a3
        L_0x005b:
            r8 = move-exception
            goto L_0x00da
        L_0x005e:
            java.lang.Object r8 = r0.L$2
            r9 = r8
            zz5 r9 = (p000.zz5) r9
            java.lang.Object r8 = r0.L$1
            a52 r8 = (p000.a52) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.SharedFlowImpl r2 = (kotlinx.coroutines.flow.SharedFlowImpl) r2
            p000.hg5.m45199b(r10)     // Catch:{ all -> 0x0071 }
            r10 = r8
            r8 = r2
            goto L_0x0097
        L_0x0071:
            r8 = move-exception
            r5 = r2
            goto L_0x00da
        L_0x0075:
            p000.hg5.m45199b(r10)
            d7 r10 = r8.mo50502i()
            zz5 r10 = (p000.zz5) r10
            boolean r2 = r9 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch:{ all -> 0x00d6 }
            if (r2 == 0) goto L_0x0094
            r2 = r9
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r2     // Catch:{ all -> 0x00d6 }
            r0.L$0 = r8     // Catch:{ all -> 0x00d6 }
            r0.L$1 = r9     // Catch:{ all -> 0x00d6 }
            r0.L$2 = r10     // Catch:{ all -> 0x00d6 }
            r0.label = r5     // Catch:{ all -> 0x00d6 }
            java.lang.Object r2 = r2.mo55663a(r0)     // Catch:{ all -> 0x00d6 }
            if (r2 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0097:
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()     // Catch:{ all -> 0x00d2 }
            y23$b r5 = p000.y23.f46117l     // Catch:{ all -> 0x00d2 }
            kotlin.coroutines.CoroutineContext$a r2 = r2.get(r5)     // Catch:{ all -> 0x00d2 }
            y23 r2 = (p000.y23) r2     // Catch:{ all -> 0x00d2 }
        L_0x00a3:
            java.lang.Object r5 = r8.mo55641V(r9)     // Catch:{ all -> 0x00d2 }
            xj6 r6 = p000.yz5.f46310a     // Catch:{ all -> 0x00d2 }
            if (r5 != r6) goto L_0x00bc
            r0.L$0 = r8     // Catch:{ all -> 0x00d2 }
            r0.L$1 = r10     // Catch:{ all -> 0x00d2 }
            r0.L$2 = r9     // Catch:{ all -> 0x00d2 }
            r0.L$3 = r2     // Catch:{ all -> 0x00d2 }
            r0.label = r4     // Catch:{ all -> 0x00d2 }
            java.lang.Object r5 = r8.mo55647y(r9, r0)     // Catch:{ all -> 0x00d2 }
            if (r5 != r1) goto L_0x00a3
            return r1
        L_0x00bc:
            if (r2 == 0) goto L_0x00c1
            p000.g33.m58013j(r2)     // Catch:{ all -> 0x00d2 }
        L_0x00c1:
            r0.L$0 = r8     // Catch:{ all -> 0x00d2 }
            r0.L$1 = r10     // Catch:{ all -> 0x00d2 }
            r0.L$2 = r9     // Catch:{ all -> 0x00d2 }
            r0.L$3 = r2     // Catch:{ all -> 0x00d2 }
            r0.label = r3     // Catch:{ all -> 0x00d2 }
            java.lang.Object r5 = r10.emit(r5, r0)     // Catch:{ all -> 0x00d2 }
            if (r5 != r1) goto L_0x00a3
            return r1
        L_0x00d2:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto L_0x00da
        L_0x00d6:
            r9 = move-exception
            r5 = r8
            r8 = r9
            r9 = r10
        L_0x00da:
            r5.mo50505l(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.m63382B(kotlinx.coroutines.flow.SharedFlowImpl, a52, ns0):java.lang.Object");
    }

    /* renamed from: G */
    public static /* synthetic */ Object m63383G(SharedFlowImpl sharedFlowImpl, Object obj, ns0 ns0) {
        if (sharedFlowImpl.mo55645b(obj)) {
            return r37.f33317a;
        }
        Object H = sharedFlowImpl.mo55627H(obj, ns0);
        if (H == wx2.m54101d()) {
            return H;
        }
        return r37.f33317a;
    }

    /* renamed from: A */
    public final void mo55622A() {
        if (this.f40435r != 0 || this.f40433C > 1) {
            Object[] objArr = this.f40437x;
            vx2.m53588d(objArr);
            while (this.f40433C > 0 && yz5.m74707f(objArr, (mo55631L() + ((long) mo55636Q())) - 1) == yz5.f46310a) {
                this.f40433C--;
                yz5.m74708g(objArr, mo55631L() + ((long) mo55636Q()), (Object) null);
            }
        }
    }

    /* renamed from: C */
    public final void mo55623C(long j) {
        C6966d7[] h;
        if (!(this.f36693d == 0 || (h = this.f36692a) == null)) {
            for (C6966d7 d7Var : h) {
                if (d7Var != null) {
                    zz5 zz5 = (zz5) d7Var;
                    long j2 = zz5.f46511a;
                    if (j2 >= 0 && j2 < j) {
                        zz5.f46511a = j;
                    }
                }
            }
        }
        this.f40431A = j;
    }

    /* renamed from: D */
    public zz5 mo50503j() {
        return new zz5();
    }

    /* renamed from: E */
    public zz5[] mo50504k(int i) {
        return new zz5[i];
    }

    /* renamed from: F */
    public final void mo55626F() {
        Object[] objArr = this.f40437x;
        vx2.m53588d(objArr);
        yz5.m74708g(objArr, mo55631L(), (Object) null);
        this.f40432B--;
        long L = mo55631L() + 1;
        if (this.f40438y < L) {
            this.f40438y = L;
        }
        if (this.f40431A < L) {
            mo55623C(L);
        }
    }

    /* renamed from: H */
    public final Object mo55627H(T t, ns0<? super r37> ns0) {
        ns0<r37>[] ns0Arr;
        C7789a aVar;
        na0 na0 = new na0(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0), 1);
        na0.mo56425x();
        ns0<r37>[] ns0Arr2 = C6926c7.f37073a;
        synchronized (this) {
            if (mo55638S(t)) {
                Result.C6167a aVar2 = Result.Companion;
                na0.resumeWith(Result.m75635constructorimpl(r37.f33317a));
                ns0Arr = mo55629J(ns0Arr2);
                aVar = null;
            } else {
                C7789a aVar3 = new C7789a(this, ((long) mo55636Q()) + mo55631L(), t, na0);
                mo55628I(aVar3);
                this.f40433C = this.f40433C + 1;
                if (this.f40435r == 0) {
                    ns0Arr2 = mo55629J(ns0Arr2);
                }
                ns0Arr = ns0Arr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            pa0.m70973a(na0, aVar);
        }
        for (ns0<r37> ns02 : ns0Arr) {
            if (ns02 != null) {
                Result.C6167a aVar4 = Result.Companion;
                ns02.resumeWith(Result.m75635constructorimpl(r37.f33317a));
            }
        }
        Object s = na0.mo56421s();
        if (s == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        if (s == wx2.m54101d()) {
            return s;
        }
        return r37.f33317a;
    }

    /* renamed from: I */
    public final void mo55628I(Object obj) {
        int Q = mo55636Q();
        Object[] objArr = this.f40437x;
        if (objArr == null) {
            objArr = mo55637R((Object[]) null, 0, 2);
        } else if (Q >= objArr.length) {
            objArr = mo55637R(objArr, Q, objArr.length * 2);
        }
        yz5.m74708g(objArr, mo55631L() + ((long) Q), obj);
    }

    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r4 = (p000.zz5) r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.ns0<p000.r37>[] mo55629J(p000.ns0<p000.r37>[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f36693d
            if (r1 == 0) goto L_0x0047
            d7[] r1 = r10.f36692a
            if (r1 == 0) goto L_0x0047
            r2 = 0
            int r3 = r1.length
        L_0x000f:
            if (r2 >= r3) goto L_0x0047
            r4 = r1[r2]
            if (r4 == 0) goto L_0x0044
            zz5 r4 = (p000.zz5) r4
            ns0<? super r37> r5 = r4.f46512b
            if (r5 != 0) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            long r6 = r10.mo55640U(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0044
            int r6 = r11.length
            if (r0 < r6) goto L_0x0039
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            p000.vx2.m53590f(r11, r6)
        L_0x0039:
            r6 = r11
            ns0[] r6 = (p000.ns0[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f46512b = r0
            r0 = r7
        L_0x0044:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x0047:
            ns0[] r11 = (p000.ns0[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.mo55629J(ns0[]):ns0[]");
    }

    /* renamed from: K */
    public final long mo55630K() {
        return mo55631L() + ((long) this.f40432B);
    }

    /* renamed from: L */
    public final long mo55631L() {
        return Math.min(this.f40431A, this.f40438y);
    }

    /* renamed from: M */
    public final T mo55632M() {
        Object[] objArr = this.f40437x;
        vx2.m53588d(objArr);
        return yz5.m74707f(objArr, (this.f40438y + ((long) mo55635P())) - 1);
    }

    /* renamed from: N */
    public final Object mo55633N(long j) {
        Object[] objArr = this.f40437x;
        vx2.m53588d(objArr);
        Object c = yz5.m74707f(objArr, j);
        if (c instanceof C7789a) {
            return ((C7789a) c).f40441e;
        }
        return c;
    }

    /* renamed from: O */
    public final long mo55634O() {
        return mo55631L() + ((long) this.f40432B) + ((long) this.f40433C);
    }

    /* renamed from: P */
    public final int mo55635P() {
        return (int) ((mo55631L() + ((long) this.f40432B)) - this.f40438y);
    }

    /* renamed from: Q */
    public final int mo55636Q() {
        return this.f40432B + this.f40433C;
    }

    /* renamed from: R */
    public final Object[] mo55637R(Object[] objArr, int i, int i2) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] objArr2 = new Object[i2];
            this.f40437x = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long L = mo55631L();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + L;
                yz5.m74708g(objArr2, j, yz5.m74707f(objArr, j));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* renamed from: S */
    public final boolean mo55638S(T t) {
        if (mo50506m() == 0) {
            return mo55639T(t);
        }
        if (this.f40432B >= this.f40435r && this.f40431A <= this.f40438y) {
            int i = C7790b.f40443a[this.f40436s.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        mo55628I(t);
        int i2 = this.f40432B + 1;
        this.f40432B = i2;
        if (i2 > this.f40435r) {
            mo55626F();
        }
        if (mo55635P() > this.f40434k) {
            mo55642W(this.f40438y + 1, this.f40431A, mo55630K(), mo55634O());
        }
        return true;
    }

    /* renamed from: T */
    public final boolean mo55639T(T t) {
        if (this.f40434k == 0) {
            return true;
        }
        mo55628I(t);
        int i = this.f40432B + 1;
        this.f40432B = i;
        if (i > this.f40434k) {
            mo55626F();
        }
        this.f40431A = mo55631L() + ((long) this.f40432B);
        return true;
    }

    /* renamed from: U */
    public final long mo55640U(zz5 zz5) {
        long j = zz5.f46511a;
        if (j < mo55630K()) {
            return j;
        }
        if (this.f40435r <= 0 && j <= mo55631L() && this.f40433C != 0) {
            return j;
        }
        return -1;
    }

    /* renamed from: V */
    public final Object mo55641V(zz5 zz5) {
        Object obj;
        ns0<r37>[] ns0Arr = C6926c7.f37073a;
        synchronized (this) {
            long U = mo55640U(zz5);
            if (U < 0) {
                obj = yz5.f46310a;
            } else {
                long j = zz5.f46511a;
                Object N = mo55633N(U);
                zz5.f46511a = U + 1;
                Object obj2 = N;
                ns0Arr = mo55643X(j);
                obj = obj2;
            }
        }
        for (ns0<r37> ns0 : ns0Arr) {
            if (ns0 != null) {
                Result.C6167a aVar = Result.Companion;
                ns0.resumeWith(Result.m75635constructorimpl(r37.f33317a));
            }
        }
        return obj;
    }

    /* renamed from: W */
    public final void mo55642W(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long L = mo55631L(); L < min; L++) {
            Object[] objArr = this.f40437x;
            vx2.m53588d(objArr);
            yz5.m74708g(objArr, L, (Object) null);
        }
        this.f40438y = j;
        this.f40431A = j2;
        this.f40432B = (int) (j3 - min);
        this.f40433C = (int) (j4 - j3);
    }

    /* renamed from: X */
    public final ns0<r37>[] mo55643X(long j) {
        int i;
        long j2;
        long j3;
        long j4;
        boolean z;
        long j5;
        C6966d7[] h;
        if (j > this.f40431A) {
            return C6926c7.f37073a;
        }
        long L = mo55631L();
        long j6 = ((long) this.f40432B) + L;
        if (this.f40435r == 0 && this.f40433C > 0) {
            j6++;
        }
        if (!(this.f36693d == 0 || (h = this.f36692a) == null)) {
            for (C6966d7 d7Var : h) {
                if (d7Var != null) {
                    long j7 = ((zz5) d7Var).f46511a;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.f40431A) {
            return C6926c7.f37073a;
        }
        long K = mo55630K();
        if (mo50506m() > 0) {
            i = Math.min(this.f40433C, this.f40435r - ((int) (K - j6)));
        } else {
            i = this.f40433C;
        }
        ns0<r37>[] ns0Arr = C6926c7.f37073a;
        long j8 = ((long) this.f40433C) + K;
        if (i > 0) {
            ns0Arr = new ns0[i];
            Object[] objArr = this.f40437x;
            vx2.m53588d(objArr);
            long j9 = K;
            int i2 = 0;
            while (true) {
                if (K >= j8) {
                    j3 = j6;
                    j2 = j8;
                    break;
                }
                Object c = yz5.m74707f(objArr, K);
                j3 = j6;
                xj6 xj6 = yz5.f46310a;
                if (c == xj6) {
                    j2 = j8;
                    j5 = 1;
                } else if (c != null) {
                    C7789a aVar = (C7789a) c;
                    int i3 = i2 + 1;
                    j2 = j8;
                    ns0Arr[i2] = aVar.f40442g;
                    yz5.m74708g(objArr, K, xj6);
                    yz5.m74708g(objArr, j9, aVar.f40441e);
                    j5 = 1;
                    j9++;
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i3;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                }
                K += j5;
                j6 = j3;
                j8 = j2;
            }
            K = j9;
        } else {
            j3 = j6;
            j2 = j8;
        }
        int i4 = (int) (K - L);
        if (mo50506m() == 0) {
            j4 = K;
        } else {
            j4 = j3;
        }
        long max = Math.max(this.f40438y, K - ((long) Math.min(this.f40434k, i4)));
        if (this.f40435r == 0 && max < j2) {
            Object[] objArr2 = this.f40437x;
            vx2.m53588d(objArr2);
            if (vx2.m53586b(yz5.m74707f(objArr2, max), yz5.f46310a)) {
                K++;
                max++;
            }
        }
        mo55642W(max, j4, K, j2);
        mo55622A();
        if (ns0Arr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return mo55629J(ns0Arr);
        }
        return ns0Arr;
    }

    /* renamed from: Y */
    public final long mo55644Y() {
        long j = this.f40438y;
        if (j < this.f40431A) {
            this.f40431A = j;
        }
        return j;
    }

    /* renamed from: a */
    public Object mo8646a(a52<? super T> a52, ns0<?> ns0) {
        return m63382B(this, a52, ns0);
    }

    /* renamed from: b */
    public boolean mo55645b(T t) {
        int i;
        boolean z;
        ns0<r37>[] ns0Arr = C6926c7.f37073a;
        synchronized (this) {
            if (mo55638S(t)) {
                ns0Arr = mo55629J(ns0Arr);
                z = true;
            } else {
                z = false;
            }
        }
        for (ns0<r37> ns0 : ns0Arr) {
            if (ns0 != null) {
                Result.C6167a aVar = Result.Companion;
                ns0.resumeWith(Result.m75635constructorimpl(r37.f33317a));
            }
        }
        return z;
    }

    /* renamed from: d */
    public z42<T> mo51907d(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return yz5.m74706e(this, coroutineContext, i, bufferOverflow);
    }

    public Object emit(T t, ns0<? super r37> ns0) {
        return m63383G(this, t, ns0);
    }

    /* renamed from: g */
    public void mo55646g() {
        synchronized (this) {
            mo55642W(mo55630K(), this.f40431A, mo55630K(), mo55634O());
            r37 r37 = r37.f33317a;
        }
    }

    /* renamed from: y */
    public final Object mo55647y(zz5 zz5, ns0<? super r37> ns0) {
        na0 na0 = new na0(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0), 1);
        na0.mo56425x();
        synchronized (this) {
            if (mo55640U(zz5) < 0) {
                zz5.f46512b = na0;
            } else {
                Result.C6167a aVar = Result.Companion;
                na0.resumeWith(Result.m75635constructorimpl(r37.f33317a));
            }
            r37 r37 = r37.f33317a;
        }
        Object s = na0.mo56421s();
        if (s == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        if (s == wx2.m54101d()) {
            return s;
        }
        return r37.f33317a;
    }

    /* renamed from: z */
    public final void mo55648z(C7789a aVar) {
        synchronized (this) {
            if (aVar.f40440d >= mo55631L()) {
                Object[] objArr = this.f40437x;
                vx2.m53588d(objArr);
                if (yz5.m74707f(objArr, aVar.f40440d) == aVar) {
                    yz5.m74708g(objArr, aVar.f40440d, yz5.f46310a);
                    mo55622A();
                    r37 r37 = r37.f33317a;
                }
            }
        }
    }
}
