package p000;

import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* renamed from: vl0 */
/* compiled from: CompanionObjectMappingUtils.kt */
public final class vl0 {
    /* renamed from: a */
    public static final boolean m73288a(ul0 ul0, if0 if0) {
        nf0 nf0;
        vx2.m53591g(ul0, "<this>");
        vx2.m53591g(if0, "classDescriptor");
        if (dd1.m56832x(if0)) {
            Set<nf0> b = ul0.mo66304b();
            nf0 g = DescriptorUtilsKt.m62446g(if0);
            if (g != null) {
                nf0 = g.mo62677g();
            } else {
                nf0 = null;
            }
            if (CollectionsKt___CollectionsKt.m47320R(b, nf0)) {
                return true;
            }
        }
        return false;
    }
}
