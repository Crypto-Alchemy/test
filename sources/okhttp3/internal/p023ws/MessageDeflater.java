package okhttp3.internal.p023ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\bH\u0016R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo44877d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "Lm40;", "Lokio/ByteString;", "suffix", "", "endsWith", "buffer", "Lr37;", "deflate", "close", "noContextTakeover", "Z", "deflatedBytes", "Lm40;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Lhb1;", "deflaterSink", "Lhb1;", "<init>", "(Z)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: okhttp3.internal.ws.MessageDeflater */
/* compiled from: MessageDeflater.kt */
public final class MessageDeflater implements Closeable {
    private final m40 deflatedBytes;
    private final Deflater deflater;
    private final hb1 deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        m40 m40 = new m40();
        this.deflatedBytes = m40;
        Deflater deflater2 = new Deflater(-1, true);
        this.deflater = deflater2;
        this.deflaterSink = new hb1((s36) m40, deflater2);
    }

    private final boolean endsWith(m40 m40, ByteString byteString) {
        return m40.mo56046a0(m40.size() - ((long) byteString.size()), byteString);
    }

    public void close() throws IOException {
        this.deflaterSink.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        p000.lh0.m47807a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void deflate(p000.m40 r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "buffer"
            p000.vx2.m53591g(r7, r0)
            m40 r0 = r6.deflatedBytes
            long r0 = r0.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0015
            r0 = r1
            goto L_0x0016
        L_0x0015:
            r0 = r2
        L_0x0016:
            if (r0 == 0) goto L_0x0068
            boolean r0 = r6.noContextTakeover
            if (r0 == 0) goto L_0x0021
            java.util.zip.Deflater r0 = r6.deflater
            r0.reset()
        L_0x0021:
            hb1 r0 = r6.deflaterSink
            long r3 = r7.size()
            r0.write(r7, r3)
            hb1 r0 = r6.deflaterSink
            r0.flush()
            m40 r0 = r6.deflatedBytes
            okio.ByteString r3 = okhttp3.internal.p023ws.MessageDeflaterKt.EMPTY_DEFLATE_BLOCK
            boolean r0 = r6.endsWith(r0, r3)
            if (r0 == 0) goto L_0x0059
            m40 r0 = r6.deflatedBytes
            long r2 = r0.size()
            r0 = 4
            long r4 = (long) r0
            long r2 = r2 - r4
            m40 r0 = r6.deflatedBytes
            r4 = 0
            m40$c r0 = p000.m40.m64075y(r0, r4, r1, r4)
            r0.mo56119c(r2)     // Catch:{ all -> 0x0052 }
            p000.lh0.m47807a(r0, r4)
            goto L_0x005e
        L_0x0052:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            p000.lh0.m47807a(r0, r7)
            throw r1
        L_0x0059:
            m40 r0 = r6.deflatedBytes
            r0.writeByte(r2)
        L_0x005e:
            m40 r0 = r6.deflatedBytes
            long r1 = r0.size()
            r7.write(r0, r1)
            return
        L_0x0068:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p023ws.MessageDeflater.deflate(m40):void");
    }
}
