package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ya6 */
public final class ya6 {

    /* renamed from: a */
    public static int f46147a = 4096;

    /* renamed from: a */
    public static void m74320a(InputStream inputStream, OutputStream outputStream) throws IOException {
        m74321b(inputStream, outputStream, f46147a);
    }

    /* renamed from: b */
    public static void m74321b(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        while (true) {
            int read = inputStream.read(bArr, 0, i);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public static byte[] m74322c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m74320a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: d */
    public static int m74323d(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read < 0) {
                break;
            }
            i3 += read;
        }
        return i3;
    }
}
