package p000;

import com.tinder.scarlet.internal.connection.Connection;
import kotlin.Metadata;
import p000.et1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Ltg5;", "Lbi1;", "", "t", "Lr37;", "e", "onComplete", "", "throwable", "", "d", "Lcom/tinder/scarlet/internal/connection/Connection$StateManager;", "Lcom/tinder/scarlet/internal/connection/Connection$StateManager;", "stateManager", "<init>", "(Lcom/tinder/scarlet/internal/connection/Connection$StateManager;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: tg5 */
/* compiled from: RetryTimerSubscriber.kt */
public final class tg5 extends bi1<Long> {

    /* renamed from: d */
    public final Connection.StateManager f34259d;

    public tg5(Connection.StateManager stateManager) {
        vx2.m53591g(stateManager, "stateManager");
        this.f34259d = stateManager;
    }

    /* renamed from: d */
    public Void onError(Throwable th) {
        vx2.m53591g(th, "throwable");
        throw th;
    }

    /* renamed from: e */
    public void mo48107e(long j) {
        this.f34259d.mo39686n(et1.C5813b.f28656a);
    }

    public void onComplete() {
    }

    public /* bridge */ /* synthetic */ void onNext(Object obj) {
        mo48107e(((Number) obj).longValue());
    }
}
