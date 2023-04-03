package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: cw3 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class cw3 extends pb8 {

    /* renamed from: d */
    public static final ThreadLocal f27967d = new ThreadLocal();

    /* renamed from: a */
    public final ThreadPoolExecutor f27968a;

    public cw3() {
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new w09(defaultThreadFactory));
        this.f27968a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* renamed from: d */
    public static /* synthetic */ void m43255d(Runnable runnable) {
        f27967d.set(new ArrayDeque());
        runnable.run();
    }

    /* renamed from: e */
    public static void m43256e(Deque deque, Runnable runnable) {
        cu4.m43221k(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo41737a() {
        return this.f27968a;
    }

    /* renamed from: b */
    public final ExecutorService mo41738b() {
        return this.f27968a;
    }

    public final void execute(Runnable runnable) {
        Deque deque = (Deque) f27967d.get();
        if (deque == null || deque.size() > 1) {
            this.f27968a.execute(new x39(runnable));
        } else {
            m43256e(deque, runnable);
        }
    }
}
