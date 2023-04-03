package p000;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: iv4 */
/* compiled from: PriorityThreadFactory */
public class iv4 implements ThreadFactory {

    /* renamed from: a */
    public final int f13394a;

    /* renamed from: d */
    public final String f13395d;

    /* renamed from: e */
    public final boolean f13396e;

    /* renamed from: g */
    public final AtomicInteger f13397g = new AtomicInteger(1);

    /* renamed from: iv4$a */
    /* compiled from: PriorityThreadFactory */
    public class C2574a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f13398a;

        public C2574a(Runnable runnable) {
            this.f13398a = runnable;
        }

        public void run() {
            try {
                Process.setThreadPriority(iv4.this.f13394a);
            } catch (Throwable unused) {
            }
            this.f13398a.run();
        }
    }

    public iv4(int i, String str, boolean z) {
        this.f13394a = i;
        this.f13395d = str;
        this.f13396e = z;
    }

    public Thread newThread(Runnable runnable) {
        String str;
        C2574a aVar = new C2574a(runnable);
        if (this.f13396e) {
            str = this.f13395d + "-" + this.f13397g.getAndIncrement();
        } else {
            str = this.f13395d;
        }
        return new Thread(aVar, str);
    }
}
