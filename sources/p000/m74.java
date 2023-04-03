package p000;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p000.de0;

/* renamed from: m74 */
/* compiled from: modifierChecks.kt */
public final class m74 implements de0 {

    /* renamed from: a */
    public static final m74 f40801a = new m74();

    /* renamed from: b */
    public static final String f40802b = "should not have varargs or parameters with default values";

    /* renamed from: a */
    public String mo51175a(C7425c cVar) {
        return de0.C6971a.m56837a(this, cVar);
    }

    /* renamed from: b */
    public boolean mo51176b(C7425c cVar) {
        boolean z;
        vx2.m53591g(cVar, "functionDescriptor");
        List<n87> f = cVar.mo51763f();
        vx2.m53590f(f, "functionDescriptor.valueParameters");
        if (!(f instanceof Collection) || !f.isEmpty()) {
            for (n87 n87 : f) {
                vx2.m53590f(n87, "it");
                if (DescriptorUtilsKt.m62440a(n87) || n87.mo53317q0() != null) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public String getDescription() {
        return f40802b;
    }
}
