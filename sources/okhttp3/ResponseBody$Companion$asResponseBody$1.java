package okhttp3;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo44877d2 = {"okhttp3/ResponseBody$Companion$asResponseBody$1", "Lokhttp3/ResponseBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lw40;", "source", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: ResponseBody.kt */
public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {
    public final /* synthetic */ long $contentLength;
    public final /* synthetic */ MediaType $contentType;
    public final /* synthetic */ w40 $this_asResponseBody;

    public ResponseBody$Companion$asResponseBody$1(MediaType mediaType, long j, w40 w40) {
        this.$contentType = mediaType;
        this.$contentLength = j;
        this.$this_asResponseBody = w40;
    }

    public long contentLength() {
        return this.$contentLength;
    }

    public MediaType contentType() {
        return this.$contentType;
    }

    public w40 source() {
        return this.$this_asResponseBody;
    }
}
