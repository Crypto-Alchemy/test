package p000;

import java.util.List;
import sun.misc.Unsafe;

/* renamed from: uq */
/* compiled from: ArraysArrayListSpliterator */
public final class C6574uq {

    /* renamed from: a */
    public static final Unsafe f34679a;

    /* renamed from: b */
    public static final long f34680b;

    static {
        Unsafe unsafe = o47.f32276a;
        f34679a = unsafe;
        try {
            f34680b = unsafe.objectFieldOffset(Class.forName("java.util.Arrays$ArrayList").getDeclaredField("a"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* renamed from: a */
    public static <T> Object[] m52961a(List<T> list) {
        return (Object[]) f34679a.getObject(list, f34680b);
    }

    /* renamed from: b */
    public static <T> z66<T> m52962b(List<T> list) {
        return b76.m32392x(m52961a(list), 16);
    }
}
