package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: ct7 */
public final class ct7 extends WeakReference<Throwable> {

    /* renamed from: a */
    public final int f27950a;

    public ct7(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f27950a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == ct7.class) {
            if (this == obj) {
                return true;
            }
            ct7 ct7 = (ct7) obj;
            return this.f27950a == ct7.f27950a && get() == ct7.get();
        }
    }

    public final int hashCode() {
        return this.f27950a;
    }
}
