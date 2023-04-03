package okhttp3.internal.p023ws;

import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.p023ws.RealWebSocket;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, mo44877d2 = {"okhttp3/internal/ws/RealWebSocket$connect$1", "Lokhttp3/Callback;", "Lokhttp3/Call;", "call", "Lokhttp3/Response;", "response", "Lr37;", "onResponse", "Ljava/io/IOException;", "e", "onFailure", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: okhttp3.internal.ws.RealWebSocket$connect$1 */
/* compiled from: RealWebSocket.kt */
public final class RealWebSocket$connect$1 implements Callback {
    public final /* synthetic */ Request $request;
    public final /* synthetic */ RealWebSocket this$0;

    public RealWebSocket$connect$1(RealWebSocket realWebSocket, Request request) {
        this.this$0 = realWebSocket;
        this.$request = request;
    }

    public void onFailure(Call call, IOException iOException) {
        vx2.m53591g(call, "call");
        vx2.m53591g(iOException, "e");
        this.this$0.failWebSocket(iOException, (Response) null);
    }

    public void onResponse(Call call, Response response) {
        vx2.m53591g(call, "call");
        vx2.m53591g(response, "response");
        Exchange exchange = response.exchange();
        try {
            this.this$0.checkUpgradeSuccess$okhttp(response, exchange);
            vx2.m53588d(exchange);
            RealWebSocket.Streams newWebSocketStreams = exchange.newWebSocketStreams();
            WebSocketExtensions parse = WebSocketExtensions.Companion.parse(response.headers());
            this.this$0.extensions = parse;
            if (!this.this$0.isValid(parse)) {
                RealWebSocket realWebSocket = this.this$0;
                synchronized (realWebSocket) {
                    realWebSocket.messageAndCloseQueue.clear();
                    realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                this.this$0.initReaderAndWriter(Util.okHttpName + " WebSocket " + this.$request.url().redact(), newWebSocketStreams);
                this.this$0.getListener$okhttp().onOpen(this.this$0, response);
                this.this$0.loopReader();
            } catch (Exception e) {
                this.this$0.failWebSocket(e, (Response) null);
            }
        } catch (IOException e2) {
            if (exchange != null) {
                exchange.webSocketUpgradeFailed();
            }
            this.this$0.failWebSocket(e2, response);
            Util.closeQuietly((Closeable) response);
        }
    }
}
