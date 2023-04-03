package p000;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118TX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, mo44877d2 = {"Lm30;", "T", "Ly5;", "", "state", "Lr37;", "N", "T0", "()Ljava/lang/Object;", "Ljava/lang/Thread;", "e", "Ljava/lang/Thread;", "blockedThread", "Lnt1;", "g", "Lnt1;", "eventLoop", "", "n0", "()Z", "isScopedCoroutine", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lnt1;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: m30 */
/* compiled from: Builders.kt */
public final class m30<T> extends C9627y5<T> {

    /* renamed from: e */
    public final Thread f40745e;

    /* renamed from: g */
    public final nt1 f40746g;

    public m30(CoroutineContext coroutineContext, Thread thread, nt1 nt1) {
        super(coroutineContext, true, true);
        this.f40745e = thread;
        this.f40746g = nt1;
    }

    /* renamed from: N */
    public void mo52755N(Object obj) {
        if (!vx2.m53586b(Thread.currentThread(), this.f40745e)) {
            Thread thread = this.f40745e;
            C7208i7.m58864a();
            LockSupport.unpark(thread);
        }
    }

    /* renamed from: T0 */
    public final T mo56011T0() {
        long j;
        C7208i7.m58864a();
        try {
            nt1 nt1 = this.f40746g;
            lm0 lm0 = null;
            if (nt1 != null) {
                nt1.m70076S(nt1, false, 1, (Object) null);
            }
            while (!Thread.interrupted()) {
                nt1 nt12 = this.f40746g;
                if (nt12 != null) {
                    j = nt12.mo55597Y();
                } else {
                    j = Long.MAX_VALUE;
                }
                if (!mo55517m0()) {
                    C7208i7.m58864a();
                    LockSupport.parkNanos(this, j);
                } else {
                    nt1 nt13 = this.f40746g;
                    if (nt13 != null) {
                        nt1.m70075L(nt13, false, 1, (Object) null);
                    }
                    C7208i7.m58864a();
                    T h = k33.m59674h(mo55512i0());
                    if (h instanceof lm0) {
                        lm0 = (lm0) h;
                    }
                    if (lm0 == null) {
                        return h;
                    }
                    throw lm0.f40642a;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            mo55494Q(interruptedException);
            throw interruptedException;
        } catch (Throwable th) {
            C7208i7.m58864a();
            throw th;
        }
    }

    /* renamed from: n0 */
    public boolean mo52758n0() {
        return true;
    }
}
