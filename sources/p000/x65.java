package p000;

import java.lang.reflect.Array;

/* renamed from: x65 */
public class x65 {
    /* renamed from: a */
    public static byte[] m73875a(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            bArr[i] = (byte) sArr[i];
        }
        return bArr;
    }

    /* renamed from: b */
    public static short[] m73876b(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            sArr[i] = (short) (bArr[i] & 255);
        }
        return sArr;
    }

    /* renamed from: c */
    public static byte[][] m73877c(short[][] sArr) {
        int length = sArr.length;
        int[] iArr = new int[2];
        iArr[1] = sArr[0].length;
        iArr[0] = length;
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                bArr[i][i2] = (byte) sArr[i][i2];
            }
        }
        return bArr;
    }

    /* renamed from: d */
    public static short[][] m73878d(byte[][] bArr) {
        int length = bArr.length;
        int[] iArr = new int[2];
        iArr[1] = bArr[0].length;
        iArr[0] = length;
        short[][] sArr = (short[][]) Array.newInstance(Short.TYPE, iArr);
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                sArr[i][i2] = (short) (bArr[i][i2] & 255);
            }
        }
        return sArr;
    }

    /* renamed from: e */
    public static byte[][][] m73879e(short[][][] sArr) {
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        int length2 = sArr2.length;
        int[] iArr = new int[3];
        iArr[2] = sArr2[0].length;
        iArr[1] = length2;
        iArr[0] = length;
        byte[][][] bArr = (byte[][][]) Array.newInstance(Byte.TYPE, iArr);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                for (int i3 = 0; i3 < sArr[0][0].length; i3++) {
                    bArr[i][i2][i3] = (byte) sArr[i][i2][i3];
                }
            }
        }
        return bArr;
    }

    /* renamed from: f */
    public static short[][][] m73880f(byte[][][] bArr) {
        int length = bArr.length;
        byte[][] bArr2 = bArr[0];
        int length2 = bArr2.length;
        int[] iArr = new int[3];
        iArr[2] = bArr2[0].length;
        iArr[1] = length2;
        iArr[0] = length;
        short[][][] sArr = (short[][][]) Array.newInstance(Short.TYPE, iArr);
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                for (int i3 = 0; i3 < bArr[0][0].length; i3++) {
                    sArr[i][i2][i3] = (short) (bArr[i][i2][i3] & 255);
                }
            }
        }
        return sArr;
    }

    /* renamed from: g */
    public static int[] m73881g(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = bArr[i] & 255;
        }
        return iArr;
    }

    /* renamed from: h */
    public static byte[] m73882h(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) iArr[i];
        }
        return bArr;
    }

    /* renamed from: i */
    public static boolean m73883i(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= sArr[length] == sArr2[length];
        }
        return z;
    }

    /* renamed from: j */
    public static boolean m73884j(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= m73883i(sArr[length], sArr2[length]);
        }
        return z;
    }

    /* renamed from: k */
    public static boolean m73885k(short[][][] sArr, short[][][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= m73884j(sArr[length], sArr2[length]);
        }
        return z;
    }
}
