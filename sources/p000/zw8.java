package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zw8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class zw8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f36288a;

    /* renamed from: d */
    public final /* synthetic */ sx8 f36289d;

    public zw8(sx8 sx8, AtomicReference atomicReference) {
        this.f36289d = sx8;
        this.f36288a = atomicReference;
    }

    public final void run() {
        synchronized (this.f36288a) {
            try {
                this.f36288a.set(Double.valueOf(this.f36289d.f34342a.mo45274y().mo45996u(this.f36289d.f34342a.mo45258c().mo41979m(), rl8.f33473P)));
                this.f36288a.notify();
            } catch (Throwable th) {
                this.f36288a.notify();
                throw th;
            }
        }
    }
}
