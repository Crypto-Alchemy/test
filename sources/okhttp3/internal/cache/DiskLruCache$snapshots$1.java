package okhttp3.internal.cache;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import okhttp3.internal.cache.DiskLruCache;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\t\u0010\u0005\u001a\u00020\u0004H\u0002J\r\u0010\u0006\u001a\u00060\u0002R\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R*\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012 \n*\b\u0018\u00010\tR\u00020\u00030\tR\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, mo44877d2 = {"okhttp3/internal/cache/DiskLruCache$snapshots$1", "", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "", "hasNext", "next", "Lr37;", "remove", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "kotlin.jvm.PlatformType", "delegate", "Ljava/util/Iterator;", "nextSnapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "removeSnapshot", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: DiskLruCache.kt */
public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, a93 {
    private final Iterator<DiskLruCache.Entry> delegate;
    private DiskLruCache.Snapshot nextSnapshot;
    private DiskLruCache.Snapshot removeSnapshot;
    public final /* synthetic */ DiskLruCache this$0;

    public DiskLruCache$snapshots$1(DiskLruCache diskLruCache) {
        this.this$0 = diskLruCache;
        Iterator<DiskLruCache.Entry> it = new ArrayList(diskLruCache.getLruEntries$okhttp().values()).iterator();
        vx2.m53590f(it, "ArrayList(lruEntries.values).iterator()");
        this.delegate = it;
    }

    public boolean hasNext() {
        DiskLruCache.Snapshot snapshot;
        if (this.nextSnapshot != null) {
            return true;
        }
        DiskLruCache diskLruCache = this.this$0;
        synchronized (diskLruCache) {
            if (diskLruCache.getClosed$okhttp()) {
                return false;
            }
            while (this.delegate.hasNext()) {
                DiskLruCache.Entry next = this.delegate.next();
                if (next == null) {
                    snapshot = null;
                } else {
                    snapshot = next.snapshot$okhttp();
                }
                if (snapshot != null) {
                    this.nextSnapshot = snapshot;
                    return true;
                }
            }
            r37 r37 = r37.f33317a;
            return false;
        }
    }

    public void remove() {
        DiskLruCache.Snapshot snapshot = this.removeSnapshot;
        if (snapshot != null) {
            try {
                this.this$0.remove(snapshot.key());
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.removeSnapshot = null;
                throw th;
            }
            this.removeSnapshot = null;
            return;
        }
        throw new IllegalStateException("remove() before next()".toString());
    }

    public DiskLruCache.Snapshot next() {
        if (hasNext()) {
            DiskLruCache.Snapshot snapshot = this.nextSnapshot;
            this.removeSnapshot = snapshot;
            this.nextSnapshot = null;
            vx2.m53588d(snapshot);
            return snapshot;
        }
        throw new NoSuchElementException();
    }
}
