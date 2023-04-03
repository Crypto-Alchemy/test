package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3 */
/* compiled from: typeParameterUtils.kt */
public final class C7419x246a49e4 extends Lambda implements rc2<d31, hw5<? extends a17>> {
    public static final C7419x246a49e4 INSTANCE = new C7419x246a49e4();

    public C7419x246a49e4() {
        super(1);
    }

    public final hw5<a17> invoke(d31 d31) {
        vx2.m53591g(d31, "it");
        List<a17> typeParameters = ((C7420a) d31).getTypeParameters();
        vx2.m53590f(typeParameters, "it as CallableDescriptor).typeParameters");
        return CollectionsKt___CollectionsKt.m47318Q(typeParameters);
    }
}
