package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.Lambda;

/* compiled from: Annotations.kt */
public final class CompositeAnnotations$findAnnotation$1 extends Lambda implements rc2<C6983dm, C9460vl> {
    public final /* synthetic */ u82 $fqName;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations$findAnnotation$1(u82 u82) {
        super(1);
        this.$fqName = u82;
    }

    public final C9460vl invoke(C6983dm dmVar) {
        vx2.m53591g(dmVar, "it");
        return dmVar.mo51226x(this.$fqName);
    }
}
