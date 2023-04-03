package p000;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rv0 */
/* compiled from: CrashlyticsUncaughtExceptionHandler */
public class rv0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final C6458a f33604a;

    /* renamed from: b */
    public final az5 f33605b;

    /* renamed from: c */
    public final Thread.UncaughtExceptionHandler f33606c;

    /* renamed from: d */
    public final AtomicBoolean f33607d = new AtomicBoolean(false);

    /* renamed from: rv0$a */
    /* compiled from: CrashlyticsUncaughtExceptionHandler */
    public interface C6458a {
        /* renamed from: a */
        void mo47510a(az5 az5, Thread thread, Throwable th);
    }

    public rv0(C6458a aVar, az5 az5, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f33604a = aVar;
        this.f33605b = az5;
        this.f33606c = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    public boolean mo47508a() {
        return this.f33607d.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f33607d.set(true);
        if (thread == null) {
            try {
                rk3.m51112f().mo47425d("Could not handle uncaught exception; null thread");
            } catch (Exception e) {
                rk3.m51112f().mo47426e("An error occurred in the uncaught exception handler", e);
            } catch (Throwable th2) {
                rk3.m51112f().mo47423b("Completed exception processing. Invoking default exception handler.");
                this.f33606c.uncaughtException(thread, th);
                this.f33607d.set(false);
                throw th2;
            }
        } else if (th == null) {
            rk3.m51112f().mo47425d("Could not handle uncaught exception; null throwable");
        } else {
            this.f33604a.mo47510a(this.f33605b, thread, th);
        }
        rk3.m51112f().mo47423b("Completed exception processing. Invoking default exception handler.");
        this.f33606c.uncaughtException(thread, th);
        this.f33607d.set(false);
    }
}
