package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1 */
/* compiled from: annotationUtil.kt */
public final class C7422xf14e0c1a extends Lambda implements rc2<mx3, xc3> {
    public final /* synthetic */ C7389b $this_createDeprecatedAnnotation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7422xf14e0c1a(C7389b bVar) {
        super(1);
        this.$this_createDeprecatedAnnotation = bVar;
    }

    public final xc3 invoke(mx3 mx3) {
        vx2.m53591g(mx3, "module");
        d36 l = mx3.mo51535k().mo53172l(Variance.INVARIANT, this.$this_createDeprecatedAnnotation.mo53162W());
        vx2.m53590f(l, "module.builtIns.getArray…ce.INVARIANT, stringType)");
        return l;
    }
}
