package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b7\u00108J8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J0\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0000X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, mo44877d2 = {"Lokhttp3/internal/connection/ExchangeFinder;", "", "", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "", "connectionRetryEnabled", "doExtensiveHealthChecks", "Lokhttp3/internal/connection/RealConnection;", "findHealthyConnection", "findConnection", "Lokhttp3/Route;", "retryRoute", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/ExchangeCodec;", "find", "Ljava/io/IOException;", "e", "Lr37;", "trackFailure", "retryAfterFailure", "Lokhttp3/HttpUrl;", "url", "sameHostAndPort", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/Address;", "address", "Lokhttp3/Address;", "getAddress$okhttp", "()Lokhttp3/Address;", "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/internal/connection/RealCall;", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "Lokhttp3/internal/connection/RouteSelector$Selection;", "routeSelection", "Lokhttp3/internal/connection/RouteSelector$Selection;", "Lokhttp3/internal/connection/RouteSelector;", "routeSelector", "Lokhttp3/internal/connection/RouteSelector;", "refusedStreamCount", "I", "connectionShutdownCount", "otherFailureCount", "nextRouteToTry", "Lokhttp3/Route;", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Address;Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: ExchangeFinder.kt */
public final class ExchangeFinder {
    private final Address address;
    private final RealCall call;
    private final RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    private final EventListener eventListener;
    private Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private RouteSelector.Selection routeSelection;
    private RouteSelector routeSelector;

    public ExchangeFinder(RealConnectionPool realConnectionPool, Address address2, RealCall realCall, EventListener eventListener2) {
        vx2.m53591g(realConnectionPool, "connectionPool");
        vx2.m53591g(address2, org.web3j.abi.datatypes.Address.TYPE_NAME);
        vx2.m53591g(realCall, "call");
        vx2.m53591g(eventListener2, "eventListener");
        this.connectionPool = realConnectionPool;
        this.address = address2;
        this.call = realCall;
        this.eventListener = eventListener2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final okhttp3.internal.connection.RealConnection findConnection(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
        /*
            r14 = this;
            r1 = r14
            okhttp3.internal.connection.RealCall r0 = r1.call
            boolean r0 = r0.isCanceled()
            if (r0 != 0) goto L_0x0179
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.internal.connection.RealConnection r2 = r0.getConnection()
            r0 = 1
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0065
            monitor-enter(r2)
            boolean r5 = r2.getNoNewExchanges()     // Catch:{ all -> 0x0062 }
            if (r5 != 0) goto L_0x0030
            okhttp3.Route r5 = r2.route()     // Catch:{ all -> 0x0062 }
            okhttp3.Address r5 = r5.address()     // Catch:{ all -> 0x0062 }
            okhttp3.HttpUrl r5 = r5.url()     // Catch:{ all -> 0x0062 }
            boolean r5 = r14.sameHostAndPort(r5)     // Catch:{ all -> 0x0062 }
            if (r5 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r5 = r4
            goto L_0x0036
        L_0x0030:
            okhttp3.internal.connection.RealCall r5 = r1.call     // Catch:{ all -> 0x0062 }
            java.net.Socket r5 = r5.releaseConnectionNoEvents$okhttp()     // Catch:{ all -> 0x0062 }
        L_0x0036:
            r37 r6 = p000.r37.f33317a     // Catch:{ all -> 0x0062 }
            monitor-exit(r2)
            okhttp3.internal.connection.RealCall r6 = r1.call
            okhttp3.internal.connection.RealConnection r6 = r6.getConnection()
            if (r6 == 0) goto L_0x0054
            if (r5 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r0 = r3
        L_0x0045:
            if (r0 == 0) goto L_0x0048
            return r2
        L_0x0048:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0054:
            if (r5 != 0) goto L_0x0057
            goto L_0x005a
        L_0x0057:
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r5)
        L_0x005a:
            okhttp3.EventListener r5 = r1.eventListener
            okhttp3.internal.connection.RealCall r6 = r1.call
            r5.connectionReleased(r6, r2)
            goto L_0x0065
        L_0x0062:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0065:
            r1.refusedStreamCount = r3
            r1.connectionShutdownCount = r3
            r1.otherFailureCount = r3
            okhttp3.internal.connection.RealConnectionPool r2 = r1.connectionPool
            okhttp3.Address r5 = r1.address
            okhttp3.internal.connection.RealCall r6 = r1.call
            boolean r2 = r2.callAcquirePooledConnection(r5, r6, r4, r3)
            if (r2 == 0) goto L_0x0088
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            p000.vx2.m53588d(r0)
            okhttp3.EventListener r2 = r1.eventListener
            okhttp3.internal.connection.RealCall r3 = r1.call
            r2.connectionAcquired(r3, r0)
            return r0
        L_0x0088:
            okhttp3.Route r2 = r1.nextRouteToTry
            if (r2 == 0) goto L_0x0093
            p000.vx2.m53588d(r2)
            r1.nextRouteToTry = r4
        L_0x0091:
            r5 = r4
            goto L_0x00f8
        L_0x0093:
            okhttp3.internal.connection.RouteSelector$Selection r2 = r1.routeSelection
            if (r2 == 0) goto L_0x00aa
            p000.vx2.m53588d(r2)
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto L_0x00aa
            okhttp3.internal.connection.RouteSelector$Selection r2 = r1.routeSelection
            p000.vx2.m53588d(r2)
            okhttp3.Route r2 = r2.next()
            goto L_0x0091
        L_0x00aa:
            okhttp3.internal.connection.RouteSelector r2 = r1.routeSelector
            if (r2 != 0) goto L_0x00c5
            okhttp3.internal.connection.RouteSelector r2 = new okhttp3.internal.connection.RouteSelector
            okhttp3.Address r5 = r1.address
            okhttp3.internal.connection.RealCall r6 = r1.call
            okhttp3.OkHttpClient r6 = r6.getClient()
            okhttp3.internal.connection.RouteDatabase r6 = r6.getRouteDatabase()
            okhttp3.internal.connection.RealCall r7 = r1.call
            okhttp3.EventListener r8 = r1.eventListener
            r2.<init>(r5, r6, r7, r8)
            r1.routeSelector = r2
        L_0x00c5:
            okhttp3.internal.connection.RouteSelector$Selection r2 = r2.next()
            r1.routeSelection = r2
            java.util.List r5 = r2.getRoutes()
            okhttp3.internal.connection.RealCall r6 = r1.call
            boolean r6 = r6.isCanceled()
            if (r6 != 0) goto L_0x0171
            okhttp3.internal.connection.RealConnectionPool r6 = r1.connectionPool
            okhttp3.Address r7 = r1.address
            okhttp3.internal.connection.RealCall r8 = r1.call
            boolean r3 = r6.callAcquirePooledConnection(r7, r8, r5, r3)
            if (r3 == 0) goto L_0x00f4
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            p000.vx2.m53588d(r0)
            okhttp3.EventListener r2 = r1.eventListener
            okhttp3.internal.connection.RealCall r3 = r1.call
            r2.connectionAcquired(r3, r0)
            return r0
        L_0x00f4:
            okhttp3.Route r2 = r2.next()
        L_0x00f8:
            okhttp3.internal.connection.RealConnection r3 = new okhttp3.internal.connection.RealConnection
            okhttp3.internal.connection.RealConnectionPool r6 = r1.connectionPool
            r3.<init>(r6, r2)
            okhttp3.internal.connection.RealCall r6 = r1.call
            r6.setConnectionToCancel(r3)
            okhttp3.internal.connection.RealCall r12 = r1.call     // Catch:{ all -> 0x016a }
            okhttp3.EventListener r13 = r1.eventListener     // Catch:{ all -> 0x016a }
            r6 = r3
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r6.connect(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x016a }
            okhttp3.internal.connection.RealCall r6 = r1.call
            r6.setConnectionToCancel(r4)
            okhttp3.internal.connection.RealCall r4 = r1.call
            okhttp3.OkHttpClient r4 = r4.getClient()
            okhttp3.internal.connection.RouteDatabase r4 = r4.getRouteDatabase()
            okhttp3.Route r6 = r3.route()
            r4.connected(r6)
            okhttp3.internal.connection.RealConnectionPool r4 = r1.connectionPool
            okhttp3.Address r6 = r1.address
            okhttp3.internal.connection.RealCall r7 = r1.call
            boolean r0 = r4.callAcquirePooledConnection(r6, r7, r5, r0)
            if (r0 == 0) goto L_0x0151
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            p000.vx2.m53588d(r0)
            r1.nextRouteToTry = r2
            java.net.Socket r2 = r3.socket()
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r2)
            okhttp3.EventListener r2 = r1.eventListener
            okhttp3.internal.connection.RealCall r3 = r1.call
            r2.connectionAcquired(r3, r0)
            return r0
        L_0x0151:
            monitor-enter(r3)
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool     // Catch:{ all -> 0x0167 }
            r0.put(r3)     // Catch:{ all -> 0x0167 }
            okhttp3.internal.connection.RealCall r0 = r1.call     // Catch:{ all -> 0x0167 }
            r0.acquireConnectionNoEvents(r3)     // Catch:{ all -> 0x0167 }
            r37 r0 = p000.r37.f33317a     // Catch:{ all -> 0x0167 }
            monitor-exit(r3)
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.internal.connection.RealCall r2 = r1.call
            r0.connectionAcquired(r2, r3)
            return r3
        L_0x0167:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x016a:
            r0 = move-exception
            okhttp3.internal.connection.RealCall r2 = r1.call
            r2.setConnectionToCancel(r4)
            throw r0
        L_0x0171:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0179:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.findConnection(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    private final RealConnection findHealthyConnection(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        boolean z3;
        while (true) {
            RealConnection findConnection = findConnection(i, i2, i3, i4, z);
            if (findConnection.isHealthy(z2)) {
                return findConnection;
            }
            findConnection.noNewExchanges$okhttp();
            if (this.nextRouteToTry == null) {
                RouteSelector.Selection selection = this.routeSelection;
                boolean z4 = true;
                if (selection == null) {
                    z3 = true;
                } else {
                    z3 = selection.hasNext();
                }
                if (!z3) {
                    RouteSelector routeSelector2 = this.routeSelector;
                    if (routeSelector2 != null) {
                        z4 = routeSelector2.hasNext();
                    }
                    if (!z4) {
                        throw new IOException("exhausted all routes");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    private final Route retryRoute() {
        RealConnection connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount$okhttp() != 0) {
                return null;
            }
            if (!Util.canReuseConnectionFor(connection.route().address().url(), getAddress$okhttp().url())) {
                return null;
            }
            Route route = connection.route();
            return route;
        }
    }

    public final ExchangeCodec find(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) {
        boolean z;
        vx2.m53591g(okHttpClient, "client");
        vx2.m53591g(realInterceptorChain, "chain");
        try {
            int connectTimeoutMillis$okhttp = realInterceptorChain.getConnectTimeoutMillis$okhttp();
            int readTimeoutMillis$okhttp = realInterceptorChain.getReadTimeoutMillis$okhttp();
            int writeTimeoutMillis$okhttp = realInterceptorChain.getWriteTimeoutMillis$okhttp();
            int pingIntervalMillis = okHttpClient.pingIntervalMillis();
            boolean retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            if (!vx2.m53586b(realInterceptorChain.getRequest$okhttp().method(), "GET")) {
                z = true;
            } else {
                z = false;
            }
            return findHealthyConnection(connectTimeoutMillis$okhttp, readTimeoutMillis$okhttp, writeTimeoutMillis$okhttp, pingIntervalMillis, retryOnConnectionFailure, z).newCodec$okhttp(okHttpClient, realInterceptorChain);
        } catch (RouteException e) {
            trackFailure(e.getLastConnectException());
            throw e;
        } catch (IOException e2) {
            trackFailure(e2);
            throw new RouteException(e2);
        }
    }

    public final Address getAddress$okhttp() {
        return this.address;
    }

    public final boolean retryAfterFailure() {
        RouteSelector routeSelector2;
        boolean z = false;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        Route retryRoute = retryRoute();
        if (retryRoute != null) {
            this.nextRouteToTry = retryRoute;
            return true;
        }
        RouteSelector.Selection selection = this.routeSelection;
        if (selection != null && selection.hasNext()) {
            z = true;
        }
        if (!z && (routeSelector2 = this.routeSelector) != null) {
            return routeSelector2.hasNext();
        }
        return true;
    }

    public final boolean sameHostAndPort(HttpUrl httpUrl) {
        vx2.m53591g(httpUrl, "url");
        HttpUrl url = this.address.url();
        if (httpUrl.port() != url.port() || !vx2.m53586b(httpUrl.host(), url.host())) {
            return false;
        }
        return true;
    }

    public final void trackFailure(IOException iOException) {
        vx2.m53591g(iOException, "e");
        this.nextRouteToTry = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }
}
