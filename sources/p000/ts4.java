package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okhttp3.internal.http2.Http2;

/* renamed from: ts4 */
/* compiled from: PooledByteStreams */
public class ts4 {

    /* renamed from: a */
    public final int f18223a;

    /* renamed from: b */
    public final j60 f18224b;

    public ts4(j60 j60) {
        this(j60, Http2.INITIAL_MAX_FRAME_SIZE);
    }

    /* renamed from: a */
    public long mo26535a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = (byte[]) this.f18224b.get(this.f18223a);
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f18223a);
                if (read == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += (long) read;
            } finally {
                this.f18224b.mo360a(bArr);
            }
        }
    }

    public ts4(j60 j60, int i) {
        au4.m10787b(Boolean.valueOf(i > 0));
        this.f18223a = i;
        this.f18224b = j60;
    }
}
