package p000;

/* renamed from: v10 */
/* compiled from: BitEncoding */
public class v10 {

    /* renamed from: a */
    public static final boolean f45202a;

    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        f45202a = "true".equals(str);
    }

    /* renamed from: a */
    public static /* synthetic */ void m73020a(int i) {
        int i2 = i;
        String str = (i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? 2 : 3)];
        if (i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i2 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i2 == 3) {
            objArr[1] = "encode8to7";
        } else if (i2 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i2 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i2 == 10) {
            objArr[1] = "dropMarker";
        } else if (i2 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i2 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i2) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static void m73021b(byte[] bArr, int i) {
        if (bArr == null) {
            m73020a(4);
        }
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) ((bArr[i2] + i) & 127);
        }
    }

    /* renamed from: c */
    public static byte[] m73022c(String[] strArr) {
        if (strArr == null) {
            m73020a(11);
        }
        int i = 0;
        for (String length : strArr) {
            i += length.length();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (String str : strArr) {
            int length2 = str.length();
            int i3 = 0;
            while (i3 < length2) {
                bArr[i2] = (byte) str.charAt(i3);
                i3++;
                i2++;
            }
        }
        return bArr;
    }

    /* renamed from: d */
    public static byte[] m73023d(byte[] bArr) {
        if (bArr == null) {
            m73020a(13);
        }
        int length = (bArr.length * 7) / 8;
        byte[] bArr2 = new byte[length];
        int i = 0;
        byte b = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i++;
            int i3 = b + 1;
            bArr2[i2] = (byte) (((bArr[i] & 255) >>> b) + ((bArr[i] & ((1 << i3) - 1)) << (7 - b)));
            if (b == 6) {
                i++;
                b = 0;
            } else {
                b = i3;
            }
        }
        return bArr2;
    }

    /* renamed from: e */
    public static byte[] m73024e(String[] strArr) {
        if (strArr == null) {
            m73020a(7);
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                byte[] a = j67.m59266a(m73025f(strArr));
                if (a == null) {
                    m73020a(8);
                }
                return a;
            } else if (charAt == 65535) {
                strArr = m73025f(strArr);
            }
        }
        byte[] c = m73022c(strArr);
        m73021b(c, 127);
        return m73023d(c);
    }

    /* renamed from: f */
    public static String[] m73025f(String[] strArr) {
        if (strArr == null) {
            m73020a(9);
        }
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        return strArr2;
    }
}
