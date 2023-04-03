package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http1.HeadersReader;
import okio.ByteString;
import p000.wi4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0003#$%B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001e\u0010\"J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\b\u0018\u00010\u001bR\u00020\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006&"}, mo44877d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "", "maxResult", "currentPartBytesRemaining", "Lokhttp3/MultipartReader$Part;", "nextPart", "Lr37;", "close", "Lw40;", "source", "Lw40;", "", "boundary", "Ljava/lang/String;", "()Ljava/lang/String;", "Lokio/ByteString;", "dashDashBoundary", "Lokio/ByteString;", "crlfDashDashBoundary", "", "partCount", "I", "", "closed", "Z", "noMoreParts", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "<init>", "(Lw40;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "response", "(Lokhttp3/ResponseBody;)V", "Companion", "Part", "PartSource", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: MultipartReader.kt */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final wi4 afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final ByteString crlfDashDashBoundary;
    /* access modifiers changed from: private */
    public PartSource currentPart;
    private final ByteString dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    /* access modifiers changed from: private */
    public final w40 source;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo44877d2 = {"Lokhttp3/MultipartReader$Companion;", "", "Lwi4;", "afterBoundaryOptions", "Lwi4;", "getAfterBoundaryOptions", "()Lwi4;", "<init>", "()V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: MultipartReader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wi4 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002H\u0001R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000e"}, mo44877d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lr37;", "close", "Lokhttp3/Headers;", "headers", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "Lw40;", "body", "Lw40;", "()Lw40;", "<init>", "(Lokhttp3/Headers;Lw40;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: MultipartReader.kt */
    public static final class Part implements Closeable {
        private final w40 body;
        private final Headers headers;

        public Part(Headers headers2, w40 w40) {
            vx2.m53591g(headers2, "headers");
            vx2.m53591g(w40, "body");
            this.headers = headers2;
            this.body = w40;
        }

        public final w40 body() {
            return this.body;
        }

        public void close() {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo44877d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lz56;", "Lr37;", "close", "Lm40;", "sink", "", "byteCount", "read", "Lqq6;", "timeout", "Lqq6;", "<init>", "(Lokhttp3/MultipartReader;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: MultipartReader.kt */
    public final class PartSource implements z56 {
        public final /* synthetic */ MultipartReader this$0;
        private final qq6 timeout = new qq6();

        public PartSource(MultipartReader multipartReader) {
            vx2.m53591g(multipartReader, "this$0");
            this.this$0 = multipartReader;
        }

        public void close() {
            if (vx2.m53586b(this.this$0.currentPart, this)) {
                this.this$0.currentPart = null;
            }
        }

        public long read(m40 m40, long j) {
            boolean z;
            long j2;
            long j3;
            m40 m402 = m40;
            long j4 = j;
            vx2.m53591g(m402, "sink");
            if (j4 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(vx2.m53598n("byteCount < 0: ", Long.valueOf(j)).toString());
            } else if (vx2.m53586b(this.this$0.currentPart, this)) {
                qq6 timeout2 = this.this$0.source.timeout();
                qq6 qq6 = this.timeout;
                MultipartReader multipartReader = this.this$0;
                long timeoutNanos = timeout2.timeoutNanos();
                long a = qq6.Companion.mo65511a(qq6.timeoutNanos(), timeout2.timeoutNanos());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                timeout2.timeout(a, timeUnit);
                if (timeout2.hasDeadline()) {
                    long deadlineNanoTime = timeout2.deadlineNanoTime();
                    if (qq6.hasDeadline()) {
                        timeout2.deadlineNanoTime(Math.min(timeout2.deadlineNanoTime(), qq6.deadlineNanoTime()));
                    }
                    try {
                        long access$currentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j4);
                        if (access$currentPartBytesRemaining == 0) {
                            j3 = -1;
                        } else {
                            j3 = multipartReader.source.read(m402, access$currentPartBytesRemaining);
                        }
                        timeout2.timeout(timeoutNanos, timeUnit);
                        if (qq6.hasDeadline()) {
                            timeout2.deadlineNanoTime(deadlineNanoTime);
                        }
                        return j3;
                    } catch (Throwable th) {
                        timeout2.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (qq6.hasDeadline()) {
                            timeout2.deadlineNanoTime(deadlineNanoTime);
                        }
                        throw th;
                    }
                } else {
                    if (qq6.hasDeadline()) {
                        timeout2.deadlineNanoTime(qq6.deadlineNanoTime());
                    }
                    try {
                        long access$currentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j4);
                        if (access$currentPartBytesRemaining2 == 0) {
                            j2 = -1;
                        } else {
                            j2 = multipartReader.source.read(m402, access$currentPartBytesRemaining2);
                        }
                        timeout2.timeout(timeoutNanos, timeUnit);
                        if (qq6.hasDeadline()) {
                            timeout2.clearDeadline();
                        }
                        return j2;
                    } catch (Throwable th2) {
                        timeout2.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (qq6.hasDeadline()) {
                            timeout2.clearDeadline();
                        }
                        throw th2;
                    }
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public qq6 timeout() {
            return this.timeout;
        }
    }

    static {
        wi4.C9519a aVar = wi4.f45529g;
        ByteString.C9034a aVar2 = ByteString.Companion;
        afterBoundaryOptions = aVar.mo66719d(aVar2.mo64480d("\r\n"), aVar2.mo64480d("--"), aVar2.mo64480d(" "), aVar2.mo64480d("\t"));
    }

    public MultipartReader(w40 w40, String str) throws IOException {
        vx2.m53591g(w40, "source");
        vx2.m53591g(str, "boundary");
        this.source = w40;
        this.boundary = str;
        this.dashDashBoundary = new m40().mo56044Z("--").mo56044Z(str).mo56042V0();
        this.crlfDashDashBoundary = new m40().mo56044Z("\r\n--").mo56044Z(str).mo56042V0();
    }

    /* access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j) {
        this.source.mo56094u0((long) this.crlfDashDashBoundary.size());
        long M = this.source.mo56081r().mo56030M(this.crlfDashDashBoundary);
        if (M == -1) {
            return Math.min(j, (this.source.mo56081r().size() - ((long) this.crlfDashDashBoundary.size())) + 1);
        }
        return Math.min(j, M);
    }

    public final String boundary() {
        return this.boundary;
    }

    public void close() throws IOException {
        if (!this.closed) {
            this.closed = true;
            this.currentPart = null;
            this.source.close();
        }
    }

    public final Part nextPart() throws IOException {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.noMoreParts) {
            return null;
        } else {
            if (this.partCount != 0 || !this.source.mo56046a0(0, this.dashDashBoundary)) {
                while (true) {
                    long currentPartBytesRemaining = currentPartBytesRemaining(8192);
                    if (currentPartBytesRemaining == 0) {
                        break;
                    }
                    this.source.skip(currentPartBytesRemaining);
                }
                this.source.skip((long) this.crlfDashDashBoundary.size());
            } else {
                this.source.skip((long) this.dashDashBoundary.size());
            }
            boolean z = false;
            while (true) {
                int J0 = this.source.mo56026J0(afterBoundaryOptions);
                if (J0 == -1) {
                    throw new ProtocolException("unexpected characters after boundary");
                } else if (J0 == 0) {
                    this.partCount++;
                    Headers readHeaders = new HeadersReader(this.source).readHeaders();
                    PartSource partSource = new PartSource(this);
                    this.currentPart = partSource;
                    return new Part(readHeaders, sg4.m71929d(partSource));
                } else if (J0 != 1) {
                    if (J0 == 2 || J0 == 3) {
                        z = true;
                    }
                } else if (z) {
                    throw new ProtocolException("unexpected characters after boundary");
                } else if (this.partCount != 0) {
                    this.noMoreParts = true;
                    return null;
                } else {
                    throw new ProtocolException("expected at least 1 part");
                }
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultipartReader(okhttp3.ResponseBody r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = "response"
            p000.vx2.m53591g(r3, r0)
            w40 r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 != 0) goto L_0x0011
            r3 = 0
            goto L_0x0017
        L_0x0011:
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
        L_0x0017:
            if (r3 == 0) goto L_0x001d
            r2.<init>(r0, r3)
            return
        L_0x001d:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }
}
