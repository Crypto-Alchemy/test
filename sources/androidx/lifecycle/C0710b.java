package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.b */
/* compiled from: ClassesInfoCache */
public final class C0710b {

    /* renamed from: c */
    public static C0710b f3947c = new C0710b();

    /* renamed from: a */
    public final Map<Class<?>, C0711a> f3948a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, Boolean> f3949b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.b$a */
    /* compiled from: ClassesInfoCache */
    public static class C0711a {

        /* renamed from: a */
        public final Map<Lifecycle.Event, List<C0712b>> f3950a = new HashMap();

        /* renamed from: b */
        public final Map<C0712b, Lifecycle.Event> f3951b;

        public C0711a(Map<C0712b, Lifecycle.Event> map) {
            this.f3951b = map;
            for (Map.Entry next : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) next.getValue();
                List list = this.f3950a.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.f3950a.put(event, list);
                }
                list.add((C0712b) next.getKey());
            }
        }

        /* renamed from: b */
        public static void m5094b(List<C0712b> list, ug3 ug3, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).mo6381a(ug3, event, obj);
                }
            }
        }

        /* renamed from: a */
        public void mo6380a(ug3 ug3, Lifecycle.Event event, Object obj) {
            m5094b(this.f3950a.get(event), ug3, event, obj);
            m5094b(this.f3950a.get(Lifecycle.Event.ON_ANY), ug3, event, obj);
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.b$b */
    /* compiled from: ClassesInfoCache */
    public static final class C0712b {

        /* renamed from: a */
        public final int f3952a;

        /* renamed from: b */
        public final Method f3953b;

        public C0712b(int i, Method method) {
            this.f3952a = i;
            this.f3953b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        public void mo6381a(ug3 ug3, Lifecycle.Event event, Object obj) {
            try {
                int i = this.f3952a;
                if (i == 0) {
                    this.f3953b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f3953b.invoke(obj, new Object[]{ug3});
                } else if (i == 2) {
                    this.f3953b.invoke(obj, new Object[]{ug3, event});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0712b)) {
                return false;
            }
            C0712b bVar = (C0712b) obj;
            if (this.f3952a != bVar.f3952a || !this.f3953b.getName().equals(bVar.f3953b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f3952a * 31) + this.f3953b.getName().hashCode();
        }
    }

    /* renamed from: a */
    public final C0711a mo6375a(Class<?> cls, Method[] methodArr) {
        int i;
        C0711a c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c = mo6377c(superclass)) == null)) {
            hashMap.putAll(c.f3951b);
        }
        for (Class c2 : cls.getInterfaces()) {
            for (Map.Entry next : mo6377c(c2).f3951b.entrySet()) {
                mo6379e(hashMap, (C0712b) next.getKey(), (Lifecycle.Event) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = mo6376b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0719h hVar = (C0719h) method.getAnnotation(C0719h.class);
            if (hVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(ug3.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Lifecycle.Event value = hVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Lifecycle.Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == Lifecycle.Event.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    mo6379e(hashMap, new C0712b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0711a aVar = new C0711a(hashMap);
        this.f3948a.put(cls, aVar);
        this.f3949b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    public final Method[] mo6376b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: c */
    public C0711a mo6377c(Class<?> cls) {
        C0711a aVar = this.f3948a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return mo6375a(cls, (Method[]) null);
    }

    /* renamed from: d */
    public boolean mo6378d(Class<?> cls) {
        Boolean bool = this.f3949b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b = mo6376b(cls);
        for (Method annotation : b) {
            if (((C0719h) annotation.getAnnotation(C0719h.class)) != null) {
                mo6375a(cls, b);
                return true;
            }
        }
        this.f3949b.put(cls, Boolean.FALSE);
        return false;
    }

    /* renamed from: e */
    public final void mo6379e(Map<C0712b, Lifecycle.Event> map, C0712b bVar, Lifecycle.Event event, Class<?> cls) {
        Lifecycle.Event event2 = map.get(bVar);
        if (event2 != null && event != event2) {
            Method method = bVar.f3953b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
        } else if (event2 == null) {
            map.put(bVar, event);
        }
    }
}
