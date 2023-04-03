package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.google.mlkit.common.MlKitException;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import org.web3j.abi.datatypes.Int;

public class TypeFactory implements Serializable {

    /* renamed from: A */
    public static final Class<?> f10150A;
    public static final SimpleType CORE_TYPE_BOOL;
    public static final SimpleType CORE_TYPE_CLASS;
    public static final SimpleType CORE_TYPE_COMPARABLE;
    public static final SimpleType CORE_TYPE_ENUM;
    public static final SimpleType CORE_TYPE_INT;
    public static final SimpleType CORE_TYPE_JSON_NODE;
    public static final SimpleType CORE_TYPE_LONG;
    public static final SimpleType CORE_TYPE_OBJECT;
    public static final SimpleType CORE_TYPE_STRING;
    public static final TypeBindings EMPTY_BINDINGS = TypeBindings.emptyBindings();

    /* renamed from: a */
    public static final JavaType[] f10151a = new JavaType[0];

    /* renamed from: d */
    public static final Class<?> f10152d;

    /* renamed from: e */
    public static final Class<?> f10153e;

    /* renamed from: g */
    public static final Class<?> f10154g;
    public static final TypeFactory instance = new TypeFactory();

    /* renamed from: k */
    public static final Class<?> f10155k;

    /* renamed from: r */
    public static final Class<?> f10156r;

    /* renamed from: s */
    public static final Class<?> f10157s;
    private static final long serialVersionUID = 1;

    /* renamed from: x */
    public static final Class<?> f10158x;

    /* renamed from: y */
    public static final Class<?> f10159y;
    public final ClassLoader _classLoader;
    public final y07[] _modifiers;
    public final TypeParser _parser;
    public final tl3<Object, JavaType> _typeCache;

    static {
        Class<String> cls = String.class;
        f10152d = cls;
        Class<Object> cls2 = Object.class;
        f10153e = cls2;
        Class<Comparable> cls3 = Comparable.class;
        f10154g = cls3;
        Class<Class> cls4 = Class.class;
        f10155k = cls4;
        Class<Enum> cls5 = Enum.class;
        f10156r = cls5;
        Class<g53> cls6 = g53.class;
        f10157s = cls6;
        Class<?> cls7 = Boolean.TYPE;
        f10158x = cls7;
        Class<?> cls8 = Integer.TYPE;
        f10159y = cls8;
        Class<?> cls9 = Long.TYPE;
        f10150A = cls9;
        CORE_TYPE_BOOL = new SimpleType(cls7);
        CORE_TYPE_INT = new SimpleType(cls8);
        CORE_TYPE_LONG = new SimpleType(cls9);
        CORE_TYPE_STRING = new SimpleType((Class<?>) cls);
        CORE_TYPE_OBJECT = new SimpleType((Class<?>) cls2);
        CORE_TYPE_COMPARABLE = new SimpleType((Class<?>) cls3);
        CORE_TYPE_ENUM = new SimpleType((Class<?>) cls5);
        CORE_TYPE_CLASS = new SimpleType((Class<?>) cls4);
        CORE_TYPE_JSON_NODE = new SimpleType((Class<?>) cls6);
    }

    private TypeFactory() {
        this((tl3<Object, JavaType>) null);
    }

    public static TypeFactory defaultInstance() {
        return instance;
    }

    public static Class<?> rawClass(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        return defaultInstance().constructType(type).getRawClass();
    }

    public static JavaType unknownType() {
        return defaultInstance()._unknownType();
    }

    public JavaType _applyModifiers(Type type, JavaType javaType) {
        if (this._modifiers == null) {
            return javaType;
        }
        TypeBindings bindings = javaType.getBindings();
        if (bindings == null) {
            bindings = EMPTY_BINDINGS;
        }
        y07[] y07Arr = this._modifiers;
        int length = y07Arr.length;
        int i = 0;
        while (i < length) {
            y07 y07 = y07Arr[i];
            JavaType a = y07.mo27895a(javaType, type, bindings, this);
            if (a != null) {
                i++;
                javaType = a;
            } else {
                throw new IllegalStateException(String.format("TypeModifier %s (of type %s) return null for type %s", new Object[]{y07, y07.getClass().getName(), javaType}));
            }
        }
        return javaType;
    }

