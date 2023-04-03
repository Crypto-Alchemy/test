package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;

/* renamed from: by2 */
/* compiled from: InvalidModuleException.kt */
public final class by2 {

    /* renamed from: a */
    public static final hx3<cy2> f37020a = new hx3<>("InvalidModuleNotifier");

    /* renamed from: a */
    public static final void m56239a(mx3 mx3) {
        r37 r37;
        vx2.m53591g(mx3, "<this>");
        cy2 cy2 = (cy2) mx3.mo51537l0(f37020a);
        if (cy2 != null) {
            cy2.mo51017a(mx3);
            r37 = r37.f33317a;
        } else {
            r37 = null;
        }
        if (r37 == null) {
            throw new InvalidModuleException("Accessing invalid module descriptor " + mx3);
        }
    }
}
