package p000;

import java.lang.reflect.Method;

/* renamed from: a03 */
/* compiled from: ReflectJavaRecordComponent.kt */
public final class a03 {

    /* renamed from: a */
    public static final a03 f36333a = new a03();

    /* renamed from: b */
    public static C6786a f36334b;

    /* renamed from: a03$a */
    /* compiled from: ReflectJavaRecordComponent.kt */
    public static final class C6786a {

        /* renamed from: a */
        public final Method f36335a;

        /* renamed from: b */
        public final Method f36336b;

        public C6786a(Method method, Method method2) {
            this.f36335a = method;
            this.f36336b = method2;
        }

        /* renamed from: a */
        public final Method mo50022a() {
            return this.f36336b;
        }

        /* renamed from: b */
        public final Method mo50023b() {
            return this.f36335a;
        }
    }

    /* renamed from: a */
    public final C6786a mo50018a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C6786a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C6786a((Method) null, (Method) null);
        }
    }

    /* renamed from: b */
    public final C6786a mo50019b(Object obj) {
        C6786a aVar = f36334b;
        if (aVar != null) {
            return aVar;
        }
        C6786a a = mo50018a(obj);
        f36334b = a;
        return a;
    }

    /* renamed from: c */
    public final Method mo50020c(Object obj) {
        vx2.m53591g(obj, "recordComponent");
        Method a = mo50019b(obj).mo50022a();
        if (a == null) {
            return null;
        }
        Object invoke = a.invoke(obj, new Object[0]);
        vx2.m53589e(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) invoke;
    }

    /* renamed from: d */
    public final Class<?> mo50021d(Object obj) {
        vx2.m53591g(obj, "recordComponent");
        Method b = mo50019b(obj).mo50023b();
        if (b == null) {
            return null;
        }
        Object invoke = b.invoke(obj, new Object[0]);
        vx2.m53589e(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) invoke;
    }
}
