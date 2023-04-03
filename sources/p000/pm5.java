package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001c\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J+\u0010\r\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0002R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, mo44877d2 = {"Lpm5;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lr37;", "m", "y", "Lzl6;", "", "tailDispatch", "L", "(Ljava/lang/Runnable;Lzl6;Z)V", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "K", "", "g", "I", "corePoolSize", "k", "maxPoolSize", "", "r", "J", "idleWorkerKeepAliveNs", "", "s", "Ljava/lang/String;", "schedulerName", "x", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "coroutineScheduler", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: pm5 */
/* compiled from: Dispatcher.kt */
public class pm5 extends ExecutorCoroutineDispatcher {

    /* renamed from: g */
    public final int f44066g;

    /* renamed from: k */
    public final int f44067k;

    /* renamed from: r */
    public final long f44068r;

    /* renamed from: s */
    public final String f44069s;

    /* renamed from: x */
    public CoroutineScheduler f44070x = mo65319K();

    public pm5(int i, int i2, long j, String str) {
        this.f44066g = i;
        this.f44067k = i2;
        this.f44068r = j;
        this.f44069s = str;
    }

    /* renamed from: K */
    public final CoroutineScheduler mo65319K() {
        return new CoroutineScheduler(this.f44066g, this.f44067k, this.f44068r, this.f44069s);
    }

    /* renamed from: L */
    public final void mo65320L(Runnable runnable, zl6 zl6, boolean z) {
        this.f44070x.mo55710e(runnable, zl6, z);
    }

    /* renamed from: m */
    public void mo3894m(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler.m63498f(this.f44070x, runnable, (zl6) null, false, 6, (Object) null);
    }

    /* renamed from: y */
    public void mo50471y(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler.m63498f(this.f44070x, runnable, (zl6) null, true, 2, (Object) null);
    }
}
