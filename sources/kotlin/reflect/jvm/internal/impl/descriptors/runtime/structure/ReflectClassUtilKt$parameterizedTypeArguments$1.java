package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Lambda;

/* compiled from: reflectClassUtil.kt */
public final class ReflectClassUtilKt$parameterizedTypeArguments$1 extends Lambda implements rc2<ParameterizedType, ParameterizedType> {
    public static final ReflectClassUtilKt$parameterizedTypeArguments$1 INSTANCE = new ReflectClassUtilKt$parameterizedTypeArguments$1();

    public ReflectClassUtilKt$parameterizedTypeArguments$1() {
        super(1);
    }

    public final ParameterizedType invoke(ParameterizedType parameterizedType) {
        vx2.m53591g(parameterizedType, "it");
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }
}
