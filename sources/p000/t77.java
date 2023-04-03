package p000;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import okhttp3.HttpUrl;
import okhttp3.ResponseBody;

/* renamed from: t77 */
/* compiled from: Utils */
public final class t77 {

    /* renamed from: a */
    public static final Type[] f44677a = new Type[0];

    /* renamed from: t77$a */
    /* compiled from: Utils */
    public static final class C9328a implements GenericArrayType {

        /* renamed from: a */
        public final Type f44678a;

        public C9328a(Type type) {
            this.f44678a = type;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !t77.m72173d(this, (GenericArrayType) obj)) {
                return false;
            }
            return true;
        }

        public Type getGenericComponentType() {
            return this.f44678a;
        }

        public int hashCode() {
            return this.f44678a.hashCode();
        }

        public String toString() {
            return t77.m72189t(this.f44678a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* renamed from: t77$b */
    /* compiled from: Utils */
    public static final class C9329b implements ParameterizedType {

        /* renamed from: a */
        public final Type f44679a;

        /* renamed from: d */
        public final Type f44680d;

        /* renamed from: e */
        public final Type[] f44681e;

        public C9329b(Type type, Type type2, Type... typeArr) {
            boolean z;
            if (type2 instanceof Class) {
                boolean z2 = true;
                if (type == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != (((Class) type2).getEnclosingClass() != null ? false : z2)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                t77.m72171b(type3);
            }
            this.f44679a = type;
            this.f44680d = type2;
            this.f44681e = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !t77.m72173d(this, (ParameterizedType) obj)) {
                return false;
            }
            return true;
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f44681e.clone();
        }

        public Type getOwnerType() {
            return this.f44679a;
        }

        public Type getRawType() {
            return this.f44680d;
        }

        public int hashCode() {
            int i;
            int hashCode = Arrays.hashCode(this.f44681e) ^ this.f44680d.hashCode();
            Type type = this.f44679a;
            if (type != null) {
                i = type.hashCode();
            } else {
                i = 0;
            }
            return hashCode ^ i;
        }

        public String toString() {
            Type[] typeArr = this.f44681e;
            if (typeArr.length == 0) {
                return t77.m72189t(this.f44680d);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(t77.m72189t(this.f44680d));
            sb.append("<");
            sb.append(t77.m72189t(this.f44681e[0]));
            for (int i = 1; i < this.f44681e.length; i++) {
                sb.append(", ");
                sb.append(t77.m72189t(this.f44681e[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: t77$c */
    /* compiled from: Utils */
    public static final class C9330c implements WildcardType {

        /* renamed from: a */
        public final Type f44682a;

        /* renamed from: d */
        public final Type f44683d;

        public C9330c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                Type type = typeArr2[0];
                type.getClass();
                t77.m72171b(type);
                if (typeArr[0] == cls) {
                    this.f44683d = typeArr2[0];
                    this.f44682a = cls;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                Type type2 = typeArr[0];
                type2.getClass();
                t77.m72171b(type2);
                this.f44683d = null;
                this.f44682a = typeArr[0];
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !t77.m72173d(this, (WildcardType) obj)) {
                return false;
            }
            return true;
        }

        public Type[] getLowerBounds() {
            Type type = this.f44683d;
            if (type == null) {
                return t77.f44677a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f44682a};
        }

        public int hashCode() {
            int i;
            Type type = this.f44683d;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f44682a.hashCode() + 31);
        }

        public String toString() {
            if (this.f44683d != null) {
                return "? super " + t77.m72189t(this.f44683d);
            } else if (this.f44682a == Object.class) {
                return "?";
            } else {
                return "? extends " + t77.m72189t(this.f44682a);
            }
        }
    }

    /* renamed from: a */
    public static ResponseBody m72170a(ResponseBody responseBody) throws IOException {
        m40 m40 = new m40();
        responseBody.source().mo56035R0(m40);
        return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), (w40) m40);
    }

    /* renamed from: b */
    public static void m72171b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static Class<?> m72172c(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m72173d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if ((ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m72173d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
    public static Type m72174e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m72174e(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m72174e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: f */
    public static Type m72175f(int i, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i];
        if (type instanceof WildcardType) {
            return ((WildcardType) type).getLowerBounds()[0];
        }
        return type;
    }

    /* renamed from: g */
    public static Type m72176g(int i, ParameterizedType parameterizedType) {
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

    /* renamed from: h */
    public static Class<?> m72177h(Type type) {
        Objects.requireNonNull(type, "type == null");
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
            return Array.newInstance(m72177h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m72177h(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    /* renamed from: i */
    public static Type m72178i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m72186q(type, cls, m72174e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public static boolean m72179j(Type type) {
        String str;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type j : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m72179j(j)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return m72179j(((GenericArrayType) type).getGenericComponentType());
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

    /* renamed from: k */
    public static int m72180k(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: l */
    public static boolean m72181l(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static RuntimeException m72182m(Method method, String str, Object... objArr) {
        return m72183n(method, (Throwable) null, str, objArr);
    }

    /* renamed from: n */
    public static RuntimeException m72183n(Method method, Throwable th, String str, Object... objArr) {
        String format = String.format(str, objArr);
        return new IllegalArgumentException(format + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    /* renamed from: o */
    public static RuntimeException m72184o(Method method, int i, String str, Object... objArr) {
        return m72182m(method, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    /* renamed from: p */
    public static RuntimeException m72185p(Method method, Throwable th, int i, String str, Object... objArr) {
        return m72183n(method, th, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m72186q(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x000f
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.Type r0 = m72187r(r8, r9, r10)
            if (r0 != r10) goto L_0x000d
            return r0
        L_0x000d:
            r10 = r0
            goto L_0x0000
        L_0x000f:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x002d
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x002d
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m72186q(r8, r9, r10)
            if (r10 != r8) goto L_0x0027
            goto L_0x002c
        L_0x0027:
            t77$a r0 = new t77$a
            r0.<init>(r8)
        L_0x002c:
            return r0
        L_0x002d:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0044
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m72186q(r8, r9, r0)
            if (r0 != r8) goto L_0x003e
            goto L_0x0043
        L_0x003e:
            t77$a r10 = new t77$a
            r10.<init>(r8)
        L_0x0043:
            return r10
        L_0x0044:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0086
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m72186q(r8, r9, r0)
            if (r3 == r0) goto L_0x0058
            r0 = r1
            goto L_0x0059
        L_0x0058:
            r0 = r2
        L_0x0059:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x005e:
            if (r2 >= r5) goto L_0x0079
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m72186q(r8, r9, r6)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x0076
            if (r0 != 0) goto L_0x0074
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r1
        L_0x0074:
            r4[r2] = r6
        L_0x0076:
            int r2 = r2 + 1
            goto L_0x005e
        L_0x0079:
            if (r0 == 0) goto L_0x0085
            t77$b r8 = new t77$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x0085:
            return r10
        L_0x0086:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00ca
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00b1
            r3 = r0[r2]
            java.lang.reflect.Type r8 = m72186q(r8, r9, r3)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00ca
            t77$c r9 = new t77$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r2] = r0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r1]
            r0[r2] = r8
            r9.<init>(r10, r0)
            return r9
        L_0x00b1:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00ca
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m72186q(r8, r9, r0)     // Catch:{ all -> 0x00cb }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00ca
            t77$c r9 = new t77$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            r10[r2] = r8
            java.lang.reflect.Type[] r8 = f44677a
            r9.<init>(r10, r8)
            return r9
        L_0x00ca:
            return r10
        L_0x00cb:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.t77.m72186q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: r */
    public static Type m72187r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> c = m72172c(typeVariable);
        if (c == null) {
            return typeVariable;
        }
        Type e = m72174e(type, cls, c);
        if (!(e instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) e).getActualTypeArguments()[m72180k(c.getTypeParameters(), typeVariable)];
    }

    /* renamed from: s */
    public static void m72188s(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: t */
    public static String m72189t(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }
}
