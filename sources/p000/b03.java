package p000;

import java.lang.reflect.Method;

/* renamed from: b03 */
/* compiled from: ReflectJavaClass.kt */
public final class b03 {

    /* renamed from: a */
    public static final b03 f36620a = new b03();

    /* renamed from: b */
    public static C6839a f36621b;

    /* renamed from: b03$a */
    /* compiled from: ReflectJavaClass.kt */
    public static final class C6839a {

        /* renamed from: a */
        public final Method f36622a;

        /* renamed from: b */
        public final Method f36623b;

        /* renamed from: c */
        public final Method f36624c;

        /* renamed from: d */
        public final Method f36625d;

        public C6839a(Method method, Method method2, Method method3, Method method4) {
            this.f36622a = method;
            this.f36623b = method2;
            this.f36624c = method3;
            this.f36625d = method4;
        }

        /* renamed from: a */
        public final Method mo50436a() {
            return this.f36623b;
        }

        /* renamed from: b */
        public final Method mo50437b() {
            return this.f36625d;
        }

        /* renamed from: c */
        public final Method mo50438c() {
            return this.f36624c;
        }

        /* renamed from: d */
        public final Method mo50439d() {
            return this.f36622a;
        }
    }

    /* renamed from: a */
    public final C6839a mo50430a() {
        Class<Class> cls = Class.class;
        try {
            return new C6839a(cls.getMethod("isSealed", new Class[0]), cls.getMethod("getPermittedSubclasses", new Class[0]), cls.getMethod("isRecord", new Class[0]), cls.getMethod("getRecordComponents", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C6839a((Method) null, (Method) null, (Method) null, (Method) null);
        }
    }

    /* renamed from: b */
    public final C6839a mo50431b() {
        C6839a aVar = f36621b;
        if (aVar != null) {
            return aVar;
        }
        C6839a a = mo50430a();
        f36621b = a;
        return a;
    }

    /* renamed from: c */
    public final Class<?>[] mo50432c(Class<?> cls) {
        vx2.m53591g(cls, "clazz");
        Method a = mo50431b().mo50436a();
        if (a == null) {
            return null;
        }
        Object invoke = a.invoke(cls, new Object[0]);
        vx2.m53589e(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) invoke;
    }

    /* renamed from: d */
    public final Object[] mo50433d(Class<?> cls) {
        vx2.m53591g(cls, "clazz");
        Method b = mo50431b().mo50437b();
        if (b == null) {
            return null;
        }
        return (Object[]) b.invoke(cls, new Object[0]);
    }

    /* renamed from: e */
    public final Boolean mo50434e(Class<?> cls) {
        vx2.m53591g(cls, "clazz");
        Method c = mo50431b().mo50438c();
        if (c == null) {
            return null;
        }
        Object invoke = c.invoke(cls, new Object[0]);
        vx2.m53589e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }

    /* renamed from: f */
    public final Boolean mo50435f(Class<?> cls) {
        vx2.m53591g(cls, "clazz");
        Method d = mo50431b().mo50439d();
        if (d == null) {
            return null;
        }
        Object invoke = d.invoke(cls, new Object[0]);
        vx2.m53589e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }
}
