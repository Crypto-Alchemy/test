package p000;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* renamed from: a13 */
/* compiled from: JavaDescriptorResolver.kt */
public final class a13 {

    /* renamed from: a */
    public final LazyJavaPackageFragmentProvider f36346a;

    /* renamed from: b */
    public final x13 f36347b;

    public a13(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, x13 x13) {
        vx2.m53591g(lazyJavaPackageFragmentProvider, "packageFragmentProvider");
        vx2.m53591g(x13, "javaResolverCache");
        this.f36346a = lazyJavaPackageFragmentProvider;
        this.f36347b = x13;
    }

    /* renamed from: a */
    public final LazyJavaPackageFragmentProvider mo50039a() {
        return this.f36346a;
    }

    /* renamed from: b */
    public final if0 mo50040b(p03 p03) {
        MemberScope memberScope;
        d31 d31;
        vx2.m53591g(p03, "javaClass");
        u82 e = p03.mo53383e();
        if (e != null && p03.mo53372J() == LightClassOriginKind.SOURCE) {
            return this.f36347b.mo66818b(e);
        }
        p03 k = p03.mo53388k();
        if (k != null) {
            if0 b = mo50040b(k);
            if (b != null) {
                memberScope = b.mo52461O();
            } else {
                memberScope = null;
            }
            if (memberScope != null) {
                d31 = memberScope.mo50864e(p03.getName(), NoLookupLocation.FROM_JAVA_LOADER);
            } else {
                d31 = null;
            }
            if (d31 instanceof if0) {
                return (if0) d31;
            }
            return null;
        } else if (e == null) {
            return null;
        } else {
            LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = this.f36346a;
            u82 e2 = e.mo66198e();
            vx2.m53590f(e2, "fqName.parent()");
            LazyJavaPackageFragment lazyJavaPackageFragment = (LazyJavaPackageFragment) CollectionsKt___CollectionsKt.m47331b0(lazyJavaPackageFragmentProvider.mo52234c(e2));
            if (lazyJavaPackageFragment != null) {
                return lazyJavaPackageFragment.mo53590F0(p03);
            }
            return null;
        }
    }
}
