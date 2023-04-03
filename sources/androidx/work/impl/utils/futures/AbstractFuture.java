package androidx.work.impl.utils.futures;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractFuture<V> implements hi3<V> {

    /* renamed from: g */
    public static final boolean f7642g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: k */
    public static final Logger f7643k = Logger.getLogger(AbstractFuture.class.getName());

    /* renamed from: r */
    public static final C1555b f7644r;

    /* renamed from: s */
    public static final Object f7645s = new Object();

    /* renamed from: a */
    public volatile Object f7646a;

    /* renamed from: d */
    public volatile C1557d f7647d;

    /* renamed from: e */
    public volatile C1561h f7648e;

    public static final class Failure {

        /* renamed from: b */
        public static final Failure f7649b = new Failure(new Throwable("Failure occurred while trying to finish a future.") {
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a */
        public final Throwable f7650a;

        public Failure(Throwable th) {
            this.f7650a = (Throwable) AbstractFuture.m10623d(th);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$b */
    public static abstract class C1555b {
        public C1555b() {
        }

        /* renamed from: a */
        public abstract boolean mo11050a(AbstractFuture<?> abstractFuture, C1557d dVar, C1557d dVar2);

        /* renamed from: b */
        public abstract boolean mo11051b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo11052c(AbstractFuture<?> abstractFuture, C1561h hVar, C1561h hVar2);

        /* renamed from: d */
        public abstract void mo11053d(C1561h hVar, C1561h hVar2);

        /* renamed from: e */
        public abstract void mo11054e(C1561h hVar, Thread thread);
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$c */
    public static final class C1556c {

        /* renamed from: c */
        public static final C1556c f7651c;

        /* renamed from: d */
        public static final C1556c f7652d;

        /* renamed from: a */
        public final boolean f7653a;

        /* renamed from: b */
        public final Throwable f7654b;

        static {
            if (AbstractFuture.f7642g) {
                f7652d = null;
                f7651c = null;
                return;
            }
            f7652d = new C1556c(false, (Throwable) null);
            f7651c = new C1556c(true, (Throwable) null);
        }

        public C1556c(boolean z, Throwable th) {
            this.f7653a = z;
            this.f7654b = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$d */
    public static final class C1557d {

        /* renamed from: d */
        public static final C1557d f7655d = new C1557d((Runnable) null, (Executor) null);

        /* renamed from: a */
        public final Runnable f7656a;

        /* renamed from: b */
        public final Executor f7657b;

        /* renamed from: c */
        public C1557d f7658c;

        public C1557d(Runnable runnable, Executor executor) {
            this.f7656a = runnable;
            this.f7657b = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$e */
    public static final class C1558e extends C1555b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C1561h, Thread> f7659a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C1561h, C1561h> f7660b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractFuture, C1561h> f7661c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractFuture, C1557d> f7662d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> f7663e;

        public C1558e(AtomicReferenceFieldUpdater<C1561h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C1561h, C1561h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, C1561h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, C1557d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f7659a = atomicReferenceFieldUpdater;
            this.f7660b = atomicReferenceFieldUpdater2;
            this.f7661c = atomicReferenceFieldUpdater3;
            this.f7662d = atomicReferenceFieldUpdater4;
            this.f7663e = atomicReferenceFieldUpdater5;
        }

        /* renamed from: a */
        public boolean mo11050a(AbstractFuture<?> abstractFuture, C1557d dVar, C1557d dVar2) {
            return C2265f6.m16607a(this.f7662d, abstractFuture, dVar, dVar2);
        }

        /* renamed from: b */
        public boolean mo11051b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return C2265f6.m16607a(this.f7663e, abstractFuture, obj, obj2);
        }

        /* renamed from: c */
        public boolean mo11052c(AbstractFuture<?> abstractFuture, C1561h hVar, C1561h hVar2) {
            return C2265f6.m16607a(this.f7661c, abstractFuture, hVar, hVar2);
        }

        /* renamed from: d */
        public void mo11053d(C1561h hVar, C1561h hVar2) {
            this.f7660b.lazySet(hVar, hVar2);
        }

        /* renamed from: e */
        public void mo11054e(C1561h hVar, Thread thread) {
            this.f7659a.lazySet(hVar, thread);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$f */
    public static final class C1559f<V> implements Runnable {

        /* renamed from: a */
        public final AbstractFuture<V> f7664a;

        /* renamed from: d */
        public final hi3<? extends V> f7665d;

        public C1559f(AbstractFuture<V> abstractFuture, hi3<? extends V> hi3) {
            this.f7664a = abstractFuture;
            this.f7665d = hi3;
        }

        public void run() {
            if (this.f7664a.f7646a == this) {
                if (AbstractFuture.f7644r.mo11051b(this.f7664a, this, AbstractFuture.m10626i(this.f7665d))) {
                    AbstractFuture.m10624f(this.f7664a);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$g */
    public static final class C1560g extends C1555b {
        public C1560g() {
            super();
        }

        /* renamed from: a */
        public boolean mo11050a(AbstractFuture<?> abstractFuture, C1557d dVar, C1557d dVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f7647d != dVar) {
                    return false;
                }
                abstractFuture.f7647d = dVar2;
                return true;
            }
        }

        /* renamed from: b */
        public boolean mo11051b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f7646a != obj) {
                    return false;
                }
                abstractFuture.f7646a = obj2;
                return true;
            }
        }

        /* renamed from: c */
        public boolean mo11052c(AbstractFuture<?> abstractFuture, C1561h hVar, C1561h hVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f7648e != hVar) {
                    return false;
                }
                abstractFuture.f7648e = hVar2;
                return true;
            }
        }

        /* renamed from: d */
        public void mo11053d(C1561h hVar, C1561h hVar2) {
            hVar.f7668b = hVar2;
        }

        /* renamed from: e */
        public void mo11054e(C1561h hVar, Thread thread) {
            hVar.f7667a = thread;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$h */
    public static final class C1561h {

        /* renamed from: c */
        public static final C1561h f7666c = new C1561h(false);

        /* renamed from: a */
        public volatile Thread f7667a;

        /* renamed from: b */
        public volatile C1561h f7668b;

        public C1561h(boolean z) {
        }

        /* renamed from: a */
        public void mo11056a(C1561h hVar) {
            AbstractFuture.f7644r.mo11053d(this, hVar);
        }

        /* renamed from: b */
        public void mo11057b() {
            Thread thread = this.f7667a;
            if (thread != null) {
                this.f7667a = null;
                LockSupport.unpark(thread);
            }
        }

        public C1561h() {
            AbstractFuture.f7644r.mo11054e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.work.impl.utils.futures.AbstractFuture$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.work.impl.utils.futures.AbstractFuture$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.work.impl.utils.futures.AbstractFuture$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.work.impl.utils.futures.AbstractFuture$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture$h> r0 = androidx.work.impl.utils.futures.AbstractFuture.C1561h.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f7642g = r1
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r1 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f7643k = r1
            androidx.work.impl.utils.futures.AbstractFuture$e r1 = new androidx.work.impl.utils.futures.AbstractFuture$e     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r2 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.String r5 = "e"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r0 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture$d> r2 = androidx.work.impl.utils.futures.AbstractFuture.C1557d.class
            java.lang.String r6 = "d"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r0 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.work.impl.utils.futures.AbstractFuture$g r1 = new androidx.work.impl.utils.futures.AbstractFuture$g
            r1.<init>()
        L_0x0054:
            f7644r = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f7643k
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f7645s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.<clinit>():void");
    }

    /* renamed from: c */
    public static CancellationException m10622c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: d */
    public static <T> T m10623d(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: f */
    public static void m10624f(AbstractFuture<?> abstractFuture) {
        C1557d dVar = null;
        AbstractFuture<V> abstractFuture2 = abstractFuture;
        while (true) {
            abstractFuture2.mo11042n();
            abstractFuture2.mo11032b();
            C1557d e = abstractFuture2.mo11034e(dVar);
            while (true) {
                if (e != null) {
                    dVar = e.f7658c;
                    Runnable runnable = e.f7656a;
                    if (runnable instanceof C1559f) {
                        C1559f fVar = (C1559f) runnable;
                        AbstractFuture<V> abstractFuture3 = fVar.f7664a;
                        if (abstractFuture3.f7646a == fVar) {
                            if (f7644r.mo11051b(abstractFuture3, fVar, m10626i(fVar.f7665d))) {
                                abstractFuture2 = abstractFuture3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m10625g(runnable, e.f7657b);
                    }
                    e = dVar;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public static void m10625g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f7643k;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: i */
    public static Object m10626i(hi3<?> hi3) {
        if (hi3 instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) hi3).f7646a;
            if (!(obj instanceof C1556c)) {
                return obj;
            }
            C1556c cVar = (C1556c) obj;
            if (!cVar.f7653a) {
                return obj;
            }
            if (cVar.f7654b != null) {
                return new C1556c(false, cVar.f7654b);
            }
            return C1556c.f7652d;
        }
        boolean isCancelled = hi3.isCancelled();
        if ((!f7642g) && isCancelled) {
            return C1556c.f7652d;
        }
        try {
            Object j = m10627j(hi3);
            if (j == null) {
                return f7645s;
            }
            return j;
        } catch (ExecutionException e) {
            return new Failure(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C1556c(false, e2);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + hi3, e2));
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    /* renamed from: j */
    public static <V> V m10627j(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: a */
    public final void mo11031a(StringBuilder sb) {
        try {
            Object j = m10627j(this);
            sb.append("SUCCESS, result=[");
            sb.append(mo11047s(j));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: b */
    public void mo11032b() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, hi3<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f7646a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.C1559f
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f7642g
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = new androidx.work.impl.utils.futures.AbstractFuture$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = androidx.work.impl.utils.futures.AbstractFuture.C1556c.f7651c
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = androidx.work.impl.utils.futures.AbstractFuture.C1556c.f7652d
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            androidx.work.impl.utils.futures.AbstractFuture$b r6 = f7644r
            boolean r6 = r6.mo11051b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.mo11040k()
        L_0x0035:
            m10624f(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.C1559f
            if (r4 == 0) goto L_0x0062
            androidx.work.impl.utils.futures.AbstractFuture$f r0 = (androidx.work.impl.utils.futures.AbstractFuture.C1559f) r0
            hi3<? extends V> r0 = r0.f7665d
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.work.impl.utils.futures.AbstractFuture r4 = (androidx.work.impl.utils.futures.AbstractFuture) r4
            java.lang.Object r0 = r4.f7646a
            if (r0 != 0) goto L_0x004d
            r5 = r1
            goto L_0x004e
        L_0x004d:
            r5 = r2
        L_0x004e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.C1559f
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = r1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f7646a
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.C1559f
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.cancel(boolean):boolean");
    }

    /* renamed from: e */
    public final C1557d mo11034e(C1557d dVar) {
        C1557d dVar2;
        do {
            dVar2 = this.f7647d;
        } while (!f7644r.mo11050a(this, dVar2, C1557d.f7655d));
        C1557d dVar3 = dVar2;
        C1557d dVar4 = dVar;
        C1557d dVar5 = dVar3;
        while (dVar5 != null) {
            C1557d dVar6 = dVar5.f7658c;
            dVar5.f7658c = dVar4;
            dVar4 = dVar5;
            dVar5 = dVar6;
        }
        return dVar4;
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f7646a;
            if ((obj != null) && (!(obj instanceof C1559f))) {
                return mo11037h(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C1561h hVar = this.f7648e;
                if (hVar != C1561h.f7666c) {
                    C1561h hVar2 = new C1561h();
                    do {
                        hVar2.mo11056a(hVar);
                        if (f7644r.mo11052c(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f7646a;
                                    if ((obj2 != null) && (!(obj2 instanceof C1559f))) {
                                        return mo11037h(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    mo11043o(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            mo11043o(hVar2);
                        } else {
                            hVar = this.f7648e;
                        }
                    } while (hVar != C1561h.f7666c);
                }
                return mo11037h(this.f7646a);
            }
            while (nanos > 0) {
                Object obj3 = this.f7646a;
                if ((obj3 != null) && (!(obj3 instanceof C1559f))) {
                    return mo11037h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractFuture = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + abstractFuture);
        }
        throw new InterruptedException();
    }

    /* renamed from: h */
    public final V mo11037h(Object obj) throws ExecutionException {
        if (obj instanceof C1556c) {
            throw m10622c("Task was cancelled.", ((C1556c) obj).f7654b);
        } else if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f7650a);
        } else if (obj == f7645s) {
            return null;
        } else {
            return obj;
        }
    }

    public final boolean isCancelled() {
        return this.f7646a instanceof C1556c;
    }

    public final boolean isDone() {
        boolean z;
        Object obj = this.f7646a;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof C1559f)) & z;
    }

    /* renamed from: k */
    public void mo11040k() {
    }

    /* renamed from: l */
    public final void mo10867l(Runnable runnable, Executor executor) {
        m10623d(runnable);
        m10623d(executor);
        C1557d dVar = this.f7647d;
        if (dVar != C1557d.f7655d) {
            C1557d dVar2 = new C1557d(runnable, executor);
            do {
                dVar2.f7658c = dVar;
                if (!f7644r.mo11050a(this, dVar, dVar2)) {
                    dVar = this.f7647d;
                } else {
                    return;
                }
            } while (dVar != C1557d.f7655d);
        }
        m10625g(runnable, executor);
    }

    /* renamed from: m */
    public String mo11041m() {
        Object obj = this.f7646a;
        if (obj instanceof C1559f) {
            return "setFuture=[" + mo11047s(((C1559f) obj).f7665d) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* renamed from: n */
    public final void mo11042n() {
        C1561h hVar;
        do {
            hVar = this.f7648e;
        } while (!f7644r.mo11052c(this, hVar, C1561h.f7666c));
        while (hVar != null) {
            hVar.mo11057b();
            hVar = hVar.f7668b;
        }
    }

    /* renamed from: o */
    public final void mo11043o(C1561h hVar) {
        hVar.f7667a = null;
        while (true) {
            C1561h hVar2 = this.f7648e;
            if (hVar2 != C1561h.f7666c) {
                C1561h hVar3 = null;
                while (hVar2 != null) {
                    C1561h hVar4 = hVar2.f7668b;
                    if (hVar2.f7667a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f7668b = hVar4;
                        if (hVar3.f7667a == null) {
                        }
                    } else if (!f7644r.mo11052c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: p */
    public boolean mo11044p(V v) {
        if (v == null) {
            v = f7645s;
        }
        if (!f7644r.mo11051b(this, (Object) null, v)) {
            return false;
        }
        m10624f(this);
        return true;
    }

    /* renamed from: q */
    public boolean mo11045q(Throwable th) {
        if (!f7644r.mo11051b(this, (Object) null, new Failure((Throwable) m10623d(th)))) {
            return false;
        }
        m10624f(this);
        return true;
    }

    /* renamed from: r */
    public boolean mo11046r(hi3<? extends V> hi3) {
        C1559f fVar;
        Failure failure;
        m10623d(hi3);
        Object obj = this.f7646a;
        if (obj == null) {
            if (hi3.isDone()) {
                if (!f7644r.mo11051b(this, (Object) null, m10626i(hi3))) {
                    return false;
                }
                m10624f(this);
                return true;
            }
            fVar = new C1559f(this, hi3);
            if (f7644r.mo11051b(this, (Object) null, fVar)) {
                try {
                    hi3.mo10867l(fVar, DirectExecutor.INSTANCE);
                } catch (Throwable unused) {
                    failure = Failure.f7649b;
                }
                return true;
            }
            obj = this.f7646a;
        }
        if (obj instanceof C1556c) {
            hi3.cancel(((C1556c) obj).f7653a);
        }
        return false;
        f7644r.mo11051b(this, fVar, failure);
        return true;
    }

    /* renamed from: s */
    public final String mo11047s(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            mo11031a(sb);
        } else {
            try {
                str = mo11041m();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                mo11031a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f7646a;
            if ((obj2 != null) && (!(obj2 instanceof C1559f))) {
                return mo11037h(obj2);
            }
            C1561h hVar = this.f7648e;
            if (hVar != C1561h.f7666c) {
                C1561h hVar2 = new C1561h();
                do {
                    hVar2.mo11056a(hVar);
                    if (f7644r.mo11052c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f7646a;
                            } else {
                                mo11043o(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C1559f))));
                        return mo11037h(obj);
                    }
                    hVar = this.f7648e;
                } while (hVar != C1561h.f7666c);
            }
            return mo11037h(this.f7646a);
        }
        throw new InterruptedException();
    }
}
