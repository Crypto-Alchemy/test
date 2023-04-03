package p000;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: ob6 */
public final class ob6 {

    /* renamed from: a */
    public static String f43621a;

    /* renamed from: ob6$a */
    public static class C9022a implements PrivilegedAction<String> {
        /* renamed from: a */
        public String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            f43621a = (String) AccessController.doPrivileged(new C9022a());
        } catch (Exception unused) {
            try {
                f43621a = String.format("%n", new Object[0]);
            } catch (Exception unused2) {
                f43621a = "\n";
            }
        }
    }

    /* renamed from: a */
    public static char[] m70222a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    /* renamed from: b */
    public static String m70223b(byte[] bArr) {
        return new String(m70222a(bArr));
    }

    /* renamed from: c */
    public static String m70224c(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int b = c37.m56298b(bArr, cArr);
        if (b >= 0) {
            return new String(cArr, 0, b);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    /* renamed from: d */
    public static String m70225d() {
        return f43621a;
    }

    /* renamed from: e */
    public static byte[] m70226e(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    /* renamed from: f */
    public static String m70227f(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) ((c - 'A') + 97);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    /* renamed from: g */
    public static String m70228g(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) ((c - 'a') + 65);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }
}
