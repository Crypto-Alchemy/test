package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\t\u001a\u00020\bH\u0001J\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0001J\b\u0010\u0010\u001a\u00020\rH\u0016J\u001c\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u001c\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0017J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0014\u0010\u0015\u001a\u00020\u00132\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0002R\u0014\u0010\u0018\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001e\u0010!\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010&\u001a\u00060\"j\u0002`#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, mo44877d2 = {"Ldh3;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lib1;", "", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lzh1;", "i", "Lma0;", "Lr37;", "continuation", "f", "run", "m", "y", "", "L", "K", "e", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "", "g", "I", "parallelism", "runningWorkers", "Ldk3;", "r", "Ldk3;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "s", "Ljava/lang/Object;", "workerAllocationLock", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: dh3 */
/* compiled from: LimitedDispatcher.kt */
public final class dh3 extends CoroutineDispatcher implements Runnable, ib1 {

    /* renamed from: e */
    public final CoroutineDispatcher f37281e;

    /* renamed from: g */
    public final int f37282g;

    /* renamed from: k */
    public final /* synthetic */ ib1 f37283k;

    /* renamed from: r */
    public final dk3<Runnable> f37284r;
    private volatile int runningWorkers;

    /* renamed from: s */
    public final Object f37285s;

    public dh3(CoroutineDispatcher coroutineDispatcher, int i) {
        ib1 ib1;
        this.f37281e = coroutineDispatcher;
        this.f37282g = i;
        if (coroutineDispatcher instanceof ib1) {
            ib1 = (ib1) coroutineDispatcher;
        } else {
            ib1 = null;
        }
        this.f37283k = ib1 == null ? x71.m73886a() : ib1;
        this.f37284r = new dk3<>(false);
        this.f37285s = new Object();
    }

    /* renamed from: K */
    public final boolean mo51192K(Runnable runnable) {
        this.f37284r.mo51215a(runnable);
        if (this.runningWorkers >= this.f37282g) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final boolean mo51193L() {
        synchronized (this.f37285s) {
            if (this.runningWorkers >= this.f37282g) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    /* renamed from: f */
    public void mo51194f(long j, ma0<? super r37> ma0) {
        this.f37283k.mo51194f(j, ma0);
    }

    /* renamed from: i */
    public zh1 mo51195i(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f37283k.mo51195i(j, runnable, coroutineContext);
    }

    /* renamed from: m */
    public void mo3894m(CoroutineContext coroutineContext, Runnable runnable) {
        if (!mo51192K(runnable) && mo51193L()) {
            this.f37281e.mo3894m(this, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r4.f37285s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.f37284r.mo51217c() != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.runningWorkers++;
        r2 = p000.r37.f33317a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            dk3<java.lang.Runnable> r2 = r4.f37284r
            java.lang.Object r2 = r2.mo51218d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch:{ all -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            p000.gu0.m58254a(r3, r2)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            kotlinx.coroutines.CoroutineDispatcher r2 = r4.f37281e
            boolean r2 = r2.mo28541z(r4)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.CoroutineDispatcher r0 = r4.f37281e
            r0.mo3894m(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.f37285s
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + -1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            dk3<java.lang.Runnable> r2 = r4.f37284r     // Catch:{ all -> 0x0047 }
            int r2 = r2.mo51217c()     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            r37 r2 = p000.r37.f33317a     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            goto L_0x0001
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dh3.run():void");
    }

    /* renamed from: y */
    public void mo50471y(CoroutineContext coroutineContext, Runnable runnable) {
        if (!mo51192K(runnable) && mo51193L()) {
            this.f37281e.mo50471y(this, this);
        }
    }
}
