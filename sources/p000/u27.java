package p000;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import p000.t67;

/* renamed from: u27 */
/* compiled from: Types */
public final class u27 {
    /* renamed from: a */
    public static Type m52585a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    /* renamed from: b */
    public static GenericArrayType m52586b(Type type) {
        return new t67.C6515a(type);
    }

    /* renamed from: c */
    public static Type m52587c(Type type, Class<?> cls) {
        Type h = m52592h(type, cls, Collection.class);
        if (h instanceof WildcardType) {
            h = ((WildcardType) h).getUpperBounds()[0];
        }
        if (h instanceof ParameterizedType) {
            return ((ParameterizedType) h).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: d */
    public static boolean m52588d(Type type, Type type2) {
        Type[] typeArr;
        Type[] typeArr2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return m52588d(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        } else if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (parameterizedType instanceof t67.C6516b) {
                typeArr = ((t67.C6516b) parameterizedType).f34136e;
            } else {
                typeArr = parameterizedType.getActualTypeArguments();
            }
            if (parameterizedType2 instanceof t67.C6516b) {
                typeArr2 = ((t67.C6516b) parameterizedType2).f34136e;
            } else {
                typeArr2 = parameterizedType2.getActualTypeArguments();
            }
            if (!m52588d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(typeArr, typeArr2)) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m52588d(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m52588d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: e */
    public static String m52589e(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    /* renamed from: f */
    public static Type m52590f(Type type) {
        Class<?> g = m52591g(type);
        return t67.m52115p(type, g, g.getGenericSuperclass());
    }

    /* renamed from: g */
    public static Class<?> m52591g(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m52591g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m52591g(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            str = "null";
        } else {
            str = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
    }

    /* renamed from: h */
    public static Type m52592h(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return t67.m52115p(type, cls, t67.m52104e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public static Type[] m52593i(Type type, Class<?> cls) {
        Class<Object> cls2 = Object.class;
        Class<String> cls3 = String.class;
        if (type == Properties.class) {
            return new Type[]{cls3, cls3};
        }
        Type h = m52592h(type, cls, Map.class);
        if (h instanceof ParameterizedType) {
            return ((ParameterizedType) h).getActualTypeArguments();
        }
        return new Type[]{cls2, cls2};
    }

    /* renamed from: j */
    public static ParameterizedType m52594j(Type type, Type... typeArr) {
        if (typeArr.length != 0) {
            return new t67.C6516b((Type) null, type, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type);
    }

    /* renamed from: k */
    public static WildcardType m52595k(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new t67.C6517c(typeArr, t67.f34129b);
    }

    /* renamed from: l */
    public static WildcardType m52596l(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new t67.C6517c(new Type[]{Object.class}, typeArr);
    }
}
