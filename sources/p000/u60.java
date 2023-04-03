package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: u60 */
/* compiled from: ByteBufferWriter */
public final class u60 {

    /* renamed from: a */
    public static final ThreadLocal<SoftReference<byte[]>> f34469a = new ThreadLocal<>();

    /* renamed from: b */
    public static final Class<?> f34470b;

    /* renamed from: c */
    public static final long f34471c;

    static {
        Class<?> e = m52642e("java.io.FileOutputStream");
        f34470b = e;
        f34471c = m52639b(e);
    }

    /* renamed from: a */
    public static byte[] m52638a() {
        SoftReference softReference = f34469a.get();
        if (softReference == null) {
            return null;
        }
        return (byte[]) softReference.get();
    }

    /* renamed from: b */
    public static long m52639b(Class<?> cls) {
        if (cls == null) {
            return -1;
        }
        try {
            if (p47.m49689I()) {
                return p47.m49692L(cls.getDeclaredField("channel"));
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static byte[] m52640c(int i) {
        int max = Math.max(i, RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE);
        byte[] a = m52638a();
        if (a == null || m52641d(max, a.length)) {
            a = new byte[max];
            if (max <= 16384) {
                m52643f(a);
            }
        }
        return a;
    }

    /* renamed from: d */
    public static boolean m52641d(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    /* renamed from: e */
    public static Class<?> m52642e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static void m52643f(byte[] bArr) {
        f34469a.set(new SoftReference(bArr));
    }

    /* renamed from: g */
    public static void m52644g(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!m52645h(byteBuffer, outputStream)) {
                byte[] c = m52640c(byteBuffer.remaining());
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
    public static boolean m52645h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        long j = f34471c;
        if (j < 0 || !f34470b.isInstance(outputStream)) {
            return false;
        }
        WritableByteChannel writableByteChannel = null;
        try {
            writableByteChannel = (WritableByteChannel) p47.m49687G(outputStream, j);
        } catch (ClassCastException unused) {
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }
}
