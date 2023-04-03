package okhttp3.internal.connection;

import kotlin.Metadata;
import okhttp3.internal.p023ws.RealWebSocket;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"okhttp3/internal/connection/RealConnection$newWebSocketStreams$1", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "Lr37;", "close", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: RealConnection.kt */
public final class RealConnection$newWebSocketStreams$1 extends RealWebSocket.Streams {
    public final /* synthetic */ Exchange $exchange;
    public final /* synthetic */ v40 $sink;
    public final /* synthetic */ w40 $source;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealConnection$newWebSocketStreams$1(w40 w40, v40 v40, Exchange exchange) {
        super(true, w40, v40);
        this.$source = w40;
        this.$sink = v40;
        this.$exchange = exchange;
    }

    public void close() {
        this.$exchange.bodyComplete(-1, true, true, null);
    }
}
