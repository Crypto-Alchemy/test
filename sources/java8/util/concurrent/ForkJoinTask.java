package java8.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.ReentrantLock;
import java8.util.concurrent.C6042a;
import sun.misc.Unsafe;

public abstract class ForkJoinTask<V> implements Future<V>, Serializable {
    public static final int CANCELLED = -1073741824;
    public static final int DONE_MASK = -268435456;
    public static final int EXCEPTIONAL = Integer.MIN_VALUE;
    public static final int NORMAL = -268435456;
    public static final int SIGNAL = 65536;
    public static final int SMASK = 65535;

    /* renamed from: a */
    public static final C6041a[] f30327a = new C6041a[32];

    /* renamed from: d */
    public static final ReentrantLock f30328d = new ReentrantLock();

    /* renamed from: e */
    public static final ReferenceQueue<ForkJoinTask<?>> f30329e = new ReferenceQueue<>();

    /* renamed from: g */
    public static final Unsafe f30330g;

    /* renamed from: k */
    public static final long f30331k;
    private static final long serialVersionUID = -7721805057305804111L;
    public volatile int status;

    public static final class AdaptedCallable<T> extends ForkJoinTask<T> implements RunnableFuture<T> {
        private static final long serialVersionUID = 2838392045355241008L;
        public final Callable<? extends T> callable;
        public T result;

        public AdaptedCallable(Callable<? extends T> callable2) {
            this.callable = (Callable) kf4.m47057e(callable2);
        }

        public final boolean exec() {
            try {
                this.result = this.callable.call();
                return true;
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }

        public final T getRawResult() {
            return this.result;
        }

        public final void run() {
            invoke();
        }

        public final void setRawResult(T t) {
            this.result = t;
        }

        public String toString() {
            return super.toString() + "[Wrapped task = " + this.callable + "]";
        }
    }

    public static final class AdaptedRunnable<T> extends ForkJoinTask<T> implements RunnableFuture<T> {
        private static final long serialVersionUID = 5232453952276885070L;
        public T result;
        public final Runnable runnable;

        public AdaptedRunnable(Runnable runnable2, T t) {
            this.runnable = (Runnable) kf4.m47057e(runnable2);
            this.result = t;
        }

        public final boolean exec() {
            this.runnable.run();
            return true;
        }

        public final T getRawResult() {
            return this.result;
        }

        public final void run() {
            invoke();
        }

        public final void setRawResult(T t) {
            this.result = t;
        }

        public String toString() {
            return super.toString() + "[Wrapped task = " + this.runnable + "]";
        }
    }

    public static final class AdaptedRunnableAction extends ForkJoinTask<Void> implements RunnableFuture<Void> {
        private static final long serialVersionUID = 5232453952276885070L;
        public final Runnable runnable;

        public AdaptedRunnableAction(Runnable runnable2) {
            this.runnable = (Runnable) kf4.m47057e(runnable2);
        }

        public final boolean exec() {
            this.runnable.run();
            return true;
        }

        public final Void getRawResult() {
            return null;
        }

        public final void run() {
            invoke();
        }

        public final void setRawResult(Void voidR) {
        }

        public String toString() {
            return super.toString() + "[Wrapped task = " + this.runnable + "]";
        }
    }

    public static final class RunnableExecuteAction extends ForkJoinTask<Void> {
        private static final long serialVersionUID = 5232453952276885070L;
        public final Runnable runnable;

        public RunnableExecuteAction(Runnable runnable2) {
            this.runnable = (Runnable) kf4.m47057e(runnable2);
        }

        public final boolean exec() {
            this.runnable.run();
            return true;
        }

        public final Void getRawResult() {
            return null;
        }

        public void internalPropagateException(Throwable th) {
            ForkJoinTask.rethrow(th);
        }

        public final void setRawResult(Void voidR) {
        }
    }

    /* renamed from: java8.util.concurrent.ForkJoinTask$a */
    public static final class C6041a extends WeakReference<ForkJoinTask<?>> {

        /* renamed from: a */
        public final Throwable f30332a;

        /* renamed from: b */
        public C6041a f30333b;

        /* renamed from: c */
        public final long f30334c = Thread.currentThread().getId();

        /* renamed from: d */
        public final int f30335d;

