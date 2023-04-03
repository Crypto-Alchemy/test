package okhttp3.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.concurrent.Task;

@Metadata(mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo44877d2 = {"okhttp3/internal/connection/RealConnectionPool$cleanupTask$1", "Lokhttp3/internal/concurrent/Task;", "runOnce", "", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: RealConnectionPool.kt */
public final class RealConnectionPool$cleanupTask$1 extends Task {
    public final /* synthetic */ RealConnectionPool this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealConnectionPool$cleanupTask$1(RealConnectionPool realConnectionPool, String str) {
        super(str, false, 2, (DefaultConstructorMarker) null);
        this.this$0 = realConnectionPool;
    }

    public long runOnce() {
        return this.this$0.cleanup(System.nanoTime());
    }
}
