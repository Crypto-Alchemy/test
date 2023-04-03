package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName$isBuiltinFunctionWithDifferentNameInJvm$1 */
/* compiled from: specialBuiltinMembers.kt */
public final class C7442x6ce919c0 extends Lambda implements rc2<CallableMemberDescriptor, Boolean> {
    public final /* synthetic */ C7428e $functionDescriptor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7442x6ce919c0(C7428e eVar) {
        super(1);
        this.$functionDescriptor = eVar;
    }

    public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(callableMemberDescriptor, "it");
        return Boolean.valueOf(SpecialGenericSignatures.f39411a.mo53468j().containsKey(ov3.m70794d(this.$functionDescriptor)));
    }
}
