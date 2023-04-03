package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Lambda;

/* compiled from: PackageFragmentProviderImpl.kt */
public final class PackageFragmentProviderImpl$getSubPackagesOf$2 extends Lambda implements rc2<u82, Boolean> {
    public final /* synthetic */ u82 $fqName;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PackageFragmentProviderImpl$getSubPackagesOf$2(u82 u82) {
        super(1);
        this.$fqName = u82;
    }

    public final Boolean invoke(u82 u82) {
        vx2.m53591g(u82, "it");
        return Boolean.valueOf(!u82.mo66197d() && vx2.m53586b(u82.mo66198e(), this.$fqName));
    }
}
