package p000;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: cr8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class cr8 extends vt8 {

    /* renamed from: l */
    public static final AtomicLong f27893l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c */
    public zq8 f27894c;

    /* renamed from: d */
    public zq8 f27895d;

    /* renamed from: e */
    public final PriorityBlockingQueue<xq8<?>> f27896e = new PriorityBlockingQueue<>();

    /* renamed from: f */
    public final BlockingQueue<xq8<?>> f27897f = new LinkedBlockingQueue();

    /* renamed from: g */
    public final Thread.UncaughtExceptionHandler f27898g = new vq8(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h */
    public final Thread.UncaughtExceptionHandler f27899h = new vq8(this, "Thread death: Uncaught exception on network thread");

    /* renamed from: i */
    public final Object f27900i = new Object();

    /* renamed from: j */
    public final Semaphore f27901j = new Semaphore(2);

    /* renamed from: k */
    public volatile boolean f27902k;

    public cr8(kr8 kr8) {
        super(kr8);
    }

    /* renamed from: D */
    public final void mo41635D(xq8<?> xq8) {
        synchronized (this.f27900i) {
            this.f27896e.add(xq8);
            zq8 zq8 = this.f27894c;
            if (zq8 == null) {
                zq8 zq82 = new zq8(this, "Measurement Worker", this.f27896e);
                this.f27894c = zq82;
                zq82.setUncaughtExceptionHandler(this.f27898g);
                this.f27894c.start();
            } else {
                zq8.mo49906a();
            }
        }
    }

    /* renamed from: d */
    public final void mo41636d() {
        if (Thread.currentThread() != this.f27895d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: e */
    public final void mo29006e() {
        if (Thread.currentThread() != this.f27894c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: f */
    public final boolean mo29669f() {
        return false;
    }

    /* renamed from: l */
    public final boolean mo41637l() {
        if (Thread.currentThread() == this.f27894c) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final <V> Future<V> mo41638m(Callable<V> callable) throws IllegalStateException {
        mo48801i();
        cu4.m43221k(callable);
        xq8 xq8 = new xq8(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f27894c) {
            if (!this.f27896e.isEmpty()) {
                this.f34342a.mo45237A().mo29673o().mo48769a("Callable skipped the worker queue.");
            }
            xq8.run();
        } else {
            mo41635D(xq8);
        }
        return xq8;
    }

    /* renamed from: n */
    public final <V> Future<V> mo41639n(Callable<V> callable) throws IllegalStateException {
        mo48801i();
        cu4.m43221k(callable);
        xq8 xq8 = new xq8(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f27894c) {
            xq8.run();
        } else {
            mo41635D(xq8);
        }
        return xq8;
    }

    /* renamed from: o */
    public final void mo41640o(Runnable runnable) throws IllegalStateException {
        mo48801i();
        cu4.m43221k(runnable);
        mo41635D(new xq8(this, runnable, false, "Task exception on worker thread"));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r5.length() == 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r4 = "Timed out waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r4 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r3.mo48769a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = r1.f34342a.mo45237A().mo29673o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r5.length() != 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r4 = "Interrupted waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        r4 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        r3.mo48769a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r3 = r1.f34342a.mo45237A().mo29673o();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo41641p(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            kr8 r0 = r1.f34342a     // Catch:{ all -> 0x0058 }
            cr8 r0 = r0.mo45272s()     // Catch:{ all -> 0x0058 }
            r0.mo41640o(r6)     // Catch:{ all -> 0x0058 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0035 }
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0034
            kr8 r3 = r1.f34342a
            bn8 r3 = r3.mo45237A()
            vm8 r3 = r3.mo29673o()
            java.lang.String r4 = "Timed out waiting for "
            int r6 = r5.length()
            if (r6 == 0) goto L_0x002b
            java.lang.String r4 = r4.concat(r5)
            goto L_0x0031
        L_0x002b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x0031:
            r3.mo48769a(r4)
        L_0x0034:
            return r2
        L_0x0035:
            kr8 r3 = r1.f34342a     // Catch:{ all -> 0x0058 }
            bn8 r3 = r3.mo45237A()     // Catch:{ all -> 0x0058 }
            vm8 r3 = r3.mo29673o()     // Catch:{ all -> 0x0058 }
            java.lang.String r4 = "Interrupted waiting for "
            int r6 = r5.length()     // Catch:{ all -> 0x0058 }
            if (r6 == 0) goto L_0x004c
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0058 }
            goto L_0x0052
        L_0x004c:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0058 }
            r5.<init>(r4)     // Catch:{ all -> 0x0058 }
            r4 = r5
        L_0x0052:
            r3.mo48769a(r4)     // Catch:{ all -> 0x0058 }
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            r2 = 0
            return r2
        L_0x0058:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cr8.mo41641p(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: r */
    public final void mo41642r(Runnable runnable) throws IllegalStateException {
        mo48801i();
        cu4.m43221k(runnable);
        mo41635D(new xq8(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: t */
    public final void mo41643t(Runnable runnable) throws IllegalStateException {
        mo48801i();
        cu4.m43221k(runnable);
        xq8 xq8 = new xq8(this, runnable, false, "Task exception on network thread");
        synchronized (this.f27900i) {
            this.f27897f.add(xq8);
            zq8 zq8 = this.f27895d;
            if (zq8 == null) {
                zq8 zq82 = new zq8(this, "Measurement Network", this.f27897f);
                this.f27895d = zq82;
                zq82.setUncaughtExceptionHandler(this.f27899h);
                this.f27895d.start();
            } else {
                zq8.mo49906a();
            }
        }
    }
}
