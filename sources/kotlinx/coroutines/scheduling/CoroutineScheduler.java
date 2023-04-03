package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.random.Random;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0003\u00064PB+\u0012\u0006\u0010=\u001a\u00020\f\u0012\u0006\u0010>\u001a\u00020\f\u0012\b\b\u0002\u0010@\u001a\u00020\u0013\u0012\b\b\u0002\u0010B\u001a\u000207¢\u0006\u0004\bM\u0010NJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001c\u001a\u0004\u0018\u00010\u0003*\b\u0018\u00010\bR\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\nJ)\u0010!\u001a\u00020\u00102\n\u0010\u000b\u001a\u00060\bR\u00020\u00002\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\bR\u00020\u0000¢\u0006\u0004\b#\u0010$J\u001b\u0010(\u001a\u00020\u00102\n\u0010'\u001a\u00060%j\u0002`&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.J-\u00102\u001a\u00020\u00102\n\u0010/\u001a\u00060%j\u0002`&2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b2\u00103J!\u00104\u001a\u00020\u00032\n\u0010/\u001a\u00060%j\u0002`&2\u0006\u00101\u001a\u000200¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0010¢\u0006\u0004\b6\u0010+J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010<R\u0014\u0010>\u001a\u00020\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010<R\u0014\u0010@\u001a\u00020\u00138\u0006X\u0004¢\u0006\u0006\n\u0004\b2\u0010?R\u0014\u0010B\u001a\u0002078\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010AR\u0014\u0010E\u001a\u00020C8\u0006X\u0004¢\u0006\u0006\n\u0004\b:\u0010DR\u0014\u0010G\u001a\u00020C8\u0006X\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u001e\u0010K\u001a\f\u0012\b\u0012\u00060\bR\u00020\u00000H8\u0006X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0011\u0010L\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bL\u0010\u0018¨\u0006Q"}, mo44877d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lvl6;", "task", "", "a", "(Lvl6;)Z", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;", "h", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;", "worker", "", "g", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;)I", "skipUnpark", "Lr37;", "m", "(Z)V", "", "state", "q", "(J)Z", "v", "()Z", "b", "()I", "tailDispatch", "p", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;Lvl6;Z)Lvl6;", "d", "oldIndex", "newIndex", "j", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;II)V", "i", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "l", "(J)V", "block", "Lzl6;", "taskContext", "e", "(Ljava/lang/Runnable;Lzl6;Z)V", "c", "(Ljava/lang/Runnable;Lzl6;)Lvl6;", "n", "", "toString", "()Ljava/lang/String;", "k", "(Lvl6;)V", "I", "corePoolSize", "maxPoolSize", "J", "idleWorkerKeepAliveNs", "Ljava/lang/String;", "schedulerName", "Lhh2;", "Lhh2;", "globalCpuQueue", "r", "globalBlockingQueue", "Lse5;", "s", "Lse5;", "workers", "isTerminated", "<init>", "(IIJLjava/lang/String;)V", "x", "WorkerState", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: CoroutineScheduler.kt */
public final class CoroutineScheduler implements Executor, Closeable {

    /* renamed from: A */
    public static final /* synthetic */ AtomicLongFieldUpdater f40478A = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");

    /* renamed from: B */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40479B = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");

    /* renamed from: C */
    public static final xj6 f40480C = new xj6("NOT_IN_STACK");

    /* renamed from: x */
    public static final C7798a f40481x = new C7798a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final /* synthetic */ AtomicLongFieldUpdater f40482y = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: a */
    public final int f40483a;
    public volatile /* synthetic */ long controlState;

    /* renamed from: d */
    public final int f40484d;

    /* renamed from: e */
    public final long f40485e;

    /* renamed from: g */
    public final String f40486g;

    /* renamed from: k */
    public final hh2 f40487k;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: r */
    public final hh2 f40488r;

    /* renamed from: s */
    public final se5<C7800c> f40489s;

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo44877d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: CoroutineScheduler.kt */
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, mo44877d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$a;", "", "", "BLOCKING_MASK", "J", "", "BLOCKING_SHIFT", "I", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "Lxj6;", "NOT_IN_STACK", "Lxj6;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$a */
    /* compiled from: CoroutineScheduler.kt */
    public static final class C7798a {
        public C7798a() {
        }

        public /* synthetic */ C7798a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$b */
    /* compiled from: CoroutineScheduler.kt */
    public /* synthetic */ class C7799b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40491a;

