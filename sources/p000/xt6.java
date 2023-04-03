package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Lxt6;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Lr37;", "execute", "c", "a", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/ArrayDeque;", "d", "Ljava/util/ArrayDeque;", "tasks", "e", "Ljava/lang/Runnable;", "active", "", "g", "Ljava/lang/Object;", "syncLock", "<init>", "(Ljava/util/concurrent/Executor;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: xt6 */
/* compiled from: TransactionExecutor.kt */
public final class xt6 implements Executor {

    /* renamed from: a */
    public final Executor f19979a;

    /* renamed from: d */
    public final ArrayDeque<Runnable> f19980d = new ArrayDeque<>();

    /* renamed from: e */
    public Runnable f19981e;

    /* renamed from: g */
    public final Object f19982g = new Object();

    public xt6(Executor executor) {
        vx2.m53591g(executor, "executor");
        this.f19979a = executor;
    }

    /* renamed from: b */
    public static final void m30322b(Runnable runnable, xt6 xt6) {
        vx2.m53591g(runnable, "$command");
        vx2.m53591g(xt6, "this$0");
        try {
            runnable.run();
        } finally {
            xt6.mo27884c();
        }
    }

    /* renamed from: c */
    public final void mo27884c() {
        synchronized (this.f19982g) {
            Runnable poll = this.f19980d.poll();
            Runnable runnable = poll;
            this.f19981e = runnable;
            if (poll != null) {
                this.f19979a.execute(runnable);
            }
            r37 r37 = r37.f33317a;
        }
    }

    public void execute(Runnable runnable) {
        vx2.m53591g(runnable, "command");
        synchronized (this.f19982g) {
            this.f19980d.offer(new wt6(runnable, this));
            if (this.f19981e == null) {
                mo27884c();
            }
            r37 r37 = r37.f33317a;
        }
    }
}
