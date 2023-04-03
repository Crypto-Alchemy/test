package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* compiled from: LazyJavaPackageScope.kt */
public final class LazyJavaPackageScope$knownClassNamesInPackage$1 extends Lambda implements pc2<Set<? extends String>> {

    /* renamed from: $c */
    public final /* synthetic */ pf3 f39529$c;
    public final /* synthetic */ LazyJavaPackageScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope$knownClassNamesInPackage$1(pf3 pf3, LazyJavaPackageScope lazyJavaPackageScope) {
        super(0);
        this.f39529$c = pf3;
        this.this$0 = lazyJavaPackageScope;
    }

    public final Set<String> invoke() {
        return this.f39529$c.mo65296a().mo67001d().mo65953a(this.this$0.mo53531C().mo51711e());
    }
}