        public C6041a(ForkJoinTask<?> forkJoinTask, Throwable th, C6041a aVar, ReferenceQueue<ForkJoinTask<?>> referenceQueue) {
            super(forkJoinTask, referenceQueue);
            this.f30332a = th;
            this.f30333b = aVar;
            this.f30335d = System.identityHashCode(forkJoinTask);
        }
    }

    static {
        Unsafe unsafe = n47.f31967a;
        f30330g = unsafe;
        try {
            f30331k = unsafe.objectFieldOffset(ForkJoinTask.class.getDeclaredField("status"));
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static ForkJoinTask<?> adapt(Runnable runnable) {
        return new AdaptedRunnableAction(runnable);
    }

    public static final void cancelIgnoringExceptions(ForkJoinTask<?> forkJoinTask) {
        if (forkJoinTask != null && forkJoinTask.status >= 0) {
            try {
                forkJoinTask.cancel(false);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m46229d() {
        while (true) {
            Reference<? extends ForkJoinTask<?>> poll = f30329e.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof C6041a) {
                C6041a[] aVarArr = f30327a;
                int length = ((C6041a) poll).f30335d & (aVarArr.length - 1);
                C6041a aVar = aVarArr[length];
                C6041a aVar2 = null;
                while (true) {
                    if (aVar == null) {
                        break;
                    }
                    C6041a aVar3 = aVar.f30333b;
                    if (aVar != poll) {
                        aVar2 = aVar;
                        aVar = aVar3;
                    } else if (aVar2 == null) {
                        aVarArr[length] = aVar3;
                    } else {
                        aVar2.f30333b = aVar3;
                    }
                }
            }
        }
    }

    public static C6042a getPool() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C6052b) {
            return ((C6052b) currentThread).f30382a;
        }
        return null;
    }

    public static int getQueuedTaskCount() {
        C6042a.C6051g gVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C6052b) {
            gVar = ((C6052b) currentThread).f30383d;
        } else {
            gVar = C6042a.m46242e();
        }
        if (gVar == null) {
            return 0;
        }
        return gVar.mo44294l();
    }

    public static int getSurplusQueuedTaskCount() {
        return C6042a.m46247p();
    }

    public static final void helpExpungeStaleExceptions() {
        ReentrantLock reentrantLock = f30328d;
        if (reentrantLock.tryLock()) {
            try {
                m46229d();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static void helpQuiesce() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C6052b) {
            C6052b bVar = (C6052b) currentThread;
            bVar.f30382a.mo44266s(bVar.f30383d);
            return;
        }
        C6042a.m46239B();
    }

    public static boolean inForkJoinPool() {
        return Thread.currentThread() instanceof C6052b;
    }

    public static void invokeAll(ForkJoinTask<?> forkJoinTask, ForkJoinTask<?> forkJoinTask2) {
        forkJoinTask2.fork();
        int b = forkJoinTask.mo44200b() & -268435456;
        if (b != -268435456) {
            forkJoinTask.mo44214h(b);
        }
        int c = forkJoinTask2.mo44201c() & -268435456;
        if (c != -268435456) {
            forkJoinTask2.mo44214h(c);
        }
    }

    public static ForkJoinTask<?> peekNextLocalTask() {
        C6042a.C6051g gVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C6052b) {
            gVar = ((C6052b) currentThread).f30383d;
        } else {
            gVar = C6042a.m46242e();
        }
        if (gVar == null) {
            return null;
        }
        return gVar.mo44290h();
    }

    public static ForkJoinTask<?> pollNextLocalTask() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C6052b) {
            return ((C6052b) currentThread).f30383d.mo44289g();
        }
        return null;
    }

