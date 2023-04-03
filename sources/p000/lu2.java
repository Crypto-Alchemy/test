package p000;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* renamed from: lu2 */
/* compiled from: inlineClassManglingRules.kt */
public final class lu2 {
    /* renamed from: a */
    public static final boolean m64006a(if0 if0) {
        return vx2.m53586b(DescriptorUtilsKt.m62447h(if0), C7395c.f39109n);
    }

    /* renamed from: b */
    public static final boolean m64007b(d31 d31) {
        vx2.m53591g(d31, "<this>");
        if (!nu2.m70090b(d31) || m64006a((if0) d31)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m64008c(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        eg0 d = xc3.mo51134H0().mo51180d();
        if (d == null || !m64007b(d)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m64009d(xc3 xc3) {
        a17 a17;
        eg0 d = xc3.mo51134H0().mo51180d();
        if (d instanceof a17) {
            a17 = (a17) d;
        } else {
            a17 = null;
        }
        if (a17 == null) {
            return false;
        }
        return m64010e(TypeUtilsKt.m62953i(a17));
    }

    /* renamed from: e */
    public static final boolean m64010e(xc3 xc3) {
        if (m64008c(xc3) || m64009d(xc3)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m64011f(CallableMemberDescriptor callableMemberDescriptor) {
        ef0 ef0;
        vx2.m53591g(callableMemberDescriptor, "descriptor");
        if (callableMemberDescriptor instanceof ef0) {
            ef0 = (ef0) callableMemberDescriptor;
        } else {
            ef0 = null;
        }
        if (ef0 == null || ed1.m57282g(ef0.getVisibility())) {
            return false;
        }
        if0 X = ef0.mo51658X();
        vx2.m53590f(X, "constructorDescriptor.constructedClass");
        if (nu2.m70090b(X) || dd1.m56802G(ef0.mo51658X())) {
            return false;
        }
        List<n87> f = ef0.mo51763f();
        vx2.m53590f(f, "constructorDescriptor.valueParameters");
        if ((f instanceof Collection) && f.isEmpty()) {
            return false;
        }
        for (n87 type : f) {
            xc3 type2 = type.getType();
            vx2.m53590f(type2, "it.type");
            if (m64010e(type2)) {
                return true;
            }
        }
        return false;
    }
}
