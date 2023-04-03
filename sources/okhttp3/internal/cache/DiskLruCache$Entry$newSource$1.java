package okhttp3.internal.cache;

import kotlin.Metadata;
import okhttp3.internal.cache.DiskLruCache;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo44877d2 = {"okhttp3/internal/cache/DiskLruCache$Entry$newSource$1", "Lq82;", "Lr37;", "close", "", "closed", "Z", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: DiskLruCache.kt */
public final class DiskLruCache$Entry$newSource$1 extends q82 {
    public final /* synthetic */ z56 $fileSource;
    private boolean closed;
    public final /* synthetic */ DiskLruCache this$0;
    public final /* synthetic */ DiskLruCache.Entry this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Entry$newSource$1(z56 z56, DiskLruCache diskLruCache, DiskLruCache.Entry entry) {
        super(z56);
        this.$fileSource = z56;
        this.this$0 = diskLruCache;
        this.this$1 = entry;
    }

    public void close() {
        super.close();
        if (!this.closed) {
            this.closed = true;
            DiskLruCache diskLruCache = this.this$0;
            DiskLruCache.Entry entry = this.this$1;
            synchronized (diskLruCache) {
                entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                if (entry.getLockingSourceCount$okhttp() == 0 && entry.getZombie$okhttp()) {
                    diskLruCache.removeEntry$okhttp(entry);
                }
                r37 r37 = r37.f33317a;
            }
        }
    }
}
