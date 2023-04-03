package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.Lambda;

/* compiled from: ReflectJavaClass.kt */
public final class ReflectJavaClass$innerClassNames$1 extends Lambda implements rc2<Class<?>, Boolean> {
    public static final ReflectJavaClass$innerClassNames$1 INSTANCE = new ReflectJavaClass$innerClassNames$1();

    public ReflectJavaClass$innerClassNames$1() {
        super(1);
    }

    public final Boolean invoke(Class<?> cls) {
        String simpleName = cls.getSimpleName();
        vx2.m53590f(simpleName, "it.simpleName");
        return Boolean.valueOf(simpleName.length() == 0);
    }
}
