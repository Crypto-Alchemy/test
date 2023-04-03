package p000;

/* renamed from: jy6 */
/* compiled from: TsUtil */
public final class jy6 {
    /* renamed from: a */
    public static int m20476a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static boolean m20477b(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * 188) + i3;
            if (i6 < i || i6 >= i2 || bArr[i6] != 71) {
                i4 = 0;
            } else {
                i4++;
                if (i4 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static long m20478c(gm4 gm4, int i, int i2) {
        boolean z;
        gm4.mo20674P(i);
        if (gm4.mo20676a() < 5) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        int n = gm4.mo20689n();
        if ((8388608 & n) != 0 || ((2096896 & n) >> 8) != i2) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        boolean z2 = true;
        if ((n & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && gm4.mo20662D() >= 7 && gm4.mo20676a() >= 7) {
            if ((gm4.mo20662D() & 16) != 16) {
                z2 = false;
            }
            if (z2) {
                byte[] bArr = new byte[6];
                gm4.mo20685j(bArr, 0, 6);
                return m20479d(bArr);
            }
        }
        return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: d */
    public static long m20479d(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
