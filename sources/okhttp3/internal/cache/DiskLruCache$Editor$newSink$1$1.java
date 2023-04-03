package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.cache.DiskLruCache;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Ljava/io/IOException;", "it", "Lr37;", "invoke", "(Ljava/io/IOException;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: DiskLruCache.kt */
public final class DiskLruCache$Editor$newSink$1$1 extends Lambda implements rc2<IOException, r37> {
    public final /* synthetic */ DiskLruCache this$0;
    public final /* synthetic */ DiskLruCache.Editor this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.this$0 = diskLruCache;
        this.this$1 = editor;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return r37.f33317a;
    }

    public final void invoke(IOException iOException) {
        vx2.m53591g(iOException, "it");
        DiskLruCache diskLruCache = this.this$0;
        DiskLruCache.Editor editor = this.this$1;
        synchronized (diskLruCache) {
            editor.detach$okhttp();
            r37 r37 = r37.f33317a;
        }
    }
}
