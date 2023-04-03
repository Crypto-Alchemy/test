package p000;

/* renamed from: sx */
/* compiled from: Base64 */
public class C3311sx {
    /* renamed from: a */
    public static String m27171a(String str) {
        return m27178h(m27172b(m27177g(str)));
    }

    /* renamed from: b */
    public static byte[] m27172b(byte[] bArr) {
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer((length * 3) / 4);
        int i = 0;
        while (i < length) {
            int indexOf = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789[.".indexOf(bArr[i]);
            int i2 = i + 1;
            int indexOf2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789[.".indexOf(bArr[i2]);
            int i3 = (indexOf << 2) | ((indexOf2 >> 4) & 3);
            stringBuffer.append((char) i3);
            int i4 = i2 + 1;
            if (i4 < length) {
                byte b = bArr[i4];
                if (93 == b) {
                    break;
                }
                i3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789[.".indexOf((char) b);
                stringBuffer.append((char) (((indexOf2 << 4) & 240) | ((i3 >> 2) & 15)));
            }
            int i5 = i4 + 1;
            if (i5 < length) {
                byte b2 = bArr[i5];
                if (93 == b2) {
                    break;
                }
                stringBuffer.append((char) (((i3 << 6) & 192) | "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789[.".indexOf((char) b2)));
            }
            i = i5 + 1;
        }
        return m27177g(stringBuffer.toString());
    }

    /* renamed from: c */
    public static byte[] m27173c(String str) {
        return m27172b(m27177g(str));
    }

    /* renamed from: d */
    public static String m27174d(String str) {
        return m27178h(m27175e(m27177g(str)));
    }

    /* renamed from: e */
    public static byte[] m27175e(byte[] bArr) {
        int i;
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer(((length / 3) + 1) * 4);
        int i2 = 0;
        while (i2 < length) {
            stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789[.".charAt((bArr[i2] >> 2) & 63));
            int i3 = (bArr[i2] << 4) & 63;
            int i4 = i2 + 1;
            if (i4 < length) {
                i3 |= (bArr[i4] >> 4) & 15;
            }
            stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789[.".charAt(i3));
            if (i4 < length) {
                int i5 = (bArr[i4] << 2) & 63;
                i = i4 + 1;
                if (i < length) {
                    i5 |= (bArr[i] >> 6) & 3;
                }
                stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789[.".charAt(i5));
            } else {
                i = i4 + 1;
                stringBuffer.append(']');
            }
            if (i < length) {
                stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789[.".charAt(bArr[i] & 63));
            } else {
                stringBuffer.append(']');
            }
            i2 = i + 1;
        }
        return m27177g(stringBuffer.toString());
    }

    /* renamed from: f */
    public static String m27176f(byte[] bArr) {
        return m27178h(m27175e(bArr));
    }

    /* renamed from: g */
    public static byte[] m27177g(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    /* renamed from: h */
    public static String m27178h(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append((char) b);
        }
        return stringBuffer.toString();
    }
}
