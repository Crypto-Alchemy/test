package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.Lambda;

/* compiled from: ReflectJavaClass.kt */
public final class ReflectJavaClass$innerClassNames$2 extends Lambda implements rc2<Class<?>, r24> {
    public static final ReflectJavaClass$innerClassNames$2 INSTANCE = new ReflectJavaClass$innerClassNames$2();

    public ReflectJavaClass$innerClassNames$2() {
        super(1);
    }

    public final r24 invoke(Class<?> cls) {
        String simpleName = cls.getSimpleName();
        if (!r24.m71446l(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return r24.m71445h(simpleName);
        }
        return null;
    }
}
