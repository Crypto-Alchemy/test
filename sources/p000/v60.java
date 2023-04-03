package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: v60 */
/* compiled from: ByteBufferWriter */
public final class v60 {

    /* renamed from: a */
    public static final ThreadLocal<SoftReference<byte[]>> f34852a = new ThreadLocal<>();

    /* renamed from: b */
    public static final Class<?> f34853b;

    /* renamed from: c */
    public static final long f34854c;

    static {
        Class<?> e = m53284e("java.io.FileOutputStream");
        f34853b = e;
        f34854c = m53281b(e);
    }

    /* renamed from: a */
    public static byte[] m53280a() {
        SoftReference softReference = f34852a.get();
        if (softReference == null) {
            return null;
        }
        return (byte[]) softReference.get();
    }

    /* renamed from: b */
    public static long m53281b(Class<?> cls) {
        if (cls == null) {
            return -1;
        }
        try {
            if (q47.m50236I()) {
                return q47.m50239L(cls.getDeclaredField("channel"));
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static byte[] m53282c(int i) {
        int max = Math.max(i, RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE);
        byte[] a = m53280a();
        if (a == null || m53283d(max, a.length)) {
            a = new byte[max];
            if (max <= 16384) {
                m53285f(a);
            }
        }
        return a;
    }

    /* renamed from: d */
    public static boolean m53283d(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    /* renamed from: e */
    public static Class<?> m53284e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static void m53285f(byte[] bArr) {
        f34852a.set(new SoftReference(bArr));
    }

    /* renamed from: g */
    public static void m53286g(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!m53287h(byteBuffer, outputStream)) {
                byte[] c = m53282c(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), c.length);
                    byteBuffer.get(c, 0, min);
                    outputStream.write(c, 0, min);
                }
            }
        } finally {
            byteBuffer.position(position);
        }
    }

    /* renamed from: h */
    public static boolean m53287h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        long j = f34854c;
        if (j < 0 || !f34853b.isInstance(outputStream)) {
            return false;
        }
        WritableByteChannel writableByteChannel = null;
        try {
            writableByteChannel = (WritableByteChannel) q47.m50234G(outputStream, j);
        } catch (ClassCastException unused) {
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }
}
