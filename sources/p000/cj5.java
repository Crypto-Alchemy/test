package p000;

/* renamed from: cj5 */
/* compiled from: SHA2 */
public class cj5 {

    /* renamed from: a */
    public String f8447a = "SHA-256";

    /* renamed from: a */
    public static byte[] m11892a(byte[] bArr) {
        if (bArr.length < 1) {
            return null;
        }
        return m11893b(bArr);
    }

    /* renamed from: b */
    public static byte[] m11893b(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[32];
        int i2 = 64;
        byte[] bArr3 = new byte[64];
        byte[] d = m11895d(bArr);
        int[] iArr = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
        int i3 = 8;
        int[] iArr2 = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
        int i4 = 0;
        int i5 = 0;
        while (i5 < d.length / i2) {
            int[] iArr3 = new int[i2];
            int i6 = iArr2[i4];
            char c = 1;
            int i7 = iArr2[1];
            int i8 = 2;
            int i9 = iArr2[2];
            int i10 = iArr2[3];
            int i11 = iArr2[4];
            int i12 = iArr2[5];
            int i13 = iArr2[6];
            int i14 = iArr2[7];
            System.arraycopy(d, i5 * 64, bArr3, i4, i2);
            int i15 = i4;
            while (true) {
                i = 16;
                if (i15 >= 16) {
                    break;
                }
                int i16 = i4;
                iArr3[i15] = i16;
                while (i4 < 4) {
                    iArr3[i15] = iArr3[i15] | ((bArr3[(i15 * 4) + i4] & 255) << (24 - (i4 * 8)));
                    i4++;
                }
                i15++;
                i4 = i16;
                i2 = 64;
                c = 1;
                i8 = 2;
            }
            while (i < i2) {
                int i17 = i - 15;
                int i18 = i - 2;
                iArr3[i] = iArr3[i - 16] + ((iArr3[i17] >>> 3) ^ (Integer.rotateRight(iArr3[i17], 7) ^ Integer.rotateRight(iArr3[i17], 18))) + iArr3[i - 7] + ((iArr3[i18] >>> 10) ^ (Integer.rotateRight(iArr3[i18], 19) ^ Integer.rotateRight(iArr3[i18], 17)));
                i++;
                i2 = 64;
                i4 = 0;
                c = 1;
                i8 = 2;
            }
            int i19 = i4;
            int i20 = i11;
            while (i19 < i2) {
                int rotateRight = ((Integer.rotateRight(i6, i8) ^ Integer.rotateRight(i6, 13)) ^ Integer.rotateRight(i6, 22)) + (((i6 & i7) ^ (i6 & i9)) ^ (i7 & i9));
                int rotateRight2 = i14 + ((Integer.rotateRight(i20, 6) ^ Integer.rotateRight(i20, 11)) ^ Integer.rotateRight(i20, 25)) + (((~i20) & i13) ^ (i20 & i12)) + iArr[i19] + iArr3[i19];
                int i21 = i10 + rotateRight2;
                int i22 = rotateRight2 + rotateRight;
                i19++;
                i10 = i9;
                i14 = i13;
                i4 = 0;
                c = 1;
                i8 = 2;
                i9 = i7;
                i13 = i12;
                i12 = i20;
                i7 = i6;
                i20 = i21;
                i6 = i22;
                i2 = 64;
            }
            iArr2[i4] = iArr2[i4] + i6;
            iArr2[c] = iArr2[c] + i7;
            iArr2[i8] = iArr2[i8] + i9;
            iArr2[3] = iArr2[3] + i10;
            iArr2[4] = iArr2[4] + i20;
            iArr2[5] = iArr2[5] + i12;
            iArr2[6] = iArr2[6] + i13;
            iArr2[7] = iArr2[7] + i14;
            i5++;
            i3 = 8;
        }
        for (int i23 = i4; i23 < i3; i23++) {
            System.arraycopy(m11894c(iArr2[i23]), i4, bArr2, i23 * 4, 4);
        }
        return bArr2;
    }

    /* renamed from: c */
    public static byte[] m11894c(int i) {
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) ((i >>> (56 - (i2 * 8))) & 255);
        }
        return bArr;
    }

    /* renamed from: d */
    public static byte[] m11895d(byte[] bArr) {
        int length = bArr.length;
        int i = length % 64;
        int i2 = 64 - i;
        if (i2 < 9) {
            i2 = 128 - i;
        }
        byte[] bArr2 = new byte[i2];
        bArr2[0] = Byte.MIN_VALUE;
        long j = (long) (length * 8);
        for (int i3 = 0; i3 < 8; i3++) {
            bArr2[(i2 - 1) - i3] = (byte) ((int) ((j >>> (i3 * 8)) & 255));
        }
        byte[] bArr3 = new byte[(length + i2)];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, i2);
        return bArr3;
    }
}
