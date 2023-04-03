package p000;

/* renamed from: cm6 */
/* compiled from: TaskExecutor */
public abstract class cm6 {
    /* renamed from: a */
    public abstract void mo133a(Runnable runnable);

    /* renamed from: b */
    public void mo12124b(Runnable runnable) {
        if (mo134c()) {
            runnable.run();
        } else {
            mo135d(runnable);
        }
    }

    /* renamed from: c */
    public abstract boolean mo134c();

    /* renamed from: d */
    public abstract void mo135d(Runnable runnable);
}
