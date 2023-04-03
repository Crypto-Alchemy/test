package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: f6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2265f6 {
    /* renamed from: a */
    public static /* synthetic */ boolean m16607a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
