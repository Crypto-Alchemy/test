package p000;

/* renamed from: lf4 */
public class lf4 {
    /* renamed from: a */
    public static boolean m63827a(Object obj, Object obj2) {
        return obj == obj2 || !(obj == null || obj2 == null || !obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m63828b(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
