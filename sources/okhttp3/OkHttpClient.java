package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.p023ws.RealWebSocket;
import okhttp3.internal.p023ws.WebSocketExtensions;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0001\u0001B\u0014\b\u0000\u0012\u0007\u0010\u0001\u001a\u00020\u000e¢\u0006\u0006\b\u0001\u0010\u0001B\u000b\b\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000f\u0010\u0013\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010&\u001a\u00020#H\u0007¢\u0006\u0004\b$\u0010%J\u000f\u0010*\u001a\u00020'H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020#H\u0007¢\u0006\u0004\b+\u0010%J\u000f\u0010.\u001a\u00020#H\u0007¢\u0006\u0004\b-\u0010%J\u000f\u00102\u001a\u00020/H\u0007¢\u0006\u0004\b0\u00101J\u0011\u00106\u001a\u0004\u0018\u000103H\u0007¢\u0006\u0004\b4\u00105J\u000f\u0010:\u001a\u000207H\u0007¢\u0006\u0004\b8\u00109J\u0011\u0010>\u001a\u0004\u0018\u00010;H\u0007¢\u0006\u0004\b<\u0010=J\u000f\u0010B\u001a\u00020?H\u0007¢\u0006\u0004\b@\u0010AJ\u000f\u0010D\u001a\u00020'H\u0007¢\u0006\u0004\bC\u0010)J\u000f\u0010H\u001a\u00020EH\u0007¢\u0006\u0004\bF\u0010GJ\u000f\u0010L\u001a\u00020IH\u0007¢\u0006\u0004\bJ\u0010KJ\u0015\u0010O\u001a\b\u0012\u0004\u0012\u00020M0\u0018H\u0007¢\u0006\u0004\bN\u0010\u001bJ\u0015\u0010R\u001a\b\u0012\u0004\u0012\u00020P0\u0018H\u0007¢\u0006\u0004\bQ\u0010\u001bJ\u000f\u0010V\u001a\u00020SH\u0007¢\u0006\u0004\bT\u0010UJ\u000f\u0010Z\u001a\u00020WH\u0007¢\u0006\u0004\bX\u0010YJ\u000f\u0010^\u001a\u00020[H\u0007¢\u0006\u0004\b\\\u0010]J\u000f\u0010`\u001a\u00020[H\u0007¢\u0006\u0004\b_\u0010]J\u000f\u0010b\u001a\u00020[H\u0007¢\u0006\u0004\ba\u0010]J\u000f\u0010d\u001a\u00020[H\u0007¢\u0006\u0004\bc\u0010]J\u000f\u0010f\u001a\u00020[H\u0007¢\u0006\u0004\be\u0010]R\u0017\u0010\u0013\u001a\u00020\u00108G¢\u0006\f\n\u0004\b\u0013\u0010g\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148G¢\u0006\f\n\u0004\b\u0017\u0010h\u001a\u0004\b\u0017\u0010\u0016R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188G¢\u0006\f\n\u0004\b\u001c\u0010i\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188G¢\u0006\f\n\u0004\b\u001e\u0010i\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001f8G¢\u0006\f\n\u0004\b\"\u0010j\u001a\u0004\b\"\u0010!R\u0017\u0010&\u001a\u00020#8G¢\u0006\f\n\u0004\b&\u0010k\u001a\u0004\b&\u0010%R\u0017\u0010*\u001a\u00020'8G¢\u0006\f\n\u0004\b*\u0010l\u001a\u0004\b*\u0010)R\u0017\u0010,\u001a\u00020#8G¢\u0006\f\n\u0004\b,\u0010k\u001a\u0004\b,\u0010%R\u0017\u0010.\u001a\u00020#8G¢\u0006\f\n\u0004\b.\u0010k\u001a\u0004\b.\u0010%R\u0017\u00102\u001a\u00020/8G¢\u0006\f\n\u0004\b2\u0010m\u001a\u0004\b2\u00101R\u0019\u00106\u001a\u0004\u0018\u0001038G¢\u0006\f\n\u0004\b6\u0010n\u001a\u0004\b6\u00105R\u0017\u0010:\u001a\u0002078G¢\u0006\f\n\u0004\b:\u0010o\u001a\u0004\b:\u00109R\u0019\u0010>\u001a\u0004\u0018\u00010;8G¢\u0006\f\n\u0004\b>\u0010p\u001a\u0004\b>\u0010=R\u0017\u0010B\u001a\u00020?8G¢\u0006\f\n\u0004\bB\u0010q\u001a\u0004\bB\u0010AR\u0017\u0010D\u001a\u00020'8G¢\u0006\f\n\u0004\bD\u0010l\u001a\u0004\bD\u0010)R\u0017\u0010H\u001a\u00020E8G¢\u0006\f\n\u0004\bH\u0010r\u001a\u0004\bH\u0010GR\u0016\u0010s\u001a\u0004\u0018\u00010I8\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0019\u0010v\u001a\u0004\u0018\u00010u8G¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bv\u0010xR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020M0\u00188G¢\u0006\f\n\u0004\bO\u0010i\u001a\u0004\bO\u0010\u001bR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020P0\u00188G¢\u0006\f\n\u0004\bR\u0010i\u001a\u0004\bR\u0010\u001bR\u0017\u0010V\u001a\u00020S8G¢\u0006\f\n\u0004\bV\u0010y\u001a\u0004\bV\u0010UR\u0017\u0010Z\u001a\u00020W8G¢\u0006\f\n\u0004\bZ\u0010z\u001a\u0004\bZ\u0010YR\u0019\u0010|\u001a\u0004\u0018\u00010{8G¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b|\u0010~R\u0017\u0010^\u001a\u00020[8G¢\u0006\f\n\u0004\b^\u0010\u001a\u0004\b^\u0010]R\u0017\u0010`\u001a\u00020[8G¢\u0006\f\n\u0004\b`\u0010\u001a\u0004\b`\u0010]R\u0017\u0010b\u001a\u00020[8G¢\u0006\f\n\u0004\bb\u0010\u001a\u0004\bb\u0010]R\u0017\u0010d\u001a\u00020[8G¢\u0006\f\n\u0004\bd\u0010\u001a\u0004\bd\u0010]R\u0017\u0010f\u001a\u00020[8G¢\u0006\f\n\u0004\bf\u0010\u001a\u0004\bf\u0010]R\u001d\u0010\u0001\u001a\u00030\u00018G¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00030\u00018\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0011\u0010L\u001a\u00020I8G¢\u0006\u0006\u001a\u0004\bL\u0010K¨\u0006\u0001"}, mo44877d2 = {"Lokhttp3/OkHttpClient;", "", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "Lr37;", "verifyClientState", "Lokhttp3/Request;", "request", "Lokhttp3/Call;", "newCall", "Lokhttp3/WebSocketListener;", "listener", "Lokhttp3/WebSocket;", "newWebSocket", "Lokhttp3/OkHttpClient$Builder;", "newBuilder", "Lokhttp3/Dispatcher;", "-deprecated_dispatcher", "()Lokhttp3/Dispatcher;", "dispatcher", "Lokhttp3/ConnectionPool;", "-deprecated_connectionPool", "()Lokhttp3/ConnectionPool;", "connectionPool", "", "Lokhttp3/Interceptor;", "-deprecated_interceptors", "()Ljava/util/List;", "interceptors", "-deprecated_networkInterceptors", "networkInterceptors", "Lokhttp3/EventListener$Factory;", "-deprecated_eventListenerFactory", "()Lokhttp3/EventListener$Factory;", "eventListenerFactory", "", "-deprecated_retryOnConnectionFailure", "()Z", "retryOnConnectionFailure", "Lokhttp3/Authenticator;", "-deprecated_authenticator", "()Lokhttp3/Authenticator;", "authenticator", "-deprecated_followRedirects", "followRedirects", "-deprecated_followSslRedirects", "followSslRedirects", "Lokhttp3/CookieJar;", "-deprecated_cookieJar", "()Lokhttp3/CookieJar;", "cookieJar", "Lokhttp3/Cache;", "-deprecated_cache", "()Lokhttp3/Cache;", "cache", "Lokhttp3/Dns;", "-deprecated_dns", "()Lokhttp3/Dns;", "dns", "Ljava/net/Proxy;", "-deprecated_proxy", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "-deprecated_proxySelector", "()Ljava/net/ProxySelector;", "proxySelector", "-deprecated_proxyAuthenticator", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "-deprecated_socketFactory", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "-deprecated_sslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Lokhttp3/ConnectionSpec;", "-deprecated_connectionSpecs", "connectionSpecs", "Lokhttp3/Protocol;", "-deprecated_protocols", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "-deprecated_hostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "-deprecated_certificatePinner", "()Lokhttp3/CertificatePinner;", "certificatePinner", "", "-deprecated_callTimeoutMillis", "()I", "callTimeoutMillis", "-deprecated_connectTimeoutMillis", "connectTimeoutMillis", "-deprecated_readTimeoutMillis", "readTimeoutMillis", "-deprecated_writeTimeoutMillis", "writeTimeoutMillis", "-deprecated_pingIntervalMillis", "pingIntervalMillis", "Lokhttp3/Dispatcher;", "Lokhttp3/ConnectionPool;", "Ljava/util/List;", "Lokhttp3/EventListener$Factory;", "Z", "Lokhttp3/Authenticator;", "Lokhttp3/CookieJar;", "Lokhttp3/Cache;", "Lokhttp3/Dns;", "Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "Ljavax/net/SocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/HostnameVerifier;", "Lokhttp3/CertificatePinner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "I", "", "minWebSocketMessageToCompress", "J", "()J", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase", "()Lokhttp3/internal/connection/RouteDatabase;", "builder", "<init>", "(Lokhttp3/OkHttpClient$Builder;)V", "()V", "Companion", "Builder", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: OkHttpClient.kt */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);
    /* access modifiers changed from: private */
    public static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);
    private final Authenticator authenticator;
    private final Cache cache;
    private final int callTimeoutMillis;
    private final CertificateChainCleaner certificateChainCleaner;
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final ConnectionPool connectionPool;
    private final List<ConnectionSpec> connectionSpecs;
    private final CookieJar cookieJar;
    private final Dispatcher dispatcher;
    private final Dns dns;
    private final EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final HostnameVerifier hostnameVerifier;
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final RouteDatabase routeDatabase;
    private final SocketFactory socketFactory;
    /* access modifiers changed from: private */
    public final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManager;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b]\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001B\u0014\b\u0010\u0012\u0007\u0010È\u0001\u001a\u00020G¢\u0006\u0006\bÆ\u0001\u0010É\u0001J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007J)\u0010\n\u001a\u00020\u00002\u0014\b\u0004\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007J)\u0010\u0012\u001a\u00020\u00002\u0014\b\u0004\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0018J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0018J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fJ\u0010\u0010\"\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#J\u0010\u0010&\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010%J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u001aJ\u000e\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*J\u0010\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,H\u0007J\u0016\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.J\u0014\u00102\u001a\u00020\u00002\f\u00102\u001a\b\u0012\u0004\u0012\u00020100J\u0014\u00104\u001a\u00020\u00002\f\u00104\u001a\b\u0012\u0004\u0012\u00020300J\u000e\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u000205J\u000e\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u000207J\u0016\u0010=\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;J\u0010\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>H\u0007J\u0016\u0010@\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;J\u0010\u0010@\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>H\u0007J\u0016\u0010A\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;J\u0010\u0010A\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>H\u0007J\u0016\u0010B\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;J\u0010\u0010B\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>H\u0007J\u0016\u0010D\u001a\u00020\u00002\u0006\u0010C\u001a\u0002092\u0006\u0010<\u001a\u00020;J\u0010\u0010D\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>H\u0007J\u000e\u0010F\u001a\u00020\u00002\u0006\u0010E\u001a\u000209J\u0006\u0010H\u001a\u00020GR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010S\u001a\u0004\bT\u0010UR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0004¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\bV\u0010UR\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010\u0019\u001a\u00020\u00188\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010\u001c\u001a\u00020\u00188\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\\\u001a\u0004\bf\u0010^\"\u0004\bg\u0010`R\"\u0010\u001e\u001a\u00020\u00188\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\\\u001a\u0004\bh\u0010^\"\u0004\bi\u0010`R\"\u0010 \u001a\u00020\u001f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b \u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u0010\"\u001a\u0004\u0018\u00010!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\"\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010$\u001a\u00020#8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b$\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010&\u001a\u0004\u0018\u00010%8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b&\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R'\u0010(\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u000e¢\u0006\u0015\n\u0004\b(\u0010~\u001a\u0005\b\u0010\u0001\"\u0006\b\u0001\u0010\u0001R$\u0010)\u001a\u00020\u001a8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0004\b)\u0010a\u001a\u0005\b\u0001\u0010c\"\u0005\b\u0001\u0010eR'\u0010+\u001a\u00020*8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b+\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u0004\u0018\u00010.8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0000@\u0000X\u000e¢\u0006\u0015\n\u0004\b2\u0010S\u001a\u0005\b\u0001\u0010U\"\u0006\b\u0001\u0010\u0001R+\u00104\u001a\b\u0012\u0004\u0012\u000203008\u0000@\u0000X\u000e¢\u0006\u0015\n\u0004\b4\u0010S\u001a\u0005\b\u0001\u0010U\"\u0006\b\u0001\u0010\u0001R'\u00106\u001a\u0002058\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b6\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R'\u00108\u001a\u0002078\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b8\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R,\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R(\u0010=\u001a\u00030¬\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b=\u0010­\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R(\u0010@\u001a\u00030¬\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b@\u0010­\u0001\u001a\u0006\b²\u0001\u0010¯\u0001\"\u0006\b³\u0001\u0010±\u0001R(\u0010A\u001a\u00030¬\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bA\u0010­\u0001\u001a\u0006\b´\u0001\u0010¯\u0001\"\u0006\bµ\u0001\u0010±\u0001R(\u0010B\u001a\u00030¬\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bB\u0010­\u0001\u001a\u0006\b¶\u0001\u0010¯\u0001\"\u0006\b·\u0001\u0010±\u0001R(\u0010D\u001a\u00030¬\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bD\u0010­\u0001\u001a\u0006\b¸\u0001\u0010¯\u0001\"\u0006\b¹\u0001\u0010±\u0001R'\u0010F\u001a\u0002098\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bF\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R,\u0010À\u0001\u001a\u0005\u0018\u00010¿\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001\u0002\u0007\n\u0005\b20\u0001¨\u0006Ê\u0001"}, mo44877d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/Dispatcher;", "dispatcher", "Lokhttp3/ConnectionPool;", "connectionPool", "", "Lokhttp3/Interceptor;", "interceptors", "interceptor", "addInterceptor", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lokhttp3/Response;", "block", "-addInterceptor", "(Lrc2;)Lokhttp3/OkHttpClient$Builder;", "networkInterceptors", "addNetworkInterceptor", "-addNetworkInterceptor", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener$Factory;", "eventListenerFactory", "", "retryOnConnectionFailure", "Lokhttp3/Authenticator;", "authenticator", "followRedirects", "followProtocolRedirects", "followSslRedirects", "Lokhttp3/CookieJar;", "cookieJar", "Lokhttp3/Cache;", "cache", "Lokhttp3/Dns;", "dns", "Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "proxySelector", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "", "Lokhttp3/ConnectionSpec;", "connectionSpecs", "Lokhttp3/Protocol;", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "certificatePinner", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "callTimeout", "Ljava/time/Duration;", "duration", "connectTimeout", "readTimeout", "writeTimeout", "interval", "pingInterval", "bytes", "minWebSocketMessageToCompress", "Lokhttp3/OkHttpClient;", "build", "Lokhttp3/Dispatcher;", "getDispatcher$okhttp", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "Lokhttp3/ConnectionPool;", "getConnectionPool$okhttp", "()Lokhttp3/ConnectionPool;", "setConnectionPool$okhttp", "(Lokhttp3/ConnectionPool;)V", "Ljava/util/List;", "getInterceptors$okhttp", "()Ljava/util/List;", "getNetworkInterceptors$okhttp", "Lokhttp3/EventListener$Factory;", "getEventListenerFactory$okhttp", "()Lokhttp3/EventListener$Factory;", "setEventListenerFactory$okhttp", "(Lokhttp3/EventListener$Factory;)V", "Z", "getRetryOnConnectionFailure$okhttp", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "Lokhttp3/Authenticator;", "getAuthenticator$okhttp", "()Lokhttp3/Authenticator;", "setAuthenticator$okhttp", "(Lokhttp3/Authenticator;)V", "getFollowRedirects$okhttp", "setFollowRedirects$okhttp", "getFollowSslRedirects$okhttp", "setFollowSslRedirects$okhttp", "Lokhttp3/CookieJar;", "getCookieJar$okhttp", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "setCache$okhttp", "(Lokhttp3/Cache;)V", "Lokhttp3/Dns;", "getDns$okhttp", "()Lokhttp3/Dns;", "setDns$okhttp", "(Lokhttp3/Dns;)V", "Ljava/net/Proxy;", "getProxy$okhttp", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "getProxySelector$okhttp", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "getProxyAuthenticator$okhttp", "setProxyAuthenticator$okhttp", "Ljavax/net/SocketFactory;", "getSocketFactory$okhttp", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull$okhttp", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "x509TrustManagerOrNull", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManagerOrNull$okhttp", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "getConnectionSpecs$okhttp", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "getProtocols$okhttp", "setProtocols$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier$okhttp", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lokhttp3/CertificatePinner;", "getCertificatePinner$okhttp", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp", "(Lokhttp3/CertificatePinner;)V", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "setCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)V", "", "I", "getCallTimeout$okhttp", "()I", "setCallTimeout$okhttp", "(I)V", "getConnectTimeout$okhttp", "setConnectTimeout$okhttp", "getReadTimeout$okhttp", "setReadTimeout$okhttp", "getWriteTimeout$okhttp", "setWriteTimeout$okhttp", "getPingInterval$okhttp", "setPingInterval$okhttp", "J", "getMinWebSocketMessageToCompress$okhttp", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase$okhttp", "()Lokhttp3/internal/connection/RouteDatabase;", "setRouteDatabase$okhttp", "(Lokhttp3/internal/connection/RouteDatabase;)V", "<init>", "()V", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: OkHttpClient.kt */
    public static final class Builder {
        private Authenticator authenticator;
        private Cache cache;
        private int callTimeout;
        private CertificateChainCleaner certificateChainCleaner;
        private CertificatePinner certificatePinner;
        private int connectTimeout;
        private ConnectionPool connectionPool;
        private List<ConnectionSpec> connectionSpecs;
        private CookieJar cookieJar;
        private Dispatcher dispatcher;
        private Dns dns;
        private EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;
        private HostnameVerifier hostnameVerifier;
        private final List<Interceptor> interceptors;
        private long minWebSocketMessageToCompress;
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;
        private List<? extends Protocol> protocols;
        private Proxy proxy;
        private Authenticator proxyAuthenticator;
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        private RouteDatabase routeDatabase;
        private SocketFactory socketFactory;
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;
        private X509TrustManager x509TrustManagerOrNull;

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Util.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            Authenticator authenticator2 = Authenticator.NONE;
            this.authenticator = authenticator2;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = authenticator2;
            SocketFactory socketFactory2 = SocketFactory.getDefault();
            vx2.m53590f(socketFactory2, "getDefault()");
            this.socketFactory = socketFactory2;
            Companion companion = OkHttpClient.Companion;
            this.connectionSpecs = companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }

        /* renamed from: -addInterceptor  reason: not valid java name */
        public final Builder m75756addInterceptor(rc2<? super Interceptor.Chain, Response> rc2) {
            vx2.m53591g(rc2, "block");
            return addInterceptor(new OkHttpClient$Builder$addInterceptor$2(rc2));
        }

        /* renamed from: -addNetworkInterceptor  reason: not valid java name */
        public final Builder m75757addNetworkInterceptor(rc2<? super Interceptor.Chain, Response> rc2) {
            vx2.m53591g(rc2, "block");
            return addNetworkInterceptor(new OkHttpClient$Builder$addNetworkInterceptor$2(rc2));
        }

        public final Builder addInterceptor(Interceptor interceptor) {
            vx2.m53591g(interceptor, "interceptor");
            getInterceptors$okhttp().add(interceptor);
            return this;
        }

        public final Builder addNetworkInterceptor(Interceptor interceptor) {
            vx2.m53591g(interceptor, "interceptor");
            getNetworkInterceptors$okhttp().add(interceptor);
            return this;
        }

        public final Builder authenticator(Authenticator authenticator2) {
            vx2.m53591g(authenticator2, "authenticator");
            setAuthenticator$okhttp(authenticator2);
            return this;
        }

        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        public final Builder cache(Cache cache2) {
            setCache$okhttp(cache2);
            return this;
        }

        public final Builder callTimeout(long j, TimeUnit timeUnit) {
            vx2.m53591g(timeUnit, "unit");
            setCallTimeout$okhttp(Util.checkDuration("timeout", j, timeUnit));
            return this;
        }

        public final Builder certificatePinner(CertificatePinner certificatePinner2) {
            vx2.m53591g(certificatePinner2, "certificatePinner");
            if (!vx2.m53586b(certificatePinner2, getCertificatePinner$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setCertificatePinner$okhttp(certificatePinner2);
            return this;
        }

        public final Builder connectTimeout(long j, TimeUnit timeUnit) {
            vx2.m53591g(timeUnit, "unit");
            setConnectTimeout$okhttp(Util.checkDuration("timeout", j, timeUnit));
            return this;
        }

        public final Builder connectionPool(ConnectionPool connectionPool2) {
            vx2.m53591g(connectionPool2, "connectionPool");
            setConnectionPool$okhttp(connectionPool2);
            return this;
        }

        public final Builder connectionSpecs(List<ConnectionSpec> list) {
            vx2.m53591g(list, "connectionSpecs");
            if (!vx2.m53586b(list, getConnectionSpecs$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setConnectionSpecs$okhttp(Util.toImmutableList(list));
            return this;
        }

        public final Builder cookieJar(CookieJar cookieJar2) {
            vx2.m53591g(cookieJar2, "cookieJar");
            setCookieJar$okhttp(cookieJar2);
            return this;
        }

        public final Builder dispatcher(Dispatcher dispatcher2) {
            vx2.m53591g(dispatcher2, "dispatcher");
            setDispatcher$okhttp(dispatcher2);
            return this;
        }

        public final Builder dns(Dns dns2) {
            vx2.m53591g(dns2, "dns");
            if (!vx2.m53586b(dns2, getDns$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setDns$okhttp(dns2);
            return this;
        }

        public final Builder eventListener(EventListener eventListener) {
            vx2.m53591g(eventListener, "eventListener");
            setEventListenerFactory$okhttp(Util.asFactory(eventListener));
            return this;
        }

        public final Builder eventListenerFactory(EventListener.Factory factory) {
            vx2.m53591g(factory, "eventListenerFactory");
            setEventListenerFactory$okhttp(factory);
            return this;
        }

        public final Builder followRedirects(boolean z) {
            setFollowRedirects$okhttp(z);
            return this;
        }

        public final Builder followSslRedirects(boolean z) {
            setFollowSslRedirects$okhttp(z);
            return this;
        }

        public final Authenticator getAuthenticator$okhttp() {
            return this.authenticator;
        }

        public final Cache getCache$okhttp() {
            return this.cache;
        }

        public final int getCallTimeout$okhttp() {
            return this.callTimeout;
        }

        public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            return this.certificateChainCleaner;
        }

        public final CertificatePinner getCertificatePinner$okhttp() {
            return this.certificatePinner;
        }

        public final int getConnectTimeout$okhttp() {
            return this.connectTimeout;
        }

        public final ConnectionPool getConnectionPool$okhttp() {
            return this.connectionPool;
        }

        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        public final CookieJar getCookieJar$okhttp() {
            return this.cookieJar;
        }

        public final Dispatcher getDispatcher$okhttp() {
            return this.dispatcher;
        }

        public final Dns getDns$okhttp() {
            return this.dns;
        }

        public final EventListener.Factory getEventListenerFactory$okhttp() {
            return this.eventListenerFactory;
        }

        public final boolean getFollowRedirects$okhttp() {
            return this.followRedirects;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            return this.followSslRedirects;
        }

        public final HostnameVerifier getHostnameVerifier$okhttp() {
            return this.hostnameVerifier;
        }

        public final List<Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
            return this.minWebSocketMessageToCompress;
        }

        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        public final int getPingInterval$okhttp() {
            return this.pingInterval;
        }

        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        public final Proxy getProxy$okhttp() {
            return this.proxy;
        }

        public final Authenticator getProxyAuthenticator$okhttp() {
            return this.proxyAuthenticator;
        }

        public final ProxySelector getProxySelector$okhttp() {
            return this.proxySelector;
        }

        public final int getReadTimeout$okhttp() {
            return this.readTimeout;
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            return this.retryOnConnectionFailure;
        }

        public final RouteDatabase getRouteDatabase$okhttp() {
            return this.routeDatabase;
        }

        public final SocketFactory getSocketFactory$okhttp() {
            return this.socketFactory;
        }

        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            return this.sslSocketFactoryOrNull;
        }

        public final int getWriteTimeout$okhttp() {
            return this.writeTimeout;
        }

        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            return this.x509TrustManagerOrNull;
        }

        public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier2) {
            vx2.m53591g(hostnameVerifier2, "hostnameVerifier");
            if (!vx2.m53586b(hostnameVerifier2, getHostnameVerifier$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setHostnameVerifier$okhttp(hostnameVerifier2);
            return this;
        }

        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        public final Builder minWebSocketMessageToCompress(long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                setMinWebSocketMessageToCompress$okhttp(j);
                return this;
            }
            throw new IllegalArgumentException(vx2.m53598n("minWebSocketMessageToCompress must be positive: ", Long.valueOf(j)).toString());
        }

        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        public final Builder pingInterval(long j, TimeUnit timeUnit) {
            vx2.m53591g(timeUnit, "unit");
            setPingInterval$okhttp(Util.checkDuration("interval", j, timeUnit));
            return this;
        }

        public final Builder protocols(List<? extends Protocol> list) {
            boolean z;
            vx2.m53591g(list, "protocols");
            List<T> M0 = CollectionsKt___CollectionsKt.m47313M0(list);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            boolean z2 = false;
            if (M0.contains(protocol) || M0.contains(Protocol.HTTP_1_1)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (!M0.contains(protocol) || M0.size() <= 1) {
                    z2 = true;
                }
                if (!z2) {
                    throw new IllegalArgumentException(vx2.m53598n("protocols containing h2_prior_knowledge cannot use other protocols: ", M0).toString());
                } else if (!(!M0.contains(Protocol.HTTP_1_0))) {
                    throw new IllegalArgumentException(vx2.m53598n("protocols must not contain http/1.0: ", M0).toString());
                } else if (!M0.contains((Object) null)) {
                    M0.remove(Protocol.SPDY_3);
                    if (!vx2.m53586b(M0, getProtocols$okhttp())) {
                        setRouteDatabase$okhttp((RouteDatabase) null);
                    }
                    List<T> unmodifiableList = Collections.unmodifiableList(M0);
                    vx2.m53590f(unmodifiableList, "unmodifiableList(protocolsCopy)");
                    setProtocols$okhttp(unmodifiableList);
                    return this;
                } else {
                    throw new IllegalArgumentException("protocols must not contain null".toString());
                }
            } else {
                throw new IllegalArgumentException(vx2.m53598n("protocols must contain h2_prior_knowledge or http/1.1: ", M0).toString());
            }
        }

        public final Builder proxy(Proxy proxy2) {
            if (!vx2.m53586b(proxy2, getProxy$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setProxy$okhttp(proxy2);
            return this;
        }

        public final Builder proxyAuthenticator(Authenticator authenticator2) {
            vx2.m53591g(authenticator2, "proxyAuthenticator");
            if (!vx2.m53586b(authenticator2, getProxyAuthenticator$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setProxyAuthenticator$okhttp(authenticator2);
            return this;
        }

        public final Builder proxySelector(ProxySelector proxySelector2) {
            vx2.m53591g(proxySelector2, "proxySelector");
            if (!vx2.m53586b(proxySelector2, getProxySelector$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setProxySelector$okhttp(proxySelector2);
            return this;
        }

        public final Builder readTimeout(long j, TimeUnit timeUnit) {
            vx2.m53591g(timeUnit, "unit");
            setReadTimeout$okhttp(Util.checkDuration("timeout", j, timeUnit));
            return this;
        }

        public final Builder retryOnConnectionFailure(boolean z) {
            setRetryOnConnectionFailure$okhttp(z);
            return this;
        }

        public final void setAuthenticator$okhttp(Authenticator authenticator2) {
            vx2.m53591g(authenticator2, "<set-?>");
            this.authenticator = authenticator2;
        }

        public final void setCache$okhttp(Cache cache2) {
            this.cache = cache2;
        }

        public final void setCallTimeout$okhttp(int i) {
            this.callTimeout = i;
        }

        public final void setCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner2) {
            this.certificateChainCleaner = certificateChainCleaner2;
        }

        public final void setCertificatePinner$okhttp(CertificatePinner certificatePinner2) {
            vx2.m53591g(certificatePinner2, "<set-?>");
            this.certificatePinner = certificatePinner2;
        }

        public final void setConnectTimeout$okhttp(int i) {
            this.connectTimeout = i;
        }

        public final void setConnectionPool$okhttp(ConnectionPool connectionPool2) {
            vx2.m53591g(connectionPool2, "<set-?>");
            this.connectionPool = connectionPool2;
        }

        public final void setConnectionSpecs$okhttp(List<ConnectionSpec> list) {
            vx2.m53591g(list, "<set-?>");
            this.connectionSpecs = list;
        }

        public final void setCookieJar$okhttp(CookieJar cookieJar2) {
            vx2.m53591g(cookieJar2, "<set-?>");
            this.cookieJar = cookieJar2;
        }

        public final void setDispatcher$okhttp(Dispatcher dispatcher2) {
            vx2.m53591g(dispatcher2, "<set-?>");
            this.dispatcher = dispatcher2;
        }

        public final void setDns$okhttp(Dns dns2) {
            vx2.m53591g(dns2, "<set-?>");
            this.dns = dns2;
        }

        public final void setEventListenerFactory$okhttp(EventListener.Factory factory) {
            vx2.m53591g(factory, "<set-?>");
            this.eventListenerFactory = factory;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            this.followRedirects = z;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            this.followSslRedirects = z;
        }

        public final void setHostnameVerifier$okhttp(HostnameVerifier hostnameVerifier2) {
            vx2.m53591g(hostnameVerifier2, "<set-?>");
            this.hostnameVerifier = hostnameVerifier2;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j) {
            this.minWebSocketMessageToCompress = j;
        }

        public final void setPingInterval$okhttp(int i) {
            this.pingInterval = i;
        }

        public final void setProtocols$okhttp(List<? extends Protocol> list) {
            vx2.m53591g(list, "<set-?>");
            this.protocols = list;
        }

        public final void setProxy$okhttp(Proxy proxy2) {
            this.proxy = proxy2;
        }

        public final void setProxyAuthenticator$okhttp(Authenticator authenticator2) {
            vx2.m53591g(authenticator2, "<set-?>");
            this.proxyAuthenticator = authenticator2;
        }

        public final void setProxySelector$okhttp(ProxySelector proxySelector2) {
            this.proxySelector = proxySelector2;
        }

        public final void setReadTimeout$okhttp(int i) {
            this.readTimeout = i;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            this.retryOnConnectionFailure = z;
        }

        public final void setRouteDatabase$okhttp(RouteDatabase routeDatabase2) {
            this.routeDatabase = routeDatabase2;
        }

        public final void setSocketFactory$okhttp(SocketFactory socketFactory2) {
            vx2.m53591g(socketFactory2, "<set-?>");
            this.socketFactory = socketFactory2;
        }

        public final void setSslSocketFactoryOrNull$okhttp(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final void setWriteTimeout$okhttp(int i) {
            this.writeTimeout = i;
        }

        public final void setX509TrustManagerOrNull$okhttp(X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        public final Builder socketFactory(SocketFactory socketFactory2) {
            vx2.m53591g(socketFactory2, "socketFactory");
            if (!(socketFactory2 instanceof SSLSocketFactory)) {
                if (!vx2.m53586b(socketFactory2, getSocketFactory$okhttp())) {
                    setRouteDatabase$okhttp((RouteDatabase) null);
                }
                setSocketFactory$okhttp(socketFactory2);
                return this;
            }
            throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            vx2.m53591g(sSLSocketFactory, "sslSocketFactory");
            if (!vx2.m53586b(sSLSocketFactory, getSslSocketFactoryOrNull$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setSslSocketFactoryOrNull$okhttp(sSLSocketFactory);
            Platform.Companion companion = Platform.Companion;
            X509TrustManager trustManager = companion.get().trustManager(sSLSocketFactory);
            if (trustManager != null) {
                setX509TrustManagerOrNull$okhttp(trustManager);
                Platform platform = companion.get();
                X509TrustManager x509TrustManagerOrNull$okhttp = getX509TrustManagerOrNull$okhttp();
                vx2.m53588d(x509TrustManagerOrNull$okhttp);
                setCertificateChainCleaner$okhttp(platform.buildCertificateChainCleaner(x509TrustManagerOrNull$okhttp));
                return this;
            }
            throw new IllegalStateException("Unable to extract the trust manager on " + companion.get() + ", sslSocketFactory is " + sSLSocketFactory.getClass());
        }

        public final Builder writeTimeout(long j, TimeUnit timeUnit) {
            vx2.m53591g(timeUnit, "unit");
            setWriteTimeout$okhttp(Util.checkDuration("timeout", j, timeUnit));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder callTimeout(Duration duration) {
            vx2.m53591g(duration, "duration");
            callTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder connectTimeout(Duration duration) {
            vx2.m53591g(duration, "duration");
            connectTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder pingInterval(Duration duration) {
            vx2.m53591g(duration, "duration");
            pingInterval(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder readTimeout(Duration duration) {
            vx2.m53591g(duration, "duration");
            readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder writeTimeout(Duration duration) {
            vx2.m53591g(duration, "duration");
            writeTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            vx2.m53591g(sSLSocketFactory, "sslSocketFactory");
            vx2.m53591g(x509TrustManager, "trustManager");
            if (!vx2.m53586b(sSLSocketFactory, getSslSocketFactoryOrNull$okhttp()) || !vx2.m53586b(x509TrustManager, getX509TrustManagerOrNull$okhttp())) {
                setRouteDatabase$okhttp((RouteDatabase) null);
            }
            setSslSocketFactoryOrNull$okhttp(sSLSocketFactory);
            setCertificateChainCleaner$okhttp(CertificateChainCleaner.Companion.get(x509TrustManager));
            setX509TrustManagerOrNull$okhttp(x509TrustManager);
            return this;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(OkHttpClient okHttpClient) {
            this();
            vx2.m53591g(okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            hk0.m45275z(this.interceptors, okHttpClient.interceptors());
            hk0.m45275z(this.networkInterceptors, okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.x509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.minWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }
    }

    @Metadata(mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, mo44877d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "()V", "DEFAULT_CONNECTION_SPECS", "", "Lokhttp3/ConnectionSpec;", "getDEFAULT_CONNECTION_SPECS$okhttp", "()Ljava/util/List;", "DEFAULT_PROTOCOLS", "Lokhttp3/Protocol;", "getDEFAULT_PROTOCOLS$okhttp", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: OkHttpClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }

        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.DEFAULT_PROTOCOLS;
        }
    }

    public OkHttpClient(Builder builder) {
        ProxySelector proxySelector2;
        vx2.m53591g(builder, "builder");
        this.dispatcher = builder.getDispatcher$okhttp();
        this.connectionPool = builder.getConnectionPool$okhttp();
        this.interceptors = Util.toImmutableList(builder.getInterceptors$okhttp());
        this.networkInterceptors = Util.toImmutableList(builder.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = builder.getEventListenerFactory$okhttp();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure$okhttp();
        this.authenticator = builder.getAuthenticator$okhttp();
        this.followRedirects = builder.getFollowRedirects$okhttp();
        this.followSslRedirects = builder.getFollowSslRedirects$okhttp();
        this.cookieJar = builder.getCookieJar$okhttp();
        this.cache = builder.getCache$okhttp();
        this.dns = builder.getDns$okhttp();
        this.proxy = builder.getProxy$okhttp();
        if (builder.getProxy$okhttp() != null) {
            proxySelector2 = NullProxySelector.INSTANCE;
        } else {
            proxySelector2 = builder.getProxySelector$okhttp();
            proxySelector2 = proxySelector2 == null ? ProxySelector.getDefault() : proxySelector2;
            if (proxySelector2 == null) {
                proxySelector2 = NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = proxySelector2;
        this.proxyAuthenticator = builder.getProxyAuthenticator$okhttp();
        this.socketFactory = builder.getSocketFactory$okhttp();
        List<ConnectionSpec> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
        this.connectionSpecs = connectionSpecs$okhttp;
        this.protocols = builder.getProtocols$okhttp();
        this.hostnameVerifier = builder.getHostnameVerifier$okhttp();
        this.callTimeoutMillis = builder.getCallTimeout$okhttp();
        this.connectTimeoutMillis = builder.getConnectTimeout$okhttp();
        this.readTimeoutMillis = builder.getReadTimeout$okhttp();
        this.writeTimeoutMillis = builder.getWriteTimeout$okhttp();
        this.pingIntervalMillis = builder.getPingInterval$okhttp();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress$okhttp();
        RouteDatabase routeDatabase$okhttp = builder.getRouteDatabase$okhttp();
        this.routeDatabase = routeDatabase$okhttp == null ? new RouteDatabase() : routeDatabase$okhttp;
        boolean z = true;
        if (!(connectionSpecs$okhttp instanceof Collection) || !connectionSpecs$okhttp.isEmpty()) {
            Iterator<T> it = connectionSpecs$okhttp.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((ConnectionSpec) it.next()).isTls()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
        } else if (builder.getSslSocketFactoryOrNull$okhttp() != null) {
            this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull$okhttp();
            CertificateChainCleaner certificateChainCleaner$okhttp = builder.getCertificateChainCleaner$okhttp();
            vx2.m53588d(certificateChainCleaner$okhttp);
            this.certificateChainCleaner = certificateChainCleaner$okhttp;
            X509TrustManager x509TrustManagerOrNull$okhttp = builder.getX509TrustManagerOrNull$okhttp();
            vx2.m53588d(x509TrustManagerOrNull$okhttp);
            this.x509TrustManager = x509TrustManagerOrNull$okhttp;
            CertificatePinner certificatePinner$okhttp = builder.getCertificatePinner$okhttp();
            vx2.m53588d(certificateChainCleaner$okhttp);
            this.certificatePinner = certificatePinner$okhttp.withCertificateChainCleaner$okhttp(certificateChainCleaner$okhttp);
        } else {
            Platform.Companion companion = Platform.Companion;
            X509TrustManager platformTrustManager = companion.get().platformTrustManager();
            this.x509TrustManager = platformTrustManager;
            Platform platform = companion.get();
            vx2.m53588d(platformTrustManager);
            this.sslSocketFactoryOrNull = platform.newSslSocketFactory(platformTrustManager);
            CertificateChainCleaner.Companion companion2 = CertificateChainCleaner.Companion;
            vx2.m53588d(platformTrustManager);
            CertificateChainCleaner certificateChainCleaner2 = companion2.get(platformTrustManager);
            this.certificateChainCleaner = certificateChainCleaner2;
            CertificatePinner certificatePinner$okhttp2 = builder.getCertificatePinner$okhttp();
            vx2.m53588d(certificateChainCleaner2);
            this.certificatePinner = certificatePinner$okhttp2.withCertificateChainCleaner$okhttp(certificateChainCleaner2);
        }
        verifyClientState();
    }

    private final void verifyClientState() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (!(!this.interceptors.contains((Object) null))) {
            throw new IllegalStateException(vx2.m53598n("Null interceptor: ", interceptors()).toString());
        } else if (!this.networkInterceptors.contains((Object) null)) {
            List<ConnectionSpec> list = this.connectionSpecs;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((ConnectionSpec) it.next()).isTls()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                if (this.sslSocketFactoryOrNull == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (this.certificateChainCleaner == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (this.x509TrustManager != null) {
                            z4 = false;
                        }
                        if (!z4) {
                            throw new IllegalStateException("Check failed.".toString());
                        } else if (!vx2.m53586b(this.certificatePinner, CertificatePinner.DEFAULT)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else if (this.sslSocketFactoryOrNull == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            } else if (this.certificateChainCleaner == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            } else if (this.x509TrustManager == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
        } else {
            throw new IllegalStateException(vx2.m53598n("Null network interceptor: ", networkInterceptors()).toString());
        }
    }

    /* renamed from: -deprecated_authenticator  reason: not valid java name */
    public final Authenticator m75730deprecated_authenticator() {
        return this.authenticator;
    }

    /* renamed from: -deprecated_cache  reason: not valid java name */
    public final Cache m75731deprecated_cache() {
        return this.cache;
    }

    /* renamed from: -deprecated_callTimeoutMillis  reason: not valid java name */
    public final int m75732deprecated_callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    /* renamed from: -deprecated_certificatePinner  reason: not valid java name */
    public final CertificatePinner m75733deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    /* renamed from: -deprecated_connectTimeoutMillis  reason: not valid java name */
    public final int m75734deprecated_connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    /* renamed from: -deprecated_connectionPool  reason: not valid java name */
    public final ConnectionPool m75735deprecated_connectionPool() {
        return this.connectionPool;
    }

    /* renamed from: -deprecated_connectionSpecs  reason: not valid java name */
    public final List<ConnectionSpec> m75736deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    /* renamed from: -deprecated_cookieJar  reason: not valid java name */
    public final CookieJar m75737deprecated_cookieJar() {
        return this.cookieJar;
    }

    /* renamed from: -deprecated_dispatcher  reason: not valid java name */
    public final Dispatcher m75738deprecated_dispatcher() {
        return this.dispatcher;
    }

    /* renamed from: -deprecated_dns  reason: not valid java name */
    public final Dns m75739deprecated_dns() {
        return this.dns;
    }

    /* renamed from: -deprecated_eventListenerFactory  reason: not valid java name */
    public final EventListener.Factory m75740deprecated_eventListenerFactory() {
        return this.eventListenerFactory;
    }

    /* renamed from: -deprecated_followRedirects  reason: not valid java name */
    public final boolean m75741deprecated_followRedirects() {
        return this.followRedirects;
    }

    /* renamed from: -deprecated_followSslRedirects  reason: not valid java name */
    public final boolean m75742deprecated_followSslRedirects() {
        return this.followSslRedirects;
    }

    /* renamed from: -deprecated_hostnameVerifier  reason: not valid java name */
    public final HostnameVerifier m75743deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    /* renamed from: -deprecated_interceptors  reason: not valid java name */
    public final List<Interceptor> m75744deprecated_interceptors() {
        return this.interceptors;
    }

    /* renamed from: -deprecated_networkInterceptors  reason: not valid java name */
    public final List<Interceptor> m75745deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    /* renamed from: -deprecated_pingIntervalMillis  reason: not valid java name */
    public final int m75746deprecated_pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    /* renamed from: -deprecated_protocols  reason: not valid java name */
    public final List<Protocol> m75747deprecated_protocols() {
        return this.protocols;
    }

    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m75748deprecated_proxy() {
        return this.proxy;
    }

    /* renamed from: -deprecated_proxyAuthenticator  reason: not valid java name */
    public final Authenticator m75749deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    /* renamed from: -deprecated_proxySelector  reason: not valid java name */
    public final ProxySelector m75750deprecated_proxySelector() {
        return this.proxySelector;
    }

    /* renamed from: -deprecated_readTimeoutMillis  reason: not valid java name */
    public final int m75751deprecated_readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* renamed from: -deprecated_retryOnConnectionFailure  reason: not valid java name */
    public final boolean m75752deprecated_retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    /* renamed from: -deprecated_socketFactory  reason: not valid java name */
    public final SocketFactory m75753deprecated_socketFactory() {
        return this.socketFactory;
    }

    /* renamed from: -deprecated_sslSocketFactory  reason: not valid java name */
    public final SSLSocketFactory m75754deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    /* renamed from: -deprecated_writeTimeoutMillis  reason: not valid java name */
    public final int m75755deprecated_writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final Authenticator authenticator() {
        return this.authenticator;
    }

    public final Cache cache() {
        return this.cache;
    }

    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    public final CertificateChainCleaner certificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public Object clone() {
        return super.clone();
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    public final Dns dns() {
        return this.dns;
    }

    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    public final long minWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public Call newCall(Request request) {
        vx2.m53591g(request, "request");
        return new RealCall(this, request, false);
    }

    public WebSocket newWebSocket(Request request, WebSocketListener webSocketListener) {
        vx2.m53591g(request, "request");
        vx2.m53591g(webSocketListener, "listener");
        RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.INSTANCE, request, webSocketListener, new Random(), (long) this.pingIntervalMillis, (WebSocketExtensions) null, this.minWebSocketMessageToCompress);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final X509TrustManager x509TrustManager() {
        return this.x509TrustManager;
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
