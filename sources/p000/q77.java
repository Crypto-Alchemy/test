package p000;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* renamed from: q77 */
/* compiled from: Utils */
public final class q77 {

    /* renamed from: a */
    public static final Type[] f32966a = new Type[0];

    /* renamed from: a */
    public static <T> T m50384a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: b */
    public static Type m50385b(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
        }
        Type type = actualTypeArguments[i];
        if (type instanceof WildcardType) {
            return ((WildcardType) type).getUpperBounds()[0];
        }
        return type;
    }

    /* renamed from: c */
    public static Class<?> m50386c(Type type) {
        m50384a(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m50386c(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m50386c(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    /* renamed from: d */
    public static boolean m50387d(Type type) {
        String str;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type d : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m50387d(d)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return m50387d(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
        }
    }
}
