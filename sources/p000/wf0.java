package p000;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.github.mikephil.charting.utils.Utils;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: wf0 */
/* compiled from: ClassUtil */
public final class wf0 {

    /* renamed from: a */
    public static final Class<?> f19078a = Object.class;

    /* renamed from: b */
    public static final Annotation[] f19079b = new Annotation[0];

    /* renamed from: c */
    public static final C3534a[] f19080c = new C3534a[0];

    /* renamed from: d */
    public static final Iterator<?> f19081d = Collections.emptyIterator();

    /* renamed from: wf0$a */
    /* compiled from: ClassUtil */
    public static final class C3534a {

        /* renamed from: a */
        public final Constructor<?> f19082a;

        /* renamed from: b */
        public transient Annotation[] f19083b;

        /* renamed from: c */
        public transient Annotation[][] f19084c;

        /* renamed from: d */
        public int f19085d = -1;

        public C3534a(Constructor<?> constructor) {
            this.f19082a = constructor;
        }

        /* renamed from: a */
        public Constructor<?> mo27500a() {
            return this.f19082a;
        }

        /* renamed from: b */
        public Annotation[] mo27501b() {
            Annotation[] annotationArr = this.f19083b;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[] declaredAnnotations = this.f19082a.getDeclaredAnnotations();
            this.f19083b = declaredAnnotations;
            return declaredAnnotations;
        }

        /* renamed from: c */
        public Class<?> mo27502c() {
            return this.f19082a.getDeclaringClass();
        }

        /* renamed from: d */
        public int mo27503d() {
            int i = this.f19085d;
            if (i >= 0) {
                return i;
            }
            int length = this.f19082a.getParameterTypes().length;
            this.f19085d = length;
            return length;
        }

        /* renamed from: e */
        public Annotation[][] mo27504e() {
            Annotation[][] annotationArr = this.f19084c;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[][] parameterAnnotations = this.f19082a.getParameterAnnotations();
            this.f19084c = parameterAnnotations;
            return parameterAnnotations;
        }
    }

    /* renamed from: wf0$b */
    /* compiled from: ClassUtil */
    public static class C3535b {

        /* renamed from: e */
        public static final C3535b f19086e = new C3535b();

        /* renamed from: a */
        public final Field f19087a;

        /* renamed from: b */
        public final Field f19088b;

        /* renamed from: c */
        public final String f19089c;

        /* renamed from: d */
        public final String f19090d;

        public C3535b() {
            String str;
            Field field;
            String str2;
            Field field2 = null;
            try {
                field = m29546d(EnumSet.class, "elementType", Class.class);
                str = null;
            } catch (Exception e) {
                str = e.toString();
                field = null;
            }
            this.f19087a = field;
            this.f19089c = str;
            try {
                str2 = null;
                field2 = m29546d(EnumMap.class, "keyType", Class.class);
            } catch (Exception e2) {
                str2 = e2.toString();
            }
            this.f19088b = field2;
            this.f19090d = str2;
        }

        /* renamed from: d */
        public static Field m29546d(Class<?> cls, String str, Class<?> cls2) throws Exception {
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                if (!str.equals(field.getName()) || field.getType() != cls2) {
                    i++;
                } else {
                    field.setAccessible(true);
                    return field;
                }
            }
            throw new IllegalStateException(String.format("No field named '%s' in class '%s'", new Object[]{str, cls.getTypeName()}));
        }

        /* renamed from: a */
        public Class<? extends Enum<?>> mo27505a(EnumMap<?, ?> enumMap) {
            Field field = this.f19088b;
            if (field != null) {
                return (Class) mo27507c(enumMap, field);
            }
            throw new IllegalStateException("Cannot figure out type parameter for `EnumMap` (odd JDK platform?), problem: " + this.f19090d);
        }

        /* renamed from: b */
        public Class<? extends Enum<?>> mo27506b(EnumSet<?> enumSet) {
            Field field = this.f19087a;
            if (field != null) {
                return (Class) mo27507c(enumSet, field);
            }
            throw new IllegalStateException("Cannot figure out type parameter for `EnumSet` (odd JDK platform?), problem: " + this.f19089c);
        }

