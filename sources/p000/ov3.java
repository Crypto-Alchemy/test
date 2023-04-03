package p000;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p000.j83;

/* renamed from: ov3 */
/* compiled from: methodSignatureMapping.kt */
public final class ov3 {
    /* renamed from: a */
    public static final void m70791a(StringBuilder sb, xc3 xc3) {
        sb.append(m70797g(xc3));
    }

    /* renamed from: b */
    public static final String m70792b(C7425c cVar, boolean z, boolean z2) {
        String str;
        vx2.m53591g(cVar, "<this>");
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (cVar instanceof C7424b) {
                str = "<init>";
            } else {
                str = cVar.getName().mo65594d();
                vx2.m53590f(str, "name.asString()");
            }
            sb.append(str);
        }
        sb.append("(");
        h85 J = cVar.mo51315J();
        if (J != null) {
            xc3 type = J.getType();
            vx2.m53590f(type, "it.type");
            m70791a(sb, type);
        }
        for (n87 type2 : cVar.mo51763f()) {
            xc3 type3 = type2.getType();
            vx2.m53590f(type3, "parameter.type");
            m70791a(sb, type3);
        }
        sb.append(")");
        if (z) {
            if (vc1.m73182c(cVar)) {
                sb.append("V");
            } else {
                xc3 returnType = cVar.getReturnType();
                vx2.m53588d(returnType);
                m70791a(sb, returnType);
            }
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: c */
    public static /* synthetic */ String m70793c(C7425c cVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return m70792b(cVar, z, z2);
    }

    /* renamed from: d */
    public static final String m70794d(C7420a aVar) {
        if0 if0;
        C7428e eVar;
        vx2.m53591g(aVar, "<this>");
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f39611a;
        if (dd1.m56800E(aVar)) {
            return null;
        }
        d31 b = aVar.mo51119b();
        if (b instanceof if0) {
            if0 = (if0) b;
        } else {
            if0 = null;
        }
        if (if0 == null || if0.getName().mo65599i()) {
            return null;
        }
        C7420a a = aVar.mo50045a();
        if (a instanceof C7428e) {
            eVar = (C7428e) a;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return null;
        }
        return nv3.m70094a(signatureBuildingComponents, if0, m70793c(eVar, false, false, 3, (Object) null));
    }

    /* renamed from: e */
    public static final boolean m70795e(C7420a aVar) {
        j83.C7256d dVar;
        C7425c k;
        vx2.m53591g(aVar, "f");
        if (!(aVar instanceof C7425c)) {
            return false;
        }
        C7425c cVar = (C7425c) aVar;
        if (!vx2.m53586b(cVar.getName().mo65594d(), "remove") || cVar.mo51763f().size() != 1 || SpecialBuiltinMembers.m60685h((CallableMemberDescriptor) aVar)) {
            return false;
        }
        List<n87> f = cVar.mo50045a().mo51763f();
        vx2.m53590f(f, "f.original.valueParameters");
        xc3 type = ((n87) CollectionsKt___CollectionsKt.m47355z0(f)).getType();
        vx2.m53590f(type, "f.original.valueParameters.single().type");
        j83 g = m70797g(type);
        JvmPrimitiveType jvmPrimitiveType = null;
        if (g instanceof j83.C7256d) {
            dVar = (j83.C7256d) g;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            jvmPrimitiveType = dVar.mo52650i();
        }
        if (jvmPrimitiveType != JvmPrimitiveType.INT || (k = BuiltinMethodsWithSpecialGenericSignature.m60658k(cVar)) == null) {
            return false;
        }
        List<n87> f2 = k.mo50045a().mo51763f();
        vx2.m53590f(f2, "overridden.original.valueParameters");
        xc3 type2 = ((n87) CollectionsKt___CollectionsKt.m47355z0(f2)).getType();
        vx2.m53590f(type2, "overridden.original.valueParameters.single().type");
        j83 g2 = m70797g(type2);
        d31 b = k.mo51119b();
        vx2.m53590f(b, "overridden.containingDeclaration");
        if (!vx2.m53586b(DescriptorUtilsKt.m62448i(b), C7395c.C7396a.f39161c0.mo66205j()) || !(g2 instanceof j83.C7255c) || !vx2.m53586b(((j83.C7255c) g2).mo52649i(), "java/lang/Object")) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final String m70796f(if0 if0) {
        vx2.m53591g(if0, "<this>");
        c23 c23 = c23.f37039a;
        v82 j = DescriptorUtilsKt.m62447h(if0).mo66205j();
        vx2.m53590f(j, "fqNameSafe.toUnsafe()");
        nf0 n = c23.mo50793n(j);
        if (n == null) {
            return vc1.m73181b(if0, (v07) null, 2, (Object) null);
        }
        String f = y73.m74291b(n).mo67043f();
        vx2.m53590f(f, "byClassId(it).internalName");
        return f;
    }

    /* renamed from: g */
    public static final j83 m70797g(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        return (j83) vc1.m73184e(xc3, l83.f40589a, x07.f45812o, w07.f45412a, (z73) null, (id2) null, 32, (Object) null);
    }
}
