package p000;

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: o77 */
/* compiled from: Utils */
public final class o77 {

    /* renamed from: a */
    public static final ExecutorService f32286a = zu1.m55260c("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: o77$a */
    /* compiled from: Utils */
    public class C6306a implements ms0<T, Void> {

        /* renamed from: a */
        public final /* synthetic */ xl6 f32287a;

        public C6306a(xl6 xl6) {
            this.f32287a = xl6;
        }

        /* renamed from: b */
        public Void mo41856a(tl6<T> tl6) throws Exception {
            if (tl6.mo48145p()) {
                this.f32287a.mo49507e(tl6.mo48141l());
                return null;
            }
            this.f32287a.mo49506d(tl6.mo48140k());
            return null;
        }
    }

    /* renamed from: o77$b */
    /* compiled from: Utils */
    public class C6307b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Callable f32288a;

        /* renamed from: d */
        public final /* synthetic */ xl6 f32289d;

        /* renamed from: o77$b$a */
        /* compiled from: Utils */
        public class C6308a implements ms0<T, Void> {
            public C6308a() {
            }

            /* renamed from: b */
            public Void mo41856a(tl6<T> tl6) throws Exception {
                if (tl6.mo48145p()) {
                    C6307b.this.f32289d.mo49505c(tl6.mo48141l());
                    return null;
                }
                C6307b.this.f32289d.mo49504b(tl6.mo48140k());
                return null;
            }
        }

        public C6307b(Callable callable, xl6 xl6) {
            this.f32288a = callable;
            this.f32289d = xl6;
        }

        public void run() {
            try {
                ((tl6) this.f32288a.call()).mo48137h(new C6308a());
            } catch (Exception e) {
                this.f32289d.mo49504b(e);
            }
        }
    }

    /* renamed from: b */
    public static <T> T m49176b(tl6<T> tl6) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        tl6.mo48138i(f32286a, new d77(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (tl6.mo48145p()) {
            return tl6.mo48141l();
        }
        if (tl6.mo48143n()) {
            throw new CancellationException("Task is already canceled");
        } else if (tl6.mo48144o()) {
            throw new IllegalStateException(tl6.mo48140k());
        } else {
            throw new TimeoutException();
        }
    }

    /* renamed from: c */
    public static <T> tl6<T> m49177c(Executor executor, Callable<tl6<T>> callable) {
        xl6 xl6 = new xl6();
        executor.execute(new C6307b(callable, xl6));
        return xl6.mo49503a();
    }

    /* renamed from: e */
    public static <T> tl6<T> m49179e(tl6<T> tl6, tl6<T> tl62) {
        xl6 xl6 = new xl6();
        C6306a aVar = new C6306a(xl6);
        tl6.mo48137h(aVar);
        tl62.mo48137h(aVar);
        return xl6.mo49503a();
    }
}
