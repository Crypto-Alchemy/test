package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationDefaultValue$1 */
/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
public final class C7506xb1722d2c extends Lambda implements fd2<AbstractBinaryClassAnnotationAndConstantLoader.C7502a<? extends A, ? extends C>, ss3, C> {
    public static final C7506xb1722d2c INSTANCE = new C7506xb1722d2c();

    public C7506xb1722d2c() {
        super(2);
    }

    public final C invoke(AbstractBinaryClassAnnotationAndConstantLoader.C7502a<? extends A, ? extends C> aVar, ss3 ss3) {
        vx2.m53591g(aVar, "$this$loadConstantFromProperty");
        vx2.m53591g(ss3, "it");
        return aVar.mo53765b().get(ss3);
    }
}
