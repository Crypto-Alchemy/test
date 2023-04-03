package p000;

import java.util.Arrays;

/* renamed from: ve */
/* compiled from: AesUtil */
public final class C6601ve {
    /* renamed from: a */
    public static byte[] m53360a(byte[] bArr) {
        if (bArr.length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[bArr.length] = Byte.MIN_VALUE;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    /* renamed from: b */
    public static byte[] m53361b(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i = 0; i < 16; i++) {
                byte b = (byte) ((bArr[i] << 1) & 254);
                bArr2[i] = b;
                if (i < 15) {
                    bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }
}
