package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* renamed from: rp1 */
/* compiled from: Encoding */
public class rp1 {
    /* renamed from: a */
    public static int m26356a(int i) {
        return (((i + 8) - 1) & -8) / 8;
    }

    /* renamed from: b */
    public static byte[] m26357b(byte[] bArr) throws IOException {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    /* renamed from: c */
    public static RuntimeException m26358c(String str) {
        return new IllegalStateException(str);
    }

    /* renamed from: d */
    public static byte[] m26359d(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw m26358c("Not enough bytes to read: " + i);
            }
        }
        return bArr;
    }

    /* renamed from: e */
    public static byte[] m26360e(InputStream inputStream, int i, int i2) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = inputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } else {
                    throw m26358c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
            }
            if (i3 != i) {
                throw m26358c("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw m26358c("Inflater did not finish");
            }
        } catch (DataFormatException e) {
            throw m26358c(e.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    /* renamed from: f */
    public static String m26361f(InputStream inputStream, int i) throws IOException {
        return new String(m26359d(inputStream, i), StandardCharsets.UTF_8);
    }

    /* renamed from: g */
    public static long m26362g(InputStream inputStream, int i) throws IOException {
        byte[] d = m26359d(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (d[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* renamed from: h */
    public static int m26363h(InputStream inputStream) throws IOException {
        return (int) m26362g(inputStream, 2);
    }

    /* renamed from: i */
    public static long m26364i(InputStream inputStream) throws IOException {
        return m26362g(inputStream, 4);
    }

    /* renamed from: j */
    public static int m26365j(InputStream inputStream) throws IOException {
        return (int) m26362g(inputStream, 1);
    }

    /* renamed from: k */
    public static int m26366k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* renamed from: l */
    public static void m26367l(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    public static void m26368m(OutputStream outputStream, byte[] bArr) throws IOException {
        m26372q(outputStream, (long) bArr.length);
        byte[] b = m26357b(bArr);
        m26372q(outputStream, (long) b.length);
        outputStream.write(b);
    }

    /* renamed from: n */
    public static void m26369n(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: o */
    public static void m26370o(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((j >> (i2 * 8)) & 255));
        }
        outputStream.write(bArr);
    }

    /* renamed from: p */
    public static void m26371p(OutputStream outputStream, int i) throws IOException {
        m26370o(outputStream, (long) i, 2);
    }

    /* renamed from: q */
    public static void m26372q(OutputStream outputStream, long j) throws IOException {
        m26370o(outputStream, j, 4);
    }

    /* renamed from: r */
    public static void m26373r(OutputStream outputStream, int i) throws IOException {
        m26370o(outputStream, (long) i, 1);
    }
}
