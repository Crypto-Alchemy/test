package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* compiled from: specialBuiltinMembers.kt */
public final class BuiltinMethodsWithSpecialGenericSignature extends SpecialGenericSignatures {

    /* renamed from: n */
    public static final BuiltinMethodsWithSpecialGenericSignature f39394n = new BuiltinMethodsWithSpecialGenericSignature();

    /* renamed from: k */
    public static final C7425c m60658k(C7425c cVar) {
        vx2.m53591g(cVar, "functionDescriptor");
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = f39394n;
        r24 name = cVar.getName();
        vx2.m53590f(name, "functionDescriptor.name");
        if (!builtinMethodsWithSpecialGenericSignature.mo53431l(name)) {
            return null;
        }
        return (C7425c) DescriptorUtilsKt.m62442c(cVar, false, C7443x3e04c33b.INSTANCE, 1, (Object) null);
    }

    /* renamed from: m */
    public static final SpecialGenericSignatures.SpecialSignatureInfo m60659m(CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor c;
        String d;
        vx2.m53591g(callableMemberDescriptor, "<this>");
        SpecialGenericSignatures.C7449a aVar = SpecialGenericSignatures.f39411a;
        if (!aVar.mo53462d().contains(callableMemberDescriptor.getName()) || (c = DescriptorUtilsKt.m62442c(callableMemberDescriptor, false, C7444xdb572182.INSTANCE, 1, (Object) null)) == null || (d = ov3.m70794d(c)) == null) {
            return null;
        }
        return aVar.mo53470l(d);
    }

    /* renamed from: j */
    public final boolean mo53430j(CallableMemberDescriptor callableMemberDescriptor) {
        return CollectionsKt___CollectionsKt.m47320R(SpecialGenericSignatures.f39411a.mo53463e(), ov3.m70794d(callableMemberDescriptor));
    }

    /* renamed from: l */
    public final boolean mo53431l(r24 r24) {
        vx2.m53591g(r24, "<this>");
        return SpecialGenericSignatures.f39411a.mo53462d().contains(r24);
    }
}
