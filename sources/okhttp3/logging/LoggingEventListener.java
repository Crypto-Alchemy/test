package okhttp3.logging;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001FB\u0011\b\u0002\u0012\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bD\u0010EJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J&\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0016J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J*\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J2\u0010\"\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010*\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010.\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0016J\u0018\u0010/\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u00100\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00103\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0016J\u0018\u00106\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00108\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u00109\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010:\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0018\u0010;\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0010\u0010<\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010>\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010=\u001a\u000201H\u0016R\u0014\u0010@\u001a\u00020?8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006G"}, mo44877d2 = {"Lokhttp3/logging/LoggingEventListener;", "Lokhttp3/EventListener;", "", "message", "Lr37;", "logWithTime", "Lokhttp3/Call;", "call", "callStart", "Lokhttp3/HttpUrl;", "url", "proxySelectStart", "", "Ljava/net/Proxy;", "proxies", "proxySelectEnd", "domainName", "dnsStart", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "Lokhttp3/Protocol;", "protocol", "connectEnd", "Ljava/io/IOException;", "ioe", "connectFailed", "Lokhttp3/Connection;", "connection", "connectionAcquired", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", "request", "requestHeadersEnd", "requestBodyStart", "", "byteCount", "requestBodyEnd", "requestFailed", "responseHeadersStart", "Lokhttp3/Response;", "response", "responseHeadersEnd", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "startNs", "J", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Factory", "okhttp-logging-interceptor"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: LoggingEventListener.kt */
public final class LoggingEventListener extends EventListener {
    private final HttpLoggingInterceptor.Logger logger;
    private long startNs;

    private LoggingEventListener(HttpLoggingInterceptor.Logger logger2) {
        this.logger = logger2;
    }

    public /* synthetic */ LoggingEventListener(HttpLoggingInterceptor.Logger logger2, DefaultConstructorMarker defaultConstructorMarker) {
        this(logger2);
    }

    private final void logWithTime(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs);
        HttpLoggingInterceptor.Logger logger2 = this.logger;
        logger2.log('[' + millis + " ms] " + str);
    }

    public void cacheConditionalHit(Call call, Response response) {
        vx2.m53591g(call, "call");
        vx2.m53591g(response, "cachedResponse");
        logWithTime(vx2.m53598n("cacheConditionalHit: ", response));
    }

    public void cacheHit(Call call, Response response) {
        vx2.m53591g(call, "call");
        vx2.m53591g(response, "response");
        logWithTime(vx2.m53598n("cacheHit: ", response));
    }

    public void cacheMiss(Call call) {
        vx2.m53591g(call, "call");
        logWithTime("cacheMiss");
    }

    public void callEnd(Call call) {
        vx2.m53591g(call, "call");
        logWithTime("callEnd");
    }

    public void callFailed(Call call, IOException iOException) {
        vx2.m53591g(call, "call");
        vx2.m53591g(iOException, "ioe");
        logWithTime(vx2.m53598n("callFailed: ", iOException));
    }

    public void callStart(Call call) {
        vx2.m53591g(call, "call");
        this.startNs = System.nanoTime();
        logWithTime(vx2.m53598n("callStart: ", call.request()));
    }

    public void canceled(Call call) {
        vx2.m53591g(call, "call");
        logWithTime("canceled");
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        vx2.m53591g(call, "call");
        vx2.m53591g(inetSocketAddress, "inetSocketAddress");
        vx2.m53591g(proxy, "proxy");
        logWithTime(vx2.m53598n("connectEnd: ", protocol));
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        vx2.m53591g(call, "call");
        vx2.m53591g(inetSocketAddress, "inetSocketAddress");
        vx2.m53591g(proxy, "proxy");
        vx2.m53591g(iOException, "ioe");
        logWithTime("connectFailed: " + protocol + ' ' + iOException);
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        vx2.m53591g(call, "call");
        vx2.m53591g(inetSocketAddress, "inetSocketAddress");
        vx2.m53591g(proxy, "proxy");
        logWithTime("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    public void connectionAcquired(Call call, Connection connection) {
        vx2.m53591g(call, "call");
        vx2.m53591g(connection, "connection");
        logWithTime(vx2.m53598n("connectionAcquired: ", connection));
    }

    public void connectionReleased(Call call, Connection connection) {
        vx2.m53591g(call, "call");
        vx2.m53591g(connection, "connection");
        logWithTime("connectionReleased");
    }

    public void dnsEnd(Call call, String str, List<? extends InetAddress> list) {
        vx2.m53591g(call, "call");
        vx2.m53591g(str, "domainName");
        vx2.m53591g(list, "inetAddressList");
        logWithTime(vx2.m53598n("dnsEnd: ", list));
    }

    public void dnsStart(Call call, String str) {
        vx2.m53591g(call, "call");
        vx2.m53591g(str, "domainName");
        logWithTime(vx2.m53598n("dnsStart: ", str));
    }

    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<? extends Proxy> list) {
        vx2.m53591g(call, "call");
        vx2.m53591g(httpUrl, "url");
        vx2.m53591g(list, "proxies");
        logWithTime(vx2.m53598n("proxySelectEnd: ", list));
    }

    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        vx2.m53591g(call, "call");
        vx2.m53591g(httpUrl, "url");
        logWithTime(vx2.m53598n("proxySelectStart: ", httpUrl));
    }

    public void requestBodyEnd(Call call, long j) {
        vx2.m53591g(call, "call");
        logWithTime(vx2.m53598n("requestBodyEnd: byteCount=", Long.valueOf(j)));
    }

    public void requestBodyStart(Call call) {
        vx2.m53591g(call, "call");
        logWithTime("requestBodyStart");
    }

    public void requestFailed(Call call, IOException iOException) {
        vx2.m53591g(call, "call");
        vx2.m53591g(iOException, "ioe");
        logWithTime(vx2.m53598n("requestFailed: ", iOException));
    }

    public void requestHeadersEnd(Call call, Request request) {
        vx2.m53591g(call, "call");
        vx2.m53591g(request, "request");
        logWithTime("requestHeadersEnd");
    }

    public void requestHeadersStart(Call call) {
        vx2.m53591g(call, "call");
        logWithTime("requestHeadersStart");
    }

    public void responseBodyEnd(Call call, long j) {
        vx2.m53591g(call, "call");
        logWithTime(vx2.m53598n("responseBodyEnd: byteCount=", Long.valueOf(j)));
    }

    public void responseBodyStart(Call call) {
        vx2.m53591g(call, "call");
        logWithTime("responseBodyStart");
    }

    public void responseFailed(Call call, IOException iOException) {
        vx2.m53591g(call, "call");
        vx2.m53591g(iOException, "ioe");
        logWithTime(vx2.m53598n("responseFailed: ", iOException));
    }

    public void responseHeadersEnd(Call call, Response response) {
        vx2.m53591g(call, "call");
        vx2.m53591g(response, "response");
        logWithTime(vx2.m53598n("responseHeadersEnd: ", response));
    }

    public void responseHeadersStart(Call call) {
        vx2.m53591g(call, "call");
        logWithTime("responseHeadersStart");
    }

    public void satisfactionFailure(Call call, Response response) {
        vx2.m53591g(call, "call");
        vx2.m53591g(response, "response");
        logWithTime(vx2.m53598n("satisfactionFailure: ", response));
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        vx2.m53591g(call, "call");
        logWithTime(vx2.m53598n("secureConnectEnd: ", handshake));
    }

    public void secureConnectStart(Call call) {
        vx2.m53591g(call, "call");
        logWithTime("secureConnectStart");
    }

    @Metadata(mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo44877d2 = {"Lokhttp3/logging/LoggingEventListener$Factory;", "Lokhttp3/EventListener$Factory;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "create", "Lokhttp3/EventListener;", "call", "Lokhttp3/Call;", "okhttp-logging-interceptor"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: LoggingEventListener.kt */
    public static class Factory implements EventListener.Factory {
        private final HttpLoggingInterceptor.Logger logger;

        public Factory() {
            this((HttpLoggingInterceptor.Logger) null, 1, (DefaultConstructorMarker) null);
        }

        public Factory(HttpLoggingInterceptor.Logger logger2) {
            vx2.m53591g(logger2, "logger");
            this.logger = logger2;
        }

        public EventListener create(Call call) {
            vx2.m53591g(call, "call");
            return new LoggingEventListener(this.logger, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Factory(HttpLoggingInterceptor.Logger logger2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? HttpLoggingInterceptor.Logger.DEFAULT : logger2);
        }
    }
}
