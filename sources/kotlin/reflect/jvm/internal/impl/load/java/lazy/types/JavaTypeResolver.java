package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: JavaTypeResolver.kt */
public final class JavaTypeResolver {

    /* renamed from: a */
    public final pf3 f39557a;

    /* renamed from: b */
    public final e17 f39558b;

    /* renamed from: c */
    public final TypeParameterUpperBoundEraser f39559c;

    /* renamed from: d */
    public final RawSubstitution f39560d;

    public JavaTypeResolver(pf3 pf3, e17 e17) {
        vx2.m53591g(pf3, "c");
        vx2.m53591g(e17, "typeParameterResolver");
        this.f39557a = pf3;
        this.f39558b = e17;
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = new TypeParameterUpperBoundEraser((RawSubstitution) null, 1, (DefaultConstructorMarker) null);
        this.f39559c = typeParameterUpperBoundEraser;
        this.f39560d = new RawSubstitution(typeParameterUpperBoundEraser);
    }

    /* renamed from: l */
    public static /* synthetic */ xc3 m60986l(JavaTypeResolver javaTypeResolver, n03 n03, f23 f23, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return javaTypeResolver.mo53658k(n03, f23, z);
    }

    /* renamed from: n */
    public static final lr1 m60987n(x03 x03) {
        return nr1.m70033d(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, x03.mo66801E());
    }

