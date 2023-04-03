package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u00020\u0005H\u0014J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ'\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0001J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0002\u0007\n\u0005\b20\u0001¨\u0006\""}, mo44877d2 = {"Lzr;", "Lqq6;", "", "now", "remainingNanos", "Lr37;", "enter", "", "exit", "timedOut", "Ls36;", "sink", "Lz56;", "source", "T", "Lkotlin/Function0;", "block", "withTimeout", "(Lpc2;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "newTimeoutException", "inQueue", "Z", "next", "Lzr;", "timeoutAt", "J", "<init>", "()V", "Companion", "a", "b", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: zr */
/* compiled from: AsyncTimeout.kt */
public class C9710zr extends qq6 {
    public static final C9711a Companion = new C9711a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long IDLE_TIMEOUT_MILLIS;
    /* access modifiers changed from: private */
    public static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    /* access modifiers changed from: private */
    public static C9710zr head;
    /* access modifiers changed from: private */
    public boolean inQueue;
    /* access modifiers changed from: private */
    public C9710zr next;
    /* access modifiers changed from: private */
    public long timeoutAt;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0002H\u0002R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo44877d2 = {"Lzr$a;", "", "Lzr;", "c", "()Lzr;", "node", "", "timeoutNanos", "", "hasDeadline", "Lr37;", "e", "d", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "TIMEOUT_WRITE_SIZE", "I", "head", "Lzr;", "<init>", "()V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: zr$a */
    /* compiled from: AsyncTimeout.kt */
    public static final class C9711a {
        public C9711a() {
        }

        public /* synthetic */ C9711a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public final C9710zr mo67389c() throws InterruptedException {
            Class<C9710zr> cls = C9710zr.class;
            C9710zr access$getHead$cp = C9710zr.head;
            vx2.m53588d(access$getHead$cp);
            C9710zr access$getNext$p = access$getHead$cp.next;
            if (access$getNext$p == null) {
                long nanoTime = System.nanoTime();
                cls.wait(C9710zr.IDLE_TIMEOUT_MILLIS);
                C9710zr access$getHead$cp2 = C9710zr.head;
                vx2.m53588d(access$getHead$cp2);
                if (access$getHead$cp2.next != null || System.nanoTime() - nanoTime < C9710zr.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return C9710zr.head;
            }
            long access$remainingNanos = access$getNext$p.remainingNanos(System.nanoTime());
            if (access$remainingNanos > 0) {
                long j = access$remainingNanos / 1000000;
                cls.wait(j, (int) (access$remainingNanos - (1000000 * j)));
                return null;
            }
            C9710zr access$getHead$cp3 = C9710zr.head;
            vx2.m53588d(access$getHead$cp3);
            access$getHead$cp3.next = access$getNext$p.next;
            access$getNext$p.next = null;
            return access$getNext$p;
        }

        /* renamed from: d */
        public final boolean mo67390d(C9710zr zrVar) {
            synchronized (C9710zr.class) {
                if (!zrVar.inQueue) {
                    return false;
                }
                zrVar.inQueue = false;
                for (C9710zr access$getHead$cp = C9710zr.head; access$getHead$cp != null; access$getHead$cp = access$getHead$cp.next) {
                    if (access$getHead$cp.next == zrVar) {
                        access$getHead$cp.next = zrVar.next;
                        zrVar.next = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* renamed from: e */
        public final void mo67391e(C9710zr zrVar, long j, boolean z) {
            Class<C9710zr> cls = C9710zr.class;
            synchronized (cls) {
                if (!zrVar.inQueue) {
                    zrVar.inQueue = true;
                    if (C9710zr.head == null) {
                        C9710zr.head = new C9710zr();
                        new C9712b().start();
                    }
                    long nanoTime = System.nanoTime();
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    if (i != 0 && z) {
                        zrVar.timeoutAt = Math.min(j, zrVar.deadlineNanoTime() - nanoTime) + nanoTime;
                    } else if (i != 0) {
                        zrVar.timeoutAt = j + nanoTime;
                    } else if (z) {
                        zrVar.timeoutAt = zrVar.deadlineNanoTime();
                    } else {
                        throw new AssertionError();
                    }
                    long access$remainingNanos = zrVar.remainingNanos(nanoTime);
                    C9710zr access$getHead$cp = C9710zr.head;
                    vx2.m53588d(access$getHead$cp);
                    while (true) {
                        if (access$getHead$cp.next == null) {
                            break;
                        }
                        C9710zr access$getNext$p = access$getHead$cp.next;
                        vx2.m53588d(access$getNext$p);
                        if (access$remainingNanos < access$getNext$p.remainingNanos(nanoTime)) {
                            break;
                        }
                        access$getHead$cp = access$getHead$cp.next;
                        vx2.m53588d(access$getHead$cp);
                    }
                    zrVar.next = access$getHead$cp.next;
                    access$getHead$cp.next = zrVar;
                    if (access$getHead$cp == C9710zr.head) {
                        cls.notify();
                    }
                    r37 r37 = r37.f33317a;
                } else {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"Lzr$b;", "Ljava/lang/Thread;", "Lr37;", "run", "<init>", "()V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: zr$b */
    /* compiled from: AsyncTimeout.kt */
    public static final class C9712b extends Thread {
        public C9712b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
            if (r1 != null) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x001b, code lost:
            r1.timedOut();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<zr> r0 = p000.C9710zr.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                zr$a r1 = p000.C9710zr.Companion     // Catch:{ all -> 0x001f }
                zr r1 = r1.mo67389c()     // Catch:{ all -> 0x001f }
                zr r2 = p000.C9710zr.head     // Catch:{ all -> 0x001f }
                if (r1 != r2) goto L_0x0015
                r1 = 0
                p000.C9710zr.head = r1     // Catch:{ all -> 0x001f }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0015:
                r37 r2 = p000.r37.f33317a     // Catch:{ all -> 0x001f }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 != 0) goto L_0x001b
                goto L_0x0000
            L_0x001b:
                r1.timedOut()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C9710zr.C9712b.run():void");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"zr$c", "Ls36;", "Lm40;", "source", "", "byteCount", "Lr37;", "write", "flush", "close", "Lzr;", "a", "", "toString", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: zr$c */
    /* compiled from: AsyncTimeout.kt */
    public static final class C9713c implements s36 {

        /* renamed from: a */
        public final /* synthetic */ C9710zr f46488a;

        /* renamed from: d */
        public final /* synthetic */ s36 f46489d;

        public C9713c(C9710zr zrVar, s36 s36) {
            this.f46488a = zrVar;
            this.f46489d = s36;
        }

        /* renamed from: a */
        public C9710zr timeout() {
            return this.f46488a;
        }

        public void close() {
            C9710zr zrVar = this.f46488a;
            s36 s36 = this.f46489d;
            zrVar.enter();
            try {
                s36.close();
                r37 r37 = r37.f33317a;
                if (zrVar.exit()) {
                    throw zrVar.access$newTimeoutException((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (zrVar.exit()) {
                    e = zrVar.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                boolean exit = zrVar.exit();
            }
        }

        public void flush() {
            C9710zr zrVar = this.f46488a;
            s36 s36 = this.f46489d;
            zrVar.enter();
            try {
                s36.flush();
                r37 r37 = r37.f33317a;
                if (zrVar.exit()) {
                    throw zrVar.access$newTimeoutException((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (zrVar.exit()) {
                    e = zrVar.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                boolean exit = zrVar.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f46489d + ')';
        }

        public void write(m40 m40, long j) {
            vx2.m53591g(m40, "source");
            zp7.m75204b(m40.size(), 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    ct5 ct5 = m40.f40752a;
                    vx2.m53588d(ct5);
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += (long) (ct5.f37202c - ct5.f37201b);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        } else {
                            ct5 = ct5.f37205f;
                            vx2.m53588d(ct5);
                        }
                    }
                    C9710zr zrVar = this.f46488a;
                    s36 s36 = this.f46489d;
                    zrVar.enter();
                    try {
                        s36.write(m40, j2);
                        r37 r37 = r37.f33317a;
                        if (!zrVar.exit()) {
                            j -= j2;
                        } else {
                            throw zrVar.access$newTimeoutException((IOException) null);
                        }
                    } catch (IOException e) {
                        e = e;
                        if (zrVar.exit()) {
                            e = zrVar.access$newTimeoutException(e);
                        }
                        throw e;
                    } finally {
                        boolean exit = zrVar.exit();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, mo44877d2 = {"zr$d", "Lz56;", "Lm40;", "sink", "", "byteCount", "read", "Lr37;", "close", "Lzr;", "a", "", "toString", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: zr$d */
    /* compiled from: AsyncTimeout.kt */
    public static final class C9714d implements z56 {

        /* renamed from: a */
        public final /* synthetic */ C9710zr f46490a;

        /* renamed from: d */
        public final /* synthetic */ z56 f46491d;

        public C9714d(C9710zr zrVar, z56 z56) {
            this.f46490a = zrVar;
            this.f46491d = z56;
        }

        /* renamed from: a */
        public C9710zr timeout() {
            return this.f46490a;
        }

        public void close() {
            C9710zr zrVar = this.f46490a;
            z56 z56 = this.f46491d;
            zrVar.enter();
            try {
                z56.close();
                r37 r37 = r37.f33317a;
                if (zrVar.exit()) {
                    throw zrVar.access$newTimeoutException((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (zrVar.exit()) {
                    e = zrVar.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                boolean exit = zrVar.exit();
            }
        }

        public long read(m40 m40, long j) {
            vx2.m53591g(m40, "sink");
            C9710zr zrVar = this.f46490a;
            z56 z56 = this.f46491d;
            zrVar.enter();
            try {
                long read = z56.read(m40, j);
                if (!zrVar.exit()) {
                    return read;
                }
                throw zrVar.access$newTimeoutException((IOException) null);
            } catch (IOException e) {
                e = e;
                if (zrVar.exit()) {
                    e = zrVar.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                boolean exit = zrVar.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f46491d + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* access modifiers changed from: private */
    public final long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            Companion.mo67391e(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.mo67390d(this);
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final s36 sink(s36 s36) {
        vx2.m53591g(s36, "sink");
        return new C9713c(this, s36);
    }

    public final z56 source(z56 z56) {
        vx2.m53591g(z56, "source");
        return new C9714d(this, z56);
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(pc2<? extends T> pc2) {
        vx2.m53591g(pc2, "block");
        enter();
        try {
            T invoke = pc2.invoke();
            pu2.m50113b(1);
            if (!exit()) {
                pu2.m50112a(1);
                return invoke;
            }
            throw access$newTimeoutException((IOException) null);
        } catch (IOException e) {
            e = e;
            if (exit()) {
                e = access$newTimeoutException(e);
            }
            throw e;
        } catch (Throwable th) {
            pu2.m50113b(1);
            boolean exit = exit();
            pu2.m50112a(1);
            throw th;
        }
    }
}
