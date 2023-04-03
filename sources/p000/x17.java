package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* renamed from: x17 */
/* compiled from: TypeUtils */
public class x17 {

    /* renamed from: a */
    public static final d36 f45834a = nr1.m70033d(ErrorTypeKind.DONT_CARE, new String[0]);

    /* renamed from: b */
    public static final d36 f45835b = nr1.m70033d(ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* renamed from: c */
    public static final d36 f45836c = new C9582a("NO_EXPECTED_TYPE");

    /* renamed from: d */
    public static final d36 f45837d = new C9582a("UNIT_EXPECTED_TYPE");

    /* renamed from: x17$a */
    /* compiled from: TypeUtils */
    public static class C9582a extends ub1 {

        /* renamed from: d */
        public final String f45838d;

        public C9582a(String str) {
            this.f45838d = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0044  */
        /* renamed from: T0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ void m73839T0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L_0x0009
                if (r9 == r0) goto L_0x0009
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L_0x000b
            L_0x0009:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            L_0x000b:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L_0x0013
                if (r9 == r0) goto L_0x0013
                r5 = r3
                goto L_0x0014
            L_0x0013:
                r5 = r4
            L_0x0014:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L_0x0030
                if (r9 == r4) goto L_0x002b
                if (r9 == r3) goto L_0x0026
                if (r9 == r0) goto L_0x0030
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L_0x0032
            L_0x0026:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L_0x0032
            L_0x002b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L_0x0032
            L_0x0030:
                r5[r7] = r6
            L_0x0032:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L_0x003e
                if (r9 == r0) goto L_0x003b
                r5[r1] = r6
                goto L_0x0042
            L_0x003b:
                r5[r1] = r7
                goto L_0x0042
            L_0x003e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L_0x0042:
                if (r9 == r1) goto L_0x0056
                if (r9 == r4) goto L_0x0052
                if (r9 == r3) goto L_0x004f
                if (r9 == r0) goto L_0x0056
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L_0x0056
            L_0x004f:
                r5[r4] = r7
                goto L_0x0056
            L_0x0052:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L_0x0056:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L_0x0064
                if (r9 == r0) goto L_0x0064
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L_0x0069
            L_0x0064:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L_0x0069:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.x17.C9582a.m73839T0(int):void");
        }

        /* renamed from: O0 */
        public d36 mo51137L0(boolean z) {
            throw new IllegalStateException(this.f45838d);
        }

        /* renamed from: P0 */
        public d36 mo51139N0(rz6 rz6) {
            if (rz6 == null) {
                m73839T0(0);
            }
            throw new IllegalStateException(this.f45838d);
        }

        /* renamed from: Q0 */
        public d36 mo51431Q0() {
            throw new IllegalStateException(this.f45838d);
        }

        /* renamed from: S0 */
        public ub1 mo51432S0(d36 d36) {
            if (d36 == null) {
                m73839T0(2);
            }
            throw new IllegalStateException(this.f45838d);
        }

        /* renamed from: U0 */
        public C9582a mo52116R0(bd3 bd3) {
            if (bd3 == null) {
                m73839T0(3);
            }
            return this;
        }

        public String toString() {
            String str = this.f45838d;
            if (str == null) {
                m73839T0(1);
            }
            return str;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m73817a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 47 || i3 == 52 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 55:
                case 56:
                case 57:
                case 58:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 47 || i3 == 52 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 55:
                case 56:
                case 57:
                case 58:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i3) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 47:
            case 52:
            case 55:
            case 56:
            case 57:
            case 58:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
                objArr[0] = "parameterDescriptor";
                break;
            case 46:
            case 50:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 48:
            case 49:
                objArr[0] = "supertypes";
                break;
            case 51:
            case 54:
                objArr[0] = "expectedType";
                break;
            case 53:
                objArr[0] = "literalTypeConstructor";
                break;
            default:
                objArr[0] = "type";
                break;
        }
        if (i3 != 4) {
            if (i3 != 9) {
                if (i3 == 11 || i3 == 15) {
                    objArr[1] = "makeUnsubstitutedType";
                } else if (i3 == 17) {
                    objArr[1] = "getDefaultTypeProjections";
                } else if (i3 == 19) {
                    objArr[1] = "getImmediateSupertypes";
                } else if (i3 == 26) {
                    objArr[1] = "getAllSupertypes";
                } else if (i3 == 35) {
                    objArr[1] = "substituteProjectionsForParameters";
                } else if (i3 != 47) {
                    if (i3 != 52) {
                        if (!(i3 == 6 || i3 == 7)) {
                            switch (i3) {
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                    break;
                                default:
                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                    break;
                            }
                        }
                    }
                    objArr[1] = "getPrimitiveNumberType";
                } else {
                    objArr[1] = "getDefaultPrimitiveNumberType";
                }
            }
            objArr[1] = "makeNullableIfNeeded";
        } else {
            objArr[1] = "makeNullableAsSpecified";
        }
        switch (i3) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 47:
            case 52:
            case 55:
            case 56:
            case 57:
            case 58:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
                objArr[2] = "makeStarProjection";
                break;
            case 46:
            case 48:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 49:
                objArr[2] = "findByFqName";
                break;
            case 50:
            case 51:
            case 53:
            case 54:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 59:
                objArr[2] = "isTypeParameter";
                break;
            case 60:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 61:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 47 || i3 == 52 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 55:
                case 56:
                case 57:
                case 58:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: b */
    public static boolean m73818b(xc3 xc3) {
        if (xc3 == null) {
            m73817a(28);
        }
        if (xc3.mo51135I0()) {
            return true;
        }
        if (!n42.m64516b(xc3) || !m73818b(n42.m64515a(xc3).mo52400Q0())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m73819c(xc3 xc3, rc2<w47, Boolean> rc2) {
        if (rc2 == null) {
            m73817a(43);
        }
        return m73820d(xc3, rc2, (w46<xc3>) null);
    }

    /* renamed from: d */
    public static boolean m73820d(xc3 xc3, rc2<w47, Boolean> rc2, w46<xc3> w46) {
        i42 i42;
        if (rc2 == null) {
            m73817a(44);
        }
        if (xc3 == null) {
            return false;
        }
        w47 K0 = xc3.mo64506K0();
        if (m73838v(xc3)) {
            return rc2.invoke(K0).booleanValue();
        }
        if (w46 != null && w46.contains(xc3)) {
            return false;
        }
        if (rc2.invoke(K0).booleanValue()) {
            return true;
        }
        if (w46 == null) {
            w46 = w46.m73463e();
        }
        w46.add(xc3);
        if (K0 instanceof i42) {
            i42 = (i42) K0;
        } else {
            i42 = null;
        }
        if (i42 != null && (m73820d(i42.mo52399P0(), rc2, w46) || m73820d(i42.mo52400Q0(), rc2, w46))) {
            return true;
        }
        if ((K0 instanceof eb1) && m73820d(((eb1) K0).mo51433T0(), rc2, w46)) {
            return true;
        }
        yz6 H0 = xc3.mo51134H0();
        if (H0 instanceof IntersectionTypeConstructor) {
            for (xc3 d : ((IntersectionTypeConstructor) H0).mo51811g()) {
                if (m73820d(d, rc2, w46)) {
                    return true;
                }
            }
            return false;
        }
        for (f17 next : xc3.mo51132F0()) {
            if (!next.mo51408b()) {
                if (m73820d(next.getType(), rc2, w46)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public static xc3 m73821e(xc3 xc3, xc3 xc32, TypeSubstitutor typeSubstitutor) {
        if (xc3 == null) {
            m73817a(20);
        }
        if (xc32 == null) {
            m73817a(21);
        }
        if (typeSubstitutor == null) {
            m73817a(22);
        }
        xc3 p = typeSubstitutor.mo55339p(xc32, Variance.INVARIANT);
        if (p != null) {
            return m73833q(p, xc3.mo51135I0());
        }
        return null;
    }

    /* renamed from: f */
    public static if0 m73822f(xc3 xc3) {
        if (xc3 == null) {
            m73817a(30);
        }
        eg0 d = xc3.mo51134H0().mo51180d();
        if (d instanceof if0) {
            return (if0) d;
        }
        return null;
    }

    /* renamed from: g */
    public static List<f17> m73823g(List<a17> list) {
        if (list == null) {
            m73817a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (a17 n : list) {
            arrayList.add(new h17(n.mo51464n()));
        }
        List<f17> K0 = CollectionsKt___CollectionsKt.m47311K0(arrayList);
        if (K0 == null) {
            m73817a(17);
        }
        return K0;
    }

    /* renamed from: h */
    public static List<xc3> m73824h(xc3 xc3) {
        if (xc3 == null) {
            m73817a(18);
        }
        TypeSubstitutor f = TypeSubstitutor.m62901f(xc3);
        Collection<xc3> g = xc3.mo51134H0().mo51811g();
        ArrayList arrayList = new ArrayList(g.size());
        for (xc3 e : g) {
            xc3 e2 = m73821e(xc3, e, f);
            if (e2 != null) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public static a17 m73825i(xc3 xc3) {
        if (xc3 == null) {
            m73817a(62);
        }
        if (xc3.mo51134H0().mo51180d() instanceof a17) {
            return (a17) xc3.mo51134H0().mo51180d();
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m73826j(xc3 xc3) {
        if (xc3 == null) {
            m73817a(29);
        }
        if (xc3.mo51134H0().mo51180d() instanceof if0) {
            return false;
        }
        for (xc3 l : m73824h(xc3)) {
            if (m73828l(l)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m73827k(xc3 xc3) {
        if (xc3 == null || xc3.mo51134H0() != f45834a.mo51134H0()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m73828l(xc3 xc3) {
        if (xc3 == null) {
            m73817a(27);
        }
        if (xc3.mo51135I0()) {
            return true;
        }
        if (n42.m64516b(xc3) && m73828l(n42.m64515a(xc3).mo52400Q0())) {
            return true;
        }
        if (o66.m70163c(xc3)) {
            return false;
        }
        if (m73829m(xc3)) {
            return m73826j(xc3);
        }
        if (xc3 instanceof C7120g7) {
            a17 b = ((C7120g7) xc3).mo51871Q0().mo56374b();
            if (b == null || m73826j(b.mo51464n())) {
                return true;
            }
            return false;
        }
        yz6 H0 = xc3.mo51134H0();
        if (H0 instanceof IntersectionTypeConstructor) {
            for (xc3 l : H0.mo51811g()) {
                if (m73828l(l)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m73829m(xc3 xc3) {
        if (xc3 == null) {
            m73817a(59);
        }
        if (m73825i(xc3) != null || (xc3.mo51134H0() instanceof n64)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static xc3 m73830n(xc3 xc3) {
        if (xc3 == null) {
            m73817a(2);
        }
        return m73832p(xc3, false);
    }

    /* renamed from: o */
    public static xc3 m73831o(xc3 xc3) {
        if (xc3 == null) {
            m73817a(1);
        }
        return m73832p(xc3, true);
    }

    /* renamed from: p */
    public static xc3 m73832p(xc3 xc3, boolean z) {
        if (xc3 == null) {
            m73817a(3);
        }
        w47 L0 = xc3.mo64506K0().mo51137L0(z);
        if (L0 == null) {
            m73817a(4);
        }
        return L0;
    }

    /* renamed from: q */
    public static xc3 m73833q(xc3 xc3, boolean z) {
        if (xc3 == null) {
            m73817a(8);
        }
        if (z) {
            return m73831o(xc3);
        }
        if (xc3 == null) {
            m73817a(9);
        }
        return xc3;
    }

    /* renamed from: r */
    public static d36 m73834r(d36 d36, boolean z) {
        if (d36 == null) {
            m73817a(5);
        }
        if (z) {
            d36 O0 = d36.mo51121O0(true);
            if (O0 == null) {
                m73817a(6);
            }
            return O0;
        }
        if (d36 == null) {
            m73817a(7);
        }
        return d36;
    }

    /* renamed from: s */
    public static f17 m73835s(a17 a17) {
        if (a17 == null) {
            m73817a(45);
        }
        return new StarProjectionImpl(a17);
    }

    /* renamed from: t */
    public static d36 m73836t(eg0 eg0, MemberScope memberScope, rc2<bd3, d36> rc2) {
        if (!nr1.m70034m(eg0)) {
            return m73837u(eg0.mo50046g(), memberScope, rc2);
        }
        lr1 d = nr1.m70033d(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, eg0.toString());
        if (d == null) {
            m73817a(11);
        }
        return d;
    }

    /* renamed from: u */
    public static d36 m73837u(yz6 yz6, MemberScope memberScope, rc2<bd3, d36> rc2) {
        if (yz6 == null) {
            m73817a(12);
        }
        if (memberScope == null) {
            m73817a(13);
        }
        if (rc2 == null) {
            m73817a(14);
        }
        d36 k = KotlinTypeFactory.m62855k(rz6.f44504d.mo65783h(), yz6, m73823g(yz6.getParameters()), false, memberScope, rc2);
        if (k == null) {
            m73817a(15);
        }
        return k;
    }

    /* renamed from: v */
    public static boolean m73838v(xc3 xc3) {
        if (xc3 == null) {
            m73817a(0);
        }
        if (xc3 == f45836c || xc3 == f45837d) {
            return true;
        }
        return false;
    }
}
