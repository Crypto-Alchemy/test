package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1 */
/* compiled from: specialBuiltinMembers.kt */
public final class C7444xdb572182 extends Lambda implements rc2<CallableMemberDescriptor, Boolean> {
    public static final C7444xdb572182 INSTANCE = new C7444xdb572182();

    public C7444xdb572182() {
        super(1);
    }

    public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(callableMemberDescriptor, "it");
        return Boolean.valueOf((callableMemberDescriptor instanceof C7425c) && BuiltinMethodsWithSpecialGenericSignature.f39394n.mo53430j(callableMemberDescriptor));
    }
}
