package okhttp3.internal.p023ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.p023ws.WebSocketReader;
import okio.ByteString;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 r2\u00020\u00012\u00020\u0002:\u0005srtuvBA\u0012\u0006\u0010o\u001a\u00020n\u0012\u0006\u0010A\u001a\u00020\r\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010K\u001a\u00020\u000f\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010O\u001a\u00020\u000f¢\u0006\u0004\bp\u0010qJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012J!\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010 \u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u000bJ\u0006\u0010\"\u001a\u00020\u0004J\u0016\u0010&\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$J\u0006\u0010'\u001a\u00020\u000bJ\u0006\u0010(\u001a\u00020\bJ\u0006\u0010)\u001a\u00020\bJ\u0006\u0010*\u001a\u00020\bJ\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u001cH\u0016J\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u0006H\u0016J\u0010\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0010\u00100\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0018\u00103\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\u001cH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u001cH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0006H\u0016J\u000e\u00104\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0006J\u001a\u00105\u001a\u00020\u00042\u0006\u00101\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u001cH\u0016J \u00105\u001a\u00020\u00042\u0006\u00101\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u001c2\u0006\u00106\u001a\u00020\u000fJ\u000f\u00109\u001a\u00020\u0004H\u0000¢\u0006\u0004\b7\u00108J\u000f\u0010<\u001a\u00020\u000bH\u0000¢\u0006\u0004\b:\u0010;J\u001c\u0010@\u001a\u00020\u000b2\n\u0010?\u001a\u00060=j\u0002`>2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015R\u0014\u0010A\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010D\u001a\u00020C8\u0000X\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010LR\u0014\u0010P\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010QR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010aR\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00060b8\u0002X\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020e0b8\u0002X\u0004¢\u0006\u0006\n\u0004\bf\u0010dR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010LR\u0016\u0010g\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010i\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010k\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bk\u0010QR\u0016\u0010l\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bl\u0010hR\u0016\u0010(\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010jR\u0016\u0010)\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010jR\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010jR\u0016\u0010m\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bm\u0010h¨\u0006w"}, mo44877d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/internal/ws/WebSocketExtensions;", "", "isValid", "Lokio/ByteString;", "data", "", "formatOpcode", "send", "Lr37;", "runWriter", "Lokhttp3/Request;", "request", "", "queueSize", "cancel", "Lokhttp3/OkHttpClient;", "client", "connect", "Lokhttp3/Response;", "response", "Lokhttp3/internal/connection/Exchange;", "exchange", "checkUpgradeSuccess$okhttp", "(Lokhttp3/Response;Lokhttp3/internal/connection/Exchange;)V", "checkUpgradeSuccess", "", "name", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "streams", "initReaderAndWriter", "loopReader", "processNextFrame", "timeout", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "awaitTermination", "tearDown", "sentPingCount", "receivedPingCount", "receivedPongCount", "text", "onReadMessage", "bytes", "payload", "onReadPing", "onReadPong", "code", "reason", "onReadClose", "pong", "close", "cancelAfterCloseMillis", "writeOneFrame$okhttp", "()Z", "writeOneFrame", "writePingFrame$okhttp", "()V", "writePingFrame", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "failWebSocket", "originalRequest", "Lokhttp3/Request;", "Lokhttp3/WebSocketListener;", "listener", "Lokhttp3/WebSocketListener;", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "Ljava/util/Random;", "random", "Ljava/util/Random;", "pingIntervalMillis", "J", "extensions", "Lokhttp3/internal/ws/WebSocketExtensions;", "minimumDeflateSize", "key", "Ljava/lang/String;", "Lokhttp3/Call;", "call", "Lokhttp3/Call;", "Lokhttp3/internal/concurrent/Task;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "Lokhttp3/internal/ws/WebSocketReader;", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "Lokhttp3/internal/ws/WebSocketWriter;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/util/ArrayDeque;", "pongQueue", "Ljava/util/ArrayDeque;", "", "messageAndCloseQueue", "enqueuedClose", "Z", "receivedCloseCode", "I", "receivedCloseReason", "failed", "awaitingPong", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;J)V", "Companion", "Close", "Message", "Streams", "WriterTask", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: okhttp3.internal.ws.RealWebSocket */
/* compiled from: RealWebSocket.kt */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final List<Protocol> ONLY_HTTP1 = bk0.m32598e(Protocol.HTTP_1_1);
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    /* access modifiers changed from: private */
    public WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    /* access modifiers changed from: private */
    public final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    private long minimumDeflateSize;
    /* access modifiers changed from: private */
    public String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<ByteString> pongQueue = new ArrayDeque<>();
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode = -1;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private TaskQueue taskQueue;
    private WebSocketWriter writer;
    private Task writerTask;

    @Metadata(mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo44877d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "code", "", "reason", "Lokio/ByteString;", "cancelAfterCloseMillis", "", "(ILokio/ByteString;J)V", "getCancelAfterCloseMillis", "()J", "getCode", "()I", "getReason", "()Lokio/ByteString;", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Close */
    /* compiled from: RealWebSocket.kt */
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final ByteString reason;

        public Close(int i, ByteString byteString, long j) {
            this.code = i;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final ByteString getReason() {
            return this.reason;
        }
    }

    @Metadata(mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo44877d2 = {"Lokhttp3/internal/ws/RealWebSocket$Companion;", "", "()V", "CANCEL_AFTER_CLOSE_MILLIS", "", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "ONLY_HTTP1", "", "Lokhttp3/Protocol;", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Companion */
    /* compiled from: RealWebSocket.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, mo44877d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "formatOpcode", "", "data", "Lokio/ByteString;", "(ILokio/ByteString;)V", "getData", "()Lokio/ByteString;", "getFormatOpcode", "()I", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Message */
    /* compiled from: RealWebSocket.kt */
    public static final class Message {
        private final ByteString data;
        private final int formatOpcode;

        public Message(int i, ByteString byteString) {
            vx2.m53591g(byteString, "data");
            this.formatOpcode = i;
            this.data = byteString;
        }

        public final ByteString getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo44877d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "", "client", "Z", "getClient", "()Z", "Lw40;", "source", "Lw40;", "getSource", "()Lw40;", "Lv40;", "sink", "Lv40;", "getSink", "()Lv40;", "<init>", "(ZLw40;Lv40;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Streams */
    /* compiled from: RealWebSocket.kt */
    public static abstract class Streams implements Closeable {
        private final boolean client;
        private final v40 sink;
        private final w40 source;

        public Streams(boolean z, w40 w40, v40 v40) {
            vx2.m53591g(w40, "source");
            vx2.m53591g(v40, "sink");
            this.client = z;
            this.source = w40;
            this.sink = v40;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final v40 getSink() {
            return this.sink;
        }

        public final w40 getSource() {
            return this.source;
        }
    }

    @Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo44877d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "(Lokhttp3/internal/ws/RealWebSocket;)V", "runOnce", "", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* renamed from: okhttp3.internal.ws.RealWebSocket$WriterTask */
    /* compiled from: RealWebSocket.kt */
    public final class WriterTask extends Task {
        public final /* synthetic */ RealWebSocket this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public WriterTask(RealWebSocket realWebSocket) {
            super(vx2.m53598n(realWebSocket.name, " writer"), false, 2, (DefaultConstructorMarker) null);
            vx2.m53591g(realWebSocket, "this$0");
            this.this$0 = realWebSocket;
        }

        public long runOnce() {
            try {
                if (this.this$0.writeOneFrame$okhttp()) {
                    return 0;
                }
                return -1;
            } catch (IOException e) {
                this.this$0.failWebSocket(e, (Response) null);
                return -1;
            }
        }
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random2, long j, WebSocketExtensions webSocketExtensions, long j2) {
        vx2.m53591g(taskRunner, "taskRunner");
        vx2.m53591g(request, "originalRequest");
        vx2.m53591g(webSocketListener, "listener");
        vx2.m53591g(random2, "random");
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random2;
        this.pingIntervalMillis = j;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j2;
        this.taskQueue = taskRunner.newQueue();
        if (vx2.m53586b("GET", request.method())) {
            ByteString.C9034a aVar = ByteString.Companion;
            byte[] bArr = new byte[16];
            random2.nextBytes(bArr);
            r37 r37 = r37.f33317a;
            this.key = ByteString.C9034a.m70311h(aVar, bArr, 0, 0, 3, (Object) null).base64();
            return;
        }
        throw new IllegalArgumentException(vx2.m53598n("Request must be GET: ", request.method()).toString());
    }

    /* access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        if (webSocketExtensions.serverMaxWindowBits == null || new rw2(8, 15).mo47514u(webSocketExtensions.serverMaxWindowBits.intValue())) {
            return true;
        }
        return false;
    }

    private final void runWriter() {
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            Task task = this.writerTask;
            if (task != null) {
                TaskQueue.schedule$default(this.taskQueue, task, 0, 2, (Object) null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final void awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        vx2.m53591g(timeUnit, "timeUnit");
        this.taskQueue.idleLatch().await(j, timeUnit);
    }

    public void cancel() {
        Call call2 = this.call;
        vx2.m53588d(call2);
        call2.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(Response response, Exchange exchange) throws IOException {
        vx2.m53591g(response, "response");
        if (response.code() == 101) {
            String header$default = Response.header$default(response, "Connection", (String) null, 2, (Object) null);
            if (yb6.m74344y("Upgrade", header$default, true)) {
                String header$default2 = Response.header$default(response, "Upgrade", (String) null, 2, (Object) null);
                if (yb6.m74344y("websocket", header$default2, true)) {
                    String header$default3 = Response.header$default(response, "Sec-WebSocket-Accept", (String) null, 2, (Object) null);
                    String base64 = ByteString.Companion.mo64480d(vx2.m53598n(this.key, WebSocketProtocol.ACCEPT_MAGIC)).sha1().base64();
                    if (!vx2.m53586b(base64, header$default3)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + base64 + "' but was '" + header$default3 + '\'');
                    } else if (exchange == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header$default2 + '\'');
                }
            } else {
                throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header$default + '\'');
            }
        } else {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
    }

    public boolean close(int i, String str) {
        return close(i, str, CANCEL_AFTER_CLOSE_MILLIS);
    }

    public final void connect(OkHttpClient okHttpClient) {
        vx2.m53591g(okHttpClient, "client");
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), (Response) null);
            return;
        }
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(build, build2, true);
        this.call = realCall;
        vx2.m53588d(realCall);
        realCall.enqueue(new RealWebSocket$connect$1(this, build2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4.listener.onFailure(r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r0 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        if (r2 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        if (r3 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void failWebSocket(java.lang.Exception r5, okhttp3.Response r6) {
        /*
            r4 = this;
            java.lang.String r0 = "e"
            p000.vx2.m53591g(r5, r0)
            monitor-enter(r4)
            boolean r0 = r4.failed     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)
            return
        L_0x000c:
            r0 = 1
            r4.failed = r0     // Catch:{ all -> 0x0050 }
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r4.streams     // Catch:{ all -> 0x0050 }
            r1 = 0
            r4.streams = r1     // Catch:{ all -> 0x0050 }
            okhttp3.internal.ws.WebSocketReader r2 = r4.reader     // Catch:{ all -> 0x0050 }
            r4.reader = r1     // Catch:{ all -> 0x0050 }
            okhttp3.internal.ws.WebSocketWriter r3 = r4.writer     // Catch:{ all -> 0x0050 }
            r4.writer = r1     // Catch:{ all -> 0x0050 }
            okhttp3.internal.concurrent.TaskQueue r1 = r4.taskQueue     // Catch:{ all -> 0x0050 }
            r1.shutdown()     // Catch:{ all -> 0x0050 }
            r37 r1 = p000.r37.f33317a     // Catch:{ all -> 0x0050 }
            monitor-exit(r4)
            okhttp3.WebSocketListener r1 = r4.listener     // Catch:{ all -> 0x003c }
            r1.onFailure(r4, r5, r6)     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x002c
            goto L_0x002f
        L_0x002c:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
        L_0x002f:
            if (r2 != 0) goto L_0x0032
            goto L_0x0035
        L_0x0032:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)
        L_0x0035:
            if (r3 != 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
        L_0x003b:
            return
        L_0x003c:
            r5 = move-exception
            if (r0 != 0) goto L_0x0040
            goto L_0x0043
        L_0x0040:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
        L_0x0043:
            if (r2 != 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)
        L_0x0049:
            if (r3 != 0) goto L_0x004c
            goto L_0x004f
        L_0x004c:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
        L_0x004f:
            throw r5
        L_0x0050:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p023ws.RealWebSocket.failWebSocket(java.lang.Exception, okhttp3.Response):void");
    }

    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public final void initReaderAndWriter(String str, Streams streams2) throws IOException {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(streams2, "streams");
        WebSocketExtensions webSocketExtensions = this.extensions;
        vx2.m53588d(webSocketExtensions);
        synchronized (this) {
            this.name = str;
            this.streams = streams2;
            this.writer = new WebSocketWriter(streams2.getClient(), streams2.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams2.getClient()), this.minimumDeflateSize);
            this.writerTask = new WriterTask(this);
            long j = this.pingIntervalMillis;
            if (j != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                this.taskQueue.schedule(new RealWebSocket$initReaderAndWriter$lambda3$$inlined$schedule$1(vx2.m53598n(str, " ping"), this, nanos), nanos);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
            r37 r37 = r37.f33317a;
        }
        this.reader = new WebSocketReader(streams2.getClient(), streams2.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams2.getClient()));
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            vx2.m53588d(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [okhttp3.internal.ws.WebSocketWriter, okhttp3.internal.ws.WebSocketReader, okhttp3.internal.ws.RealWebSocket$Streams] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReadClose(int r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "reason"
            p000.vx2.m53591g(r6, r0)
            r0 = 1
            r1 = 0
            r2 = -1
            if (r5 == r2) goto L_0x000c
            r3 = r0
            goto L_0x000d
        L_0x000c:
            r3 = r1
        L_0x000d:
            if (r3 == 0) goto L_0x0083
            monitor-enter(r4)
            int r3 = r4.receivedCloseCode     // Catch:{ all -> 0x0080 }
            if (r3 != r2) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 == 0) goto L_0x0074
            r4.receivedCloseCode = r5     // Catch:{ all -> 0x0080 }
            r4.receivedCloseReason = r6     // Catch:{ all -> 0x0080 }
            boolean r0 = r4.enqueuedClose     // Catch:{ all -> 0x0080 }
            r1 = 0
            if (r0 == 0) goto L_0x003c
            java.util.ArrayDeque<java.lang.Object> r0 = r4.messageAndCloseQueue     // Catch:{ all -> 0x0080 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x003c
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r4.streams     // Catch:{ all -> 0x0080 }
            r4.streams = r1     // Catch:{ all -> 0x0080 }
            okhttp3.internal.ws.WebSocketReader r2 = r4.reader     // Catch:{ all -> 0x0080 }
            r4.reader = r1     // Catch:{ all -> 0x0080 }
            okhttp3.internal.ws.WebSocketWriter r3 = r4.writer     // Catch:{ all -> 0x0080 }
            r4.writer = r1     // Catch:{ all -> 0x0080 }
            okhttp3.internal.concurrent.TaskQueue r1 = r4.taskQueue     // Catch:{ all -> 0x0080 }
            r1.shutdown()     // Catch:{ all -> 0x0080 }
            r1 = r0
            goto L_0x003e
        L_0x003c:
            r2 = r1
            r3 = r2
        L_0x003e:
            r37 r0 = p000.r37.f33317a     // Catch:{ all -> 0x0080 }
            monitor-exit(r4)
            okhttp3.WebSocketListener r0 = r4.listener     // Catch:{ all -> 0x0060 }
            r0.onClosing(r4, r5, r6)     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x004d
            okhttp3.WebSocketListener r0 = r4.listener     // Catch:{ all -> 0x0060 }
            r0.onClosed(r4, r5, r6)     // Catch:{ all -> 0x0060 }
        L_0x004d:
            if (r1 != 0) goto L_0x0050
            goto L_0x0053
        L_0x0050:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x0053:
            if (r2 != 0) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)
        L_0x0059:
            if (r3 != 0) goto L_0x005c
            goto L_0x005f
        L_0x005c:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
        L_0x005f:
            return
        L_0x0060:
            r5 = move-exception
            if (r1 != 0) goto L_0x0064
            goto L_0x0067
        L_0x0064:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x0067:
            if (r2 != 0) goto L_0x006a
            goto L_0x006d
        L_0x006a:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)
        L_0x006d:
            if (r3 != 0) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
        L_0x0073:
            throw r5
        L_0x0074:
            java.lang.String r5 = "already closed"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0080 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0080 }
            r6.<init>(r5)     // Catch:{ all -> 0x0080 }
            throw r6     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0083:
            java.lang.String r5 = "Failed requirement."
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p023ws.RealWebSocket.onReadClose(int, java.lang.String):void");
    }

    public void onReadMessage(String str) throws IOException {
        vx2.m53591g(str, PublicResolver.FUNC_TEXT);
        this.listener.onMessage((WebSocket) this, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onReadPing(okio.ByteString r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            p000.vx2.m53591g(r2, r0)     // Catch:{ all -> 0x0029 }
            boolean r0 = r1.failed     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r1.enqueuedClose     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0017
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0017
            goto L_0x0027
        L_0x0017:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.pongQueue     // Catch:{ all -> 0x0029 }
            r0.add(r2)     // Catch:{ all -> 0x0029 }
            r1.runWriter()     // Catch:{ all -> 0x0029 }
            int r2 = r1.receivedPingCount     // Catch:{ all -> 0x0029 }
            int r2 = r2 + 1
            r1.receivedPingCount = r2     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)
            return
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p023ws.RealWebSocket.onReadPing(okio.ByteString):void");
    }

    public synchronized void onReadPong(ByteString byteString) {
        vx2.m53591g(byteString, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(ByteString byteString) {
        vx2.m53591g(byteString, "payload");
        if (!this.failed) {
            if (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty()) {
                this.pongQueue.add(byteString);
                runWriter();
                return true;
            }
        }
        return false;
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            vx2.m53588d(webSocketReader);
            webSocketReader.processNextFrame();
            if (this.receivedCloseCode == -1) {
                return true;
            }
            return false;
        } catch (Exception e) {
            failWebSocket(e, (Response) null);
            return false;
        }
    }

    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    public Request request() {
        return this.originalRequest;
    }

    public boolean send(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_TEXT);
        return send(ByteString.Companion.mo64480d(str), 1);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10, TimeUnit.SECONDS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r2 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        p000.vx2.m53588d(r0);
        r0.writePong(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        if ((r5 instanceof okhttp3.internal.p023ws.RealWebSocket.Message) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        r5 = (okhttp3.internal.p023ws.RealWebSocket.Message) r5;
        p000.vx2.m53588d(r0);
        r0.writeMessageFrame(r5.getFormatOpcode(), r5.getData());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008e, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r13.queueSize -= (long) r5.getData().size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a4, code lost:
        if ((r5 instanceof okhttp3.internal.p023ws.RealWebSocket.Close) == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        r5 = (okhttp3.internal.p023ws.RealWebSocket.Close) r5;
        p000.vx2.m53588d(r0);
        r0.writeClose(r5.getCode(), r5.getReason());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b6, code lost:
        if (r1 == null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b8, code lost:
        r0 = r13.listener;
        p000.vx2.m53588d(r7);
        r0.onClosed(r13, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c0, code lost:
        if (r1 != null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c3, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        if (r8 != null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c9, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cc, code lost:
        if (r9 != null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cf, code lost:
        okhttp3.internal.Util.closeQuietly(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d2, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d8, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00da, code lost:
        if (r1 != null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00dd, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e0, code lost:
        if (r8 != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e3, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e6, code lost:
        if (r9 != null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e9, code lost:
        okhttp3.internal.Util.closeQuietly(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ec, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean writeOneFrame$okhttp() throws java.io.IOException {
        /*
            r13 = this;
            monitor-enter(r13)
            boolean r0 = r13.failed     // Catch:{ all -> 0x00ed }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r13)
            return r1
        L_0x0008:
            okhttp3.internal.ws.WebSocketWriter r0 = r13.writer     // Catch:{ all -> 0x00ed }
            java.util.ArrayDeque<okio.ByteString> r2 = r13.pongQueue     // Catch:{ all -> 0x00ed }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00ed }
            r3 = 1
            r4 = -1
            r5 = 0
            if (r2 != 0) goto L_0x0068
            java.util.ArrayDeque<java.lang.Object> r6 = r13.messageAndCloseQueue     // Catch:{ all -> 0x00ed }
            java.lang.Object r6 = r6.poll()     // Catch:{ all -> 0x00ed }
            boolean r7 = r6 instanceof okhttp3.internal.p023ws.RealWebSocket.Close     // Catch:{ all -> 0x00ed }
            if (r7 == 0) goto L_0x005e
            int r1 = r13.receivedCloseCode     // Catch:{ all -> 0x00ed }
            java.lang.String r7 = r13.receivedCloseReason     // Catch:{ all -> 0x00ed }
            if (r1 == r4) goto L_0x003b
            okhttp3.internal.ws.RealWebSocket$Streams r4 = r13.streams     // Catch:{ all -> 0x00ed }
            r13.streams = r5     // Catch:{ all -> 0x00ed }
            okhttp3.internal.ws.WebSocketReader r8 = r13.reader     // Catch:{ all -> 0x00ed }
            r13.reader = r5     // Catch:{ all -> 0x00ed }
            okhttp3.internal.ws.WebSocketWriter r9 = r13.writer     // Catch:{ all -> 0x00ed }
            r13.writer = r5     // Catch:{ all -> 0x00ed }
            okhttp3.internal.concurrent.TaskQueue r5 = r13.taskQueue     // Catch:{ all -> 0x00ed }
            r5.shutdown()     // Catch:{ all -> 0x00ed }
            r5 = r6
            r12 = r4
            r4 = r1
            r1 = r12
            goto L_0x006c
        L_0x003b:
            r4 = r6
            okhttp3.internal.ws.RealWebSocket$Close r4 = (okhttp3.internal.p023ws.RealWebSocket.Close) r4     // Catch:{ all -> 0x00ed }
            long r8 = r4.getCancelAfterCloseMillis()     // Catch:{ all -> 0x00ed }
            okhttp3.internal.concurrent.TaskQueue r4 = r13.taskQueue     // Catch:{ all -> 0x00ed }
            java.lang.String r10 = r13.name     // Catch:{ all -> 0x00ed }
            java.lang.String r11 = " cancel"
            java.lang.String r10 = p000.vx2.m53598n(r10, r11)     // Catch:{ all -> 0x00ed }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00ed }
            long r8 = r11.toNanos(r8)     // Catch:{ all -> 0x00ed }
            okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda-8$$inlined$execute$default$1 r11 = new okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda-8$$inlined$execute$default$1     // Catch:{ all -> 0x00ed }
            r11.<init>(r10, r3, r13)     // Catch:{ all -> 0x00ed }
            r4.schedule(r11, r8)     // Catch:{ all -> 0x00ed }
            r4 = r1
            r1 = r5
            r8 = r1
            goto L_0x0065
        L_0x005e:
            if (r6 != 0) goto L_0x0062
            monitor-exit(r13)
            return r1
        L_0x0062:
            r1 = r5
            r7 = r1
            r8 = r7
        L_0x0065:
            r9 = r8
            r5 = r6
            goto L_0x006c
        L_0x0068:
            r1 = r5
            r7 = r1
            r8 = r7
            r9 = r8
        L_0x006c:
            r37 r6 = p000.r37.f33317a     // Catch:{ all -> 0x00ed }
            monitor-exit(r13)
            if (r2 == 0) goto L_0x007a
            p000.vx2.m53588d(r0)     // Catch:{ all -> 0x00d9 }
            okio.ByteString r2 = (okio.ByteString) r2     // Catch:{ all -> 0x00d9 }
            r0.writePong(r2)     // Catch:{ all -> 0x00d9 }
            goto L_0x00c0
        L_0x007a:
            boolean r2 = r5 instanceof okhttp3.internal.p023ws.RealWebSocket.Message     // Catch:{ all -> 0x00d9 }
            if (r2 == 0) goto L_0x00a2
            okhttp3.internal.ws.RealWebSocket$Message r5 = (okhttp3.internal.p023ws.RealWebSocket.Message) r5     // Catch:{ all -> 0x00d9 }
            p000.vx2.m53588d(r0)     // Catch:{ all -> 0x00d9 }
            int r2 = r5.getFormatOpcode()     // Catch:{ all -> 0x00d9 }
            okio.ByteString r4 = r5.getData()     // Catch:{ all -> 0x00d9 }
            r0.writeMessageFrame(r2, r4)     // Catch:{ all -> 0x00d9 }
            monitor-enter(r13)     // Catch:{ all -> 0x00d9 }
            long r6 = r13.queueSize     // Catch:{ all -> 0x009f }
            okio.ByteString r0 = r5.getData()     // Catch:{ all -> 0x009f }
            int r0 = r0.size()     // Catch:{ all -> 0x009f }
            long r4 = (long) r0     // Catch:{ all -> 0x009f }
            long r6 = r6 - r4
            r13.queueSize = r6     // Catch:{ all -> 0x009f }
            monitor-exit(r13)     // Catch:{ all -> 0x00d9 }
            goto L_0x00c0
        L_0x009f:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x00a2:
            boolean r2 = r5 instanceof okhttp3.internal.p023ws.RealWebSocket.Close     // Catch:{ all -> 0x00d9 }
            if (r2 == 0) goto L_0x00d3
            okhttp3.internal.ws.RealWebSocket$Close r5 = (okhttp3.internal.p023ws.RealWebSocket.Close) r5     // Catch:{ all -> 0x00d9 }
            p000.vx2.m53588d(r0)     // Catch:{ all -> 0x00d9 }
            int r2 = r5.getCode()     // Catch:{ all -> 0x00d9 }
            okio.ByteString r5 = r5.getReason()     // Catch:{ all -> 0x00d9 }
            r0.writeClose(r2, r5)     // Catch:{ all -> 0x00d9 }
            if (r1 == 0) goto L_0x00c0
            okhttp3.WebSocketListener r0 = r13.listener     // Catch:{ all -> 0x00d9 }
            p000.vx2.m53588d(r7)     // Catch:{ all -> 0x00d9 }
            r0.onClosed(r13, r4, r7)     // Catch:{ all -> 0x00d9 }
        L_0x00c0:
            if (r1 != 0) goto L_0x00c3
            goto L_0x00c6
        L_0x00c3:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x00c6:
            if (r8 != 0) goto L_0x00c9
            goto L_0x00cc
        L_0x00c9:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r8)
        L_0x00cc:
            if (r9 != 0) goto L_0x00cf
            goto L_0x00d2
        L_0x00cf:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r9)
        L_0x00d2:
            return r3
        L_0x00d3:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00d9 }
            r0.<init>()     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception
            if (r1 != 0) goto L_0x00dd
            goto L_0x00e0
        L_0x00dd:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x00e0:
            if (r8 != 0) goto L_0x00e3
            goto L_0x00e6
        L_0x00e3:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r8)
        L_0x00e6:
            if (r9 != 0) goto L_0x00e9
            goto L_0x00ec
        L_0x00e9:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r9)
        L_0x00ec:
            throw r0
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p023ws.RealWebSocket.writeOneFrame$okhttp():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0022, code lost:
        if (r1 == -1) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0024, code lost:
        failWebSocket(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + r7.pingIntervalMillis + "ms (after " + (r1 - 1) + " successful ping/pongs)"), (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0.writePing(okio.ByteString.EMPTY);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        failWebSocket(r0, (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writePingFrame$okhttp() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.failed     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            okhttp3.internal.ws.WebSocketWriter r0 = r7.writer     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r1 = r7.awaitingPong     // Catch:{ all -> 0x0059 }
            r2 = -1
            if (r1 == 0) goto L_0x0015
            int r1 = r7.sentPingCount     // Catch:{ all -> 0x0059 }
            goto L_0x0016
        L_0x0015:
            r1 = r2
        L_0x0016:
            int r3 = r7.sentPingCount     // Catch:{ all -> 0x0059 }
            r4 = 1
            int r3 = r3 + r4
            r7.sentPingCount = r3     // Catch:{ all -> 0x0059 }
            r7.awaitingPong = r4     // Catch:{ all -> 0x0059 }
            r37 r3 = p000.r37.f33317a     // Catch:{ all -> 0x0059 }
            monitor-exit(r7)
            r3 = 0
            if (r1 == r2) goto L_0x004e
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.append(r5)
            long r5 = r7.pingIntervalMillis
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r7.failWebSocket(r0, r3)
            return
        L_0x004e:
            okio.ByteString r1 = okio.ByteString.EMPTY     // Catch:{ IOException -> 0x0054 }
            r0.writePing(r1)     // Catch:{ IOException -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r0 = move-exception
            r7.failWebSocket(r0, r3)
        L_0x0058:
            return
        L_0x0059:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p023ws.RealWebSocket.writePingFrame$okhttp():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean close(int r8, java.lang.String r9, long r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.p023ws.WebSocketProtocol.INSTANCE     // Catch:{ all -> 0x004e }
            r0.validateCloseCode(r8)     // Catch:{ all -> 0x004e }
            r0 = 0
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L_0x0032
            okio.ByteString$a r0 = okio.ByteString.Companion     // Catch:{ all -> 0x004e }
            okio.ByteString r0 = r0.mo64480d(r9)     // Catch:{ all -> 0x004e }
            int r3 = r0.size()     // Catch:{ all -> 0x004e }
            long r3 = (long) r3     // Catch:{ all -> 0x004e }
            r5 = 123(0x7b, double:6.1E-322)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x001e
            r3 = r2
            goto L_0x001f
        L_0x001e:
            r3 = r1
        L_0x001f:
            if (r3 == 0) goto L_0x0022
            goto L_0x0032
        L_0x0022:
            java.lang.String r8 = "reason.size() > 123: "
            java.lang.String r8 = p000.vx2.m53598n(r8, r9)     // Catch:{ all -> 0x004e }
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x004e }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x004e }
            r9.<init>(r8)     // Catch:{ all -> 0x004e }
            throw r9     // Catch:{ all -> 0x004e }
        L_0x0032:
            boolean r9 = r7.failed     // Catch:{ all -> 0x004e }
            if (r9 != 0) goto L_0x004c
            boolean r9 = r7.enqueuedClose     // Catch:{ all -> 0x004e }
            if (r9 == 0) goto L_0x003b
            goto L_0x004c
        L_0x003b:
            r7.enqueuedClose = r2     // Catch:{ all -> 0x004e }
            java.util.ArrayDeque<java.lang.Object> r9 = r7.messageAndCloseQueue     // Catch:{ all -> 0x004e }
            okhttp3.internal.ws.RealWebSocket$Close r1 = new okhttp3.internal.ws.RealWebSocket$Close     // Catch:{ all -> 0x004e }
            r1.<init>(r8, r0, r10)     // Catch:{ all -> 0x004e }
            r9.add(r1)     // Catch:{ all -> 0x004e }
            r7.runWriter()     // Catch:{ all -> 0x004e }
            monitor-exit(r7)
            return r2
        L_0x004c:
            monitor-exit(r7)
            return r1
        L_0x004e:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p023ws.RealWebSocket.close(int, java.lang.String, long):boolean");
    }

    public void onReadMessage(ByteString byteString) throws IOException {
        vx2.m53591g(byteString, "bytes");
        this.listener.onMessage((WebSocket) this, byteString);
    }

    public boolean send(ByteString byteString) {
        vx2.m53591g(byteString, "bytes");
        return send(byteString, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean send(okio.ByteString r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.failed     // Catch:{ all -> 0x003e }
            r1 = 0
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.enqueuedClose     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000b
            goto L_0x003c
        L_0x000b:
            long r2 = r6.queueSize     // Catch:{ all -> 0x003e }
            int r0 = r7.size()     // Catch:{ all -> 0x003e }
            long r4 = (long) r0     // Catch:{ all -> 0x003e }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            return r1
        L_0x0022:
            long r0 = r6.queueSize     // Catch:{ all -> 0x003e }
            int r2 = r7.size()     // Catch:{ all -> 0x003e }
            long r2 = (long) r2     // Catch:{ all -> 0x003e }
            long r0 = r0 + r2
            r6.queueSize = r0     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.messageAndCloseQueue     // Catch:{ all -> 0x003e }
            okhttp3.internal.ws.RealWebSocket$Message r1 = new okhttp3.internal.ws.RealWebSocket$Message     // Catch:{ all -> 0x003e }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x003e }
            r0.add(r1)     // Catch:{ all -> 0x003e }
            r6.runWriter()     // Catch:{ all -> 0x003e }
            r7 = 1
            monitor-exit(r6)
            return r7
        L_0x003c:
            monitor-exit(r6)
            return r1
        L_0x003e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p023ws.RealWebSocket.send(okio.ByteString, int):boolean");
    }
}
