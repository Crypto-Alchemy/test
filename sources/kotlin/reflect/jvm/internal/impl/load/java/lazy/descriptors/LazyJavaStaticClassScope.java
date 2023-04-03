package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.k01;

/* compiled from: LazyJavaStaticClassScope.kt */
public final class LazyJavaStaticClassScope extends qf3 {

    /* renamed from: n */
    public final p03 f39550n;

    /* renamed from: o */
    public final LazyJavaClassDescriptor f39551o;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$a */
    /* compiled from: LazyJavaStaticClassScope.kt */
    public static final class C7465a extends k01.C7324b<if0, r37> {

        /* renamed from: a */
        public final /* synthetic */ if0 f39552a;

        /* renamed from: b */
        public final /* synthetic */ Set<R> f39553b;

        /* renamed from: c */
        public final /* synthetic */ rc2<MemberScope, Collection<R>> f39554c;

        public C7465a(if0 if0, Set<R> set, rc2<? super MemberScope, ? extends Collection<? extends R>> rc2) {
            this.f39552a = if0;
            this.f39553b = set;
            this.f39554c = rc2;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo52830a() {
            mo53643e();
            return r37.f33317a;
        }

        /* renamed from: d */
        public boolean mo52831c(if0 if0) {
            vx2.m53591g(if0, "current");
            if (if0 == this.f39552a) {
                return true;
            }
            MemberScope g0 = if0.mo52347g0();
            vx2.m53590f(g0, "current.staticScope");
            if (!(g0 instanceof qf3)) {
                return true;
            }
            this.f39553b.addAll(this.f39554c.invoke(g0));
            return false;
        }

        /* renamed from: e */
        public void mo53643e() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(pf3 pf3, p03 p03, LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(pf3);
        vx2.m53591g(pf3, "c");
        vx2.m53591g(p03, "jClass");
        vx2.m53591g(lazyJavaClassDescriptor, "ownerDescriptor");
        this.f39550n = p03;
        this.f39551o = lazyJavaClassDescriptor;
    }

    /* renamed from: M */
    public ClassDeclaredMemberIndex mo53566p() {
        return new ClassDeclaredMemberIndex(this.f39550n, LazyJavaStaticClassScope$computeMemberIndex$1.INSTANCE);
    }

    /* renamed from: N */
    public final <R> Set<R> mo53638N(if0 if0, Set<R> set, rc2<? super MemberScope, ? extends Collection<? extends R>> rc2) {
        k01.m59629b(bk0.m32598e(if0), LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1.f39555a, new C7465a(if0, set, rc2));
        return set;
    }

    /* renamed from: O */
    public LazyJavaClassDescriptor mo53531C() {
        return this.f39551o;
    }

    /* renamed from: P */
    public final fx4 mo53640P(fx4 fx4) {
        if (fx4.getKind().isReal()) {
            return fx4;
        }
        Collection<? extends fx4> d = fx4.mo51659d();
        vx2.m53590f(d, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(dk0.m43495u(d, 10));
        for (fx4 fx42 : d) {
            vx2.m53590f(fx42, "it");
            arrayList.add(mo53640P(fx42));
        }
        return (fx4) CollectionsKt___CollectionsKt.m47355z0(CollectionsKt___CollectionsKt.m47322S(arrayList));
    }

    /* renamed from: Q */
    public final Set<C7428e> mo53641Q(r24 r24, if0 if0) {
        LazyJavaStaticClassScope b = z67.m74802b(if0);
        if (b == null) {
            return ny5.m49095e();
        }
        return CollectionsKt___CollectionsKt.m47315O0(b.mo50862c(r24, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
    }

    /* renamed from: e */
    public eg0 mo50864e(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return null;
    }

    /* renamed from: l */
    public Set<r24> mo53559l(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        return ny5.m49095e();
    }

    /* renamed from: n */
    public Set<r24> mo53562n(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        Set<r24> set;
        vx2.m53591g(yc1, "kindFilter");
        Set<r24> N0 = CollectionsKt___CollectionsKt.m47314N0(((l31) mo53620y().invoke()).mo53494a());
        LazyJavaStaticClassScope b = z67.m74802b(mo53531C());
        if (b != null) {
            set = b.mo50860a();
        } else {
            set = null;
        }
        if (set == null) {
            set = ny5.m49095e();
        }
        N0.addAll(set);
        if (this.f39550n.mo53394v()) {
            N0.addAll(ck0.m33065m(C7395c.f39100e, C7395c.f39099d));
        }
        N0.addAll(mo53618w().mo65296a().mo67020w().mo51511e(mo53531C()));
        return N0;
    }

    /* renamed from: o */
    public void mo53564o(Collection<C7428e> collection, r24 r24) {
        vx2.m53591g(collection, "result");
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        mo53618w().mo65296a().mo67020w().mo51507a(mo53531C(), r24, collection);
    }

    /* renamed from: r */
    public void mo53569r(Collection<C7428e> collection, r24 r24) {
        vx2.m53591g(collection, "result");
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        Collection<D> e = ad1.m55457e(r24, mo53641Q(r24, mo53531C()), collection, mo53531C(), mo53618w().mo65296a().mo67000c(), mo53618w().mo65296a().mo67008k().mo52869a());
        vx2.m53590f(e, "resolveOverridesForStati….overridingUtil\n        )");
        collection.addAll(e);
        if (!this.f39550n.mo53394v()) {
            return;
        }
        if (vx2.m53586b(r24, C7395c.f39100e)) {
            C7428e f = wc1.m73546f(mo53531C());
            vx2.m53590f(f, "createEnumValueOfMethod(ownerDescriptor)");
            collection.add(f);
        } else if (vx2.m53586b(r24, C7395c.f39099d)) {
            C7428e g = wc1.m73547g(mo53531C());
            vx2.m53590f(g, "createEnumValuesMethod(ownerDescriptor)");
            collection.add(g);
        }
    }

    /* renamed from: s */
    public void mo53571s(r24 r24, Collection<fx4> collection) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(collection, "result");
        Set N = mo53638N(mo53531C(), new LinkedHashSet(), new C7466xd2f8c9a5(r24));
        if (!collection.isEmpty()) {
            Collection<D> e = ad1.m55457e(r24, N, collection, mo53531C(), mo53618w().mo65296a().mo67000c(), mo53618w().mo65296a().mo67008k().mo52869a());
            vx2.m53590f(e, "resolveOverridesForStati…ingUtil\n                )");
            collection.addAll(e);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : N) {
            fx4 P = mo53640P((fx4) next);
            Object obj = linkedHashMap.get(P);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(P, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : linkedHashMap.entrySet()) {
            Collection<D> e2 = ad1.m55457e(r24, (Collection) value.getValue(), collection, mo53531C(), mo53618w().mo65296a().mo67000c(), mo53618w().mo65296a().mo67008k().mo52869a());
            vx2.m53590f(e2, "resolveOverridesForStati…ingUtil\n                )");
            hk0.m45275z(arrayList, e2);
        }
        collection.addAll(arrayList);
    }

    /* renamed from: t */
    public Set<r24> mo53573t(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        Set<r24> N0 = CollectionsKt___CollectionsKt.m47314N0(((l31) mo53620y().invoke()).mo53497d());
        mo53638N(mo53531C(), N0, LazyJavaStaticClassScope$computePropertyNames$1$1.INSTANCE);
        return N0;
    }
}
