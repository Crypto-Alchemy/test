package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C7766d;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b,\u0010 J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014J\b\u0010\f\u001a\u00020\u0005H\u0016J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00072\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0002R\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00158TX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00178BX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00178BX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(¨\u0006-"}, mo44877d2 = {"Lkotlinx/coroutines/b;", "Lkotlinx/coroutines/d;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "Lr37;", "l0", "", "now", "Lkotlinx/coroutines/d$c;", "delayedTask", "g0", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lzh1;", "i", "run", "S0", "Ljava/lang/Thread;", "N0", "", "Q0", "G0", "y", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "()V", "", "debugStatus", "I", "e0", "()Ljava/lang/Thread;", "thread", "O0", "()Z", "isShutDown", "P0", "isShutdownRequested", "<init>", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.b */
/* compiled from: DefaultExecutor.kt */
public final class C7758b extends C7766d implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: x */
    public static final C7758b f40363x;

    /* renamed from: y */
    public static final long f40364y;

    static {
        Long l;
        C7758b bVar = new C7758b();
        f40363x = bVar;
        nt1.m70076S(bVar, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f40364y = timeUnit.toNanos(l.longValue());
    }

    /* renamed from: G0 */
    public final synchronized void mo55559G0() {
        if (mo55562P0()) {
            debugStatus = 3;
            mo55603y0();
            notifyAll();
        }
    }

    /* renamed from: N0 */
    public final synchronized Thread mo55560N0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: O0 */
    public final boolean mo55561O0() {
        if (debugStatus == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: P0 */
    public final boolean mo55562P0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: Q0 */
    public final synchronized boolean mo55563Q0() {
        if (mo55562P0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: S0 */
    public final void mo55564S0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* renamed from: e0 */
    public Thread mo55565e0() {
        Thread thread = _thread;
        if (thread == null) {
            return mo55560N0();
        }
        return thread;
    }

    /* renamed from: g0 */
    public void mo55566g0(long j, C7766d.C7769c cVar) {
        mo55564S0();
    }

    /* renamed from: i */
    public zh1 mo51195i(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return mo55593C0(j, runnable);
    }

    /* renamed from: l0 */
    public void mo55567l0(Runnable runnable) {
        if (mo55561O0()) {
            mo55564S0();
        }
        super.mo55567l0(runnable);
    }

    public void run() {
        ip6.f38501a.mo52521d(this);
        C7208i7.m58864a();
        try {
            if (mo55563Q0()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long Y = mo55597Y();
                    if (Y == Long.MAX_VALUE) {
                        C7208i7.m58864a();
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f40364y + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            mo55559G0();
                            C7208i7.m58864a();
                            if (!mo55601s0()) {
                                mo55565e0();
                                return;
                            }
                            return;
                        }
                        Y = d75.m43386h(Y, j2);
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (Y > 0) {
                        if (mo55562P0()) {
                            _thread = null;
                            mo55559G0();
                            C7208i7.m58864a();
                            if (!mo55601s0()) {
                                mo55565e0();
                                return;
                            }
                            return;
                        }
                        C7208i7.m58864a();
                        LockSupport.parkNanos(this, Y);
                    }
                }
            }
        } finally {
            _thread = null;
            mo55559G0();
            C7208i7.m58864a();
            if (!mo55601s0()) {
                mo55565e0();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
