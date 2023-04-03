package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Lambda;

/* compiled from: context.kt */
public final class ContextKt$childForClassOrPackage$1 extends Lambda implements pc2<k23> {
    public final /* synthetic */ rf0 $containingDeclaration;
    public final /* synthetic */ pf3 $this_childForClassOrPackage;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextKt$childForClassOrPackage$1(pf3 pf3, rf0 rf0) {
        super(0);
        this.$this_childForClassOrPackage = pf3;
        this.$containingDeclaration = rf0;
    }

    public final k23 invoke() {
        return ContextKt.m60739g(this.$this_childForClassOrPackage, this.$containingDeclaration.getAnnotations());
    }
}
