package okhttp3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u0000 \u00072\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, mo44877d2 = {"Lokhttp3/Interceptor;", "", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Chain", "Companion", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: Interceptor.kt */
public interface Interceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0013\u001a\u00020\u0005H&¨\u0006\u0014"}, mo44877d2 = {"Lokhttp3/Interceptor$Chain;", "", "call", "Lokhttp3/Call;", "connectTimeoutMillis", "", "connection", "Lokhttp3/Connection;", "proceed", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "readTimeoutMillis", "withConnectTimeout", "timeout", "unit", "Ljava/util/concurrent/TimeUnit;", "withReadTimeout", "withWriteTimeout", "writeTimeoutMillis", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: Interceptor.kt */
    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        Connection connection();

        Response proceed(Request request) throws IOException;

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int i, TimeUnit timeUnit);

        Chain withReadTimeout(int i, TimeUnit timeUnit);

        Chain withWriteTimeout(int i, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\u00020\u00062\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\nø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\n"}, mo44877d2 = {"Lokhttp3/Interceptor$Companion;", "", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lokhttp3/Response;", "block", "Lokhttp3/Interceptor;", "invoke", "<init>", "()V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Interceptor.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Interceptor invoke(rc2<? super Chain, Response> rc2) {
            vx2.m53591g(rc2, "block");
            return new Interceptor$Companion$invoke$1(rc2);
        }
    }

    Response intercept(Chain chain) throws IOException;
}