    public static ForkJoinTask<?> pollSubmission() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C6052b) {
            return ((C6052b) currentThread).f30382a.mo44239A();
        }
        return null;
    }

    public static ForkJoinTask<?> pollTask() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C6052b)) {
            return null;
        }
        C6052b bVar = (C6052b) currentThread;
        return bVar.f30382a.mo44274y(bVar.f30383d);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        if (readObject != null) {
            mo44222j((Throwable) readObject);
        }
    }

    public static void rethrow(Throwable th) {
        uncheckedThrow(th);
    }

    public static <T extends Throwable> void uncheckedThrow(Throwable th) throws Throwable {
        if (th != null) {
            throw th;
        }
        throw new Error("Unknown Exception");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getException());
    }

    /* renamed from: a */
    public final void mo44199a() {
        int identityHashCode = System.identityHashCode(this);
        ReentrantLock reentrantLock = f30328d;
        reentrantLock.lock();
        try {
            C6041a[] aVarArr = f30327a;
            int length = identityHashCode & (aVarArr.length - 1);
            C6041a aVar = aVarArr[length];
            C6041a aVar2 = null;
            while (true) {
                if (aVar == null) {
                    break;
                }
                C6041a aVar3 = aVar.f30333b;
                if (aVar.get() != this) {
                    aVar2 = aVar;
                    aVar = aVar3;
                } else if (aVar2 == null) {
                    aVarArr[length] = aVar3;
                } else {
                    aVar2.f30333b = aVar3;
                }
            }
            m46229d();
            this.status = 0;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public final int mo44200b() {
        int doExec = doExec();
        if (doExec < 0) {
            return doExec;
        }
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C6052b)) {
            return mo44206e();
        }
        C6052b bVar = (C6052b) currentThread;
        return bVar.f30382a.mo44250a(bVar.f30383d, this, 0);
    }

    /* renamed from: c */
    public final int mo44201c() {
        int doExec;
        int i = this.status;
        if (i < 0) {
            return i;
        }
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C6052b)) {
            return mo44206e();
        }
        C6052b bVar = (C6052b) currentThread;
        C6042a.C6051g gVar = bVar.f30383d;
        if (!gVar.mo44299q(this) || (doExec = doExec()) >= 0) {
            return bVar.f30382a.mo44250a(gVar, this, 0);
        }
        return doExec;
    }

    public boolean cancel(boolean z) {
        if ((mo44215i(CANCELLED) & -268435456) == -1073741824) {
            return true;
        }
        return false;
    }

    public final boolean compareAndSetForkJoinTaskTag(short s, short s2) {
        int i;
        do {
            i = this.status;
            if (((short) i) != s) {
                return false;
            }
        } while (!f30330g.compareAndSwapInt(this, f30331k, i, (65535 & s2) | (-65536 & i)));
        return true;
    }

    public void complete(V v) {
        try {
            setRawResult(v);
            mo44215i(-268435456);
        } catch (Throwable th) {
            mo44222j(th);
        }
    }

    public void completeExceptionally(Throwable th) {
        if (!(th instanceof RuntimeException) && !(th instanceof Error)) {
            th = new RuntimeException(th);
        }
        mo44222j(th);
    }

    public final int doExec() {
        int i = this.status;
        if (i < 0) {
            return i;
        }
        try {
            if (exec()) {
                return mo44215i(-268435456);
            }
            return i;
        } catch (Throwable th) {
            return mo44222j(th);
        }
    }

    /* renamed from: e */
    public final int mo44206e() {
        int i;
        boolean z = false;
        if (this instanceof CountedCompleter) {
            i = C6042a.f30338I.mo44256i((CountedCompleter) this, 0);
        } else if (C6042a.f30338I.mo44248K(this)) {
            i = doExec();
        } else {
            i = 0;
        }
        if (i < 0) {
            return i;
        }
        int i2 = this.status;
        if (i2 < 0) {
            return i2;
        }
        int i3 = i2;
        do {
            if (f30330g.compareAndSwapInt(this, f30331k, i3, i3 | 65536)) {
                synchronized (this) {
                    if (this.status >= 0) {
                        try {
                            wait(0);
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                    } else {
                        notifyAll();
                    }
                }
            }
            i3 = this.status;
        } while (i3 >= 0);
        if (z) {
            Thread.currentThread().interrupt();
        }
        return i3;
    }

    public abstract boolean exec();

    /* renamed from: f */
    public final int mo44207f() throws InterruptedException {
        int i;
        if (!Thread.interrupted()) {
            int i2 = this.status;
            if (i2 < 0) {
                return i2;
            }
            if (this instanceof CountedCompleter) {
                i = C6042a.f30338I.mo44256i((CountedCompleter) this, 0);
            } else if (C6042a.f30338I.mo44248K(this)) {
                i = doExec();
            } else {
                i = 0;
            }
            if (i < 0) {
                return i;
            }
            while (true) {
                int i3 = this.status;
                if (i3 < 0) {
                    return i3;
                }
                if (f30330g.compareAndSwapInt(this, f30331k, i3, i3 | 65536)) {
                    synchronized (this) {
                        if (this.status >= 0) {
                            wait(0);
                        } else {
                            notifyAll();
                        }
                    }
                }
            }
        } else {
            throw new InterruptedException();
        }
    }

    public final ForkJoinTask<V> fork() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C6052b) {
            ((C6052b) currentThread).f30383d.mo44293k(this);
        } else {
            C6042a.f30338I.mo44260j(this);
        }
        return this;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    public final Throwable mo44209g() {
        Throwable th;
        int identityHashCode = System.identityHashCode(this);
        ReentrantLock reentrantLock = f30328d;
        reentrantLock.lock();
        try {
            m46229d();
            C6041a[] aVarArr = f30327a;
            C6041a aVar = aVarArr[identityHashCode & (aVarArr.length - 1)];
            while (aVar != null && aVar.get() != this) {
                aVar = aVar.f30333b;
            }
            reentrantLock.unlock();
            Constructor constructor = null;
            if (aVar == null || (th = aVar.f30332a) == null) {
                return null;
            }
            if (aVar.f30334c != Thread.currentThread().getId()) {
                try {
                    for (Constructor constructor2 : th.getClass().getConstructors()) {
                        Class<Throwable>[] parameterTypes = constructor2.getParameterTypes();
                        if (parameterTypes.length == 0) {
                            constructor = constructor2;
                        } else if (parameterTypes.length == 1 && parameterTypes[0] == Throwable.class) {
                            return (Throwable) constructor2.newInstance(new Object[]{th});
                        }
                    }
                    if (constructor != null) {
                        Throwable th2 = (Throwable) constructor.newInstance(new Object[0]);
                        th2.initCause(th);
                        return th2;
                    }
                } catch (Exception unused) {
                }
            }
            return th;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final V get() throws InterruptedException, ExecutionException {
        int c = (Thread.currentThread() instanceof C6052b ? mo44201c() : mo44207f()) & -268435456;
        if (c == -1073741824) {
            throw new CancellationException();
        } else if (c != Integer.MIN_VALUE) {
            return getRawResult();
        } else {
            throw new ExecutionException(mo44209g());
        }
    }

    public final Throwable getException() {
        int i = this.status & -268435456;
        if (i >= -268435456) {
            return null;
        }
        if (i == -1073741824) {
            return new CancellationException();
        }
        return mo44209g();
    }

    public final short getForkJoinTaskTag() {
        return (short) this.status;
    }

    public abstract V getRawResult();

    /* renamed from: h */
    public final void mo44214h(int i) {
        if (i == -1073741824) {
            throw new CancellationException();
        } else if (i == Integer.MIN_VALUE) {
            rethrow(mo44209g());
        }
    }

    /* renamed from: i */
    public final int mo44215i(int i) {
        int i2;
        do {
            i2 = this.status;
            if (i2 < 0) {
                return i2;
            }
        } while (!f30330g.compareAndSwapInt(this, f30331k, i2, i2 | i));
        if ((i2 >>> 16) != 0) {
            synchronized (this) {
                notifyAll();
            }
        }
        return i;
    }

    public void internalPropagateException(Throwable th) {
    }

    public final void internalWait(long j) {
        int i = this.status;
        if (i >= 0) {
            if (f30330g.compareAndSwapInt(this, f30331k, i, i | 65536)) {
                synchronized (this) {
                    if (this.status >= 0) {
                        try {
                            wait(j);
                        } catch (InterruptedException unused) {
                        }
                    } else {
                        notifyAll();
                    }
                }
            }
        }
    }

    public final V invoke() {
        int b = mo44200b() & -268435456;
        if (b != -268435456) {
            mo44214h(b);
        }
        return getRawResult();
    }

    public final boolean isCancelled() {
        if ((this.status & -268435456) == -1073741824) {
            return true;
        }
        return false;
    }

    public final boolean isCompletedAbnormally() {
        if (this.status < -268435456) {
            return true;
        }
        return false;
    }

    public final boolean isCompletedNormally() {
        if ((this.status & -268435456) == -268435456) {
            return true;
        }
        return false;
    }

    public final boolean isDone() {
        if (this.status < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final int mo44222j(Throwable th) {
        int recordExceptionalCompletion = recordExceptionalCompletion(th);
        if ((-268435456 & recordExceptionalCompletion) == Integer.MIN_VALUE) {
            internalPropagateException(th);
        }
        return recordExceptionalCompletion;
    }

    public final V join() {
        int c = mo44201c() & -268435456;
        if (c != -268435456) {
            mo44214h(c);
        }
        return getRawResult();
    }

    public final void quietlyComplete() {
        mo44215i(-268435456);
    }

    public final void quietlyInvoke() {
        mo44200b();
    }

    public final void quietlyJoin() {
        mo44201c();
    }

    /* JADX INFO: finally extract failed */
    public final int recordExceptionalCompletion(Throwable th) {
        int i = this.status;
        if (i < 0) {
            return i;
        }
        int identityHashCode = System.identityHashCode(this);
        ReentrantLock reentrantLock = f30328d;
        reentrantLock.lock();
        try {
            m46229d();
            C6041a[] aVarArr = f30327a;
            int length = identityHashCode & (aVarArr.length - 1);
            C6041a aVar = aVarArr[length];
            while (true) {
                if (aVar == null) {
                    aVarArr[length] = new C6041a(this, th, aVarArr[length], f30329e);
                    break;
                } else if (aVar.get() == this) {
                    break;
                } else {
                    aVar = aVar.f30333b;
                }
            }
            reentrantLock.unlock();
            return mo44215i(Integer.MIN_VALUE);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void reinitialize() {
        if ((this.status & -268435456) == Integer.MIN_VALUE) {
            mo44199a();
        } else {
            this.status = 0;
        }
    }

    public final short setForkJoinTaskTag(short s) {
        Unsafe unsafe;
        long j;
        int i;
        do {
            unsafe = f30330g;
            j = f30331k;
            i = this.status;
        } while (!unsafe.compareAndSwapInt(this, j, i, (-65536 & i) | (65535 & s)));
        return (short) i;
    }

    public abstract void setRawResult(V v);

    public boolean tryUnfork() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C6052b) {
            return ((C6052b) currentThread).f30383d.mo44299q(this);
        }
        return C6042a.f30338I.mo44248K(this);
    }

    public static <T> ForkJoinTask<T> adapt(Runnable runnable, T t) {
        return new AdaptedRunnable(runnable, t);
    }

    public static <T> ForkJoinTask<T> adapt(Callable<? extends T> callable) {
        return new AdaptedCallable(callable);
    }

    public static void invokeAll(ForkJoinTask<?>... forkJoinTaskArr) {
        int length = forkJoinTaskArr.length - 1;
        Throwable th = null;
        for (int i = length; i >= 0; i--) {
            ForkJoinTask<?> forkJoinTask = forkJoinTaskArr[i];
            if (forkJoinTask == null) {
                if (th == null) {
                    th = new NullPointerException();
                }
            } else if (i != 0) {
                forkJoinTask.fork();
            } else if (forkJoinTask.mo44200b() < -268435456 && th == null) {
                th = forkJoinTask.getException();
            }
        }
        for (int i2 = 1; i2 <= length; i2++) {
            ForkJoinTask<?> forkJoinTask2 = forkJoinTaskArr[i2];
            if (forkJoinTask2 != null) {
                if (th != null) {
                    forkJoinTask2.cancel(false);
                } else if (forkJoinTask2.mo44201c() < -268435456) {
                    th = forkJoinTask2.getException();
                }
            }
        }
        if (th != null) {
            rethrow(th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052 A[LOOP:0: B:21:0x0052->B:59:0x0052, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(long r11, java.util.concurrent.TimeUnit r13) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        /*
            r10 = this;
            long r11 = r13.toNanos(r11)
            boolean r13 = java.lang.Thread.interrupted()
            if (r13 != 0) goto L_0x00b8
            int r13 = r10.status
            if (r13 < 0) goto L_0x008b
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x008b
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 + r11
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x001f
            r2 = 1
        L_0x001f:
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            boolean r12 = r11 instanceof java8.util.concurrent.C6052b
            if (r12 == 0) goto L_0x0032
            java8.util.concurrent.b r11 = (java8.util.concurrent.C6052b) r11
            java8.util.concurrent.a r12 = r11.f30382a
            java8.util.concurrent.a$g r11 = r11.f30383d
            int r13 = r12.mo44250a(r11, r10, r2)
            goto L_0x008b
        L_0x0032:
            boolean r11 = r10 instanceof java8.util.concurrent.CountedCompleter
            r12 = 0
            if (r11 == 0) goto L_0x0042
            java8.util.concurrent.a r11 = java8.util.concurrent.C6042a.f30338I
            r13 = r10
            java8.util.concurrent.CountedCompleter r13 = (java8.util.concurrent.CountedCompleter) r13
            int r11 = r11.mo44256i(r13, r12)
        L_0x0040:
            r13 = r11
            goto L_0x0050
        L_0x0042:
            java8.util.concurrent.a r11 = java8.util.concurrent.C6042a.f30338I
            boolean r11 = r11.mo44248K(r10)
            if (r11 == 0) goto L_0x004f
            int r11 = r10.doExec()
            goto L_0x0040
        L_0x004f:
            r13 = r12
        L_0x0050:
            if (r13 < 0) goto L_0x008b
        L_0x0052:
            int r8 = r10.status
            if (r8 < 0) goto L_0x008a
            long r11 = java.lang.System.nanoTime()
            long r11 = r2 - r11
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x008a
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r11 = r13.toMillis(r11)
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x0052
            sun.misc.Unsafe r4 = f30330g
            long r6 = f30331k
            r13 = 65536(0x10000, float:9.18355E-41)
            r9 = r8 | r13
            r5 = r10
            boolean r13 = r4.compareAndSwapInt(r5, r6, r8, r9)
            if (r13 == 0) goto L_0x0052
            monitor-enter(r10)
            int r13 = r10.status     // Catch:{ all -> 0x0087 }
            if (r13 < 0) goto L_0x0082
            r10.wait(r11)     // Catch:{ all -> 0x0087 }
            goto L_0x0085
        L_0x0082:
            r10.notifyAll()     // Catch:{ all -> 0x0087 }
        L_0x0085:
            monitor-exit(r10)     // Catch:{ all -> 0x0087 }
            goto L_0x0052
        L_0x0087:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0087 }
            throw r11
        L_0x008a:
            r13 = r8
        L_0x008b:
            if (r13 < 0) goto L_0x008f
            int r13 = r10.status
        L_0x008f:
            r11 = -268435456(0xfffffffff0000000, float:-1.58456325E29)
            r12 = r13 & r11
            if (r12 == r11) goto L_0x00b3
            r11 = -1073741824(0xffffffffc0000000, float:-2.0)
            if (r12 == r11) goto L_0x00ad
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r11) goto L_0x00a3
            java.util.concurrent.TimeoutException r11 = new java.util.concurrent.TimeoutException
            r11.<init>()
            throw r11
        L_0x00a3:
            java.util.concurrent.ExecutionException r11 = new java.util.concurrent.ExecutionException
            java.lang.Throwable r12 = r10.mo44209g()
            r11.<init>(r12)
            throw r11
        L_0x00ad:
            java.util.concurrent.CancellationException r11 = new java.util.concurrent.CancellationException
            r11.<init>()
            throw r11
        L_0x00b3:
            java.lang.Object r11 = r10.getRawResult()
            return r11
        L_0x00b8:
            java.lang.InterruptedException r11 = new java.lang.InterruptedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.ForkJoinTask.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public static <T extends ForkJoinTask<?>> Collection<T> invokeAll(Collection<T> collection) {
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            invokeAll((ForkJoinTask<?>[]) (ForkJoinTask[]) collection.toArray(new ForkJoinTask[0]));
            return collection;
        }
        List list = (List) collection;
        Throwable th = null;
        int size = list.size() - 1;
        for (int i = size; i >= 0; i--) {
            ForkJoinTask forkJoinTask = (ForkJoinTask) list.get(i);
            if (forkJoinTask == null) {
                if (th == null) {
                    th = new NullPointerException();
                }
            } else if (i != 0) {
                forkJoinTask.fork();
            } else if (forkJoinTask.mo44200b() < -268435456 && th == null) {
                th = forkJoinTask.getException();
            }
        }
        for (int i2 = 1; i2 <= size; i2++) {
            ForkJoinTask forkJoinTask2 = (ForkJoinTask) list.get(i2);
            if (forkJoinTask2 != null) {
                if (th != null) {
                    forkJoinTask2.cancel(false);
                } else if (forkJoinTask2.mo44201c() < -268435456) {
                    th = forkJoinTask2.getException();
                }
            }
        }
        if (th != null) {
            rethrow(th);
        }
        return collection;
    }
}
