package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: zp8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class zp8 extends WeakReference<Throwable> {

    /* renamed from: a */
    public final int f36213a;

    public zp8(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f36213a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == zp8.class) {
            if (this == obj) {
                return true;
            }
            zp8 zp8 = (zp8) obj;
            if (this.f36213a == zp8.f36213a && get() == zp8.get()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f36213a;
    }
}
