package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: g96 */
/* compiled from: StatefulRunnable */
public abstract class g96<T> implements Runnable {

    /* renamed from: a */
    public final AtomicInteger f12208a = new AtomicInteger(0);

    /* renamed from: a */
    public void mo20438a() {
        if (this.f12208a.compareAndSet(0, 2)) {
            mo19821d();
        }
    }

    /* renamed from: b */
    public abstract void mo13406b(T t);

    /* renamed from: c */
    public abstract T mo13407c() throws Exception;

    /* renamed from: d */
    public abstract void mo19821d();

    /* renamed from: e */
    public abstract void mo19822e(Exception exc);

    /* renamed from: f */
    public abstract void mo19452f(T t);

    public final void run() {
        if (this.f12208a.compareAndSet(0, 1)) {
            try {
                Object c = mo13407c();
                this.f12208a.set(3);
                try {
                    mo19452f(c);
                } finally {
                    mo13406b(c);
                }
            } catch (Exception e) {
                this.f12208a.set(4);
                mo19822e(e);
            }
        }
    }
}
