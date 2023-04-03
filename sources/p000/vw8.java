package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vw8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class vw8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f35184a;

    /* renamed from: d */
    public final /* synthetic */ sx8 f35185d;

    public vw8(sx8 sx8, AtomicReference atomicReference) {
        this.f35185d = sx8;
        this.f35184a = atomicReference;
    }

    public final void run() {
        synchronized (this.f35184a) {
            try {
                this.f35184a.set(Long.valueOf(this.f35185d.f34342a.mo45274y().mo45993p(this.f35185d.f34342a.mo45258c().mo41979m(), rl8.f33471N)));
                this.f35184a.notify();
            } catch (Throwable th) {
                this.f35184a.notify();
                throw th;
            }
        }
    }
}
