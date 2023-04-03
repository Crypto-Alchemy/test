package p000;

/* renamed from: lc4 */
/* compiled from: NumberOutput */
public final class lc4 {

    /* renamed from: a */
    public static int f14475a = 1000000;

    /* renamed from: b */
    public static int f14476b = 1000000000;

    /* renamed from: c */
    public static long f14477c = 1000000000;

    /* renamed from: d */
    public static long f14478d = -2147483648L;

    /* renamed from: e */
    public static long f14479e = 2147483647L;

    /* renamed from: f */
    public static final String f14480f = String.valueOf(Integer.MIN_VALUE);

    /* renamed from: g */
    public static final String f14481g = String.valueOf(Long.MIN_VALUE);

    /* renamed from: h */
    public static final int[] f14482h = new int[1000];

    /* renamed from: i */
    public static final String[] f14483i = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    /* renamed from: j */
    public static final String[] f14484j = {"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};

    static {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                int i4 = 0;
                while (i4 < 10) {
                    f14482h[i] = ((i2 + 48) << 16) | ((i3 + 48) << 8) | (i4 + 48);
                    i4++;
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public static int m21373a(int i, byte[] bArr, int i2) {
        int i3 = f14482h[i];
        int i4 = i2 + 1;
        bArr[i2] = (byte) (i3 >> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i3 >> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) i3;
        return i6;
    }

    /* renamed from: b */
    public static int m21374b(int i, char[] cArr, int i2) {
        int i3 = f14482h[i];
        int i4 = i2 + 1;
        cArr[i2] = (char) (i3 >> 16);
        int i5 = i4 + 1;
        cArr[i4] = (char) ((i3 >> 8) & 127);
        int i6 = i5 + 1;
        cArr[i5] = (char) (i3 & 127);
        return i6;
    }

    /* renamed from: c */
    public static int m21375c(int i, byte[] bArr, int i2) {
        int i3 = f14482h[i];
        if (i > 9) {
            if (i > 99) {
                bArr[i2] = (byte) (i3 >> 16);
                i2++;
            }
            bArr[i2] = (byte) (i3 >> 8);
            i2++;
        }
        int i4 = i2 + 1;
        bArr[i2] = (byte) i3;
        return i4;
    }

    /* renamed from: d */
    public static int m21376d(int i, char[] cArr, int i2) {
        int i3 = f14482h[i];
        if (i > 9) {
            if (i > 99) {
                cArr[i2] = (char) (i3 >> 16);
                i2++;
            }
            cArr[i2] = (char) ((i3 >> 8) & 127);
            i2++;
        }
        int i4 = i2 + 1;
        cArr[i2] = (char) (i3 & 127);
        return i4;
    }

    /* renamed from: e */
    public static int m21377e(int i, byte[] bArr, int i2) {
        int i3 = i / 1000;
        int i4 = i - (i3 * 1000);
        int i5 = i3 / 1000;
        int i6 = i3 - (i5 * 1000);
        int[] iArr = f14482h;
        int i7 = iArr[i5];
        int i8 = i2 + 1;
        bArr[i2] = (byte) (i7 >> 16);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (i7 >> 8);
        int i10 = i9 + 1;
        bArr[i9] = (byte) i7;
        int i11 = iArr[i6];
        int i12 = i10 + 1;
        bArr[i10] = (byte) (i11 >> 16);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i11 >> 8);
        int i14 = i13 + 1;
        bArr[i13] = (byte) i11;
        int i15 = iArr[i4];
        int i16 = i14 + 1;
        bArr[i14] = (byte) (i15 >> 16);
        int i17 = i16 + 1;
        bArr[i16] = (byte) (i15 >> 8);
        int i18 = i17 + 1;
        bArr[i17] = (byte) i15;
        return i18;
    }

    /* renamed from: f */
    public static int m21378f(int i, char[] cArr, int i2) {
        int i3 = i / 1000;
        int i4 = i - (i3 * 1000);
        int i5 = i3 / 1000;
        int[] iArr = f14482h;
        int i6 = iArr[i5];
        int i7 = i2 + 1;
        cArr[i2] = (char) (i6 >> 16);
        int i8 = i7 + 1;
        cArr[i7] = (char) ((i6 >> 8) & 127);
        int i9 = i8 + 1;
        cArr[i8] = (char) (i6 & 127);
        int i10 = iArr[i3 - (i5 * 1000)];
        int i11 = i9 + 1;
        cArr[i9] = (char) (i10 >> 16);
        int i12 = i11 + 1;
        cArr[i11] = (char) ((i10 >> 8) & 127);
        int i13 = i12 + 1;
        cArr[i12] = (char) (i10 & 127);
        int i14 = iArr[i4];
        int i15 = i13 + 1;
        cArr[i13] = (char) (i14 >> 16);
        int i16 = i15 + 1;
        cArr[i15] = (char) ((i14 >> 8) & 127);
        int i17 = i16 + 1;
        cArr[i16] = (char) (i14 & 127);
        return i17;
    }

    /* renamed from: g */
    public static int m21379g(byte[] bArr, int i) {
        int length = f14480f.length();
        int i2 = 0;
        while (i2 < length) {
            bArr[i] = (byte) f14480f.charAt(i2);
            i2++;
            i++;
        }
        return i;
    }

    /* renamed from: h */
    public static int m21380h(char[] cArr, int i) {
        String str = f14480f;
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return i + length;
    }

    /* renamed from: i */
    public static int m21381i(byte[] bArr, int i) {
        int length = f14481g.length();
        int i2 = 0;
        while (i2 < length) {
            bArr[i] = (byte) f14481g.charAt(i2);
            i2++;
            i++;
        }
        return i;
    }

    /* renamed from: j */
    public static int m21382j(char[] cArr, int i) {
        String str = f14481g;
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return i + length;
    }

    /* renamed from: k */
    public static int m21383k(int i, byte[] bArr, int i2) {
        if (i >= f14475a) {
            int i3 = i / 1000;
            int i4 = i - (i3 * 1000);
            int i5 = i3 / 1000;
            int c = m21375c(i5, bArr, i2);
            int[] iArr = f14482h;
            int i6 = iArr[i3 - (i5 * 1000)];
            int i7 = c + 1;
            bArr[c] = (byte) (i6 >> 16);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (i6 >> 8);
            int i9 = i8 + 1;
            bArr[i8] = (byte) i6;
            int i10 = iArr[i4];
            int i11 = i9 + 1;
            bArr[i9] = (byte) (i10 >> 16);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 >> 8);
            int i13 = i12 + 1;
            bArr[i12] = (byte) i10;
            return i13;
        } else if (i < 1000) {
            return m21375c(i, bArr, i2);
        } else {
            int i14 = i / 1000;
            return m21385m(bArr, i2, i14, i - (i14 * 1000));
        }
    }

    /* renamed from: l */
    public static int m21384l(int i, char[] cArr, int i2) {
        if (i >= f14475a) {
            int i3 = i / 1000;
            int i4 = i - (i3 * 1000);
            int i5 = i3 / 1000;
            int d = m21376d(i5, cArr, i2);
            int[] iArr = f14482h;
            int i6 = iArr[i3 - (i5 * 1000)];
            int i7 = d + 1;
            cArr[d] = (char) (i6 >> 16);
            int i8 = i7 + 1;
            cArr[i7] = (char) ((i6 >> 8) & 127);
            int i9 = i8 + 1;
            cArr[i8] = (char) (i6 & 127);
            int i10 = iArr[i4];
            int i11 = i9 + 1;
            cArr[i9] = (char) (i10 >> 16);
            int i12 = i11 + 1;
            cArr[i11] = (char) ((i10 >> 8) & 127);
            int i13 = i12 + 1;
            cArr[i12] = (char) (i10 & 127);
            return i13;
        } else if (i < 1000) {
            return m21376d(i, cArr, i2);
        } else {
            int i14 = i / 1000;
            return m21386n(cArr, i2, i14, i - (i14 * 1000));
        }
    }

    /* renamed from: m */
    public static int m21385m(byte[] bArr, int i, int i2, int i3) {
        int[] iArr = f14482h;
        int i4 = iArr[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                bArr[i] = (byte) (i4 >> 16);
                i++;
            }
            bArr[i] = (byte) (i4 >> 8);
            i++;
        }
        int i5 = i + 1;
        bArr[i] = (byte) i4;
        int i6 = iArr[i3];
        int i7 = i5 + 1;
        bArr[i5] = (byte) (i6 >> 16);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (i6 >> 8);
        int i9 = i8 + 1;
        bArr[i8] = (byte) i6;
        return i9;
    }

