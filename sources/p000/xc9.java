package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: xc9 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class xc9 extends WeakReference<Throwable> {

    /* renamed from: a */
    public final int f35603a;

    public xc9(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f35603a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == xc9.class) {
            if (this == obj) {
                return true;
            }
            xc9 xc9 = (xc9) obj;
            if (this.f35603a == xc9.f35603a && get() == xc9.get()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f35603a;
    }
}
