package p000;

import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\r"}, mo44877d2 = {"Lfa0;", "Lga0;", "", "cause", "Lr37;", "a", "", "toString", "Ljava/util/concurrent/Future;", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: fa0 */
/* compiled from: Future.kt */
public final class fa0 extends ga0 {

    /* renamed from: a */
    public final Future<?> f37739a;

    public fa0(Future<?> future) {
        this.f37739a = future;
    }

    /* renamed from: a */
    public void mo50904a(Throwable th) {
        if (th != null) {
            this.f37739a.cancel(false);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo50904a((Throwable) obj);
        return r37.f33317a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f37739a + ']';
    }
}
