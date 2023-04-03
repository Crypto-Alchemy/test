package p000;

import java.util.Set;

/* renamed from: cb8 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class cb8 {
    /* renamed from: a */
    public static int m32910a(Set set) {
        int i;
        int i2 = 0;
        for (Object next : set) {
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }
}
