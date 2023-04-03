package p000;

import java.util.Set;

/* renamed from: eh8 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class eh8 {
    /* renamed from: a */
    public static int m43974a(Set set) {
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
