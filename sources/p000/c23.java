package p000;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.name.C7597a;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt__StringsKt;

/* renamed from: c23 */
/* compiled from: JavaToKotlinClassMap.kt */
public final class c23 {

    /* renamed from: a */
    public static final c23 f37039a;

    /* renamed from: b */
    public static final String f37040b;

    /* renamed from: c */
    public static final String f37041c;

    /* renamed from: d */
    public static final String f37042d;

    /* renamed from: e */
    public static final String f37043e;

    /* renamed from: f */
    public static final nf0 f37044f;

    /* renamed from: g */
    public static final u82 f37045g;

    /* renamed from: h */
    public static final nf0 f37046h;

    /* renamed from: i */
    public static final nf0 f37047i;

    /* renamed from: j */
    public static final nf0 f37048j;

    /* renamed from: k */
    public static final HashMap<v82, nf0> f37049k = new HashMap<>();

    /* renamed from: l */
    public static final HashMap<v82, nf0> f37050l = new HashMap<>();

    /* renamed from: m */
    public static final HashMap<v82, u82> f37051m = new HashMap<>();

    /* renamed from: n */
    public static final HashMap<v82, u82> f37052n = new HashMap<>();

    /* renamed from: o */
    public static final HashMap<nf0, nf0> f37053o = new HashMap<>();

    /* renamed from: p */
    public static final HashMap<nf0, nf0> f37054p = new HashMap<>();

    /* renamed from: q */
    public static final List<C6921a> f37055q;

    /* renamed from: c23$a */
    /* compiled from: JavaToKotlinClassMap.kt */
    public static final class C6921a {

        /* renamed from: a */
        public final nf0 f37056a;

        /* renamed from: b */
        public final nf0 f37057b;

        /* renamed from: c */
        public final nf0 f37058c;

        public C6921a(nf0 nf0, nf0 nf02, nf0 nf03) {
            vx2.m53591g(nf0, "javaClass");
            vx2.m53591g(nf02, "kotlinReadOnly");
            vx2.m53591g(nf03, "kotlinMutable");
            this.f37056a = nf0;
            this.f37057b = nf02;
            this.f37058c = nf03;
        }

        /* renamed from: a */
        public final nf0 mo50796a() {
            return this.f37056a;
        }

        /* renamed from: b */
        public final nf0 mo50797b() {
            return this.f37057b;
        }

        /* renamed from: c */
        public final nf0 mo50798c() {
            return this.f37058c;
        }

