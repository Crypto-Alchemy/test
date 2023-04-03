package p000;

/* renamed from: lo0 */
/* compiled from: ConditionVariable */
public class lo0 {

    /* renamed from: a */
    public final dh0 f14616a;

    /* renamed from: b */
    public boolean f14617b;

    public lo0() {
        this(dh0.f10712a);
    }

    /* renamed from: a */
    public synchronized void mo22884a() throws InterruptedException {
        while (!this.f14617b) {
            wait();
        }
    }

    /* renamed from: b */
    public synchronized void mo22885b() {
        boolean z = false;
        while (!this.f14617b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public synchronized boolean mo22886c() {
        boolean z;
        z = this.f14617b;
        this.f14617b = false;
        return z;
    }

    /* renamed from: d */
    public synchronized boolean mo22887d() {
        return this.f14617b;
    }

    /* renamed from: e */
    public synchronized boolean mo22888e() {
        if (this.f14617b) {
            return false;
        }
        this.f14617b = true;
        notifyAll();
        return true;
    }

    public lo0(dh0 dh0) {
        this.f14616a = dh0;
    }
}
