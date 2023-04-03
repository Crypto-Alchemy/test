package p000;

/* renamed from: oi3 */
public final class oi3 {
    /* renamed from: a */
    public static void m70287a(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 8);
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    /* renamed from: b */
    public static void m70288b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            bArr[i2 + i4] = (byte) (i >>> (i4 * 8));
        }
    }

    /* renamed from: c */
    public static byte[] m70289c(int i) {
        return new byte[]{(byte) i, (byte) (i >>> 8), (byte) (i >>> 16), (byte) (i >>> 24)};
    }

    /* renamed from: d */
    public static int m70290d(byte[] bArr) {
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    /* renamed from: e */
    public static int m70291e(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        return ((bArr[i3 + 1] & 255) << 24) | b | ((bArr[i3] & 255) << 16);
    }

    /* renamed from: f */
    public static int m70292f(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            i3 |= (bArr[i + i4] & 255) << (i4 * 8);
        }
        return i3;
    }
}
