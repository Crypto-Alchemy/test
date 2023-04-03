package p000;

/* renamed from: gr */
/* compiled from: Ascii */
public final class C5876gr {
    /* renamed from: a */
    public static boolean m44837a(CharSequence charSequence, CharSequence charSequence2) {
        int b;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((b = m44838b(charAt)) >= 26 || b != m44838b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static int m44838b(char c) {
        return (char) ((c | ' ') - 'a');
    }

    /* renamed from: c */
    public static boolean m44839c(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: d */
    public static boolean m44840d(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: e */
    public static String m44841e(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m44840d(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m44840d(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: f */
    public static String m44842f(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m44839c(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m44839c(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}
