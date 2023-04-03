package p000;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: gq0 */
/* compiled from: ConstrainedExecutorService */
public class gq0 extends AbstractExecutorService {

    /* renamed from: x */
    public static final Class<?> f12553x = gq0.class;

    /* renamed from: a */
    public final String f12554a;

    /* renamed from: d */
    public final Executor f12555d;

    /* renamed from: e */
    public volatile int f12556e;

    /* renamed from: g */
    public final BlockingQueue<Runnable> f12557g;

    /* renamed from: k */
    public final C2418b f12558k;

    /* renamed from: r */
    public final AtomicInteger f12559r;

    /* renamed from: s */
    public final AtomicInteger f12560s;

    /* renamed from: gq0$b */
    /* compiled from: ConstrainedExecutorService */
    public class C2418b implements Runnable {
        public C2418b() {
        }

        public void run() {
            AtomicInteger d;
            boolean isEmpty;
            try {
                Runnable runnable = (Runnable) gq0.this.f12557g.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    oy1.m24428o(gq0.f12553x, "%s: Worker has nothing to run", gq0.this.f12554a);
                }
                if (isEmpty) {
                    oy1.m24429p(gq0.f12553x, "%s: worker finished; %d workers left", gq0.this.f12554a, Integer.valueOf(d.decrementAndGet()));
                }
            } finally {
                int decrementAndGet = gq0.this.f12559r.decrementAndGet();
                if (!gq0.this.f12557g.isEmpty()) {
                    gq0.this.mo20790f();
                } else {
                    oy1.m24429p(gq0.f12553x, "%s: worker finished; %d workers left", gq0.this.f12554a, Integer.valueOf(decrementAndGet));
                }
            }
        }
    }

    public gq0(String str, int i, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        if (i > 0) {
            this.f12554a = str;
            this.f12555d = executor;
            this.f12556e = i;
            this.f12557g = blockingQueue;
            this.f12558k = new C2418b();
            this.f12559r = new AtomicInteger(0);
            this.f12560s = new AtomicInteger(0);
            return;
        }
        throw new IllegalArgumentException("max concurrency must be > 0");
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        } else if (this.f12557g.offer(runnable)) {
            int size = this.f12557g.size();
            int i = this.f12560s.get();
            if (size > i && this.f12560s.compareAndSet(i, size)) {
                oy1.m24429p(f12553x, "%s: max pending work in queue = %d", this.f12554a, Integer.valueOf(size));
            }
            mo20790f();
        } else {
            throw new RejectedExecutionException(this.f12554a + " queue is full, size=" + this.f12557g.size());
        }
    }

    /* renamed from: f */
    public final void mo20790f() {
        int i = this.f12559r.get();
        while (i < this.f12556e) {
            int i2 = i + 1;
            if (this.f12559r.compareAndSet(i, i2)) {
                oy1.m24430q(f12553x, "%s: starting worker %d of %d", this.f12554a, Integer.valueOf(i2), Integer.valueOf(this.f12556e));
                this.f12555d.execute(this.f12558k);
                return;
            }
            oy1.m24428o(f12553x, "%s: race in startWorkerIfNeeded; retrying", this.f12554a);
            i = this.f12559r.get();
        }
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
