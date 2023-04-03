package p000;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.web3j.ens.contracts.generated.ENS;
import p000.C6983dm;

/* renamed from: wc1 */
/* compiled from: DescriptorFactory */
public class wc1 {

    /* renamed from: wc1$a */
    /* compiled from: DescriptorFactory */
    public static class C9515a extends ff0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9515a(if0 if0, a66 a66, boolean z) {
            super(if0, (C7424b) null, C6983dm.f37317b.mo51228b(), true, CallableMemberDescriptor.Kind.DECLARATION, a66);
            if (if0 == null) {
                m73557Q(0);
            }
            if (a66 == null) {
                m73557Q(1);
            }
            mo51665k1(Collections.emptyList(), dd1.m56819k(if0, z));
        }

        /* renamed from: Q */
        public static /* synthetic */ void m73557Q(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m73541a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 12 || i == 23 || i == 25) ? 2 : 3)];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 30:
            case 32:
            case 34:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
                objArr[0] = "enumClass";
                break;
            case 26:
            case 27:
            case 28:
                objArr[0] = "descriptor";
                break;
            case 29:
            case 31:
            case 33:
                objArr[0] = ENS.FUNC_OWNER;
                break;
            default:
                objArr[0] = "propertyDescriptor";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 27:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 28:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 29:
            case 30:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 31:
            case 32:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 33:
            case 34:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 12 || i == 23 || i == 25) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static h85 m73542b(C7420a aVar, xc3 xc3, C6983dm dmVar) {
        if (aVar == null) {
            m73541a(31);
        }
        if (dmVar == null) {
            m73541a(32);
        }
        if (xc3 == null) {
            return null;
        }
        return new i85(aVar, new fs0(aVar, xc3, (j85) null), dmVar);
    }

    /* renamed from: c */
    public static h85 m73543c(if0 if0, xc3 xc3, C6983dm dmVar) {
        if (if0 == null) {
            m73541a(33);
        }
        if (dmVar == null) {
            m73541a(34);
        }
        if (xc3 == null) {
            return null;
        }
        return new i85(if0, new yr0(if0, xc3, (j85) null), dmVar);
    }

    /* renamed from: d */
    public static jx4 m73544d(fx4 fx4, C6983dm dmVar) {
        if (fx4 == null) {
            m73541a(13);
        }
        if (dmVar == null) {
            m73541a(14);
        }
        return m73549i(fx4, dmVar, true, false, false);
    }

    /* renamed from: e */
    public static mx4 m73545e(fx4 fx4, C6983dm dmVar, C6983dm dmVar2) {
        if (fx4 == null) {
            m73541a(0);
        }
        if (dmVar == null) {
            m73541a(1);
        }
        if (dmVar2 == null) {
            m73541a(2);
        }
        return m73553m(fx4, dmVar, dmVar2, true, false, false, fx4.getSource());
    }

    /* renamed from: f */
    public static C7428e m73546f(if0 if0) {
        if0 if02 = if0;
        if (if02 == null) {
            m73541a(24);
        }
        C6983dm.C6984a aVar = C6983dm.f37317b;
        h26 f1 = h26.m58388f1(if02, aVar.mo51228b(), C7395c.f39100e, CallableMemberDescriptor.Kind.SYNTHESIZED, if0.getSource());
        h26 h26 = f1;
        h26 h1 = h26.mo52098L0((h85) null, (h85) null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new ValueParameterDescriptorImpl(f1, (n87) null, 0, aVar.mo51228b(), r24.m71445h("value"), DescriptorUtilsKt.m62445f(if0).mo53162W(), false, false, false, (xc3) null, if0.getSource())), if0.mo51464n(), Modality.FINAL, ed1.f37510e);
        if (h1 == null) {
            m73541a(25);
        }
        return h1;
    }

    /* renamed from: g */
    public static C7428e m73547g(if0 if0) {
        if (if0 == null) {
            m73541a(22);
        }
        h26 h1 = h26.m58388f1(if0, C6983dm.f37317b.mo51228b(), C7395c.f39099d, CallableMemberDescriptor.Kind.SYNTHESIZED, if0.getSource()).mo52098L0((h85) null, (h85) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), DescriptorUtilsKt.m62445f(if0).mo53172l(Variance.INVARIANT, if0.mo51464n()), Modality.FINAL, ed1.f37510e);
        if (h1 == null) {
            m73541a(23);
        }
        return h1;
    }

    /* renamed from: h */
    public static h85 m73548h(C7420a aVar, xc3 xc3, C6983dm dmVar) {
        if (aVar == null) {
            m73541a(29);
        }
        if (dmVar == null) {
            m73541a(30);
        }
        if (xc3 == null) {
            return null;
        }
        return new i85(aVar, new vx1(aVar, xc3, (j85) null), dmVar);
    }

    /* renamed from: i */
    public static jx4 m73549i(fx4 fx4, C6983dm dmVar, boolean z, boolean z2, boolean z3) {
        if (fx4 == null) {
            m73541a(15);
        }
        if (dmVar == null) {
            m73541a(16);
        }
        return m73550j(fx4, dmVar, z, z2, z3, fx4.getSource());
    }

    /* renamed from: j */
    public static jx4 m73550j(fx4 fx4, C6983dm dmVar, boolean z, boolean z2, boolean z3, a66 a66) {
        if (fx4 == null) {
            m73541a(17);
        }
        if (dmVar == null) {
            m73541a(18);
        }
        if (a66 == null) {
            m73541a(19);
        }
        return new jx4(fx4, dmVar, fx4.mo51326p(), fx4.getVisibility(), z, z2, z3, CallableMemberDescriptor.Kind.DECLARATION, (ix4) null, a66);
    }

    /* renamed from: k */
    public static ff0 m73551k(if0 if0, a66 a66) {
        if (if0 == null) {
            m73541a(20);
        }
        if (a66 == null) {
            m73541a(21);
        }
        return new C9515a(if0, a66, false);
    }

    /* renamed from: l */
    public static mx4 m73552l(fx4 fx4, C6983dm dmVar, C6983dm dmVar2, boolean z, boolean z2, boolean z3, fd1 fd1, a66 a66) {
        C6983dm dmVar3 = dmVar2;
        if (fx4 == null) {
            m73541a(7);
        }
        if (dmVar == null) {
            m73541a(8);
        }
        if (dmVar3 == null) {
            m73541a(9);
        }
        if (fd1 == null) {
            m73541a(10);
        }
        if (a66 == null) {
            m73541a(11);
        }
        mx4 mx4 = new mx4(fx4, dmVar, fx4.mo51326p(), fd1, z, z2, z3, CallableMemberDescriptor.Kind.DECLARATION, (lx4) null, a66);
        mx4.mo56333L0(mx4.m64477J0(mx4, fx4.getType(), dmVar2));
        return mx4;
    }

    /* renamed from: m */
    public static mx4 m73553m(fx4 fx4, C6983dm dmVar, C6983dm dmVar2, boolean z, boolean z2, boolean z3, a66 a66) {
        if (fx4 == null) {
            m73541a(3);
        }
        if (dmVar == null) {
            m73541a(4);
        }
        if (dmVar2 == null) {
            m73541a(5);
        }
        if (a66 == null) {
            m73541a(6);
        }
        return m73552l(fx4, dmVar, dmVar2, z, z2, z3, fx4.getVisibility(), a66);
    }

    /* renamed from: n */
    public static boolean m73554n(C7425c cVar) {
        if (cVar == null) {
            m73541a(28);
        }
        if (cVar.getKind() != CallableMemberDescriptor.Kind.SYNTHESIZED || !dd1.m56796A(cVar.mo51119b())) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static boolean m73555o(C7425c cVar) {
        if (cVar == null) {
            m73541a(27);
        }
        if (!cVar.getName().equals(C7395c.f39100e) || !m73554n(cVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static boolean m73556p(C7425c cVar) {
        if (cVar == null) {
            m73541a(26);
        }
        if (!cVar.getName().equals(C7395c.f39099d) || !m73554n(cVar)) {
            return false;
        }
        return true;
    }
}
