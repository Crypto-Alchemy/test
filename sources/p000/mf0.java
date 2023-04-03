package p000;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: mf0 */
/* compiled from: ClassFactory */
public abstract class mf0<T> {

    /* renamed from: mf0$a */
    /* compiled from: ClassFactory */
    public class C6245a extends mf0<T> {

        /* renamed from: a */
        public final /* synthetic */ Constructor f31676a;

        /* renamed from: b */
        public final /* synthetic */ Class f31677b;

        public C6245a(Constructor constructor, Class cls) {
            this.f31676a = constructor;
            this.f31677b = cls;
        }

        /* renamed from: b */
        public T mo45778b() throws IllegalAccessException, InvocationTargetException, InstantiationException {
            return this.f31676a.newInstance((Object[]) null);
        }

        public String toString() {
            return this.f31677b.getName();
        }
    }

    /* renamed from: mf0$b */
    /* compiled from: ClassFactory */
    public class C6246b extends mf0<T> {

        /* renamed from: a */
        public final /* synthetic */ Method f31678a;

        /* renamed from: b */
        public final /* synthetic */ Object f31679b;

        /* renamed from: c */
        public final /* synthetic */ Class f31680c;

        public C6246b(Method method, Object obj, Class cls) {
            this.f31678a = method;
            this.f31679b = obj;
            this.f31680c = cls;
        }

        /* renamed from: b */
        public T mo45778b() throws InvocationTargetException, IllegalAccessException {
            return this.f31678a.invoke(this.f31679b, new Object[]{this.f31680c});
        }

        public String toString() {
            return this.f31680c.getName();
        }
    }

    /* renamed from: mf0$c */
    /* compiled from: ClassFactory */
    public class C6247c extends mf0<T> {

        /* renamed from: a */
        public final /* synthetic */ Method f31681a;

        /* renamed from: b */
        public final /* synthetic */ Class f31682b;

        /* renamed from: c */
        public final /* synthetic */ int f31683c;

        public C6247c(Method method, Class cls, int i) {
            this.f31681a = method;
            this.f31682b = cls;
            this.f31683c = i;
        }

        /* renamed from: b */
        public T mo45778b() throws InvocationTargetException, IllegalAccessException {
            return this.f31681a.invoke((Object) null, new Object[]{this.f31682b, Integer.valueOf(this.f31683c)});
        }

        public String toString() {
            return this.f31682b.getName();
        }
    }

    /* renamed from: mf0$d */
    /* compiled from: ClassFactory */
    public class C6248d extends mf0<T> {

        /* renamed from: a */
        public final /* synthetic */ Method f31684a;

        /* renamed from: b */
        public final /* synthetic */ Class f31685b;

        public C6248d(Method method, Class cls) {
            this.f31684a = method;
            this.f31685b = cls;
        }

        /* renamed from: b */
        public T mo45778b() throws InvocationTargetException, IllegalAccessException {
            return this.f31684a.invoke((Object) null, new Object[]{this.f31685b, Object.class});
        }

        public String toString() {
            return this.f31685b.getName();
        }
    }

    /* renamed from: a */
    public static <T> mf0<T> m48270a(Class<?> cls) {
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return new C6245a(declaredConstructor, cls);
        } catch (NoSuchMethodException unused) {
            try {
                Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls2.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return new C6246b(cls2.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null), cls);
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                    declaredMethod2.setAccessible(true);
                    return new C6247c(declaredMethod2, cls, intValue);
                } catch (IllegalAccessException unused4) {
                    throw new AssertionError();
                } catch (InvocationTargetException e) {
                    throw t67.m52118s(e);
                } catch (NoSuchMethodException unused5) {
                    try {
                        Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                        declaredMethod3.setAccessible(true);
                        return new C6248d(declaredMethod3, cls);
                    } catch (Exception unused6) {
                        throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public abstract T mo45778b() throws InvocationTargetException, IllegalAccessException, InstantiationException;
}
