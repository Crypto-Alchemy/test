package p000;

import java.util.Arrays;

/* renamed from: jf4 */
/* compiled from: Objects */
public final class jf4 extends fy1 {
    /* renamed from: a */
    public static boolean m46496a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m46497b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
