package p000;

/* renamed from: oo8 */
/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
public final class oo8 {
    /* renamed from: a */
    public static int m49376a(int i, int i2, String str) {
        String str2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str2 = qs8.m50854a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            str2 = qs8.m50854a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    /* renamed from: b */
    public static int m49377b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m49379d(i, i2, "index"));
    }

    /* renamed from: c */
    public static void m49378c(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m49379d(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m49379d(i2, i3, "end index");
            } else {
                str = qs8.m50854a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: d */
    public static String m49379d(int i, int i2, String str) {
        if (i < 0) {
            return qs8.m50854a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return qs8.m50854a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }
}
