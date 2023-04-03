package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* renamed from: w16 */
/* compiled from: ReflectKotlinClass.kt */
public final class w16 {

    /* renamed from: a */
    public static final w16 f45415a = new w16();

    /* renamed from: a */
    public final String mo66606a(Constructor<?> constructor) {
        vx2.m53591g(constructor, "constructor");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Class[] parameterTypes = constructor.getParameterTypes();
        vx2.m53590f(parameterTypes, "constructor.parameterTypes");
        for (Class cls : parameterTypes) {
            vx2.m53590f(cls, "parameterType");
            sb.append(ReflectClassUtilKt.m60594b(cls));
        }
        sb.append(")V");
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: b */
    public final String mo66607b(Field field) {
        vx2.m53591g(field, "field");
        Class<?> type = field.getType();
        vx2.m53590f(type, "field.type");
        return ReflectClassUtilKt.m60594b(type);
    }

    /* renamed from: c */
    public final String mo66608c(Method method) {
        vx2.m53591g(method, "method");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Class[] parameterTypes = method.getParameterTypes();
        vx2.m53590f(parameterTypes, "method.parameterTypes");
        for (Class cls : parameterTypes) {
            vx2.m53590f(cls, "parameterType");
            sb.append(ReflectClassUtilKt.m60594b(cls));
        }
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        vx2.m53590f(returnType, "method.returnType");
        sb.append(ReflectClassUtilKt.m60594b(returnType));
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "sb.toString()");
        return sb2;
    }
}
