package p018io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.reactivex.internal.schedulers.RxThreadFactory */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    public final boolean nonBlocking;
    public final String prefix;
    public final int priority;

    /* renamed from: io.reactivex.internal.schedulers.RxThreadFactory$a */
    public static final class C5990a extends Thread {
        public C5990a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    public Thread newThread(Runnable runnable) {
        Thread thread;
        String str = this.prefix + '-' + incrementAndGet();
        if (this.nonBlocking) {
            thread = new C5990a(runnable, str);
        } else {
            thread = new Thread(runnable, str);
        }
        thread.setPriority(this.priority);
        thread.setDaemon(true);
        return thread;
    }

    public String toString() {
        return "RxThreadFactory[" + this.prefix + "]";
    }

    public RxThreadFactory(String str, int i) {
        this(str, i, false);
    }

    public RxThreadFactory(String str, int i, boolean z) {
        this.prefix = str;
        this.priority = i;
        this.nonBlocking = z;
    }
}
