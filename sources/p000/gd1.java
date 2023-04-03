package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* renamed from: gd1 */
/* compiled from: DescriptorsJvmAbiUtil */
public final class gd1 {
    /* renamed from: a */
    public static /* synthetic */ void m58103a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static boolean m58104b(CallableMemberDescriptor callableMemberDescriptor) {
        g02 r0;
        if (callableMemberDescriptor == null) {
            m58103a(3);
        }
        if (!(callableMemberDescriptor instanceof fx4) || (r0 = ((fx4) callableMemberDescriptor).mo51770r0()) == null || !r0.getAnnotations().mo51224C0(r73.f44295b)) {
            return callableMemberDescriptor.getAnnotations().mo51224C0(r73.f44295b);
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m58105c(d31 d31) {
        if (d31 == null) {
            m58103a(1);
        }
        if (!dd1.m56832x(d31) || !dd1.m56831w(d31.mo51119b()) || m58106d((if0) d31)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m58106d(if0 if0) {
        if (if0 == null) {
            m58103a(2);
        }
        return vl0.m73288a(ul0.f45107a, if0);
    }

    /* renamed from: e */
    public static boolean m58107e(fx4 fx4) {
        if (fx4 == null) {
            m58103a(0);
        }
        if (fx4.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return false;
        }
        if (m58105c(fx4.mo51119b())) {
            return true;
        }
        if (!dd1.m56832x(fx4.mo51119b()) || !m58104b(fx4)) {
            return false;
        }
        return true;
    }
}