    /* renamed from: b */
    public final boolean mo53649b(x03 x03, if0 if0) {
        Variance j;
        if (!m23.m64042a((e23) CollectionsKt___CollectionsKt.m47342m0(x03.mo66805z()))) {
            return false;
        }
        List<a17> parameters = d23.f37229a.mo51029b(if0).mo50046g().getParameters();
        vx2.m53590f(parameters, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
        a17 a17 = (a17) CollectionsKt___CollectionsKt.m47342m0(parameters);
        if (a17 == null || (j = a17.mo50049j()) == null || j == Variance.OUT_VARIANCE) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if ((!r0.isEmpty()) != false) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p000.f17> mo53650c(p000.x03 r7, p000.f23 r8, p000.yz6 r9) {
        /*
            r6 = this;
            boolean r0 = r7.mo66804s()
            java.lang.String r1 = "constructor.parameters"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0025
            java.util.List r0 = r7.mo66805z()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0023
            java.util.List r0 = r9.getParameters()
            p000.vx2.m53590f(r0, r1)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = r2
            goto L_0x0026
        L_0x0025:
            r0 = r3
        L_0x0026:
            java.util.List r4 = r9.getParameters()
            p000.vx2.m53590f(r4, r1)
            if (r0 == 0) goto L_0x0034
            java.util.List r7 = r6.mo53651d(r7, r4, r9, r8)
            return r7
        L_0x0034:
            int r8 = r4.size()
            java.util.List r9 = r7.mo66805z()
            int r9 = r9.size()
            r0 = 10
            if (r8 == r9) goto L_0x0082
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = p000.dk0.m43495u(r4, r0)
            r7.<init>(r8)
            java.util.Iterator r8 = r4.iterator()
        L_0x0051:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x007d
            java.lang.Object r9 = r8.next()
            a17 r9 = (p000.a17) r9
            h17 r0 = new h17
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER
            java.lang.String[] r4 = new java.lang.String[r3]
            r24 r9 = r9.getName()
            java.lang.String r9 = r9.mo65594d()
            java.lang.String r5 = "p.name.asString()"
            p000.vx2.m53590f(r9, r5)
            r4[r2] = r9
            lr1 r9 = p000.nr1.m70033d(r1, r4)
            r0.<init>(r9)
            r7.add(r0)
            goto L_0x0051
        L_0x007d:
            java.util.List r7 = kotlin.collections.CollectionsKt___CollectionsKt.m47311K0(r7)
            return r7
        L_0x0082:
            java.util.List r7 = r7.mo66805z()
            java.lang.Iterable r7 = kotlin.collections.CollectionsKt___CollectionsKt.m47319Q0(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = p000.dk0.m43495u(r7, r0)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x0097:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00cb
            java.lang.Object r9 = r7.next()
            wt2 r9 = (p000.wt2) r9
            int r0 = r9.mo49263a()
            java.lang.Object r9 = r9.mo49264b()
            e23 r9 = (p000.e23) r9
            r4.size()
            java.lang.Object r0 = r4.get(r0)
            a17 r0 = (p000.a17) r0
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r1 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON
            r3 = 3
            r5 = 0
            f23 r1 = p000.l23.m63664d(r1, r2, r5, r3, r5)
            java.lang.String r3 = "parameter"
            p000.vx2.m53590f(r0, r3)
            f17 r9 = r6.mo53661p(r9, r1, r0)
            r8.add(r9)
            goto L_0x0097
        L_0x00cb:
            java.util.List r7 = kotlin.collections.CollectionsKt___CollectionsKt.m47311K0(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver.mo53650c(x03, f23, yz6):java.util.List");
    }

    /* renamed from: d */
    public final List<f17> mo53651d(x03 x03, List<? extends a17> list, yz6 yz6, f23 f23) {
        f17 f17;
        f23 f232;
        ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
        for (a17 a17 : list) {
            if (TypeUtilsKt.m62955k(a17, (yz6) null, f23.mo51584f())) {
                f17 = l23.m63662b(a17, f23);
            } else {
                LazyWrappedType lazyWrappedType = new LazyWrappedType(this.f39557a.mo65300e(), new JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1(this, a17, x03, f23, yz6));
                RawSubstitution rawSubstitution = this.f39560d;
                if (x03.mo66804s()) {
                    f232 = f23;
                } else {
                    f232 = f23.mo51588i(JavaTypeFlexibility.INFLEXIBLE);
                }
                f17 = rawSubstitution.mo53662j(a17, f232, lazyWrappedType);
            }
            arrayList.add(f17);
        }
        return arrayList;
    }

    /* renamed from: e */
    public final d36 mo53652e(x03 x03, f23 f23, d36 d36) {
        rz6 rz6;
        if (d36 == null || (rz6 = d36.mo51133G0()) == null) {
            rz6 = sz6.m72128b(new LazyJavaAnnotations(this.f39557a, x03, false, 4, (DefaultConstructorMarker) null));
        }
        rz6 rz62 = rz6;
        yz6 f = mo53653f(x03, f23);
        yz6 yz6 = null;
        if (f == null) {
            return null;
        }
        boolean i = mo53656i(f23);
        if (d36 != null) {
            yz6 = d36.mo51134H0();
        }
        if (!vx2.m53586b(yz6, f) || x03.mo66804s() || !i) {
            return KotlinTypeFactory.m62853i(rz62, f, mo53650c(x03, f23, f), i, (bd3) null, 16, (Object) null);
        }
        return d36.mo51121O0(true);
    }

    /* renamed from: f */
    public final yz6 mo53653f(x03 x03, f23 f23) {
        yz6 g;
        w03 d = x03.mo66803d();
        if (d == null) {
            return mo53654g(x03);
        }
        if (d instanceof p03) {
            p03 p03 = (p03) d;
            u82 e = p03.mo53383e();
            if (e != null) {
                if0 j = mo53657j(x03, f23, e);
                if (j == null) {
                    j = this.f39557a.mo65296a().mo67011n().mo52549a(p03);
                }
                if (j == null || (g = j.mo50046g()) == null) {
                    return mo53654g(x03);
                }
                return g;
            }
            throw new AssertionError("Class type should have a FQ name: " + d);
        } else if (d instanceof h23) {
            a17 a = this.f39558b.mo51350a((h23) d);
            if (a != null) {
                return a.mo50046g();
            }
            return null;
        } else {
            throw new IllegalStateException("Unknown classifier kind: " + d);
        }
    }

    /* renamed from: g */
    public final yz6 mo53654g(x03 x03) {
        nf0 m = nf0.m69751m(new u82(x03.mo66802G()));
        vx2.m53590f(m, "topLevel(FqName(javaType.classifierQualifiedName))");
        yz6 g = this.f39557a.mo65296a().mo66999b().mo53798d().mo52450q().mo53241d(m, bk0.m32598e(0)).mo50046g();
        vx2.m53590f(g, "c.components.deserialize…istOf(0)).typeConstructor");
        return g;
    }

    /* renamed from: h */
    public final boolean mo53655h(Variance variance, a17 a17) {
        if (a17.mo50049j() == Variance.INVARIANT || variance == a17.mo50049j()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo53656i(f23 f23) {
        if (f23.mo51581d() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || f23.mo51585g() || f23.mo51582e() == TypeUsage.SUPERTYPE) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final if0 mo53657j(x03 x03, f23 f23, u82 u82) {
        if (f23.mo51585g() && vx2.m53586b(u82, l23.f40563a)) {
            return this.f39557a.mo65296a().mo67013p().mo53134c();
        }
        d23 d23 = d23.f37229a;
        if0 f = d23.m56622f(d23, u82, this.f39557a.mo65299d().mo51535k(), (Integer) null, 4, (Object) null);
        if (f == null) {
            return null;
        }
        if (!d23.mo51031d(f) || (f23.mo51581d() != JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND && f23.mo51582e() != TypeUsage.SUPERTYPE && !mo53649b(x03, f))) {
            return f;
        }
        return d23.mo51029b(f);
    }

    /* renamed from: k */
    public final xc3 mo53658k(n03 n03, f23 f23, boolean z) {
        t13 t13;
        PrimitiveType primitiveType;
        Variance variance;
        vx2.m53591g(n03, "arrayType");
        vx2.m53591g(f23, "attr");
        e23 m = n03.mo56339m();
        if (m instanceof t13) {
            t13 = (t13) m;
        } else {
            t13 = null;
        }
        if (t13 != null) {
            primitiveType = t13.getType();
        } else {
            primitiveType = null;
        }
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(this.f39557a, n03, true);
        if (primitiveType != null) {
            d36 O = this.f39557a.mo65299d().mo51535k().mo53156O(primitiveType);
            vx2.m53590f(O, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            TypeUtilsKt.m62965u(O, C6983dm.f37317b.mo51227a(CollectionsKt___CollectionsKt.m47348s0(lazyJavaAnnotations, O.getAnnotations())));
            if (f23.mo51585g()) {
                return O;
            }
            return KotlinTypeFactory.m62849d(O, O.mo51121O0(true));
        }
        xc3 o = mo53660o(m, l23.m63664d(TypeUsage.COMMON, f23.mo51585g(), (a17) null, 2, (Object) null));
        if (f23.mo51585g()) {
            if (z) {
                variance = Variance.OUT_VARIANCE;
            } else {
                variance = Variance.INVARIANT;
            }
            d36 m2 = this.f39557a.mo65299d().mo51535k().mo53173m(variance, o, lazyJavaAnnotations);
            vx2.m53590f(m2, "c.module.builtIns.getArr…mponentType, annotations)");
            return m2;
        }
        d36 m3 = this.f39557a.mo65299d().mo51535k().mo53173m(Variance.INVARIANT, o, lazyJavaAnnotations);
        vx2.m53590f(m3, "c.module.builtIns.getArr…mponentType, annotations)");
        return KotlinTypeFactory.m62849d(m3, this.f39557a.mo65299d().mo51535k().mo53173m(Variance.OUT_VARIANCE, o, lazyJavaAnnotations).mo51121O0(true));
    }

    /* renamed from: m */
    public final xc3 mo53659m(x03 x03, f23 f23) {
        boolean z;
        if (f23.mo51585g() || f23.mo51582e() == TypeUsage.SUPERTYPE) {
            z = false;
        } else {
            z = true;
        }
        boolean s = x03.mo66804s();
        if (s || z) {
            d36 e = mo53652e(x03, f23.mo51588i(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), (d36) null);
            if (e == null) {
                return m60987n(x03);
            }
            d36 e2 = mo53652e(x03, f23.mo51588i(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), e);
            if (e2 == null) {
                return m60987n(x03);
            }
            if (s) {
                return new RawTypeImpl(e, e2);
            }
            return KotlinTypeFactory.m62849d(e, e2);
        }
        d36 e3 = mo53652e(x03, f23, (d36) null);
        if (e3 != null) {
            return e3;
        }
        return m60987n(x03);
    }

    /* renamed from: o */
    public final xc3 mo53660o(e23 e23, f23 f23) {
        xc3 o;
        d36 d36;
        vx2.m53591g(f23, "attr");
        if (e23 instanceof t13) {
            PrimitiveType type = ((t13) e23).getType();
            if (type != null) {
                d36 = this.f39557a.mo65299d().mo51535k().mo53158R(type);
            } else {
                d36 = this.f39557a.mo65299d().mo51535k().mo53165Z();
            }
            vx2.m53590f(d36, "{\n                val pr…ns.unitType\n            }");
            return d36;
        } else if (e23 instanceof x03) {
            return mo53659m((x03) e23, f23);
        } else {
            if (e23 instanceof n03) {
                return m60986l(this, (n03) e23, f23, false, 4, (Object) null);
            } else if (e23 instanceof t23) {
                e23 w = ((t23) e23).mo56430w();
                if (w != null && (o = mo53660o(w, f23)) != null) {
                    return o;
                }
                d36 y = this.f39557a.mo65299d().mo51535k().mo53185y();
                vx2.m53590f(y, "c.module.builtIns.defaultBound");
                return y;
            } else if (e23 == null) {
                d36 y2 = this.f39557a.mo65299d().mo51535k().mo53185y();
                vx2.m53590f(y2, "c.module.builtIns.defaultBound");
                return y2;
            } else {
                throw new UnsupportedOperationException("Unsupported type: " + e23);
            }
        }
    }

    /* renamed from: p */
    public final f17 mo53661p(e23 e23, f23 f23, a17 a17) {
        Variance variance;
        if (!(e23 instanceof t23)) {
            return new h17(Variance.INVARIANT, mo53660o(e23, f23));
        }
        t23 t23 = (t23) e23;
        e23 w = t23.mo56430w();
        if (t23.mo56427K()) {
            variance = Variance.OUT_VARIANCE;
        } else {
            variance = Variance.IN_VARIANCE;
        }
        if (w == null || mo53655h(variance, a17)) {
            return l23.m63662b(a17, f23);
        }
        return TypeUtilsKt.m62949e(mo53660o(w, l23.m63664d(TypeUsage.COMMON, false, (a17) null, 3, (Object) null)), variance, a17);
    }
}
