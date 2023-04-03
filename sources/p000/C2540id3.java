package p000;

import java.io.PrintStream;
import java.util.Date;
import java.util.Random;

/* renamed from: id3 */
/* compiled from: LIB */
public class C2540id3 {
    /* renamed from: a */
    public static byte[] m19559a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    /* renamed from: b */
    public static String m19560b(int i) {
        if (i < 1) {
            return new String();
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        byte[] c = m19561c(i);
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append((char) c[i2]);
        }
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public static byte[] m19561c(int i) {
        int i2;
        byte[] bArr = new byte[i];
        Random e = m19563e();
        int i3 = 0;
        while (i3 < i) {
            int nextLong = (int) e.nextLong();
            if (nextLong < 0) {
                nextLong *= -1;
            }
            if (i3 == 0) {
                i2 = (nextLong % 94) + 32;
            } else {
                i2 = nextLong % 255;
            }
            if (i2 > 0) {
                bArr[i3] = (byte) i2;
                i3++;
            }
        }
        return bArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m19562d(byte[] r5) {
        /*
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            int r1 = r5.length
            char[] r1 = new char[r1]
            r2 = 0
        L_0x0009:
            int r3 = r5.length
            if (r2 < r3) goto L_0x000d
            return r0
        L_0x000d:
            byte r3 = r5[r2]
            if (r3 >= 0) goto L_0x0013
            int r3 = r3 + 256
        L_0x0013:
            char r3 = (char) r3
            r1[r2] = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.<init>(r0)
            java.lang.String r0 = " "
            r3.append(r0)
            char r0 = r1[r2]
            r4 = 16
            if (r0 >= r4) goto L_0x002d
            java.lang.String r0 = "0"
            goto L_0x002f
        L_0x002d:
            java.lang.String r0 = ""
        L_0x002f:
            r3.append(r0)
            char r0 = r1[r2]
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r0 = r0.toUpperCase()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            int r2 = r2 + 1
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2540id3.m19562d(byte[]):java.lang.String");
    }

    /* renamed from: e */
    public static Random m19563e() {
        return new Random(new Date().getTime());
    }

    /* renamed from: f */
    public static String m19564f(byte[] bArr) {
        if (bArr == null) {
            return new String();
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append((char) b);
        }
        return stringBuffer.toString();
    }

    /* renamed from: g */
    public static String m19565g(String str) {
        int i;
        int i2;
        if (str == null) {
            return new String();
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = (char) ((str.charAt(i3) >>> 4) & 15);
            char charAt2 = (char) (str.charAt(i3) & 15);
            if (charAt > 9) {
                i = (charAt - 10) + 97;
            } else {
                i = charAt + '0';
            }
            char c = (char) i;
            if (charAt2 > 9) {
                i2 = (charAt2 - 10) + 97;
            } else {
                i2 = charAt2 + '0';
            }
            stringBuffer.append(c);
            stringBuffer.append((char) i2);
        }
        return stringBuffer.toString();
    }

    /* renamed from: h */
    public static byte[] m19566h(byte[] bArr, String str) {
        if (!(bArr == null || str == null || str.compareTo("") == 0)) {
            byte[] bArr2 = new byte[40];
            new fx7();
            byte[] c = fx7.m17479c(bArr);
            byte[] a = fx7.m17477a(str);
            System.arraycopy(c, 0, bArr2, 0, 20);
            System.arraycopy(a, 0, bArr2, 20, 20);
            new dx7();
            byte[] bArr3 = new byte[20];
            String d = m19562d(bArr2);
            PrintStream printStream = System.out;
            printStream.println("LIB 496 seed=" + d);
            if (dx7.m15519h(bArr2) && dx7.m15518g(bArr3)) {
                String d2 = m19562d(bArr3);
                PrintStream printStream2 = System.out;
                printStream2.println("LIB 503 seed=" + d2);
                return bArr3;
            }
        }
        return null;
    }

    /* renamed from: i */
    public static int m19567i(short s, short s2, short s3, short s4) {
        return (s & 255) | ((s2 & 255) << 8) | ((s3 & 255) << 16) | ((s4 & 255) << 24);
    }

    /* renamed from: j */
    public static String m19568j(char c) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append((char) ((byte) (c & 255)));
        stringBuffer.append((char) ((byte) ((c >> 8) & 255)));
        return stringBuffer.toString();
    }

    /* renamed from: k */
    public static void m19569k(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    /* renamed from: l */
    public static int m19570l(int i, int i2) {
        return (i2 >> (i * 8)) & 255;
    }

    /* renamed from: m */
    public static int m19571m(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | (bArr[i + 3] & 255) | ((bArr[i + 2] & 255) << 8) | ((bArr[i + 1] & 255) << 16);
    }

    /* renamed from: n */
    public static void m19572n(int i, byte[] bArr, int i2) {
        int i3 = i >> 8;
        int i4 = i3 >> 8;
        bArr[i2] = (byte) ((i4 >> 8) & 255);
        bArr[i2 + 1] = (byte) (i4 & 255);
        bArr[i2 + 2] = (byte) (i3 & 255);
        bArr[i2 + 3] = (byte) (i & 255);
    }

    /* renamed from: o */
    public static int m19573o(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: p */
    public static int m19574p(char[] cArr, int i) {
        return ((cArr[i + 3] & 255) << 24) | (cArr[i] & 255) | ((cArr[i + 1] & 255) << 8) | ((cArr[i + 2] & 255) << 16);
    }

    /* renamed from: q */
    public static int m19575q(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (i == 1) {
            i3 = (i2 >> 24) & 255;
        } else {
            if (i == 2) {
                i5 = i2 >> 16;
                i4 = 65535;
            } else {
                i5 = i2 >> 8;
                i4 = 16777215;
            }
            i3 = i5 & i4;
        }
        return (i2 << (i * 8)) | i3;
    }
}
