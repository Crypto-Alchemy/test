package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* renamed from: sc0 */
/* compiled from: ChaCha20Util */
public final class sc0 {

    /* renamed from: a */
    public static final int[] f33822a = m51709e(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    public static void m51705a(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int b = m51706b(i5 ^ iArr[i4], 16);
        iArr[i4] = b;
        int i6 = iArr[i3] + b;
        iArr[i3] = i6;
        int b2 = m51706b(iArr[i2] ^ i6, 12);
        iArr[i2] = b2;
        int i7 = iArr[i] + b2;
        iArr[i] = i7;
        int b3 = m51706b(iArr[i4] ^ i7, 8);
        iArr[i4] = b3;
        int i8 = iArr[i3] + b3;
        iArr[i3] = i8;
        iArr[i2] = m51706b(iArr[i2] ^ i8, 7);
    }

    /* renamed from: b */
    public static int m51706b(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* renamed from: c */
    public static void m51707c(int[] iArr, int[] iArr2) {
        int[] iArr3 = f33822a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* renamed from: d */
    public static void m51708d(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i = 0; i < 10; i++) {
            m51705a(iArr2, 0, 4, 8, 12);
            m51705a(iArr2, 1, 5, 9, 13);
            m51705a(iArr2, 2, 6, 10, 14);
            m51705a(iArr2, 3, 7, 11, 15);
            m51705a(iArr2, 0, 5, 10, 15);
            m51705a(iArr2, 1, 6, 11, 12);
            m51705a(iArr2, 2, 7, 8, 13);
            m51705a(iArr2, 3, 4, 9, 14);
        }
    }

    /* renamed from: e */
    public static int[] m51709e(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
