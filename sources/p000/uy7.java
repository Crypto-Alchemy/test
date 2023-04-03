package p000;

import java.util.concurrent.locks.Lock;

/* renamed from: uy7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class uy7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ vy7 f34756a;

    public /* synthetic */ uy7(vy7 vy7, ty7 ty7) {
        this.f34756a = vy7;
    }

    /* renamed from: a */
    public abstract void mo46266a();

    public final void run() {
        Lock y;
        this.f34756a.f35194b.lock();
        try {
            if (Thread.interrupted()) {
                y = this.f34756a.f35194b;
            } else {
                mo46266a();
                y = this.f34756a.f35194b;
            }
        } catch (RuntimeException e) {
            this.f34756a.f35193a.mo45940m(e);
            y = this.f34756a.f35194b;
        } catch (Throwable th) {
            this.f34756a.f35194b.unlock();
            throw th;
        }
        y.unlock();
    }
}
