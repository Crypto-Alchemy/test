package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.xc1;

/* compiled from: LazyJavaScope.kt */
public abstract class LazyJavaScope extends qs3 {

    /* renamed from: m */
    public static final /* synthetic */ i93<Object>[] f39530m;

    /* renamed from: b */
    public final pf3 f39531b;

    /* renamed from: c */
    public final LazyJavaScope f39532c;

    /* renamed from: d */
    public final q84<Collection<d31>> f39533d;

    /* renamed from: e */
    public final q84<l31> f39534e;

    /* renamed from: f */
    public final vs3<r24, Collection<C7428e>> f39535f;

    /* renamed from: g */
    public final ws3<r24, fx4> f39536g;

    /* renamed from: h */
    public final vs3<r24, Collection<C7428e>> f39537h;

    /* renamed from: i */
    public final q84 f39538i;

    /* renamed from: j */
    public final q84 f39539j;

    /* renamed from: k */
    public final q84 f39540k;

    /* renamed from: l */
    public final vs3<r24, List<fx4>> f39541l;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$a */
    /* compiled from: LazyJavaScope.kt */
    public static final class C7462a {

        /* renamed from: a */
        public final xc3 f39542a;

        /* renamed from: b */
        public final xc3 f39543b;

        /* renamed from: c */
        public final List<n87> f39544c;

        /* renamed from: d */
        public final List<a17> f39545d;

        /* renamed from: e */
        public final boolean f39546e;

        /* renamed from: f */
        public final List<String> f39547f;

        public C7462a(xc3 xc3, xc3 xc32, List<? extends n87> list, List<? extends a17> list2, boolean z, List<String> list3) {
            vx2.m53591g(xc3, "returnType");
            vx2.m53591g(list, "valueParameters");
            vx2.m53591g(list2, "typeParameters");
            vx2.m53591g(list3, "errors");
            this.f39542a = xc3;
            this.f39543b = xc32;
            this.f39544c = list;
            this.f39545d = list2;
            this.f39546e = z;
            this.f39547f = list3;
        }

        /* renamed from: a */
        public final List<String> mo53621a() {
            return this.f39547f;
        }

        /* renamed from: b */
        public final boolean mo53622b() {
            return this.f39546e;
        }

        /* renamed from: c */
        public final xc3 mo53623c() {
            return this.f39543b;
        }

        /* renamed from: d */
        public final xc3 mo53624d() {
            return this.f39542a;
        }

