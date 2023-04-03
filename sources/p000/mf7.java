package p000;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* renamed from: mf7 */
/* compiled from: VisibilityUtil.kt */
public final class mf7 {
    /* renamed from: a */
    public static final CallableMemberDescriptor m64318a(Collection<? extends CallableMemberDescriptor> collection) {
        Integer d;
        vx2.m53591g(collection, "descriptors");
        collection.isEmpty();
        CallableMemberDescriptor callableMemberDescriptor = null;
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            if (callableMemberDescriptor == null || ((d = ed1.m57279d(callableMemberDescriptor.getVisibility(), callableMemberDescriptor2.getVisibility())) != null && d.intValue() < 0)) {
                callableMemberDescriptor = callableMemberDescriptor2;
            }
        }
        vx2.m53588d(callableMemberDescriptor);
        return callableMemberDescriptor;
    }
}
