package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2Connection;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"okhttp3/internal/http2/Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/internal/http2/Http2Stream;", "stream", "Lr37;", "onStream", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Http2Connection.kt */
public final class Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 extends Http2Connection.Listener {
    public void onStream(Http2Stream http2Stream) throws IOException {
        vx2.m53591g(http2Stream, "stream");
        http2Stream.close(ErrorCode.REFUSED_STREAM, (IOException) null);
    }
}
