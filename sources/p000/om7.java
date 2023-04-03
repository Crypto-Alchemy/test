package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: om7 */
/* compiled from: WorkManagerTaskExecutor */
public class om7 implements bm6 {

    /* renamed from: a */
    public final nw5 f15951a;

    /* renamed from: b */
    public final Handler f15952b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final Executor f15953c = new C2971a();

    /* renamed from: om7$a */
    /* compiled from: WorkManagerTaskExecutor */
    public class C2971a implements Executor {
        public C2971a() {
        }

        public void execute(Runnable runnable) {
            om7.this.mo24006d(runnable);
        }
    }

    public om7(Executor executor) {
        this.f15951a = new nw5(executor);
    }

    /* renamed from: a */
    public Executor mo11699a() {
        return this.f15953c;
    }

    /* renamed from: b */
    public void mo11700b(Runnable runnable) {
        this.f15951a.execute(runnable);
    }

    /* renamed from: c */
    public nw5 mo11701c() {
        return this.f15951a;
    }

    /* renamed from: d */
    public void mo24006d(Runnable runnable) {
        this.f15952b.post(runnable);
    }
}
