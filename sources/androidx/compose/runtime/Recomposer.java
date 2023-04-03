package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.a56;
import p000.b56;
import p000.ma0;
import p000.y23;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00012\u00020\u0001:\u00050=N\u0001B\u0011\u0012\u0006\u0010V\u001a\u00020Q¢\u0006\u0006\b\u0001\u0010\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J*\u0010\u0010\u001a\u00020\u00032\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002J\u0013\u0010\u0011\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0019\u001a\u00020\u00032(\u0010\u0018\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0013H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\fH\u0002J\"\u0010\u001f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001b\u001a\u00020\f2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001dH\u0002J,\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001dH\u0002J\b\u0010$\u001a\u00020\u0003H\u0002J\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030%2\u0006\u0010\u001b\u001a\u00020\fH\u0002J,\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030%2\u0006\u0010\u001b\u001a\u00020\f2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001dH\u0002J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(H\u0002J\u0013\u0010+\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0012J\u0006\u0010,\u001a\u00020\u0003J\u0013\u0010-\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b-\u0010\u0012J%\u00100\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030.H\u0010¢\u0006\u0004\b0\u00101J\u001d\u00105\u001a\u00020\u00032\f\u00104\u001a\b\u0012\u0004\u0012\u00020302H\u0010¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\fH\u0010¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\fH\u0010¢\u0006\u0004\b9\u00108J\u0017\u0010;\u001a\u00020\u00032\u0006\u0010:\u001a\u00020!H\u0010¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00032\u0006\u0010:\u001a\u00020!H\u0010¢\u0006\u0004\b=\u0010<J\u001f\u0010@\u001a\u00020\u00032\u0006\u0010:\u001a\u00020!2\u0006\u0010?\u001a\u00020>H\u0010¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u0004\u0018\u00010>2\u0006\u0010:\u001a\u00020!H\u0010¢\u0006\u0004\bB\u0010CR$\u0010I\u001a\u00020D2\u0006\u0010E\u001a\u00020D8\u0006@BX\u000e¢\u0006\f\n\u0004\b0\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020J8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010V\u001a\u00020Q8\u0010X\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010WR\u0018\u0010[\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010^\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bT\u0010]R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\f0_8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010`R \u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170b0_8\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010`R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\f0_8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010`R\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\f0_8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010`R\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020!0_8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u0010`R.\u0010k\u001a\u001c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170h\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0_0g8\u0002X\u0004¢\u0006\u0006\n\u0004\bi\u0010jR \u0010m\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020>0g8\u0002X\u0004¢\u0006\u0006\n\u0004\bl\u0010jR\u001e\u0010o\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010_8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bn\u0010`R\u001e\u0010q\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u0010pR\u0016\u0010u\u001a\u00020r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010x\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010|\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u001c\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020~0}8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0010\u0001R\u001c\u0010\u0001\u001a\u00070\u0001R\u00020\u00008\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u000e8BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020\u000e8BX\u0004¢\u0006\u0007\u001a\u0005\bw\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u000e8BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u001b\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020~0\u00018F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020r8PX\u0004¢\u0006\u0007\u001a\u0005\bY\u0010\u0001R\u0016\u0010\u0001\u001a\u00020\u000e8PX\u0004¢\u0006\u0007\u001a\u0005\bR\u0010\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006\u0001"}, mo44877d2 = {"Landroidx/compose/runtime/Recomposer;", "Lwn0;", "Lma0;", "Lr37;", "U", "k0", "Ly23;", "callingJob", "l0", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Lkt0;", "failedInitialComposition", "", "recoverable", "g0", "S", "(Lns0;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lhu0;", "Lyx3;", "Lns0;", "", "block", "j0", "(Lid2;Lns0;)Ljava/lang/Object;", "composition", "c0", "Lfq2;", "modifiedValues", "f0", "", "Lzy3;", "references", "e0", "V", "Lkotlin/Function1;", "i0", "n0", "Ls04;", "snapshot", "R", "m0", "T", "b0", "Lkotlin/Function0;", "content", "a", "(Lkt0;Lfd2;)V", "", "Lyn0;", "table", "l", "(Ljava/util/Set;)V", "p", "(Lkt0;)V", "i", "reference", "h", "(Lzy3;)V", "b", "Lyy3;", "data", "j", "(Lzy3;Lyy3;)V", "k", "(Lzy3;)Lyy3;", "", "<set-?>", "J", "W", "()J", "changeCount", "Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/BroadcastFrameClock;", "broadcastFrameClock", "Lhm0;", "c", "Lhm0;", "effectJob", "Lkotlin/coroutines/CoroutineContext;", "d", "Lkotlin/coroutines/CoroutineContext;", "g", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "Ljava/lang/Object;", "stateLock", "f", "Ly23;", "runnerJob", "", "Ljava/lang/Throwable;", "closeCause", "", "Ljava/util/List;", "knownCompositions", "", "snapshotInvalidations", "compositionInvalidations", "compositionsAwaitingApply", "compositionValuesAwaitingInsert", "", "Lxy3;", "m", "Ljava/util/Map;", "compositionValuesRemoved", "n", "compositionValueStatesAvailable", "o", "failedCompositions", "Lma0;", "workContinuation", "", "q", "I", "concurrentCompositionsOutstanding", "r", "Z", "isClosed", "Landroidx/compose/runtime/Recomposer$b;", "s", "Landroidx/compose/runtime/Recomposer$b;", "errorState", "Lu04;", "Landroidx/compose/runtime/Recomposer$State;", "t", "Lu04;", "_state", "Landroidx/compose/runtime/Recomposer$c;", "u", "Landroidx/compose/runtime/Recomposer$c;", "recomposerInfo", "a0", "()Z", "shouldKeepRecomposing", "hasSchedulingWork", "Y", "hasFrameWorkLocked", "Lt86;", "X", "()Lt86;", "currentState", "()I", "compoundHashKey", "collectingParameterInformation", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "v", "State", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Recomposer.kt */
public final class Recomposer extends wn0 {

    /* renamed from: v */
    public static final C0343a f1535v = new C0343a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f1536w = 8;

    /* renamed from: x */
    public static final u04<ho4<C0345c>> f1537x = u86.m72658a(cy1.m14610b());

    /* renamed from: y */
    public static final AtomicReference<Boolean> f1538y = new AtomicReference<>(Boolean.FALSE);

    /* renamed from: a */
    public long f1539a;

    /* renamed from: b */
    public final BroadcastFrameClock f1540b;

    /* renamed from: c */
    public final hm0 f1541c;

    /* renamed from: d */
    public final CoroutineContext f1542d;

    /* renamed from: e */
    public final Object f1543e = new Object();

    /* renamed from: f */
    public y23 f1544f;

    /* renamed from: g */
    public Throwable f1545g;

    /* renamed from: h */
    public final List<kt0> f1546h = new ArrayList();

    /* renamed from: i */
    public final List<Set<Object>> f1547i = new ArrayList();

    /* renamed from: j */
    public final List<kt0> f1548j = new ArrayList();

    /* renamed from: k */
    public final List<kt0> f1549k = new ArrayList();

    /* renamed from: l */
    public final List<zy3> f1550l = new ArrayList();

    /* renamed from: m */
    public final Map<xy3<Object>, List<zy3>> f1551m = new LinkedHashMap();

    /* renamed from: n */
    public final Map<zy3, yy3> f1552n = new LinkedHashMap();

    /* renamed from: o */
    public List<kt0> f1553o;

    /* renamed from: p */
    public ma0<? super r37> f1554p;

    /* renamed from: q */
    public int f1555q;

    /* renamed from: r */
    public boolean f1556r;

    /* renamed from: s */
    public C0344b f1557s;

    /* renamed from: t */
    public final u04<State> f1558t = u86.m72658a(State.Inactive);

    /* renamed from: u */
    public final C0345c f1559u = new C0345c();

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo44877d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: Recomposer.kt */
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003H\u0002J\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003H\u0002R4\u0010\f\u001a\"\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bj\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t`\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u000f0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo44877d2 = {"Landroidx/compose/runtime/Recomposer$a;", "", "Landroidx/compose/runtime/Recomposer$c;", "Landroidx/compose/runtime/Recomposer;", "info", "Lr37;", "c", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "Lu04;", "Lho4;", "_runningRecomposers", "Lu04;", "<init>", "()V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.runtime.Recomposer$a */
    /* compiled from: Recomposer.kt */
    public static final class C0343a {
        public C0343a() {
        }

        public /* synthetic */ C0343a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: c */
        public final void mo3120c(androidx.compose.runtime.Recomposer.C0345c r4) {
            /*
                r3 = this;
            L_0x0000:
                u04 r0 = androidx.compose.runtime.Recomposer.f1537x
                java.lang.Object r0 = r0.getValue()
                ho4 r0 = (p000.ho4) r0
                ho4 r1 = r0.add(r4)
                if (r0 == r1) goto L_0x001a
                u04 r2 = androidx.compose.runtime.Recomposer.f1537x
                boolean r0 = r2.mo55657e(r0, r1)
                if (r0 == 0) goto L_0x0000
            L_0x001a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C0343a.mo3120c(androidx.compose.runtime.Recomposer$c):void");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: d */
        public final void mo3121d(androidx.compose.runtime.Recomposer.C0345c r4) {
            /*
                r3 = this;
            L_0x0000:
                u04 r0 = androidx.compose.runtime.Recomposer.f1537x
                java.lang.Object r0 = r0.getValue()
                ho4 r0 = (p000.ho4) r0
                ho4 r1 = r0.remove(r4)
                if (r0 == r1) goto L_0x001a
                u04 r2 = androidx.compose.runtime.Recomposer.f1537x
                boolean r0 = r2.mo55657e(r0, r1)
                if (r0 == 0) goto L_0x0000
            L_0x001a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C0343a.mo3121d(androidx.compose.runtime.Recomposer$c):void");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\u0010\u000e\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u000e\u001a\u00060\bj\u0002`\t8\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Landroidx/compose/runtime/Recomposer$b;", "", "", "a", "Z", "getRecoverable", "()Z", "recoverable", "Ljava/lang/Exception;", "Lkotlin/Exception;", "b", "Ljava/lang/Exception;", "getCause", "()Ljava/lang/Exception;", "cause", "<init>", "(ZLjava/lang/Exception;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.runtime.Recomposer$b */
    /* compiled from: Recomposer.kt */
    public static final class C0344b {

        /* renamed from: a */
        public final boolean f1561a;

        /* renamed from: b */
        public final Exception f1562b;

        public C0344b(boolean z, Exception exc) {
            vx2.m53591g(exc, "cause");
            this.f1561a = z;
            this.f1562b = exc;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Landroidx/compose/runtime/Recomposer$c;", "", "<init>", "(Landroidx/compose/runtime/Recomposer;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.runtime.Recomposer$c */
    /* compiled from: Recomposer.kt */
    public final class C0345c {
        public C0345c() {
        }
    }

    public Recomposer(CoroutineContext coroutineContext) {
        vx2.m53591g(coroutineContext, "effectCoroutineContext");
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Recomposer$broadcastFrameClock$1(this));
        this.f1540b = broadcastFrameClock;
        hm0 a = g33.m58004a((y23) coroutineContext.get(y23.f46117l));
        a.mo55519p(new Recomposer$effectJob$1$1(this));
        this.f1541c = a;
        this.f1542d = coroutineContext.plus(broadcastFrameClock).plus(a);
    }

    /* renamed from: d0 */
    public static final void m2118d0(List<zy3> list, Recomposer recomposer, kt0 kt0) {
        list.clear();
        synchronized (recomposer.f1543e) {
            Iterator<zy3> it = recomposer.f1550l.iterator();
            while (it.hasNext()) {
                zy3 next = it.next();
                if (vx2.m53586b(next.mo28673b(), kt0)) {
                    list.add(next);
                    it.remove();
                }
            }
            r37 r37 = r37.f33317a;
        }
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m2119h0(Recomposer recomposer, Exception exc, kt0 kt0, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            kt0 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        recomposer.mo3107g0(exc, kt0, z);
    }

    /* renamed from: R */
    public final void mo3088R(s04 s04) {
        try {
            if (s04.mo3149A() instanceof b56.C1604a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            s04.mo41d();
        }
    }

    /* renamed from: S */
    public final Object mo3089S(ns0<? super r37> ns0) {
        if (mo3096Z()) {
            return r37.f33317a;
        }
        na0 na0 = new na0(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0), 1);
        na0.mo56425x();
        synchronized (this.f1543e) {
            if (mo3096Z()) {
                Result.C6167a aVar = Result.Companion;
                na0.resumeWith(Result.m75635constructorimpl(r37.f33317a));
            } else {
                this.f1554p = na0;
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

    /* renamed from: T */
    public final void mo3090T() {
        synchronized (this.f1543e) {
            if (this.f1558t.getValue().compareTo(State.Idle) >= 0) {
                this.f1558t.setValue(State.ShuttingDown);
            }
            r37 r37 = r37.f33317a;
        }
        y23.C9621a.m74226a(this.f1541c, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: U */
    public final ma0<r37> mo3091U() {
        State state;
        if (this.f1558t.getValue().compareTo(State.ShuttingDown) <= 0) {
            this.f1546h.clear();
            this.f1547i.clear();
            this.f1548j.clear();
            this.f1549k.clear();
            this.f1550l.clear();
            this.f1553o = null;
            ma0<? super r37> ma0 = this.f1554p;
            if (ma0 != null) {
                ma0.C7871a.m64215a(ma0, (Throwable) null, 1, (Object) null);
            }
            this.f1554p = null;
            this.f1557s = null;
            return null;
        }
        if (this.f1557s != null) {
            state = State.Inactive;
        } else if (this.f1544f == null) {
            this.f1547i.clear();
            this.f1548j.clear();
            if (this.f1540b.mo2876u()) {
                state = State.InactivePendingWork;
            } else {
                state = State.Inactive;
            }
        } else if ((!this.f1548j.isEmpty()) || (!this.f1547i.isEmpty()) || (!this.f1549k.isEmpty()) || (!this.f1550l.isEmpty()) || this.f1555q > 0 || this.f1540b.mo2876u()) {
            state = State.PendingWork;
        } else {
            state = State.Idle;
        }
        this.f1558t.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        ma0<? super r37> ma02 = this.f1554p;
        this.f1554p = null;
        return ma02;
    }

    /* renamed from: V */
    public final void mo3092V() {
        int i;
        List list;
        synchronized (this.f1543e) {
            if (!this.f1551m.isEmpty()) {
                List<T> w = dk0.m43497w(this.f1551m.values());
                this.f1551m.clear();
                list = new ArrayList(w.size());
                int size = w.size();
                for (int i2 = 0; i2 < size; i2++) {
                    zy3 zy3 = (zy3) w.get(i2);
                    list.add(wy6.m54142a(zy3, this.f1552n.get(zy3)));
                }
                this.f1552n.clear();
            } else {
                list = ck0.m33062j();
            }
        }
        int size2 = list.size();
        for (i = 0; i < size2; i++) {
            Pair pair = (Pair) list.get(i);
            zy3 zy32 = (zy3) pair.component1();
            yy3 yy3 = (yy3) pair.component2();
            if (yy3 != null) {
                zy32.mo28673b().mo11747g(yy3);
            }
        }
    }

    /* renamed from: W */
    public final long mo3093W() {
        return this.f1539a;
    }

    /* renamed from: X */
    public final t86<State> mo3094X() {
        return this.f1558t;
    }

    /* renamed from: Y */
    public final boolean mo3095Y() {
        if ((!this.f1548j.isEmpty()) || this.f1540b.mo2876u()) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public final boolean mo3096Z() {
        boolean z;
        synchronized (this.f1543e) {
            z = true;
            if (!(!this.f1547i.isEmpty()) && !(!this.f1548j.isEmpty()) && !this.f1540b.mo2876u()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo3097a(kt0 kt0, fd2<? super nn0, ? super Integer, r37> fd2) {
        a56 k;
        vx2.m53591g(kt0, "composition");
        vx2.m53591g(fd2, PublicResolver.FUNC_CONTENT);
        boolean r = kt0.mo11757r();
        try {
            a56.C0009a aVar = a56.f41e;
            s04 h = aVar.mo69h(mo3110i0(kt0), mo3118n0(kt0, (fq2<Object>) null));
            try {
                k = h.mo48k();
                kt0.mo11750j(fd2);
                r37 r37 = r37.f33317a;
                h.mo55r(k);
                mo3088R(h);
                if (!r) {
                    aVar.mo64c();
                }
                synchronized (this.f1543e) {
                    if (this.f1558t.getValue().compareTo(State.ShuttingDown) > 0 && !this.f1546h.contains(kt0)) {
                        this.f1546h.add(kt0);
                    }
                }
                try {
                    mo3101c0(kt0);
                    try {
                        kt0.mo11756q();
                        kt0.mo11743b();
                        if (!r) {
                            aVar.mo64c();
                        }
                    } catch (Exception e) {
                        m2119h0(this, e, (kt0) null, false, 6, (Object) null);
                    }
                } catch (Exception e2) {
                    mo3107g0(e2, kt0, true);
                }
            } catch (Throwable th) {
                mo3088R(h);
                throw th;
            }
        } catch (Exception e3) {
            mo3107g0(e3, kt0, true);
        }
    }

    /* renamed from: a0 */
    public final boolean mo3098a0() {
        boolean z;
        boolean z2;
        synchronized (this.f1543e) {
            z = !this.f1556r;
        }
        if (z) {
            return true;
        }
        Iterator<y23> it = this.f1541c.mo55504b().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo55502a()) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo3099b(zy3 zy3) {
        vx2.m53591g(zy3, "reference");
        synchronized (this.f1543e) {
            p85.m24752a(this.f1551m, zy3.mo28674c(), zy3);
        }
    }

    /* renamed from: b0 */
    public final Object mo3100b0(ns0<? super r37> ns0) {
        Object s = e52.m57227s(mo3094X(), new Recomposer$join$2((ns0<? super Recomposer$join$2>) null), ns0);
        if (s == wx2.m54101d()) {
            return s;
        }
        return r37.f33317a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r0 = new java.util.ArrayList();
        m2118d0(r0, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if ((!r0.isEmpty()) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        mo3103e0(r0, (p000.fq2<java.lang.Object>) null);
        m2118d0(r0, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        return;
     */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3101c0(p000.kt0 r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f1543e
            monitor-enter(r0)
            java.util.List<zy3> r1 = r7.f1550l     // Catch:{ all -> 0x0042 }
            int r2 = r1.size()     // Catch:{ all -> 0x0042 }
            r3 = 0
            r4 = r3
        L_0x000b:
            r5 = 1
            if (r4 >= r2) goto L_0x0023
            java.lang.Object r6 = r1.get(r4)     // Catch:{ all -> 0x0042 }
            zy3 r6 = (p000.zy3) r6     // Catch:{ all -> 0x0042 }
            kt0 r6 = r6.mo28673b()     // Catch:{ all -> 0x0042 }
            boolean r6 = p000.vx2.m53586b(r6, r8)     // Catch:{ all -> 0x0042 }
            if (r6 == 0) goto L_0x0020
            r3 = r5
            goto L_0x0023
        L_0x0020:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x0023:
            if (r3 != 0) goto L_0x0027
            monitor-exit(r0)
            return
        L_0x0027:
            r37 r1 = p000.r37.f33317a     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            m2118d0(r0, r7, r8)
        L_0x0032:
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x0041
            r1 = 0
            r7.mo3103e0(r0, r1)
            m2118d0(r0, r7, r8)
            goto L_0x0032
        L_0x0041:
            return
        L_0x0042:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.mo3101c0(kt0):void");
    }

    /* renamed from: d */
    public boolean mo3102d() {
        return false;
    }

    /* renamed from: e0 */
    public final List<kt0> mo3103e0(List<zy3> list, fq2<Object> fq2) {
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zy3 zy3 = list.get(i);
            kt0 b = zy3.mo28673b();
            Object obj = hashMap.get(b);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(b, obj);
            }
            ((ArrayList) obj).add(zy3);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            kt0 kt0 = (kt0) entry.getKey();
            List list2 = (List) entry.getValue();
            ComposerKt.m2006X(!kt0.mo11757r());
            s04 h = a56.f41e.mo69h(mo3110i0(kt0), mo3118n0(kt0, fq2));
            try {
                a56 k = h.mo48k();
                try {
                    synchronized (this.f1543e) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            zy3 zy32 = (zy3) list2.get(i2);
                            arrayList.add(wy6.m54142a(zy32, p85.m24753b(this.f1551m, zy32.mo28674c())));
                        }
                    }
                    kt0.mo11745e(arrayList);
                    r37 r37 = r37.f33317a;
                    h.mo55r(k);
                } catch (Throwable th) {
                    h.mo55r(k);
                    throw th;
                }
            } finally {
                mo3088R(h);
            }
        }
        return CollectionsKt___CollectionsKt.m47311K0(hashMap.keySet());
    }

    /* renamed from: f */
    public int mo3104f() {
        return 1000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030 A[Catch:{ all -> 0x002b, all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.kt0 mo3105f0(p000.kt0 r7, p000.fq2<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r7.mo11757r()
            r1 = 0
            if (r0 != 0) goto L_0x0050
            boolean r0 = r7.mo11744c()
            if (r0 == 0) goto L_0x000e
            goto L_0x0050
        L_0x000e:
            a56$a r0 = p000.a56.f41e
            rc2 r2 = r6.mo3110i0(r7)
            rc2 r3 = r6.mo3118n0(r7, r8)
            s04 r0 = r0.mo69h(r2, r3)
            a56 r2 = r0.mo48k()     // Catch:{ all -> 0x004b }
            r3 = 1
            r4 = 0
            if (r8 == 0) goto L_0x002d
            boolean r5 = r8.mo20053q()     // Catch:{ all -> 0x002b }
            if (r5 != r3) goto L_0x002d
            goto L_0x002e
        L_0x002b:
            r7 = move-exception
            goto L_0x0047
        L_0x002d:
            r3 = r4
        L_0x002e:
            if (r3 == 0) goto L_0x0038
            androidx.compose.runtime.Recomposer$performRecompose$1$1 r3 = new androidx.compose.runtime.Recomposer$performRecompose$1$1     // Catch:{ all -> 0x002b }
            r3.<init>(r8, r7)     // Catch:{ all -> 0x002b }
            r7.mo11760u(r3)     // Catch:{ all -> 0x002b }
        L_0x0038:
            boolean r8 = r7.mo11749i()     // Catch:{ all -> 0x002b }
            r0.mo55r(r2)     // Catch:{ all -> 0x004b }
            r6.mo3088R(r0)
            if (r8 == 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r7 = r1
        L_0x0046:
            return r7
        L_0x0047:
            r0.mo55r(r2)     // Catch:{ all -> 0x004b }
            throw r7     // Catch:{ all -> 0x004b }
        L_0x004b:
            r7 = move-exception
            r6.mo3088R(r0)
            throw r7
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.mo3105f0(kt0, fq2):kt0");
    }

    /* renamed from: g */
    public CoroutineContext mo3106g() {
        return this.f1542d;
    }

    /* renamed from: g0 */
    public final void mo3107g0(Exception exc, kt0 kt0, boolean z) {
        Boolean bool = f1538y.get();
        vx2.m53590f(bool, "_hotReloadEnabled.get()");
        if (!bool.booleanValue() || (exc instanceof ComposeRuntimeError)) {
            throw exc;
        }
        synchronized (this.f1543e) {
            this.f1549k.clear();
            this.f1548j.clear();
            this.f1547i.clear();
            this.f1550l.clear();
            this.f1551m.clear();
            this.f1552n.clear();
            this.f1557s = new C0344b(z, exc);
            if (kt0 != null) {
                List list = this.f1553o;
                if (list == null) {
                    list = new ArrayList();
                    this.f1553o = list;
                }
                if (!list.contains(kt0)) {
                    list.add(kt0);
                }
                this.f1546h.remove(kt0);
            }
            mo3091U();
        }
    }

    /* renamed from: h */
    public void mo3108h(zy3 zy3) {
        ma0<r37> U;
        vx2.m53591g(zy3, "reference");
        synchronized (this.f1543e) {
            this.f1550l.add(zy3);
            U = mo3091U();
        }
        if (U != null) {
            Result.C6167a aVar = Result.Companion;
            U.resumeWith(Result.m75635constructorimpl(r37.f33317a));
        }
    }

    /* renamed from: i */
    public void mo3109i(kt0 kt0) {
        ma0<r37> ma0;
        vx2.m53591g(kt0, "composition");
        synchronized (this.f1543e) {
            if (!this.f1548j.contains(kt0)) {
                this.f1548j.add(kt0);
                ma0 = mo3091U();
            } else {
                ma0 = null;
            }
        }
        if (ma0 != null) {
            Result.C6167a aVar = Result.Companion;
            ma0.resumeWith(Result.m75635constructorimpl(r37.f33317a));
        }
    }

    /* renamed from: i0 */
    public final rc2<Object, r37> mo3110i0(kt0 kt0) {
        return new Recomposer$readObserverOf$1(kt0);
    }

    /* renamed from: j */
    public void mo3111j(zy3 zy3, yy3 yy3) {
        vx2.m53591g(zy3, "reference");
        vx2.m53591g(yy3, "data");
        synchronized (this.f1543e) {
            this.f1552n.put(zy3, yy3);
            r37 r37 = r37.f33317a;
        }
    }

    /* renamed from: j0 */
    public final Object mo3112j0(id2<? super hu0, ? super yx3, ? super ns0<? super r37>, ? extends Object> id2, ns0<? super r37> ns0) {
        Object e = b50.m55768e(this.f1540b, new Recomposer$recompositionRunner$2(this, id2, zx3.m31581a(ns0.getContext()), (ns0<? super Recomposer$recompositionRunner$2>) null), ns0);
        if (e == wx2.m54101d()) {
            return e;
        }
        return r37.f33317a;
    }

    /* renamed from: k */
    public yy3 mo3113k(zy3 zy3) {
        yy3 remove;
        vx2.m53591g(zy3, "reference");
        synchronized (this.f1543e) {
            remove = this.f1552n.remove(zy3);
        }
        return remove;
    }

    /* renamed from: k0 */
    public final void mo3114k0() {
        if (!this.f1547i.isEmpty()) {
            List<Set<Object>> list = this.f1547i;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Set set = list.get(i);
                List<kt0> list2 = this.f1546h;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    list2.get(i2).mo11754o(set);
                }
            }
            this.f1547i.clear();
            if (mo3091U() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    /* renamed from: l */
    public void mo3115l(Set<yn0> set) {
        vx2.m53591g(set, "table");
    }

    /* renamed from: l0 */
    public final void mo3116l0(y23 y23) {
        synchronized (this.f1543e) {
            Throwable th = this.f1545g;
            if (th != null) {
                throw th;
            } else if (this.f1558t.getValue().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            } else if (this.f1544f == null) {
                this.f1544f = y23;
                mo3091U();
            } else {
                throw new IllegalStateException("Recomposer already running".toString());
            }
        }
    }

    /* renamed from: m0 */
    public final Object mo3117m0(ns0<? super r37> ns0) {
        Object j0 = mo3112j0(new Recomposer$runRecomposeAndApplyChanges$2(this, (ns0<? super Recomposer$runRecomposeAndApplyChanges$2>) null), ns0);
        if (j0 == wx2.m54101d()) {
            return j0;
        }
        return r37.f33317a;
    }

    /* renamed from: n0 */
    public final rc2<Object, r37> mo3118n0(kt0 kt0, fq2<Object> fq2) {
        return new Recomposer$writeObserverOf$1(kt0, fq2);
    }

    /* renamed from: p */
    public void mo3119p(kt0 kt0) {
        vx2.m53591g(kt0, "composition");
        synchronized (this.f1543e) {
            this.f1546h.remove(kt0);
            this.f1548j.remove(kt0);
            this.f1549k.remove(kt0);
            r37 r37 = r37.f33317a;
        }
    }
}
