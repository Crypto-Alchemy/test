package p000;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, mo44877d2 = {"Lt56;", "Lzr;", "Ljava/io/IOException;", "cause", "newTimeoutException", "Lr37;", "timedOut", "Ljava/net/Socket;", "a", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: t56 */
/* compiled from: JvmOkio.kt */
public final class t56 extends C9710zr {

    /* renamed from: a */
    public final Socket f44644a;

    public t56(Socket socket) {
        vx2.m53591g(socket, "socket");
        this.f44644a = socket;
    }

    public IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public void timedOut() {
        try {
            this.f44644a.close();
        } catch (Exception e) {
            tg4.f44736a.log(Level.WARNING, vx2.m53598n("Failed to close timed out socket ", this.f44644a), e);
        } catch (AssertionError e2) {
            if (sg4.m71930e(e2)) {
                tg4.f44736a.log(Level.WARNING, vx2.m53598n("Failed to close timed out socket ", this.f44644a), e2);
                return;
            }
            throw e2;
        }
    }
}
