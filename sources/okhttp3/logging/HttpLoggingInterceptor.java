package okhttp3.logging;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\"#B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r8\u0006@GX\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u0012\u0010\u0011\"\u0004\b\u000e\u0010\u001f¨\u0006$"}, mo44877d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Headers;", "headers", "", "i", "Lr37;", "logHeader", "", "bodyHasUnknownEncoding", "", "name", "redactHeader", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "setLevel", "-deprecated_level", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getLevel", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "headersToRedact", "Ljava/util/Set;", "<set-?>", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Level", "Logger", "okhttp-logging-interceptor"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: HttpLoggingInterceptor.kt */
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo44877d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: HttpLoggingInterceptor.kt */
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, mo44877d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "", "message", "Lr37;", "log", "Companion", "okhttp-logging-interceptor"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: HttpLoggingInterceptor.kt */
    public interface Logger {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        @Metadata(mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, mo44877d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "()V", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DefaultLogger", "okhttp-logging-interceptor"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
        /* compiled from: HttpLoggingInterceptor.kt */
        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo44877d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "message", "Lr37;", "log", "<init>", "()V", "okhttp-logging-interceptor"}, mo44878k = 1, mo44879mv = {1, 6, 0})
            /* compiled from: HttpLoggingInterceptor.kt */
            public static final class DefaultLogger implements Logger {
                public void log(String str) {
                    vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
                    Platform.log$default(Platform.Companion.get(), str, 0, (Throwable) null, 6, (Object) null);
                }
            }

            private Companion() {
            }
        }

        void log(String str);
    }

    public HttpLoggingInterceptor() {
        this((Logger) null, 1, (DefaultConstructorMarker) null);
    }

    public HttpLoggingInterceptor(Logger logger2) {
        vx2.m53591g(logger2, "logger");
        this.logger = logger2;
        this.headersToRedact = ny5.m49095e();
        this.level = Level.NONE;
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        if (str != null && !yb6.m74344y(str, "identity", true) && !yb6.m74344y(str, "gzip", true)) {
            return true;
        }
        return false;
    }

    private final void logHeader(Headers headers, int i) {
        String str;
        if (this.headersToRedact.contains(headers.name(i))) {
            str = "██";
        } else {
            str = headers.value(i);
        }
        Logger logger2 = this.logger;
        logger2.log(headers.name(i) + ": " + str);
    }

    /* renamed from: -deprecated_level  reason: not valid java name */
    public final Level m75782deprecated_level() {
        return this.level;
    }

    public final Level getLevel() {
        return this.level;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        String str;
        String str2;
        String str3;
        char c;
        String str4;
        Charset charset;
        Long l;
        Charset charset2;
        Throwable th;
        Charset charset3;
        Interceptor.Chain chain2 = chain;
        vx2.m53591g(chain2, "chain");
        Level level2 = this.level;
        Request request = chain.request();
        if (level2 == Level.NONE) {
            return chain2.proceed(request);
        }
        boolean z = level2 == Level.BODY;
        boolean z2 = z || level2 == Level.HEADERS;
        RequestBody body = request.body();
        Connection connection = chain.connection();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(request.method());
        sb.append(' ');
        sb.append(request.url());
        sb.append(connection != null ? vx2.m53598n(" ", connection.protocol()) : "");
        String sb2 = sb.toString();
        if (!z2 && body != null) {
            sb2 = sb2 + " (" + body.contentLength() + "-byte body)";
        }
        this.logger.log(sb2);
        if (z2) {
            Headers headers = request.headers();
            if (body != null) {
                MediaType contentType = body.contentType();
                if (contentType != null && headers.get("Content-Type") == null) {
                    this.logger.log(vx2.m53598n("Content-Type: ", contentType));
                }
                if (body.contentLength() != -1 && headers.get("Content-Length") == null) {
                    this.logger.log(vx2.m53598n("Content-Length: ", Long.valueOf(body.contentLength())));
                }
            }
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                logHeader(headers, i);
            }
            if (!z || body == null) {
                this.logger.log(vx2.m53598n("--> END ", request.method()));
            } else if (bodyHasUnknownEncoding(request.headers())) {
                this.logger.log("--> END " + request.method() + " (encoded body omitted)");
            } else if (body.isDuplex()) {
                this.logger.log("--> END " + request.method() + " (duplex request body omitted)");
            } else if (body.isOneShot()) {
                this.logger.log("--> END " + request.method() + " (one-shot body omitted)");
            } else {
                m40 m40 = new m40();
                body.writeTo(m40);
                MediaType contentType2 = body.contentType();
                if (contentType2 == null) {
                    charset3 = null;
                } else {
                    charset3 = contentType2.charset(StandardCharsets.UTF_8);
                }
                if (charset3 == null) {
                    charset3 = StandardCharsets.UTF_8;
                    vx2.m53590f(charset3, "UTF_8");
                }
                this.logger.log("");
                if (Utf8Kt.isProbablyUtf8(m40)) {
                    this.logger.log(m40.mo56038T0(charset3));
                    this.logger.log("--> END " + request.method() + " (" + body.contentLength() + "-byte body)");
                } else {
                    this.logger.log("--> END " + request.method() + " (binary " + body.contentLength() + "-byte body omitted)");
                }
            }
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = chain2.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            vx2.m53588d(body2);
            long contentLength = body2.contentLength();
            if (contentLength != -1) {
                str = contentLength + "-byte";
            } else {
                str = "unknown-length";
            }
            Logger logger2 = this.logger;
            String str5 = "-byte body)";
            StringBuilder sb3 = new StringBuilder();
            long j = contentLength;
            sb3.append("<-- ");
            sb3.append(proceed.code());
            if (proceed.message().length() == 0) {
                str2 = "-byte body omitted)";
                str3 = "";
                c = ' ';
            } else {
                String message = proceed.message();
                StringBuilder sb4 = new StringBuilder();
                str2 = "-byte body omitted)";
                c = ' ';
                sb4.append(' ');
                sb4.append(message);
                str3 = sb4.toString();
            }
            sb3.append(str3);
            sb3.append(c);
            sb3.append(proceed.request().url());
            sb3.append(" (");
            sb3.append(millis);
            sb3.append("ms");
            if (!z2) {
                str4 = ", " + str + " body";
            } else {
                str4 = "";
            }
            sb3.append(str4);
            sb3.append(')');
            logger2.log(sb3.toString());
            if (z2) {
                Headers headers2 = proceed.headers();
                int size2 = headers2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    logHeader(headers2, i2);
                }
                if (!z || !HttpHeaders.promisesBody(proceed)) {
                    this.logger.log("<-- END HTTP");
                } else if (bodyHasUnknownEncoding(proceed.headers())) {
                    this.logger.log("<-- END HTTP (encoded body omitted)");
                } else {
                    w40 source = body2.source();
                    source.request(Long.MAX_VALUE);
                    m40 r = source.mo56081r();
                    if (yb6.m74344y("gzip", headers2.get("Content-Encoding"), true)) {
                        l = Long.valueOf(r.size());
                        ck2 ck2 = new ck2(r.clone());
                        try {
                            r = new m40();
                            r.mo56029L0(ck2);
                            charset = null;
                            lh0.m47807a(ck2, (Throwable) null);
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            lh0.m47807a(ck2, th);
                            throw th3;
                        }
                    } else {
                        charset = null;
                        l = null;
                    }
                    MediaType contentType3 = body2.contentType();
                    if (contentType3 == null) {
                        charset2 = charset;
                    } else {
                        charset2 = contentType3.charset(StandardCharsets.UTF_8);
                    }
                    if (charset2 == null) {
                        charset2 = StandardCharsets.UTF_8;
                        vx2.m53590f(charset2, "UTF_8");
                    }
                    if (!Utf8Kt.isProbablyUtf8(r)) {
                        this.logger.log("");
                        this.logger.log("<-- END HTTP (binary " + r.size() + str2);
                        return proceed;
                    }
                    if (j != 0) {
                        this.logger.log("");
                        this.logger.log(r.clone().mo56038T0(charset2));
                    }
                    if (l != null) {
                        this.logger.log("<-- END HTTP (" + r.size() + "-byte, " + l + "-gzipped-byte body)");
                    } else {
                        this.logger.log("<-- END HTTP (" + r.size() + str5);
                    }
                }
            }
            return proceed;
        } catch (Exception e) {
            Exception exc = e;
            this.logger.log(vx2.m53598n("<-- HTTP FAILED: ", exc));
            throw exc;
        }
    }

    public final void level(Level level2) {
        vx2.m53591g(level2, "<set-?>");
        this.level = level2;
    }

    public final void redactHeader(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        TreeSet treeSet = new TreeSet(yb6.m74324A(cb6.f21669a));
        hk0.m45275z(treeSet, this.headersToRedact);
        treeSet.add(str);
        this.headersToRedact = treeSet;
    }

    public final HttpLoggingInterceptor setLevel(Level level2) {
        vx2.m53591g(level2, "level");
        level(level2);
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HttpLoggingInterceptor(Logger logger2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Logger.DEFAULT : logger2);
    }
}
