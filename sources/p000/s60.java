package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.http2.Http2;

/* renamed from: s60 */
/* compiled from: ByteBufferUtil */
public final class s60 {

    /* renamed from: a */
    public static final AtomicReference<byte[]> f17474a = new AtomicReference<>();

    /* renamed from: s60$b */
    /* compiled from: ByteBufferUtil */
    public static final class C3245b {

        /* renamed from: a */
        public final int f17477a;

        /* renamed from: b */
        public final int f17478b;

        /* renamed from: c */
        public final byte[] f17479c;

        public C3245b(byte[] bArr, int i, int i2) {
            this.f17479c = bArr;
            this.f17477a = i;
            this.f17478b = i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.nio.channels.spi.AbstractInterruptibleChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|9|10|11|12|13) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047 A[SYNTHETIC, Splitter:B:24:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c A[SYNTHETIC, Splitter:B:28:0x004c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m26653a(java.io.File r8) throws java.io.IOException {
        /*
            r0 = 0
            long r5 = r8.length()     // Catch:{ all -> 0x0043 }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x003b
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0033
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "r"
            r7.<init>(r8, r1)     // Catch:{ all -> 0x0043 }
            java.nio.channels.FileChannel r0 = r7.getChannel()     // Catch:{ all -> 0x0031 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0031 }
            r3 = 0
            r1 = r0
            java.nio.MappedByteBuffer r8 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0031 }
            java.nio.MappedByteBuffer r8 = r8.load()     // Catch:{ all -> 0x0031 }
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r7.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            return r8
        L_0x0031:
            r8 = move-exception
            goto L_0x0045
        L_0x0033:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "File unsuitable for memory mapping"
            r8.<init>(r1)     // Catch:{ all -> 0x0043 }
            throw r8     // Catch:{ all -> 0x0043 }
        L_0x003b:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "File too large to map into memory"
            r8.<init>(r1)     // Catch:{ all -> 0x0043 }
            throw r8     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r8 = move-exception
            r7 = r0
        L_0x0045:
            if (r0 == 0) goto L_0x004a
            r0.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            if (r7 == 0) goto L_0x004f
            r7.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s60.m26653a(java.io.File):java.nio.ByteBuffer");
    }

    /* renamed from: b */
    public static ByteBuffer m26654b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        byte[] andSet = f17474a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                f17474a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return m26656d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
        }
    }

    /* renamed from: c */
    public static C3245b m26655c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new C3245b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* renamed from: d */
    public static ByteBuffer m26656d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* renamed from: e */
    public static byte[] m26657e(ByteBuffer byteBuffer) {
        C3245b c = m26655c(byteBuffer);
        if (c != null && c.f17477a == 0 && c.f17478b == c.f17479c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        m26656d(asReadOnlyBuffer);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:3|4|5|6|7|8|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[SYNTHETIC, Splitter:B:14:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e A[SYNTHETIC, Splitter:B:18:0x002e] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m26658f(java.nio.ByteBuffer r3, java.io.File r4) throws java.io.IOException {
        /*
            m26656d(r3)
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = "rw"
            r1.<init>(r4, r2)     // Catch:{ all -> 0x0025 }
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch:{ all -> 0x0023 }
            r0.write(r3)     // Catch:{ all -> 0x0023 }
            r3 = 0
            r0.force(r3)     // Catch:{ all -> 0x0023 }
            r0.close()     // Catch:{ all -> 0x0023 }
            r1.close()     // Catch:{ all -> 0x0023 }
            r0.close()     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            r1.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            return
        L_0x0023:
            r3 = move-exception
            goto L_0x0027
        L_0x0025:
            r3 = move-exception
            r1 = r0
        L_0x0027:
            if (r0 == 0) goto L_0x002c
            r0.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            if (r1 == 0) goto L_0x0031
            r1.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s60.m26658f(java.nio.ByteBuffer, java.io.File):void");
    }

    /* renamed from: g */
    public static InputStream m26659g(ByteBuffer byteBuffer) {
        return new C3244a(byteBuffer);
    }

    /* renamed from: s60$a */
    /* compiled from: ByteBufferUtil */
    public static class C3244a extends InputStream {

        /* renamed from: a */
        public final ByteBuffer f17475a;

        /* renamed from: d */
        public int f17476d = -1;

        public C3244a(ByteBuffer byteBuffer) {
            this.f17475a = byteBuffer;
        }

        public int available() {
            return this.f17475a.remaining();
        }

        public synchronized void mark(int i) {
            this.f17476d = this.f17475a.position();
        }

        public boolean markSupported() {
            return true;
        }

        public int read() {
            if (!this.f17475a.hasRemaining()) {
                return -1;
            }
            return this.f17475a.get() & 255;
        }

        public synchronized void reset() throws IOException {
            int i = this.f17476d;
            if (i != -1) {
                this.f17475a.position(i);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        public long skip(long j) {
            if (!this.f17475a.hasRemaining()) {
                return -1;
            }
            long min = Math.min(j, (long) available());
            ByteBuffer byteBuffer = this.f17475a;
            byteBuffer.position((int) (((long) byteBuffer.position()) + min));
            return min;
        }

        public int read(byte[] bArr, int i, int i2) {
            if (!this.f17475a.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, available());
            this.f17475a.get(bArr, i, min);
            return min;
        }
    }
}
