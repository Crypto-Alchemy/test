package p000;

import com.tinder.scarlet.internal.connection.Connection;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import p000.et1;
import p000.kg3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0006\u0010\f\u001a\u00020\u0003R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lah3;", "Lbi1;", "Lkg3$a;", "Lr37;", "a", "lifecycleState", "e", "onComplete", "", "throwable", "", "d", "f", "Lcom/tinder/scarlet/internal/connection/Connection$StateManager;", "Lcom/tinder/scarlet/internal/connection/Connection$StateManager;", "stateManager", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "pendingRequestCount", "<init>", "(Lcom/tinder/scarlet/internal/connection/Connection$StateManager;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: ah3 */
/* compiled from: LifecycleStateSubscriber.kt */
public final class ah3 extends bi1<kg3.C6147a> {

    /* renamed from: d */
    public final Connection.StateManager f20948d;

    /* renamed from: e */
    public final AtomicInteger f20949e = new AtomicInteger();

    public ah3(Connection.StateManager stateManager) {
        vx2.m53591g(stateManager, "stateManager");
        this.f20948d = stateManager;
    }

    /* renamed from: a */
    public void mo28971a() {
        mo29590c(1);
    }

    /* renamed from: d */
    public Void onError(Throwable th) {
        vx2.m53591g(th, "throwable");
        throw th;
    }

    /* renamed from: e */
    public void onNext(kg3.C6147a aVar) {
        vx2.m53591g(aVar, "lifecycleState");
        if (this.f20949e.decrementAndGet() < 0) {
            this.f20949e.set(0);
        }
        this.f20948d.mo39686n(new et1.C5810a.C5811a(aVar));
    }

    /* renamed from: f */
    public final void mo28974f() {
        if (this.f20949e.get() == 0) {
            this.f20949e.incrementAndGet();
            mo29590c(1);
        }
    }

    public void onComplete() {
        this.f20948d.mo39686n(et1.C5810a.C5812b.f28655a);
    }
}
