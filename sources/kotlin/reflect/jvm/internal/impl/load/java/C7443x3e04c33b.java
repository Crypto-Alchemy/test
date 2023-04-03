package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getOverriddenBuiltinFunctionWithErasedValueParametersInJava$1 */
/* compiled from: specialBuiltinMembers.kt */
public final class C7443x3e04c33b extends Lambda implements rc2<CallableMemberDescriptor, Boolean> {
    public static final C7443x3e04c33b INSTANCE = new C7443x3e04c33b();

    public C7443x3e04c33b() {
        super(1);
    }

    public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(callableMemberDescriptor, "it");
        return Boolean.valueOf(BuiltinMethodsWithSpecialGenericSignature.f39394n.mo53430j(callableMemberDescriptor));
    }
}
