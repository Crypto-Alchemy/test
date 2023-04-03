package p000;

import com.google.errorprone.annotations.DoNotMock;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

@DoNotMock("Use the methods in Futures (like immediateFuture) or SettableFuture")
/* renamed from: hi3 */
/* compiled from: ListenableFuture */
public interface hi3<V> extends Future<V> {
    /* renamed from: l */
    void mo10867l(Runnable runnable, Executor executor);
}
