package java8.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java8.util.concurrent.C6042a;
import sun.misc.Unsafe;

public class CompletableFuture<T> implements Future<T> {

    /* renamed from: e */
    public static final C6038a f30314e = new C6038a((Throwable) null);

    /* renamed from: g */
    public static final boolean f30315g;

    /* renamed from: k */
    public static final Executor f30316k;

    /* renamed from: r */
    public static final Unsafe f30317r;

    /* renamed from: s */
    public static final long f30318s;

    /* renamed from: x */
    public static final long f30319x;

    /* renamed from: y */
    public static final long f30320y;

    /* renamed from: a */
    public volatile Object f30321a;

    /* renamed from: d */
    public volatile Completion f30322d;

    public static final class AsyncRun extends ForkJoinTask<Void> implements Runnable, C6039b {
        public CompletableFuture<Void> dep;

        /* renamed from: fn */
        public Runnable f30323fn;

        public AsyncRun(CompletableFuture<Void> completableFuture, Runnable runnable) {
            this.dep = completableFuture;
            this.f30323fn = runnable;
        }

        public final boolean exec() {
            run();
            return false;
        }

        public final Void getRawResult() {
            return null;
        }

        public void run() {
            Runnable runnable;
            CompletableFuture<Void> completableFuture = this.dep;
            if (completableFuture != null && (runnable = this.f30323fn) != null) {
                this.dep = null;
                this.f30323fn = null;
                if (completableFuture.f30321a == null) {
                    try {
                        runnable.run();
                        completableFuture.mo44154g();
                    } catch (Throwable th) {
                        completableFuture.mo44157h(th);
                    }
                }
                completableFuture.mo44163o();
            }
        }

        public final void setRawResult(Void voidR) {
        }
    }

    public static abstract class Completion extends ForkJoinTask<Void> implements Runnable, C6039b {
        public volatile Completion next;

        public final boolean exec() {
            tryFire(1);
            return false;
        }

        public final Void getRawResult() {
            return null;
        }

        public abstract boolean isLive();

        public final void run() {
            tryFire(1);
        }

        public final void setRawResult(Void voidR) {
        }

        public abstract CompletableFuture<?> tryFire(int i);
    }

    public static final class Signaller extends Completion implements C6042a.C6049e {
        public final long deadline;
        public boolean interrupted;
        public final boolean interruptible;
        public long nanos;
        public volatile Thread thread = Thread.currentThread();

        public Signaller(boolean z, long j, long j2) {
            this.interruptible = z;
            this.nanos = j;
            this.deadline = j2;
        }

        public boolean block() {
            while (!isReleasable()) {
                if (this.deadline == 0) {
                    LockSupport.park(this);
                } else {
                    LockSupport.parkNanos(this, this.nanos);
                }
            }
            return true;
        }

        public final boolean isLive() {
            if (this.thread != null) {
                return true;
            }
            return false;
        }

        public boolean isReleasable() {
            if (Thread.interrupted()) {
                this.interrupted = true;
            }
            if (this.interrupted && this.interruptible) {
                return true;
            }
            long j = this.deadline;
            if (j != 0) {
                if (this.nanos <= 0) {
                    return true;
                }
                long nanoTime = j - System.nanoTime();
                this.nanos = nanoTime;
                if (nanoTime <= 0) {
                    return true;
                }
            }
            if (this.thread == null) {
                return true;
            }
            return false;
        }

        public final CompletableFuture<?> tryFire(int i) {
            Thread thread2 = this.thread;
            if (thread2 != null) {
                this.thread = null;
                LockSupport.unpark(thread2);
            }
            return null;
        }
    }

    /* renamed from: java8.util.concurrent.CompletableFuture$a */
    public static final class C6038a {

        /* renamed from: a */
        public final Throwable f30324a;

        public C6038a(Throwable th) {
            this.f30324a = th;
        }
    }

    /* renamed from: java8.util.concurrent.CompletableFuture$b */
    public interface C6039b {
    }

