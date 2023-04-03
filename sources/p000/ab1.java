package p000;

import android.os.Looper;

/* renamed from: ab1 */
/* compiled from: DeferredReleaser */
public abstract class ab1 {

    /* renamed from: a */
    public static ab1 f90a;

    /* renamed from: ab1$a */
    /* compiled from: DeferredReleaser */
    public interface C0017a {
        /* renamed from: a */
        void mo140a();
    }

    /* renamed from: b */
    public static synchronized ab1 m175b() {
        ab1 ab1;
        synchronized (ab1.class) {
            if (f90a == null) {
                f90a = new bb1();
            }
            ab1 = f90a;
        }
        return ab1;
    }

    /* renamed from: c */
    public static boolean m176c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo138a(C0017a aVar);

    /* renamed from: d */
    public abstract void mo139d(C0017a aVar);
}
