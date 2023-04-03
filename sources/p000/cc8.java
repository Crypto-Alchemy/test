package p000;

import java.util.Objects;

/* renamed from: cc8 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class cc8 {
    /* renamed from: a */
    public static int m32946a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* renamed from: b */
    public static void m32947b(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }
}
