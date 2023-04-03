package p000;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.HttpUrl;

/* renamed from: t67 */
/* compiled from: Util */
public final class t67 {

    /* renamed from: a */
    public static final Set<Annotation> f34128a = Collections.emptySet();

    /* renamed from: b */
    public static final Type[] f34129b = new Type[0];

    /* renamed from: c */
    public static final Class<?> f34130c = DefaultConstructorMarker.class;

    /* renamed from: d */
    public static final Class<? extends Annotation> f34131d;

    /* renamed from: e */
    public static final Map<Class<?>, Class<?>> f34132e;

    /* renamed from: t67$a */
    /* compiled from: Util */
    public static final class C6515a implements GenericArrayType {

        /* renamed from: a */
        public final Type f34133a;

        public C6515a(Type type) {
            this.f34133a = t67.m52100a(type);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !u27.m52588d(this, (GenericArrayType) obj)) {
                return false;
            }
            return true;
        }

        public Type getGenericComponentType() {
            return this.f34133a;
        }

        public int hashCode() {
            return this.f34133a.hashCode();
        }

        public String toString() {
            return t67.m52120u(this.f34133a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* renamed from: t67$b */
    /* compiled from: Util */
    public static final class C6516b implements ParameterizedType {

        /* renamed from: a */
        public final Type f34134a;

        /* renamed from: d */
        public final Type f34135d;

        /* renamed from: e */
        public final Type[] f34136e;

        public C6516b(Type type, Type type2, Type... typeArr) {
            Type type3;
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || u27.m52591g(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = t67.m52100a(type);
            }
            this.f34134a = type3;
            this.f34135d = t67.m52100a(type2);
            this.f34136e = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.f34136e;
                if (i < typeArr2.length) {
                    Type type4 = typeArr2[i];
                    type4.getClass();
                    t67.m52101b(type4);
                    Type[] typeArr3 = this.f34136e;
                    typeArr3[i] = t67.m52100a(typeArr3[i]);
                    i++;
                } else {
                    return;
                }
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !u27.m52588d(this, (ParameterizedType) obj)) {
                return false;
            }
            return true;
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f34136e.clone();
        }

        public Type getOwnerType() {
            return this.f34134a;
        }

        public Type getRawType() {
            return this.f34135d;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f34136e) ^ this.f34135d.hashCode()) ^ t67.m52105f(this.f34134a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f34136e.length + 1) * 30);
            sb.append(t67.m52120u(this.f34135d));
            if (this.f34136e.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(t67.m52120u(this.f34136e[0]));
            for (int i = 1; i < this.f34136e.length; i++) {
                sb.append(", ");
                sb.append(t67.m52120u(this.f34136e[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: t67$c */
    /* compiled from: Util */
    public static final class C6517c implements WildcardType {

        /* renamed from: a */
        public final Type f34137a;

        /* renamed from: d */
        public final Type f34138d;

        public C6517c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                Type type = typeArr2[0];
                type.getClass();
                t67.m52101b(type);
                if (typeArr[0] == cls) {
                    this.f34138d = t67.m52100a(typeArr2[0]);
                    this.f34137a = cls;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                Type type2 = typeArr[0];
                type2.getClass();
                t67.m52101b(type2);
                this.f34138d = null;
                this.f34137a = t67.m52100a(typeArr[0]);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !u27.m52588d(this, (WildcardType) obj)) {
                return false;
            }
            return true;
        }

        public Type[] getLowerBounds() {
            Type type = this.f34138d;
            if (type == null) {
                return t67.f34129b;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f34137a};
        }

        public int hashCode() {
            int i;
            Type type = this.f34138d;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f34137a.hashCode() + 31);
        }

        public String toString() {
            if (this.f34138d != null) {
                return "? super " + t67.m52120u(this.f34138d);
            } else if (this.f34137a == Object.class) {
                return "?";
            } else {
                return "? extends " + t67.m52120u(this.f34137a);
            }
        }
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f34131d = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f34132e = Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    public static Type m52100a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new C6515a(m52100a(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof C6516b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C6516b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (type instanceof C6515a) {
                return type;
            }
            return new C6515a(((GenericArrayType) type).getGenericComponentType());
        } else if (!(type instanceof WildcardType) || (type instanceof C6517c)) {
            return type;
        } else {
            WildcardType wildcardType = (WildcardType) type;
            return new C6517c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: b */
    public static void m52101b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /* renamed from: c */
    public static Class<?> m52102c(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        throw m52118s(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        throw new java.lang.RuntimeException("Failed to instantiate the generated JsonAdapter for " + r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0096, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        throw new java.lang.RuntimeException("Failed to access the generated JsonAdapter for " + r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f9, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0110, code lost:
        throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter class for " + r7, r6);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0046 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0062 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078 A[ExcHandler: InvocationTargetException (r6v5 'e' java.lang.reflect.InvocationTargetException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e A[ExcHandler: InstantiationException (r6v4 'e' java.lang.InstantiationException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0096 A[ExcHandler: IllegalAccessException (r6v3 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f9 A[ExcHandler: ClassNotFoundException (r6v1 'e' java.lang.ClassNotFoundException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0062=Splitter:B:16:0x0062, B:12:0x0046=Splitter:B:12:0x0046} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.squareup.moshi.C5391d<?> m52103d(com.squareup.moshi.C5401h r6, java.lang.reflect.Type r7, java.lang.Class<?> r8) {
        /*
            java.lang.Class<com.squareup.moshi.h> r0 = com.squareup.moshi.C5401h.class
            java.lang.Class<h43> r1 = p000.h43.class
            java.lang.annotation.Annotation r1 = r8.getAnnotation(r1)
            h43 r1 = (p000.h43) r1
            r2 = 0
            if (r1 == 0) goto L_0x0111
            boolean r1 = r1.generateAdapter()
            if (r1 != 0) goto L_0x0015
            goto L_0x0111
        L_0x0015:
            java.lang.String r1 = r8.getName()
            java.lang.String r1 = p000.u27.m52589e(r1)
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00f9, NoSuchMethodException -> 0x00ae, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            r3 = 1
            java.lang.Class r2 = java.lang.Class.forName(r1, r3, r8)     // Catch:{ ClassNotFoundException -> 0x00f9, NoSuchMethodException -> 0x00ae, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            boolean r8 = r7 instanceof java.lang.reflect.ParameterizedType     // Catch:{ ClassNotFoundException -> 0x00f9, NoSuchMethodException -> 0x00ae, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            r1 = 0
            if (r8 == 0) goto L_0x0055
            r8 = r7
            java.lang.reflect.ParameterizedType r8 = (java.lang.reflect.ParameterizedType) r8     // Catch:{ ClassNotFoundException -> 0x00f9, NoSuchMethodException -> 0x00ae, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            java.lang.reflect.Type[] r8 = r8.getActualTypeArguments()     // Catch:{ ClassNotFoundException -> 0x00f9, NoSuchMethodException -> 0x00ae, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00f9, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            r5[r1] = r0     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00f9, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            java.lang.Class<java.lang.reflect.Type[]> r0 = java.lang.reflect.Type[].class
            r5[r3] = r0     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00f9, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            java.lang.reflect.Constructor r0 = r2.getDeclaredConstructor(r5)     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00f9, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00f9, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            r4[r1] = r6     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00f9, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            r4[r3] = r8     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00f9, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            goto L_0x006a
        L_0x0046:
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x00f9, NoSuchMethodException -> 0x00ae, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            java.lang.Class<java.lang.reflect.Type[]> r0 = java.lang.reflect.Type[].class
            r6[r1] = r0     // Catch:{ ClassNotFoundException -> 0x00f9, NoSuchMethodException -> 0x00ae, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            java.lang.reflect.Constructor r0 = r2.getDeclaredConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00f9, NoSuchMethodException -> 0x00ae, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x00f9, NoSuchMethodException -> 0x00ae, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            r4[r1] = r8     // Catch:{ ClassNotFoundException -> 0x00f9, NoSuchMethodException -> 0x00ae, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            goto L_0x006a
        L_0x0055:
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0062, ClassNotFoundException -> 0x00f9, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            r8[r1] = r0     // Catch:{ NoSuchMethodException -> 0x0062, ClassNotFoundException -> 0x00f9, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            java.lang.reflect.Constructor r0 = r2.getDeclaredConstructor(r8)     // Catch:{ NoSuchMethodException -> 0x0062, ClassNotFoundException -> 0x00f9, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x0062, ClassNotFoundException -> 0x00f9, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            r4[r1] = r6     // Catch:{ NoSuchMethodException -> 0x0062, ClassNotFoundException -> 0x00f9, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            goto L_0x006a
        L_0x0062:
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x00f9, NoSuchMethodException -> 0x00ae, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            java.lang.reflect.Constructor r0 = r2.getDeclaredConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00f9, NoSuchMethodException -> 0x00ae, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x00f9, NoSuchMethodException -> 0x00ae, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
        L_0x006a:
            r0.setAccessible(r3)     // Catch:{ ClassNotFoundException -> 0x00f9, NoSuchMethodException -> 0x00ae, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            java.lang.Object r6 = r0.newInstance(r4)     // Catch:{ ClassNotFoundException -> 0x00f9, NoSuchMethodException -> 0x00ae, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            com.squareup.moshi.d r6 = (com.squareup.moshi.C5391d) r6     // Catch:{ ClassNotFoundException -> 0x00f9, NoSuchMethodException -> 0x00ae, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            com.squareup.moshi.d r6 = r6.mo39365f()     // Catch:{ ClassNotFoundException -> 0x00f9, NoSuchMethodException -> 0x00ae, IllegalAccessException -> 0x0096, InstantiationException -> 0x007e, InvocationTargetException -> 0x0078 }
            return r6
        L_0x0078:
            r6 = move-exception
            java.lang.RuntimeException r6 = m52118s(r6)
            throw r6
        L_0x007e:
            r6 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to instantiate the generated JsonAdapter for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7, r6)
            throw r8
        L_0x0096:
            r6 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to access the generated JsonAdapter for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7, r6)
            throw r8
        L_0x00ae:
            r6 = move-exception
            boolean r8 = r7 instanceof java.lang.reflect.ParameterizedType
            if (r8 != 0) goto L_0x00e2
            java.lang.reflect.TypeVariable[] r8 = r2.getTypeParameters()
            int r8 = r8.length
            if (r8 == 0) goto L_0x00e2
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter constructor for '"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = "'. Suspiciously, the type was not parameterized but the target class '"
            r0.append(r7)
            java.lang.String r7 = r2.getCanonicalName()
            r0.append(r7)
            java.lang.String r7 = "' is generic. Consider using Types#newParameterizedType() to define these missing type variables."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7, r6)
            throw r8
        L_0x00e2:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter constructor for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7, r6)
            throw r8
        L_0x00f9:
            r6 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter class for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7, r6)
            throw r8
        L_0x0111:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.t67.m52103d(com.squareup.moshi.h, java.lang.reflect.Type, java.lang.Class):com.squareup.moshi.d");
    }

    /* renamed from: e */
    public static Type m52104e(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m52104e(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return m52104e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: f */
    public static int m52105f(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: g */
    public static int m52106g(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* renamed from: h */
    public static boolean m52107h(Class<?> cls) {
        Class<? extends Annotation> cls2 = f34131d;
        if (cls2 == null || !cls.isAnnotationPresent(cls2)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m52108i(Class<?> cls) {
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.")) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static Set<? extends Annotation> m52109j(AnnotatedElement annotatedElement) {
        return m52110k(annotatedElement.getAnnotations());
    }

    /* renamed from: k */
    public static Set<? extends Annotation> m52110k(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(r53.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        if (linkedHashSet != null) {
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return f34128a;
    }

    /* renamed from: l */
    public static String m52111l(String str, y33 y33) {
        if (y33 == null) {
            return str;
        }
        String name = y33.name();
        if ("\u0000".equals(name)) {
            return str;
        }
        return name;
    }

    /* renamed from: m */
    public static String m52112m(String str, AnnotatedElement annotatedElement) {
        return m52111l(str, (y33) annotatedElement.getAnnotation(y33.class));
    }

    /* renamed from: n */
    public static JsonDataException m52113n(String str, String str2, JsonReader jsonReader) {
        String str3;
        String path = jsonReader.getPath();
        if (str2.equals(str)) {
            str3 = String.format("Required value '%s' missing at %s", new Object[]{str, path});
        } else {
            str3 = String.format("Required value '%s' (JSON name '%s') missing at %s", new Object[]{str, str2, path});
        }
        return new JsonDataException(str3);
    }

    /* renamed from: o */
    public static Type m52114o(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: p */
    public static Type m52115p(Type type, Class<?> cls, Type type2) {
        return m52116q(type, cls, type2, new LinkedHashSet());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m52116q(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable<?>> r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x0018
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto L_0x000e
            return r10
        L_0x000e:
            r11.add(r0)
            java.lang.reflect.Type r10 = m52117r(r8, r9, r0)
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x0018:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0035
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x0035
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m52116q(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0030
            goto L_0x0034
        L_0x0030:
            java.lang.reflect.GenericArrayType r0 = p000.u27.m52586b(r8)
        L_0x0034:
            return r0
        L_0x0035:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x004b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m52116q(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            java.lang.reflect.GenericArrayType r10 = p000.u27.m52586b(r8)
        L_0x004a:
            return r10
        L_0x004b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m52116q(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x005f
            r0 = r1
            goto L_0x0060
        L_0x005f:
            r0 = r2
        L_0x0060:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0065:
            if (r2 >= r5) goto L_0x0080
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m52116q(r8, r9, r6, r11)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x007d
            if (r0 != 0) goto L_0x007b
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r1
        L_0x007b:
            r4[r2] = r6
        L_0x007d:
            int r2 = r2 + 1
            goto L_0x0065
        L_0x0080:
            if (r0 == 0) goto L_0x008c
            t67$b r8 = new t67$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x008c:
            return r10
        L_0x008d:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00bf
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00ad
            r1 = r0[r2]
            java.lang.reflect.Type r8 = m52116q(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00bf
            java.lang.reflect.WildcardType r8 = p000.u27.m52596l(r8)
            return r8
        L_0x00ad:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00bf
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m52116q(r8, r9, r0, r11)     // Catch:{ all -> 0x00c0 }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00bf
            java.lang.reflect.WildcardType r8 = p000.u27.m52595k(r8)
            return r8
        L_0x00bf:
            return r10
        L_0x00c0:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.t67.m52116q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    /* renamed from: r */
    public static Type m52117r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> c = m52102c(typeVariable);
        if (c == null) {
            return typeVariable;
        }
        Type e = m52104e(type, cls, c);
        if (!(e instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) e).getActualTypeArguments()[m52106g(c.getTypeParameters(), typeVariable)];
    }

    /* renamed from: s */
    public static RuntimeException m52118s(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        } else if (targetException instanceof Error) {
            throw ((Error) targetException);
        } else {
            throw new RuntimeException(targetException);
        }
    }

    /* renamed from: t */
    public static String m52119t(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: u */
    public static String m52120u(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    /* renamed from: v */
    public static JsonDataException m52121v(String str, String str2, JsonReader jsonReader) {
        String str3;
        String path = jsonReader.getPath();
        if (str2.equals(str)) {
            str3 = String.format("Non-null value '%s' was null at %s", new Object[]{str, path});
        } else {
            str3 = String.format("Non-null value '%s' (JSON name '%s') was null at %s", new Object[]{str, str2, path});
        }
        return new JsonDataException(str3);
    }
}
