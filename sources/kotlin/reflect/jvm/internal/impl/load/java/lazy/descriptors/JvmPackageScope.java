package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.web3j.ens.contracts.generated.PublicResolver;

/* compiled from: JvmPackageScope.kt */
public final class JvmPackageScope implements MemberScope {

    /* renamed from: f */
    public static final /* synthetic */ i93<Object>[] f39467f = {ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(JvmPackageScope.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b */
    public final pf3 f39468b;

    /* renamed from: c */
    public final LazyJavaPackageFragment f39469c;

    /* renamed from: d */
    public final LazyJavaPackageScope f39470d;

    /* renamed from: e */
    public final q84 f39471e;

    public JvmPackageScope(pf3 pf3, s13 s13, LazyJavaPackageFragment lazyJavaPackageFragment) {
        vx2.m53591g(pf3, "c");
        vx2.m53591g(s13, "jPackage");
        vx2.m53591g(lazyJavaPackageFragment, "packageFragment");
        this.f39468b = pf3;
        this.f39469c = lazyJavaPackageFragment;
        this.f39470d = new LazyJavaPackageScope(pf3, s13, lazyJavaPackageFragment);
        this.f39471e = pf3.mo65300e().mo51164i(new JvmPackageScope$kotlinScopes$2(this));
    }

    /* renamed from: a */
    public Set<r24> mo50860a() {
        MemberScope[] k = mo53502k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope a : k) {
            hk0.m45275z(linkedHashSet, a.mo50860a());
        }
        linkedHashSet.addAll(this.f39470d.mo50860a());
        return linkedHashSet;
    }

    /* renamed from: b */
    public Collection<fx4> mo50861b(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        mo53503l(r24, ul3);
        LazyJavaPackageScope lazyJavaPackageScope = this.f39470d;
        MemberScope[] k = mo53502k();
        Collection b = lazyJavaPackageScope.mo50861b(r24, ul3);
        for (MemberScope b2 : k) {
            b = on5.m70416a(b, b2.mo50861b(r24, ul3));
        }
        if (b == null) {
            return ny5.m49095e();
        }
        return b;
    }

    /* renamed from: c */
    public Collection<C7428e> mo50862c(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        mo53503l(r24, ul3);
        LazyJavaPackageScope lazyJavaPackageScope = this.f39470d;
        MemberScope[] k = mo53502k();
        Collection c = lazyJavaPackageScope.mo50862c(r24, ul3);
        for (MemberScope c2 : k) {
            c = on5.m70416a(c, c2.mo50862c(r24, ul3));
        }
        if (c == null) {
            return ny5.m49095e();
        }
        return c;
    }

    /* renamed from: d */
    public Set<r24> mo50863d() {
        MemberScope[] k = mo53502k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope d : k) {
            hk0.m45275z(linkedHashSet, d.mo50863d());
        }
        linkedHashSet.addAll(this.f39470d.mo50863d());
        return linkedHashSet;
    }

    /* renamed from: e */
    public eg0 mo50864e(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        mo53503l(r24, ul3);
        if0 P = this.f39470d.mo50864e(r24, ul3);
        if (P != null) {
            return P;
        }
        eg0 eg0 = null;
        for (MemberScope e : mo53502k()) {
            eg0 e2 = e.mo50864e(r24, ul3);
            if (e2 != null) {
                if (!(e2 instanceof fg0) || !((fg0) e2).mo51319d0()) {
                    return e2;
                }
                if (eg0 == null) {
                    eg0 = e2;
                }
            }
        }
        return eg0;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [rc2, java.lang.Object, rc2<? super r24, java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<p000.d31> mo50865f(p000.yc1 r6, p000.rc2<? super p000.r24, java.lang.Boolean> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "kindFilter"
            p000.vx2.m53591g(r6, r0)
            java.lang.String r0 = "nameFilter"
            p000.vx2.m53591g(r7, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope r0 = r5.f39470d
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] r1 = r5.mo53502k()
            java.util.Collection r0 = r0.mo50865f(r6, r7)
            int r2 = r1.length
            r3 = 0
        L_0x0016:
            if (r3 >= r2) goto L_0x0025
            r4 = r1[r3]
            java.util.Collection r4 = r4.mo50865f(r6, r7)
            java.util.Collection r0 = p000.on5.m70416a(r0, r4)
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0025:
            if (r0 != 0) goto L_0x002b
            java.util.Set r0 = p000.ny5.m49095e()
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope.mo50865f(yc1, rc2):java.util.Collection");
    }

    /* renamed from: g */
    public Set<r24> mo50866g() {
        Set<r24> a = rs3.m71677a(ArraysKt___ArraysKt.m47243A(mo53502k()));
        if (a == null) {
            return null;
        }
        a.addAll(this.f39470d.mo50866g());
        return a;
    }

    /* renamed from: j */
    public final LazyJavaPackageScope mo53501j() {
        return this.f39470d;
    }

    /* renamed from: k */
    public final MemberScope[] mo53502k() {
        return (MemberScope[]) ca6.m56364a(this.f39471e, this, f39467f[0]);
    }

    /* renamed from: l */
    public void mo53503l(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        u77.m72645b(this.f39468b.mo65296a().mo67009l(), ul3, this.f39469c, r24);
    }

    public String toString() {
        return "scope for " + this.f39469c;
    }
}
