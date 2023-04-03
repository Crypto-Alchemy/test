package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* compiled from: ClassicBuiltinSpecialProperties.kt */
public final class ClassicBuiltinSpecialProperties {

    /* renamed from: a */
    public static final ClassicBuiltinSpecialProperties f39395a = new ClassicBuiltinSpecialProperties();

    /* renamed from: a */
    public final String mo53434a(CallableMemberDescriptor callableMemberDescriptor) {
        r24 r24;
        vx2.m53591g(callableMemberDescriptor, "<this>");
        C7389b.m60130f0(callableMemberDescriptor);
        CallableMemberDescriptor c = DescriptorUtilsKt.m62442c(DescriptorUtilsKt.m62454o(callableMemberDescriptor), false, C7445xccd5eab2.INSTANCE, 1, (Object) null);
        if (c == null || (r24 = o50.f43586a.mo62833a().get(DescriptorUtilsKt.m62447h(c))) == null) {
            return null;
        }
        return r24.mo65594d();
    }

    /* renamed from: b */
    public final boolean mo53435b(CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(callableMemberDescriptor, "callableMemberDescriptor");
        if (!o50.f43586a.mo62836d().contains(callableMemberDescriptor.getName())) {
            return false;
        }
        return mo53436c(callableMemberDescriptor);
    }

    /* renamed from: c */
    public final boolean mo53436c(CallableMemberDescriptor callableMemberDescriptor) {
        if (CollectionsKt___CollectionsKt.m47320R(o50.f43586a.mo62835c(), DescriptorUtilsKt.m62443d(callableMemberDescriptor)) && callableMemberDescriptor.mo51763f().isEmpty()) {
            return true;
        }
        if (!C7389b.m60130f0(callableMemberDescriptor)) {
            return false;
        }
        Collection<? extends CallableMemberDescriptor> d = callableMemberDescriptor.mo51659d();
        vx2.m53590f(d, "overriddenDescriptors");
        if (!d.isEmpty()) {
            for (CallableMemberDescriptor callableMemberDescriptor2 : d) {
                ClassicBuiltinSpecialProperties classicBuiltinSpecialProperties = f39395a;
                vx2.m53590f(callableMemberDescriptor2, "it");
                if (classicBuiltinSpecialProperties.mo53435b(callableMemberDescriptor2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
