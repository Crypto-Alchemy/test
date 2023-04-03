package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7427d;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.web3j.ens.contracts.generated.PublicResolver;

/* compiled from: specialBuiltinMembers.kt */
public final class SpecialBuiltinMembers {
    /* renamed from: a */
    public static final boolean m60678a(CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(callableMemberDescriptor, "<this>");
        if (m60681d(callableMemberDescriptor) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final String m60679b(CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor o;
        r24 i;
        vx2.m53591g(callableMemberDescriptor, "callableMemberDescriptor");
        CallableMemberDescriptor c = m60680c(callableMemberDescriptor);
        if (c == null || (o = DescriptorUtilsKt.m62454o(c)) == null) {
            return null;
        }
        if (o instanceof fx4) {
            return ClassicBuiltinSpecialProperties.f39395a.mo53434a(o);
        }
        if (!(o instanceof C7428e) || (i = BuiltinMethodsWithDifferentJvmName.f39393n.mo53426i((C7428e) o)) == null) {
            return null;
        }
        return i.mo65594d();
    }

    /* renamed from: c */
    public static final CallableMemberDescriptor m60680c(CallableMemberDescriptor callableMemberDescriptor) {
        if (C7389b.m60130f0(callableMemberDescriptor)) {
            return m60681d(callableMemberDescriptor);
        }
        return null;
    }

    /* renamed from: d */
    public static final <T extends CallableMemberDescriptor> T m60681d(T t) {
        boolean z;
        vx2.m53591g(t, "<this>");
        if (!SpecialGenericSignatures.f39411a.mo53465g().contains(t.getName()) && !o50.f43586a.mo62836d().contains(DescriptorUtilsKt.m62454o(t).getName())) {
            return null;
        }
        if (t instanceof fx4) {
            z = true;
        } else {
            z = t instanceof C7427d;
        }
        if (z) {
            return DescriptorUtilsKt.m62442c(t, false, SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1.INSTANCE, 1, (Object) null);
        }
        if (t instanceof C7428e) {
            return DescriptorUtilsKt.m62442c(t, false, SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2.INSTANCE, 1, (Object) null);
        }
        return null;
    }

    /* renamed from: e */
    public static final <T extends CallableMemberDescriptor> T m60682e(T t) {
        vx2.m53591g(t, "<this>");
        T d = m60681d(t);
        if (d != null) {
            return d;
        }
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.f39394n;
        r24 name = t.getName();
        vx2.m53590f(name, PublicResolver.FUNC_NAME);
        if (!builtinMethodsWithSpecialGenericSignature.mo53431l(name)) {
            return null;
        }
        return DescriptorUtilsKt.m62442c(t, false, SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2.INSTANCE, 1, (Object) null);
    }

    /* renamed from: f */
    public static final boolean m60683f(if0 if0, C7420a aVar) {
        vx2.m53591g(if0, "<this>");
        vx2.m53591g(aVar, "specialCallableDescriptor");
        d31 b = aVar.mo51119b();
        vx2.m53589e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        d36 n = ((if0) b).mo51464n();
        vx2.m53590f(n, "specialCallableDescripto…ssDescriptor).defaultType");
        if0 s = dd1.m56827s(if0);
        while (true) {
            boolean z = false;
            if (s == null) {
                return false;
            }
            if (!(s instanceof s03)) {
                if (vz6.m73397b(s.mo51464n(), n) != null) {
                    z = true;
                }
                if (z) {
                    return !C7389b.m60130f0(s);
                }
            }
            s = dd1.m56827s(s);
        }
    }

    /* renamed from: g */
    public static final boolean m60684g(CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(callableMemberDescriptor, "<this>");
        return DescriptorUtilsKt.m62454o(callableMemberDescriptor).mo51119b() instanceof s03;
    }

    /* renamed from: h */
    public static final boolean m60685h(CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(callableMemberDescriptor, "<this>");
        if (m60684g(callableMemberDescriptor) || C7389b.m60130f0(callableMemberDescriptor)) {
            return true;
        }
        return false;
    }
}
