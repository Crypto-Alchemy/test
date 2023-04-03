package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.internal.concurrent.Task;

@Metadata(mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, mo44877d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "runOnce", "", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* renamed from: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1 */
/* compiled from: TaskQueue.kt */
public final class C9033x3eab89f6 extends Task {
    public final /* synthetic */ boolean $cancelable;
    public final /* synthetic */ String $name;
    public final /* synthetic */ int $streamId$inlined;
    public final /* synthetic */ long $unacknowledgedBytesRead$inlined;
    public final /* synthetic */ Http2Connection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9033x3eab89f6(String str, boolean z, Http2Connection http2Connection, int i, long j) {
        super(str, z);
        this.$name = str;
        this.$cancelable = z;
        this.this$0 = http2Connection;
        this.$streamId$inlined = i;
        this.$unacknowledgedBytesRead$inlined = j;
    }

    public long runOnce() {
        try {
            this.this$0.getWriter().windowUpdate(this.$streamId$inlined, this.$unacknowledgedBytesRead$inlined);
            return -1;
        } catch (IOException e) {
            this.this$0.failConnection(e);
            return -1;
        }
    }
}
