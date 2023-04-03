package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.p023ws.RealWebSocket;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0002\u0001B\u0019\u0012\u0006\u0010^\u001a\u00020]\u0012\u0006\u0010@\u001a\u00020\u001b¢\u0006\u0006\b\u0001\u0010\u0001J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J*\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0016\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0002J\u000f\u0010%\u001a\u00020\u000bH\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010'\u001a\u00020\u000bH\u0000¢\u0006\u0004\b&\u0010$J\u000f\u0010)\u001a\u00020\u000bH\u0000¢\u0006\u0004\b(\u0010$J>\u0010+\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ'\u00101\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0000¢\u0006\u0004\b/\u00100J\u001f\u00109\u001a\u0002062\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b7\u00108J\u0017\u0010?\u001a\u00020<2\u0006\u0010;\u001a\u00020:H\u0000¢\u0006\u0004\b=\u0010>J\b\u0010@\u001a\u00020\u001bH\u0016J\u0006\u0010A\u001a\u00020\u000bJ\b\u0010C\u001a\u00020BH\u0016J\u000e\u0010E\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u001dJ\u0010\u0010H\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020FH\u0016J\u0018\u0010M\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0016J\n\u0010!\u001a\u0004\u0018\u00010 H\u0016J'\u0010S\u001a\u00020\u000b2\u0006\u00103\u001a\u0002022\u0006\u0010N\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020OH\u0000¢\u0006\u0004\bQ\u0010RJ!\u0010X\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010OH\u0000¢\u0006\u0004\bV\u0010WJ\b\u0010Z\u001a\u00020YH\u0016J\b\u0010\\\u001a\u00020[H\u0016R\u0017\u0010^\u001a\u00020]8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010@\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010bR\u0018\u0010c\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010dR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010eR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bZ\u0010fR\u0018\u0010g\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\"\u0010%\u001a\u00020\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0016\u0010'\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010oR\"\u0010t\u001a\u00020\u00038\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0016\u0010z\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bz\u0010uR\u0016\u0010{\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b{\u0010uR\u0016\u0010|\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b|\u0010uR&\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0~0}8\u0006¢\u0006\u000f\n\u0005\b\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020\u001d8@X\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010q¨\u0006\u0001"}, mo44877d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "", "connectTimeout", "readTimeout", "writeTimeout", "Lokhttp3/Call;", "call", "Lokhttp3/EventListener;", "eventListener", "Lr37;", "connectTunnel", "connectSocket", "Lokhttp3/internal/connection/ConnectionSpecSelector;", "connectionSpecSelector", "pingIntervalMillis", "establishProtocol", "startHttp2", "connectTls", "Lokhttp3/Request;", "tunnelRequest", "Lokhttp3/HttpUrl;", "url", "createTunnel", "createTunnelRequest", "", "Lokhttp3/Route;", "candidates", "", "routeMatchesAny", "supportsUrl", "Lokhttp3/Handshake;", "handshake", "certificateSupportHost", "noNewExchanges$okhttp", "()V", "noNewExchanges", "noCoalescedConnections$okhttp", "noCoalescedConnections", "incrementSuccessCount$okhttp", "incrementSuccessCount", "connectionRetryEnabled", "connect", "Lokhttp3/Address;", "address", "routes", "isEligible$okhttp", "(Lokhttp3/Address;Ljava/util/List;)Z", "isEligible", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/ExchangeCodec;", "newCodec$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/http/ExchangeCodec;", "newCodec", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams$okhttp", "(Lokhttp3/internal/connection/Exchange;)Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams", "route", "cancel", "Ljava/net/Socket;", "socket", "doExtensiveChecks", "isHealthy", "Lokhttp3/internal/http2/Http2Stream;", "stream", "onStream", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Settings;", "settings", "onSettings", "failedRoute", "Ljava/io/IOException;", "failure", "connectFailed$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/Route;Ljava/io/IOException;)V", "connectFailed", "Lokhttp3/internal/connection/RealCall;", "e", "trackFailure$okhttp", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "trackFailure", "Lokhttp3/Protocol;", "protocol", "", "toString", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "getConnectionPool", "()Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/Route;", "rawSocket", "Ljava/net/Socket;", "Lokhttp3/Handshake;", "Lokhttp3/Protocol;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "Lw40;", "source", "Lw40;", "Lv40;", "sink", "Lv40;", "Z", "getNoNewExchanges", "()Z", "setNoNewExchanges", "(Z)V", "routeFailureCount", "I", "getRouteFailureCount$okhttp", "()I", "setRouteFailureCount$okhttp", "(I)V", "successCount", "refusedStreamCount", "allocationLimit", "", "Ljava/lang/ref/Reference;", "calls", "Ljava/util/List;", "getCalls", "()Ljava/util/List;", "", "idleAtNs", "J", "getIdleAtNs$okhttp", "()J", "setIdleAtNs$okhttp", "(J)V", "isMultiplexed$okhttp", "isMultiplexed", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;)V", "Companion", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: RealConnection.kt */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit = 1;
    private final List<Reference<RealCall>> calls = new ArrayList();
    private final RealConnectionPool connectionPool;
    /* access modifiers changed from: private */
    public Handshake handshake;
    private Http2Connection http2Connection;
    private long idleAtNs = Long.MAX_VALUE;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private v40 sink;
    /* access modifiers changed from: private */
    public Socket socket;
    private w40 source;
    private int successCount;

    @Metadata(mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo44877d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "()V", "IDLE_CONNECTION_HEALTHY_NS", "", "MAX_TUNNEL_ATTEMPTS", "", "NPE_THROW_WITH_NULL", "", "newTestConnection", "Lokhttp3/internal/connection/RealConnection;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "route", "Lokhttp3/Route;", "socket", "Ljava/net/Socket;", "idleAtNs", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: RealConnection.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RealConnection newTestConnection(RealConnectionPool realConnectionPool, Route route, Socket socket, long j) {
            vx2.m53591g(realConnectionPool, "connectionPool");
            vx2.m53591g(route, "route");
            vx2.m53591g(socket, "socket");
            RealConnection realConnection = new RealConnection(realConnectionPool, route);
            realConnection.socket = socket;
            realConnection.setIdleAtNs$okhttp(j);
            return realConnection;
        }
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: RealConnection.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealConnection(RealConnectionPool realConnectionPool, Route route2) {
        vx2.m53591g(realConnectionPool, "connectionPool");
        vx2.m53591g(route2, "route");
        this.connectionPool = realConnectionPool;
        this.route = route2;
    }

    private final boolean certificateSupportHost(HttpUrl httpUrl, Handshake handshake2) {
        List<Certificate> peerCertificates = handshake2.peerCertificates();
        if (!(!peerCertificates.isEmpty()) || !OkHostnameVerifier.INSTANCE.verify(httpUrl.host(), (X509Certificate) peerCertificates.get(0))) {
            return false;
        }
        return true;
    }

    private final void connectSocket(int i, int i2, Call call, EventListener eventListener) throws IOException {
        int i3;
        Socket socket2;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        Proxy.Type type = proxy.type();
        if (type == null) {
            i3 = -1;
        } else {
            i3 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i3 == 1 || i3 == 2) {
            socket2 = address.socketFactory().createSocket();
            vx2.m53588d(socket2);
        } else {
            socket2 = new Socket(proxy);
        }
        this.rawSocket = socket2;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        socket2.setSoTimeout(i2);
        try {
            Platform.Companion.get().connectSocket(socket2, this.route.socketAddress(), i);
            try {
                this.source = sg4.m71929d(sg4.m71938m(socket2));
                this.sink = sg4.m71928c(sg4.m71934i(socket2));
            } catch (NullPointerException e) {
                if (vx2.m53586b(e.getMessage(), NPE_THROW_WITH_NULL)) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException(vx2.m53598n("Failed to connect to ", this.route.socketAddress()));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void connectTls(okhttp3.internal.connection.ConnectionSpecSelector r11) throws java.io.IOException {
        /*
            r10 = this;
            okhttp3.Route r0 = r10.route
            okhttp3.Address r0 = r0.address()
            javax.net.ssl.SSLSocketFactory r1 = r0.sslSocketFactory()
            r2 = 0
            p000.vx2.m53588d(r1)     // Catch:{ all -> 0x0170 }
            java.net.Socket r3 = r10.rawSocket     // Catch:{ all -> 0x0170 }
            okhttp3.HttpUrl r4 = r0.url()     // Catch:{ all -> 0x0170 }
            java.lang.String r4 = r4.host()     // Catch:{ all -> 0x0170 }
            okhttp3.HttpUrl r5 = r0.url()     // Catch:{ all -> 0x0170 }
            int r5 = r5.port()     // Catch:{ all -> 0x0170 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ all -> 0x0170 }
            if (r1 == 0) goto L_0x0168
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x0170 }
            okhttp3.ConnectionSpec r11 = r11.configureSecureSocket(r1)     // Catch:{ all -> 0x0165 }
            boolean r3 = r11.supportsTlsExtensions()     // Catch:{ all -> 0x0165 }
            if (r3 == 0) goto L_0x0048
            okhttp3.internal.platform.Platform$Companion r3 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x0165 }
            okhttp3.internal.platform.Platform r3 = r3.get()     // Catch:{ all -> 0x0165 }
            okhttp3.HttpUrl r4 = r0.url()     // Catch:{ all -> 0x0165 }
            java.lang.String r4 = r4.host()     // Catch:{ all -> 0x0165 }
            java.util.List r5 = r0.protocols()     // Catch:{ all -> 0x0165 }
            r3.configureTlsExtensions(r1, r4, r5)     // Catch:{ all -> 0x0165 }
        L_0x0048:
            r1.startHandshake()     // Catch:{ all -> 0x0165 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x0165 }
            okhttp3.Handshake$Companion r4 = okhttp3.Handshake.Companion     // Catch:{ all -> 0x0165 }
            java.lang.String r5 = "sslSocketSession"
            p000.vx2.m53590f(r3, r5)     // Catch:{ all -> 0x0165 }
            okhttp3.Handshake r4 = r4.get(r3)     // Catch:{ all -> 0x0165 }
            javax.net.ssl.HostnameVerifier r5 = r0.hostnameVerifier()     // Catch:{ all -> 0x0165 }
            p000.vx2.m53588d(r5)     // Catch:{ all -> 0x0165 }
            okhttp3.HttpUrl r7 = r0.url()     // Catch:{ all -> 0x0165 }
            java.lang.String r7 = r7.host()     // Catch:{ all -> 0x0165 }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x0165 }
            if (r3 != 0) goto L_0x00f9
            java.util.List r11 = r4.peerCertificates()     // Catch:{ all -> 0x0165 }
            boolean r3 = r11.isEmpty()     // Catch:{ all -> 0x0165 }
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x00d5
            r3 = 0
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x0165 }
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x0165 }
            javax.net.ssl.SSLPeerUnverifiedException r3 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0165 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0165 }
            r4.<init>()     // Catch:{ all -> 0x0165 }
            java.lang.String r5 = "\n              |Hostname "
            r4.append(r5)     // Catch:{ all -> 0x0165 }
            okhttp3.HttpUrl r0 = r0.url()     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r0.host()     // Catch:{ all -> 0x0165 }
            r4.append(r0)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = " not verified:\n              |    certificate: "
            r4.append(r0)     // Catch:{ all -> 0x0165 }
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r0.pin(r11)     // Catch:{ all -> 0x0165 }
            r4.append(r0)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = "\n              |    DN: "
            r4.append(r0)     // Catch:{ all -> 0x0165 }
            java.security.Principal r0 = r11.getSubjectDN()     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0165 }
            r4.append(r0)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = "\n              |    subjectAltNames: "
            r4.append(r0)     // Catch:{ all -> 0x0165 }
            okhttp3.internal.tls.OkHostnameVerifier r0 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE     // Catch:{ all -> 0x0165 }
            java.util.List r11 = r0.allSubjectAltNames(r11)     // Catch:{ all -> 0x0165 }
            r4.append(r11)     // Catch:{ all -> 0x0165 }
            java.lang.String r11 = "\n              "
            r4.append(r11)     // Catch:{ all -> 0x0165 }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x0165 }
            java.lang.String r11 = kotlin.text.StringsKt__IndentKt.m63059h(r11, r2, r6, r2)     // Catch:{ all -> 0x0165 }
            r3.<init>(r11)     // Catch:{ all -> 0x0165 }
            throw r3     // Catch:{ all -> 0x0165 }
        L_0x00d5:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0165 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0165 }
            r2.<init>()     // Catch:{ all -> 0x0165 }
            java.lang.String r3 = "Hostname "
            r2.append(r3)     // Catch:{ all -> 0x0165 }
            okhttp3.HttpUrl r0 = r0.url()     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r0.host()     // Catch:{ all -> 0x0165 }
            r2.append(r0)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0165 }
            r11.<init>(r0)     // Catch:{ all -> 0x0165 }
            throw r11     // Catch:{ all -> 0x0165 }
        L_0x00f9:
            okhttp3.CertificatePinner r3 = r0.certificatePinner()     // Catch:{ all -> 0x0165 }
            p000.vx2.m53588d(r3)     // Catch:{ all -> 0x0165 }
            okhttp3.Handshake r5 = new okhttp3.Handshake     // Catch:{ all -> 0x0165 }
            okhttp3.TlsVersion r6 = r4.tlsVersion()     // Catch:{ all -> 0x0165 }
            okhttp3.CipherSuite r7 = r4.cipherSuite()     // Catch:{ all -> 0x0165 }
            java.util.List r8 = r4.localCertificates()     // Catch:{ all -> 0x0165 }
            okhttp3.internal.connection.RealConnection$connectTls$1 r9 = new okhttp3.internal.connection.RealConnection$connectTls$1     // Catch:{ all -> 0x0165 }
            r9.<init>(r3, r4, r0)     // Catch:{ all -> 0x0165 }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x0165 }
            r10.handshake = r5     // Catch:{ all -> 0x0165 }
            okhttp3.HttpUrl r0 = r0.url()     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r0.host()     // Catch:{ all -> 0x0165 }
            okhttp3.internal.connection.RealConnection$connectTls$2 r4 = new okhttp3.internal.connection.RealConnection$connectTls$2     // Catch:{ all -> 0x0165 }
            r4.<init>(r10)     // Catch:{ all -> 0x0165 }
            r3.check$okhttp(r0, r4)     // Catch:{ all -> 0x0165 }
            boolean r11 = r11.supportsTlsExtensions()     // Catch:{ all -> 0x0165 }
            if (r11 == 0) goto L_0x0138
            okhttp3.internal.platform.Platform$Companion r11 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x0165 }
            okhttp3.internal.platform.Platform r11 = r11.get()     // Catch:{ all -> 0x0165 }
            java.lang.String r2 = r11.getSelectedProtocol(r1)     // Catch:{ all -> 0x0165 }
        L_0x0138:
            r10.socket = r1     // Catch:{ all -> 0x0165 }
            z56 r11 = p000.sg4.m71938m(r1)     // Catch:{ all -> 0x0165 }
            w40 r11 = p000.sg4.m71929d(r11)     // Catch:{ all -> 0x0165 }
            r10.source = r11     // Catch:{ all -> 0x0165 }
            s36 r11 = p000.sg4.m71934i(r1)     // Catch:{ all -> 0x0165 }
            v40 r11 = p000.sg4.m71928c(r11)     // Catch:{ all -> 0x0165 }
            r10.sink = r11     // Catch:{ all -> 0x0165 }
            if (r2 == 0) goto L_0x0157
            okhttp3.Protocol$Companion r11 = okhttp3.Protocol.Companion     // Catch:{ all -> 0x0165 }
            okhttp3.Protocol r11 = r11.get(r2)     // Catch:{ all -> 0x0165 }
            goto L_0x0159
        L_0x0157:
            okhttp3.Protocol r11 = okhttp3.Protocol.HTTP_1_1     // Catch:{ all -> 0x0165 }
        L_0x0159:
            r10.protocol = r11     // Catch:{ all -> 0x0165 }
            okhttp3.internal.platform.Platform$Companion r11 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r11 = r11.get()
            r11.afterHandshake(r1)
            return
        L_0x0165:
            r11 = move-exception
            r2 = r1
            goto L_0x0171
        L_0x0168:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r11.<init>(r0)     // Catch:{ all -> 0x0170 }
            throw r11     // Catch:{ all -> 0x0170 }
        L_0x0170:
            r11 = move-exception
        L_0x0171:
            if (r2 == 0) goto L_0x017c
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            r0.afterHandshake(r2)
        L_0x017c:
            if (r2 != 0) goto L_0x017f
            goto L_0x0182
        L_0x017f:
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r2)
        L_0x0182:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connectTls(okhttp3.internal.connection.ConnectionSpecSelector):void");
    }

    private final void connectTunnel(int i, int i2, int i3, Call call, EventListener eventListener) throws IOException {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl url = createTunnelRequest.url();
        int i4 = 0;
        while (i4 < 21) {
            i4++;
            connectSocket(i, i2, call, eventListener);
            createTunnelRequest = createTunnel(i2, i3, createTunnelRequest, url);
            if (createTunnelRequest != null) {
                Socket socket2 = this.rawSocket;
                if (socket2 != null) {
                    Util.closeQuietly(socket2);
                }
                this.rawSocket = null;
                this.sink = null;
                this.source = null;
                eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), (Protocol) null);
            } else {
                return;
            }
        }
    }

    private final Request createTunnel(int i, int i2, Request request, HttpUrl httpUrl) throws IOException {
        String str = "CONNECT " + Util.toHostHeader(httpUrl, true) + " HTTP/1.1";
        while (true) {
            w40 w40 = this.source;
            vx2.m53588d(w40);
            v40 v40 = this.sink;
            vx2.m53588d(v40);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec((OkHttpClient) null, this, w40, v40);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            w40.timeout().timeout((long) i, timeUnit);
            v40.timeout().timeout((long) i2, timeUnit);
            http1ExchangeCodec.writeRequest(request.headers(), str);
            http1ExchangeCodec.finishRequest();
            Response.Builder readResponseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            vx2.m53588d(readResponseHeaders);
            Response build = readResponseHeaders.request(request).build();
            http1ExchangeCodec.skipConnectBody(build);
            int code = build.code();
            if (code != 200) {
                if (code == 407) {
                    Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, build);
                    if (authenticate == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if (yb6.m74344y("close", Response.header$default(build, "Connection", (String) null, 2, (Object) null), true)) {
                        return authenticate;
                    } else {
                        request = authenticate;
                    }
                } else {
                    throw new IOException(vx2.m53598n("Unexpected response code for CONNECT: ", Integer.valueOf(build.code())));
                }
            } else if (w40.mo56081r().mo56024I0() && v40.mo56081r().mo56024I0()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private final Request createTunnelRequest() throws IOException {
        Request build = new Request.Builder().url(this.route.address().url()).method("CONNECT", (RequestBody) null).header("Host", Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header(Constants.USER_AGENT_HEADER_KEY, Util.userAgent).build();
        Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(build).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1).receivedResponseAtMillis(-1).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        if (authenticate == null) {
            return build;
        }
        return authenticate;
    }

    private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i, Call call, EventListener eventListener) throws IOException {
        if (this.route.address().sslSocketFactory() == null) {
            List<Protocol> protocols = this.route.address().protocols();
            Protocol protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (protocols.contains(protocol2)) {
                this.socket = this.rawSocket;
                this.protocol = protocol2;
                startHttp2(i);
                return;
            }
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
            return;
        }
        eventListener.secureConnectStart(call);
        connectTls(connectionSpecSelector);
        eventListener.secureConnectEnd(call, this.handshake);
        if (this.protocol == Protocol.HTTP_2) {
            startHttp2(i);
        }
    }

    private final boolean routeMatchesAny(List<Route> list) {
        boolean z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Route route2 : list) {
                if (route2.proxy().type() == Proxy.Type.DIRECT && this.route.proxy().type() == Proxy.Type.DIRECT && vx2.m53586b(this.route.socketAddress(), route2.socketAddress())) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void startHttp2(int i) throws IOException {
        Socket socket2 = this.socket;
        vx2.m53588d(socket2);
        w40 w40 = this.source;
        vx2.m53588d(w40);
        v40 v40 = this.sink;
        vx2.m53588d(v40);
        socket2.setSoTimeout(0);
        Http2Connection build = new Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket2, this.route.address().url().host(), w40, v40).listener(this).pingIntervalMillis(i).build();
        this.http2Connection = build;
        this.allocationLimit = Http2Connection.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(build, false, (TaskRunner) null, 3, (Object) null);
    }

    private final boolean supportsUrl(HttpUrl httpUrl) {
        Handshake handshake2;
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            HttpUrl url = this.route.address().url();
            if (httpUrl.port() != url.port()) {
                return false;
            }
            if (vx2.m53586b(httpUrl.host(), url.host())) {
                return true;
            }
            if (this.noCoalescedConnections || (handshake2 = this.handshake) == null) {
                return false;
            }
            vx2.m53588d(handshake2);
            if (certificateSupportHost(httpUrl, handshake2)) {
                return true;
            }
            return false;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final void cancel() {
        Socket socket2 = this.rawSocket;
        if (socket2 != null) {
            Util.closeQuietly(socket2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2 A[Catch:{ IOException -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void connect(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r0 = "call"
            p000.vx2.m53591g(r8, r0)
            java.lang.String r0 = "eventListener"
            p000.vx2.m53591g(r9, r0)
            okhttp3.Protocol r0 = r7.protocol
            r10 = 1
            if (r0 != 0) goto L_0x0017
            r0 = r10
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x015c
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.connectionSpecs()
            okhttp3.internal.connection.ConnectionSpecSelector r11 = new okhttp3.internal.connection.ConnectionSpecSelector
            r11.<init>(r0)
            okhttp3.Route r1 = r7.route
            okhttp3.Address r1 = r1.address()
            javax.net.ssl.SSLSocketFactory r1 = r1.sslSocketFactory()
            if (r1 != 0) goto L_0x0086
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.CLEARTEXT
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0079
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address()
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.host()
            okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r1 = r1.get()
            boolean r1 = r1.isCleartextTrafficPermitted(r0)
            if (r1 == 0) goto L_0x0058
            goto L_0x0098
        L_0x0058:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0079:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0086:
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.protocols()
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x014f
        L_0x0098:
            r12 = 0
            r13 = r12
        L_0x009a:
            okhttp3.Route r0 = r7.route     // Catch:{ IOException -> 0x00fd }
            boolean r0 = r0.requiresTunnel()     // Catch:{ IOException -> 0x00fd }
            if (r0 == 0) goto L_0x00bb
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.connectTunnel(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00fd }
            java.net.Socket r0 = r7.rawSocket     // Catch:{ IOException -> 0x00fd }
            if (r0 != 0) goto L_0x00b6
            goto L_0x00d8
        L_0x00b6:
            r14 = r17
            r15 = r18
            goto L_0x00c2
        L_0x00bb:
            r14 = r17
            r15 = r18
            r7.connectSocket(r14, r15, r8, r9)     // Catch:{ IOException -> 0x00fb }
        L_0x00c2:
            r6 = r20
            r7.establishProtocol(r11, r6, r8, r9)     // Catch:{ IOException -> 0x00f9 }
            okhttp3.Route r0 = r7.route     // Catch:{ IOException -> 0x00f9 }
            java.net.InetSocketAddress r0 = r0.socketAddress()     // Catch:{ IOException -> 0x00f9 }
            okhttp3.Route r1 = r7.route     // Catch:{ IOException -> 0x00f9 }
            java.net.Proxy r1 = r1.proxy()     // Catch:{ IOException -> 0x00f9 }
            okhttp3.Protocol r2 = r7.protocol     // Catch:{ IOException -> 0x00f9 }
            r9.connectEnd(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f9 }
        L_0x00d8:
            okhttp3.Route r0 = r7.route
            boolean r0 = r0.requiresTunnel()
            if (r0 == 0) goto L_0x00f2
            java.net.Socket r0 = r7.rawSocket
            if (r0 == 0) goto L_0x00e5
            goto L_0x00f2
        L_0x00e5:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00f2:
            long r0 = java.lang.System.nanoTime()
            r7.idleAtNs = r0
            return
        L_0x00f9:
            r0 = move-exception
            goto L_0x0104
        L_0x00fb:
            r0 = move-exception
            goto L_0x0102
        L_0x00fd:
            r0 = move-exception
            r14 = r17
            r15 = r18
        L_0x0102:
            r6 = r20
        L_0x0104:
            java.net.Socket r1 = r7.socket
            if (r1 != 0) goto L_0x0109
            goto L_0x010c
        L_0x0109:
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r1)
        L_0x010c:
            java.net.Socket r1 = r7.rawSocket
            if (r1 != 0) goto L_0x0111
            goto L_0x0114
        L_0x0111:
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r1)
        L_0x0114:
            r7.socket = r12
            r7.rawSocket = r12
            r7.source = r12
            r7.sink = r12
            r7.handshake = r12
            r7.protocol = r12
            r7.http2Connection = r12
            r7.allocationLimit = r10
            okhttp3.Route r1 = r7.route
            java.net.InetSocketAddress r3 = r1.socketAddress()
            okhttp3.Route r1 = r7.route
            java.net.Proxy r4 = r1.proxy()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.connectFailed(r2, r3, r4, r5, r6)
            if (r13 != 0) goto L_0x0141
            okhttp3.internal.connection.RouteException r13 = new okhttp3.internal.connection.RouteException
            r13.<init>(r0)
            goto L_0x0144
        L_0x0141:
            r13.addConnectException(r0)
        L_0x0144:
            if (r21 == 0) goto L_0x014e
            boolean r0 = r11.connectionFailed(r0)
            if (r0 == 0) goto L_0x014e
            goto L_0x009a
        L_0x014e:
            throw r13
        L_0x014f:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x015c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connect(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    public final void connectFailed$okhttp(OkHttpClient okHttpClient, Route route2, IOException iOException) {
        vx2.m53591g(okHttpClient, "client");
        vx2.m53591g(route2, "failedRoute");
        vx2.m53591g(iOException, "failure");
        if (route2.proxy().type() != Proxy.Type.DIRECT) {
            Address address = route2.address();
            address.proxySelector().connectFailed(address.url().uri(), route2.proxy().address(), iOException);
        }
        okHttpClient.getRouteDatabase().failed(route2);
    }

    public final List<Reference<RealCall>> getCalls() {
        return this.calls;
    }

    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNs$okhttp() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }

    public Handshake handshake() {
        return this.handshake;
    }

    public final synchronized void incrementSuccessCount$okhttp() {
        this.successCount++;
    }

    public final boolean isEligible$okhttp(Address address, List<Route> list) {
        vx2.m53591g(address, org.web3j.abi.datatypes.Address.TYPE_NAME);
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        } else if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(address)) {
            return false;
        } else {
            if (vx2.m53586b(address.url().host(), route().address().url().host())) {
                return true;
            }
            if (this.http2Connection == null || list == null || !routeMatchesAny(list) || address.hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
                return false;
            }
            try {
                CertificatePinner certificatePinner = address.certificatePinner();
                vx2.m53588d(certificatePinner);
                String host = address.url().host();
                Handshake handshake2 = handshake();
                vx2.m53588d(handshake2);
                certificatePinner.check(host, (List<? extends Certificate>) handshake2.peerCertificates());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
    }

    public final boolean isHealthy(boolean z) {
        long idleAtNs$okhttp;
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            long nanoTime = System.nanoTime();
            Socket socket2 = this.rawSocket;
            vx2.m53588d(socket2);
            Socket socket3 = this.socket;
            vx2.m53588d(socket3);
            w40 w40 = this.source;
            vx2.m53588d(w40);
            if (socket2.isClosed() || socket3.isClosed() || socket3.isInputShutdown() || socket3.isOutputShutdown()) {
                return false;
            }
            Http2Connection http2Connection2 = this.http2Connection;
            if (http2Connection2 != null) {
                return http2Connection2.isHealthy(nanoTime);
            }
            synchronized (this) {
                idleAtNs$okhttp = nanoTime - getIdleAtNs$okhttp();
            }
            if (idleAtNs$okhttp < IDLE_CONNECTION_HEALTHY_NS || !z) {
                return true;
            }
            return Util.isHealthy(socket3, w40);
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final boolean isMultiplexed$okhttp() {
        if (this.http2Connection != null) {
            return true;
        }
        return false;
    }

    public final ExchangeCodec newCodec$okhttp(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) throws SocketException {
        vx2.m53591g(okHttpClient, "client");
        vx2.m53591g(realInterceptorChain, "chain");
        Socket socket2 = this.socket;
        vx2.m53588d(socket2);
        w40 w40 = this.source;
        vx2.m53588d(w40);
        v40 v40 = this.sink;
        vx2.m53588d(v40);
        Http2Connection http2Connection2 = this.http2Connection;
        if (http2Connection2 != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection2);
        }
        socket2.setSoTimeout(realInterceptorChain.readTimeoutMillis());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        w40.timeout().timeout((long) realInterceptorChain.getReadTimeoutMillis$okhttp(), timeUnit);
        v40.timeout().timeout((long) realInterceptorChain.getWriteTimeoutMillis$okhttp(), timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, w40, v40);
    }

    public final RealWebSocket.Streams newWebSocketStreams$okhttp(Exchange exchange) throws SocketException {
        vx2.m53591g(exchange, "exchange");
        Socket socket2 = this.socket;
        vx2.m53588d(socket2);
        w40 w40 = this.source;
        vx2.m53588d(w40);
        v40 v40 = this.sink;
        vx2.m53588d(v40);
        socket2.setSoTimeout(0);
        noNewExchanges$okhttp();
        return new RealConnection$newWebSocketStreams$1(w40, v40, exchange);
    }

    public final synchronized void noCoalescedConnections$okhttp() {
        this.noCoalescedConnections = true;
    }

    public final synchronized void noNewExchanges$okhttp() {
        this.noNewExchanges = true;
    }

    public synchronized void onSettings(Http2Connection http2Connection2, Settings settings) {
        vx2.m53591g(http2Connection2, "connection");
        vx2.m53591g(settings, "settings");
        this.allocationLimit = settings.getMaxConcurrentStreams();
    }

    public void onStream(Http2Stream http2Stream) throws IOException {
        vx2.m53591g(http2Stream, "stream");
        http2Stream.close(ErrorCode.REFUSED_STREAM, (IOException) null);
    }

    public Protocol protocol() {
        Protocol protocol2 = this.protocol;
        vx2.m53588d(protocol2);
        return protocol2;
    }

    public Route route() {
        return this.route;
    }

    public final void setIdleAtNs$okhttp(long j) {
        this.idleAtNs = j;
    }

    public final void setNoNewExchanges(boolean z) {
        this.noNewExchanges = z;
    }

    public final void setRouteFailureCount$okhttp(int i) {
        this.routeFailureCount = i;
    }

    public Socket socket() {
        Socket socket2 = this.socket;
        vx2.m53588d(socket2);
        return socket2;
    }

    public String toString() {
        Object cipherSuite;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.route.address().url().host());
        sb.append(':');
        sb.append(this.route.address().url().port());
        sb.append(", proxy=");
        sb.append(this.route.proxy());
        sb.append(" hostAddress=");
        sb.append(this.route.socketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake2 = this.handshake;
        Object obj = "none";
        if (!(handshake2 == null || (cipherSuite = handshake2.cipherSuite()) == null)) {
            obj = cipherSuite;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public final synchronized void trackFailure$okhttp(RealCall realCall, IOException iOException) {
        vx2.m53591g(realCall, "call");
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                int i = this.refusedStreamCount + 1;
                this.refusedStreamCount = i;
                if (i > 1) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !realCall.isCanceled()) {
                this.noNewExchanges = true;
                this.routeFailureCount++;
            }
        } else if (!isMultiplexed$okhttp() || (iOException instanceof ConnectionShutdownException)) {
            this.noNewExchanges = true;
            if (this.successCount == 0) {
                if (iOException != null) {
                    connectFailed$okhttp(realCall.getClient(), this.route, iOException);
                }
                this.routeFailureCount++;
            }
        }
    }
}
