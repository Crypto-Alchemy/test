package androidx.fragment.app;

import androidx.fragment.app.Fragment;

/* renamed from: androidx.fragment.app.d */
/* compiled from: FragmentFactory */
public class C0674d {

    /* renamed from: a */
    public static final y16<ClassLoader, y16<String, Class<?>>> f3831a = new y16<>();

    /* renamed from: b */
    public static boolean m4890b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m4891c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static Class<?> m4891c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        y16<ClassLoader, y16<String, Class<?>>> y16 = f3831a;
        y16 y162 = y16.get(classLoader);
        if (y162 == null) {
            y162 = new y16();
            y16.put(classLoader, y162);
        }
        Class<?> cls = (Class) y162.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        y162.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m4892d(ClassLoader classLoader, String str) {
        try {
            return m4891c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo6039a(ClassLoader classLoader, String str) {
        throw null;
    }
}
