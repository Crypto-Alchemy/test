package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okhttp3.internal.Util;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 k2\u00020\u0001:\u0004klmnB3\b\u0000\u0012\u0006\u00100\u001a\u00020\u001f\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b¢\u0006\u0004\bi\u0010jJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ$\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fJ\u0016\u0010$\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0006J\u000e\u0010%\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010(\u001a\u00020\u0010H\u0000¢\u0006\u0004\b&\u0010'J\u000e\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)J\u000f\u0010-\u001a\u00020\u0010H\u0000¢\u0006\u0004\b,\u0010'J\u000f\u0010/\u001a\u00020\u0010H\u0000¢\u0006\u0004\b.\u0010'R\u0017\u00100\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00105\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R*\u0010:\u001a\u00020)2\u0006\u00109\u001a\u00020)8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010@\u001a\u00020)2\u0006\u00109\u001a\u00020)8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R*\u0010C\u001a\u00020)2\u0006\u00109\u001a\u00020)8\u0006@@X\u000e¢\u0006\u0012\n\u0004\bC\u0010;\u001a\u0004\bD\u0010=\"\u0004\bE\u0010?R*\u0010F\u001a\u00020)2\u0006\u00109\u001a\u00020)8\u0006@@X\u000e¢\u0006\u0012\n\u0004\bF\u0010;\u001a\u0004\bG\u0010=\"\u0004\bH\u0010?R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\b0I8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010\u001e\u001a\u00060NR\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u0010O\u001a\u0004\bP\u0010QR\u001e\u0010S\u001a\u00060RR\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001e\u0010\u0014\u001a\u00060WR\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010X\u001a\u0004\bY\u0010ZR\u001e\u0010\u0015\u001a\u00060WR\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0015\u0010X\u001a\u0004\b[\u0010ZR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028@@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0011\u0010f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0011\u0010h\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bh\u0010g¨\u0006o"}, mo44877d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "Ljava/io/IOException;", "errorException", "", "closeInternal", "Lokhttp3/Headers;", "takeHeaders", "trailers", "", "Lokhttp3/internal/http2/Header;", "responseHeaders", "outFinished", "flushHeaders", "Lr37;", "writeHeaders", "enqueueTrailers", "Lqq6;", "readTimeout", "writeTimeout", "Lz56;", "getSource", "Ls36;", "getSink", "rstStatusCode", "close", "closeLater", "Lw40;", "source", "", "length", "receiveData", "headers", "inFinished", "receiveHeaders", "receiveRstStream", "cancelStreamIfNecessary$okhttp", "()V", "cancelStreamIfNecessary", "", "delta", "addBytesToWriteWindow", "checkOutNotClosed$okhttp", "checkOutNotClosed", "waitForIo$okhttp", "waitForIo", "id", "I", "getId", "()I", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Http2Connection;", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "<set-?>", "readBytesTotal", "J", "getReadBytesTotal", "()J", "setReadBytesTotal$okhttp", "(J)V", "readBytesAcknowledged", "getReadBytesAcknowledged", "setReadBytesAcknowledged$okhttp", "writeBytesTotal", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "Ljava/util/ArrayDeque;", "headersQueue", "Ljava/util/ArrayDeque;", "hasResponseHeaders", "Z", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getWriteTimeout$okhttp", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "(Lokhttp3/internal/http2/ErrorCode;)V", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "isOpen", "()Z", "isLocallyInitiated", "<init>", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Http2Stream.kt */
public final class Http2Stream {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;

    /* renamed from: id */
    private final int f43727id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout = new StreamTimeout(this);
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout = new StreamTimeout(this);

    @Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo44877d2 = {"Lokhttp3/internal/http2/Http2Stream$Companion;", "", "()V", "EMIT_BUFFER_SIZE", "", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: Http2Stream.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00138\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0015\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019¨\u0006,"}, mo44877d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lz56;", "", "read", "Lr37;", "updateConnectionFlowControl", "Lm40;", "sink", "byteCount", "Lw40;", "source", "receive$okhttp", "(Lw40;J)V", "receive", "Lqq6;", "timeout", "close", "maxByteCount", "J", "", "finished", "Z", "getFinished$okhttp", "()Z", "setFinished$okhttp", "(Z)V", "receiveBuffer", "Lm40;", "getReceiveBuffer", "()Lm40;", "readBuffer", "getReadBuffer", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "closed", "getClosed$okhttp", "setClosed$okhttp", "<init>", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Http2Stream.kt */
    public final class FramingSource implements z56 {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private final m40 readBuffer = new m40();
        private final m40 receiveBuffer = new m40();
        public final /* synthetic */ Http2Stream this$0;
        private Headers trailers;

        public FramingSource(Http2Stream http2Stream, long j, boolean z) {
            vx2.m53591g(http2Stream, "this$0");
            this.this$0 = http2Stream;
            this.maxByteCount = j;
            this.finished = z;
        }

        private final void updateConnectionFlowControl(long j) {
            Http2Stream http2Stream = this.this$0;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                this.this$0.getConnection().updateConnectionFlowControl$okhttp(j);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        public void close() throws IOException {
            long size;
            Http2Stream http2Stream = this.this$0;
            synchronized (http2Stream) {
                setClosed$okhttp(true);
                size = getReadBuffer().size();
                getReadBuffer().mo56045a();
                http2Stream.notifyAll();
                r37 r37 = r37.f33317a;
            }
            if (size > 0) {
                updateConnectionFlowControl(size);
            }
            this.this$0.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        public final m40 getReadBuffer() {
            return this.readBuffer;
        }

        public final m40 getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        /* JADX INFO: finally extract failed */
        public long read(m40 m40, long j) throws IOException {
            boolean z;
            long j2;
            boolean z2;
            m40 m402 = m40;
            long j3 = j;
            vx2.m53591g(m402, "sink");
            long j4 = 0;
            if (j3 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                while (true) {
                    Throwable th = null;
                    Http2Stream http2Stream = this.this$0;
                    synchronized (http2Stream) {
                        http2Stream.getReadTimeout$okhttp().enter();
                        try {
                            if (http2Stream.getErrorCode$okhttp() != null && (th = http2Stream.getErrorException$okhttp()) == null) {
                                ErrorCode errorCode$okhttp = http2Stream.getErrorCode$okhttp();
                                vx2.m53588d(errorCode$okhttp);
                                th = new StreamResetException(errorCode$okhttp);
                            }
                            if (!getClosed$okhttp()) {
                                if (getReadBuffer().size() > j4) {
                                    j2 = getReadBuffer().read(m402, Math.min(j3, getReadBuffer().size()));
                                    http2Stream.setReadBytesTotal$okhttp(http2Stream.getReadBytesTotal() + j2);
                                    long readBytesTotal = http2Stream.getReadBytesTotal() - http2Stream.getReadBytesAcknowledged();
                                    if (th == null && readBytesTotal >= ((long) (http2Stream.getConnection().getOkHttpSettings().getInitialWindowSize() / 2))) {
                                        http2Stream.getConnection().writeWindowUpdateLater$okhttp(http2Stream.getId(), readBytesTotal);
                                        http2Stream.setReadBytesAcknowledged$okhttp(http2Stream.getReadBytesTotal());
                                    }
                                } else if (getFinished$okhttp() || th != null) {
                                    j2 = -1;
                                } else {
                                    http2Stream.waitForIo$okhttp();
                                    j2 = -1;
                                    z2 = true;
                                    http2Stream.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                                    r37 r37 = r37.f33317a;
                                }
                                z2 = false;
                                http2Stream.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                                r37 r372 = r37.f33317a;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th2) {
                            http2Stream.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                            throw th2;
                        }
                    }
                    if (z2) {
                        j4 = 0;
                    } else if (j2 != -1) {
                        updateConnectionFlowControl(j2);
                        return j2;
                    } else if (th == null) {
                        return -1;
                    } else {
                        throw th;
                    }
                }
            } else {
                throw new IllegalArgumentException(vx2.m53598n("byteCount < 0: ", Long.valueOf(j)).toString());
            }
        }

        public final void receive$okhttp(w40 w40, long j) throws IOException {
            boolean finished$okhttp;
            boolean z;
            boolean z2;
            long j2;
            vx2.m53591g(w40, "source");
            Http2Stream http2Stream = this.this$0;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                while (j > 0) {
                    synchronized (this.this$0) {
                        finished$okhttp = getFinished$okhttp();
                        z = true;
                        if (getReadBuffer().size() + j > this.maxByteCount) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        r37 r37 = r37.f33317a;
                    }
                    if (z2) {
                        w40.skip(j);
                        this.this$0.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                        return;
                    } else if (finished$okhttp) {
                        w40.skip(j);
                        return;
                    } else {
                        long read = w40.read(this.receiveBuffer, j);
                        if (read != -1) {
                            j -= read;
                            Http2Stream http2Stream2 = this.this$0;
                            synchronized (http2Stream2) {
                                if (getClosed$okhttp()) {
                                    j2 = getReceiveBuffer().size();
                                    getReceiveBuffer().mo56045a();
                                } else {
                                    if (getReadBuffer().size() != 0) {
                                        z = false;
                                    }
                                    getReadBuffer().mo56029L0(getReceiveBuffer());
                                    if (z) {
                                        http2Stream2.notifyAll();
                                    }
                                    j2 = 0;
                                }
                            }
                            if (j2 > 0) {
                                updateConnectionFlowControl(j2);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        public qq6 timeout() {
            return this.this$0.getReadTimeout$okhttp();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\n"}, mo44877d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lzr;", "Lr37;", "timedOut", "Ljava/io/IOException;", "cause", "newTimeoutException", "exitAndThrowIfTimedOut", "<init>", "(Lokhttp3/internal/http2/Http2Stream;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Http2Stream.kt */
    public final class StreamTimeout extends C9710zr {
        public final /* synthetic */ Http2Stream this$0;

        public StreamTimeout(Http2Stream http2Stream) {
            vx2.m53591g(http2Stream, "this$0");
            this.this$0 = http2Stream;
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException((IOException) null);
            }
        }

        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void timedOut() {
            this.this$0.closeLater(ErrorCode.CANCEL);
            this.this$0.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        vx2.m53591g(http2Connection, "connection");
        this.f43727id = i;
        this.connection = http2Connection;
        this.writeBytesMaximum = (long) http2Connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(this, (long) http2Connection.getOkHttpSettings().getInitialWindowSize(), z2);
        this.sink = new FramingSink(this, z);
        if (headers != null) {
            if (!isLocallyInitiated()) {
                arrayDeque.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!isLocallyInitiated()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    private final boolean closeInternal(ErrorCode errorCode2, IOException iOException) {
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (getErrorCode$okhttp() != null) {
                    return false;
                }
                if (getSource$okhttp().getFinished$okhttp() && getSink$okhttp().getFinished()) {
                    return false;
                }
                setErrorCode$okhttp(errorCode2);
                setErrorException$okhttp(iOException);
                notifyAll();
                r37 r37 = r37.f33317a;
                this.connection.removeStream$okhttp(this.f43727id);
                return true;
            }
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void addBytesToWriteWindow(long j) {
        this.writeBytesMaximum += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean z;
        boolean isOpen;
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (getSource$okhttp().getFinished$okhttp() || !getSource$okhttp().getClosed$okhttp() || (!getSink$okhttp().getFinished() && !getSink$okhttp().getClosed())) {
                    z = false;
                } else {
                    z = true;
                }
                isOpen = isOpen();
                r37 r37 = r37.f33317a;
            }
            if (z) {
                close(ErrorCode.CANCEL, (IOException) null);
            } else if (!isOpen) {
                this.connection.removeStream$okhttp(this.f43727id);
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        } else if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        } else if (this.errorCode != null) {
            Throwable th = this.errorException;
            if (th == null) {
                ErrorCode errorCode2 = this.errorCode;
                vx2.m53588d(errorCode2);
                th = new StreamResetException(errorCode2);
            }
            throw th;
        }
    }

    public final void close(ErrorCode errorCode2, IOException iOException) throws IOException {
        vx2.m53591g(errorCode2, "rstStatusCode");
        if (closeInternal(errorCode2, iOException)) {
            this.connection.writeSynReset$okhttp(this.f43727id, errorCode2);
        }
    }

    public final void closeLater(ErrorCode errorCode2) {
        vx2.m53591g(errorCode2, "errorCode");
        if (closeInternal(errorCode2, (IOException) null)) {
            this.connection.writeSynResetLater$okhttp(this.f43727id, errorCode2);
        }
    }

    public final void enqueueTrailers(Headers headers) {
        vx2.m53591g(headers, "trailers");
        synchronized (this) {
            boolean z = true;
            if (!getSink$okhttp().getFinished()) {
                if (headers.size() == 0) {
                    z = false;
                }
                if (z) {
                    getSink$okhttp().setTrailers(headers);
                    r37 r37 = r37.f33317a;
                } else {
                    throw new IllegalArgumentException("trailers.size() == 0".toString());
                }
            } else {
                throw new IllegalStateException("already finished".toString());
            }
        }
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.f43727id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.s36 getSink() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.isLocallyInitiated()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            r37 r0 = p000.r37.f33317a     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            return r0
        L_0x0017:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.getSink():s36");
    }

    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    public final z56 getSource() {
        return this.source;
    }

    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        boolean z;
        if ((this.f43727id & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.connection.getClient$okhttp() == z) {
            return true;
        }
        return false;
    }

    public final synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        if ((this.source.getFinished$okhttp() || this.source.getClosed$okhttp()) && ((this.sink.getFinished() || this.sink.getClosed()) && this.hasResponseHeaders)) {
            return false;
        }
        return true;
    }

    public final qq6 readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(w40 w40, int i) throws IOException {
        vx2.m53591g(w40, "source");
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            this.source.receive$okhttp(w40, (long) i);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void receiveHeaders(okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            p000.vx2.m53591g(r3, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L_0x0037
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x0010
            goto L_0x0037
        L_0x0010:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0037:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch:{ all -> 0x006c }
            r1 = 1
            if (r0 == 0) goto L_0x0048
            if (r4 != 0) goto L_0x0040
            goto L_0x0048
        L_0x0040:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.getSource$okhttp()     // Catch:{ all -> 0x006c }
            r0.setTrailers(r3)     // Catch:{ all -> 0x006c }
            goto L_0x004f
        L_0x0048:
            r2.hasResponseHeaders = r1     // Catch:{ all -> 0x006c }
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x006c }
            r0.add(r3)     // Catch:{ all -> 0x006c }
        L_0x004f:
            if (r4 == 0) goto L_0x0058
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.getSource$okhttp()     // Catch:{ all -> 0x006c }
            r3.setFinished$okhttp(r1)     // Catch:{ all -> 0x006c }
        L_0x0058:
            boolean r3 = r2.isOpen()     // Catch:{ all -> 0x006c }
            r2.notifyAll()     // Catch:{ all -> 0x006c }
            r37 r4 = p000.r37.f33317a     // Catch:{ all -> 0x006c }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x006b
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.f43727id
            r3.removeStream$okhttp(r4)
        L_0x006b:
            return
        L_0x006c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.receiveHeaders(okhttp3.Headers, boolean):void");
    }

    public final synchronized void receiveRstStream(ErrorCode errorCode2) {
        vx2.m53591g(errorCode2, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode2;
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode2) {
        this.errorCode = errorCode2;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j) {
        this.readBytesAcknowledged = j;
    }

    public final void setReadBytesTotal$okhttp(long j) {
        this.readBytesTotal = j;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r2.readTimeout.exitAndThrowIfTimedOut();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.Headers takeHeaders() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch:{ all -> 0x004a }
            r0.enter()     // Catch:{ all -> 0x004a }
        L_0x0006:
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0016
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0016
            r2.waitForIo$okhttp()     // Catch:{ all -> 0x0043 }
            goto L_0x0006
        L_0x0016:
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch:{ all -> 0x004a }
            r0.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x004a }
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x004a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004a }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0034
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "headersQueue.removeFirst()"
            p000.vx2.m53590f(r0, r1)     // Catch:{ all -> 0x004a }
            okhttp3.Headers r0 = (okhttp3.Headers) r0     // Catch:{ all -> 0x004a }
            monitor-exit(r2)
            return r0
        L_0x0034:
            java.io.IOException r0 = r2.errorException     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0042
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x004a }
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode     // Catch:{ all -> 0x004a }
            p000.vx2.m53588d(r1)     // Catch:{ all -> 0x004a }
            r0.<init>(r1)     // Catch:{ all -> 0x004a }
        L_0x0042:
            throw r0     // Catch:{ all -> 0x004a }
        L_0x0043:
            r0 = move-exception
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r2.readTimeout     // Catch:{ all -> 0x004a }
            r1.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.takeHeaders():okhttp3.Headers");
    }

    public final synchronized Headers trailers() throws IOException {
        Headers trailers;
        if (this.source.getFinished$okhttp() && this.source.getReceiveBuffer().mo56024I0() && this.source.getReadBuffer().mo56024I0()) {
            trailers = this.source.getTrailers();
            if (trailers == null) {
                trailers = Util.EMPTY_HEADERS;
            }
        } else if (this.errorCode != null) {
            Throwable th = this.errorException;
            if (th == null) {
                ErrorCode errorCode2 = this.errorCode;
                vx2.m53588d(errorCode2);
                th = new StreamResetException(errorCode2);
            }
            throw th;
        } else {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        return trailers;
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(List<Header> list, boolean z, boolean z2) throws IOException {
        boolean z3;
        vx2.m53591g(list, "responseHeaders");
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            synchronized (this) {
                z3 = true;
                this.hasResponseHeaders = true;
                if (z) {
                    getSink$okhttp().setFinished(true);
                }
                r37 r37 = r37.f33317a;
            }
            if (!z2) {
                synchronized (this.connection) {
                    if (getConnection().getWriteBytesTotal() < getConnection().getWriteBytesMaximum()) {
                        z3 = false;
                    }
                }
                z2 = z3;
            }
            this.connection.writeHeaders$okhttp(this.f43727id, z, list);
            if (z2) {
                this.connection.flush();
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final qq6 writeTimeout() {
        return this.writeTimeout;
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u0006#"}, mo44877d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Ls36;", "", "outFinishedOnLastFrame", "Lr37;", "emitFrame", "Lm40;", "source", "", "byteCount", "write", "flush", "Lqq6;", "timeout", "close", "finished", "Z", "getFinished", "()Z", "setFinished", "(Z)V", "sendBuffer", "Lm40;", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "closed", "getClosed", "setClosed", "<init>", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Http2Stream.kt */
    public final class FramingSink implements s36 {
        private boolean closed;
        private boolean finished;
        private final m40 sendBuffer;
        private Headers trailers;

        public FramingSink(Http2Stream http2Stream, boolean z) {
            vx2.m53591g(http2Stream, "this$0");
            Http2Stream.this = http2Stream;
            this.finished = z;
            this.sendBuffer = new m40();
        }

        /* JADX INFO: finally extract failed */
        private final void emitFrame(boolean z) throws IOException {
            long min;
            boolean z2;
            boolean z3;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.getWriteTimeout$okhttp().enter();
                while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !getFinished() && !getClosed() && http2Stream.getErrorCode$okhttp() == null) {
                    try {
                        http2Stream.waitForIo$okhttp();
                    } catch (Throwable th) {
                        http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                min = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.size());
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                if (!z || min != this.sendBuffer.size()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                z3 = z2;
                r37 r37 = r37.f33317a;
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z3, this.sendBuffer, min);
            } finally {
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
            if (r10.this$0.getSink$okhttp().finished != false) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
            if (r10.sendBuffer.size() <= 0) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
            if (r10.trailers == null) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
            if (r4 == false) goto L_0x0096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
            if (r10.sendBuffer.size() <= 0) goto L_0x007d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
            emitFrame(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
            r0 = r10.this$0.getConnection();
            r2 = r10.this$0.getId();
            r4 = r10.trailers;
            p000.vx2.m53588d(r4);
            r0.writeHeaders$okhttp(r2, r1, okhttp3.internal.Util.toHeaderList(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
            if (r0 == false) goto L_0x00a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a0, code lost:
            if (r10.sendBuffer.size() <= 0) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
            emitFrame(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
            if (r1 == false) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a8, code lost:
            r10.this$0.getConnection().writeData(r10.this$0.getId(), true, (p000.m40) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bb, code lost:
            r0 = r10.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            setClosed(true);
            r1 = p000.r37.f33317a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c3, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c4, code lost:
            r10.this$0.getConnection().flush();
            r10.this$0.cancelStreamIfNecessary$okhttp();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d2, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r10 = this;
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L_0x0034
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L_0x000d
                goto L_0x0034
            L_0x000d:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x0034:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                boolean r1 = r10.getClosed()     // Catch:{ all -> 0x00d6 }
                if (r1 == 0) goto L_0x003f
                monitor-exit(r0)
                return
            L_0x003f:
                okhttp3.internal.http2.ErrorCode r1 = r0.getErrorCode$okhttp()     // Catch:{ all -> 0x00d6 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0049
                r1 = r3
                goto L_0x004a
            L_0x0049:
                r1 = r2
            L_0x004a:
                r37 r4 = p000.r37.f33317a     // Catch:{ all -> 0x00d6 }
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$FramingSink r0 = r0.getSink$okhttp()
                boolean r0 = r0.finished
                if (r0 != 0) goto L_0x00bb
                m40 r0 = r10.sendBuffer
                long r4 = r0.size()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0065
                r0 = r3
                goto L_0x0066
            L_0x0065:
                r0 = r2
            L_0x0066:
                okhttp3.Headers r4 = r10.trailers
                if (r4 == 0) goto L_0x006c
                r4 = r3
                goto L_0x006d
            L_0x006c:
                r4 = r2
            L_0x006d:
                if (r4 == 0) goto L_0x0096
            L_0x006f:
                m40 r0 = r10.sendBuffer
                long r4 = r0.size()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x007d
                r10.emitFrame(r2)
                goto L_0x006f
            L_0x007d:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                okhttp3.internal.http2.Http2Stream r2 = okhttp3.internal.http2.Http2Stream.this
                int r2 = r2.getId()
                okhttp3.Headers r4 = r10.trailers
                p000.vx2.m53588d(r4)
                java.util.List r4 = okhttp3.internal.Util.toHeaderList(r4)
                r0.writeHeaders$okhttp(r2, r1, r4)
                goto L_0x00bb
            L_0x0096:
                if (r0 == 0) goto L_0x00a6
            L_0x0098:
                m40 r0 = r10.sendBuffer
                long r0 = r0.size()
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x00bb
                r10.emitFrame(r3)
                goto L_0x0098
            L_0x00a6:
                if (r1 == 0) goto L_0x00bb
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r4 = r0.getConnection()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                int r5 = r0.getId()
                r6 = 1
                r7 = 0
                r8 = 0
                r4.writeData(r5, r6, r7, r8)
            L_0x00bb:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                r10.setClosed(r3)     // Catch:{ all -> 0x00d3 }
                r37 r1 = p000.r37.f33317a     // Catch:{ all -> 0x00d3 }
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                r0.cancelStreamIfNecessary$okhttp()
                return
            L_0x00d3:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00d6:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSink.close():void");
        }

        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                Http2Stream http2Stream2 = Http2Stream.this;
                synchronized (http2Stream2) {
                    http2Stream2.checkOutNotClosed$okhttp();
                    r37 r37 = r37.f33317a;
                }
                while (this.sendBuffer.size() > 0) {
                    emitFrame(false);
                    Http2Stream.this.getConnection().flush();
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        public qq6 timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        public void write(m40 m40, long j) throws IOException {
            vx2.m53591g(m40, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                this.sendBuffer.write(m40, j);
                while (this.sendBuffer.size() >= Http2Stream.EMIT_BUFFER_SIZE) {
                    emitFrame(false);
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FramingSink(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(Http2Stream.this, (i & 1) != 0 ? false : z);
        }
    }
}
