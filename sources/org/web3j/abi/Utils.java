package org.web3j.abi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import okhttp3.HttpUrl;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.DynamicBytes;
import org.web3j.abi.datatypes.Fixed;
import org.web3j.abi.datatypes.Int;
import org.web3j.abi.datatypes.StaticArray;
import org.web3j.abi.datatypes.StaticStruct;
import org.web3j.abi.datatypes.Ufixed;
import org.web3j.abi.datatypes.Uint;
import org.web3j.abi.datatypes.Utf8String;

public class Utils {
    private Utils() {
    }

    public static List<TypeReference<fz6>> convert(List<TypeReference<?>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll((Collection) list.stream().map(new e77()).collect(Collectors.toList()));
        return arrayList;
    }

    public static <T extends fz6> Class<T> extractParameterFromAnnotation(Annotation[] annotationArr) {
        for (sl4 sl4 : annotationArr) {
            if (sl4.class.isInstance(sl4)) {
                return sl4.type();
            }
        }
        return null;
    }

    public static Constructor findStructConstructor(Class cls) {
        return (Constructor) Arrays.stream(cls.getDeclaredConstructors()).filter(new f77()).findAny().orElseThrow(new g77());
    }

    private static String getClassName(Class cls) {
        if (cls.isArray()) {
            Class cls2 = cls;
            int i = 0;
            while (cls2.isArray()) {
                try {
                    i++;
                    cls2 = cls2.getComponentType();
                } catch (Throwable unused) {
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cls2.getName());
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            return sb.toString();
        }
        return cls.getName();
    }

    public static TypeReference<DynamicArray> getDynamicArrayTypeReference(final Class cls) {
        return new TypeReference<DynamicArray>() {
            public TypeReference getSubTypeReference() {
                return TypeReference.create(cls);
            }
        };
    }

    public static <T extends fz6> Class<T> getParameterizedTypeFromArray(TypeReference typeReference) throws ClassNotFoundException {
        if (typeReference.getSubTypeReference() != null) {
            return typeReference.getSubTypeReference().getClassType();
        }
        return Class.forName(getTypeName(((ParameterizedType) typeReference.getType()).getActualTypeArguments()[0]));
    }

    public static <T extends fz6, U extends fz6> String getParameterizedTypeName(TypeReference<T> typeReference, Class<?> cls) {
        try {
            if (cls.equals(DynamicArray.class)) {
                String simpleNameOrStruct = simpleNameOrStruct(getParameterizedTypeFromArray(typeReference));
                return simpleNameOrStruct + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            } else if (cls.equals(StaticArray.class)) {
                String simpleNameOrStruct2 = simpleNameOrStruct(getParameterizedTypeFromArray(typeReference));
                return simpleNameOrStruct2 + "[" + ((TypeReference.StaticArrayTypeReference) typeReference).getSize() + "]";
            } else {
                throw new UnsupportedOperationException("Invalid type provided " + cls.getName());
            }
        } catch (ClassNotFoundException e) {
            throw new UnsupportedOperationException("Invalid class reference provided", e);
        }
    }

    public static String getSimpleTypeName(Class<?> cls) {
        String lowerCase = cls.getSimpleName().toLowerCase();
        if (cls.equals(Uint.class) || cls.equals(Int.class) || cls.equals(Ufixed.class) || cls.equals(Fixed.class)) {
            return lowerCase + "256";
        } else if (cls.equals(Utf8String.class)) {
            return Utf8String.TYPE_NAME;
        } else {
            if (cls.equals(DynamicBytes.class)) {
                return "bytes";
            }
            if (ac6.class.isAssignableFrom(cls)) {
                return cls.getName();
            }
            return lowerCase;
        }
    }

    public static String getStructType(Class cls) {
        StringBuilder sb = new StringBuilder("(");
        Constructor findStructConstructor = findStructConstructor(cls);
        Class[] parameterTypes = findStructConstructor.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            Class cls2 = parameterTypes[i];
            if (ac6.class.isAssignableFrom(cls2)) {
                sb.append(getStructType(cls2));
            } else {
                Class extractParameterFromAnnotation = extractParameterFromAnnotation(findStructConstructor.getParameterAnnotations()[i]);
                if (extractParameterFromAnnotation != null) {
                    sb.append(getTypeName(getDynamicArrayTypeReference(extractParameterFromAnnotation)));
                } else {
                    sb.append(getTypeName(TypeReference.create(cls2)));
                }
            }
            if (i < parameterTypes.length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public static <T extends fz6> String getTypeName(TypeReference<T> typeReference) {
        try {
            Type type = typeReference.getType();
            if (type instanceof ParameterizedType) {
                return getParameterizedTypeName(typeReference, (Class) ((ParameterizedType) type).getRawType());
            }
            if (typeReference.getSubTypeReference() != null) {
                return getParameterizedTypeName(typeReference, typeReference.getClassType());
            }
            Class<?> cls = Class.forName(getTypeName(type));
            if (ac6.class.isAssignableFrom(cls)) {
                return getStructType(cls);
            }
            return getSimpleTypeName(cls);
        } catch (ClassNotFoundException e) {
            throw new UnsupportedOperationException("Invalid class reference provided", e);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ TypeReference lambda$convert$2(TypeReference typeReference) {
        return typeReference;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ RuntimeException lambda$findStructConstructor$1() {
        return new RuntimeException("TypeReferenced struct must contain a constructor with types that extend Type");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$staticStructsNestedFieldsFlatList$4(Field field) {
        return !StaticStruct.class.isAssignableFrom(field.getType());
    }

    private static <U extends fz6> String simpleNameOrStruct(Class<U> cls) {
        if (ac6.class.isAssignableFrom(cls)) {
            return getStructType(cls);
        }
        return getSimpleTypeName(cls);
    }

    public static List<Field> staticStructNestedPublicFieldsFlatList(Class<fz6> cls) {
        return (List) staticStructsNestedFieldsFlatList(cls).stream().filter(new i77()).collect(Collectors.toList());
    }

    public static List<Field> staticStructsNestedFieldsFlatList(Class<fz6> cls) {
        return (List) Stream.concat(((List) Arrays.stream(cls.getDeclaredFields()).filter(new j77()).collect(Collectors.toList())).stream(), ((List) Arrays.stream(cls.getDeclaredFields()).filter(new k77()).map(new l77()).flatMap(new m77()).collect(Collectors.toList())).stream()).collect(Collectors.toList());
    }

    public static <T, R extends fz6<T>, E extends fz6<T>> List<E> typeMap(List<List<T>> list, Class<E> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        try {
            Constructor<E> declaredConstructor = cls.getDeclaredConstructor(new Class[]{Class.class, List.class});
            for (List<T> typeMap : list) {
                arrayList.add((fz6) declaredConstructor.newInstance(new Object[]{cls2, typeMap(typeMap, cls2)}));
            }
            return arrayList;
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new TypeMappingException((Exception) e);
        }
    }

    public static <T, R extends fz6<T>> List<R> typeMap(List<T> list, Class<R> cls) throws TypeMappingException {
        ArrayList arrayList = new ArrayList(list.size());
        if (!list.isEmpty()) {
            try {
                Constructor<R> declaredConstructor = cls.getDeclaredConstructor(new Class[]{list.get(0).getClass()});
                for (T t : list) {
                    arrayList.add(declaredConstructor.newInstance(new Object[]{t}));
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new TypeMappingException((Exception) e);
            }
        }
        return arrayList;
    }

    public static String getTypeName(Type type) {
        try {
            return type.getTypeName();
        } catch (NoSuchMethodError unused) {
            return getClassName((Class) type);
        }
    }
}
