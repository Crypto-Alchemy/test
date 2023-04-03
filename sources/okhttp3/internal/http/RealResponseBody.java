package okhttp3.internal.http;

import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000f"}, mo44877d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", "", "contentLength", "Lokhttp3/MediaType;", "contentType", "Lw40;", "source", "", "contentTypeString", "Ljava/lang/String;", "J", "Lw40;", "<init>", "(Ljava/lang/String;JLw40;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: RealResponseBody.kt */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final w40 source;

    public RealResponseBody(String str, long j, w40 w40) {
        vx2.m53591g(w40, "source");
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = w40;
    }

    public long contentLength() {
        return this.contentLength;
    }

    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str == null) {
            return null;
        }
        return MediaType.Companion.parse(str);
    }

    public w40 source() {
        return this.source;
    }
}
