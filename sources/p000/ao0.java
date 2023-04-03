package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ao0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ao0 {
    /* renamed from: a */
    public static /* synthetic */ boolean m10672a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