        static {
            int[] iArr = new int[WorkerState.values().length];
            iArr[WorkerState.PARKING.ordinal()] = 1;
            iArr[WorkerState.BLOCKING.ordinal()] = 2;
            iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            iArr[WorkerState.DORMANT.ordinal()] = 4;
            iArr[WorkerState.TERMINATED.ordinal()] = 5;
            f40491a = iArr;
        }
    }

    public CoroutineScheduler(int i, int i2, long j, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f40483a = i;
        this.f40484d = i2;
        this.f40485e = j;
        this.f40486g = str;
        boolean z4 = true;
        if (i >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= 2097150) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (j <= 0 ? false : z4) {
                        this.f40487k = new hh2();
                        this.f40488r = new hh2();
                        this.parkedWorkersStack = 0;
                        this.f40489s = new se5<>(i + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    /* renamed from: f */
    public static /* synthetic */ void m63498f(CoroutineScheduler coroutineScheduler, Runnable runnable, zl6 zl6, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            zl6 = km6.f38927f;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        coroutineScheduler.mo55710e(runnable, zl6, z);
    }

    /* renamed from: s */
    public static /* synthetic */ boolean m63499s(CoroutineScheduler coroutineScheduler, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = coroutineScheduler.controlState;
        }
        return coroutineScheduler.mo55722q(j);
    }

    /* renamed from: a */
    public final boolean mo55705a(vl6 vl6) {
        boolean z = true;
        if (vl6.f45328d.mo50257b() != 1) {
            z = false;
        }
        if (z) {
            return this.f40488r.mo51215a(vl6);
        }
        return this.f40487k.mo51215a(vl6);
    }

    /* renamed from: b */
    public final int mo55706b() {
        boolean z;
        synchronized (this.f40489s) {
            if (isTerminated()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            boolean z2 = false;
            int d = d75.m43382d(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (d >= this.f40483a) {
                return 0;
            }
            if (i >= this.f40484d) {
                return 0;
            }
            int i2 = ((int) (this.controlState & 2097151)) + 1;
            if (i2 <= 0 || this.f40489s.mo65844b(i2) != null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C7800c cVar = new C7800c(this, i2);
                this.f40489s.mo65845c(i2, cVar);
                if (i2 == ((int) (2097151 & f40478A.incrementAndGet(this)))) {
                    z2 = true;
                }
                if (z2) {
                    cVar.start();
                    int i3 = d + 1;
                    return i3;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: c */
    public final vl6 mo55707c(Runnable runnable, zl6 zl6) {
        long a = km6.f38926e.mo51358a();
        if (!(runnable instanceof vl6)) {
            return new fm6(runnable, a, zl6);
        }
        vl6 vl6 = (vl6) runnable;
        vl6.f45327a = a;
        vl6.f45328d = zl6;
        return vl6;
    }

    public void close() {
        mo55718l(10000);
    }

    /* renamed from: d */
    public final C7800c mo55709d() {
        C7800c cVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C7800c) {
            cVar = (C7800c) currentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !vx2.m53586b(CoroutineScheduler.this, this)) {
            return null;
        }
        return cVar;
    }

    /* renamed from: e */
    public final void mo55710e(Runnable runnable, zl6 zl6, boolean z) {
        boolean z2;
        C7208i7.m58864a();
        vl6 c = mo55707c(runnable, zl6);
        C7800c d = mo55709d();
        vl6 p = mo55721p(d, c, z);
        if (p == null || mo55705a(p)) {
            if (!z || d == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (c.f45328d.mo50257b() != 0) {
                mo55719m(z2);
            } else if (!z2) {
                mo55720n();
            }
        } else {
            throw new RejectedExecutionException(this.f40486g + " was terminated");
        }
    }

    public void execute(Runnable runnable) {
        m63498f(this, runnable, (zl6) null, false, 6, (Object) null);
    }

    /* renamed from: g */
    public final int mo55712g(C7800c cVar) {
        Object h = cVar.mo55731h();
        while (h != f40480C) {
            if (h == null) {
                return 0;
            }
            C7800c cVar2 = (C7800c) h;
            int g = cVar2.mo55730g();
            if (g != 0) {
                return g;
            }
            h = cVar2.mo55731h();
        }
        return -1;
    }

    /* renamed from: h */
    public final C7800c mo55713h() {
        while (true) {
            long j = this.parkedWorkersStack;
            C7800c b = this.f40489s.mo65844b((int) (2097151 & j));
            if (b == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int g = mo55712g(b);
            if (g >= 0) {
                if (f40482y.compareAndSet(this, j, ((long) g) | j2)) {
                    b.mo55739p(f40480C);
                    return b;
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean mo55714i(C7800c cVar) {
        long j;
        int g;
        if (cVar.mo55731h() != f40480C) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            g = cVar.mo55730g();
            cVar.mo55739p(this.f40489s.mo65844b((int) (2097151 & j)));
        } while (!f40482y.compareAndSet(this, j, ((2097152 + j) & -2097152) | ((long) g)));
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: j */
    public final void mo55716j(C7800c cVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                if (i2 == 0) {
                    i3 = mo55712g(cVar);
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f40482y.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo55717k(vl6 vl6) {
        try {
            vl6.run();
        } catch (Throwable th) {
            C7208i7.m58864a();
            throw th;
        }
        C7208i7.m58864a();
    }

    /* renamed from: l */
    public final void mo55718l(long j) {
        int i;
        vl6 vl6;
        if (f40479B.compareAndSet(this, 0, 1)) {
            C7800c d = mo55709d();
            synchronized (this.f40489s) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    C7800c b = this.f40489s.mo65844b(i2);
                    vx2.m53588d(b);
                    C7800c cVar = b;
                    if (cVar != d) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j);
                        }
                        cVar.f40493a.mo66897g(this.f40488r);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            this.f40488r.mo51216b();
            this.f40487k.mo51216b();
            while (true) {
                if (d != null) {
                    vl6 = d.mo55729f(true);
                    if (vl6 != null) {
                        continue;
                        mo55717k(vl6);
                    }
                }
                vl6 = (vl6) this.f40487k.mo51218d();
                if (vl6 == null && (vl6 = (vl6) this.f40488r.mo51218d()) == null) {
                    break;
                }
                mo55717k(vl6);
            }
            if (d != null) {
                d.mo55743s(WorkerState.TERMINATED);
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    /* renamed from: m */
    public final void mo55719m(boolean z) {
        long addAndGet = f40478A.addAndGet(this, 2097152);
        if (!z && !mo55724v() && !mo55722q(addAndGet)) {
            mo55724v();
        }
    }

    /* renamed from: n */
    public final void mo55720n() {
        if (!mo55724v() && !m63499s(this, 0, 1, (Object) null)) {
            mo55724v();
        }
    }

    /* renamed from: p */
    public final vl6 mo55721p(C7800c cVar, vl6 vl6, boolean z) {
        if (cVar == null || cVar.f40494d == WorkerState.TERMINATED) {
            return vl6;
        }
        if (vl6.f45328d.mo50257b() == 0 && cVar.f40494d == WorkerState.BLOCKING) {
            return vl6;
        }
        cVar.f40498r = true;
        return cVar.f40493a.mo66892a(vl6, z);
    }

    /* renamed from: q */
    public final boolean mo55722q(long j) {
        if (d75.m43382d(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.f40483a) {
            int b = mo55706b();
            if (b == 1 && this.f40483a > 1) {
                mo55706b();
            }
            if (b > 0) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a = this.f40489s.mo65843a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            C7800c b = this.f40489s.mo65844b(i6);
            if (b != null) {
                int f = b.f40493a.mo66896f();
                int i7 = C7799b.f40491a[b.f40494d.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(f);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (f > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(f);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        return this.f40486g + '@' + b31.m55723b(this) + "[Pool Size {core = " + this.f40483a + ", max = " + this.f40484d + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f40487k.mo51217c() + ", global blocking queue size = " + this.f40488r.mo51217c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f40483a - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* renamed from: v */
    public final boolean mo55724v() {
        C7800c h;
        do {
            h = mo55713h();
            if (h == null) {
                return false;
            }
        } while (!C7800c.f40492x.compareAndSet(h, -1, 0));
        LockSupport.unpark(h);
        return true;
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010BB\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020\n¢\u0006\u0004\bA\u0010CJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\tJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u001cJ\u0019\u0010\"\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0011J\u0011\u0010#\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010\u0011R*\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u001cR\u0014\u00100\u001a\u00020-8\u0006X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0018\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u00104R$\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010=\u001a\u0002038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u00104R\u0016\u0010>\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010)R\u0016\u0010@\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010?¨\u0006D"}, mo44877d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;", "Ljava/lang/Thread;", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "newState", "", "s", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z", "Lr37;", "run", "()V", "", "upperBound", "k", "(I)I", "scanLocalQueue", "Lvl6;", "f", "(Z)Lvl6;", "q", "()Z", "n", "r", "j", "task", "d", "(Lvl6;)V", "taskMode", "c", "(I)V", "b", "l", "u", "mode", "i", "e", "m", "()Lvl6;", "blockingOnly", "t", "index", "indexInArray", "I", "g", "()I", "o", "Lxm7;", "a", "Lxm7;", "localQueue", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "state", "", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "p", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "mayHaveLocalTasks", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$c */
    /* compiled from: CoroutineScheduler.kt */
    public final class C7800c extends Thread {

        /* renamed from: x */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f40492x = AtomicIntegerFieldUpdater.newUpdater(C7800c.class, "workerCtl");

        /* renamed from: a */
        public final xm7 f40493a;

        /* renamed from: d */
        public WorkerState f40494d;

        /* renamed from: e */
        public long f40495e;

        /* renamed from: g */
        public long f40496g;
        private volatile int indexInArray;

        /* renamed from: k */
        public int f40497k;
        private volatile Object nextParkedWorker;

        /* renamed from: r */
        public boolean f40498r;
        public volatile /* synthetic */ int workerCtl;

        public C7800c() {
            setDaemon(true);
            this.f40493a = new xm7();
            this.f40494d = WorkerState.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.f40480C;
            this.f40497k = Random.Default.nextInt();
        }

        /* renamed from: b */
        public final void mo55725b(int i) {
            if (i != 0) {
                CoroutineScheduler.f40478A.addAndGet(CoroutineScheduler.this, -2097152);
                if (this.f40494d != WorkerState.TERMINATED) {
                    this.f40494d = WorkerState.DORMANT;
                }
            }
        }

        /* renamed from: c */
        public final void mo55726c(int i) {
            if (i != 0 && mo55743s(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.mo55720n();
            }
        }

        /* renamed from: d */
        public final void mo55727d(vl6 vl6) {
            int b = vl6.f45328d.mo50257b();
            mo55732i(b);
            mo55726c(b);
            CoroutineScheduler.this.mo55717k(vl6);
            mo55725b(b);
        }

        /* renamed from: e */
        public final vl6 mo55728e(boolean z) {
            boolean z2;
            vl6 m;
            vl6 m2;
            if (z) {
                if (mo55734k(CoroutineScheduler.this.f40483a * 2) == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (m2 = mo55736m()) != null) {
                    return m2;
                }
                vl6 h = this.f40493a.mo66898h();
                if (h != null) {
                    return h;
                }
                if (!z2 && (m = mo55736m()) != null) {
                    return m;
                }
            } else {
                vl6 m3 = mo55736m();
                if (m3 != null) {
                    return m3;
                }
            }
            return mo55744t(false);
        }

        /* renamed from: f */
        public final vl6 mo55729f(boolean z) {
            vl6 vl6;
            if (mo55740q()) {
                return mo55728e(z);
            }
            if (z) {
                vl6 = this.f40493a.mo66898h();
                if (vl6 == null) {
                    vl6 = (vl6) CoroutineScheduler.this.f40488r.mo51218d();
                }
            } else {
                vl6 = (vl6) CoroutineScheduler.this.f40488r.mo51218d();
            }
            if (vl6 == null) {
                return mo55744t(true);
            }
            return vl6;
        }

        /* renamed from: g */
        public final int mo55730g() {
            return this.indexInArray;
        }

        /* renamed from: h */
        public final Object mo55731h() {
            return this.nextParkedWorker;
        }

        /* renamed from: i */
        public final void mo55732i(int i) {
            this.f40495e = 0;
            if (this.f40494d == WorkerState.PARKING) {
                this.f40494d = WorkerState.BLOCKING;
            }
        }

        /* renamed from: j */
        public final boolean mo55733j() {
            if (this.nextParkedWorker != CoroutineScheduler.f40480C) {
                return true;
            }
            return false;
        }

        /* renamed from: k */
        public final int mo55734k(int i) {
            int i2 = this.f40497k;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f40497k = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: l */
        public final void mo55735l() {
            if (this.f40495e == 0) {
                this.f40495e = System.nanoTime() + CoroutineScheduler.this.f40485e;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.f40485e);
            if (System.nanoTime() - this.f40495e >= 0) {
                this.f40495e = 0;
                mo55745u();
            }
        }

        /* renamed from: m */
        public final vl6 mo55736m() {
            if (mo55734k(2) == 0) {
                vl6 vl6 = (vl6) CoroutineScheduler.this.f40487k.mo51218d();
                if (vl6 != null) {
                    return vl6;
                }
                return (vl6) CoroutineScheduler.this.f40488r.mo51218d();
            }
            vl6 vl62 = (vl6) CoroutineScheduler.this.f40488r.mo51218d();
            if (vl62 != null) {
                return vl62;
            }
            return (vl6) CoroutineScheduler.this.f40487k.mo51218d();
        }

        /* renamed from: n */
        public final void mo55737n() {
            loop0:
            while (true) {
                boolean z = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f40494d != WorkerState.TERMINATED) {
                    vl6 f = mo55729f(this.f40498r);
                    if (f != null) {
                        this.f40496g = 0;
                        mo55727d(f);
                    } else {
                        this.f40498r = false;
                        if (this.f40496g == 0) {
                            mo55741r();
                        } else if (!z) {
                            z = true;
                        } else {
                            mo55743s(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f40496g);
                            this.f40496g = 0;
                        }
                    }
                }
            }
            mo55743s(WorkerState.TERMINATED);
        }

        /* renamed from: o */
        public final void mo55738o(int i) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f40486g);
            sb.append("-worker-");
            if (i == 0) {
                str = "TERMINATED";
            } else {
                str = String.valueOf(i);
            }
            sb.append(str);
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: p */
        public final void mo55739p(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: q */
        public final boolean mo55740q() {
            boolean z;
            if (this.f40494d != WorkerState.CPU_ACQUIRED) {
                CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                while (true) {
                    long j = coroutineScheduler.controlState;
                    if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                        if (CoroutineScheduler.f40478A.compareAndSet(coroutineScheduler, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f40494d = WorkerState.CPU_ACQUIRED;
            }
            return true;
        }

        /* renamed from: r */
        public final void mo55741r() {
            if (!mo55733j()) {
                CoroutineScheduler.this.mo55714i(this);
                return;
            }
            this.workerCtl = -1;
            while (mo55733j() && this.workerCtl == -1 && !CoroutineScheduler.this.isTerminated() && this.f40494d != WorkerState.TERMINATED) {
                mo55743s(WorkerState.PARKING);
                Thread.interrupted();
                mo55735l();
            }
        }

        public void run() {
            mo55737n();
        }

        /* renamed from: s */
        public final boolean mo55743s(WorkerState workerState) {
            boolean z;
            WorkerState workerState2 = this.f40494d;
            if (workerState2 == WorkerState.CPU_ACQUIRED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                CoroutineScheduler.f40478A.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f40494d = workerState;
            }
            return z;
        }

        /* renamed from: t */
        public final vl6 mo55744t(boolean z) {
            long j;
            int i = (int) (CoroutineScheduler.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int k = mo55734k(i);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                k++;
                if (k > i) {
                    k = 1;
                }
                C7800c b = coroutineScheduler.f40489s.mo65844b(k);
                if (!(b == null || b == this)) {
                    if (z) {
                        j = this.f40493a.mo66901k(b.f40493a);
                    } else {
                        j = this.f40493a.mo66902l(b.f40493a);
                    }
                    if (j == -1) {
                        return this.f40493a.mo66898h();
                    }
                    if (j > 0) {
                        j2 = Math.min(j2, j);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.f40496g = j2;
            return null;
        }

        /* renamed from: u */
        public final void mo55745u() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.f40489s) {
                if (!coroutineScheduler.isTerminated()) {
                    if (((int) (coroutineScheduler.controlState & 2097151)) > coroutineScheduler.f40483a) {
                        if (f40492x.compareAndSet(this, -1, 1)) {
                            int i = this.indexInArray;
                            mo55738o(0);
                            coroutineScheduler.mo55716j(this, i, 0);
                            int andDecrement = (int) (CoroutineScheduler.f40478A.getAndDecrement(coroutineScheduler) & 2097151);
                            if (andDecrement != i) {
                                C7800c b = coroutineScheduler.f40489s.mo65844b(andDecrement);
                                vx2.m53588d(b);
                                C7800c cVar = b;
                                coroutineScheduler.f40489s.mo65845c(i, cVar);
                                cVar.mo55738o(i);
                                coroutineScheduler.mo55716j(cVar, andDecrement, i);
                            }
                            coroutineScheduler.f40489s.mo65845c(andDecrement, null);
                            r37 r37 = r37.f33317a;
                            this.f40494d = WorkerState.TERMINATED;
                        }
                    }
                }
            }
        }

        public C7800c(CoroutineScheduler coroutineScheduler, int i) {
            this();
            mo55738o(i);
        }
    }
}
