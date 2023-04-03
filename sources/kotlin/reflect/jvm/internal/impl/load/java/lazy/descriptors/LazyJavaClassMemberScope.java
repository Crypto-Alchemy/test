package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.v16;
import p000.w46;

/* compiled from: LazyJavaClassMemberScope.kt */
public final class LazyJavaClassMemberScope extends LazyJavaScope {

    /* renamed from: n */
    public final if0 f39501n;

    /* renamed from: o */
    public final p03 f39502o;

    /* renamed from: p */
    public final boolean f39503p;

    /* renamed from: q */
    public final q84<List<ef0>> f39504q;

    /* renamed from: r */
    public final q84<Set<r24>> f39505r;

    /* renamed from: s */
    public final q84<Map<r24, f13>> f39506s;

    /* renamed from: t */
    public final ws3<r24, jf0> f39507t;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyJavaClassMemberScope(pf3 pf3, if0 if0, p03 p03, boolean z, LazyJavaClassMemberScope lazyJavaClassMemberScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pf3, if0, p03, z, (i & 16) != 0 ? null : lazyJavaClassMemberScope);
    }

    /* renamed from: j0 */
    public static /* synthetic */ u13 m60837j0(LazyJavaClassMemberScope lazyJavaClassMemberScope, m13 m13, xc3 xc3, Modality modality, int i, Object obj) {
        if ((i & 2) != 0) {
            xc3 = null;
        }
        return lazyJavaClassMemberScope.mo53557i0(m13, xc3, modality);
    }

    /* renamed from: A0 */
    public final boolean mo53529A0(C7428e eVar, C7425c cVar) {
        String c = ov3.m70793c(eVar, false, false, 2, (Object) null);
        C7425c a = cVar.mo50045a();
        vx2.m53590f(a, "builtinWithErasedParameters.original");
        if (!vx2.m53586b(c, ov3.m70793c(a, false, false, 2, (Object) null)) || mo53565o0(eVar, cVar)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (p000.r73.m71467d(r4) == false) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0074 A[SYNTHETIC] */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53530B0(kotlin.reflect.jvm.internal.impl.descriptors.C7428e r7) {
        /*
            r6 = this;
            r24 r0 = r7.getName()
            java.lang.String r1 = "function.name"
            p000.vx2.m53590f(r0, r1)
            java.util.List r0 = p000.cx4.m56585a(r0)
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x001b
        L_0x0019:
            r0 = r3
            goto L_0x0078
        L_0x001b:
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            r24 r1 = (p000.r24) r1
            java.util.Set r1 = r6.mo53582z0(r1)
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L_0x003b
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x003b
        L_0x0039:
            r1 = r3
            goto L_0x0075
        L_0x003b:
            java.util.Iterator r1 = r1.iterator()
        L_0x003f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r1.next()
            fx4 r4 = (p000.fx4) r4
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1 r5 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1
            r5.<init>(r7, r6)
            boolean r5 = r6.mo53563n0(r4, r5)
            if (r5 == 0) goto L_0x0071
            boolean r4 = r4.mo51761I()
            if (r4 != 0) goto L_0x006f
            r24 r4 = r7.getName()
            java.lang.String r4 = r4.mo65594d()
            java.lang.String r5 = "function.name.asString()"
            p000.vx2.m53590f(r4, r5)
            boolean r4 = p000.r73.m71467d(r4)
            if (r4 != 0) goto L_0x0071
        L_0x006f:
            r4 = r2
            goto L_0x0072
        L_0x0071:
            r4 = r3
        L_0x0072:
            if (r4 == 0) goto L_0x003f
            r1 = r2
        L_0x0075:
            if (r1 == 0) goto L_0x001f
            r0 = r2
        L_0x0078:
            if (r0 == 0) goto L_0x007b
            return r3
        L_0x007b:
            boolean r0 = r6.mo53567p0(r7)
            if (r0 != 0) goto L_0x008e
            boolean r0 = r6.mo53542K0(r7)
            if (r0 != 0) goto L_0x008e
            boolean r7 = r6.mo53570r0(r7)
            if (r7 != 0) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r2 = r3
        L_0x008f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.mo53530B0(kotlin.reflect.jvm.internal.impl.descriptors.e):boolean");
    }

    /* renamed from: C0 */
    public final C7428e mo53532C0(C7428e eVar, rc2<? super r24, ? extends Collection<? extends C7428e>> rc2, Collection<? extends C7428e> collection) {
        C7428e g0;
        C7425c k = BuiltinMethodsWithSpecialGenericSignature.m60658k(eVar);
        if (k == null || (g0 = mo53555g0(k, rc2)) == null) {
            return null;
        }
        if (!mo53530B0(g0)) {
            g0 = null;
        }
        if (g0 != null) {
            return mo53554f0(g0, k, collection);
        }
        return null;
    }

    /* renamed from: D0 */
    public final C7428e mo53533D0(C7428e eVar, rc2<? super r24, ? extends Collection<? extends C7428e>> rc2, r24 r24, Collection<? extends C7428e> collection) {
        C7428e eVar2 = (C7428e) SpecialBuiltinMembers.m60681d(eVar);
        if (eVar2 == null) {
            return null;
        }
        String b = SpecialBuiltinMembers.m60679b(eVar2);
        vx2.m53588d(b);
        r24 h = r24.m71445h(b);
        vx2.m53590f(h, "identifier(nameInJava)");
        for (C7428e l0 : (Collection) rc2.invoke(h)) {
            C7428e l02 = mo53560l0(l0, r24);
            if (mo53568q0(eVar2, l02)) {
                return mo53554f0(l02, eVar2, collection);
            }
        }
        return null;
    }

    /* renamed from: E0 */
    public final C7428e mo53534E0(C7428e eVar, rc2<? super r24, ? extends Collection<? extends C7428e>> rc2) {
        if (!eVar.isSuspend()) {
            return null;
        }
        r24 name = eVar.getName();
        vx2.m53590f(name, "descriptor.name");
        for (C7428e m0 : (Iterable) rc2.invoke(name)) {
            C7428e m02 = mo53561m0(m0);
            if (m02 == null || !mo53565o0(m02, eVar)) {
                m02 = null;
                continue;
            }
            if (m02 != null) {
                return m02;
            }
        }
        return null;
    }

    /* renamed from: F0 */
    public void mo53535F0(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        u77.m72644a(mo53618w().mo65296a().mo67009l(), ul3, mo53531C(), r24);
    }

    /* renamed from: G */
    public boolean mo53536G(JavaMethodDescriptor javaMethodDescriptor) {
        vx2.m53591g(javaMethodDescriptor, "<this>");
        if (this.f39502o.mo53390n()) {
            return false;
        }
        return mo53530B0(javaMethodDescriptor);
    }

    /* renamed from: G0 */
    public final q03 mo53537G0(y03 y03) {
        if0 y0 = mo53531C();
        q03 n1 = q03.m71141n1(y0, of3.m70255a(mo53618w(), y03), false, mo53618w().mo65296a().mo67017t().mo50460a(y03));
        vx2.m53590f(n1, "createJavaConstructor(\n …ce(constructor)\n        )");
        pf3 e = ContextKt.m60737e(mo53618w(), n1, y03, y0.mo51670o().size());
        LazyJavaScope.C7463b K = mo53612K(e, n1, y03.mo66995f());
        List<a17> o = y0.mo51670o();
        vx2.m53590f(o, "classDescriptor.declaredTypeParameters");
        List<h23> typeParameters = y03.getTypeParameters();
        ArrayList arrayList = new ArrayList(dk0.m43495u(typeParameters, 10));
        for (h23 a : typeParameters) {
            a17 a2 = e.mo65301f().mo51350a(a);
            vx2.m53588d(a2);
            arrayList.add(a2);
        }
        n1.mo51666l1(K.mo53630a(), v77.m73135c(y03.getVisibility()), CollectionsKt___CollectionsKt.m47350u0(o, arrayList));
        n1.mo53329S0(false);
        n1.mo53330T0(K.mo53631b());
        n1.mo53336a1(y0.mo51464n());
        e.mo65296a().mo67005h().mo66819c(y03, n1);
        return n1;
    }

    /* renamed from: H */
    public LazyJavaScope.C7462a mo53538H(m13 m13, List<? extends a17> list, xc3 xc3, List<? extends n87> list2) {
        vx2.m53591g(m13, "method");
        vx2.m53591g(list, "methodTypeParameters");
        vx2.m53591g(xc3, "returnType");
        vx2.m53591g(list2, "valueParameters");
        v16.C9433b b = mo53618w().mo65296a().mo67016s().mo66393b(m13, mo53531C(), xc3, (xc3) null, list2, list);
        vx2.m53590f(b, "c.components.signaturePr…dTypeParameters\n        )");
        xc3 d = b.mo66396d();
        vx2.m53590f(d, "propagated.returnType");
        xc3 c = b.mo66395c();
        List<n87> f = b.mo66398f();
        vx2.m53590f(f, "propagated.valueParameters");
        List<a17> e = b.mo66397e();
        vx2.m53590f(e, "propagated.typeParameters");
        boolean g = b.mo66399g();
        List<String> b2 = b.mo66394b();
        vx2.m53590f(b2, "propagated.errors");
        return new LazyJavaScope.C7462a(d, c, f, e, g, b2);
    }

    /* renamed from: H0 */
    public final JavaMethodDescriptor mo53539H0(w13 w13) {
        w13 w132 = w13;
        JavaMethodDescriptor j1 = JavaMethodDescriptor.m60723j1(mo53531C(), of3.m70255a(mo53618w(), w132), w13.getName(), mo53618w().mo65296a().mo67017t().mo50460a(w132), true);
        vx2.m53590f(j1, "createJavaMethod(\n      …omponent), true\n        )");
        JavaMethodDescriptor javaMethodDescriptor = j1;
        javaMethodDescriptor.mo52101i1((h85) null, mo53581z(), ck0.m33062j(), ck0.m33062j(), ck0.m33062j(), mo53618w().mo65302g().mo53660o(w13.getType(), l23.m63664d(TypeUsage.COMMON, false, (a17) null, 2, (Object) null)), Modality.Companion.mo53240a(false, false, true), ed1.f37510e, (Map<? extends C7420a.C7421a<?>, ?>) null);
        j1.mo53487m1(false, false);
        mo53618w().mo65296a().mo67005h().mo66817a(w132, j1);
        return j1;
    }

    /* renamed from: I0 */
    public final Collection<C7428e> mo53540I0(r24 r24) {
        Collection<m13> f = ((l31) mo53620y().invoke()).mo53499f(r24);
        ArrayList arrayList = new ArrayList(dk0.m43495u(f, 10));
        for (m13 I : f) {
            arrayList.add(mo53610I(I));
        }
        return arrayList;
    }

    /* renamed from: J0 */
    public final Collection<C7428e> mo53541J0(r24 r24) {
        boolean z;
        Set<C7428e> x0 = mo53579x0(r24);
        ArrayList arrayList = new ArrayList();
        for (T next : x0) {
            C7428e eVar = (C7428e) next;
            if (SpecialBuiltinMembers.m60678a(eVar) || BuiltinMethodsWithSpecialGenericSignature.m60658k(eVar) != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: K0 */
    public final boolean mo53542K0(C7428e eVar) {
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.f39394n;
        r24 name = eVar.getName();
        vx2.m53590f(name, PublicResolver.FUNC_NAME);
        if (!builtinMethodsWithSpecialGenericSignature.mo53431l(name)) {
            return false;
        }
        r24 name2 = eVar.getName();
        vx2.m53590f(name2, PublicResolver.FUNC_NAME);
        Set<C7428e> x0 = mo53579x0(name2);
        ArrayList<C7425c> arrayList = new ArrayList<>();
        for (C7428e k : x0) {
            C7425c k2 = BuiltinMethodsWithSpecialGenericSignature.m60658k(k);
            if (k2 != null) {
                arrayList.add(k2);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (C7425c A0 : arrayList) {
            if (mo53529A0(eVar, A0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: U */
    public final void mo53543U(List<n87> list, C7424b bVar, int i, m13 m13, xc3 xc3, xc3 xc32) {
        xc3 xc33;
        C6983dm b = C6983dm.f37317b.mo51228b();
        r24 name = m13.getName();
        xc3 n = x17.m73830n(xc3);
        vx2.m53590f(n, "makeNotNullable(returnType)");
        boolean L = m13.mo51623L();
        if (xc32 != null) {
            xc33 = x17.m73830n(xc32);
        } else {
            xc33 = null;
        }
        List<n87> list2 = list;
        list.add(new ValueParameterDescriptorImpl(bVar, (n87) null, i, b, name, n, L, false, false, xc33, mo53618w().mo65296a().mo67017t().mo50460a(m13)));
    }

    /* renamed from: V */
    public final void mo53544V(Collection<C7428e> collection, r24 r24, Collection<? extends C7428e> collection2, boolean z) {
        Collection<D> d = ad1.m55456d(r24, collection2, collection, mo53531C(), mo53618w().mo65296a().mo67000c(), mo53618w().mo65296a().mo67008k().mo52869a());
        vx2.m53590f(d, "resolveOverridesForNonSt….overridingUtil\n        )");
        if (!z) {
            collection.addAll(d);
            return;
        }
        List<T> u0 = CollectionsKt___CollectionsKt.m47350u0(collection, d);
        ArrayList arrayList = new ArrayList(dk0.m43495u(d, 10));
        for (D d2 : d) {
            C7428e eVar = (C7428e) SpecialBuiltinMembers.m60682e(d2);
            if (eVar == null) {
                vx2.m53590f(d2, "resolvedOverride");
            } else {
                vx2.m53590f(d2, "resolvedOverride");
                d2 = mo53554f0(d2, eVar, u0);
            }
            arrayList.add(d2);
        }
        collection.addAll(arrayList);
    }

    /* renamed from: W */
    public final void mo53545W(r24 r24, Collection<? extends C7428e> collection, Collection<? extends C7428e> collection2, Collection<C7428e> collection3, rc2<? super r24, ? extends Collection<? extends C7428e>> rc2) {
        for (C7428e eVar : collection2) {
            ak0.m55531a(collection3, mo53533D0(eVar, rc2, r24, collection));
            ak0.m55531a(collection3, mo53532C0(eVar, rc2, collection));
            ak0.m55531a(collection3, mo53534E0(eVar, rc2));
        }
    }

    /* renamed from: X */
    public final void mo53546X(Set<? extends fx4> set, Collection<fx4> collection, Set<fx4> set2, rc2<? super r24, ? extends Collection<? extends C7428e>> rc2) {
        for (fx4 fx4 : set) {
            u13 h0 = mo53556h0(fx4, rc2);
            if (h0 != null) {
                collection.add(h0);
                if (set2 != null) {
                    set2.add(fx4);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: Y */
    public final void mo53547Y(r24 r24, Collection<fx4> collection) {
        m13 m13 = (m13) CollectionsKt___CollectionsKt.m47301A0(((l31) mo53620y().invoke()).mo53499f(r24));
        if (m13 != null) {
            collection.add(m60837j0(this, m13, (xc3) null, Modality.FINAL, 2, (Object) null));
        }
    }

    /* renamed from: Z */
    public LinkedHashSet<r24> mo53562n(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        Collection<xc3> g = mo53531C().mo50046g().mo51811g();
        vx2.m53590f(g, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet<r24> linkedHashSet = new LinkedHashSet<>();
        for (xc3 m : g) {
            hk0.m45275z(linkedHashSet, m.mo51146m().mo50860a());
        }
        linkedHashSet.addAll(((l31) mo53620y().invoke()).mo53494a());
        linkedHashSet.addAll(((l31) mo53620y().invoke()).mo53496c());
        linkedHashSet.addAll(mo53559l(yc1, rc2));
        linkedHashSet.addAll(mo53618w().mo65296a().mo67020w().mo51509c(mo53531C()));
        return linkedHashSet;
    }

    /* renamed from: a0 */
    public ClassDeclaredMemberIndex mo53566p() {
        return new ClassDeclaredMemberIndex(this.f39502o, LazyJavaClassMemberScope$computeMemberIndex$1.INSTANCE);
    }

    /* renamed from: b */
    public Collection<fx4> mo50861b(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        mo53535F0(r24, ul3);
        return super.mo50861b(r24, ul3);
    }

    /* renamed from: b0 */
    public final Collection<xc3> mo53550b0() {
        if (!this.f39503p) {
            return mo53618w().mo65296a().mo67008k().mo52870d().mo50561g(mo53531C());
        }
        Collection<xc3> g = mo53531C().mo50046g().mo51811g();
        vx2.m53590f(g, "ownerDescriptor.typeConstructor.supertypes");
        return g;
    }

    /* renamed from: c */
    public Collection<C7428e> mo50862c(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        mo53535F0(r24, ul3);
        return super.mo50862c(r24, ul3);
    }

    /* renamed from: c0 */
    public final List<n87> mo53551c0(ff0 ff0) {
        Pair pair;
        Collection<m13> B = this.f39502o.mo53369B();
        ArrayList arrayList = new ArrayList(B.size());
        int i = 1;
        f23 d = l23.m63664d(TypeUsage.COMMON, true, (a17) null, 2, (Object) null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (T next : B) {
            if (vx2.m53586b(((m13) next).getName(), t73.f44655c)) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.component1();
        List<m13> list2 = (List) pair2.component2();
        list.size();
        m13 m13 = (m13) CollectionsKt___CollectionsKt.m47331b0(list);
        if (m13 != null) {
            e23 returnType = m13.getReturnType();
            if (returnType instanceof n03) {
                n03 n03 = (n03) returnType;
                pair = new Pair(mo53618w().mo65302g().mo53658k(n03, d, true), mo53618w().mo65302g().mo53660o(n03.mo56339m(), d));
            } else {
                pair = new Pair(mo53618w().mo65302g().mo53660o(returnType, d), null);
            }
            mo53543U(arrayList, ff0, 0, m13, (xc3) pair.component1(), (xc3) pair.component2());
        }
        int i2 = 0;
        if (m13 == null) {
            i = 0;
        }
        for (m13 m132 : list2) {
            mo53543U(arrayList, ff0, i2 + i, m132, mo53618w().mo65302g().mo53660o(m132.getReturnType(), d), (xc3) null);
            i2++;
        }
        return arrayList;
    }

    /* renamed from: d0 */
    public final ef0 mo53552d0() {
        List<n87> list;
        boolean n = this.f39502o.mo53390n();
        if ((this.f39502o.mo53371I() || !this.f39502o.mo53392q()) && !n) {
            return null;
        }
        if0 y0 = mo53531C();
        q03 n1 = q03.m71141n1(y0, C6983dm.f37317b.mo51228b(), true, mo53618w().mo65296a().mo67017t().mo50460a(this.f39502o));
        vx2.m53590f(n1, "createJavaConstructor(\n ….source(jClass)\n        )");
        if (n) {
            list = mo53551c0(n1);
        } else {
            list = Collections.emptyList();
        }
        n1.mo53330T0(false);
        n1.mo51665k1(list, mo53577v0(y0));
        n1.mo53329S0(true);
        n1.mo53336a1(y0.mo51464n());
        mo53618w().mo65296a().mo67005h().mo66819c(this.f39502o, n1);
        return n1;
    }

    /* renamed from: e */
    public eg0 mo50864e(r24 r24, ul3 ul3) {
        ws3<r24, jf0> ws3;
        jf0 invoke;
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        mo53535F0(r24, ul3);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) mo53606B();
        if (lazyJavaClassMemberScope == null || (ws3 = lazyJavaClassMemberScope.f39507t) == null || (invoke = ws3.invoke(r24)) == null) {
            return this.f39507t.invoke(r24);
        }
        return invoke;
    }

    /* renamed from: e0 */
    public final ef0 mo53553e0() {
        if0 y0 = mo53531C();
        q03 n1 = q03.m71141n1(y0, C6983dm.f37317b.mo51228b(), true, mo53618w().mo65296a().mo67017t().mo50460a(this.f39502o));
        vx2.m53590f(n1, "createJavaConstructor(\n ….source(jClass)\n        )");
        List<n87> k0 = mo53558k0(n1);
        n1.mo53330T0(false);
        n1.mo51665k1(k0, mo53577v0(y0));
        n1.mo53329S0(false);
        n1.mo53336a1(y0.mo51464n());
        return n1;
    }

    /* renamed from: f0 */
    public final C7428e mo53554f0(C7428e eVar, C7420a aVar, Collection<? extends C7428e> collection) {
        boolean z;
        boolean z2 = false;
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C7428e eVar2 = (C7428e) it.next();
                if (vx2.m53586b(eVar, eVar2) || eVar2.mo51325n0() != null || !mo53565o0(eVar2, aVar)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = true;
        if (z2) {
            return eVar;
        }
        Object build = eVar.mo50951s().mo50962i().build();
        vx2.m53588d(build);
        return (C7428e) build;
    }

    /* renamed from: g0 */
    public final C7428e mo53555g0(C7425c cVar, rc2<? super r24, ? extends Collection<? extends C7428e>> rc2) {
        Object obj;
        r24 name = cVar.getName();
        vx2.m53590f(name, "overridden.name");
        Iterator it = ((Iterable) rc2.invoke(name)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (mo53529A0((C7428e) obj, cVar)) {
                break;
            }
        }
        C7428e eVar = (C7428e) obj;
        if (eVar == null) {
            return null;
        }
        C7425c.C7426a<? extends C7428e> s = eVar.mo50951s();
        List<n87> f = cVar.mo51763f();
        vx2.m53590f(f, "overridden.valueParameters");
        ArrayList arrayList = new ArrayList(dk0.m43495u(f, 10));
        for (n87 type : f) {
            arrayList.add(type.getType());
        }
        List<n87> f2 = eVar.mo51763f();
        vx2.m53590f(f2, "override.valueParameters");
        s.mo50954b(z67.m74801a(arrayList, f2, cVar));
        s.mo50973t();
        s.mo50965l();
        s.mo50961h(JavaMethodDescriptor.f39446u1, Boolean.TRUE);
        return (C7428e) s.build();
    }

    /* renamed from: h0 */
    public final u13 mo53556h0(fx4 fx4, rc2<? super r24, ? extends Collection<? extends C7428e>> rc2) {
        C7428e eVar;
        mx4 mx4 = null;
        if (!mo53563n0(fx4, rc2)) {
            return null;
        }
        C7428e t0 = mo53574t0(fx4, rc2);
        vx2.m53588d(t0);
        if (fx4.mo51761I()) {
            eVar = mo53576u0(fx4, rc2);
            vx2.m53588d(eVar);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            eVar.mo51326p();
            t0.mo51326p();
        }
        h13 h13 = new h13(mo53531C(), t0, eVar, fx4);
        xc3 returnType = t0.getReturnType();
        vx2.m53588d(returnType);
        h13 h132 = h13;
        h132.mo52050V0(returnType, ck0.m33062j(), mo53581z(), (h85) null, ck0.m33062j());
        jx4 j = wc1.m73550j(h132, t0.getAnnotations(), false, false, false, t0.getSource());
        j.mo51313H0(t0);
        j.mo52818K0(h13.getType());
        vx2.m53590f(j, "createGetter(\n          …escriptor.type)\n        }");
        if (eVar != null) {
            List<n87> f = eVar.mo51763f();
            vx2.m53590f(f, "setterMethod.valueParameters");
            n87 n87 = (n87) CollectionsKt___CollectionsKt.m47331b0(f);
            if (n87 != null) {
                mx4 = wc1.m73552l(h13, eVar.getAnnotations(), n87.getAnnotations(), false, false, false, eVar.getVisibility(), eVar.getSource());
                mx4.mo51313H0(eVar);
            } else {
                throw new AssertionError("No parameter found for " + eVar);
            }
        }
        h13.mo52044O0(j, mx4);
        return h13;
    }

    /* renamed from: i0 */
    public final u13 mo53557i0(m13 m13, xc3 xc3, Modality modality) {
        xc3 xc32;
        m13 m132 = m13;
        u13 Z0 = u13.m72514Z0(mo53531C(), of3.m70255a(mo53618w(), m132), modality, v77.m73135c(m13.getVisibility()), false, m13.getName(), mo53618w().mo65296a().mo67017t().mo50460a(m132), false);
        vx2.m53590f(Z0, "create(\n            owne…inal = */ false\n        )");
        jx4 d = wc1.m73544d(Z0, C6983dm.f37317b.mo51228b());
        vx2.m53590f(d, "createDefaultGetter(prop…iptor, Annotations.EMPTY)");
        Z0.mo52044O0(d, (lx4) null);
        if (xc3 == null) {
            xc32 = mo53615q(m132, ContextKt.m60738f(mo53618w(), Z0, m13, 0, 4, (Object) null));
        } else {
            xc32 = xc3;
        }
        Z0.mo52050V0(xc32, ck0.m33062j(), mo53581z(), (h85) null, ck0.m33062j());
        d.mo52818K0(xc32);
        return Z0;
    }

    /* renamed from: k0 */
    public final List<n87> mo53558k0(ff0 ff0) {
        xc3 xc3;
        Collection<w13> l = this.f39502o.mo53389l();
        ArrayList arrayList = new ArrayList(l.size());
        xc3 xc32 = null;
        f23 d = l23.m63664d(TypeUsage.COMMON, false, (a17) null, 2, (Object) null);
        int i = 0;
        for (w13 next : l) {
            int i2 = i + 1;
            xc3 o = mo53618w().mo65302g().mo53660o(next.getType(), d);
            if (next.mo52653a()) {
                xc3 = mo53618w().mo65296a().mo67010m().mo51535k().mo53171k(o);
            } else {
                xc3 = xc32;
            }
            ValueParameterDescriptorImpl valueParameterDescriptorImpl = r6;
            ValueParameterDescriptorImpl valueParameterDescriptorImpl2 = new ValueParameterDescriptorImpl(ff0, (n87) null, i, C6983dm.f37317b.mo51228b(), next.getName(), o, false, false, false, xc3, mo53618w().mo65296a().mo67017t().mo50460a(next));
            arrayList.add(valueParameterDescriptorImpl);
            i = i2;
            xc32 = null;
        }
        return arrayList;
    }

    /* renamed from: l */
    public Set<r24> mo53559l(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        return oy5.m49611k((Set) this.f39505r.invoke(), ((Map) this.f39506s.invoke()).keySet());
    }

    /* renamed from: l0 */
    public final C7428e mo53560l0(C7428e eVar, r24 r24) {
        C7425c.C7426a<? extends C7428e> s = eVar.mo50951s();
        s.mo50972s(r24);
        s.mo50973t();
        s.mo50965l();
        Object build = s.build();
        vx2.m53588d(build);
        return (C7428e) build;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.descriptors.C7428e mo53561m0(kotlin.reflect.jvm.internal.impl.descriptors.C7428e r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.mo51763f()
            java.lang.String r1 = "valueParameters"
            p000.vx2.m53590f(r0, r1)
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47342m0(r0)
            n87 r0 = (p000.n87) r0
            r2 = 0
            if (r0 == 0) goto L_0x007e
            xc3 r3 = r0.getType()
            yz6 r3 = r3.mo51134H0()
            eg0 r3 = r3.mo51180d()
            if (r3 == 0) goto L_0x0035
            v82 r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m62448i(r3)
            if (r3 == 0) goto L_0x0035
            boolean r4 = r3.mo66447f()
            if (r4 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r3 = r2
        L_0x002e:
            if (r3 == 0) goto L_0x0035
            u82 r3 = r3.mo66454l()
            goto L_0x0036
        L_0x0035:
            r3 = r2
        L_0x0036:
            u82 r4 = kotlin.reflect.jvm.internal.impl.builtins.C7395c.f39108m
            boolean r3 = p000.vx2.m53586b(r3, r4)
            if (r3 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            if (r0 != 0) goto L_0x0043
            goto L_0x007e
        L_0x0043:
            kotlin.reflect.jvm.internal.impl.descriptors.c$a r2 = r6.mo50951s()
            java.util.List r6 = r6.mo51763f()
            p000.vx2.m53590f(r6, r1)
            r1 = 1
            java.util.List r6 = kotlin.collections.CollectionsKt___CollectionsKt.m47324U(r6, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.c$a r6 = r2.mo50954b(r6)
            xc3 r0 = r0.getType()
            java.util.List r0 = r0.mo51132F0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            f17 r0 = (p000.f17) r0
            xc3 r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.c$a r6 = r6.mo50970q(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.c r6 = r6.build()
            kotlin.reflect.jvm.internal.impl.descriptors.e r6 = (kotlin.reflect.jvm.internal.impl.descriptors.C7428e) r6
            r0 = r6
            h26 r0 = (p000.h26) r0
            if (r0 != 0) goto L_0x007a
            goto L_0x007d
        L_0x007a:
            r0.mo53337b1(r1)
        L_0x007d:
            return r6
        L_0x007e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.mo53561m0(kotlin.reflect.jvm.internal.impl.descriptors.e):kotlin.reflect.jvm.internal.impl.descriptors.e");
    }

    /* renamed from: n0 */
    public final boolean mo53563n0(fx4 fx4, rc2<? super r24, ? extends Collection<? extends C7428e>> rc2) {
        if (b13.m55700a(fx4)) {
            return false;
        }
        C7428e t0 = mo53574t0(fx4, rc2);
        C7428e u0 = mo53576u0(fx4, rc2);
        if (t0 == null) {
            return false;
        }
        if (!fx4.mo51761I()) {
            return true;
        }
        if (u0 == null || u0.mo51326p() != t0.mo51326p()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public void mo53564o(Collection<C7428e> collection, r24 r24) {
        vx2.m53591g(collection, "result");
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        if (this.f39502o.mo53391p() && ((l31) mo53620y().invoke()).mo53498e(r24) != null) {
            boolean z = true;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C7428e) it.next()).mo51763f().isEmpty()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                w13 e = ((l31) mo53620y().invoke()).mo53498e(r24);
                vx2.m53588d(e);
                collection.add(mo53539H0(e));
            }
        }
        mo53618w().mo65296a().mo67020w().mo51510d(mo53531C(), r24, collection);
    }

    /* renamed from: o0 */
    public final boolean mo53565o0(C7420a aVar, C7420a aVar2) {
        OverridingUtil.OverrideCompatibilityInfo.Result c = OverridingUtil.f40070f.mo55052F(aVar2, aVar, true).mo55056c();
        vx2.m53590f(c, "DEFAULT.isOverridableByW…iptor, this, true).result");
        if (c != OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE || i13.f38316a.mo52365a(aVar2, aVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: p0 */
    public final boolean mo53567p0(C7428e eVar) {
        SpecialGenericSignatures.C7449a aVar = SpecialGenericSignatures.f39411a;
        r24 name = eVar.getName();
        vx2.m53590f(name, PublicResolver.FUNC_NAME);
        r24 b = aVar.mo53460b(name);
        if (b == null) {
            return false;
        }
        Set<C7428e> x0 = mo53579x0(b);
        ArrayList<C7428e> arrayList = new ArrayList<>();
        for (T next : x0) {
            if (SpecialBuiltinMembers.m60678a((C7428e) next)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        C7428e l0 = mo53560l0(eVar, b);
        if (arrayList.isEmpty()) {
            return false;
        }
        for (C7428e q0 : arrayList) {
            if (mo53568q0(q0, l0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q0 */
    public final boolean mo53568q0(C7428e eVar, C7425c cVar) {
        if (BuiltinMethodsWithDifferentJvmName.f39393n.mo53428k(eVar)) {
            cVar = cVar.mo50045a();
        }
        vx2.m53590f(cVar, "if (superDescriptor.isRe…iginal else subDescriptor");
        return mo53565o0(cVar, eVar);
    }

    /* renamed from: r */
    public void mo53569r(Collection<C7428e> collection, r24 r24) {
        boolean z;
        vx2.m53591g(collection, "result");
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        Set<C7428e> x0 = mo53579x0(r24);
        if (!SpecialGenericSignatures.f39411a.mo53469k(r24) && !BuiltinMethodsWithSpecialGenericSignature.f39394n.mo53431l(r24)) {
            if (!(x0 instanceof Collection) || !x0.isEmpty()) {
                Iterator<T> it = x0.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C7425c) it.next()).isSuspend()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (T next : x0) {
                    if (mo53530B0((C7428e) next)) {
                        arrayList.add(next);
                    }
                }
                mo53544V(collection, r24, arrayList, false);
                return;
            }
        }
        w46 a = w46.f45438e.mo66631a();
        Collection<D> d = ad1.m55456d(r24, x0, ck0.m33062j(), mo53531C(), gr1.f38061a, mo53618w().mo65296a().mo67008k().mo52869a());
        vx2.m53590f(d, "resolveOverridesForNonSt….overridingUtil\n        )");
        r24 r242 = r24;
        Collection<C7428e> collection2 = collection;
        Collection<D> collection3 = d;
        mo53545W(r242, collection2, collection3, collection, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(this));
        mo53545W(r242, collection2, collection3, a, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(this));
        ArrayList arrayList2 = new ArrayList();
        for (T next2 : x0) {
            if (mo53530B0((C7428e) next2)) {
                arrayList2.add(next2);
            }
        }
        mo53544V(collection, r24, CollectionsKt___CollectionsKt.m47350u0(arrayList2, a), true);
    }

    /* renamed from: r0 */
    public final boolean mo53570r0(C7428e eVar) {
        boolean z;
        C7428e m0 = mo53561m0(eVar);
        if (m0 == null) {
            return false;
        }
        r24 name = eVar.getName();
        vx2.m53590f(name, PublicResolver.FUNC_NAME);
        Set<C7428e> x0 = mo53579x0(name);
        if ((x0 instanceof Collection) && x0.isEmpty()) {
            return false;
        }
        for (C7428e eVar2 : x0) {
            if (!eVar2.isSuspend() || !mo53565o0(m0, eVar2)) {
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
        return false;
    }

    /* renamed from: s */
    public void mo53571s(r24 r24, Collection<fx4> collection) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(collection, "result");
        if (this.f39502o.mo53390n()) {
            mo53547Y(r24, collection);
        }
        Set<fx4> z0 = mo53582z0(r24);
        if (!z0.isEmpty()) {
            w46.C9484b bVar = w46.f45438e;
            w46 a = bVar.mo66631a();
            w46 a2 = bVar.mo66631a();
            mo53546X(z0, collection, a, new LazyJavaClassMemberScope$computeNonDeclaredProperties$1(this));
            mo53546X(oy5.m49609i(z0, a), a2, (Set<fx4>) null, new LazyJavaClassMemberScope$computeNonDeclaredProperties$2(this));
            Collection<D> d = ad1.m55456d(r24, oy5.m49611k(z0, a2), collection, mo53531C(), mo53618w().mo65296a().mo67000c(), mo53618w().mo65296a().mo67008k().mo52869a());
            vx2.m53590f(d, "resolveOverridesForNonSt…rridingUtil\n            )");
            collection.addAll(d);
        }
    }

    /* renamed from: s0 */
    public final C7428e mo53572s0(fx4 fx4, String str, rc2<? super r24, ? extends Collection<? extends C7428e>> rc2) {
        C7428e eVar;
        boolean z;
        r24 h = r24.m71445h(str);
        vx2.m53590f(h, "identifier(getterName)");
        Iterator it = ((Iterable) rc2.invoke(h)).iterator();
        do {
            eVar = null;
            if (!it.hasNext()) {
                break;
            }
            C7428e eVar2 = (C7428e) it.next();
            if (eVar2.mo51763f().size() == 0) {
                yc3 yc3 = yc3.f46193a;
                xc3 returnType = eVar2.getReturnType();
                if (returnType == null) {
                    z = false;
                } else {
                    z = yc3.mo55823c(returnType, fx4.getType());
                }
                if (z) {
                    eVar = eVar2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (eVar == null);
        return eVar;
    }

    /* renamed from: t */
    public Set<r24> mo53573t(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        if (this.f39502o.mo53390n()) {
            return mo50860a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((l31) mo53620y().invoke()).mo53497d());
        Collection<xc3> g = mo53531C().mo50046g().mo51811g();
        vx2.m53590f(g, "ownerDescriptor.typeConstructor.supertypes");
        for (xc3 m : g) {
            hk0.m45275z(linkedHashSet, m.mo51146m().mo50863d());
        }
        return linkedHashSet;
    }

    /* renamed from: t0 */
    public final C7428e mo53574t0(fx4 fx4, rc2<? super r24, ? extends Collection<? extends C7428e>> rc2) {
        ix4 ix4;
        ix4 getter = fx4.getGetter();
        String str = null;
        if (getter != null) {
            ix4 = (ix4) SpecialBuiltinMembers.m60681d(getter);
        } else {
            ix4 = null;
        }
        if (ix4 != null) {
            str = ClassicBuiltinSpecialProperties.f39395a.mo53434a(ix4);
        }
        if (str != null && !SpecialBuiltinMembers.m60683f(mo53531C(), ix4)) {
            return mo53572s0(fx4, str, rc2);
        }
        String d = fx4.getName().mo65594d();
        vx2.m53590f(d, "name.asString()");
        return mo53572s0(fx4, r73.m71465b(d), rc2);
    }

    public String toString() {
        return "Lazy Java member scope for " + this.f39502o.mo53383e();
    }

    /* renamed from: u0 */
    public final C7428e mo53576u0(fx4 fx4, rc2<? super r24, ? extends Collection<? extends C7428e>> rc2) {
        C7428e eVar;
        xc3 returnType;
        String d = fx4.getName().mo65594d();
        vx2.m53590f(d, "name.asString()");
        r24 h = r24.m71445h(r73.m71468e(d));
        vx2.m53590f(h, "identifier(JvmAbi.setterName(name.asString()))");
        Iterator it = ((Iterable) rc2.invoke(h)).iterator();
        do {
            eVar = null;
            if (!it.hasNext()) {
                break;
            }
            C7428e eVar2 = (C7428e) it.next();
            if (eVar2.mo51763f().size() == 1 && (returnType = eVar2.getReturnType()) != null && C7389b.m60115B0(returnType)) {
                yc3 yc3 = yc3.f46193a;
                List<n87> f = eVar2.mo51763f();
                vx2.m53590f(f, "descriptor.valueParameters");
                if (yc3.mo55822b(((n87) CollectionsKt___CollectionsKt.m47355z0(f)).getType(), fx4.getType())) {
                    eVar = eVar2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (eVar == null);
        return eVar;
    }

    /* renamed from: v0 */
    public final fd1 mo53577v0(if0 if0) {
        fd1 visibility = if0.getVisibility();
        vx2.m53590f(visibility, "classDescriptor.visibility");
        if (!vx2.m53586b(visibility, c13.f37031b)) {
            return visibility;
        }
        fd1 fd1 = c13.f37032c;
        vx2.m53590f(fd1, "PROTECTED_AND_PACKAGE");
        return fd1;
    }

    /* renamed from: w0 */
    public final q84<List<ef0>> mo53578w0() {
        return this.f39504q;
    }

    /* renamed from: x0 */
    public final Set<C7428e> mo53579x0(r24 r24) {
        Collection<xc3> b0 = mo53550b0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (xc3 m : b0) {
            hk0.m45275z(linkedHashSet, m.mo51146m().mo50862c(r24, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    /* renamed from: y0 */
    public if0 mo53531C() {
        return this.f39501n;
    }

    /* renamed from: z */
    public h85 mo53581z() {
        return dd1.m56820l(mo53531C());
    }

    /* renamed from: z0 */
    public final Set<fx4> mo53582z0(r24 r24) {
        Collection<xc3> b0 = mo53550b0();
        ArrayList arrayList = new ArrayList();
        for (xc3 m : b0) {
            Collection<? extends fx4> b = m.mo51146m().mo50861b(r24, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(b, 10));
            for (fx4 add : b) {
                arrayList2.add(add);
            }
            hk0.m45275z(arrayList, arrayList2);
        }
        return CollectionsKt___CollectionsKt.m47315O0(arrayList);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(pf3 pf3, if0 if0, p03 p03, boolean z, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(pf3, lazyJavaClassMemberScope);
        vx2.m53591g(pf3, "c");
        vx2.m53591g(if0, "ownerDescriptor");
        vx2.m53591g(p03, "jClass");
        this.f39501n = if0;
        this.f39502o = p03;
        this.f39503p = z;
        this.f39504q = pf3.mo65300e().mo51164i(new LazyJavaClassMemberScope$constructors$1(this, pf3));
        this.f39505r = pf3.mo65300e().mo51164i(new LazyJavaClassMemberScope$nestedClassIndex$1(this));
        this.f39506s = pf3.mo65300e().mo51164i(new LazyJavaClassMemberScope$enumEntryIndex$1(this));
        this.f39507t = pf3.mo65300e().mo51159d(new LazyJavaClassMemberScope$nestedClasses$1(this, pf3));
    }
}
