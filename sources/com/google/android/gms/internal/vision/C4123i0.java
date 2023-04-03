package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.i0 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class C4123i0 {

    /* renamed from: a */
    public static final v99 f22882a;

    static {
        boolean z;
        v99 v99;
        if (!l99.m47695m() || !l99.m47700r()) {
            z = false;
        } else {
            z = true;
        }
        if (!z || hw8.m45399b()) {
            v99 = new C4126j0();
        } else {
            v99 = new C4129k0();
        }
        f22882a = v99;
    }

    /* renamed from: d */
    public static int m34287d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new zzmg(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public static int m34288e(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f22882a.mo31216b(charSequence, bArr, i, i2);
    }

    /* renamed from: f */
    public static boolean m34289f(byte[] bArr) {
        return f22882a.mo48699c(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public static boolean m34290g(byte[] bArr, int i, int i2) {
        return f22882a.mo48699c(bArr, i, i2);
    }

    /* renamed from: h */
    public static int m34291h(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: i */
    public static int m34292i(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: j */
    public static int m34293j(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: k */
    public static String m34294k(byte[] bArr, int i, int i2) throws zzjk {
        return f22882a.mo31217d(bArr, i, i2);
    }

    /* renamed from: m */
    public static int m34296m(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m34291h(b);
        }
        if (i3 == 1) {
            return m34292i(b, bArr[i]);
        }
        if (i3 == 2) {
            return m34293j(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }
}
