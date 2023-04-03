package p000;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* renamed from: du4 */
/* compiled from: Preconditions */
public final class du4 {
    /* renamed from: a */
    public static String m43681a(int i, int i2, String str) {
        if (i < 0) {
            return nb6.m48720a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return nb6.m48720a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public static String m43682b(int i, int i2, String str) {
        if (i < 0) {
            return nb6.m48720a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return nb6.m48720a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    public static String m43683c(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m43682b(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return m43682b(i2, i3, "end index");
        }
        return nb6.m48720a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: d */
    public static void m43684d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m43685e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m43686f(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(nb6.m48720a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: g */
    public static void m43687g(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(nb6.m48720a(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* renamed from: h */
    public static void m43688h(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(nb6.m48720a(str, Long.valueOf(j)));
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: i */
    public static int m43689i(int i, int i2) {
        return m43690j(i, i2, "index");
    }

    @CanIgnoreReturnValue
    /* renamed from: j */
    public static int m43690j(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m43681a(i, i2, str));
    }

    @CanIgnoreReturnValue
    /* renamed from: k */
    public static <T> T m43691k(T t) {
        t.getClass();
        return t;
    }

    @CanIgnoreReturnValue
    /* renamed from: l */
    public static <T> T m43692l(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @CanIgnoreReturnValue
    /* renamed from: m */
    public static int m43693m(int i, int i2) {
        return m43694n(i, i2, "index");
    }

    @CanIgnoreReturnValue
    /* renamed from: n */
    public static int m43694n(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m43682b(i, i2, str));
    }

    /* renamed from: o */
    public static void m43695o(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m43683c(i, i2, i3));
        }
    }

    /* renamed from: p */
    public static void m43696p(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: q */
    public static void m43697q(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: r */
    public static void m43698r(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(nb6.m48720a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: s */
    public static void m43699s(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(nb6.m48720a(str, obj));
        }
    }
}
