package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sw8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class sw8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f34041a;

    /* renamed from: d */
    public final /* synthetic */ sx8 f34042d;

    public sw8(sx8 sx8, AtomicReference atomicReference) {
        this.f34042d = sx8;
        this.f34041a = atomicReference;
    }

    public final void run() {
        synchronized (this.f34041a) {
            try {
                this.f34041a.set(this.f34042d.f34342a.mo45274y().mo45992o(this.f34042d.f34342a.mo45258c().mo41979m(), rl8.f33470M));
                this.f34041a.notify();
            } catch (Throwable th) {
                this.f34041a.notify();
                throw th;
            }
        }
    }
}
