package kotlin.reflect.jvm.internal.calls;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001a$\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001aK\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016²\u0006\u0016\u0010\u0014\u001a\u00020\u0004\"\b\b\u0000\u0010\u000b*\u00020\u00008\nX\u0002²\u0006\u0016\u0010\u0015\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\u00008\nX\u0002"}, mo44877d2 = {"", "Ljava/lang/Class;", "expectedType", "l", "", "index", "", "name", "expectedJvmType", "", "k", "T", "annotationClass", "", "values", "", "Ljava/lang/reflect/Method;", "methods", "f", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "hashCode", "toString", "kotlin-reflection"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* compiled from: AnnotationConstructorCaller.kt */
public final class AnnotationConstructorCallerKt {

    @Metadata(mo44876d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00012\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062,\u0010\u0007\u001a(\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\b0\bH\n¢\u0006\u0004\b\t\u0010\n"}, mo44877d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "T", "<anonymous parameter 0>", "method", "Ljava/lang/reflect/Method;", "args", "", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$a */
    /* compiled from: AnnotationConstructorCaller.kt */
    public static final class C7380a implements InvocationHandler {

        /* renamed from: a */
        public final /* synthetic */ Class<T> f39055a;

        /* renamed from: b */
        public final /* synthetic */ Map<String, Object> f39056b;

        /* renamed from: c */
        public final /* synthetic */ ef3<String> f39057c;

        /* renamed from: d */
        public final /* synthetic */ ef3<Integer> f39058d;

        /* renamed from: e */
        public final /* synthetic */ List<Method> f39059e;

        public C7380a(Class<T> cls, Map<String, ? extends Object> map, ef3<String> ef3, ef3<Integer> ef32, List<Method> list) {
            this.f39055a = cls;
            this.f39056b = map;
            this.f39057c = ef3;
            this.f39058d = ef32;
            this.f39059e = list;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != -1776922004) {
                    if (hashCode != 147696667) {
                        if (hashCode == 1444986633 && name.equals("annotationType")) {
                            return this.f39055a;
                        }
                    } else if (name.equals("hashCode")) {
                        return Integer.valueOf(AnnotationConstructorCallerKt.m60096i(this.f39058d));
                    }
                } else if (name.equals("toString")) {
                    return AnnotationConstructorCallerKt.m60097j(this.f39057c);
                }
            }
            if (vx2.m53586b(name, "equals")) {
                boolean z = true;
                if (objArr == null || objArr.length != 1) {
                    z = false;
                }
                if (z) {
                    Class<T> cls = this.f39055a;
                    List<Method> list = this.f39059e;
                    Map<String, Object> map = this.f39056b;
                    vx2.m53590f(objArr, "args");
                    return Boolean.valueOf(AnnotationConstructorCallerKt.m60095h(cls, list, map, ArraysKt___ArraysKt.m47278d0(objArr)));
                }
            }
            if (this.f39056b.containsKey(name)) {
                return this.f39056b.get(name);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(ArraysKt___ArraysKt.m47291q0(objArr));
            sb.append(')');
            throw new KotlinReflectionInternalError(sb.toString());
        }
    }

    /* renamed from: f */
    public static final <T> T m60093f(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        vx2.m53591g(cls, "annotationClass");
        vx2.m53591g(map, "values");
        vx2.m53591g(list, "methods");
        ef3 a = C6169a.m47232a(new C7381xa743ec88(map));
        ef3 a2 = C6169a.m47232a(new C7382x4fc4299(cls, map));
        T newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C7380a(cls, map, a2, a, list));
        vx2.m53589e(newProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return newProxyInstance;
    }

    /* renamed from: g */
    public static /* synthetic */ Object m60094g(Class cls, Map map, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            Set<String> keySet = map.keySet();
            ArrayList arrayList = new ArrayList(dk0.m43495u(keySet, 10));
            for (String declaredMethod : keySet) {
                arrayList.add(cls.getDeclaredMethod(declaredMethod, new Class[0]));
            }
            list = arrayList;
        }
        return m60093f(cls, map, list);
    }

    /* renamed from: h */
    public static final <T> boolean m60095h(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) {
        Annotation annotation;
        boolean z;
        boolean z2;
        q83 a;
        Class cls2 = null;
        if (obj instanceof Annotation) {
            annotation = (Annotation) obj;
        } else {
            annotation = null;
        }
        if (!(annotation == null || (a = x73.m54252a(annotation)) == null)) {
            cls2 = x73.m54253b(a);
        }
        if (vx2.m53586b(cls2, cls)) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Method method = (Method) it.next();
                    Object obj2 = map.get(method.getName());
                    Object invoke = method.invoke(obj, new Object[0]);
                    if (obj2 instanceof boolean[]) {
                        vx2.m53589e(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        z2 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                        continue;
                    } else if (obj2 instanceof char[]) {
                        vx2.m53589e(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                        z2 = Arrays.equals((char[]) obj2, (char[]) invoke);
                        continue;
                    } else if (obj2 instanceof byte[]) {
                        vx2.m53589e(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        z2 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                        continue;
                    } else if (obj2 instanceof short[]) {
                        vx2.m53589e(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        z2 = Arrays.equals((short[]) obj2, (short[]) invoke);
                        continue;
                    } else if (obj2 instanceof int[]) {
                        vx2.m53589e(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                        z2 = Arrays.equals((int[]) obj2, (int[]) invoke);
                        continue;
                    } else if (obj2 instanceof float[]) {
                        vx2.m53589e(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        z2 = Arrays.equals((float[]) obj2, (float[]) invoke);
                        continue;
                    } else if (obj2 instanceof long[]) {
                        vx2.m53589e(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                        z2 = Arrays.equals((long[]) obj2, (long[]) invoke);
                        continue;
                    } else if (obj2 instanceof double[]) {
                        vx2.m53589e(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        z2 = Arrays.equals((double[]) obj2, (double[]) invoke);
                        continue;
                    } else if (obj2 instanceof Object[]) {
                        vx2.m53589e(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        z2 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                        continue;
                    } else {
                        z2 = vx2.m53586b(obj2, invoke);
                        continue;
                    }
                    if (!z2) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static final int m60096i(ef3<Integer> ef3) {
        return ef3.getValue().intValue();
    }

    /* renamed from: j */
    public static final String m60097j(ef3<String> ef3) {
        return ef3.getValue();
    }

    /* renamed from: k */
    public static final Void m60098k(int i, String str, Class<?> cls) {
        q83<?> q83;
        String str2;
        if (vx2.m53586b(cls, Class.class)) {
            q83 = ua5.m52727b(q83.class);
        } else if (!cls.isArray() || !vx2.m53586b(cls.getComponentType(), Class.class)) {
            q83 = x73.m54256e(cls);
        } else {
            q83 = ua5.m52727b(q83[].class);
        }
        if (vx2.m53586b(q83.mo47002l(), ua5.m52727b(Object[].class).mo47002l())) {
            StringBuilder sb = new StringBuilder();
            sb.append(q83.mo47002l());
            sb.append('<');
            Class<?> componentType = x73.m54253b(q83).getComponentType();
            vx2.m53590f(componentType, "kotlinClass.java.componentType");
            sb.append(x73.m54256e(componentType).mo47002l());
            sb.append('>');
            str2 = sb.toString();
        } else {
            str2 = q83.mo47002l();
        }
        throw new IllegalArgumentException("Argument #" + i + ' ' + str + " is not of the required type " + str2);
    }

    /* renamed from: l */
    public static final Object m60099l(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof q83) {
            obj = x73.m54253b((q83) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof q83[]) {
                vx2.m53589e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                q83[] q83Arr = (q83[]) obj;
                ArrayList arrayList = new ArrayList(q83Arr.length);
                for (q83 b : q83Arr) {
                    arrayList.add(x73.m54253b(b));
                }
                obj = arrayList.toArray(new Class[0]);
                vx2.m53589e(obj, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
