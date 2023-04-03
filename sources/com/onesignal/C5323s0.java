package com.onesignal;

import com.onesignal.OneSignal;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.onesignal.s0 */
/* compiled from: OSTaskController */
public class C5323s0 {

    /* renamed from: a */
    public final ConcurrentLinkedQueue<Runnable> f26523a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    public final AtomicLong f26524b = new AtomicLong();

    /* renamed from: c */
    public ExecutorService f26525c;

    /* renamed from: d */
    public final ld4 f26526d;

    /* renamed from: com.onesignal.s0$a */
    /* compiled from: OSTaskController */
    public class C5324a implements ThreadFactory {
        public C5324a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("OS_PENDING_EXECUTOR_" + thread.getId());
            return thread;
        }
    }

    /* renamed from: com.onesignal.s0$b */
    /* compiled from: OSTaskController */
    public static class C5325b implements Runnable {

        /* renamed from: a */
        public C5323s0 f26528a;

        /* renamed from: d */
        public Runnable f26529d;

        /* renamed from: e */
        public long f26530e;

        public C5325b(C5323s0 s0Var, Runnable runnable) {
            this.f26528a = s0Var;
            this.f26529d = runnable;
        }

        public void run() {
            this.f26529d.run();
            this.f26528a.mo39100d(this.f26530e);
        }

        public String toString() {
            return "PendingTaskRunnable{innerTask=" + this.f26529d + ", taskId=" + this.f26530e + '}';
        }
    }

    public C5323s0(ld4 ld4) {
        this.f26526d = ld4;
    }

    /* renamed from: b */
    public final void mo39098b(C5325b bVar) {
        long unused = bVar.f26530e = this.f26524b.incrementAndGet();
        ExecutorService executorService = this.f26525c;
        if (executorService == null) {
            ld4 ld4 = this.f26526d;
            ld4.debug("Adding a task to the pending queue with ID: " + bVar.f26530e);
            this.f26523a.add(bVar);
        } else if (!executorService.isShutdown()) {
            ld4 ld42 = this.f26526d;
            ld42.debug("Executor is still running, add to the executor with ID: " + bVar.f26530e);
            try {
                this.f26525c.submit(bVar);
            } catch (RejectedExecutionException e) {
                ld4 ld43 = this.f26526d;
                ld43.info("Executor is shutdown, running task manually with ID: " + bVar.f26530e);
                bVar.run();
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public void mo39099c(Runnable runnable) {
        mo39098b(new C5325b(this, runnable));
    }

    /* renamed from: d */
    public final void mo39100d(long j) {
        if (this.f26524b.get() == j) {
            OneSignal.m40376a(OneSignal.LOG_LEVEL.INFO, "Last Pending Task has ran, shutting down");
            this.f26525c.shutdown();
        }
    }

    /* renamed from: e */
    public boolean mo39101e() {
        if (Thread.currentThread().getName().contains("OS_PENDING_EXECUTOR_")) {
            return false;
        }
        if (OneSignal.m40350P0() && this.f26525c == null) {
            return false;
        }
        if (OneSignal.m40350P0() || this.f26525c != null) {
            return !this.f26525c.isShutdown();
        }
        return true;
    }

    /* renamed from: f */
    public void mo39102f() {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "startPendingTasks with task queue quantity: " + this.f26523a.size());
        if (!this.f26523a.isEmpty()) {
            this.f26525c = Executors.newSingleThreadExecutor(new C5324a());
            while (!this.f26523a.isEmpty()) {
                this.f26525c.submit(this.f26523a.poll());
            }
        }
    }
}
