package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: specialBuiltinMembers.kt */
public final class SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2 extends Lambda implements rc2<CallableMemberDescriptor, Boolean> {
    public static final SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2 INSTANCE = new SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2();

    public SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2() {
        super(1);
    }

    public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(callableMemberDescriptor, "it");
        return Boolean.valueOf(C7389b.m60130f0(callableMemberDescriptor) && BuiltinMethodsWithSpecialGenericSignature.m60659m(callableMemberDescriptor) != null);
    }
}