    public JavaType _constructSimple(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType _findWellKnownSimple;
        if (!typeBindings.isEmpty() || (_findWellKnownSimple = _findWellKnownSimple(cls)) == null) {
            return _newSimpleType(cls, typeBindings, javaType, javaTypeArr);
        }
        return _findWellKnownSimple;
    }

    public Class<?> _findPrimitive(String str) {
        if (Int.TYPE_NAME.equals(str)) {
            return Integer.TYPE;
        }
        if ("long".equals(str)) {
            return Long.TYPE;
        }
        if ("float".equals(str)) {
            return Float.TYPE;
        }
        if ("double".equals(str)) {
            return Double.TYPE;
        }
        if ("boolean".equals(str)) {
            return Boolean.TYPE;
        }
        if ("byte".equals(str)) {
            return Byte.TYPE;
        }
        if ("char".equals(str)) {
            return Character.TYPE;
        }
        if ("short".equals(str)) {
            return Short.TYPE;
        }
        if ("void".equals(str)) {
            return Void.TYPE;
        }
        return null;
    }

    public JavaType _findWellKnownSimple(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == f10158x) {
                return CORE_TYPE_BOOL;
            }
            if (cls == f10159y) {
                return CORE_TYPE_INT;
            }
            if (cls == f10150A) {
                return CORE_TYPE_LONG;
            }
            return null;
        } else if (cls == f10152d) {
            return CORE_TYPE_STRING;
        } else {
            if (cls == f10153e) {
                return CORE_TYPE_OBJECT;
            }
            if (cls == f10157s) {
                return CORE_TYPE_JSON_NODE;
            }
            return null;
        }
    }

    public JavaType _fromAny(tf0 tf0, Type type, TypeBindings typeBindings) {
        JavaType javaType;
        String str;
        if (type instanceof Class) {
            javaType = _fromClass(tf0, (Class) type, EMPTY_BINDINGS);
        } else if (type instanceof ParameterizedType) {
            javaType = _fromParamType(tf0, (ParameterizedType) type, typeBindings);
        } else if (type instanceof JavaType) {
            return (JavaType) type;
        } else {
            if (type instanceof GenericArrayType) {
                javaType = _fromArrayType(tf0, (GenericArrayType) type, typeBindings);
            } else if (type instanceof TypeVariable) {
                javaType = _fromVariable(tf0, (TypeVariable) type, typeBindings);
            } else if (type instanceof WildcardType) {
                javaType = _fromWildcard(tf0, (WildcardType) type, typeBindings);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized Type: ");
                if (type == null) {
                    str = "[null]";
                } else {
                    str = type.toString();
                }
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return _applyModifiers(type, javaType);
    }

    public JavaType _fromArrayType(tf0 tf0, GenericArrayType genericArrayType, TypeBindings typeBindings) {
        return ArrayType.construct(_fromAny(tf0, genericArrayType.getGenericComponentType(), typeBindings), typeBindings);
    }

    public JavaType _fromClass(tf0 tf0, Class<?> cls, TypeBindings typeBindings) {
        Object obj;
        tf0 tf02;
        JavaType javaType;
        JavaType[] javaTypeArr;
        JavaType javaType2;
        JavaType _findWellKnownSimple = _findWellKnownSimple(cls);
        if (_findWellKnownSimple != null) {
            return _findWellKnownSimple;
        }
        if (typeBindings == null || typeBindings.isEmpty()) {
            obj = cls;
        } else {
            obj = typeBindings.asKey(cls);
        }
        JavaType javaType3 = this._typeCache.get(obj);
        if (javaType3 != null) {
            return javaType3;
        }
        if (tf0 == null) {
            tf02 = new tf0(cls);
        } else {
            tf0 c = tf0.mo26437c(cls);
            if (c != null) {
                ResolvedRecursiveType resolvedRecursiveType = new ResolvedRecursiveType(cls, EMPTY_BINDINGS);
                c.mo26435a(resolvedRecursiveType);
                return resolvedRecursiveType;
            }
            tf02 = tf0.mo26436b(cls);
        }
        if (cls.isArray()) {
            javaType = ArrayType.construct(_fromAny(tf02, cls.getComponentType(), typeBindings), typeBindings);
        } else {
            if (cls.isInterface()) {
                javaType2 = null;
                javaTypeArr = _resolveSuperInterfaces(tf02, cls, typeBindings);
            } else {
                javaType2 = _resolveSuperClass(tf02, cls, typeBindings);
                javaTypeArr = _resolveSuperInterfaces(tf02, cls, typeBindings);
            }
            JavaType javaType4 = javaType2;
            JavaType[] javaTypeArr2 = javaTypeArr;
            if (cls == Properties.class) {
                SimpleType simpleType = CORE_TYPE_STRING;
                javaType3 = MapType.construct(cls, typeBindings, javaType4, javaTypeArr2, simpleType, simpleType);
            } else if (javaType4 != null) {
                javaType3 = javaType4.refine(cls, typeBindings, javaType4, javaTypeArr2);
            }
            if (javaType3 == null && (javaType3 = _fromWellKnownClass(tf02, cls, typeBindings, javaType4, javaTypeArr2)) == null && (javaType3 = _fromWellKnownInterface(tf02, cls, typeBindings, javaType4, javaTypeArr2)) == null) {
                javaType = _newSimpleType(cls, typeBindings, javaType4, javaTypeArr2);
            } else {
                javaType = javaType3;
            }
        }
        tf02.mo26438d(javaType);
        if (!javaType.hasHandlers()) {
            this._typeCache.putIfAbsent(obj, javaType);
        }
        return javaType;
    }

    public JavaType _fromParamType(tf0 tf0, ParameterizedType parameterizedType, TypeBindings typeBindings) {
        int i;
        TypeBindings typeBindings2;
        Class<?> cls = (Class) parameterizedType.getRawType();
        if (cls == f10156r) {
            return CORE_TYPE_ENUM;
        }
        if (cls == f10154g) {
            return CORE_TYPE_COMPARABLE;
        }
        if (cls == f10155k) {
            return CORE_TYPE_CLASS;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments == null) {
            i = 0;
        } else {
            i = actualTypeArguments.length;
        }
        if (i == 0) {
            typeBindings2 = EMPTY_BINDINGS;
        } else {
            JavaType[] javaTypeArr = new JavaType[i];
            for (int i2 = 0; i2 < i; i2++) {
                javaTypeArr[i2] = _fromAny(tf0, actualTypeArguments[i2], typeBindings);
            }
            typeBindings2 = TypeBindings.create(cls, javaTypeArr);
        }
        return _fromClass(tf0, cls, typeBindings2);
    }

    public JavaType _fromVariable(tf0 tf0, TypeVariable<?> typeVariable, TypeBindings typeBindings) {
        Type[] bounds;
        String name = typeVariable.getName();
        if (typeBindings != null) {
            JavaType findBoundType = typeBindings.findBoundType(name);
            if (findBoundType != null) {
                return findBoundType;
            }
            if (typeBindings.hasUnbound(name)) {
                return CORE_TYPE_OBJECT;
            }
            TypeBindings withUnboundVariable = typeBindings.withUnboundVariable(name);
            synchronized (typeVariable) {
                bounds = typeVariable.getBounds();
            }
            return _fromAny(tf0, bounds[0], withUnboundVariable);
        }
        throw new IllegalArgumentException("Null `bindings` passed (type variable \"" + name + "\")");
    }

    public JavaType _fromWellKnownClass(tf0 tf0, Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        if (typeBindings == null) {
            typeBindings = EMPTY_BINDINGS;
        }
        if (cls == Map.class) {
            return mo16885c(cls, typeBindings, javaType, javaTypeArr);
        }
        if (cls == Collection.class) {
            return mo16884b(cls, typeBindings, javaType, javaTypeArr);
        }
        if (cls == AtomicReference.class) {
            return mo16920d(cls, typeBindings, javaType, javaTypeArr);
        }
        return null;
    }

    public JavaType _fromWellKnownInterface(tf0 tf0, Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        for (JavaType refine : javaTypeArr) {
            JavaType refine2 = refine.refine(cls, typeBindings, javaType, javaTypeArr);
            if (refine2 != null) {
                return refine2;
            }
        }
        return null;
    }

    public JavaType _fromWildcard(tf0 tf0, WildcardType wildcardType, TypeBindings typeBindings) {
        return _fromAny(tf0, wildcardType.getUpperBounds()[0], typeBindings);
    }

    public JavaType _newSimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new SimpleType(cls, typeBindings, javaType, javaTypeArr);
    }

    public JavaType _resolveSuperClass(tf0 tf0, Class<?> cls, TypeBindings typeBindings) {
        Type D = wf0.m29477D(cls);
        if (D == null) {
            return null;
        }
        return _fromAny(tf0, D, typeBindings);
    }

    public JavaType[] _resolveSuperInterfaces(tf0 tf0, Class<?> cls, TypeBindings typeBindings) {
        Type[] C = wf0.m29476C(cls);
        if (C == null || C.length == 0) {
            return f10151a;
        }
        int length = C.length;
        JavaType[] javaTypeArr = new JavaType[length];
        for (int i = 0; i < length; i++) {
            javaTypeArr[i] = _fromAny(tf0, C[i], typeBindings);
        }
        return javaTypeArr;
    }

    public JavaType _unknownType() {
        return CORE_TYPE_OBJECT;
    }

    /* renamed from: a */
    public final TypeBindings mo16883a(JavaType javaType, int i, Class<?> cls, boolean z) {
        PlaceholderForType[] placeholderForTypeArr = new PlaceholderForType[i];
        for (int i2 = 0; i2 < i; i2++) {
            placeholderForTypeArr[i2] = new PlaceholderForType(i2);
        }
        JavaType findSuperType = _fromClass((tf0) null, cls, TypeBindings.create(cls, (JavaType[]) placeholderForTypeArr)).findSuperType(javaType.getRawClass());
        if (findSuperType != null) {
            String e = mo16921e(javaType, findSuperType);
            if (e == null || z) {
                JavaType[] javaTypeArr = new JavaType[i];
                for (int i3 = 0; i3 < i; i3++) {
                    JavaType actualType = placeholderForTypeArr[i3].actualType();
                    if (actualType == null) {
                        actualType = unknownType();
                    }
                    javaTypeArr[i3] = actualType;
                }
                return TypeBindings.create(cls, javaTypeArr);
            }
            throw new IllegalArgumentException("Failed to specialize base type " + javaType.toCanonical() + " as " + cls.getName() + ", problem: " + e);
        }
        throw new IllegalArgumentException(String.format("Internal error: unable to locate supertype (%s) from resolved subtype %s", new Object[]{javaType.getRawClass().getName(), cls.getName()}));
    }

    /* renamed from: b */
    public final JavaType mo16884b(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType2;
        List<JavaType> typeParameters = typeBindings.getTypeParameters();
        if (typeParameters.isEmpty()) {
            javaType2 = _unknownType();
        } else if (typeParameters.size() == 1) {
            javaType2 = typeParameters.get(0);
        } else {
            throw new IllegalArgumentException("Strange Collection type " + cls.getName() + ": cannot determine type parameters");
        }
        return CollectionType.construct(cls, typeBindings, javaType, javaTypeArr, javaType2);
    }

    /* renamed from: c */
    public final JavaType mo16885c(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType2;
        JavaType javaType3;
        JavaType _unknownType;
        String str;
        if (cls == Properties.class) {
            _unknownType = CORE_TYPE_STRING;
        } else {
            List<JavaType> typeParameters = typeBindings.getTypeParameters();
            int size = typeParameters.size();
            if (size == 0) {
                _unknownType = _unknownType();
            } else if (size != 2) {
                Object[] objArr = new Object[4];
                objArr[0] = wf0.m29497X(cls);
                objArr[1] = Integer.valueOf(size);
                if (size == 1) {
                    str = "";
                } else {
                    str = "s";
                }
                objArr[2] = str;
                objArr[3] = typeBindings;
                throw new IllegalArgumentException(String.format("Strange Map type %s with %d type parameter%s (%s), can not resolve", objArr));
            } else {
                javaType2 = typeParameters.get(1);
                javaType3 = typeParameters.get(0);
                return MapType.construct(cls, typeBindings, javaType, javaTypeArr, javaType3, javaType2);
            }
        }
        javaType3 = _unknownType;
        javaType2 = javaType3;
        return MapType.construct(cls, typeBindings, javaType, javaTypeArr, javaType3, javaType2);
    }

    public Class<?> classForName(String str, boolean z, ClassLoader classLoader) throws ClassNotFoundException {
        return Class.forName(str, true, classLoader);
    }

    public void clearCache() {
        this._typeCache.clear();
    }

    public ArrayType constructArrayType(Class<?> cls) {
        return ArrayType.construct(_fromAny((tf0) null, cls, (TypeBindings) null), (TypeBindings) null);
    }

    public CollectionLikeType constructCollectionLikeType(Class<?> cls, Class<?> cls2) {
        return constructCollectionLikeType(cls, _fromClass((tf0) null, cls2, EMPTY_BINDINGS));
    }

    public CollectionType constructCollectionType(Class<? extends Collection> cls, Class<?> cls2) {
        return constructCollectionType(cls, _fromClass((tf0) null, cls2, EMPTY_BINDINGS));
    }

    public JavaType constructFromCanonical(String str) throws IllegalArgumentException {
        return this._parser.parse(str);
    }

    public JavaType constructGeneralizedType(JavaType javaType, Class<?> cls) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == cls) {
            return javaType;
        }
        JavaType findSuperType = javaType.findSuperType(cls);
        if (findSuperType != null) {
            return findSuperType;
        }
        if (!cls.isAssignableFrom(rawClass)) {
            throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", new Object[]{cls.getName(), javaType}));
        }
        throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", new Object[]{cls.getName(), javaType}));
    }

    public MapLikeType constructMapLikeType(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        TypeBindings typeBindings = EMPTY_BINDINGS;
        return constructMapLikeType(cls, _fromClass((tf0) null, cls2, typeBindings), _fromClass((tf0) null, cls3, typeBindings));
    }

    public MapType constructMapType(Class<? extends Map> cls, Class<?> cls2, Class<?> cls3) {
        JavaType javaType;
        JavaType javaType2;
        if (cls == Properties.class) {
            javaType2 = CORE_TYPE_STRING;
            javaType = javaType2;
        } else {
            TypeBindings typeBindings = EMPTY_BINDINGS;
            javaType2 = _fromClass((tf0) null, cls2, typeBindings);
            javaType = _fromClass((tf0) null, cls3, typeBindings);
        }
        return constructMapType(cls, javaType2, javaType);
    }

    public JavaType constructParametricType(Class<?> cls, Class<?>... clsArr) {
        int length = clsArr.length;
        JavaType[] javaTypeArr = new JavaType[length];
        for (int i = 0; i < length; i++) {
            javaTypeArr[i] = _fromClass((tf0) null, clsArr[i], EMPTY_BINDINGS);
        }
        return constructParametricType(cls, javaTypeArr);
    }

    @Deprecated
    public JavaType constructParametrizedType(Class<?> cls, Class<?> cls2, JavaType... javaTypeArr) {
        return constructParametricType(cls, javaTypeArr);
    }

    public CollectionLikeType constructRawCollectionLikeType(Class<?> cls) {
        return constructCollectionLikeType(cls, unknownType());
    }

    public CollectionType constructRawCollectionType(Class<? extends Collection> cls) {
        return constructCollectionType(cls, unknownType());
    }

    public MapLikeType constructRawMapLikeType(Class<?> cls) {
        return constructMapLikeType(cls, unknownType(), unknownType());
    }

    public MapType constructRawMapType(Class<? extends Map> cls) {
        return constructMapType(cls, unknownType(), unknownType());
    }

    public JavaType constructReferenceType(Class<?> cls, JavaType javaType) {
        return ReferenceType.construct(cls, TypeBindings.create(cls, javaType), (JavaType) null, (JavaType[]) null, javaType);
    }

    public JavaType constructSimpleType(Class<?> cls, JavaType[] javaTypeArr) {
        return _fromClass((tf0) null, cls, TypeBindings.create(cls, javaTypeArr));
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        return constructSpecializedType(javaType, cls, false);
    }

    public JavaType constructType(Type type) {
        return _fromAny((tf0) null, type, EMPTY_BINDINGS);
    }

    /* renamed from: d */
    public final JavaType mo16920d(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType2;
        List<JavaType> typeParameters = typeBindings.getTypeParameters();
        if (typeParameters.isEmpty()) {
            javaType2 = _unknownType();
        } else if (typeParameters.size() == 1) {
            javaType2 = typeParameters.get(0);
        } else {
            throw new IllegalArgumentException("Strange Reference type " + cls.getName() + ": cannot determine type parameters");
        }
        return ReferenceType.construct(cls, typeBindings, javaType, javaTypeArr, javaType2);
    }

    /* renamed from: e */
    public final String mo16921e(JavaType javaType, JavaType javaType2) throws IllegalArgumentException {
        JavaType javaType3;
        Class<Object> cls = Object.class;
        List<JavaType> typeParameters = javaType.getBindings().getTypeParameters();
        List<JavaType> typeParameters2 = javaType2.getBindings().getTypeParameters();
        int size = typeParameters2.size();
        int size2 = typeParameters.size();
        int i = 0;
        while (i < size2) {
            JavaType javaType4 = typeParameters.get(i);
            if (i < size) {
                javaType3 = typeParameters2.get(i);
            } else {
                javaType3 = unknownType();
            }
            if (mo16922f(javaType4, javaType3) || javaType4.hasRawClass(cls) || ((i == 0 && javaType.isMapLikeType() && javaType3.hasRawClass(cls)) || (javaType4.isInterface() && javaType4.isTypeOrSuperTypeOf(javaType3.getRawClass())))) {
                i++;
            } else {
                return String.format("Type parameter #%d/%d differs; can not specialize %s with %s", new Object[]{Integer.valueOf(i + 1), Integer.valueOf(size2), javaType4.toCanonical(), javaType3.toCanonical()});
            }
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo16922f(JavaType javaType, JavaType javaType2) {
        if (javaType2 instanceof PlaceholderForType) {
            ((PlaceholderForType) javaType2).actualType(javaType);
            return true;
        } else if (javaType.getRawClass() != javaType2.getRawClass()) {
            return false;
        } else {
            List<JavaType> typeParameters = javaType.getBindings().getTypeParameters();
            List<JavaType> typeParameters2 = javaType2.getBindings().getTypeParameters();
            int size = typeParameters.size();
            for (int i = 0; i < size; i++) {
                if (!mo16922f(typeParameters.get(i), typeParameters2.get(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        Class<?> _findPrimitive;
        if (str.indexOf(46) < 0 && (_findPrimitive = _findPrimitive(str)) != null) {
            return _findPrimitive;
        }
        Throwable th = null;
        ClassLoader classLoader = getClassLoader();
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        if (classLoader != null) {
            try {
                return classForName(str, true, classLoader);
            } catch (Exception e) {
                th = wf0.m29479F(e);
            }
        }
        try {
            return classForName(str);
        } catch (Exception e2) {
            if (th == null) {
                th = wf0.m29479F(e2);
            }
            wf0.m29519j0(th);
            throw new ClassNotFoundException(th.getMessage(), th);
        }
    }

    public JavaType[] findTypeParameters(JavaType javaType, Class<?> cls) {
        JavaType findSuperType = javaType.findSuperType(cls);
        if (findSuperType == null) {
            return f10151a;
        }
        return findSuperType.getBindings().typeParameterArray();
    }

    public ClassLoader getClassLoader() {
        return this._classLoader;
    }

    public JavaType moreSpecificType(JavaType javaType, JavaType javaType2) {
        Class<?> rawClass;
        Class<?> rawClass2;
        if (javaType == null) {
            return javaType2;
        }
        if (javaType2 == null || (rawClass = javaType.getRawClass()) == (rawClass2 = javaType2.getRawClass()) || !rawClass.isAssignableFrom(rawClass2)) {
            return javaType;
        }
        return javaType2;
    }

    public JavaType resolveMemberType(Type type, TypeBindings typeBindings) {
        return _fromAny((tf0) null, type, typeBindings);
    }

    @Deprecated
    public JavaType uncheckedSimpleType(Class<?> cls) {
        return _constructSimple(cls, EMPTY_BINDINGS, (JavaType) null, (JavaType[]) null);
    }

    @Deprecated
    public TypeFactory withCache(LRUMap<Object, JavaType> lRUMap) {
        return new TypeFactory(lRUMap, this._parser, this._modifiers, this._classLoader);
    }

    public TypeFactory withClassLoader(ClassLoader classLoader) {
        return new TypeFactory(this._typeCache, this._parser, this._modifiers, classLoader);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.type.TypeFactory withModifier(p000.y07 r6) {
        /*
            r5 = this;
            tl3<java.lang.Object, com.fasterxml.jackson.databind.JavaType> r0 = r5._typeCache
            r1 = 0
            if (r6 != 0) goto L_0x0007
            r0 = r1
            goto L_0x001c
        L_0x0007:
            y07[] r2 = r5._modifiers
            if (r2 != 0) goto L_0x0015
            r0 = 1
            y07[] r0 = new p000.y07[r0]
            r2 = 0
            r0[r2] = r6
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x001c
        L_0x0015:
            java.lang.Object[] r6 = p000.C2103cq.m14360j(r2, r6)
            r1 = r6
            y07[] r1 = (p000.y07[]) r1
        L_0x001c:
            com.fasterxml.jackson.databind.type.TypeFactory r6 = new com.fasterxml.jackson.databind.type.TypeFactory
            com.fasterxml.jackson.databind.type.TypeParser r2 = r5._parser
            java.lang.ClassLoader r3 = r5._classLoader
            r6.<init>((p000.tl3<java.lang.Object, com.fasterxml.jackson.databind.JavaType>) r0, (com.fasterxml.jackson.databind.type.TypeParser) r2, (p000.y07[]) r1, (java.lang.ClassLoader) r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.TypeFactory.withModifier(y07):com.fasterxml.jackson.databind.type.TypeFactory");
    }

    @Deprecated
    public TypeFactory(LRUMap<Object, JavaType> lRUMap) {
        this((tl3<Object, JavaType>) lRUMap);
    }

    public Class<?> classForName(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    public ArrayType constructArrayType(JavaType javaType) {
        return ArrayType.construct(javaType, (TypeBindings) null);
    }

    @Deprecated
    public JavaType constructParametrizedType(Class<?> cls, Class<?> cls2, Class<?>... clsArr) {
        return constructParametricType(cls, clsArr);
    }

    @Deprecated
    public JavaType constructSimpleType(Class<?> cls, Class<?> cls2, JavaType[] javaTypeArr) {
        return constructSimpleType(cls, javaTypeArr);
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls, boolean z) throws IllegalArgumentException {
        JavaType javaType2;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == cls) {
            return javaType;
        }
        if (rawClass == Object.class) {
            javaType2 = _fromClass((tf0) null, cls, EMPTY_BINDINGS);
        } else if (rawClass.isAssignableFrom(cls)) {
            if (javaType.isContainerType()) {
                if (javaType.isMapLikeType()) {
                    if (cls == HashMap.class || cls == LinkedHashMap.class || cls == EnumMap.class || cls == TreeMap.class) {
                        javaType2 = _fromClass((tf0) null, cls, TypeBindings.create(cls, javaType.getKeyType(), javaType.getContentType()));
                    }
                } else if (javaType.isCollectionLikeType()) {
                    if (cls == ArrayList.class || cls == LinkedList.class || cls == HashSet.class || cls == TreeSet.class) {
                        javaType2 = _fromClass((tf0) null, cls, TypeBindings.create(cls, javaType.getContentType()));
                    } else if (rawClass == EnumSet.class) {
                        return javaType;
                    }
                }
            }
            if (javaType.getBindings().isEmpty()) {
                javaType2 = _fromClass((tf0) null, cls, EMPTY_BINDINGS);
            } else {
                int length = cls.getTypeParameters().length;
                if (length == 0) {
                    javaType2 = _fromClass((tf0) null, cls, EMPTY_BINDINGS);
                } else {
                    javaType2 = _fromClass((tf0) null, cls, mo16883a(javaType, length, cls, z));
                }
            }
        } else {
            throw new IllegalArgumentException(String.format("Class %s not subtype of %s", new Object[]{wf0.m29497X(cls), wf0.m29480G(javaType)}));
        }
        return javaType2.withHandlersFrom(javaType);
    }

    public JavaType constructType(j17<?> j17) {
        return _fromAny((tf0) null, j17.getType(), EMPTY_BINDINGS);
    }

    public TypeFactory withCache(tl3<Object, JavaType> tl3) {
        return new TypeFactory(tl3, this._parser, this._modifiers, this._classLoader);
    }

    public TypeFactory(tl3<Object, JavaType> tl3) {
        this._typeCache = tl3 == null ? new LRUMap<>(16, MlKitException.CODE_SCANNER_UNAVAILABLE) : tl3;
        this._parser = new TypeParser(this);
        this._modifiers = null;
        this._classLoader = null;
    }

    @Deprecated
    public JavaType constructType(Type type, TypeBindings typeBindings) {
        if (type instanceof Class) {
            return _applyModifiers(type, _fromClass((tf0) null, (Class) type, typeBindings));
        }
        return _fromAny((tf0) null, type, typeBindings);
    }

    public CollectionLikeType constructCollectionLikeType(Class<?> cls, JavaType javaType) {
        JavaType _fromClass = _fromClass((tf0) null, cls, TypeBindings.createIfNeeded(cls, javaType));
        if (_fromClass instanceof CollectionLikeType) {
            return (CollectionLikeType) _fromClass;
        }
        return CollectionLikeType.upgradeFrom(_fromClass, javaType);
    }

    public CollectionType constructCollectionType(Class<? extends Collection> cls, JavaType javaType) {
        TypeBindings createIfNeeded = TypeBindings.createIfNeeded((Class<?>) cls, javaType);
        CollectionType collectionType = (CollectionType) _fromClass((tf0) null, cls, createIfNeeded);
        if (createIfNeeded.isEmpty() && javaType != null) {
            JavaType contentType = collectionType.findSuperType(Collection.class).getContentType();
            if (!contentType.equals(javaType)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", new Object[]{wf0.m29497X(cls), javaType, contentType}));
            }
        }
        return collectionType;
    }

    @Deprecated
    public JavaType[] findTypeParameters(Class<?> cls, Class<?> cls2, TypeBindings typeBindings) {
        return findTypeParameters(constructType((Type) cls, typeBindings), cls2);
    }

    public MapLikeType constructMapLikeType(Class<?> cls, JavaType javaType, JavaType javaType2) {
        JavaType _fromClass = _fromClass((tf0) null, cls, TypeBindings.createIfNeeded(cls, new JavaType[]{javaType, javaType2}));
        if (_fromClass instanceof MapLikeType) {
            return (MapLikeType) _fromClass;
        }
        return MapLikeType.upgradeFrom(_fromClass, javaType, javaType2);
    }

    public JavaType constructParametricType(Class<?> cls, JavaType... javaTypeArr) {
        return constructParametricType(cls, TypeBindings.create(cls, javaTypeArr));
    }

    @Deprecated
    public JavaType[] findTypeParameters(Class<?> cls, Class<?> cls2) {
        return findTypeParameters(constructType((Type) cls), cls2);
    }

    public MapType constructMapType(Class<? extends Map> cls, JavaType javaType, JavaType javaType2) {
        TypeBindings createIfNeeded = TypeBindings.createIfNeeded((Class<?>) cls, new JavaType[]{javaType, javaType2});
        MapType mapType = (MapType) _fromClass((tf0) null, cls, createIfNeeded);
        if (createIfNeeded.isEmpty()) {
            JavaType findSuperType = mapType.findSuperType(Map.class);
            JavaType keyType = findSuperType.getKeyType();
            if (keyType.equals(javaType)) {
                JavaType contentType = findSuperType.getContentType();
                if (!contentType.equals(javaType2)) {
                    throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", new Object[]{wf0.m29497X(cls), javaType2, contentType}));
                }
            } else {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", new Object[]{wf0.m29497X(cls), javaType, keyType}));
            }
        }
        return mapType;
    }

    public JavaType constructParametricType(Class<?> cls, TypeBindings typeBindings) {
        return _applyModifiers(cls, _fromClass((tf0) null, cls, typeBindings));
    }

    @Deprecated
    public JavaType constructType(Type type, Class<?> cls) {
        return constructType(type, cls == null ? null : constructType((Type) cls));
    }

    @Deprecated
    public TypeFactory(LRUMap<Object, JavaType> lRUMap, TypeParser typeParser, y07[] y07Arr, ClassLoader classLoader) {
        this((tl3<Object, JavaType>) lRUMap, typeParser, y07Arr, classLoader);
    }

    @Deprecated
    public JavaType constructType(Type type, JavaType javaType) {
        TypeBindings typeBindings;
        if (javaType == null) {
            typeBindings = EMPTY_BINDINGS;
        } else {
            TypeBindings bindings = javaType.getBindings();
            if (type.getClass() != Class.class) {
                TypeBindings typeBindings2 = bindings;
                JavaType javaType2 = javaType;
                typeBindings = typeBindings2;
                while (typeBindings.isEmpty() && (javaType2 = javaType2.getSuperClass()) != null) {
                    typeBindings = javaType2.getBindings();
                }
            } else {
                typeBindings = bindings;
            }
        }
        return _fromAny((tf0) null, type, typeBindings);
    }

    public TypeFactory(tl3<Object, JavaType> tl3, TypeParser typeParser, y07[] y07Arr, ClassLoader classLoader) {
        this._typeCache = tl3 == null ? new LRUMap<>(16, MlKitException.CODE_SCANNER_UNAVAILABLE) : tl3;
        this._parser = typeParser.withFactory(this);
        this._modifiers = y07Arr;
        this._classLoader = classLoader;
    }
}
