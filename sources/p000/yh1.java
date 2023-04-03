package p000;

import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, mo44877d2 = {"Lyh1;", "Lzh1;", "Lr37;", "dispose", "", "toString", "Ljava/util/concurrent/Future;", "a", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: yh1 */
/* compiled from: Executors.kt */
public final class yh1 implements zh1 {

    /* renamed from: a */
    public final Future<?> f46209a;

    public yh1(Future<?> future) {
        this.f46209a = future;
    }

    public void dispose() {
        this.f46209a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f46209a + ']';
    }
}
