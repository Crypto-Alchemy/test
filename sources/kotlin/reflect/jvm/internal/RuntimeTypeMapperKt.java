package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo44877d2 = {"Ljava/lang/reflect/Method;", "", "b", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "signature", "kotlin-reflection"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* compiled from: RuntimeTypeMapper.kt */
public final class RuntimeTypeMapperKt {
    /* renamed from: b */
    public static final String m60064b(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class[] parameterTypes = method.getParameterTypes();
        vx2.m53590f(parameterTypes, "parameterTypes");
        sb.append(ArraysKt___ArraysKt.m47269U(parameterTypes, "", "(", ")", 0, (CharSequence) null, RuntimeTypeMapperKt$signature$1.INSTANCE, 24, (Object) null));
        Class<?> returnType = method.getReturnType();
        vx2.m53590f(returnType, "returnType");
        sb.append(ReflectClassUtilKt.m60594b(returnType));
        return sb.toString();
    }
}
