package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;

/* compiled from: LazyJavaPackageFragmentProvider.kt */
public final class LazyJavaPackageFragmentProvider$getPackageFragment$1 extends Lambda implements pc2<LazyJavaPackageFragment> {
    public final /* synthetic */ s13 $jPackage;
    public final /* synthetic */ LazyJavaPackageFragmentProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragmentProvider$getPackageFragment$1(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, s13 s13) {
        super(0);
        this.this$0 = lazyJavaPackageFragmentProvider;
        this.$jPackage = s13;
    }

    public final LazyJavaPackageFragment invoke() {
        return new LazyJavaPackageFragment(this.this$0.f39454a, this.$jPackage);
    }
}
