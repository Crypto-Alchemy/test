package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: b49 */
public final class b49 {
    /* renamed from: a */
    public static int m32350a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: b */
    public static long m32351b(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    /* renamed from: c */
    public static long m32352c(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length < 0 || length > bArr2.length) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("Out of bound index with offput: 0 and length: ");
            sb.append(length);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i = 37;
        char c = 0;
        if (length <= 32) {
            if (length > 16) {
                long j = ((long) (length << 1)) - 7286425919675154353L;
                long e = m32354e(bArr2, 0) * -5435081209227447693L;
                long e2 = m32354e(bArr2, 8);
                int i2 = length + 0;
                long e3 = m32354e(bArr2, i2 - 8) * j;
                return m32351b(Long.rotateRight(e + e2, 43) + Long.rotateRight(e3, 30) + (m32354e(bArr2, i2 - 16) * -7286425919675154353L), e + Long.rotateRight(e2 - 7286425919675154353L, 18) + e3, j);
            } else if (length >= 8) {
                long j2 = ((long) (length << 1)) - 7286425919675154353L;
                long e4 = m32354e(bArr2, 0) - 7286425919675154353L;
                long e5 = m32354e(bArr2, (length + 0) - 8);
                return m32351b((Long.rotateRight(e5, 37) * j2) + e4, (Long.rotateRight(e4, 25) + e5) * j2, j2);
            } else if (length >= 4) {
                return m32351b(((long) length) + ((((long) m32350a(bArr2, 0)) & 4294967295L) << 3), ((long) m32350a(bArr2, (length + 0) - 4)) & 4294967295L, ((long) (length << 1)) - 7286425919675154353L);
            } else if (length <= 0) {
                return -7286425919675154353L;
            } else {
                long j3 = (((long) ((bArr2[0] & 255) + ((bArr2[(length >> 1) + 0] & 255) << 8))) * -7286425919675154353L) ^ (((long) (length + ((bArr2[(length - 1) + 0] & 255) << 2))) * -4348849565147123417L);
                return (j3 ^ (j3 >>> 47)) * -7286425919675154353L;
            }
        } else if (length <= 64) {
            long j4 = ((long) (length << 1)) - 7286425919675154353L;
            long e6 = m32354e(bArr2, 0) * -7286425919675154353L;
            long e7 = m32354e(bArr2, 8);
            int i3 = length + 0;
            long e8 = m32354e(bArr2, i3 - 8) * j4;
            long rotateRight = Long.rotateRight(e6 + e7, 43) + Long.rotateRight(e8, 30) + (m32354e(bArr2, i3 - 16) * -7286425919675154353L);
            long j5 = j4;
            long b = m32351b(rotateRight, Long.rotateRight(-7286425919675154353L + e7, 18) + e6 + e8, j5);
            byte[] bArr3 = bArr;
            long e9 = m32354e(bArr3, 16) * j4;
            long e10 = m32354e(bArr3, 24);
            long j6 = e6;
            long e11 = (rotateRight + m32354e(bArr3, i3 - 32)) * j4;
            return m32351b(Long.rotateRight(e9 + e10, 43) + Long.rotateRight(e11, 30) + ((b + m32354e(bArr3, i3 - 24)) * j4), e9 + Long.rotateRight(e10 + j6, 18) + e11, j5);
        } else {
            long j7 = 2480279821605975764L;
            long j8 = 1390051526045402406L;
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long e12 = m32354e(bArr2, 0) + 95310865018149119L;
            int i4 = length - 1;
            int i5 = ((i4 / 64) << 6) + 0;
            int i6 = i4 & 63;
            int i7 = (i5 + i6) - 63;
            int i8 = 0;
            while (true) {
                long rotateRight2 = (Long.rotateRight(((e12 + j7) + jArr[c]) + m32354e(bArr2, i8 + 8), i) * -5435081209227447693L) ^ jArr2[1];
                long rotateRight3 = (Long.rotateRight(j7 + jArr[1] + m32354e(bArr2, i8 + 48), 42) * -5435081209227447693L) + jArr[0] + m32354e(bArr2, i8 + 40);
                long rotateRight4 = Long.rotateRight(j8 + jArr2[0], 33) * -5435081209227447693L;
                int i9 = i6;
                int i10 = i5;
                m32353d(bArr, i8, jArr[1] * -5435081209227447693L, rotateRight2 + jArr2[0], jArr);
                m32353d(bArr, i8 + 32, rotateRight4 + jArr2[1], rotateRight3 + m32354e(bArr2, i8 + 16), jArr2);
                int i11 = i8 + 64;
                if (i11 == i10) {
                    long j9 = ((255 & rotateRight2) << 1) - 5435081209227447693L;
                    long j10 = jArr2[0] + ((long) i9);
                    jArr2[0] = j10;
                    long j11 = jArr[0] + j10;
                    jArr[0] = j11;
                    jArr2[0] = jArr2[0] + j11;
                    long rotateRight5 = (Long.rotateRight(((rotateRight4 + rotateRight3) + jArr[0]) + m32354e(bArr2, i7 + 8), 37) * j9) ^ (jArr2[1] * 9);
                    long rotateRight6 = (Long.rotateRight(rotateRight3 + jArr[1] + m32354e(bArr2, i7 + 48), 42) * j9) + (jArr[0] * 9) + m32354e(bArr2, i7 + 40);
                    long rotateRight7 = Long.rotateRight(rotateRight2 + jArr2[0], 33) * j9;
                    m32353d(bArr, i7, jArr[1] * j9, rotateRight5 + jArr2[0], jArr);
                    m32353d(bArr, i7 + 32, jArr2[1] + rotateRight7, m32354e(bArr2, i7 + 16) + rotateRight6, jArr2);
                    long j12 = j9;
                    return m32351b(m32351b(jArr[0], jArr2[0], j12) + (((rotateRight6 >>> 47) ^ rotateRight6) * -4348849565147123417L) + rotateRight5, m32351b(jArr[1], jArr2[1], j12) + rotateRight7, j12);
                }
                i8 = i11;
                i5 = i10;
                i6 = i9;
                j8 = rotateRight2;
                e12 = rotateRight4;
                i = 37;
                c = 0;
                j7 = rotateRight3;
            }
        }
    }

    /* renamed from: d */
    public static void m32353d(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long e = m32354e(bArr, i);
        long e2 = m32354e(bArr, i + 8);
        long e3 = m32354e(bArr, i + 16);
        long e4 = m32354e(bArr, i + 24);
        long j3 = j + e;
        long j4 = e2 + j3 + e3;
        jArr[0] = j4 + e4;
        jArr[1] = Long.rotateRight(j2 + j3 + e4, 21) + Long.rotateRight(j4, 44) + j3;
    }

    /* renamed from: e */
    public static long m32354e(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }
}
