package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* compiled from: specialBuiltinMembers.kt */
public final class SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1 extends Lambda implements rc2<CallableMemberDescriptor, Boolean> {
    public static final SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1 INSTANCE = new SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1();

    public SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1() {
        super(1);
    }

    public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(callableMemberDescriptor, "it");
        return Boolean.valueOf(ClassicBuiltinSpecialProperties.f39395a.mo53435b(DescriptorUtilsKt.m62454o(callableMemberDescriptor)));
    }
}
