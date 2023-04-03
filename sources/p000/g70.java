package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: g70 */
/* compiled from: Bytes */
public final class g70 {
    /* renamed from: a */
    public static byte[] m44636a(byte[]... bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (i2 <= Integer.MAX_VALUE - bArr2.length) {
                i2 += bArr2.length;
                i++;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i3, bArr4.length);
            i3 += bArr4.length;
        }
        return bArr3;
    }

    /* renamed from: b */
    public static final boolean m44637b(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        byte b = 0;
        for (int i = 0; i < bArr.length; i++) {
            b |= bArr[i] ^ bArr2[i];
        }
        if (b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final void m44638c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    /* renamed from: d */
    public static final byte[] m44639d(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i3 < 0 || bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    /* renamed from: e */
    public static final byte[] m44640e(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return m44639d(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    /* renamed from: f */
    public static final byte[] m44641f(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= bArr2.length) {
            int length = bArr.length - bArr2.length;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            for (int i = 0; i < bArr2.length; i++) {
                int i2 = length + i;
                copyOf[i2] = (byte) (copyOf[i2] ^ bArr2[i]);
            }
            return copyOf;
        }
        throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
    }
}
