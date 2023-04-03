package okhttp3.internal.http1;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 D2\u00020\u0001:\u0007EFGDHIJB)\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\bB\u0010CJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\u0016\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 J\u0012\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020#H\u0016J\u000e\u0010'\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017R\u0016\u0010)\u001a\u0004\u0018\u00010(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010<R\u0018\u0010=\u001a\u00020#*\u00020\u00178BX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0018\u0010=\u001a\u00020#*\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010?R\u0011\u0010@\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006K"}, mo44877d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Ls36;", "newChunkedSink", "newKnownLengthSink", "", "length", "Lz56;", "newFixedLengthSource", "Lokhttp3/HttpUrl;", "url", "newChunkedSource", "newUnknownLengthSource", "Ls82;", "timeout", "Lr37;", "detachTimeout", "Lokhttp3/Request;", "request", "contentLength", "createRequestBody", "cancel", "writeRequestHeaders", "Lokhttp3/Response;", "response", "reportedContentLength", "openResponseBodySource", "Lokhttp3/Headers;", "trailers", "flushRequest", "finishRequest", "headers", "", "requestLine", "writeRequest", "", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "skipConnectBody", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/OkHttpClient;", "Lokhttp3/internal/connection/RealConnection;", "connection", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "Lw40;", "source", "Lw40;", "Lv40;", "sink", "Lv40;", "", "state", "I", "Lokhttp3/internal/http1/HeadersReader;", "headersReader", "Lokhttp3/internal/http1/HeadersReader;", "Lokhttp3/Headers;", "isChunked", "(Lokhttp3/Response;)Z", "(Lokhttp3/Request;)Z", "isClosed", "()Z", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lw40;Lv40;)V", "Companion", "AbstractSource", "ChunkedSink", "ChunkedSource", "FixedLengthSource", "KnownLengthSink", "UnknownLengthSource", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Http1ExchangeCodec.kt */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    /* access modifiers changed from: private */
    public final OkHttpClient client;
    private final RealConnection connection;
    /* access modifiers changed from: private */
    public final HeadersReader headersReader;
    /* access modifiers changed from: private */
    public final v40 sink;
    /* access modifiers changed from: private */
    public final w40 source;
    /* access modifiers changed from: private */
    public int state;
    /* access modifiers changed from: private */
    public Headers trailers;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\tR\u001a\u0010\u0003\u001a\u00020\u000b8\u0004X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo44877d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lz56;", "Lqq6;", "timeout", "Lm40;", "sink", "", "byteCount", "read", "Lr37;", "responseBodyComplete", "Ls82;", "Ls82;", "getTimeout", "()Ls82;", "", "closed", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Http1ExchangeCodec.kt */
    public abstract class AbstractSource implements z56 {
        private boolean closed;
        public final /* synthetic */ Http1ExchangeCodec this$0;
        private final s82 timeout;

        public AbstractSource(Http1ExchangeCodec http1ExchangeCodec) {
            vx2.m53591g(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
            this.timeout = new s82(http1ExchangeCodec.source.timeout());
        }

        public abstract /* synthetic */ void close() throws IOException;

        public final boolean getClosed() {
            return this.closed;
        }

        public final s82 getTimeout() {
            return this.timeout;
        }

        public long read(m40 m40, long j) {
            vx2.m53591g(m40, "sink");
            try {
                return this.this$0.source.read(m40, j);
            } catch (IOException e) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e;
            }
        }

        public final void responseBodyComplete() {
            if (this.this$0.state != 6) {
                if (this.this$0.state == 5) {
                    this.this$0.detachTimeout(this.timeout);
                    this.this$0.state = 6;
                    return;
                }
                throw new IllegalStateException(vx2.m53598n("state: ", Integer.valueOf(this.this$0.state)));
            }
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public qq6 timeout() {
            return this.timeout;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo44877d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "Ls36;", "Lqq6;", "timeout", "Lm40;", "source", "", "byteCount", "Lr37;", "write", "flush", "close", "Ls82;", "Ls82;", "", "closed", "Z", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Http1ExchangeCodec.kt */
    public final class ChunkedSink implements s36 {
        private boolean closed;
        public final /* synthetic */ Http1ExchangeCodec this$0;
        private final s82 timeout;

        public ChunkedSink(Http1ExchangeCodec http1ExchangeCodec) {
            vx2.m53591g(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
            this.timeout = new s82(http1ExchangeCodec.sink.timeout());
        }

        public synchronized void close() {
            if (!this.closed) {
                this.closed = true;
                this.this$0.sink.mo56044Z("0\r\n\r\n");
                this.this$0.detachTimeout(this.timeout);
                this.this$0.state = 3;
            }
        }

        public synchronized void flush() {
            if (!this.closed) {
                this.this$0.sink.flush();
            }
        }

        public qq6 timeout() {
            return this.timeout;
        }

        public void write(m40 m40, long j) {
            vx2.m53591g(m40, "source");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                this.this$0.sink.mo56040U0(j);
                this.this$0.sink.mo56044Z("\r\n");
                this.this$0.sink.write(m40, j);
                this.this$0.sink.mo56044Z("\r\n");
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo44877d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lr37;", "readChunkSize", "Lm40;", "sink", "", "byteCount", "read", "close", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/HttpUrl;", "bytesRemainingInChunk", "J", "", "hasMoreChunks", "Z", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Http1ExchangeCodec.kt */
    public final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk = -1;
        private boolean hasMoreChunks = true;
        public final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec);
            vx2.m53591g(http1ExchangeCodec, "this$0");
            vx2.m53591g(httpUrl, "url");
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
        }

        private final void readChunkSize() {
            boolean z;
            if (this.bytesRemainingInChunk != -1) {
                this.this$0.source.mo56072m0();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.mo56075o1();
                String obj = StringsKt__StringsKt.m63090V0(this.this$0.source.mo56072m0()).toString();
                if (this.bytesRemainingInChunk >= 0) {
                    if (obj.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z || yb6.m74336M(obj, ";", false, 2, (Object) null)) {
                        if (this.bytesRemainingInChunk == 0) {
                            this.hasMoreChunks = false;
                            Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                            http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
                            OkHttpClient access$getClient$p = this.this$0.client;
                            vx2.m53588d(access$getClient$p);
                            CookieJar cookieJar = access$getClient$p.cookieJar();
                            HttpUrl httpUrl = this.url;
                            Headers access$getTrailers$p = this.this$0.trailers;
                            vx2.m53588d(access$getTrailers$p);
                            HttpHeaders.receiveHeaders(cookieJar, httpUrl, access$getTrailers$p);
                            responseBodyComplete();
                            return;
                        }
                        return;
                    }
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + obj + JsonFactory.DEFAULT_QUOTE_CHAR);
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() {
            if (!getClosed()) {
                if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.this$0.getConnection().noNewExchanges$okhttp();
                    responseBodyComplete();
                }
                setClosed(true);
            }
        }

        public long read(m40 m40, long j) {
            boolean z;
            vx2.m53591g(m40, "sink");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(vx2.m53598n("byteCount < 0: ", Long.valueOf(j)).toString());
            } else if (!(!getClosed())) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.hasMoreChunks) {
                return -1;
            } else {
                long j2 = this.bytesRemainingInChunk;
                if (j2 == 0 || j2 == -1) {
                    readChunkSize();
                    if (!this.hasMoreChunks) {
                        return -1;
                    }
                }
                long read = super.read(m40, Math.min(j, this.bytesRemainingInChunk));
                if (read != -1) {
                    this.bytesRemainingInChunk -= read;
                    return read;
                }
                this.this$0.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            }
        }
    }

    @Metadata(mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\r"}, mo44877d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$Companion;", "", "()V", "NO_CHUNK_YET", "", "STATE_CLOSED", "", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: Http1ExchangeCodec.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo44877d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lm40;", "sink", "", "byteCount", "read", "Lr37;", "close", "bytesRemaining", "J", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;J)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Http1ExchangeCodec.kt */
    public final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;
        public final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, long j) {
            super(http1ExchangeCodec);
            vx2.m53591g(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
            this.bytesRemaining = j;
            if (j == 0) {
                responseBodyComplete();
            }
        }

        public void close() {
            if (!getClosed()) {
                if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.this$0.getConnection().noNewExchanges$okhttp();
                    responseBodyComplete();
                }
                setClosed(true);
            }
        }

        public long read(m40 m40, long j) {
            boolean z;
            vx2.m53591g(m40, "sink");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(vx2.m53598n("byteCount < 0: ", Long.valueOf(j)).toString());
            } else if (!getClosed()) {
                long j2 = this.bytesRemaining;
                if (j2 == 0) {
                    return -1;
                }
                long read = super.read(m40, Math.min(j2, j));
                if (read != -1) {
                    long j3 = this.bytesRemaining - read;
                    this.bytesRemaining = j3;
                    if (j3 == 0) {
                        responseBodyComplete();
                    }
                    return read;
                }
                this.this$0.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo44877d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "Ls36;", "Lqq6;", "timeout", "Lm40;", "source", "", "byteCount", "Lr37;", "write", "flush", "close", "Ls82;", "Ls82;", "", "closed", "Z", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Http1ExchangeCodec.kt */
    public final class KnownLengthSink implements s36 {
        private boolean closed;
        public final /* synthetic */ Http1ExchangeCodec this$0;
        private final s82 timeout;

        public KnownLengthSink(Http1ExchangeCodec http1ExchangeCodec) {
            vx2.m53591g(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
            this.timeout = new s82(http1ExchangeCodec.sink.timeout());
        }

        public void close() {
            if (!this.closed) {
                this.closed = true;
                this.this$0.detachTimeout(this.timeout);
                this.this$0.state = 3;
            }
        }

        public void flush() {
            if (!this.closed) {
                this.this$0.sink.flush();
            }
        }

        public qq6 timeout() {
            return this.timeout;
        }

        public void write(m40 m40, long j) {
            vx2.m53591g(m40, "source");
            if (!this.closed) {
                Util.checkOffsetAndCount(m40.size(), 0, j);
                this.this$0.sink.write(m40, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo44877d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lm40;", "sink", "", "byteCount", "read", "Lr37;", "close", "", "inputExhausted", "Z", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Http1ExchangeCodec.kt */
    public final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;
        public final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UnknownLengthSource(Http1ExchangeCodec http1ExchangeCodec) {
            super(http1ExchangeCodec);
            vx2.m53591g(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
        }

        public void close() {
            if (!getClosed()) {
                if (!this.inputExhausted) {
                    responseBodyComplete();
                }
                setClosed(true);
            }
        }

        public long read(m40 m40, long j) {
            boolean z;
            vx2.m53591g(m40, "sink");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(vx2.m53598n("byteCount < 0: ", Long.valueOf(j)).toString());
            } else if (!(!getClosed())) {
                throw new IllegalStateException("closed".toString());
            } else if (this.inputExhausted) {
                return -1;
            } else {
                long read = super.read(m40, j);
                if (read != -1) {
                    return read;
                }
                this.inputExhausted = true;
                responseBodyComplete();
                return -1;
            }
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, w40 w40, v40 v40) {
        vx2.m53591g(realConnection, "connection");
        vx2.m53591g(w40, "source");
        vx2.m53591g(v40, "sink");
        this.client = okHttpClient;
        this.connection = realConnection;
        this.source = w40;
        this.sink = v40;
        this.headersReader = new HeadersReader(w40);
    }

    /* access modifiers changed from: private */
    public final void detachTimeout(s82 s82) {
        qq6 a = s82.mo65832a();
        s82.mo65833b(qq6.NONE);
        a.clearDeadline();
        a.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        return yb6.m74344y("chunked", Response.header$default(response, "Transfer-Encoding", (String) null, 2, (Object) null), true);
    }

    private final s36 newChunkedSink() {
        int i = this.state;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z) {
            this.state = 2;
            return new ChunkedSink(this);
        }
        throw new IllegalStateException(vx2.m53598n("state: ", Integer.valueOf(i)).toString());
    }

    private final z56 newChunkedSource(HttpUrl httpUrl) {
        boolean z;
        int i = this.state;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.state = 5;
            return new ChunkedSource(this, httpUrl);
        }
        throw new IllegalStateException(vx2.m53598n("state: ", Integer.valueOf(i)).toString());
    }

    private final z56 newFixedLengthSource(long j) {
        boolean z;
        int i = this.state;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.state = 5;
            return new FixedLengthSource(this, j);
        }
        throw new IllegalStateException(vx2.m53598n("state: ", Integer.valueOf(i)).toString());
    }

    private final s36 newKnownLengthSink() {
        int i = this.state;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z) {
            this.state = 2;
            return new KnownLengthSink(this);
        }
        throw new IllegalStateException(vx2.m53598n("state: ", Integer.valueOf(i)).toString());
    }

    private final z56 newUnknownLengthSource() {
        boolean z;
        int i = this.state;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.state = 5;
            getConnection().noNewExchanges$okhttp();
            return new UnknownLengthSource(this);
        }
        throw new IllegalStateException(vx2.m53598n("state: ", Integer.valueOf(i)).toString());
    }

    public void cancel() {
        getConnection().cancel();
    }

    public s36 createRequestBody(Request request, long j) {
        vx2.m53591g(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (isChunked(request)) {
            return newChunkedSink();
        } else {
            if (j != -1) {
                return newKnownLengthSink();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public void finishRequest() {
        this.sink.flush();
    }

    public void flushRequest() {
        this.sink.flush();
    }

    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        if (this.state == 6) {
            return true;
        }
        return false;
    }

    public z56 openResponseBodySource(Response response) {
        vx2.m53591g(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength != -1) {
            return newFixedLengthSource(headersContentLength);
        }
        return newUnknownLengthSource();
    }

    public Response.Builder readResponseHeaders(boolean z) {
        int i = this.state;
        boolean z2 = true;
        if (!(i == 1 || i == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                StatusLine parse = StatusLine.Companion.parse(this.headersReader.readLine());
                Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(this.headersReader.readHeaders());
                if (z && parse.code == 100) {
                    return null;
                }
                if (parse.code == 100) {
                    this.state = 3;
                    return headers;
                }
                this.state = 4;
                return headers;
            } catch (EOFException e) {
                throw new IOException(vx2.m53598n("unexpected end of stream on ", getConnection().route().address().url().redact()), e);
            }
        } else {
            throw new IllegalStateException(vx2.m53598n("state: ", Integer.valueOf(i)).toString());
        }
    }

    public long reportedContentLength(Response response) {
        vx2.m53591g(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return 0;
        }
        if (isChunked(response)) {
            return -1;
        }
        return Util.headersContentLength(response);
    }

    public final void skipConnectBody(Response response) {
        vx2.m53591g(response, "response");
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength != -1) {
            z56 newFixedLengthSource = newFixedLengthSource(headersContentLength);
            Util.skipAll(newFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            newFixedLengthSource.close();
        }
    }

    public Headers trailers() {
        boolean z;
        if (this.state == 6) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Headers headers = this.trailers;
            if (headers == null) {
                return Util.EMPTY_HEADERS;
            }
            return headers;
        }
        throw new IllegalStateException("too early; can't read the trailers yet".toString());
    }

    public final void writeRequest(Headers headers, String str) {
        boolean z;
        vx2.m53591g(headers, "headers");
        vx2.m53591g(str, "requestLine");
        int i = this.state;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.sink.mo56044Z(str).mo56044Z("\r\n");
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.sink.mo56044Z(headers.name(i2)).mo56044Z(": ").mo56044Z(headers.value(i2)).mo56044Z("\r\n");
            }
            this.sink.mo56044Z("\r\n");
            this.state = 1;
            return;
        }
        throw new IllegalStateException(vx2.m53598n("state: ", Integer.valueOf(i)).toString());
    }

    public void writeRequestHeaders(Request request) {
        vx2.m53591g(request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().route().proxy().type();
        vx2.m53590f(type, "connection.route().proxy.type()");
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    private final boolean isChunked(Request request) {
        return yb6.m74344y("chunked", request.header("Transfer-Encoding"), true);
    }
}
