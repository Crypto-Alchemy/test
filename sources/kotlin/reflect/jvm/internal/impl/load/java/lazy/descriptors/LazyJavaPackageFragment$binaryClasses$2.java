package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.Lambda;

/* compiled from: LazyJavaPackageFragment.kt */
public final class LazyJavaPackageFragment$binaryClasses$2 extends Lambda implements pc2<Map<String, ? extends tc3>> {
    public final /* synthetic */ LazyJavaPackageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment$binaryClasses$2(LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(0);
        this.this$0 = lazyJavaPackageFragment;
    }

    public final Map<String, tc3> invoke() {
        nk4 o = this.this$0.f39516x.mo65296a().mo67012o();
        String b = this.this$0.mo51711e().mo66195b();
        vx2.m53590f(b, "fqName.asString()");
        List<String> a = o.mo62715a(b);
        LazyJavaPackageFragment lazyJavaPackageFragment = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (String str : a) {
            nf0 m = nf0.m69751m(y73.m74293d(str).mo67041e());
            vx2.m53590f(m, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
            tc3 a2 = oc3.m70233a(lazyJavaPackageFragment.f39516x.mo65296a().mo67007j(), m);
            Pair a3 = a2 != null ? wy6.m54142a(str, a2) : null;
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return C6177b.m47369q(arrayList);
    }
}
