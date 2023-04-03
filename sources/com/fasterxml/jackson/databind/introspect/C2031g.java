package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.C2033i;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.fasterxml.jackson.databind.introspect.g */
/* compiled from: MethodGenericTypeResolver */
public final class C2031g {
    /* renamed from: a */
    public static TypeBindings m14224a(Method method, JavaType javaType, C2033i iVar) {
        JavaType boundType;
        TypeVariable<?> b;
        TypeVariable[] typeParameters = method.getTypeParameters();
        if (typeParameters.length == 0 || javaType.getBindings().isEmpty()) {
            return null;
        }
        Type genericReturnType = method.getGenericReturnType();
        if (!(genericReturnType instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
        if (!Objects.equals(javaType.getRawClass(), parameterizedType.getRawType())) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        ArrayList arrayList2 = new ArrayList(typeParameters.length);
        for (int i = 0; i < actualTypeArguments.length; i++) {
            TypeVariable<?> d = m14227d(actualTypeArguments[i]);
            if (d != null) {
                String name = d.getName();
                if (name == null || (boundType = javaType.getBindings().getBoundType(i)) == null || (b = m14225b(typeParameters, name)) == null) {
                    return null;
                }
                if (!m14230g(iVar, boundType, b.getBounds())) {
                    continue;
                } else {
                    int indexOf = arrayList.indexOf(name);
                    if (indexOf != -1) {
                        JavaType javaType2 = (JavaType) arrayList2.get(indexOf);
                        if (boundType.equals(javaType2)) {
                            continue;
                        } else {
                            boolean isTypeOrSubTypeOf = javaType2.isTypeOrSubTypeOf(boundType.getRawClass());
                            boolean isTypeOrSubTypeOf2 = boundType.isTypeOrSubTypeOf(javaType2.getRawClass());
                            if (!isTypeOrSubTypeOf && !isTypeOrSubTypeOf2) {
                                return null;
                            }
                            if ((isTypeOrSubTypeOf ^ isTypeOrSubTypeOf2) && isTypeOrSubTypeOf2) {
                                arrayList2.set(indexOf, boundType);
                            }
                        }
                    } else {
                        arrayList.add(name);
                        arrayList2.add(boundType);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return TypeBindings.create((List<String>) arrayList, (List<JavaType>) arrayList2);
    }

    /* renamed from: b */
    public static TypeVariable<?> m14225b(TypeVariable<?>[] typeVariableArr, String str) {
        if (!(typeVariableArr == null || str == null)) {
            for (TypeVariable<?> typeVariable : typeVariableArr) {
                if (str.equals(typeVariable.getName())) {
                    return typeVariable;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static ParameterizedType m14226c(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return m14226c(upperBounds[0]);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static TypeVariable<?> m14227d(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return m14227d(upperBounds[0]);
            }
        }
        return null;
    }

    /* renamed from: e */
    public static C2033i m14228e(Method method, JavaType javaType, TypeFactory typeFactory, C2033i iVar) {
        TypeBindings a = m14224a(method, javaType, iVar);
        if (a == null) {
            return iVar;
        }
        return new C2033i.C2034a(typeFactory, a);
    }

    /* renamed from: f */
    public static boolean m14229f(C2033i iVar, JavaType javaType, Type type) {
        if (!javaType.isTypeOrSubTypeOf(iVar.mo16038a(type).getRawClass())) {
            return false;
        }
        ParameterizedType c = m14226c(type);
        if (c == null || !Objects.equals(javaType.getRawClass(), c.getRawType())) {
            return true;
        }
        Type[] actualTypeArguments = c.getActualTypeArguments();
        TypeBindings bindings = javaType.getBindings();
        if (bindings.size() != actualTypeArguments.length) {
            return false;
        }
        for (int i = 0; i < bindings.size(); i++) {
            if (!m14229f(iVar, bindings.getBoundType(i), actualTypeArguments[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m14230g(C2033i iVar, JavaType javaType, Type[] typeArr) {
        for (Type f : typeArr) {
            if (!m14229f(iVar, javaType, f)) {
                return false;
            }
        }
        return true;
    }
}
