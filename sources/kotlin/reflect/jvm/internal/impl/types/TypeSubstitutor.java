package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import org.web3j.ens.contracts.generated.PublicResolver;

public class TypeSubstitutor {

    /* renamed from: b */
    public static final TypeSubstitutor f40287b = m62902g(p17.f43974b);

    /* renamed from: a */
    public final p17 f40288a;

    public static final class SubstitutionException extends Exception {
        public SubstitutionException(String str) {
            super(str);
        }
    }

    public enum VarianceConflictType {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$a */
    public static class C7725a implements rc2<u82, Boolean> {
        /* renamed from: a */
        public static /* synthetic */ void m62917a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{PublicResolver.FUNC_NAME, "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"}));
        }

        /* renamed from: b */
        public Boolean invoke(u82 u82) {
            if (u82 == null) {
                m62917a(0);
            }
            return Boolean.valueOf(!u82.equals(C7395c.C7396a.f39146Q));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$b */
    public static /* synthetic */ class C7726b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40290a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$VarianceConflictType[] r0 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40290a = r0
                kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$VarianceConflictType r1 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.OUT_IN_IN_POSITION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40290a     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$VarianceConflictType r1 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.IN_IN_OUT_POSITION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40290a     // Catch:{ NoSuchFieldError -> 0x0028 }
                kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$VarianceConflictType r1 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.NO_CONFLICT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.C7726b.<clinit>():void");
        }
    }

    public TypeSubstitutor(p17 p17) {
        if (p17 == null) {
            m62896a(7);
        }
        this.f40288a = p17;
    }

    /* renamed from: a */
    public static /* synthetic */ void m62896a(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 1 || i == 2 || i == 8 || i == 34 || i == 37)) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 1 || i == 2 || i == 8 || i == 34 || i == 37)) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
            default:
                objArr[0] = "substitution";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i != 34) {
            if (i != 37) {
                switch (i) {
                    case 11:
                    case 12:
                    case 13:
                        objArr[1] = "safeSubstitute";
                        break;
                    default:
                        switch (i) {
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                objArr[1] = "unsafeSubstitute";
                                break;
                            default:
                                switch (i) {
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                        objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                        break;
                                    default:
                                        switch (i) {
                                            case 40:
                                            case 41:
                                            case 42:
                                                break;
                                            default:
                                                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                break;
                                        }
                                }
                        }
                }
            }
            objArr[1] = "combine";
        } else {
            objArr[1] = "filterOutUnsafeVariance";
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 1 || i == 2 || i == 8 || i == 34 || i == 37)) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            th = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: b */
    public static void m62897b(int i, f17 f17, p17 p17) {
        if (i > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + m62906o(f17) + "; substitution: " + m62906o(p17));
        }
    }

    /* renamed from: c */
    public static Variance m62898c(Variance variance, f17 f17) {
        if (variance == null) {
            m62896a(35);
        }
        if (f17 == null) {
            m62896a(36);
        }
        if (!f17.mo51408b()) {
            return m62899d(variance, f17.mo51409c());
        }
        Variance variance2 = Variance.OUT_VARIANCE;
        if (variance2 == null) {
            m62896a(37);
        }
        return variance2;
    }

    /* renamed from: d */
    public static Variance m62899d(Variance variance, Variance variance2) {
        if (variance == null) {
            m62896a(38);
        }
        if (variance2 == null) {
            m62896a(39);
        }
        Variance variance3 = Variance.INVARIANT;
        if (variance == variance3) {
            if (variance2 == null) {
                m62896a(40);
            }
            return variance2;
        } else if (variance2 == variance3) {
            if (variance == null) {
                m62896a(41);
            }
            return variance;
        } else if (variance == variance2) {
            if (variance2 == null) {
                m62896a(42);
            }
            return variance2;
        } else {
            throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and " + "projection kind '" + variance2 + "' cannot be combined");
        }
    }

    /* renamed from: e */
    public static VarianceConflictType m62900e(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        if (variance == variance3 && variance2 == Variance.OUT_VARIANCE) {
            return VarianceConflictType.OUT_IN_IN_POSITION;
        }
        if (variance == Variance.OUT_VARIANCE && variance2 == variance3) {
            return VarianceConflictType.IN_IN_OUT_POSITION;
        }
        return VarianceConflictType.NO_CONFLICT;
    }

    /* renamed from: f */
    public static TypeSubstitutor m62901f(xc3 xc3) {
        if (xc3 == null) {
            m62896a(6);
        }
        return m62902g(a07.m55336i(xc3.mo51134H0(), xc3.mo51132F0()));
    }

    /* renamed from: g */
    public static TypeSubstitutor m62902g(p17 p17) {
        if (p17 == null) {
            m62896a(0);
        }
        return new TypeSubstitutor(p17);
    }

    /* renamed from: h */
    public static TypeSubstitutor m62903h(p17 p17, p17 p172) {
        if (p17 == null) {
            m62896a(3);
        }
        if (p172 == null) {
            m62896a(4);
        }
        return m62902g(sg1.m71918i(p17, p172));
    }

    /* renamed from: i */
    public static C6983dm m62904i(C6983dm dmVar) {
        if (dmVar == null) {
            m62896a(33);
        }
        if (!dmVar.mo51224C0(C7395c.C7396a.f39146Q)) {
            return dmVar;
        }
        return new s12(dmVar, new C7725a());
    }

    /* renamed from: l */
    public static f17 m62905l(xc3 xc3, f17 f17, a17 a17, f17 f172) {
        if (xc3 == null) {
            m62896a(26);
        }
        if (f17 == null) {
            m62896a(27);
        }
        if (f172 == null) {
            m62896a(28);
        }
        if (!xc3.getAnnotations().mo51224C0(C7395c.C7396a.f39146Q)) {
            if (f17 == null) {
                m62896a(29);
            }
            return f17;
        }
        yz6 H0 = f17.getType().mo51134H0();
        if (!(H0 instanceof NewCapturedTypeConstructor)) {
            return f17;
        }
        f17 c = ((NewCapturedTypeConstructor) H0).mo52887c();
        Variance c2 = c.mo51409c();
        VarianceConflictType e = m62900e(f172.mo51409c(), c2);
        VarianceConflictType varianceConflictType = VarianceConflictType.OUT_IN_IN_POSITION;
        if (e == varianceConflictType) {
            return new h17(c.getType());
        }
        if (a17 != null && m62900e(a17.mo50049j(), c2) == varianceConflictType) {
            return new h17(c.getType());
        }
        return f17;
    }

    /* renamed from: o */
    public static String m62906o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (!nu1.m70087a(th)) {
                return "[Exception while computing toString(): " + th + "]";
            }
            throw th;
        }
    }

    /* renamed from: j */
    public p17 mo55335j() {
        p17 p17 = this.f40288a;
        if (p17 == null) {
            m62896a(8);
        }
        return p17;
    }

    /* renamed from: k */
    public boolean mo55336k() {
        return this.f40288a.mo50031f();
    }

    /* renamed from: m */
    public TypeSubstitutor mo55337m() {
        p17 p17 = this.f40288a;
        if (!(p17 instanceof vt2) || !p17.mo55063b()) {
            return this;
        }
        return new TypeSubstitutor(new vt2(((vt2) this.f40288a).mo66581j(), ((vt2) this.f40288a).mo66580i(), false));
    }

    /* renamed from: n */
    public xc3 mo55338n(xc3 xc3, Variance variance) {
        if (xc3 == null) {
            m62896a(9);
        }
        if (variance == null) {
            m62896a(10);
        }
        if (mo55336k()) {
            if (xc3 == null) {
                m62896a(11);
            }
            return xc3;
        }
        try {
            xc3 type = mo55344u(new h17(variance, xc3), (a17) null, 0).getType();
            if (type == null) {
                m62896a(12);
            }
            return type;
        } catch (SubstitutionException e) {
            lr1 d = nr1.m70033d(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
            if (d == null) {
                m62896a(13);
            }
            return d;
        }
    }

    /* renamed from: p */
    public xc3 mo55339p(xc3 xc3, Variance variance) {
        if (xc3 == null) {
            m62896a(14);
        }
        if (variance == null) {
            m62896a(15);
        }
        f17 q = mo55340q(new h17(variance, mo55335j().mo65208g(xc3, variance)));
        if (q == null) {
            return null;
        }
        return q.getType();
    }

    /* renamed from: q */
    public f17 mo55340q(f17 f17) {
        if (f17 == null) {
            m62896a(16);
        }
        f17 t = mo55343t(f17);
        if (this.f40288a.mo50030a() || this.f40288a.mo55063b()) {
            return CapturedTypeApproximationKt.m62971c(t, this.f40288a.mo55063b());
        }
        return t;
    }

    /* renamed from: r */
    public final f17 mo55341r(f17 f17, int i) throws SubstitutionException {
        xc3 type = f17.getType();
        Variance c = f17.mo51409c();
        if (type.mo51134H0().mo51180d() instanceof a17) {
            return f17;
        }
        xc3 xc3 = null;
        d36 b = o66.m70162b(type);
        if (b != null) {
            xc3 = mo55337m().mo55339p(b, Variance.INVARIANT);
        }
        xc3 b2 = q17.m71166b(type, mo55342s(type.mo51134H0().getParameters(), type.mo51132F0(), i), this.f40288a.mo65207d(type.getAnnotations()));
        if ((b2 instanceof d36) && (xc3 instanceof d36)) {
            b2 = o66.m70170j((d36) b2, (d36) xc3);
        }
        return new h17(c, b2);
    }

    /* renamed from: s */
    public final List<f17> mo55342s(List<a17> list, List<f17> list2, int i) throws SubstitutionException {
        Variance variance;
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            a17 a17 = list.get(i2);
            f17 f17 = list2.get(i2);
            f17 u = mo55344u(f17, a17, i + 1);
            int i3 = C7726b.f40290a[m62900e(a17.mo50049j(), u.mo51409c()).ordinal()];
            if (i3 == 1 || i3 == 2) {
                u = x17.m73835s(a17);
            } else if (i3 == 3 && a17.mo50049j() != (variance = Variance.INVARIANT) && !u.mo51408b()) {
                u = new h17(variance, u.getType());
            }
            if (u != f17) {
                z = true;
            }
            arrayList.add(u);
        }
        if (!z) {
            return list2;
        }
        return arrayList;
    }

    /* renamed from: t */
    public f17 mo55343t(f17 f17) {
        if (f17 == null) {
            m62896a(17);
        }
        if (mo55336k()) {
            return f17;
        }
        try {
            return mo55344u(f17, (a17) null, 0);
        } catch (SubstitutionException unused) {
            return null;
        }
    }

    /* renamed from: u */
    public final f17 mo55344u(f17 f17, a17 a17, int i) throws SubstitutionException {
        f17 f172;
        xc3 xc3;
        if (f17 == null) {
            m62896a(18);
        }
        m62897b(i, f17, this.f40288a);
        if (f17.mo51408b()) {
            return f17;
        }
        xc3 type = f17.getType();
        if (type instanceof b27) {
            b27 b27 = (b27) type;
            w47 A0 = b27.mo50462A0();
            xc3 b0 = b27.mo50463b0();
            f17 u = mo55344u(new h17(f17.mo51409c(), A0), a17, i + 1);
            if (u.mo51408b()) {
                return u;
            }
            return new h17(u.mo51409c(), c27.m56296d(u.getType().mo64506K0(), mo55339p(b0, f17.mo51409c())));
        }
        if (!ql1.m71288a(type) && !(type.mo64506K0() instanceof j75)) {
            f17 e = this.f40288a.mo50024e(type);
            if (e != null) {
                f172 = m62905l(type, e, a17, f17);
            } else {
                f172 = null;
            }
            Variance c = f17.mo51409c();
            if (f172 == null && n42.m64516b(type) && !tz6.m72495b(type)) {
                i42 a = n42.m64515a(type);
                int i2 = i + 1;
                f17 u2 = mo55344u(new h17(c, a.mo52399P0()), a17, i2);
                f17 u3 = mo55344u(new h17(c, a.mo52400Q0()), a17, i2);
                Variance c2 = u2.mo51409c();
                if (u2.getType() == a.mo52399P0() && u3.getType() == a.mo52400Q0()) {
                    return f17;
                }
                return new h17(c2, KotlinTypeFactory.m62849d(q17.m71165a(u2.getType()), q17.m71165a(u3.getType())));
            } else if (!C7389b.m60137m0(type) && !zc3.m74855a(type)) {
                if (f172 != null) {
                    VarianceConflictType e2 = m62900e(c, f172.mo51409c());
                    if (!CapturedTypeConstructorKt.m62412d(type)) {
                        int i3 = C7726b.f40290a[e2.ordinal()];
                        if (i3 == 1) {
                            throw new SubstitutionException("Out-projection in in-position");
                        } else if (i3 == 2) {
                            return new h17(Variance.OUT_VARIANCE, type.mo51134H0().mo51813k().mo53151I());
                        }
                    }
                    zy0 a2 = tz6.m72494a(type);
                    if (f172.mo51408b()) {
                        return f172;
                    }
                    if (a2 != null) {
                        xc3 = a2.mo51430Q(f172.getType());
                    } else {
                        xc3 = x17.m73833q(f172.getType(), type.mo51135I0());
                    }
                    if (!type.getAnnotations().isEmpty()) {
                        xc3 = TypeUtilsKt.m62965u(xc3, new CompositeAnnotations(xc3.getAnnotations(), m62904i(this.f40288a.mo65207d(type.getAnnotations()))));
                    }
                    if (e2 == VarianceConflictType.NO_CONFLICT) {
                        c = m62899d(c, f172.mo51409c());
                    }
                    return new h17(c, xc3);
                }
                f17 = mo55341r(f17, i);
                if (f17 == null) {
                    m62896a(25);
                }
            }
        }
        return f17;
    }
}
