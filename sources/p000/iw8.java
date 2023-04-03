package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: iw8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class iw8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f30144a;

    /* renamed from: d */
    public final /* synthetic */ sx8 f30145d;

    public iw8(sx8 sx8, AtomicReference atomicReference) {
        this.f30145d = sx8;
        this.f30144a = atomicReference;
    }

    public final void run() {
        synchronized (this.f30144a) {
            try {
                this.f30144a.set(Boolean.valueOf(this.f30145d.f34342a.mo45274y().mo45997v(this.f30145d.f34342a.mo45258c().mo41979m(), rl8.f33469L)));
                this.f30144a.notify();
            } catch (Throwable th) {
                this.f30144a.notify();
                throw th;
            }
        }
    }
}
