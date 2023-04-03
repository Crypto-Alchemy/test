package p000;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.util.Checks;
import p000.ee0;

/* renamed from: n6 */
/* compiled from: modifierChecks.kt */
public abstract class C7928n6 {
    /* renamed from: a */
    public final ee0 mo56356a(C7425c cVar) {
        vx2.m53591g(cVar, "functionDescriptor");
        for (Checks next : mo55390b()) {
            if (next.mo55386b(cVar)) {
                return next.mo55385a(cVar);
            }
        }
        return ee0.C7042a.f37524b;
    }

    /* renamed from: b */
    public abstract List<Checks> mo55390b();
}
