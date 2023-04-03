package p000;

import java.io.PrintStream;

/* renamed from: fx7 */
/* compiled from: uishash */
public class fx7 {

    /* renamed from: a */
    public static int f12104a;

    /* renamed from: a */
    public static byte[] m17477a(String str) {
        if (f12104a == 1) {
            PrintStream printStream = System.out;
            printStream.println("GetHashBytes 137 stringin=" + str);
        }
        return C2540id3.m19559a(m17478b(str));
    }

    /* renamed from: b */
    public static String m17478b(String str) {
        if (f12104a == 1) {
            PrintStream printStream = System.out;
            printStream.println("GetHashString 101 stringin=" + str);
        }
        if (str == null) {
            return new String();
        }
        yi5 yi5 = new yi5();
        byte[] a = C2540id3.m19559a(str);
        yi5.mo28099n();
        yi5.mo22981d(a, 0, str.length());
        yi5.mo28098m();
        if (!yi5.f20239f) {
            return new String("");
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 20; i++) {
            stringBuffer.append((char) yi5.f20238e[i]);
        }
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public static byte[] m17479c(byte[] bArr) {
        return m17480d(bArr, bArr.length);
    }

    /* renamed from: d */
    public static byte[] m17480d(byte[] bArr, int i) {
        yi5 yi5 = new yi5();
        yi5.mo28099n();
        yi5.mo22981d(bArr, 0, i);
        yi5.mo28098m();
        if (yi5.f20239f) {
            return yi5.f20238e;
        }
        return null;
    }
}
