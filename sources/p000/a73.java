package p000;

/* renamed from: a73 */
/* compiled from: JsonStringEncoder */
public final class a73 {

    /* renamed from: a */
    public static final char[] f54a = ud0.m28144d();

    /* renamed from: b */
    public static final byte[] f55b = ud0.m28143c();

    /* renamed from: c */
    public static final a73 f56c = new a73();

    /* renamed from: d */
    public static int m94d(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i - 55296) << 10) + 65536 + (i2 - 56320);
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2) + "; illegal combination");
    }

    /* renamed from: e */
    public static void m95e(int i) {
        throw new IllegalArgumentException(g37.m17583c(i));
    }

    /* renamed from: f */
    public static int m96f(int i) {
        return Math.min(Math.max(24, i + 6 + (i >> 1)), 32000);
    }

    /* renamed from: g */
    public static int m97g(int i) {
        return Math.min(Math.max(16, i + Math.min((i >> 3) + 6, 1000)), 32000);
    }

    /* renamed from: j */
    public static a73 m98j() {
        return f56c;
    }

    /* renamed from: a */
    public final int mo76a(int i, int i2, g60 g60, int i3) {
        g60.mo20399m(i3);
        g60.mo20387b(92);
        if (i2 < 0) {
            g60.mo20387b(117);
            if (i > 255) {
                int i4 = i >> 8;
                byte[] bArr = f55b;
                g60.mo20387b(bArr[i4 >> 4]);
                g60.mo20387b(bArr[i4 & 15]);
                i &= 255;
            } else {
                g60.mo20387b(48);
                g60.mo20387b(48);
            }
            byte[] bArr2 = f55b;
            g60.mo20387b(bArr2[i >> 4]);
            g60.mo20387b(bArr2[i & 15]);
        } else {
            g60.mo20387b((byte) i2);
        }
        return g60.mo20395i();
    }

    /* renamed from: b */
    public final int mo77b(int i, char[] cArr) {
        cArr[1] = (char) i;
        return 2;
    }

    /* renamed from: c */
    public final int mo78c(int i, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = f54a;
        cArr[4] = cArr2[i >> 4];
        cArr[5] = cArr2[i & 15];
        return 6;
    }

    /* renamed from: h */
    public final char[] mo79h() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[2] = '0';
        cArr[3] = '0';
        return cArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00eb A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo80i(java.lang.String r12) {
        /*
            r11 = this;
            int r0 = r12.length()
            int r1 = m96f(r0)
            byte[] r2 = new byte[r1]
            r3 = 0
            r4 = 0
            r5 = r3
            r6 = r5
        L_0x000e:
            if (r5 >= r0) goto L_0x00f7
            int r7 = r5 + 1
            char r5 = r12.charAt(r5)
        L_0x0016:
            r8 = 127(0x7f, float:1.78E-43)
            if (r5 > r8) goto L_0x003f
            if (r6 < r1) goto L_0x002b
            if (r4 != 0) goto L_0x0022
            g60 r4 = p000.g60.m17614g(r2, r6)
        L_0x0022:
            byte[] r1 = r4.mo20392f()
            int r2 = r1.length
            r6 = r3
            r10 = r2
            r2 = r1
            r1 = r10
        L_0x002b:
            int r8 = r6 + 1
            byte r5 = (byte) r5
            r2[r6] = r5
            if (r7 < r0) goto L_0x0035
            r6 = r8
            goto L_0x00f7
        L_0x0035:
            int r5 = r7 + 1
            char r6 = r12.charAt(r7)
            r7 = r5
            r5 = r6
            r6 = r8
            goto L_0x0016
        L_0x003f:
            if (r4 != 0) goto L_0x0045
            g60 r4 = p000.g60.m17614g(r2, r6)
        L_0x0045:
            if (r6 < r1) goto L_0x004d
            byte[] r2 = r4.mo20392f()
            int r1 = r2.length
            r6 = r3
        L_0x004d:
            r8 = 2048(0x800, float:2.87E-42)
            if (r5 >= r8) goto L_0x005e
            int r8 = r6 + 1
            int r9 = r5 >> 6
            r9 = r9 | 192(0xc0, float:2.69E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
        L_0x005a:
            r6 = r5
            r5 = r7
            goto L_0x00e0
        L_0x005e:
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r8) goto L_0x00be
            r8 = 57343(0xdfff, float:8.0355E-41)
            if (r5 <= r8) goto L_0x0069
            goto L_0x00be
        L_0x0069:
            r8 = 56319(0xdbff, float:7.892E-41)
            if (r5 <= r8) goto L_0x0071
            m95e(r5)
        L_0x0071:
            if (r7 < r0) goto L_0x0076
            m95e(r5)
        L_0x0076:
            int r8 = r7 + 1
            char r7 = r12.charAt(r7)
            int r5 = m94d(r5, r7)
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r5 <= r7) goto L_0x0088
            m95e(r5)
        L_0x0088:
            int r7 = r6 + 1
            int r9 = r5 >> 18
            r9 = r9 | 240(0xf0, float:3.36E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            if (r7 < r1) goto L_0x0099
            byte[] r2 = r4.mo20392f()
            int r1 = r2.length
            r7 = r3
        L_0x0099:
            int r6 = r7 + 1
            int r9 = r5 >> 12
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r2[r7] = r9
            if (r6 < r1) goto L_0x00af
            byte[] r1 = r4.mo20392f()
            int r2 = r1.length
            r6 = r3
            r10 = r2
            r2 = r1
            r1 = r10
        L_0x00af:
            int r7 = r6 + 1
            int r9 = r5 >> 6
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            r6 = r5
            r5 = r8
            r8 = r7
            goto L_0x00e0
        L_0x00be:
            int r8 = r6 + 1
            int r9 = r5 >> 12
            r9 = r9 | 224(0xe0, float:3.14E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            if (r8 < r1) goto L_0x00d2
            byte[] r1 = r4.mo20392f()
            int r2 = r1.length
            r8 = r3
            r10 = r2
            r2 = r1
            r1 = r10
        L_0x00d2:
            int r6 = r8 + 1
            int r9 = r5 >> 6
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r2[r8] = r9
            r8 = r6
            goto L_0x005a
        L_0x00e0:
            if (r8 < r1) goto L_0x00eb
            byte[] r1 = r4.mo20392f()
            int r2 = r1.length
            r8 = r3
            r10 = r2
            r2 = r1
            r1 = r10
        L_0x00eb:
            int r7 = r8 + 1
            r6 = r6 & 63
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            r2[r8] = r6
            r6 = r7
            goto L_0x000e
        L_0x00f7:
            if (r4 != 0) goto L_0x00fe
            byte[] r12 = java.util.Arrays.copyOfRange(r2, r3, r6)
            return r12
        L_0x00fe:
            byte[] r12 = r4.mo20391e(r6)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a73.mo80i(java.lang.String):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        r7 = mo78c(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        r7 = mo77b(r10, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r10 = r8 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r10 <= r1.length) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r10 = r1.length - r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r10 <= 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        java.lang.System.arraycopy(r6, 0, r1, r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r4 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r4 = p000.en6.m16225q(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r1 = r4.mo19417p();
        r7 = r7 - r10;
        java.lang.System.arraycopy(r6, r10, r1, 0, r7);
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        java.lang.System.arraycopy(r6, 0, r1, r8, r7);
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r6 != null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        r6 = mo79h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r9 = r7 + 1;
        r7 = r13.charAt(r7);
        r10 = r2[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r10 >= 0) goto L_0x0035;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char[] mo81k(java.lang.String r13) {
        /*
            r12 = this;
            int r0 = r13.length()
            int r1 = m97g(r0)
            char[] r1 = new char[r1]
            int[] r2 = p000.ud0.m28145e()
            int r3 = r2.length
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r5
            r8 = r7
        L_0x0014:
            if (r7 >= r0) goto L_0x0075
        L_0x0016:
            char r9 = r13.charAt(r7)
            if (r9 >= r3) goto L_0x005b
            r10 = r2[r9]
            if (r10 == 0) goto L_0x005b
            if (r6 != 0) goto L_0x0026
            char[] r6 = r12.mo79h()
        L_0x0026:
            int r9 = r7 + 1
            char r7 = r13.charAt(r7)
            r10 = r2[r7]
            if (r10 >= 0) goto L_0x0035
            int r7 = r12.mo78c(r7, r6)
            goto L_0x0039
        L_0x0035:
            int r7 = r12.mo77b(r10, r6)
        L_0x0039:
            int r10 = r8 + r7
            int r11 = r1.length
            if (r10 <= r11) goto L_0x0055
            int r10 = r1.length
            int r10 = r10 - r8
            if (r10 <= 0) goto L_0x0045
            java.lang.System.arraycopy(r6, r5, r1, r8, r10)
        L_0x0045:
            if (r4 != 0) goto L_0x004b
            en6 r4 = p000.en6.m16225q(r1)
        L_0x004b:
            char[] r1 = r4.mo19417p()
            int r7 = r7 - r10
            java.lang.System.arraycopy(r6, r10, r1, r5, r7)
            r8 = r7
            goto L_0x0059
        L_0x0055:
            java.lang.System.arraycopy(r6, r5, r1, r8, r7)
            r8 = r10
        L_0x0059:
            r7 = r9
            goto L_0x0014
        L_0x005b:
            int r10 = r1.length
            if (r8 < r10) goto L_0x0069
            if (r4 != 0) goto L_0x0064
            en6 r4 = p000.en6.m16225q(r1)
        L_0x0064:
            char[] r1 = r4.mo19417p()
            r8 = r5
        L_0x0069:
            int r10 = r8 + 1
            r1[r8] = r9
            int r7 = r7 + 1
            if (r7 < r0) goto L_0x0073
            r8 = r10
            goto L_0x0075
        L_0x0073:
            r8 = r10
            goto L_0x0016
        L_0x0075:
            if (r4 != 0) goto L_0x007c
            char[] r13 = java.util.Arrays.copyOfRange(r1, r5, r8)
            return r13
        L_0x007c:
            r4.mo19399E(r8)
            char[] r13 = r4.mo19408g()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a73.mo81k(java.lang.String):char[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fb  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo82l(java.lang.String r11) {
        /*
            r10 = this;
            int r0 = r11.length()
            int r1 = m96f(r0)
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r4
        L_0x000e:
            if (r4 >= r0) goto L_0x0108
            int[] r6 = p000.ud0.m28145e()
        L_0x0014:
            char r7 = r11.charAt(r4)
            r8 = 127(0x7f, float:1.78E-43)
            if (r7 > r8) goto L_0x003d
            r9 = r6[r7]
            if (r9 == 0) goto L_0x0021
            goto L_0x003d
        L_0x0021:
            int r8 = r1.length
            if (r5 < r8) goto L_0x002f
            if (r3 != 0) goto L_0x002a
            g60 r3 = p000.g60.m17614g(r1, r5)
        L_0x002a:
            byte[] r1 = r3.mo20392f()
            r5 = r2
        L_0x002f:
            int r8 = r5 + 1
            byte r7 = (byte) r7
            r1[r5] = r7
            int r4 = r4 + 1
            if (r4 < r0) goto L_0x003b
            r5 = r8
            goto L_0x0108
        L_0x003b:
            r5 = r8
            goto L_0x0014
        L_0x003d:
            if (r3 != 0) goto L_0x0043
            g60 r3 = p000.g60.m17614g(r1, r5)
        L_0x0043:
            int r7 = r1.length
            if (r5 < r7) goto L_0x004b
            byte[] r1 = r3.mo20392f()
            r5 = r2
        L_0x004b:
            int r7 = r4 + 1
            char r4 = r11.charAt(r4)
            if (r4 > r8) goto L_0x005f
            r1 = r6[r4]
            int r5 = r10.mo76a(r4, r1, r3, r5)
            byte[] r1 = r3.mo20394h()
            r4 = r7
            goto L_0x000e
        L_0x005f:
            r6 = 2047(0x7ff, float:2.868E-42)
            if (r4 > r6) goto L_0x0074
            int r6 = r5 + 1
            int r8 = r4 >> 6
            r8 = r8 | 192(0xc0, float:2.69E-43)
            byte r8 = (byte) r8
            r1[r5] = r8
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.794E-43)
        L_0x0070:
            r5 = r4
            r4 = r7
            goto L_0x00f8
        L_0x0074:
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r6) goto L_0x00d5
            r6 = 57343(0xdfff, float:8.0355E-41)
            if (r4 <= r6) goto L_0x007f
            goto L_0x00d5
        L_0x007f:
            r6 = 56319(0xdbff, float:7.892E-41)
            if (r4 <= r6) goto L_0x0087
            m95e(r4)
        L_0x0087:
            if (r7 < r0) goto L_0x008c
            m95e(r4)
        L_0x008c:
            int r6 = r7 + 1
            char r7 = r11.charAt(r7)
            int r4 = m94d(r4, r7)
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r4 <= r7) goto L_0x009e
            m95e(r4)
        L_0x009e:
            int r7 = r5 + 1
            int r8 = r4 >> 18
            r8 = r8 | 240(0xf0, float:3.36E-43)
            byte r8 = (byte) r8
            r1[r5] = r8
            int r5 = r1.length
            if (r7 < r5) goto L_0x00af
            byte[] r1 = r3.mo20392f()
            r7 = r2
        L_0x00af:
            int r5 = r7 + 1
            int r8 = r4 >> 12
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            byte r8 = (byte) r8
            r1[r7] = r8
            int r7 = r1.length
            if (r5 < r7) goto L_0x00c2
            byte[] r1 = r3.mo20392f()
            r5 = r2
        L_0x00c2:
            int r7 = r5 + 1
            int r8 = r4 >> 6
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            byte r8 = (byte) r8
            r1[r5] = r8
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.794E-43)
            r5 = r4
            r4 = r6
            r6 = r7
            goto L_0x00f8
        L_0x00d5:
            int r6 = r5 + 1
            int r8 = r4 >> 12
            r8 = r8 | 224(0xe0, float:3.14E-43)
            byte r8 = (byte) r8
            r1[r5] = r8
            int r5 = r1.length
            if (r6 < r5) goto L_0x00e6
            byte[] r1 = r3.mo20392f()
            r6 = r2
        L_0x00e6:
            int r5 = r6 + 1
            int r8 = r4 >> 6
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            byte r8 = (byte) r8
            r1[r6] = r8
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.794E-43)
            r6 = r5
            goto L_0x0070
        L_0x00f8:
            int r7 = r1.length
            if (r6 < r7) goto L_0x0100
            byte[] r1 = r3.mo20392f()
            r6 = r2
        L_0x0100:
            int r7 = r6 + 1
            byte r5 = (byte) r5
            r1[r6] = r5
            r5 = r7
            goto L_0x000e
        L_0x0108:
            if (r3 != 0) goto L_0x010f
            byte[] r11 = java.util.Arrays.copyOfRange(r1, r2, r5)
            return r11
        L_0x010f:
            byte[] r11 = r3.mo20391e(r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a73.mo82l(java.lang.String):byte[]");
    }
}
