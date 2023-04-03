package p000;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: zt4 */
/* compiled from: Preconditions */
public final class zt4 {
    /* renamed from: a */
    public static void m31497a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m31498b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: c */
    public static <T extends Collection<Y>, Y> T m31499c(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: d */
    public static <T> T m31500d(T t) {
        return m31501e(t, "Argument must not be null");
    }

    /* renamed from: e */
    public static <T> T m31501e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
