package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xw8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class xw8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f35714a;

    /* renamed from: d */
    public final /* synthetic */ sx8 f35715d;

    public xw8(sx8 sx8, AtomicReference atomicReference) {
        this.f35715d = sx8;
        this.f35714a = atomicReference;
    }

    public final void run() {
        synchronized (this.f35714a) {
            try {
                this.f35714a.set(Integer.valueOf(this.f35715d.f34342a.mo45274y().mo45994r(this.f35715d.f34342a.mo45258c().mo41979m(), rl8.f33472O)));
                this.f35714a.notify();
            } catch (Throwable th) {
                this.f35714a.notify();
                throw th;
            }
        }
    }
}
