package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: v91 */
/* compiled from: DefaultSerialExecutorService */
public class v91 extends gq0 implements ow5 {
    public v91(Executor executor) {
        super("SerialExecutor", 1, executor, new LinkedBlockingQueue());
    }

    public synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
