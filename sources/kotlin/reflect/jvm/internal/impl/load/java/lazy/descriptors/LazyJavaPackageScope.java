package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.l31;

/* compiled from: LazyJavaPackageScope.kt */
public final class LazyJavaPackageScope extends qf3 {

    /* renamed from: n */
    public final s13 f39519n;

    /* renamed from: o */
    public final LazyJavaPackageFragment f39520o;

    /* renamed from: p */
    public final gc4<Set<String>> f39521p;

    /* renamed from: q */
    public final ws3<C7457a, if0> f39522q;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$a */
    /* compiled from: LazyJavaPackageScope.kt */
    public static final class C7457a {

        /* renamed from: a */
        public final r24 f39523a;

        /* renamed from: b */
        public final p03 f39524b;

        public C7457a(r24 r24, p03 p03) {
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            this.f39523a = r24;
            this.f39524b = p03;
        }

        /* renamed from: a */
        public final p03 mo53599a() {
            return this.f39524b;
        }

        /* renamed from: b */
        public final r24 mo53600b() {
            return this.f39523a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7457a) || !vx2.m53586b(this.f39523a, ((C7457a) obj).f39523a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f39523a.hashCode();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b */
    /* compiled from: LazyJavaPackageScope.kt */
    public static abstract class C7458b {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$a */
        /* compiled from: LazyJavaPackageScope.kt */
        public static final class C7459a extends C7458b {

            /* renamed from: a */
            public final if0 f39525a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C7459a(if0 if0) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(if0, "descriptor");
                this.f39525a = if0;
            }

            /* renamed from: a */
            public final if0 mo53603a() {
                return this.f39525a;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$b */
        /* compiled from: LazyJavaPackageScope.kt */
        public static final class C7460b extends C7458b {

            /* renamed from: a */
            public static final C7460b f39526a = new C7460b();

            public C7460b() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$c */
        /* compiled from: LazyJavaPackageScope.kt */
        public static final class C7461c extends C7458b {

            /* renamed from: a */
            public static final C7461c f39527a = new C7461c();

            public C7461c() {
                super((DefaultConstructorMarker) null);
            }
        }

        public C7458b() {
        }

        public /* synthetic */ C7458b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(pf3 pf3, s13 s13, LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(pf3);
        vx2.m53591g(pf3, "c");
        vx2.m53591g(s13, "jPackage");
        vx2.m53591g(lazyJavaPackageFragment, "ownerDescriptor");
        this.f39519n = s13;
        this.f39520o = lazyJavaPackageFragment;
        this.f39521p = pf3.mo65300e().mo51162g(new LazyJavaPackageScope$knownClassNamesInPackage$1(pf3, this));
        this.f39522q = pf3.mo65300e().mo51159d(new LazyJavaPackageScope$classes$1(this, pf3));
    }

    /* renamed from: N */
    public final if0 mo53594N(r24 r24, p03 p03) {
        if (!n66.f41102a.mo56380a(r24)) {
            return null;
        }
        Set set = (Set) this.f39521p.invoke();
        if (p03 != null || set == null || set.contains(r24.mo65594d())) {
            return this.f39522q.invoke(new C7457a(r24, p03));
        }
        return null;
    }

    /* renamed from: O */
    public final if0 mo53595O(p03 p03) {
        vx2.m53591g(p03, "javaClass");
        return mo53594N(p03.getName(), p03);
    }

    /* renamed from: P */
    public if0 mo50864e(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return mo53594N(r24, (p03) null);
    }

    /* renamed from: Q */
    public LazyJavaPackageFragment mo53531C() {
        return this.f39520o;
    }

    /* renamed from: R */
    public final C7458b mo53598R(tc3 tc3) {
        if (tc3 == null) {
            return C7458b.C7460b.f39526a;
        }
        if (tc3.mo65261a().mo53822c() != KotlinClassHeader.Kind.CLASS) {
            return C7458b.C7461c.f39527a;
        }
        if0 k = mo53618w().mo65296a().mo66999b().mo53805k(tc3);
        if (k != null) {
            return new C7458b.C7459a(k);
        }
        return C7458b.C7460b.f39526a;
    }

    /* renamed from: b */
    public Collection<fx4> mo50861b(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return ck0.m33062j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<p000.d31> mo50865f(p000.yc1 r5, p000.rc2<? super p000.r24, java.lang.Boolean> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "kindFilter"
            p000.vx2.m53591g(r5, r0)
            java.lang.String r0 = "nameFilter"
            p000.vx2.m53591g(r6, r0)
            yc1$a r0 = p000.yc1.f46165c
            int r1 = r0.mo67076c()
            int r0 = r0.mo67078e()
            r0 = r0 | r1
            boolean r5 = r5.mo67068a(r0)
            if (r5 != 0) goto L_0x0020
            java.util.List r5 = p000.ck0.m33062j()
            goto L_0x0065
        L_0x0020:
            q84 r5 = r4.mo53617v()
            java.lang.Object r5 = r5.invoke()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0033:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r5.next()
            r2 = r1
            d31 r2 = (p000.d31) r2
            boolean r3 = r2 instanceof p000.if0
            if (r3 == 0) goto L_0x005d
            if0 r2 = (p000.if0) r2
            r24 r2 = r2.getName()
            java.lang.String r3 = "it.name"
            p000.vx2.m53590f(r2, r3)
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x005d
            r2 = 1
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            if (r2 == 0) goto L_0x0033
            r0.add(r1)
            goto L_0x0033
        L_0x0064:
            r5 = r0
        L_0x0065:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.mo50865f(yc1, rc2):java.util.Collection");
    }

    /* renamed from: l */
    public Set<r24> mo53559l(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        r24 r24;
        vx2.m53591g(yc1, "kindFilter");
        if (!yc1.mo67068a(yc1.f46165c.mo67078e())) {
            return ny5.m49095e();
        }
        Set<String> set = (Set) this.f39521p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            for (String h : set) {
                hashSet.add(r24.m71445h(h));
            }
            return hashSet;
        }
        s13 s13 = this.f39519n;
        if (rc2 == null) {
            rc2 = FunctionsKt.m62992a();
        }
        Collection<p03> r = s13.mo52167r(rc2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (p03 p03 : r) {
            if (p03.mo53372J() == LightClassOriginKind.SOURCE) {
                r24 = null;
            } else {
                r24 = p03.getName();
            }
            if (r24 != null) {
                linkedHashSet.add(r24);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: n */
    public Set<r24> mo53562n(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        return ny5.m49095e();
    }

    /* renamed from: p */
    public l31 mo53566p() {
        return l31.C7819a.f40567a;
    }

    /* renamed from: r */
    public void mo53569r(Collection<C7428e> collection, r24 r24) {
        vx2.m53591g(collection, "result");
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
    }

    /* renamed from: t */
    public Set<r24> mo53573t(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        return ny5.m49095e();
    }
}
