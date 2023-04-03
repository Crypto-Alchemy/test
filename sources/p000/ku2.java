package p000;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a6\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\b\u001a\u00020\u0005*\u00020\u0003H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\f\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0012\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t*\u00020\rH\u0000\u001a\u0014\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t*\u0004\u0018\u00010\u000fH\u0000\u001a\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\"\u001a\u0010\u0015\u001a\u0004\u0018\u00010\r*\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, mo44877d2 = {"Ljava/lang/reflect/Member;", "M", "Lu90;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "", "isDefault", "b", "g", "Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "f", "d", "Lxc3;", "i", "Ld31;", "h", "", "a", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ku2 */
/* compiled from: InlineClassAwareCaller.kt */
public final class ku2 {
    /* renamed from: a */
    public static final Object m63613a(Object obj, CallableMemberDescriptor callableMemberDescriptor) {
        xc3 e;
        Class<?> i;
        Method f;
        vx2.m53591g(callableMemberDescriptor, "descriptor");
        if (((callableMemberDescriptor instanceof fx4) && nu2.m70092d((o87) callableMemberDescriptor)) || (e = m63617e(callableMemberDescriptor)) == null || (i = m63621i(e)) == null || (f = m63618f(i, callableMemberDescriptor)) == null) {
            return obj;
        }
        return f.invoke(obj, new Object[0]);
    }

    /* renamed from: b */
    public static final <M extends Member> u90<M> m63614b(u90<? extends M> u90, CallableMemberDescriptor callableMemberDescriptor, boolean z) {
        boolean z2;
        boolean z3;
        vx2.m53591g(u90, "<this>");
        vx2.m53591g(callableMemberDescriptor, "descriptor");
        boolean z4 = true;
        if (!nu2.m70089a(callableMemberDescriptor)) {
            List<n87> f = callableMemberDescriptor.mo51763f();
            vx2.m53590f(f, "descriptor.valueParameters");
            if (!(f instanceof Collection) || !f.isEmpty()) {
                Iterator<T> it = f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    xc3 type = ((n87) it.next()).getType();
                    vx2.m53590f(type, "it.type");
                    if (nu2.m70091c(type)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                xc3 returnType = callableMemberDescriptor.getReturnType();
                if (returnType == null || !nu2.m70091c(returnType)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3 && ((u90 instanceof x30) || !m63619g(callableMemberDescriptor))) {
                    z4 = false;
                }
            }
        }
        if (z4) {
            return new ju2(callableMemberDescriptor, u90, z);
        }
        return u90;
    }

    /* renamed from: c */
    public static /* synthetic */ u90 m63615c(u90 u90, CallableMemberDescriptor callableMemberDescriptor, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m63614b(u90, callableMemberDescriptor, z);
    }

    /* renamed from: d */
    public static final Method m63616d(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(cls, "<this>");
        vx2.m53591g(callableMemberDescriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", new Class[]{m63618f(cls, callableMemberDescriptor).getReturnType()});
            vx2.m53590f(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No box method found in inline class: " + cls + " (calling " + callableMemberDescriptor + ')');
        }
    }

    /* renamed from: e */
    public static final xc3 m63617e(CallableMemberDescriptor callableMemberDescriptor) {
        if0 if0;
        h85 J = callableMemberDescriptor.mo51315J();
        h85 G = callableMemberDescriptor.mo51311G();
        if (J != null) {
            return J.getType();
        }
        if (G == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof C7424b) {
            return G.getType();
        }
        d31 b = callableMemberDescriptor.mo51119b();
        if (b instanceof if0) {
            if0 = (if0) b;
        } else {
            if0 = null;
        }
        if (if0 != null) {
            return if0.mo51464n();
        }
        return null;
    }

    /* renamed from: f */
    public static final Method m63618f(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(cls, "<this>");
        vx2.m53591g(callableMemberDescriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            vx2.m53590f(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + callableMemberDescriptor + ')');
        }
    }

    /* renamed from: g */
    public static final boolean m63619g(CallableMemberDescriptor callableMemberDescriptor) {
        xc3 e = m63617e(callableMemberDescriptor);
        if (e == null || !nu2.m70091c(e)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static final Class<?> m63620h(d31 d31) {
        if (!(d31 instanceof if0) || !nu2.m70090b(d31)) {
            return null;
        }
        if0 if0 = (if0) d31;
        Class<?> p = y67.m74286p(if0);
        if (p != null) {
            return p;
        }
        throw new KotlinReflectionInternalError("Class object for the class " + if0.getName() + " cannot be found (classId=" + DescriptorUtilsKt.m62446g((eg0) d31) + ')');
    }

    /* renamed from: i */
    public static final Class<?> m63621i(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        Class<?> h = m63620h(xc3.mo51134H0().mo51180d());
        if (h == null) {
            return null;
        }
        if (!x17.m73828l(xc3)) {
            return h;
        }
        xc3 e = nu2.m70093e(xc3);
        if (e != null && !x17.m73828l(e) && !C7389b.m60142r0(e)) {
            return h;
        }
        return null;
    }
}
