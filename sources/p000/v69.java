package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: v69 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class v69 {

    /* renamed from: a */
    public static final OutputStream f34863a = new b19();

    /* renamed from: a */
    public static byte[] m53292a(InputStream inputStream) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i = 8192;
        int i2 = 0;
        while (i2 < 2147483639) {
            int min = Math.min(i, 2147483639 - i2);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return m53294c(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            long j = (long) i;
            long j2 = j + j;
            if (j2 > 2147483647L) {
                i = Integer.MAX_VALUE;
            } else if (j2 < -2147483648L) {
                i = Integer.MIN_VALUE;
            } else {
                i = (int) j2;
            }
        }
        if (inputStream.read() == -1) {
            return m53294c(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: b */
    public static InputStream m53293b(InputStream inputStream, long j) {
        return new c49(inputStream, 1048577);
    }

    /* renamed from: c */
    public static byte[] m53294c(Queue<byte[]> queue, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i2, remove.length);
            System.arraycopy(remove, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }
}
