package p000;

import java.util.Locale;

/* renamed from: gu4 */
/* compiled from: Preconditions */
public final class gu4 {
    /* renamed from: a */
    public static void m18423a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static int m18424b(int i, int i2, int i3, String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        } else if (i <= i3) {
            return i;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }

    /* renamed from: c */
    public static int m18425c(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public static int m18426d(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: e */
    public static int m18427e(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(i2) + " are allowed");
    }

    /* renamed from: f */
    public static <T> T m18428f(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: g */
    public static <T> T m18429g(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: h */
    public static void m18430h(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
