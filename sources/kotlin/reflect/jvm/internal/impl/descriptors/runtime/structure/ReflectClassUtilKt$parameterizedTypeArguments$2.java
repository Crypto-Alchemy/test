package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Lambda;

/* compiled from: reflectClassUtil.kt */
public final class ReflectClassUtilKt$parameterizedTypeArguments$2 extends Lambda implements rc2<ParameterizedType, hw5<? extends Type>> {
    public static final ReflectClassUtilKt$parameterizedTypeArguments$2 INSTANCE = new ReflectClassUtilKt$parameterizedTypeArguments$2();

    public ReflectClassUtilKt$parameterizedTypeArguments$2() {
        super(1);
    }

    public final hw5<Type> invoke(ParameterizedType parameterizedType) {
        vx2.m53591g(parameterizedType, "it");
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        vx2.m53590f(actualTypeArguments, "it.actualTypeArguments");
        return ArraysKt___ArraysKt.m47245B(actualTypeArguments);
    }
}
