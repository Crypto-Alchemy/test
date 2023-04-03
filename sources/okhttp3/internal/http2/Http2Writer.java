package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 @2\u00020\u0001:\u0001@B\u0017\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u00020\u0016¢\u0006\u0004\b>\u0010?J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ$\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0002J(\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J(\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\tJ\u001e\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002J\u001e\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$J\u0016\u0010(\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0004J&\u0010+\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002J\b\u0010,\u001a\u00020\u0006H\u0016J$\u0010.\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u0014\u00100\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00103R\u0017\u0010:\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006A"}, mo44877d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "", "streamId", "", "byteCount", "Lr37;", "writeContinuationFrames", "connectionPreface", "Lokhttp3/internal/http2/Settings;", "peerSettings", "applyAndAckSettings", "promisedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "pushPromise", "flush", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "maxDataLength", "", "outFinished", "Lm40;", "source", "data", "flags", "buffer", "dataFrame", "settings", "ack", "payload1", "payload2", "ping", "lastGoodStreamId", "", "debugData", "goAway", "windowSizeIncrement", "windowUpdate", "length", "type", "frameHeader", "close", "headerBlock", "headers", "Lv40;", "sink", "Lv40;", "client", "Z", "hpackBuffer", "Lm40;", "maxFrameSize", "I", "closed", "Lokhttp3/internal/http2/Hpack$Writer;", "hpackWriter", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "<init>", "(Lv40;Z)V", "Companion", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Http2Writer.kt */
public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final m40 hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize = Http2.INITIAL_MAX_FRAME_SIZE;
    private final v40 sink;

    @Metadata(mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo44877d2 = {"Lokhttp3/internal/http2/Http2Writer$Companion;", "", "()V", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: Http2Writer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Http2Writer(v40 v40, boolean z) {
        vx2.m53591g(v40, "sink");
        this.sink = v40;
        this.client = z;
        m40 m40 = new m40();
        this.hpackBuffer = m40;
        this.hpackWriter = new Hpack.Writer(0, false, m40, 3, (DefaultConstructorMarker) null);
    }

    private final void writeContinuationFrames(int i, long j) throws IOException {
        int i2;
        while (j > 0) {
            long min = Math.min((long) this.maxFrameSize, j);
            j -= min;
            int i3 = (int) min;
            if (j == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            frameHeader(i, i3, 9, i2);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final synchronized void applyAndAckSettings(Settings settings) throws IOException {
        vx2.m53591g(settings, "peerSettings");
        if (!this.closed) {
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        } else if (this.client) {
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format(vx2.m53598n(">> CONNECTION ", Http2.CONNECTION_PREFACE.hex()), new Object[0]));
            }
            this.sink.mo56054e1(Http2.CONNECTION_PREFACE);
            this.sink.flush();
        }
    }

    public final synchronized void data(boolean z, int i, m40 m40, int i2) throws IOException {
        if (!this.closed) {
            dataFrame(i, z ? 1 : 0, m40, i2);
        } else {
            throw new IOException("closed");
        }
    }

    public final void dataFrame(int i, int i2, m40 m40, int i3) throws IOException {
        frameHeader(i, i3, 0, i2);
        if (i3 > 0) {
            v40 v40 = this.sink;
            vx2.m53588d(m40);
            v40.write(m40, (long) i3);
        }
    }

    public final synchronized void flush() throws IOException {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void frameHeader(int i, int i2, int i3, int i4) throws IOException {
        boolean z;
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.INSTANCE.frameLog(false, i, i2, i3, i4));
        }
        boolean z2 = true;
        if (i2 <= this.maxFrameSize) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((Integer.MIN_VALUE & i) != 0) {
                z2 = false;
            }
            if (z2) {
                Util.writeMedium(this.sink, i2);
                this.sink.writeByte(i3 & 255);
                this.sink.writeByte(i4 & 255);
                this.sink.writeInt(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(vx2.m53598n("reserved bit set: ", Integer.valueOf(i)).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i2).toString());
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        boolean z;
        vx2.m53591g(errorCode, "errorCode");
        vx2.m53591g(bArr, "debugData");
        if (!this.closed) {
            boolean z2 = false;
            if (errorCode.getHttpCode() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                frameHeader(0, bArr.length + 8, 7, 0);
                this.sink.writeInt(i);
                this.sink.writeInt(errorCode.getHttpCode());
                if (bArr.length == 0) {
                    z2 = true;
                }
                if (!z2) {
                    this.sink.write(bArr);
                }
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void headers(boolean z, int i, List<Header> list) throws IOException {
        int i2;
        vx2.m53591g(list, "headerBlock");
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            long min = Math.min((long) this.maxFrameSize, size);
            int i3 = (size > min ? 1 : (size == min ? 0 : -1));
            if (i3 == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (z) {
                i2 |= 1;
            }
            frameHeader(i, (int) min, 1, i2);
            this.sink.write(this.hpackBuffer, min);
            if (i3 > 0) {
                writeContinuationFrames(i, size - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z, int i, int i2) throws IOException {
        int i3;
        if (!this.closed) {
            if (z) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            frameHeader(0, 8, 6, i3);
            this.sink.writeInt(i);
            this.sink.writeInt(i2);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void pushPromise(int i, int i2, List<Header> list) throws IOException {
        int i3;
        vx2.m53591g(list, "requestHeaders");
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int min = (int) Math.min(((long) this.maxFrameSize) - 4, size);
            int i4 = min + 4;
            long j = (long) min;
            int i5 = (size > j ? 1 : (size == j ? 0 : -1));
            if (i5 == 0) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            frameHeader(i, i4, 5, i3);
            this.sink.writeInt(i2 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j);
            if (i5 > 0) {
                writeContinuationFrames(i, size - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void rstStream(int i, ErrorCode errorCode) throws IOException {
        boolean z;
        vx2.m53591g(errorCode, "errorCode");
        if (!this.closed) {
            if (errorCode.getHttpCode() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                frameHeader(i, 4, 3, 0);
                this.sink.writeInt(errorCode.getHttpCode());
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void settings(Settings settings) throws IOException {
        int i;
        vx2.m53591g(settings, "settings");
        if (!this.closed) {
            int i2 = 0;
            frameHeader(0, settings.size() * 6, 4, 0);
            while (i2 < 10) {
                int i3 = i2 + 1;
                if (settings.isSet(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else if (i2 != 7) {
                        i = i2;
                    } else {
                        i = 4;
                    }
                    this.sink.writeShort(i);
                    this.sink.writeInt(settings.get(i2));
                }
                i2 = i3;
            }
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void windowUpdate(int i, long j) throws IOException {
        boolean z;
        if (!this.closed) {
            if (j == 0 || j > 2147483647L) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                frameHeader(i, 4, 8, 0);
                this.sink.writeInt((int) j);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException(vx2.m53598n("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j)).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }
}
