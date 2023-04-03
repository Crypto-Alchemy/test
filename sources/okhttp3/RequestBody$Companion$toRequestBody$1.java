package okhttp3;

import kotlin.Metadata;
import okio.ByteString;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, mo44877d2 = {"okhttp3/RequestBody$Companion$toRequestBody$1", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lv40;", "sink", "Lr37;", "writeTo", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: RequestBody.kt */
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {
    public final /* synthetic */ MediaType $contentType;
    public final /* synthetic */ ByteString $this_toRequestBody;

    public RequestBody$Companion$toRequestBody$1(MediaType mediaType, ByteString byteString) {
        this.$contentType = mediaType;
        this.$this_toRequestBody = byteString;
    }

    public long contentLength() {
        return (long) this.$this_toRequestBody.size();
    }

    public MediaType contentType() {
        return this.$contentType;
    }

    public void writeTo(v40 v40) {
        vx2.m53591g(v40, "sink");
        v40.mo56054e1(this.$this_toRequestBody);
    }
}
