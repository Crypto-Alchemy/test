package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: dz8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class dz8 extends WeakReference<Throwable> {

    /* renamed from: a */
    public final int f28356a;

    public dz8(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f28356a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == dz8.class) {
            if (this == obj) {
                return true;
            }
            dz8 dz8 = (dz8) obj;
            if (this.f28356a == dz8.f28356a && get() == dz8.get()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28356a;
    }
}
