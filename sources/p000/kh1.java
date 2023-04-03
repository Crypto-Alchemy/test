package p000;

import android.annotation.SuppressLint;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0003R\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, mo44877d2 = {"Lkh1;", "", "Lr37;", "h", "i", "g", "e", "", "b", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "runnable", "c", "f", "a", "Z", "paused", "finished", "isDraining", "Ljava/util/Queue;", "d", "Ljava/util/Queue;", "queue", "<init>", "()V", "lifecycle-runtime-ktx_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: kh1 */
/* compiled from: DispatchQueue.kt */
public final class kh1 {

    /* renamed from: a */
    public boolean f14073a = true;

    /* renamed from: b */
    public boolean f14074b;

    /* renamed from: c */
    public boolean f14075c;

    /* renamed from: d */
    public final Queue<Runnable> f14076d = new ArrayDeque();

    /* renamed from: d */
    public static final void m20710d(kh1 kh1, Runnable runnable) {
        vx2.m53591g(kh1, "this$0");
        vx2.m53591g(runnable, "$runnable");
        kh1.mo22296f(runnable);
    }

    /* renamed from: b */
    public final boolean mo22293b() {
        if (this.f14074b || !this.f14073a) {
            return true;
        }
        return false;
    }

    @SuppressLint({"WrongThread"})
    /* renamed from: c */
    public final void mo22294c(CoroutineContext coroutineContext, Runnable runnable) {
        vx2.m53591g(coroutineContext, "context");
        vx2.m53591g(runnable, "runnable");
        vm3 K = qh1.m71266c().mo55551K();
        if (K.mo28541z(coroutineContext) || mo22293b()) {
            K.mo3894m(coroutineContext, new jh1(this, runnable));
        } else {
            mo22296f(runnable);
        }
    }

    /* renamed from: e */
    public final void mo22295e() {
        if (!this.f14075c) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    if (!(this.f14076d.isEmpty() ^ z)) {
                        break;
                    } else if (!mo22293b()) {
                        break;
                    } else {
                        Runnable poll = this.f14076d.poll();
                        if (poll != null) {
                            poll.run();
                        }
                    }
                }
                this.f14075c = z;
            } finally {
                this.f14075c = z;
            }
        }
    }

    /* renamed from: f */
    public final void mo22296f(Runnable runnable) {
        if (this.f14076d.offer(runnable)) {
            mo22295e();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }

    /* renamed from: g */
    public final void mo22297g() {
        this.f14074b = true;
        mo22295e();
    }

    /* renamed from: h */
    public final void mo22298h() {
        this.f14073a = true;
    }

    /* renamed from: i */
    public final void mo22299i() {
        if (this.f14073a) {
            if (!this.f14074b) {
                this.f14073a = false;
                mo22295e();
                return;
            }
            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
        }
    }
}
