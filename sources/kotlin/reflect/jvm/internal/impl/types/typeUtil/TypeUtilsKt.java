package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: TypeUtils.kt */
public final class TypeUtilsKt {
    /* renamed from: a */
    public static final f17 m62945a(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        return new h17(xc3);
    }

    /* renamed from: b */
    public static final boolean m62946b(xc3 xc3, rc2<? super w47, Boolean> rc2) {
        vx2.m53591g(xc3, "<this>");
        vx2.m53591g(rc2, "predicate");
        return x17.m73819c(xc3, rc2);
    }

    /* renamed from: c */
    public static final boolean m62947c(xc3 xc3, yz6 yz6, Set<? extends a17> set) {
        fg0 fg0;
        List<a17> list;
        a17 a17;
        boolean z;
        boolean z2;
        if (vx2.m53586b(xc3.mo51134H0(), yz6)) {
            return true;
        }
        eg0 d = xc3.mo51134H0().mo51180d();
        if (d instanceof fg0) {
            fg0 = (fg0) d;
        } else {
            fg0 = null;
        }
        if (fg0 != null) {
            list = fg0.mo51670o();
        } else {
            list = null;
        }
        Iterable<wt2<T>> Q0 = CollectionsKt___CollectionsKt.m47319Q0(xc3.mo51132F0());
        if (!(Q0 instanceof Collection) || !((Collection) Q0).isEmpty()) {
            for (wt2 next : Q0) {
                int a = next.mo49263a();
                f17 f17 = (f17) next.mo49264b();
                if (list != null) {
                    a17 = (a17) CollectionsKt___CollectionsKt.m47332c0(list, a);
                } else {
                    a17 = null;
                }
                if (a17 == null || set == null || !set.contains(a17)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z || f17.mo51408b()) {
                    z2 = false;
                    continue;
                } else {
                    xc3 type = f17.getType();
                    vx2.m53590f(type, "argument.type");
                    z2 = m62947c(type, yz6, set);
                    continue;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m62948d(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        return m62946b(xc3, TypeUtilsKt$containsTypeAliasParameters$1.INSTANCE);
    }

    /* renamed from: e */
    public static final f17 m62949e(xc3 xc3, Variance variance, a17 a17) {
        Variance variance2;
        vx2.m53591g(xc3, "type");
        vx2.m53591g(variance, "projectionKind");
        if (a17 != null) {
            variance2 = a17.mo50049j();
        } else {
            variance2 = null;
        }
        if (variance2 == variance) {
            variance = Variance.INVARIANT;
        }
        return new h17(variance, xc3);
    }

    /* renamed from: f */
    public static final Set<a17> m62950f(xc3 xc3, Set<? extends a17> set) {
        vx2.m53591g(xc3, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m62951g(xc3, xc3, linkedHashSet, set);
        return linkedHashSet;
    }

    /* renamed from: g */
    public static final void m62951g(xc3 xc3, xc3 xc32, Set<a17> set, Set<? extends a17> set2) {
        fg0 fg0;
        List<a17> list;
        a17 a17;
        boolean z;
        eg0 d = xc3.mo51134H0().mo51180d();
        if (!(d instanceof a17)) {
            eg0 d2 = xc3.mo51134H0().mo51180d();
            if (d2 instanceof fg0) {
                fg0 = (fg0) d2;
            } else {
                fg0 = null;
            }
            if (fg0 != null) {
                list = fg0.mo51670o();
            } else {
                list = null;
            }
            int i = 0;
            for (f17 next : xc3.mo51132F0()) {
                int i2 = i + 1;
                if (list != null) {
                    a17 = (a17) CollectionsKt___CollectionsKt.m47332c0(list, i);
                } else {
                    a17 = null;
                }
                if (a17 == null || set2 == null || !set2.contains(a17)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z && !next.mo51408b() && !CollectionsKt___CollectionsKt.m47320R(set, next.getType().mo51134H0().mo51180d()) && !vx2.m53586b(next.getType().mo51134H0(), xc32.mo51134H0())) {
                    xc3 type = next.getType();
                    vx2.m53590f(type, "argument.type");
                    m62951g(type, xc32, set, set2);
                }
                i = i2;
            }
        } else if (!vx2.m53586b(xc3.mo51134H0(), xc32.mo51134H0())) {
            set.add(d);
        } else {
            for (xc3 next2 : ((a17) d).getUpperBounds()) {
                vx2.m53590f(next2, "upperBound");
                m62951g(next2, xc32, set, set2);
            }
        }
    }

    /* renamed from: h */
    public static final C7389b m62952h(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        C7389b k = xc3.mo51134H0().mo51813k();
        vx2.m53590f(k, "constructor.builtIns");
        return k;
    }

    /* renamed from: i */
    public static final xc3 m62953i(a17 a17) {
        T t;
        vx2.m53591g(a17, "<this>");
        List<xc3> upperBounds = a17.getUpperBounds();
        vx2.m53590f(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List<xc3> upperBounds2 = a17.getUpperBounds();
        vx2.m53590f(upperBounds2, "upperBounds");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T d = ((xc3) next).mo51134H0().mo51180d();
            if (d instanceof if0) {
                t = (if0) d;
            }
            boolean z = false;
            if (!(t == null || t.getKind() == ClassKind.INTERFACE || t.getKind() == ClassKind.ANNOTATION_CLASS)) {
                z = true;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        xc3 xc3 = (xc3) t;
        if (xc3 != null) {
            return xc3;
        }
        List<xc3> upperBounds3 = a17.getUpperBounds();
        vx2.m53590f(upperBounds3, "upperBounds");
        Object Z = CollectionsKt___CollectionsKt.m47329Z(upperBounds3);
        vx2.m53590f(Z, "upperBounds.first()");
        return (xc3) Z;
    }

    /* renamed from: j */
    public static final boolean m62954j(a17 a17) {
        vx2.m53591g(a17, "typeParameter");
        return m62956l(a17, (yz6) null, (Set) null, 6, (Object) null);
    }

    /* renamed from: k */
    public static final boolean m62955k(a17 a17, yz6 yz6, Set<? extends a17> set) {
        boolean z;
        vx2.m53591g(a17, "typeParameter");
        List<xc3> upperBounds = a17.getUpperBounds();
        vx2.m53590f(upperBounds, "typeParameter.upperBounds");
        if (!(upperBounds instanceof Collection) || !upperBounds.isEmpty()) {
            for (xc3 xc3 : upperBounds) {
                vx2.m53590f(xc3, "upperBound");
                if (!m62947c(xc3, a17.mo51464n().mo51134H0(), set) || (yz6 != null && !vx2.m53586b(xc3.mo51134H0(), yz6))) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: l */
    public static /* synthetic */ boolean m62956l(a17 a17, yz6 yz6, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            yz6 = null;
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return m62955k(a17, yz6, set);
    }

    /* renamed from: m */
    public static final boolean m62957m(xc3 xc3) {
        boolean z;
        vx2.m53591g(xc3, "<this>");
        if (!(xc3 instanceof C7120g7)) {
            if (!(xc3 instanceof eb1) || !(((eb1) xc3).mo51433T0() instanceof C7120g7)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public static final boolean m62958n(xc3 xc3) {
        boolean z;
        vx2.m53591g(xc3, "<this>");
        if (!(xc3 instanceof ec6)) {
            if (!(xc3 instanceof eb1) || !(((eb1) xc3).mo51433T0() instanceof ec6)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public static final boolean m62959o(xc3 xc3, xc3 xc32) {
        vx2.m53591g(xc3, "<this>");
        vx2.m53591g(xc32, "superType");
        return yc3.f46193a.mo55823c(xc3, xc32);
    }

    /* renamed from: p */
    public static final boolean m62960p(eg0 eg0) {
        vx2.m53591g(eg0, "<this>");
        if (!(eg0 instanceof a17) || !(((a17) eg0).mo51119b() instanceof hz6)) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public static final boolean m62961q(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        return x17.m73829m(xc3);
    }

    /* renamed from: r */
    public static final boolean m62962r(xc3 xc3) {
        vx2.m53591g(xc3, "type");
        if (!(xc3 instanceof lr1) || !((lr1) xc3).mo55968R0().isUnresolved()) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public static final xc3 m62963s(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        xc3 n = x17.m73830n(xc3);
        vx2.m53590f(n, "makeNotNullable(this)");
        return n;
    }

    /* renamed from: t */
    public static final xc3 m62964t(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        xc3 o = x17.m73831o(xc3);
        vx2.m53590f(o, "makeNullable(this)");
        return o;
    }

    /* renamed from: u */
    public static final xc3 m62965u(xc3 xc3, C6983dm dmVar) {
        vx2.m53591g(xc3, "<this>");
        vx2.m53591g(dmVar, "newAnnotations");
        if (!xc3.getAnnotations().isEmpty() || !dmVar.isEmpty()) {
            return xc3.mo64506K0().mo51139N0(sz6.m72127a(xc3.mo51133G0(), dmVar));
        }
        return xc3;
    }

    /* renamed from: v */
    public static final xc3 m62966v(xc3 xc3, TypeSubstitutor typeSubstitutor, Map<yz6, ? extends f17> map, Variance variance, Set<? extends a17> set) {
        w47 w47;
        boolean z;
        boolean z2;
        boolean z3;
        TypeSubstitutor typeSubstitutor2 = typeSubstitutor;
        Map<yz6, ? extends f17> map2 = map;
        Variance variance2 = variance;
        Set<? extends a17> set2 = set;
        vx2.m53591g(xc3, "<this>");
        vx2.m53591g(typeSubstitutor2, "substitutor");
        vx2.m53591g(map2, "substitutionMap");
        vx2.m53591g(variance2, "variance");
        w47 K0 = xc3.mo64506K0();
        if (K0 instanceof i42) {
            i42 i42 = (i42) K0;
            d36 P0 = i42.mo52399P0();
            if (!P0.mo51134H0().getParameters().isEmpty() && P0.mo51134H0().mo51180d() != null) {
                List<a17> parameters = P0.mo51134H0().getParameters();
                vx2.m53590f(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(dk0.m43495u(parameters, 10));
                for (a17 a17 : parameters) {
                    f17 f17 = (f17) CollectionsKt___CollectionsKt.m47332c0(xc3.mo51132F0(), a17.getIndex());
                    if (set2 == null || !set2.contains(a17)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3 || f17 == null || !map2.containsKey(f17.getType().mo51134H0())) {
                        f17 = new StarProjectionImpl(a17);
                    }
                    arrayList.add(f17);
                }
                P0 = q17.m71170f(P0, arrayList, (rz6) null, 2, (Object) null);
            }
            d36 Q0 = i42.mo52400Q0();
            if (!Q0.mo51134H0().getParameters().isEmpty() && Q0.mo51134H0().mo51180d() != null) {
                List<a17> parameters2 = Q0.mo51134H0().getParameters();
                vx2.m53590f(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(dk0.m43495u(parameters2, 10));
                for (a17 a172 : parameters2) {
                    f17 f172 = (f17) CollectionsKt___CollectionsKt.m47332c0(xc3.mo51132F0(), a172.getIndex());
                    if (set2 == null || !set2.contains(a172)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2 || f172 == null || !map2.containsKey(f172.getType().mo51134H0())) {
                        f172 = new StarProjectionImpl(a172);
                    }
                    arrayList2.add(f172);
                }
                Q0 = q17.m71170f(Q0, arrayList2, (rz6) null, 2, (Object) null);
            }
            w47 = KotlinTypeFactory.m62849d(P0, Q0);
        } else if (K0 instanceof d36) {
            d36 d36 = (d36) K0;
            if (d36.mo51134H0().getParameters().isEmpty() || d36.mo51134H0().mo51180d() == null) {
                w47 = d36;
            } else {
                List<a17> parameters3 = d36.mo51134H0().getParameters();
                vx2.m53590f(parameters3, "constructor.parameters");
                ArrayList arrayList3 = new ArrayList(dk0.m43495u(parameters3, 10));
                for (a17 a173 : parameters3) {
                    f17 f173 = (f17) CollectionsKt___CollectionsKt.m47332c0(xc3.mo51132F0(), a173.getIndex());
                    if (set2 == null || !set2.contains(a173)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z || f173 == null || !map2.containsKey(f173.getType().mo51134H0())) {
                        f173 = new StarProjectionImpl(a173);
                    }
                    arrayList3.add(f173);
                }
                w47 = q17.m71170f(d36, arrayList3, (rz6) null, 2, (Object) null);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        xc3 n = typeSubstitutor2.mo55338n(c27.m56294b(w47, K0), variance2);
        vx2.m53590f(n, "replaceArgumentsByParame…ubstitute(it, variance) }");
        return n;
    }

    /* renamed from: w */
    public static final xc3 m62967w(xc3 xc3) {
        d36 d36;
        vx2.m53591g(xc3, "<this>");
        w47 K0 = xc3.mo64506K0();
        if (K0 instanceof i42) {
            i42 i42 = (i42) K0;
            d36 P0 = i42.mo52399P0();
            if (!P0.mo51134H0().getParameters().isEmpty() && P0.mo51134H0().mo51180d() != null) {
                List<a17> parameters = P0.mo51134H0().getParameters();
                vx2.m53590f(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(dk0.m43495u(parameters, 10));
                for (a17 starProjectionImpl : parameters) {
                    arrayList.add(new StarProjectionImpl(starProjectionImpl));
                }
                P0 = q17.m71170f(P0, arrayList, (rz6) null, 2, (Object) null);
            }
            d36 Q0 = i42.mo52400Q0();
            if (!Q0.mo51134H0().getParameters().isEmpty() && Q0.mo51134H0().mo51180d() != null) {
                List<a17> parameters2 = Q0.mo51134H0().getParameters();
                vx2.m53590f(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(dk0.m43495u(parameters2, 10));
                for (a17 starProjectionImpl2 : parameters2) {
                    arrayList2.add(new StarProjectionImpl(starProjectionImpl2));
                }
                Q0 = q17.m71170f(Q0, arrayList2, (rz6) null, 2, (Object) null);
            }
            d36 = KotlinTypeFactory.m62849d(P0, Q0);
        } else if (K0 instanceof d36) {
            d36 d362 = (d36) K0;
            boolean isEmpty = d362.mo51134H0().getParameters().isEmpty();
            d36 = d362;
            if (!isEmpty) {
                eg0 d = d362.mo51134H0().mo51180d();
                d36 = d362;
                if (d != null) {
                    List<a17> parameters3 = d362.mo51134H0().getParameters();
                    vx2.m53590f(parameters3, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(dk0.m43495u(parameters3, 10));
                    for (a17 starProjectionImpl3 : parameters3) {
                        arrayList3.add(new StarProjectionImpl(starProjectionImpl3));
                    }
                    d36 = q17.m71170f(d362, arrayList3, (rz6) null, 2, (Object) null);
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return c27.m56294b(d36, K0);
    }

    /* renamed from: x */
    public static final boolean m62968x(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        return m62946b(xc3, TypeUtilsKt$requiresTypeAliasExpansion$1.INSTANCE);
    }
}
