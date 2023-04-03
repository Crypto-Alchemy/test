package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: a70 */
/* compiled from: ByteStreams */
public final class a70 {
    /* renamed from: a */
    public static long m85a(InputStream inputStream, OutputStream outputStream) throws IOException {
        au4.m10792g(inputStream);
        au4.m10792g(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: b */
    public static int m86b(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        au4.m10792g(inputStream);
        au4.m10792g(bArr);
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }
}
