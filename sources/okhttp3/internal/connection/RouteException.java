package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00038\u0006@BX\u000e¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0010"}, mo44877d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "e", "Lr37;", "addConnectException", "firstConnectException", "Ljava/io/IOException;", "getFirstConnectException", "()Ljava/io/IOException;", "<set-?>", "lastConnectException", "getLastConnectException", "<init>", "(Ljava/io/IOException;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: RouteException.kt */
public final class RouteException extends RuntimeException {
    private final IOException firstConnectException;
    private IOException lastConnectException;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RouteException(IOException iOException) {
        super(iOException);
        vx2.m53591g(iOException, "firstConnectException");
        this.firstConnectException = iOException;
        this.lastConnectException = iOException;
    }

    public final void addConnectException(IOException iOException) {
        vx2.m53591g(iOException, "e");
        ru1.m51326a(this.firstConnectException, iOException);
        this.lastConnectException = iOException;
    }

    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
