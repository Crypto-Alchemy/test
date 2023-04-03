package p000;

/* renamed from: au4 */
/* compiled from: Preconditions */
public final class au4 {
    /* renamed from: a */
    public static String m10786a(int i, int i2, String str) {
        if (i < 0) {
            return m10796k("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m10796k("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }

    /* renamed from: b */
    public static void m10787b(Boolean bool) {
        if (bool != null && !bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static void m10788c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: d */
    public static void m10789d(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(m10796k(str, objArr));
        }
    }

    /* renamed from: e */
    public static int m10790e(int i, int i2) {
        return m10791f(i, i2, "index");
    }

    /* renamed from: f */
    public static int m10791f(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m10786a(i, i2, str));
    }

    /* renamed from: g */
    public static <T> T m10792g(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: h */
    public static <T> T m10793h(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: i */
    public static void m10794i(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: j */
    public static void m10795j(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: k */
    public static String m10796k(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append(valueOf.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
