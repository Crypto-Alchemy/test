package p000;

import sun.misc.Unsafe;

/* renamed from: fm0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class fm0 {
    /* renamed from: a */
    public static /* synthetic */ boolean m44335a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
