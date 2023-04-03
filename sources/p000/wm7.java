package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: wm7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class wm7 {
    /* renamed from: a */
    public static /* synthetic */ boolean m73690a(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