    /* renamed from: java8.util.concurrent.CompletableFuture$c */
    public static final class C6040c implements Executor {
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    static {
        Executor executor;
        boolean z = true;
        if (C6042a.m46246n() <= 1) {
            z = false;
        }
        f30315g = z;
        if (z) {
            executor = C6042a.m46241d();
        } else {
            executor = new C6040c();
        }
        f30316k = executor;
        Unsafe unsafe = n47.f31967a;
        f30317r = unsafe;
        try {
            f30318s = unsafe.objectFieldOffset(CompletableFuture.class.getDeclaredField("a"));
            f30319x = unsafe.objectFieldOffset(CompletableFuture.class.getDeclaredField("d"));
            f30320y = unsafe.objectFieldOffset(Completion.class.getDeclaredField("next"));
            Class<LockSupport> cls = LockSupport.class;
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static CompletableFuture<Void> m46208a(Executor executor, Runnable runnable) {
        kf4.m47057e(runnable);
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        executor.execute(new AsyncRun(completableFuture, runnable));
        return completableFuture;
    }

    /* renamed from: b */
    public static boolean m46209b(Completion completion, Completion completion2, Completion completion3) {
        return fm0.m44335a(f30317r, completion, f30320y, completion2, completion3);
    }

    /* renamed from: k */
    public static C6038a m46210k(Throwable th) {
        if (!(th instanceof CompletionException)) {
            th = new CompletionException(th);
        }
        return new C6038a(th);
    }

    /* renamed from: n */
    public static void m46211n(Completion completion, Completion completion2) {
        f30317r.putOrderedObject(completion, f30320y, completion2);
    }

    /* renamed from: q */
    public static Object m46212q(Object obj) throws InterruptedException, ExecutionException {
        Throwable cause;
        if (obj == null) {
            throw new InterruptedException();
        } else if (!(obj instanceof C6038a)) {
            return obj;
        } else {
            Throwable th = ((C6038a) obj).f30324a;
            if (th == null) {
                return null;
            }
            if (!(th instanceof CancellationException)) {
                if ((th instanceof CompletionException) && (cause = th.getCause()) != null) {
                    th = cause;
                }
                throw new ExecutionException(th);
            }
            throw ((CancellationException) th);
        }
    }

    /* renamed from: r */
    public static CompletableFuture<Void> m46213r(Runnable runnable, Executor executor) {
        return m46208a(m46214s(executor), runnable);
    }

    /* renamed from: s */
    public static Executor m46214s(Executor executor) {
        if (f30315g || executor != C6042a.m46241d()) {
            return (Executor) kf4.m47057e(executor);
        }
        return f30316k;
    }

    /* renamed from: c */
    public final boolean mo44149c(Completion completion, Completion completion2) {
        return fm0.m44335a(f30317r, this, f30319x, completion, completion2);
    }

    public boolean cancel(boolean z) {
        boolean z2;
        if (this.f30321a != null || !mo44162m(new C6038a(new CancellationException()))) {
            z2 = false;
        } else {
            z2 = true;
        }
        mo44163o();
        if (z2 || isCancelled()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo44151d() {
        Completion completion;
        boolean z = false;
        while (true) {
            completion = this.f30322d;
            if (completion != null && !completion.isLive()) {
                z = mo44149c(completion, completion.next);
            } else if (completion != null && !z) {
                Completion completion2 = completion;
                Completion completion3 = completion.next;
                Completion completion4 = completion2;
                while (completion3 != null) {
                    Completion completion5 = completion3.next;
                    if (completion3.isLive()) {
                        completion4 = completion3;
                        completion3 = completion5;
                    } else {
                        m46209b(completion4, completion3, completion5);
                        return;
                    }
                }
                return;
            }
        }
        if (completion != null) {
        }
    }

    /* renamed from: e */
    public boolean mo44152e(T t) {
        boolean i = mo44158i(t);
        mo44163o();
        return i;
    }

    /* renamed from: f */
    public boolean mo44153f(Throwable th) {
        boolean m = mo44162m(new C6038a((Throwable) kf4.m47057e(th)));
        mo44163o();
        return m;
    }

    /* renamed from: g */
    public final boolean mo44154g() {
        return fm0.m44335a(f30317r, this, f30318s, (Object) null, f30314e);
    }

    public T get() throws InterruptedException, ExecutionException {
        Object obj = this.f30321a;
        if (obj == null) {
            obj = mo44168v(true);
        }
        return m46212q(obj);
    }

    /* renamed from: h */
    public final boolean mo44157h(Throwable th) {
        return fm0.m44335a(f30317r, this, f30318s, (Object) null, m46210k(th));
    }

    /* renamed from: i */
    public final boolean mo44158i(T t) {
        Unsafe unsafe = f30317r;
        long j = f30318s;
        if (t == null) {
            t = f30314e;
        }
        return fm0.m44335a(unsafe, this, j, (Object) null, t);
    }

    public boolean isCancelled() {
        Object obj = this.f30321a;
        if (!(obj instanceof C6038a) || !(((C6038a) obj).f30324a instanceof CancellationException)) {
            return false;
        }
        return true;
    }

    public boolean isDone() {
        if (this.f30321a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public Executor mo44161j() {
        return f30316k;
    }

    /* renamed from: m */
    public final boolean mo44162m(Object obj) {
        return fm0.m44335a(f30317r, this, f30318s, (Object) null, obj);
    }

    /* renamed from: o */
    public final void mo44163o() {
        while (true) {
            CompletableFuture completableFuture = this;
            while (true) {
                Completion completion = completableFuture.f30322d;
                if (completion == null) {
                    if (completableFuture != this && (completion = this.f30322d) != null) {
                        completableFuture = this;
                    } else {
                        return;
                    }
                }
                Completion completion2 = completion.next;
                if (completableFuture.mo44149c(completion, completion2)) {
                    if (completion2 != null) {
                        if (completableFuture != this) {
                            mo44164p(completion);
                        } else {
                            m46209b(completion, completion2, (Completion) null);
                        }
                    }
                    completableFuture = completion.tryFire(-1);
                    if (completableFuture == null) {
                    }
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo44164p(Completion completion) {
        do {
        } while (!mo44167u(completion));
    }

    /* renamed from: t */
    public final Object mo44165t(long j) throws TimeoutException {
        Object obj;
        if (Thread.interrupted()) {
            return null;
        }
        if (j > 0) {
            long nanoTime = System.nanoTime() + j;
            if (nanoTime == 0) {
                nanoTime = 1;
            }
            boolean z = false;
            Signaller signaller = null;
            while (true) {
                obj = this.f30321a;
                if (obj != null) {
                    break;
                } else if (signaller == null) {
                    Signaller signaller2 = new Signaller(true, j, nanoTime);
                    if (Thread.currentThread() instanceof C6052b) {
                        C6042a.m46248q(mo44161j(), signaller2);
                    }
                    signaller = signaller2;
                } else if (!z) {
                    z = mo44167u(signaller);
                } else if (signaller.nanos <= 0) {
                    break;
                } else {
                    try {
                        C6042a.m46250v(signaller);
                    } catch (InterruptedException unused) {
                        signaller.interrupted = true;
                    }
                    if (signaller.interrupted) {
                        break;
                    }
                }
            }
            if (signaller != null && z) {
                signaller.thread = null;
                if (obj == null) {
                    mo44151d();
                }
            }
            if (!(obj == null && (obj = this.f30321a) == null)) {
                mo44163o();
            }
            if (obj != null || (signaller != null && signaller.interrupted)) {
                return obj;
            }
        }
        throw new TimeoutException();
    }

    public String toString() {
        String str;
        Object obj = this.f30321a;
        int i = 0;
        for (Completion completion = this.f30322d; completion != null; completion = completion.next) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (obj != null) {
            if (obj instanceof C6038a) {
                C6038a aVar = (C6038a) obj;
                if (aVar.f30324a != null) {
                    str = "[Completed exceptionally: " + aVar.f30324a + "]";
                }
            }
            str = "[Completed normally]";
        } else if (i == 0) {
            str = "[Not completed]";
        } else {
            str = "[Not completed, " + i + " dependents]";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean mo44167u(Completion completion) {
        Completion completion2 = this.f30322d;
        m46211n(completion, completion2);
        return fm0.m44335a(f30317r, this, f30319x, completion2, completion);
    }

    /* renamed from: v */
    public final Object mo44168v(boolean z) {
        Object obj;
        boolean z2 = false;
        Signaller signaller = null;
        while (true) {
            obj = this.f30321a;
            if (obj == null) {
                if (signaller != null) {
                    if (z2) {
                        try {
                            C6042a.m46250v(signaller);
                        } catch (InterruptedException unused) {
                            signaller.interrupted = true;
                        }
                        if (signaller.interrupted && z) {
                            break;
                        }
                    } else {
                        z2 = mo44167u(signaller);
                    }
                } else {
                    signaller = new Signaller(z, 0, 0);
                    if (Thread.currentThread() instanceof C6052b) {
                        C6042a.m46248q(mo44161j(), signaller);
                    }
                }
            } else {
                break;
            }
        }
        if (signaller != null && z2) {
            signaller.thread = null;
            if (!z && signaller.interrupted) {
                Thread.currentThread().interrupt();
            }
            if (obj == null) {
                mo44151d();
            }
        }
        if (!(obj == null && (obj = this.f30321a) == null)) {
            mo44163o();
        }
        return obj;
    }

    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        Object obj = this.f30321a;
        if (obj == null) {
            obj = mo44165t(nanos);
        }
        return m46212q(obj);
    }
}
