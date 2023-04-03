package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: nw5 */
/* compiled from: SerialExecutor */
public class nw5 implements Executor {

    /* renamed from: a */
    public final ArrayDeque<C2925a> f15693a = new ArrayDeque<>();

    /* renamed from: d */
    public final Executor f15694d;

    /* renamed from: e */
    public final Object f15695e = new Object();

    /* renamed from: g */
    public volatile Runnable f15696g;

    /* renamed from: nw5$a */
    /* compiled from: SerialExecutor */
    public static class C2925a implements Runnable {

        /* renamed from: a */
        public final nw5 f15697a;

        /* renamed from: d */
        public final Runnable f15698d;

        public C2925a(nw5 nw5, Runnable runnable) {
            this.f15697a = nw5;
            this.f15698d = runnable;
        }

        public void run() {
            try {
                this.f15698d.run();
            } finally {
                this.f15697a.mo23810b();
            }
        }
    }

    public nw5(Executor executor) {
        this.f15694d = executor;
    }

    /* renamed from: a */
    public boolean mo23809a() {
        boolean z;
        synchronized (this.f15695e) {
            if (!this.f15693a.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public void mo23810b() {
        synchronized (this.f15695e) {
            Runnable poll = this.f15693a.poll();
            this.f15696g = poll;
            if (poll != null) {
                this.f15694d.execute(this.f15696g);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f15695e) {
            this.f15693a.add(new C2925a(this, runnable));
            if (this.f15696g == null) {
                mo23810b();
            }
        }
    }
}
