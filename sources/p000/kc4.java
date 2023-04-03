package p000;

import java.math.BigDecimal;

/* renamed from: kc4 */
/* compiled from: NumberInput */
public final class kc4 {

    /* renamed from: a */
    public static final String f14037a = String.valueOf(Long.MIN_VALUE).substring(1);

    /* renamed from: b */
    public static final String f14038b = String.valueOf(Long.MAX_VALUE);

    /* renamed from: a */
    public static boolean m20638a(String str, boolean z) {
        String str2;
        if (z) {
            str2 = f14037a;
        } else {
            str2 = f14038b;
        }
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        int i = 0;
        while (i < length) {
            int charAt = str.charAt(i) - str2.charAt(i);
            if (charAt == 0) {
                i++;
            } else if (charAt < 0) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m20639b(char[] cArr, int i, int i2, boolean z) {
        String str;
        if (z) {
            str = f14037a;
        } else {
            str = f14038b;
        }
        int length = str.length();
        if (i2 < length) {
            return true;
        }
        if (i2 > length) {
            return false;
        }
        int i3 = 0;
        while (i3 < length) {
            int charAt = cArr[i + i3] - str.charAt(i3);
            if (charAt == 0) {
                i3++;
            } else if (charAt < 0) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static double m20640c(String str, double d) {
        if (str == null) {
            return d;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return d;
        }
        try {
            return m20646i(trim);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    /* renamed from: d */
    public static int m20641d(String str, int i) {
        String trim;
        int length;
        if (str == null || (length = trim.length()) == 0) {
            return i;
        }
        int i2 = 0;
        char charAt = (trim = str.trim()).charAt(0);
        if (charAt == '+') {
            trim = trim.substring(1);
            length = trim.length();
        } else if (charAt == '-') {
            i2 = 1;
        }
        while (i2 < length) {
            char charAt2 = trim.charAt(i2);
            if (charAt2 > '9' || charAt2 < '0') {
                try {
                    return (int) m20646i(trim);
                } catch (NumberFormatException unused) {
                    return i;
                }
            } else {
                i2++;
            }
        }
        try {
            return Integer.parseInt(trim);
        } catch (NumberFormatException unused2) {
            return i;
        }
    }

    /* renamed from: e */
    public static long m20642e(String str, long j) {
        String trim;
        int length;
        if (str == null || (length = trim.length()) == 0) {
            return j;
        }
        int i = 0;
        char charAt = (trim = str.trim()).charAt(0);
        if (charAt == '+') {
            trim = trim.substring(1);
            length = trim.length();
        } else if (charAt == '-') {
            i = 1;
        }
        while (i < length) {
            char charAt2 = trim.charAt(i);
            if (charAt2 > '9' || charAt2 < '0') {
                try {
                    return (long) m20646i(trim);
                } catch (NumberFormatException unused) {
                    return j;
                }
            } else {
                i++;
            }
        }
        try {
            return Long.parseLong(trim);
        } catch (NumberFormatException unused2) {
            return j;
        }
    }

    /* renamed from: f */
    public static BigDecimal m20643f(String str) throws NumberFormatException {
        return g10.m17562b(str);
    }

    /* renamed from: g */
    public static BigDecimal m20644g(char[] cArr) throws NumberFormatException {
        return g10.m17563c(cArr);
    }

    /* renamed from: h */
    public static BigDecimal m20645h(char[] cArr, int i, int i2) throws NumberFormatException {
        return g10.m17564d(cArr, i, i2);
    }

    /* renamed from: i */
    public static double m20646i(String str) throws NumberFormatException {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        return java.lang.Integer.parseInt(r9);
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m20647j(java.lang.String r9) {
        /*
            r0 = 0
            char r1 = r9.charAt(r0)
            int r2 = r9.length()
            r3 = 1
            r4 = 45
            if (r1 != r4) goto L_0x000f
            r0 = r3
        L_0x000f:
            r4 = 10
            if (r0 == 0) goto L_0x0026
            if (r2 == r3) goto L_0x0021
            if (r2 <= r4) goto L_0x0018
            goto L_0x0021
        L_0x0018:
            r1 = 2
            char r3 = r9.charAt(r3)
            r8 = r3
            r3 = r1
            r1 = r8
            goto L_0x002f
        L_0x0021:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L_0x0026:
            r5 = 9
            if (r2 <= r5) goto L_0x002f
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L_0x002f:
            r5 = 57
            if (r1 > r5) goto L_0x0084
            r6 = 48
            if (r1 >= r6) goto L_0x0038
            goto L_0x0084
        L_0x0038:
            int r1 = r1 - r6
            if (r3 >= r2) goto L_0x0080
            int r7 = r3 + 1
            char r3 = r9.charAt(r3)
            if (r3 > r5) goto L_0x007b
            if (r3 >= r6) goto L_0x0046
            goto L_0x007b
        L_0x0046:
            int r1 = r1 * 10
            int r3 = r3 - r6
            int r1 = r1 + r3
            if (r7 >= r2) goto L_0x0080
            int r3 = r7 + 1
            char r7 = r9.charAt(r7)
            if (r7 > r5) goto L_0x0076
            if (r7 >= r6) goto L_0x0057
            goto L_0x0076
        L_0x0057:
            int r1 = r1 * 10
            int r7 = r7 - r6
            int r1 = r1 + r7
            if (r3 >= r2) goto L_0x0080
        L_0x005d:
            int r7 = r3 + 1
            char r3 = r9.charAt(r3)
            if (r3 > r5) goto L_0x0071
            if (r3 >= r6) goto L_0x0068
            goto L_0x0071
        L_0x0068:
            int r1 = r1 * r4
            int r3 = r3 + -48
            int r1 = r1 + r3
            if (r7 < r2) goto L_0x006f
            goto L_0x0080
        L_0x006f:
            r3 = r7
            goto L_0x005d
        L_0x0071:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L_0x0076:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L_0x007b:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L_0x0080:
            if (r0 == 0) goto L_0x0083
            int r1 = -r1
        L_0x0083:
            return r1
        L_0x0084:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kc4.m20647j(java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return r0 + ((r2[r3] - '0') * 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        r0 = r0 + ((r2[r3] - '0') * 10000000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
        r0 = r0 + ((r2[r3] - '0') * androidx.media3.common.PlaybackException.CUSTOM_ERROR_CODE_BASE);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        r0 = r0 + ((r2[r3] - '0') * com.fasterxml.jackson.databind.node.NodeSerialization.LONGEST_EAGER_ALLOC);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        r0 = r0 + ((r2[r3] - '0') * 10000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
        r0 = r0 + ((r2[r3] - '0') * 1000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
        r0 = r0 + ((r2[r3] - '0') * 100);
        r3 = r3 + 1;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m20648k(char[] r2, int r3, int r4) {
        /*
            int r0 = r3 + r4
            int r0 = r0 + -1
            char r0 = r2[r0]
            int r0 = r0 + -48
            switch(r4) {
                case 2: goto L_0x005a;
                case 3: goto L_0x0050;
                case 4: goto L_0x0046;
                case 5: goto L_0x003c;
                case 6: goto L_0x0030;
                case 7: goto L_0x0024;
                case 8: goto L_0x0018;
                case 9: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0061
        L_0x000c:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            r1 = 100000000(0x5f5e100, float:2.3122341E-35)
            int r3 = r3 * r1
            int r0 = r0 + r3
            r3 = r4
        L_0x0018:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            r1 = 10000000(0x989680, float:1.4012985E-38)
            int r3 = r3 * r1
            int r0 = r0 + r3
            r3 = r4
        L_0x0024:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            r1 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 * r1
            int r0 = r0 + r3
            r3 = r4
        L_0x0030:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            r1 = 100000(0x186a0, float:1.4013E-40)
            int r3 = r3 * r1
            int r0 = r0 + r3
            r3 = r4
        L_0x003c:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            int r3 = r3 * 10000
            int r0 = r0 + r3
            r3 = r4
        L_0x0046:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            int r3 = r3 * 1000
            int r0 = r0 + r3
            r3 = r4
        L_0x0050:
            int r4 = r3 + 1
            char r3 = r2[r3]
            int r3 = r3 + -48
            int r3 = r3 * 100
            int r0 = r0 + r3
            r3 = r4
        L_0x005a:
            char r2 = r2[r3]
            int r2 = r2 + -48
            int r2 = r2 * 10
            int r0 = r0 + r2
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kc4.m20648k(char[], int, int):int");
    }

    /* renamed from: l */
    public static long m20649l(String str) {
        if (str.length() <= 9) {
            return (long) m20647j(str);
        }
        return Long.parseLong(str);
    }

    /* renamed from: m */
    public static long m20650m(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (((long) m20648k(cArr, i, i3)) * 1000000000) + ((long) m20648k(cArr, i + i3, 9));
    }
}
