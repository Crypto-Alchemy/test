package p000;

import java.util.Objects;

/* renamed from: mf4 */
/* compiled from: ObjectsCompat */
public class mf4 {

    /* renamed from: mf4$a */
    /* compiled from: ObjectsCompat */
    public static class C2828a {
        /* renamed from: a */
        public static boolean m22287a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        /* renamed from: b */
        public static int m22288b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m22283a(Object obj, Object obj2) {
        return C2828a.m22287a(obj, obj2);
    }

    /* renamed from: b */
    public static int m22284b(Object... objArr) {
        return C2828a.m22288b(objArr);
    }

    /* renamed from: c */
    public static <T> T m22285c(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: d */
    public static <T> T m22286d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
