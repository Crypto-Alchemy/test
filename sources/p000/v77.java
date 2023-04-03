package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;

/* renamed from: v77 */
/* compiled from: utils.kt */
public final class v77 {
    /* renamed from: a */
    public static final boolean m73133a(CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(callableMemberDescriptor, "memberDescriptor");
        if (!(callableMemberDescriptor instanceof C7425c) || !vx2.m53586b(callableMemberDescriptor.mo50950p0(JavaMethodDescriptor.f39446u1), Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m73134b(JavaTypeEnhancementState javaTypeEnhancementState) {
        vx2.m53591g(javaTypeEnhancementState, "javaTypeEnhancementState");
        if (javaTypeEnhancementState.mo53440c().invoke(q13.m71162e()) == ReportLevel.STRICT) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final fd1 m73135c(if7 if7) {
        vx2.m53591g(if7, "<this>");
        fd1 g = c13.m56264g(if7);
        vx2.m53590f(g, "toDescriptorVisibility(this)");
        return g;
    }
}