        /* renamed from: d */
        public final nf0 mo50799d() {
            return this.f37056a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6921a)) {
                return false;
            }
            C6921a aVar = (C6921a) obj;
            return vx2.m53586b(this.f37056a, aVar.f37056a) && vx2.m53586b(this.f37057b, aVar.f37057b) && vx2.m53586b(this.f37058c, aVar.f37058c);
        }

        public int hashCode() {
            return (((this.f37056a.hashCode() * 31) + this.f37057b.hashCode()) * 31) + this.f37058c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f37056a + ", kotlinReadOnly=" + this.f37057b + ", kotlinMutable=" + this.f37058c + ')';
        }
    }

    static {
        c23 c23 = new c23();
        f37039a = c23;
        StringBuilder sb = new StringBuilder();
        FunctionClassKind functionClassKind = FunctionClassKind.Function;
        sb.append(functionClassKind.getPackageFqName().toString());
        sb.append('.');
        sb.append(functionClassKind.getClassNamePrefix());
        f37040b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        FunctionClassKind functionClassKind2 = FunctionClassKind.KFunction;
        sb2.append(functionClassKind2.getPackageFqName().toString());
        sb2.append('.');
        sb2.append(functionClassKind2.getClassNamePrefix());
        f37041c = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionClassKind functionClassKind3 = FunctionClassKind.SuspendFunction;
        sb3.append(functionClassKind3.getPackageFqName().toString());
        sb3.append('.');
        sb3.append(functionClassKind3.getClassNamePrefix());
        f37042d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionClassKind functionClassKind4 = FunctionClassKind.KSuspendFunction;
        sb4.append(functionClassKind4.getPackageFqName().toString());
        sb4.append('.');
        sb4.append(functionClassKind4.getClassNamePrefix());
        f37043e = sb4.toString();
        nf0 m = nf0.m69751m(new u82("kotlin.jvm.functions.FunctionN"));
        vx2.m53590f(m, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        f37044f = m;
        u82 b = m.mo62673b();
        vx2.m53590f(b, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f37045g = b;
        b86 b86 = b86.f36738a;
        f37046h = b86.mo50538i();
        f37047i = b86.mo50537h();
        f37048j = c23.mo50786g(Class.class);
        nf0 m2 = nf0.m69751m(C7395c.C7396a.f39149T);
        vx2.m53590f(m2, "topLevel(FqNames.iterable)");
        u82 u82 = C7395c.C7396a.f39159b0;
        u82 h = m2.mo62678h();
        u82 h2 = m2.mo62678h();
        vx2.m53590f(h2, "kotlinReadOnly.packageFqName");
        u82 g = C7597a.m61842g(u82, h2);
        nf0 nf0 = new nf0(h, g, false);
        nf0 m3 = nf0.m69751m(C7395c.C7396a.f39148S);
        vx2.m53590f(m3, "topLevel(FqNames.iterator)");
        u82 u822 = C7395c.C7396a.f39157a0;
        u82 h3 = m3.mo62678h();
        u82 h4 = m3.mo62678h();
        vx2.m53590f(h4, "kotlinReadOnly.packageFqName");
        nf0 nf02 = new nf0(h3, C7597a.m61842g(u822, h4), false);
        nf0 m4 = nf0.m69751m(C7395c.C7396a.f39150U);
        vx2.m53590f(m4, "topLevel(FqNames.collection)");
        u82 u823 = C7395c.C7396a.f39161c0;
        u82 h5 = m4.mo62678h();
        u82 h6 = m4.mo62678h();
        vx2.m53590f(h6, "kotlinReadOnly.packageFqName");
        nf0 nf03 = new nf0(h5, C7597a.m61842g(u823, h6), false);
        nf0 m5 = nf0.m69751m(C7395c.C7396a.f39151V);
        vx2.m53590f(m5, "topLevel(FqNames.list)");
        u82 u824 = C7395c.C7396a.f39163d0;
        u82 h7 = m5.mo62678h();
        u82 h8 = m5.mo62678h();
        vx2.m53590f(h8, "kotlinReadOnly.packageFqName");
        nf0 nf04 = new nf0(h7, C7597a.m61842g(u824, h8), false);
        nf0 m6 = nf0.m69751m(C7395c.C7396a.f39153X);
        vx2.m53590f(m6, "topLevel(FqNames.set)");
        u82 u825 = C7395c.C7396a.f39167f0;
        u82 h9 = m6.mo62678h();
        u82 h10 = m6.mo62678h();
        vx2.m53590f(h10, "kotlinReadOnly.packageFqName");
        nf0 nf05 = new nf0(h9, C7597a.m61842g(u825, h10), false);
        nf0 m7 = nf0.m69751m(C7395c.C7396a.f39152W);
        vx2.m53590f(m7, "topLevel(FqNames.listIterator)");
        u82 u826 = C7395c.C7396a.f39165e0;
        u82 h11 = m7.mo62678h();
        u82 h12 = m7.mo62678h();
        vx2.m53590f(h12, "kotlinReadOnly.packageFqName");
        nf0 nf06 = new nf0(h11, C7597a.m61842g(u826, h12), false);
        u82 u827 = C7395c.C7396a.f39154Y;
        nf0 m8 = nf0.m69751m(u827);
        vx2.m53590f(m8, "topLevel(FqNames.map)");
        u82 u828 = C7395c.C7396a.f39169g0;
        u82 h13 = m8.mo62678h();
        u82 h14 = m8.mo62678h();
        vx2.m53590f(h14, "kotlinReadOnly.packageFqName");
        nf0 nf07 = new nf0(h13, C7597a.m61842g(u828, h14), false);
        nf0 d = nf0.m69751m(u827).mo62675d(C7395c.C7396a.f39155Z.mo66201g());
        vx2.m53590f(d, "topLevel(FqNames.map).cr…mes.mapEntry.shortName())");
        u82 u829 = C7395c.C7396a.f39171h0;
        u82 h15 = d.mo62678h();
        u82 h16 = d.mo62678h();
        vx2.m53590f(h16, "kotlinReadOnly.packageFqName");
        List<C6921a> m9 = ck0.m33065m(new C6921a(c23.mo50786g(Iterable.class), m2, nf0), new C6921a(c23.mo50786g(Iterator.class), m3, nf02), new C6921a(c23.mo50786g(Collection.class), m4, nf03), new C6921a(c23.mo50786g(List.class), m5, nf04), new C6921a(c23.mo50786g(Set.class), m6, nf05), new C6921a(c23.mo50786g(ListIterator.class), m7, nf06), new C6921a(c23.mo50786g(Map.class), m8, nf07), new C6921a(c23.mo50786g(Map.Entry.class), d, new nf0(h15, C7597a.m61842g(u829, h16), false)));
        f37055q = m9;
        c23.mo50785f(Object.class, C7395c.C7396a.f39158b);
        c23.mo50785f(String.class, C7395c.C7396a.f39170h);
        c23.mo50785f(CharSequence.class, C7395c.C7396a.f39168g);
        c23.mo50784e(Throwable.class, C7395c.C7396a.f39196u);
        c23.mo50785f(Cloneable.class, C7395c.C7396a.f39162d);
        c23.mo50785f(Number.class, C7395c.C7396a.f39190r);
        c23.mo50784e(Comparable.class, C7395c.C7396a.f39198v);
        c23.mo50785f(Enum.class, C7395c.C7396a.f39192s);
        c23.mo50784e(Annotation.class, C7395c.C7396a.f39132G);
        for (C6921a d2 : m9) {
            f37039a.mo50783d(d2);
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            c23 c232 = f37039a;
            nf0 m10 = nf0.m69751m(jvmPrimitiveType.getWrapperFqName());
            vx2.m53590f(m10, "topLevel(jvmType.wrapperFqName)");
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            vx2.m53590f(primitiveType, "jvmType.primitiveType");
            nf0 m11 = nf0.m69751m(C7395c.m60202c(primitiveType));
            vx2.m53590f(m11, "topLevel(StandardNames.g…e(jvmType.primitiveType))");
            c232.mo50780a(m10, m11);
        }
        for (nf0 next : ul0.f45107a.mo66303a()) {
            c23 c233 = f37039a;
            nf0 m12 = nf0.m69751m(new u82("kotlin.jvm.internal." + next.mo62681j().mo65594d() + "CompanionObject"));
            vx2.m53590f(m12, "topLevel(FqName(\"kotlin.…g() + \"CompanionObject\"))");
            nf0 d3 = next.mo62675d(n66.f41105d);
            vx2.m53590f(d3, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            c233.mo50780a(m12, d3);
        }
        for (int i = 0; i < 23; i++) {
            c23 c234 = f37039a;
            nf0 m13 = nf0.m69751m(new u82("kotlin.jvm.functions.Function" + i));
            vx2.m53590f(m13, "topLevel(FqName(\"kotlin.…m.functions.Function$i\"))");
            c234.mo50780a(m13, C7395c.m60200a(i));
            c234.mo50782c(new u82(f37041c + i), f37046h);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            FunctionClassKind functionClassKind5 = FunctionClassKind.KSuspendFunction;
            f37039a.mo50782c(new u82((functionClassKind5.getPackageFqName().toString() + '.' + functionClassKind5.getClassNamePrefix()) + i2), f37046h);
        }
        c23 c235 = f37039a;
        u82 l = C7395c.C7396a.f39160c.mo66454l();
        vx2.m53590f(l, "nothing.toSafe()");
        c235.mo50782c(l, c235.mo50786g(Void.class));
    }

    /* renamed from: a */
    public final void mo50780a(nf0 nf0, nf0 nf02) {
        mo50781b(nf0, nf02);
        u82 b = nf02.mo62673b();
        vx2.m53590f(b, "kotlinClassId.asSingleFqName()");
        mo50782c(b, nf0);
    }

    /* renamed from: b */
    public final void mo50781b(nf0 nf0, nf0 nf02) {
        HashMap<v82, nf0> hashMap = f37049k;
        v82 j = nf0.mo62673b().mo66205j();
        vx2.m53590f(j, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(j, nf02);
    }

    /* renamed from: c */
    public final void mo50782c(u82 u82, nf0 nf0) {
        HashMap<v82, nf0> hashMap = f37050l;
        v82 j = u82.mo66205j();
        vx2.m53590f(j, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(j, nf0);
    }

    /* renamed from: d */
    public final void mo50783d(C6921a aVar) {
        nf0 a = aVar.mo50796a();
        nf0 b = aVar.mo50797b();
        nf0 c = aVar.mo50798c();
        mo50780a(a, b);
        u82 b2 = c.mo62673b();
        vx2.m53590f(b2, "mutableClassId.asSingleFqName()");
        mo50782c(b2, a);
        f37053o.put(c, b);
        f37054p.put(b, c);
        u82 b3 = b.mo62673b();
        vx2.m53590f(b3, "readOnlyClassId.asSingleFqName()");
        u82 b4 = c.mo62673b();
        vx2.m53590f(b4, "mutableClassId.asSingleFqName()");
        HashMap<v82, u82> hashMap = f37051m;
        v82 j = c.mo62673b().mo66205j();
        vx2.m53590f(j, "mutableClassId.asSingleFqName().toUnsafe()");
        hashMap.put(j, b3);
        HashMap<v82, u82> hashMap2 = f37052n;
        v82 j2 = b3.mo66205j();
        vx2.m53590f(j2, "readOnlyFqName.toUnsafe()");
        hashMap2.put(j2, b4);
    }

    /* renamed from: e */
    public final void mo50784e(Class<?> cls, u82 u82) {
        nf0 g = mo50786g(cls);
        nf0 m = nf0.m69751m(u82);
        vx2.m53590f(m, "topLevel(kotlinFqName)");
        mo50780a(g, m);
    }

    /* renamed from: f */
    public final void mo50785f(Class<?> cls, v82 v82) {
        u82 l = v82.mo66454l();
        vx2.m53590f(l, "kotlinFqName.toSafe()");
        mo50784e(cls, l);
    }

    /* renamed from: g */
    public final nf0 mo50786g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            boolean isArray = cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            nf0 m = nf0.m69751m(new u82(cls.getCanonicalName()));
            vx2.m53590f(m, "topLevel(FqName(clazz.canonicalName))");
            return m;
        }
        nf0 d = mo50786g(declaringClass).mo62675d(r24.m71445h(cls.getSimpleName()));
        vx2.m53590f(d, "classId(outer).createNes…tifier(clazz.simpleName))");
        return d;
    }

    /* renamed from: h */
    public final u82 mo50787h() {
        return f37045g;
    }

    /* renamed from: i */
    public final List<C6921a> mo50788i() {
        return f37055q;
    }

    /* renamed from: j */
    public final boolean mo50789j(v82 v82, String str) {
        boolean z;
        String b = v82.mo66442b();
        vx2.m53590f(b, "kotlinFqName.asString()");
        String K0 = StringsKt__StringsKt.m63070K0(b, str, "");
        if (K0.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || StringsKt__StringsKt.m63066G0(K0, '0', false, 2, (Object) null)) {
            return false;
        }
        Integer n = xb6.m73916n(K0);
        if (n == null || n.intValue() < 23) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo50790k(v82 v82) {
        return f37051m.containsKey(v82);
    }

    /* renamed from: l */
    public final boolean mo50791l(v82 v82) {
        return f37052n.containsKey(v82);
    }

    /* renamed from: m */
    public final nf0 mo50792m(u82 u82) {
        vx2.m53591g(u82, "fqName");
        return f37049k.get(u82.mo66205j());
    }

    /* renamed from: n */
    public final nf0 mo50793n(v82 v82) {
        vx2.m53591g(v82, "kotlinFqName");
        if (mo50789j(v82, f37040b)) {
            return f37044f;
        }
        if (mo50789j(v82, f37042d)) {
            return f37044f;
        }
        if (mo50789j(v82, f37041c)) {
            return f37046h;
        }
        if (mo50789j(v82, f37043e)) {
            return f37046h;
        }
        return f37050l.get(v82);
    }

    /* renamed from: o */
    public final u82 mo50794o(v82 v82) {
        return f37051m.get(v82);
    }

    /* renamed from: p */
    public final u82 mo50795p(v82 v82) {
        return f37052n.get(v82);
    }
}
