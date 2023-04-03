package p000;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: dd1 */
/* compiled from: DescriptorUtils */
public class dd1 {

    /* renamed from: a */
    public static final u82 f37273a = new u82("kotlin.jvm.JvmName");

    /* renamed from: A */
    public static boolean m56796A(d31 d31) {
        return m56799D(d31, ClassKind.ENUM_CLASS);
    }

    /* renamed from: B */
    public static boolean m56797B(d31 d31) {
        if (d31 == null) {
            m56809a(36);
        }
        return m56799D(d31, ClassKind.ENUM_ENTRY);
    }

    /* renamed from: C */
    public static boolean m56798C(d31 d31) {
        return m56799D(d31, ClassKind.INTERFACE);
    }

    /* renamed from: D */
    public static boolean m56799D(d31 d31, ClassKind classKind) {
        if (classKind == null) {
            m56809a(37);
        }
        if (!(d31 instanceof if0) || ((if0) d31).getKind() != classKind) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public static boolean m56800E(d31 d31) {
        if (d31 == null) {
            m56809a(1);
        }
        while (d31 != null) {
            if (m56829u(d31) || m56833y(d31)) {
                return true;
            }
            d31 = d31.mo51119b();
        }
        return false;
    }

    /* renamed from: F */
    public static boolean m56801F(xc3 xc3, d31 d31) {
        if (xc3 == null) {
            m56809a(30);
        }
        if (d31 == null) {
            m56809a(31);
        }
        eg0 d = xc3.mo51134H0().mo51180d();
        if (d == null) {
            return false;
        }
        d31 a = d.mo50045a();
        if (!(a instanceof eg0) || !(d31 instanceof eg0) || !((eg0) d31).mo50046g().equals(((eg0) a).mo50046g())) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public static boolean m56802G(d31 d31) {
        if ((m56799D(d31, ClassKind.CLASS) || m56799D(d31, ClassKind.INTERFACE)) && ((if0) d31).mo51326p() == Modality.SEALED) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m56803H(if0 if0, if0 if02) {
        if (if0 == null) {
            m56809a(28);
        }
        if (if02 == null) {
            m56809a(29);
        }
        return m56804I(if0.mo51464n(), if02.mo50045a());
    }

    /* renamed from: I */
    public static boolean m56804I(xc3 xc3, d31 d31) {
        if (xc3 == null) {
            m56809a(32);
        }
        if (d31 == null) {
            m56809a(33);
        }
        if (m56801F(xc3, d31)) {
            return true;
        }
        for (xc3 I : xc3.mo51134H0().mo51811g()) {
            if (m56804I(I, d31)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public static boolean m56805J(d31 d31) {
        if (d31 == null || !(d31.mo51119b() instanceof fk4)) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public static boolean m56806K(o87 o87, xc3 xc3) {
        if (o87 == null) {
            m56809a(63);
        }
        if (xc3 == null) {
            m56809a(64);
        }
        if (o87.mo51761I() || zc3.m74855a(xc3)) {
            return false;
        }
        if (x17.m73818b(xc3)) {
            return true;
        }
        C7389b f = DescriptorUtilsKt.m62445f(o87);
        if (!C7389b.m60142r0(xc3)) {
            yc3 yc3 = yc3.f46193a;
            if (!yc3.mo55822b(f.mo53162W(), xc3) && !yc3.mo55822b(f.mo53153K().mo51464n(), xc3) && !yc3.mo55822b(f.mo53169i(), xc3) && !s47.m71878d(xc3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: L */
    public static <D extends CallableMemberDescriptor> D m56807L(D d) {
        if (d == null) {
            m56809a(59);
        }
        while (d.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            Collection d2 = d.mo51659d();
            if (!d2.isEmpty()) {
                d = (CallableMemberDescriptor) d2.iterator().next();
            } else {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d);
            }
        }
        return d;
    }

    /* renamed from: M */
    public static <D extends k31> D m56808M(D d) {
        if (d == null) {
            m56809a(61);
        }
        if (d instanceof CallableMemberDescriptor) {
            return m56807L((CallableMemberDescriptor) d);
        }
        if (d == null) {
            m56809a(62);
        }
        return d;
    }

    /* renamed from: a */
    public static /* synthetic */ void m56809a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 79:
            case 92:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 64:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 65:
            case 66:
            case 67:
            case 74:
            case 75:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 63:
                objArr[0] = "variable";
                break;
            case 68:
                objArr[0] = "f";
                break;
            case 70:
                objArr[0] = "current";
                break;
            case 71:
                objArr[0] = "result";
                break;
            case 72:
                objArr[0] = "memberDescriptor";
                break;
            case 76:
            case 77:
            case 78:
                objArr[0] = "annotated";
                break;
            case 82:
            case 84:
            case 87:
            case 89:
                objArr[0] = "scope";
                break;
            case 85:
            case 88:
            case 90:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 73:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 80:
            case 81:
                objArr[1] = "getContainingSourceFile";
                break;
            case 83:
                objArr[1] = "getAllDescriptors";
                break;
            case 86:
                objArr[1] = "getFunctionByName";
                break;
            case 91:
                objArr[1] = "getPropertyByName";
                break;
            case 93:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 63:
            case 64:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 65:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 66:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 67:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 70:
            case 71:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 72:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 74:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 75:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 76:
                objArr[2] = "getJvmName";
                break;
            case 77:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 78:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 79:
                objArr[2] = "getContainingSourceFile";
                break;
            case 82:
                objArr[2] = "getAllDescriptors";
                break;
            case 84:
            case 85:
                objArr[2] = "getFunctionByName";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 89:
            case 90:
                objArr[2] = "getPropertyByName";
                break;
            case 92:
                objArr[2] = "getDirectMember";
                break;
            case 94:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: b */
    public static boolean m56810b(d31 d31, d31 d312) {
        if (d31 == null) {
            m56809a(16);
        }
        if (d312 == null) {
            m56809a(17);
        }
        return m56815g(d31).equals(m56815g(d312));
    }

    /* renamed from: c */
    public static <D extends C7420a> void m56811c(D d, Set<D> set) {
        if (d == null) {
            m56809a(70);
        }
        if (set == null) {
            m56809a(71);
        }
        if (!set.contains(d)) {
            for (C7420a a : d.mo50045a().mo51659d()) {
                C7420a a2 = a.mo50045a();
                m56811c(a2, set);
                set.add(a2);
            }
        }
    }

    /* renamed from: d */
    public static <D extends C7420a> Set<D> m56812d(D d) {
        if (d == null) {
            m56809a(68);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m56811c(d.mo50045a(), linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: e */
    public static if0 m56813e(xc3 xc3) {
        if (xc3 == null) {
            m56809a(45);
        }
        return m56814f(xc3.mo51134H0());
    }

    /* renamed from: f */
    public static if0 m56814f(yz6 yz6) {
        if (yz6 == null) {
            m56809a(46);
        }
        if0 if0 = (if0) yz6.mo51180d();
        if (if0 == null) {
            m56809a(47);
        }
        return if0;
    }

    /* renamed from: g */
    public static mx3 m56815g(d31 d31) {
        if (d31 == null) {
            m56809a(21);
        }
        mx3 h = m56816h(d31);
        if (h == null) {
            m56809a(22);
        }
        return h;
    }

    /* renamed from: h */
    public static mx3 m56816h(d31 d31) {
        if (d31 == null) {
            m56809a(23);
        }
        while (d31 != null) {
            if (d31 instanceof mx3) {
                return (mx3) d31;
            }
            if (d31 instanceof tk4) {
                return ((tk4) d31).getModule();
            }
            d31 = d31.mo51119b();
        }
        return null;
    }

    /* renamed from: i */
    public static mx3 m56817i(xc3 xc3) {
        if (xc3 == null) {
            m56809a(20);
        }
        eg0 d = xc3.mo51134H0().mo51180d();
        if (d == null) {
            return null;
        }
        return m56816h(d);
    }

    /* renamed from: j */
    public static b66 m56818j(d31 d31) {
        if (d31 == null) {
            m56809a(79);
        }
        if (d31 instanceof lx4) {
            d31 = ((lx4) d31).mo51316R();
        }
        if (d31 instanceof j31) {
            b66 b = ((j31) d31).getSource().mo50072b();
            if (b == null) {
                m56809a(80);
            }
            return b;
        }
        b66 b66 = b66.f36690a;
        if (b66 == null) {
            m56809a(81);
        }
        return b66;
    }

    /* renamed from: k */
    public static fd1 m56819k(if0 if0, boolean z) {
        if (if0 == null) {
            m56809a(48);
        }
        ClassKind kind = if0.getKind();
        if (kind == ClassKind.ENUM_CLASS || kind.isSingleton()) {
            fd1 fd1 = ed1.f37506a;
            if (fd1 == null) {
                m56809a(49);
            }
            return fd1;
        } else if (m56802G(if0)) {
            if (z) {
                fd1 fd12 = ed1.f37508c;
                if (fd12 == null) {
                    m56809a(50);
                }
                return fd12;
            }
            fd1 fd13 = ed1.f37506a;
            if (fd13 == null) {
                m56809a(51);
            }
            return fd13;
        } else if (m56829u(if0)) {
            fd1 fd14 = ed1.f37517l;
            if (fd14 == null) {
                m56809a(52);
            }
            return fd14;
        } else {
            fd1 fd15 = ed1.f37510e;
            if (fd15 == null) {
                m56809a(53);
            }
            return fd15;
        }
    }

    /* renamed from: l */
    public static h85 m56820l(d31 d31) {
        if (d31 == null) {
            m56809a(0);
        }
        if (d31 instanceof if0) {
            return ((if0) d31).mo52460D0();
        }
        return null;
    }

    /* renamed from: m */
    public static v82 m56821m(d31 d31) {
        if (d31 == null) {
            m56809a(2);
        }
        u82 o = m56823o(d31);
        if (o != null) {
            return o.mo66205j();
        }
        return m56824p(d31);
    }

    /* renamed from: n */
    public static u82 m56822n(d31 d31) {
        if (d31 == null) {
            m56809a(3);
        }
        u82 o = m56823o(d31);
        if (o == null) {
            o = m56824p(d31).mo66454l();
        }
        if (o == null) {
            m56809a(4);
        }
        return o;
    }

    /* renamed from: o */
    public static u82 m56823o(d31 d31) {
        if (d31 == null) {
            m56809a(5);
        }
        if ((d31 instanceof mx3) || nr1.m70034m(d31)) {
            return u82.f44926c;
        }
        if (d31 instanceof tk4) {
            return ((tk4) d31).mo53283e();
        }
        if (d31 instanceof fk4) {
            return ((fk4) d31).mo51711e();
        }
        return null;
    }

    /* renamed from: p */
    public static v82 m56824p(d31 d31) {
        if (d31 == null) {
            m56809a(6);
        }
        v82 c = m56821m(d31.mo51119b()).mo66443c(d31.getName());
        if (c == null) {
            m56809a(7);
        }
        return c;
    }

    /* renamed from: q */
    public static <D extends d31> D m56825q(d31 d31, Class<D> cls) {
        if (cls == null) {
            m56809a(18);
        }
        return m56826r(d31, cls, true);
    }

    /* renamed from: r */
    public static <D extends d31> D m56826r(D d, Class<D> cls, boolean z) {
        if (cls == null) {
            m56809a(19);
        }
        if (d == null) {
            return null;
        }
        if (z) {
            d = d.mo51119b();
        }
        while (d != null) {
            if (cls.isInstance(d)) {
                return d;
            }
            d = d.mo51119b();
        }
        return null;
    }

    /* renamed from: s */
    public static if0 m56827s(if0 if0) {
        if (if0 == null) {
            m56809a(44);
        }
        for (xc3 e : if0.mo50046g().mo51811g()) {
            if0 e2 = m56813e(e);
            if (e2.getKind() != ClassKind.INTERFACE) {
                return e2;
            }
        }
        return null;
    }

    /* renamed from: t */
    public static boolean m56828t(d31 d31) {
        return m56799D(d31, ClassKind.ANNOTATION_CLASS);
    }

    /* renamed from: u */
    public static boolean m56829u(d31 d31) {
        if (d31 == null) {
            m56809a(34);
        }
        if (!m56830v(d31) || !d31.getName().equals(n66.f41103b)) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static boolean m56830v(d31 d31) {
        return m56799D(d31, ClassKind.CLASS);
    }

    /* renamed from: w */
    public static boolean m56831w(d31 d31) {
        if (m56830v(d31) || m56796A(d31)) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static boolean m56832x(d31 d31) {
        if (!m56799D(d31, ClassKind.OBJECT) || !((if0) d31).mo52345V()) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public static boolean m56833y(d31 d31) {
        if (!(d31 instanceof k31) || ((k31) d31).getVisibility() != ed1.f37511f) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public static boolean m56834z(if0 if0, if0 if02) {
        if (if0 == null) {
            m56809a(26);
        }
        if (if02 == null) {
            m56809a(27);
        }
        for (xc3 F : if0.mo50046g().mo51811g()) {
            if (m56801F(F, if02.mo50045a())) {
                return true;
            }
        }
        return false;
    }
}