        /* renamed from: e */
        public final List<a17> mo53625e() {
            return this.f39545d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7462a)) {
                return false;
            }
            C7462a aVar = (C7462a) obj;
            return vx2.m53586b(this.f39542a, aVar.f39542a) && vx2.m53586b(this.f39543b, aVar.f39543b) && vx2.m53586b(this.f39544c, aVar.f39544c) && vx2.m53586b(this.f39545d, aVar.f39545d) && this.f39546e == aVar.f39546e && vx2.m53586b(this.f39547f, aVar.f39547f);
        }

        /* renamed from: f */
        public final List<n87> mo53627f() {
            return this.f39544c;
        }

        public int hashCode() {
            int hashCode = this.f39542a.hashCode() * 31;
            xc3 xc3 = this.f39543b;
            int hashCode2 = (((((hashCode + (xc3 == null ? 0 : xc3.hashCode())) * 31) + this.f39544c.hashCode()) * 31) + this.f39545d.hashCode()) * 31;
            boolean z = this.f39546e;
            if (z) {
                z = true;
            }
            return ((hashCode2 + (z ? 1 : 0)) * 31) + this.f39547f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f39542a + ", receiverType=" + this.f39543b + ", valueParameters=" + this.f39544c + ", typeParameters=" + this.f39545d + ", hasStableParameterNames=" + this.f39546e + ", errors=" + this.f39547f + ')';
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$b */
    /* compiled from: LazyJavaScope.kt */
    public static final class C7463b {

        /* renamed from: a */
        public final List<n87> f39548a;

        /* renamed from: b */
        public final boolean f39549b;

        public C7463b(List<? extends n87> list, boolean z) {
            vx2.m53591g(list, "descriptors");
            this.f39548a = list;
            this.f39549b = z;
        }

        /* renamed from: a */
        public final List<n87> mo53630a() {
            return this.f39548a;
        }

        /* renamed from: b */
        public final boolean mo53631b() {
            return this.f39549b;
        }
    }

    static {
        Class<LazyJavaScope> cls = LazyJavaScope.class;
        f39530m = new i93[]{ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyJavaScope(pf3 pf3, LazyJavaScope lazyJavaScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pf3, (i & 2) != 0 ? null : lazyJavaScope);
    }

    /* renamed from: A */
    public final Set<r24> mo53605A() {
        return (Set) ca6.m56364a(this.f39538i, this, f39530m[0]);
    }

    /* renamed from: B */
    public final LazyJavaScope mo53606B() {
        return this.f39532c;
    }

    /* renamed from: C */
    public abstract d31 mo53531C();

    /* renamed from: D */
    public final Set<r24> mo53607D() {
        return (Set) ca6.m56364a(this.f39539j, this, f39530m[1]);
    }

    /* renamed from: E */
    public final xc3 mo53608E(f13 f13) {
        boolean z = false;
        xc3 o = this.f39531b.mo65302g().mo53660o(f13.getType(), l23.m63664d(TypeUsage.COMMON, false, (a17) null, 3, (Object) null));
        if ((C7389b.m60142r0(o) || C7389b.m60145u0(o)) && mo53609F(f13) && f13.mo50847M()) {
            z = true;
        }
        if (!z) {
            return o;
        }
        xc3 n = x17.m73830n(o);
        vx2.m53590f(n, "makeNotNullable(propertyType)");
        return n;
    }

    /* renamed from: F */
    public final boolean mo53609F(f13 f13) {
        if (!f13.isFinal() || !f13.mo51414O()) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public boolean mo53536G(JavaMethodDescriptor javaMethodDescriptor) {
        vx2.m53591g(javaMethodDescriptor, "<this>");
        return true;
    }

    /* renamed from: H */
    public abstract C7462a mo53538H(m13 m13, List<? extends a17> list, xc3 xc3, List<? extends n87> list2);

    /* renamed from: I */
    public final JavaMethodDescriptor mo53610I(m13 m13) {
        boolean z;
        h85 h85;
        Map<K, V> map;
        m13 m132 = m13;
        vx2.m53591g(m132, "method");
        C6983dm a = of3.m70255a(this.f39531b, m132);
        d31 C = mo53531C();
        r24 name = m13.getName();
        a23 a2 = this.f39531b.mo65296a().mo67017t().mo50460a(m132);
        if (((l31) this.f39534e.invoke()).mo53498e(m13.getName()) == null || !m13.mo51626f().isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        JavaMethodDescriptor j1 = JavaMethodDescriptor.m60723j1(C, a, name, a2, z);
        vx2.m53590f(j1, "createJavaMethod(\n      …eters.isEmpty()\n        )");
        pf3 f = ContextKt.m60738f(this.f39531b, j1, m13, 0, 4, (Object) null);
        List<h23> typeParameters = m13.getTypeParameters();
        ArrayList arrayList = new ArrayList(dk0.m43495u(typeParameters, 10));
        for (h23 a3 : typeParameters) {
            a17 a4 = f.mo65301f().mo51350a(a3);
            vx2.m53588d(a4);
            arrayList.add(a4);
        }
        C7463b K = mo53612K(f, j1, m13.mo51626f());
        C7462a H = mo53538H(m132, arrayList, mo53615q(m132, f), K.mo53630a());
        xc3 c = H.mo53623c();
        if (c != null) {
            h85 = wc1.m73548h(j1, c, C6983dm.f37317b.mo51228b());
        } else {
            h85 = null;
        }
        h85 h852 = h85;
        h85 z2 = mo53581z();
        List j = ck0.m33062j();
        List<a17> e = H.mo53625e();
        List<n87> f2 = H.mo53627f();
        xc3 d = H.mo53624d();
        Modality a5 = Modality.Companion.mo53240a(false, m13.isAbstract(), !m13.isFinal());
        fd1 c2 = v77.m73135c(m13.getVisibility());
        if (H.mo53623c() != null) {
            map = ao3.m31894f(wy6.m54142a(JavaMethodDescriptor.f39445t1, CollectionsKt___CollectionsKt.m47329Z(K.mo53630a())));
        } else {
            map = C6177b.m47361i();
        }
        Map<K, V> map2 = map;
        JavaMethodDescriptor javaMethodDescriptor = j1;
        j1.mo52101i1(h852, z2, j, e, f2, d, a5, c2, map2);
        javaMethodDescriptor.mo53487m1(H.mo53622b(), K.mo53631b());
        if (!H.mo53621a().isEmpty()) {
            f.mo65296a().mo67016s().mo66392a(javaMethodDescriptor, H.mo53621a());
        }
        return javaMethodDescriptor;
    }

    /* renamed from: J */
    public final fx4 mo53611J(f13 f13) {
        gx4 u = mo53616u(f13);
        u.mo52045P0((jx4) null, (lx4) null, (g02) null, (g02) null);
        u.mo52050V0(mo53608E(f13), ck0.m33062j(), mo53581z(), (h85) null, ck0.m33062j());
        if (dd1.m56806K(u, u.getType())) {
            u.mo53365F0(new LazyJavaScope$resolveProperty$1(this, f13, u));
        }
        this.f39531b.mo65296a().mo67005h().mo66821e(f13, u);
        return u;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [e23] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.C7463b mo53612K(p000.pf3 r22, kotlin.reflect.jvm.internal.impl.descriptors.C7425c r23, java.util.List<? extends p000.p23> r24) {
        /*
            r21 = this;
            r0 = r22
            java.lang.String r1 = "c"
            p000.vx2.m53591g(r0, r1)
            java.lang.String r1 = "function"
            r14 = r23
            p000.vx2.m53591g(r14, r1)
            java.lang.String r1 = "jValueParameters"
            r15 = r24
            p000.vx2.m53591g(r15, r1)
            java.lang.Iterable r1 = kotlin.collections.CollectionsKt___CollectionsKt.m47319Q0(r24)
            java.util.ArrayList r13 = new java.util.ArrayList
            r2 = 10
            int r2 = p000.dk0.m43495u(r1, r2)
            r13.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
            r12 = 0
            r2 = r12
        L_0x002a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x013b
            java.lang.Object r3 = r1.next()
            wt2 r3 = (p000.wt2) r3
            int r5 = r3.mo49263a()
            java.lang.Object r3 = r3.mo49264b()
            p23 r3 = (p000.p23) r3
            dm r6 = p000.of3.m70255a(r0, r3)
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r4 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON
            r7 = 3
            r8 = 0
            f23 r4 = p000.l23.m63664d(r4, r12, r8, r7, r8)
            boolean r7 = r3.mo56172a()
            r9 = 1
            if (r7 == 0) goto L_0x0090
            e23 r7 = r3.getType()
            boolean r10 = r7 instanceof p000.n03
            if (r10 == 0) goto L_0x005e
            r8 = r7
            n03 r8 = (p000.n03) r8
        L_0x005e:
            if (r8 == 0) goto L_0x0079
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver r7 = r22.mo65302g()
            xc3 r4 = r7.mo53658k(r8, r4, r9)
            mx3 r7 = r22.mo65299d()
            kotlin.reflect.jvm.internal.impl.builtins.b r7 = r7.mo51535k()
            xc3 r7 = r7.mo53171k(r4)
            kotlin.Pair r4 = p000.wy6.m54142a(r4, r7)
            goto L_0x00a0
        L_0x0079:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Vararg parameter should be an array: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0090:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver r7 = r22.mo65302g()
            e23 r10 = r3.getType()
            xc3 r4 = r7.mo53660o(r10, r4)
            kotlin.Pair r4 = p000.wy6.m54142a(r4, r8)
        L_0x00a0:
            java.lang.Object r7 = r4.component1()
            r8 = r7
            xc3 r8 = (p000.xc3) r8
            java.lang.Object r4 = r4.component2()
            r16 = r4
            xc3 r16 = (p000.xc3) r16
            r24 r4 = r23.getName()
            java.lang.String r4 = r4.mo65594d()
            java.lang.String r7 = "equals"
            boolean r4 = p000.vx2.m53586b(r4, r7)
            if (r4 == 0) goto L_0x00de
            int r4 = r24.size()
            if (r4 != r9) goto L_0x00de
            mx3 r4 = r22.mo65299d()
            kotlin.reflect.jvm.internal.impl.builtins.b r4 = r4.mo51535k()
            d36 r4 = r4.mo53151I()
            boolean r4 = p000.vx2.m53586b(r4, r8)
            if (r4 == 0) goto L_0x00de
            java.lang.String r4 = "other"
            r24 r4 = p000.r24.m71445h(r4)
            goto L_0x0101
        L_0x00de:
            r24 r4 = r3.getName()
            if (r4 != 0) goto L_0x00e5
            r2 = r9
        L_0x00e5:
            if (r4 != 0) goto L_0x0101
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r7 = 112(0x70, float:1.57E-43)
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r24 r4 = p000.r24.m71445h(r4)
            java.lang.String r7 = "identifier(\"p$index\")"
            p000.vx2.m53590f(r4, r7)
        L_0x0101:
            r17 = r2
            r7 = r4
            java.lang.String r2 = "if (function.name.asStri…(\"p$index\")\n            }"
            p000.vx2.m53590f(r7, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl r11 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl
            r4 = 0
            r9 = 0
            r10 = 0
            r18 = 0
            y13 r2 = r22.mo65296a()
            b23 r2 = r2.mo67017t()
            a23 r19 = r2.mo50460a(r3)
            r2 = r11
            r3 = r23
            r20 = r11
            r11 = r18
            r18 = r12
            r12 = r16
            r0 = r13
            r13 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = r20
            r0.add(r2)
            r13 = r0
            r2 = r17
            r12 = r18
            r0 = r22
            goto L_0x002a
        L_0x013b:
            r0 = r13
            java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47311K0(r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$b r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$b
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.mo53612K(pf3, kotlin.reflect.jvm.internal.impl.descriptors.c, java.util.List):kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$b");
    }

    /* renamed from: L */
    public final void mo53613L(Set<C7428e> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : set) {
            String c = ov3.m70793c((C7428e) next, false, false, 2, (Object) null);
            Object obj = linkedHashMap.get(c);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c, obj);
            }
            ((List) obj).add(next);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection a = OverridingUtilsKt.m62408a(list, LazyJavaScope$retainMostSpecificMethods$mostSpecificMethods$1.INSTANCE);
                set.removeAll(list);
                set.addAll(a);
            }
        }
    }

    /* renamed from: a */
    public Set<r24> mo50860a() {
        return mo53605A();
    }

    /* renamed from: b */
    public Collection<fx4> mo50861b(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        if (!mo50863d().contains(r24)) {
            return ck0.m33062j();
        }
        return this.f39541l.invoke(r24);
    }

    /* renamed from: c */
    public Collection<C7428e> mo50862c(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        if (!mo50860a().contains(r24)) {
            return ck0.m33062j();
        }
        return this.f39537h.invoke(r24);
    }

    /* renamed from: d */
    public Set<r24> mo50863d() {
        return mo53607D();
    }

    /* renamed from: f */
    public Collection<d31> mo50865f(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        vx2.m53591g(rc2, "nameFilter");
        return (Collection) this.f39533d.invoke();
    }

    /* renamed from: g */
    public Set<r24> mo50866g() {
        return mo53619x();
    }

    /* renamed from: l */
    public abstract Set<r24> mo53559l(yc1 yc1, rc2<? super r24, Boolean> rc2);

    /* renamed from: m */
    public final List<d31> mo53614m(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        vx2.m53591g(rc2, "nameFilter");
        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (yc1.mo67068a(yc1.f46165c.mo67076c())) {
            for (r24 next : mo53559l(yc1, rc2)) {
                if (rc2.invoke(next).booleanValue()) {
                    ak0.m55531a(linkedHashSet, mo50864e(next, noLookupLocation));
                }
            }
        }
        if (yc1.mo67068a(yc1.f46165c.mo67077d()) && !yc1.mo67071l().contains(xc1.C9593a.f45867a)) {
            for (r24 next2 : mo53562n(yc1, rc2)) {
                if (rc2.invoke(next2).booleanValue()) {
                    linkedHashSet.addAll(mo50862c(next2, noLookupLocation));
                }
            }
        }
        if (yc1.mo67068a(yc1.f46165c.mo67082i()) && !yc1.mo67071l().contains(xc1.C9593a.f45867a)) {
            for (r24 next3 : mo53573t(yc1, rc2)) {
                if (rc2.invoke(next3).booleanValue()) {
                    linkedHashSet.addAll(mo50861b(next3, noLookupLocation));
                }
            }
        }
        return CollectionsKt___CollectionsKt.m47311K0(linkedHashSet);
    }

    /* renamed from: n */
    public abstract Set<r24> mo53562n(yc1 yc1, rc2<? super r24, Boolean> rc2);

    /* renamed from: o */
    public void mo53564o(Collection<C7428e> collection, r24 r24) {
        vx2.m53591g(collection, "result");
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
    }

    /* renamed from: p */
    public abstract l31 mo53566p();

    /* renamed from: q */
    public final xc3 mo53615q(m13 m13, pf3 pf3) {
        vx2.m53591g(m13, "method");
        vx2.m53591g(pf3, "c");
        return pf3.mo65302g().mo53660o(m13.getReturnType(), l23.m63664d(TypeUsage.COMMON, m13.mo51413N().mo53390n(), (a17) null, 2, (Object) null));
    }

    /* renamed from: r */
    public abstract void mo53569r(Collection<C7428e> collection, r24 r24);

    /* renamed from: s */
    public abstract void mo53571s(r24 r24, Collection<fx4> collection);

    /* renamed from: t */
    public abstract Set<r24> mo53573t(yc1 yc1, rc2<? super r24, Boolean> rc2);

    public String toString() {
        return "Lazy scope for " + mo53531C();
    }

    /* renamed from: u */
    public final gx4 mo53616u(f13 f13) {
        u13 Z0 = u13.m72514Z0(mo53531C(), of3.m70255a(this.f39531b, f13), Modality.FINAL, v77.m73135c(f13.getVisibility()), !f13.isFinal(), f13.getName(), this.f39531b.mo65296a().mo67017t().mo50460a(f13), mo53609F(f13));
        vx2.m53590f(Z0, "create(\n            owne…d.isFinalStatic\n        )");
        return Z0;
    }

    /* renamed from: v */
    public final q84<Collection<d31>> mo53617v() {
        return this.f39533d;
    }

    /* renamed from: w */
    public final pf3 mo53618w() {
        return this.f39531b;
    }

    /* renamed from: x */
    public final Set<r24> mo53619x() {
        return (Set) ca6.m56364a(this.f39540k, this, f39530m[2]);
    }

    /* renamed from: y */
    public final q84<l31> mo53620y() {
        return this.f39534e;
    }

    /* renamed from: z */
    public abstract h85 mo53581z();

    public LazyJavaScope(pf3 pf3, LazyJavaScope lazyJavaScope) {
        vx2.m53591g(pf3, "c");
        this.f39531b = pf3;
        this.f39532c = lazyJavaScope;
        this.f39533d = pf3.mo65300e().mo51161f(new LazyJavaScope$allDescriptors$1(this), ck0.m33062j());
        this.f39534e = pf3.mo65300e().mo51164i(new LazyJavaScope$declaredMemberIndex$1(this));
        this.f39535f = pf3.mo65300e().mo51163h(new LazyJavaScope$declaredFunctions$1(this));
        this.f39536g = pf3.mo65300e().mo51159d(new LazyJavaScope$declaredField$1(this));
        this.f39537h = pf3.mo65300e().mo51163h(new LazyJavaScope$functions$1(this));
        this.f39538i = pf3.mo65300e().mo51164i(new LazyJavaScope$functionNamesLazy$2(this));
        this.f39539j = pf3.mo65300e().mo51164i(new LazyJavaScope$propertyNamesLazy$2(this));
        this.f39540k = pf3.mo65300e().mo51164i(new LazyJavaScope$classNamesLazy$2(this));
        this.f39541l = pf3.mo65300e().mo51163h(new LazyJavaScope$properties$1(this));
    }
}
