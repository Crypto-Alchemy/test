package p000;

import android.net.Uri;

/* renamed from: wz3 */
/* compiled from: MultiUriHelper */
public abstract class wz3 {
    /* renamed from: a */
    public static <T> Uri m29794a(T t, T t2, T[] tArr, g62<T, Uri> g62) {
        T t3;
        Uri apply;
        Uri apply2;
        if (t != null && (apply2 = g62.apply(t)) != null) {
            return apply2;
        }
        if (tArr != null && tArr.length > 0 && (t3 = tArr[0]) != null && (apply = g62.apply(t3)) != null) {
            return apply;
        }
        if (t2 != null) {
            return g62.apply(t2);
        }
        return null;
    }
}
