package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: LazyJavaPackageFragment.kt */
public final class LazyJavaPackageFragment$subPackages$1 extends Lambda implements pc2<List<? extends u82>> {
    public final /* synthetic */ LazyJavaPackageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment$subPackages$1(LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(0);
        this.this$0 = lazyJavaPackageFragment;
    }

    public final List<u82> invoke() {
        Collection<s13> u = this.this$0.f39515s.mo52169u();
        ArrayList arrayList = new ArrayList(dk0.m43495u(u, 10));
        for (s13 e : u) {
            arrayList.add(e.mo52164e());
        }
        return arrayList;
    }
}
