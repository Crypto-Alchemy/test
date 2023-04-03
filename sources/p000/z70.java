package p000;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import sun.misc.Unsafe;

/* renamed from: z70 */
/* compiled from: COWArraySetSpliterator */
public final class z70 {

    /* renamed from: a */
    public static final Unsafe f35996a;

    /* renamed from: b */
    public static final long f35997b;

    static {
        Unsafe unsafe = o47.f32276a;
        f35996a = unsafe;
        try {
            f35997b = unsafe.objectFieldOffset(CopyOnWriteArraySet.class.getDeclaredField("al"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* renamed from: a */
    public static <T> CopyOnWriteArrayList<T> m55007a(CopyOnWriteArraySet<T> copyOnWriteArraySet) {
        return (CopyOnWriteArrayList) f35996a.getObject(copyOnWriteArraySet, f35997b);
    }

    /* renamed from: b */
    public static <T> z66<T> m55008b(CopyOnWriteArraySet<T> copyOnWriteArraySet) {
        return b76.m32392x(y70.m54647b(m55007a(copyOnWriteArraySet)), 1025);
    }
}
