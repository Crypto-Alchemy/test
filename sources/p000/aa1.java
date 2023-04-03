package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aa1 */
/* compiled from: DefaultTaskExecutor */
public class aa1 extends cm6 {

    /* renamed from: a */
    public final Object f82a = new Object();

    /* renamed from: b */
    public final ExecutorService f83b = Executors.newFixedThreadPool(4, new C0015a());

    /* renamed from: c */
    public volatile Handler f84c;

    /* renamed from: aa1$a */
    /* compiled from: DefaultTaskExecutor */
    public class C0015a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f85a = new AtomicInteger(0);

        public C0015a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f85a.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: e */
    public static Handler m166e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    /* renamed from: a */
    public void mo133a(Runnable runnable) {
        this.f83b.execute(runnable);
    }

    /* renamed from: c */
    public boolean mo134c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo135d(Runnable runnable) {
        if (this.f84c == null) {
            synchronized (this.f82a) {
                if (this.f84c == null) {
                    this.f84c = m166e(Looper.getMainLooper());
                }
            }
        }
        this.f84c.post(runnable);
    }
}
