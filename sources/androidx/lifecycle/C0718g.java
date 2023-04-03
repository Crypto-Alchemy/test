package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.g */
/* compiled from: Lifecycling */
public class C0718g {

    /* renamed from: a */
    public static Map<Class<?>, Integer> f3964a = new HashMap();

    /* renamed from: b */
    public static Map<Class<?>, List<Constructor<? extends C0713c>>> f3965b = new HashMap();

    /* renamed from: a */
    public static C0713c m5116a(Constructor<? extends C0713c> constructor, Object obj) {
        try {
            return (C0713c) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    public static Constructor<? extends C0713c> m5117b(Class<?> cls) {
        String str;
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (packageR != null) {
                str = packageR.getName();
            } else {
                str = "";
            }
            if (!str.isEmpty()) {
                canonicalName = canonicalName.substring(str.length() + 1);
            }
            String c = m5118c(canonicalName);
            if (!str.isEmpty()) {
                c = str + "." + c;
            }
            Constructor<?> declaredConstructor = Class.forName(c).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m5118c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    public static int m5119d(Class<?> cls) {
        Integer num = f3964a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = m5122g(cls);
        f3964a.put(cls, Integer.valueOf(g));
        return g;
    }

    /* renamed from: e */
    public static boolean m5120e(Class<?> cls) {
        if (cls == null || !tg3.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static C0715e m5121f(Object obj) {
        boolean z = obj instanceof C0715e;
        boolean z2 = obj instanceof mc2;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((mc2) obj, (C0715e) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((mc2) obj, (C0715e) null);
        }
        if (z) {
            return (C0715e) obj;
        }
        Class<?> cls = obj.getClass();
        if (m5119d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f3965b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m5116a((Constructor) list.get(0), obj));
        }
        C0713c[] cVarArr = new C0713c[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cVarArr[i] = m5116a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    /* renamed from: g */
    public static int m5122g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C0713c> b = m5117b(cls);
        if (b != null) {
            f3965b.put(cls, Collections.singletonList(b));
            return 2;
        } else if (C0710b.f3947c.mo6378d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m5120e(superclass)) {
                if (m5119d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f3965b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m5120e(cls2)) {
                    if (m5119d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f3965b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f3965b.put(cls, arrayList);
            return 2;
        }
    }
}
