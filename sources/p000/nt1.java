package p000;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0010\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004J\b\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028TX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006$"}, mo44877d2 = {"Lnt1;", "Lkotlinx/coroutines/CoroutineDispatcher;", "", "Y", "", "b0", "c0", "Lnh1;", "task", "Lr37;", "O", "unconfined", "Q", "K", "shutdown", "N", "e", "J", "useCount", "g", "Z", "shared", "Lpq;", "k", "Lpq;", "unconfinedQueue", "P", "()J", "nextTime", "W", "()Z", "isUnconfinedLoopActive", "X", "isUnconfinedQueueEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: nt1 */
/* compiled from: EventLoop.common.kt */
public abstract class nt1 extends CoroutineDispatcher {

    /* renamed from: e */
    public long f43558e;

    /* renamed from: g */
    public boolean f43559g;

    /* renamed from: k */
    public C9184pq<nh1<?>> f43560k;

    /* renamed from: L */
    public static /* synthetic */ void m70075L(nt1 nt1, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            nt1.mo62799K(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    /* renamed from: S */
    public static /* synthetic */ void m70076S(nt1 nt1, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            nt1.mo62802Q(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: K */
    public final void mo62799K(boolean z) {
        long N = this.f43558e - mo62800N(z);
        this.f43558e = N;
        if (N <= 0 && this.f43559g) {
            shutdown();
        }
    }

    /* renamed from: N */
    public final long mo62800N(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: O */
    public final void mo62801O(nh1<?> nh1) {
        C9184pq<nh1<?>> pqVar = this.f43560k;
        if (pqVar == null) {
            pqVar = new C9184pq<>();
            this.f43560k = pqVar;
        }
        pqVar.mo65333a(nh1);
    }

    /* renamed from: P */
    public long mo55596P() {
        C9184pq<nh1<?>> pqVar = this.f43560k;
        if (pqVar != null && !pqVar.mo65335c()) {
            return 0;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: Q */
    public final void mo62802Q(boolean z) {
        this.f43558e += mo62800N(z);
        if (!z) {
            this.f43559g = true;
        }
    }

    /* renamed from: W */
    public final boolean mo62803W() {
        if (this.f43558e >= mo62800N(true)) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public final boolean mo62804X() {
        C9184pq<nh1<?>> pqVar = this.f43560k;
        if (pqVar != null) {
            return pqVar.mo65335c();
        }
        return true;
    }

    /* renamed from: Y */
    public long mo55597Y() {
        if (!mo62805b0()) {
            return Long.MAX_VALUE;
        }
        return 0;
    }

    /* renamed from: b0 */
    public final boolean mo62805b0() {
        nh1 d;
        C9184pq<nh1<?>> pqVar = this.f43560k;
        if (pqVar == null || (d = pqVar.mo65336d()) == null) {
            return false;
        }
        d.run();
        return true;
    }

    /* renamed from: c0 */
    public boolean mo62806c0() {
        return false;
    }

    public void shutdown() {
    }
}
