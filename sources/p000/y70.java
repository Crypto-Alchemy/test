package p000;

import java.util.concurrent.CopyOnWriteArrayList;
import sun.misc.Unsafe;

/* renamed from: y70 */
/* compiled from: COWArrayListSpliterator */
public final class y70 {

    /* renamed from: a */
    public static final Unsafe f35783a = o47.f32276a;

    /* renamed from: b */
    public static final long f35784b;

    static {
        String str;
        if (b76.f21141h) {
            str = "elements";
        } else {
            str = "array";
        }
        f35784b = m54646a(str, true);
    }

    /* renamed from: a */
    public static long m54646a(String str, boolean z) {
        try {
            return f35783a.objectFieldOffset(CopyOnWriteArrayList.class.getDeclaredField(str));
        } catch (Exception e) {
            if (z && (e instanceof NoSuchFieldException) && b76.f21141h && !b76.f21142i) {
                return m54646a("array", false);
            }
            throw new Error(e);
        }
    }

    /* renamed from: b */
    public static <T> Object[] m54647b(CopyOnWriteArrayList<T> copyOnWriteArrayList) {
        return (Object[]) f35783a.getObject(copyOnWriteArrayList, f35784b);
    }

    /* renamed from: c */
    public static <T> z66<T> m54648c(CopyOnWriteArrayList<T> copyOnWriteArrayList) {
        return b76.m32392x(m54647b(copyOnWriteArrayList), 1040);
    }
}
