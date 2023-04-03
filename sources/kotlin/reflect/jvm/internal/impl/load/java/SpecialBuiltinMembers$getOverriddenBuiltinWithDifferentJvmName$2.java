package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: specialBuiltinMembers.kt */
public final class SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2 extends Lambda implements rc2<CallableMemberDescriptor, Boolean> {
    public static final SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2 INSTANCE = new SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2();

    public SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2() {
        super(1);
    }

    public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(callableMemberDescriptor, "it");
        return Boolean.valueOf(BuiltinMethodsWithDifferentJvmName.f39393n.mo53427j((C7428e) callableMemberDescriptor));
    }
}