    /* renamed from: n */
    public static int m21386n(char[] cArr, int i, int i2, int i3) {
        int[] iArr = f14482h;
        int i4 = iArr[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                cArr[i] = (char) (i4 >> 16);
                i++;
            }
            cArr[i] = (char) ((i4 >> 8) & 127);
            i++;
        }
        int i5 = i + 1;
        cArr[i] = (char) (i4 & 127);
        int i6 = iArr[i3];
        int i7 = i5 + 1;
        cArr[i5] = (char) (i6 >> 16);
        int i8 = i7 + 1;
        cArr[i7] = (char) ((i6 >> 8) & 127);
        int i9 = i8 + 1;
        cArr[i8] = (char) (i6 & 127);
        return i9;
    }

    /* renamed from: o */
    public static boolean m21387o(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m21388p(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static int m21389q(int i, byte[] bArr, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return m21379g(bArr, i2);
            }
            bArr[i2] = 45;
            i = -i;
            i2++;
        }
        if (i >= f14475a) {
            int i4 = f14476b;
            if (i >= i4) {
                int i5 = i - i4;
                if (i5 >= i4) {
                    i5 -= i4;
                    i3 = i2 + 1;
                    bArr[i2] = 50;
                } else {
                    i3 = i2 + 1;
                    bArr[i2] = 49;
                }
                return m21377e(i5, bArr, i3);
            }
            int i6 = i / 1000;
            int i7 = i6 / 1000;
            return m21373a(i - (i6 * 1000), bArr, m21373a(i6 - (i7 * 1000), bArr, m21375c(i7, bArr, i2)));
        } else if (i >= 1000) {
            int i8 = i / 1000;
            return m21373a(i - (i8 * 1000), bArr, m21375c(i8, bArr, i2));
        } else if (i >= 10) {
            return m21375c(i, bArr, i2);
        } else {
            int i9 = i2 + 1;
            bArr[i2] = (byte) (i + 48);
            return i9;
        }
    }

    /* renamed from: r */
    public static int m21390r(int i, char[] cArr, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return m21380h(cArr, i2);
            }
            cArr[i2] = '-';
            i = -i;
            i2++;
        }
        if (i >= f14475a) {
            int i4 = f14476b;
            if (i >= i4) {
                int i5 = i - i4;
                if (i5 >= i4) {
                    i5 -= i4;
                    i3 = i2 + 1;
                    cArr[i2] = '2';
                } else {
                    i3 = i2 + 1;
                    cArr[i2] = '1';
                }
                return m21378f(i5, cArr, i3);
            }
            int i6 = i / 1000;
            int i7 = i6 / 1000;
            return m21374b(i - (i6 * 1000), cArr, m21374b(i6 - (i7 * 1000), cArr, m21376d(i7, cArr, i2)));
        } else if (i >= 1000) {
            int i8 = i / 1000;
            return m21374b(i - (i8 * 1000), cArr, m21376d(i8, cArr, i2));
        } else if (i >= 10) {
            return m21376d(i, cArr, i2);
        } else {
            cArr[i2] = (char) (i + 48);
            return i2 + 1;
        }
    }

    /* renamed from: s */
    public static int m21391s(long j, byte[] bArr, int i) {
        int i2;
        if (j < 0) {
            if (j > f14478d) {
                return m21389q((int) j, bArr, i);
            }
            if (j == Long.MIN_VALUE) {
                return m21381i(bArr, i);
            }
            bArr[i] = 45;
            j = -j;
            i++;
        } else if (j <= f14479e) {
            return m21389q((int) j, bArr, i);
        }
        long j2 = f14477c;
        long j3 = j / j2;
        long j4 = j - (j3 * j2);
        if (j3 < j2) {
            i2 = m21383k((int) j3, bArr, i);
        } else {
            long j5 = j3 / j2;
            int c = m21375c((int) j5, bArr, i);
            i2 = m21377e((int) (j3 - (j2 * j5)), bArr, c);
        }
        return m21377e((int) j4, bArr, i2);
    }

    /* renamed from: t */
    public static int m21392t(long j, char[] cArr, int i) {
        int i2;
        if (j < 0) {
            if (j > f14478d) {
                return m21390r((int) j, cArr, i);
            }
            if (j == Long.MIN_VALUE) {
                return m21382j(cArr, i);
            }
            cArr[i] = '-';
            j = -j;
            i++;
        } else if (j <= f14479e) {
            return m21390r((int) j, cArr, i);
        }
        long j2 = f14477c;
        long j3 = j / j2;
        long j4 = j - (j3 * j2);
        if (j3 < j2) {
            i2 = m21384l((int) j3, cArr, i);
        } else {
            long j5 = j3 / j2;
            int d = m21376d((int) j5, cArr, i);
            i2 = m21378f((int) (j3 - (j2 * j5)), cArr, d);
        }
        return m21378f((int) j4, cArr, i2);
    }

    /* renamed from: u */
    public static String m21393u(double d) {
        return Double.toString(d);
    }

    /* renamed from: v */
    public static String m21394v(float f) {
        return Float.toString(f);
    }

    /* renamed from: w */
    public static String m21395w(int i) {
        String[] strArr = f14483i;
        if (i < strArr.length) {
            if (i >= 0) {
                return strArr[i];
            }
            int i2 = (-i) - 1;
            String[] strArr2 = f14484j;
            if (i2 < strArr2.length) {
                return strArr2[i2];
            }
        }
        return Integer.toString(i);
    }

    /* renamed from: x */
    public static String m21396x(long j) {
        if (j > 2147483647L || j < -2147483648L) {
            return Long.toString(j);
        }
        return m21395w((int) j);
    }
}
