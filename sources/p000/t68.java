package p000;

import java.util.Objects;

/* renamed from: t68 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class t68 {
    /* renamed from: a */
    public static void m52122a(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }
}