        /* renamed from: c */
        public final Object mo27507c(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    /* renamed from: A */
    public static C3534a[] m29474A(Class<?> cls) {
        if (cls.isInterface() || m29491R(cls)) {
            return f19080c;
        }
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        C3534a[] aVarArr = new C3534a[length];
        for (int i = 0; i < length; i++) {
            aVarArr[i] = new C3534a(declaredConstructors[i]);
        }
        return aVarArr;
    }

    /* renamed from: B */
    public static Class<?> m29475B(Class<?> cls) {
        if (m29491R(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    /* renamed from: C */
    public static Type[] m29476C(Class<?> cls) {
        return cls.getGenericInterfaces();
    }

    /* renamed from: D */
    public static Type m29477D(Class<?> cls) {
        return cls.getGenericSuperclass();
    }

    /* renamed from: E */
    public static Class<?> m29478E(Class<?> cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if (m29482I(cls)) {
                    return null;
                }
                return m29475B(cls);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    /* renamed from: F */
    public static Throwable m29479F(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    /* renamed from: G */
    public static String m29480G(JavaType javaType) {
        if (javaType == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(80);
        sb.append('`');
        sb.append(javaType.toCanonical());
        sb.append('`');
        return sb.toString();
    }

    /* renamed from: H */
    public static boolean m29481H(Object obj, Class<?> cls) {
        if (obj == null || obj.getClass() != cls) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public static boolean m29482I(Class<?> cls) {
        if (m29491R(cls) || cls.getEnclosingMethod() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public static boolean m29483J(Class<?> cls) {
        if (cls == Void.class || cls == Void.TYPE || cls == l74.class) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public static boolean m29484K(Class<?> cls) {
        if ((cls.getModifiers() & 1536) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public static boolean m29485L(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }

    /* renamed from: M */
    public static boolean m29486M(Class<?> cls) {
        String name = cls.getName();
        if (name.startsWith("java.") || name.startsWith("javax.")) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public static boolean m29487N(Class<?> cls) {
        if (cls.getAnnotation(zz2.class) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public static boolean m29488O(Object obj) {
        if (obj == null || m29487N(obj.getClass())) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public static String m29489P(Class<?> cls, boolean z) {
        try {
            boolean isStatic = Modifier.isStatic(cls.getModifiers());
            if (!isStatic && m29482I(cls)) {
                return "local/anonymous";
            }
            if (z || isStatic || m29475B(cls) == null) {
                return null;
            }
            return "non-static member class";
        } catch (NullPointerException | SecurityException unused) {
            return null;
        }
    }

    /* renamed from: Q */
    public static boolean m29490Q(Class<?> cls) {
        if (Modifier.isStatic(cls.getModifiers()) || m29475B(cls) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    public static boolean m29491R(Class<?> cls) {
        if (cls == f19078a || cls.isPrimitive()) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public static boolean m29492S(Class<?> cls) {
        String name = cls.getName();
        if (name.startsWith("net.sf.cglib.proxy.") || name.startsWith("org.hibernate.proxy.")) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public static boolean m29493T(Class<?> cls) {
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null || !"java.lang.Record".equals(superclass.getName())) {
            return false;
        }
        return true;
    }

    /* renamed from: U */
    public static String m29494U(PropertyName propertyName) {
        if (propertyName == null) {
            return "[null]";
        }
        return m29506d(propertyName.getSimpleName());
    }

    /* renamed from: V */
    public static String m29495V(String str) {
        if (str == null) {
            return "[null]";
        }
        return m29506d(str);
    }

    /* renamed from: W */
    public static String m29496W(y24 y24) {
        if (y24 == null) {
            return "[null]";
        }
        return m29506d(y24.getName());
    }

    /* renamed from: X */
    public static String m29497X(Class<?> cls) {
        String str;
        if (cls == null) {
            return "[null]";
        }
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            str = cls.getSimpleName();
        } else {
            str = cls.getName();
        }
        if (i > 0) {
            StringBuilder sb = new StringBuilder(str);
            do {
                sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                i--;
            } while (i > 0);
            str = sb.toString();
        }
        return m29508e(str);
    }

    /* renamed from: Y */
    public static <T> T m29498Y(T t, T t2) {
        return t == null ? t2 : t;
    }

    /* renamed from: Z */
    public static String m29499Z(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public static void m29500a(Class<?> cls, Class<?> cls2, Collection<Class<?>> collection, boolean z) {
        if (cls != cls2 && cls != null && cls != Object.class) {
            if (z) {
                if (!collection.contains(cls)) {
                    collection.add(cls);
                } else {
                    return;
                }
            }
            for (Class a : m29504c(cls)) {
                m29500a(a, cls2, collection, true);
            }
            m29500a(cls.getSuperclass(), cls2, collection, true);
        }
    }

    /* renamed from: a0 */
    public static String m29501a0(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /* renamed from: b */
    public static Method[] m29502b(Class<?> cls, Throwable th) throws IllegalArgumentException {
        throw new IllegalArgumentException(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", new Object[]{cls.getName(), th.getClass().getName(), th.getMessage()}), th);
    }

    /* renamed from: b0 */
    public static Class<?> m29503b0(Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    /* renamed from: c */
    public static Class<?>[] m29504c(Class<?> cls) {
        return cls.getInterfaces();
    }

    /* renamed from: c0 */
    public static String m29505c0(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        return String.format("\"%s\"", new Object[]{obj});
    }

    /* renamed from: d */
    public static String m29506d(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\'');
        sb.append(str);
        sb.append('\'');
        return sb.toString();
    }

    /* renamed from: d0 */
    public static Class<?> m29507d0(JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    /* renamed from: e */
    public static String m29508e(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('`');
        sb.append(str);
        sb.append('`');
        return sb.toString();
    }

    /* renamed from: e0 */
    public static void m29509e0(Throwable th) {
        m29511f0(th, th.getMessage());
    }

    /* renamed from: f */
    public static String m29510f(Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    /* renamed from: f0 */
    public static void m29511f0(Throwable th, String str) {
        m29519j0(th);
        m29515h0(th);
        throw new IllegalArgumentException(str, th);
    }

    /* renamed from: g */
    public static void m29512g(Member member, boolean z) {
        boolean z2;
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            Class<?> declaringClass = member.getDeclaringClass();
            if (!Modifier.isPublic(member.getModifiers()) || !Modifier.isPublic(declaringClass.getModifiers())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 || (z && !m29486M(declaringClass))) {
                accessibleObject.setAccessible(true);
            }
        } catch (SecurityException e) {
            if (!accessibleObject.isAccessible()) {
                Class<?> declaringClass2 = member.getDeclaringClass();
                throw new IllegalArgumentException("Cannot access " + member + " (from class " + declaringClass2.getName() + "; failed to set access: " + e.getMessage());
            }
        } catch (RuntimeException e2) {
            if ("InaccessibleObjectException".equals(e2.getClass().getSimpleName())) {
                throw new IllegalArgumentException(String.format("Failed to call `setAccess()` on %s '%s' (of class %s) due to `%s`, problem: %s", new Object[]{member.getClass().getSimpleName(), member.getName(), m29497X(member.getDeclaringClass()), e2.getClass().getName(), e2.getMessage()}), e2);
            }
            throw e2;
        }
    }

    /* renamed from: g0 */
    public static <T> T m29513g0(DeserializationContext deserializationContext, IOException iOException) throws JsonMappingException {
        if (iOException instanceof JsonMappingException) {
            throw ((JsonMappingException) iOException);
        }
        throw JsonMappingException.from(deserializationContext, iOException.getMessage()).withCause(iOException);
    }

    /* renamed from: h */
    public static String m29514h(Object obj) {
        Class<?> cls;
        if (obj == null) {
            return "[null]";
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        return m29497X(cls);
    }

    /* renamed from: h0 */
    public static Throwable m29515h0(Throwable th) {
        if (!(th instanceof Error)) {
            return th;
        }
        throw ((Error) th);
    }

    /* renamed from: i */
    public static Class<?> m29516i(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass();
    }

    /* renamed from: i0 */
    public static Throwable m29517i0(Throwable th) throws IOException {
        if (!(th instanceof IOException)) {
            return th;
        }
        throw ((IOException) th);
    }

    /* renamed from: j */
    public static void m29518j(JsonGenerator jsonGenerator, Closeable closeable, Exception exc) throws IOException {
        if (jsonGenerator != null) {
            jsonGenerator.mo13881i(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
            try {
                jsonGenerator.close();
            } catch (Exception e) {
                exc.addSuppressed(e);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                exc.addSuppressed(e2);
            }
        }
        m29517i0(exc);
        m29519j0(exc);
        throw new RuntimeException(exc);
    }

    /* renamed from: j0 */
    public static Throwable m29519j0(Throwable th) {
        if (!(th instanceof RuntimeException)) {
            return th;
        }
        throw ((RuntimeException) th);
    }

    /* renamed from: k */
    public static void m29520k(JsonGenerator jsonGenerator, Exception exc) throws IOException {
        jsonGenerator.mo13881i(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        try {
            jsonGenerator.close();
        } catch (Exception e) {
            exc.addSuppressed(e);
        }
        m29517i0(exc);
        m29519j0(exc);
        throw new RuntimeException(exc);
    }

    /* renamed from: k0 */
    public static Throwable m29521k0(Throwable th) throws IOException {
        return m29517i0(m29479F(th));
    }

    /* renamed from: l */
    public static <T> T m29522l(Class<T> cls, boolean z) throws IllegalArgumentException {
        Constructor<T> q = m29531q(cls, z);
        if (q != null) {
            try {
                return q.newInstance(new Object[0]);
            } catch (Exception e) {
                m29525m0(e, "Failed to instantiate class " + cls.getName() + ", problem: " + e.getMessage());
                return null;
            }
        } else {
            throw new IllegalArgumentException("Class " + cls.getName() + " has no default (no arg) constructor");
        }
    }

    /* renamed from: l0 */
    public static void m29523l0(Throwable th) {
        m29509e0(m29479F(th));
    }

    /* renamed from: m */
    public static Object m29524m(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(Utils.DOUBLE_EPSILON);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(Utils.FLOAT_EPSILON);
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Character.TYPE) {
            return 0;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    /* renamed from: m0 */
    public static void m29525m0(Throwable th, String str) {
        m29511f0(m29479F(th), str);
    }

    /* renamed from: n */
    public static <T> Iterator<T> m29526n() {
        return f19081d;
    }

    /* renamed from: n0 */
    public static void m29527n0(Class<?> cls, Object obj, String str) {
        if (obj.getClass() != cls) {
            throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", new Object[]{obj.getClass().getName(), cls.getName(), str}));
        }
    }

    /* renamed from: o */
    public static String m29528o(Throwable th) {
        if (th instanceof JacksonException) {
            return ((JacksonException) th).getOriginalMessage();
        }
        if (!(th instanceof InvocationTargetException) || th.getCause() == null) {
            return th.getMessage();
        }
        return th.getCause().getMessage();
    }

    /* renamed from: o0 */
    public static Class<?> m29529o0(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    /* renamed from: p */
    public static Annotation[] m29530p(Class<?> cls) {
        if (m29491R(cls)) {
            return f19079b;
        }
        return cls.getDeclaredAnnotations();
    }

    /* renamed from: q */
    public static <T> Constructor<T> m29531q(Class<T> cls, boolean z) throws IllegalArgumentException {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (z) {
                m29512g(declaredConstructor, z);
            } else if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
            }
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e) {
            m29525m0(e, "Failed to find default constructor of class " + cls.getName() + ", problem: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: r */
    public static Class<? extends Enum<?>> m29532r(Class<?> cls) {
        if (cls.getSuperclass() != Enum.class) {
            return cls.getSuperclass();
        }
        return cls;
    }

    /* renamed from: s */
    public static Class<? extends Enum<?>> m29533s(Enum<?> enumR) {
        return enumR.getDeclaringClass();
    }

    /* renamed from: t */
    public static Class<? extends Enum<?>> m29534t(EnumMap<?, ?> enumMap) {
        if (!enumMap.isEmpty()) {
            return m29533s((Enum) enumMap.keySet().iterator().next());
        }
        return C3535b.f19086e.mo27505a(enumMap);
    }

    /* renamed from: u */
    public static Class<? extends Enum<?>> m29535u(EnumSet<?> enumSet) {
        if (!enumSet.isEmpty()) {
            return m29533s((Enum) enumSet.iterator().next());
        }
        return C3535b.f19086e.mo27506b(enumSet);
    }

    /* renamed from: v */
    public static <T extends Annotation> Enum<?> m29536v(Class<Enum<?>> cls, Class<T> cls2) {
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && field.getAnnotation(cls2) != null) {
                String name = field.getName();
                for (Enum<?> enumR : (Enum[]) cls.getEnumConstants()) {
                    if (name.equals(enumR.name())) {
                        return enumR;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: w */
    public static List<Class<?>> m29537w(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls == null || cls == cls2 || cls == Object.class) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(8);
        m29500a(cls, cls2, arrayList, z);
        return arrayList;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class, for r2v0, types: [java.lang.Class<?>, java.lang.Object] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.Class<?>> m29538x(java.lang.Class r2, java.lang.Class<?> r3, boolean r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 8
            r0.<init>(r1)
            if (r2 == 0) goto L_0x001d
            if (r2 == r3) goto L_0x001d
            if (r4 == 0) goto L_0x0010
            r0.add(r2)
        L_0x0010:
            java.lang.Class r2 = r2.getSuperclass()
            if (r2 == 0) goto L_0x001d
            if (r2 != r3) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            r0.add(r2)
            goto L_0x0010
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wf0.m29538x(java.lang.Class, java.lang.Class, boolean):java.util.List");
    }

    /* renamed from: y */
    public static String m29539y(Object obj) {
        Class<?> cls;
        if (obj == null) {
            return "unknown";
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        return m29497X(cls);
    }

    /* renamed from: z */
    public static Method[] m29540z(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                return m29502b(cls, e);
            }
            try {
                return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
            } catch (ClassNotFoundException e2) {
                e.addSuppressed(e2);
                return m29502b(cls, e);
            }
        } catch (Throwable th) {
            return m29502b(cls, th);
        }
    }
}
