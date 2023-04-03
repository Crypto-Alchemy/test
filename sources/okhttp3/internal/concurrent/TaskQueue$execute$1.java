package okhttp3.internal.concurrent;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo44877d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "runOnce", "", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 176)
/* compiled from: TaskQueue.kt */
public final class TaskQueue$execute$1 extends Task {
    public final /* synthetic */ pc2<r37> $block;
    public final /* synthetic */ boolean $cancelable;
    public final /* synthetic */ String $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(String str, boolean z, pc2<r37> pc2) {
        super(str, z);
        this.$name = str;
        this.$cancelable = z;
        this.$block = pc2;
    }

    public long runOnce() {
        this.$block.invoke();
        return -1;
    }
}
