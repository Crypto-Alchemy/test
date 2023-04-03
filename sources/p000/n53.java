package p000;

/* renamed from: n53 */
/* compiled from: JsonPointer */
public class n53 {

    /* renamed from: e */
    public static final n53 f15355e = new n53();

    /* renamed from: a */
    public final n53 f15356a;

    /* renamed from: b */
    public final String f15357b;

    /* renamed from: c */
    public final String f15358c;

    /* renamed from: d */
    public final int f15359d;

    public n53() {
        this.f15356a = null;
        this.f15358c = "";
        this.f15359d = -1;
        this.f15357b = "";
    }

    /* renamed from: a */
    public static void m22801a(StringBuilder sb, char c) {
        if (c == '0') {
            c = '~';
        } else if (c == '1') {
            c = '/';
        } else {
            sb.append('~');
        }
        sb.append(c);
    }

    /* renamed from: b */
    public static final int m22802b(String str) {
        int length = str.length();
        if (length == 0 || length > 10) {
            return -1;
        }
        char charAt = str.charAt(0);
        if (charAt <= '0') {
            if (length == 1 && charAt == '0') {
                return 0;
            }
            return -1;
        } else if (charAt > '9') {
            return -1;
        } else {
            for (int i = 1; i < length; i++) {
                char charAt2 = str.charAt(i);
                if (charAt2 > '9' || charAt2 < '0') {
                    return -1;
                }
            }
            if (length != 10 || kc4.m20649l(str) <= 2147483647L) {
                return kc4.m20647j(str);
            }
            return -1;
        }
    }

    /* renamed from: c */
    public static n53 m22803c(String str, int i) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(Math.max(16, length));
        if (i > 2) {
            sb.append(str, 1, i - 1);
        }
        int i2 = i + 1;
        m22801a(sb, str.charAt(i));
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt == '/') {
                return new n53(str, sb.toString(), m22804d(str.substring(i2)));
            }
            i2++;
            if (charAt != '~' || i2 >= length) {
                sb.append(charAt);
            } else {
                m22801a(sb, str.charAt(i2));
                i2++;
            }
        }
        return new n53(str, sb.toString(), f15355e);
    }

    /* renamed from: d */
    public static n53 m22804d(String str) {
        int length = str.length();
        int i = 1;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '/') {
                return new n53(str, str.substring(1, i), m22804d(str.substring(i)));
            }
            i++;
            if (charAt == '~' && i < length) {
                return m22803c(str, i);
            }
        }
        return new n53(str, str.substring(1), f15355e);
    }

    /* renamed from: e */
    public static n53 m22805e(String str) throws IllegalArgumentException {
        if (str == null || str.length() == 0) {
            return f15355e;
        }
        if (str.charAt(0) == '/') {
            return m22804d(str);
        }
        throw new IllegalArgumentException("Invalid input: JSON Pointer expression must start with '/': \"" + str + "\"");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof n53)) {
            return this.f15357b.equals(((n53) obj).f15357b);
        }
        return false;
    }

    /* renamed from: f */
    public int mo23512f() {
        return this.f15359d;
    }

    /* renamed from: g */
    public String mo23513g() {
        return this.f15358c;
    }

    /* renamed from: h */
    public n53 mo23514h(int i) {
        if (i != this.f15359d || i < 0) {
            return null;
        }
        return this.f15356a;
    }

    public int hashCode() {
        return this.f15357b.hashCode();
    }

    /* renamed from: i */
    public n53 mo23516i(String str) {
        if (this.f15356a == null || !this.f15358c.equals(str)) {
            return null;
        }
        return this.f15356a;
    }

    /* renamed from: j */
    public boolean mo23517j() {
        if (this.f15356a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public n53 mo23518k() {
        return this.f15356a;
    }

    public String toString() {
        return this.f15357b;
    }

    public n53(String str, String str2, n53 n53) {
        this.f15357b = str;
        this.f15356a = n53;
        this.f15358c = str2;
        this.f15359d = m22802b(str2);
    }
}
