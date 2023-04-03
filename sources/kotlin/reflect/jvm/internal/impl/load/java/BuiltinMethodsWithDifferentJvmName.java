package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* compiled from: specialBuiltinMembers.kt */
public final class BuiltinMethodsWithDifferentJvmName extends SpecialGenericSignatures {

    /* renamed from: n */
    public static final BuiltinMethodsWithDifferentJvmName f39393n = new BuiltinMethodsWithDifferentJvmName();

    /* renamed from: i */
    public final r24 mo53426i(C7428e eVar) {
        vx2.m53591g(eVar, "functionDescriptor");
        Map<String, r24> j = SpecialGenericSignatures.f39411a.mo53468j();
        String d = ov3.m70794d(eVar);
        if (d == null) {
            return null;
        }
        return j.get(d);
    }

    /* renamed from: j */
    public final boolean mo53427j(C7428e eVar) {
        vx2.m53591g(eVar, "functionDescriptor");
        if (!C7389b.m60130f0(eVar) || DescriptorUtilsKt.m62442c(eVar, false, new C7442x6ce919c0(eVar), 1, (Object) null) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo53428k(C7428e eVar) {
        vx2.m53591g(eVar, "<this>");
        if (!vx2.m53586b(eVar.getName().mo65594d(), "removeAt") || !vx2.m53586b(ov3.m70794d(eVar), SpecialGenericSignatures.f39411a.mo53466h().mo53473b())) {
            return false;
        }
        return true;
    }
}
