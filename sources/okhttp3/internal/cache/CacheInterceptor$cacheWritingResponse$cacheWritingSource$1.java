package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal.Util;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, mo44877d2 = {"okhttp3/internal/cache/CacheInterceptor$cacheWritingResponse$cacheWritingSource$1", "Lz56;", "Lm40;", "sink", "", "byteCount", "read", "Lqq6;", "timeout", "Lr37;", "close", "", "cacheRequestClosed", "Z", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: CacheInterceptor.kt */
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements z56 {
    public final /* synthetic */ v40 $cacheBody;
    public final /* synthetic */ CacheRequest $cacheRequest;
    public final /* synthetic */ w40 $source;
    private boolean cacheRequestClosed;

    public CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(w40 w40, CacheRequest cacheRequest, v40 v40) {
        this.$source = w40;
        this.$cacheRequest = cacheRequest;
        this.$cacheBody = v40;
    }

    public void close() throws IOException {
        if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.cacheRequestClosed = true;
            this.$cacheRequest.abort();
        }
        this.$source.close();
    }

    public long read(m40 m40, long j) throws IOException {
        vx2.m53591g(m40, "sink");
        try {
            long read = this.$source.read(m40, j);
            if (read == -1) {
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.$cacheBody.close();
                }
                return -1;
            }
            m40.mo56058g(this.$cacheBody.mo56081r(), m40.size() - read, read);
            this.$cacheBody.mo56039U();
            return read;
        } catch (IOException e) {
            if (!this.cacheRequestClosed) {
                this.cacheRequestClosed = true;
                this.$cacheRequest.abort();
            }
            throw e;
        }
    }

    public qq6 timeout() {
        return this.$source.timeout();
    }
}
