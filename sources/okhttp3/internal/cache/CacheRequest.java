package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, mo44877d2 = {"Lokhttp3/internal/cache/CacheRequest;", "", "Ls36;", "body", "Lr37;", "abort", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: CacheRequest.kt */
public interface CacheRequest {
    void abort();

    s36 body() throws IOException;
}
