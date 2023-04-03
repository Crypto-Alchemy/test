package p000;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlinx.coroutines.C7758b;
import kotlinx.coroutines.C7766d;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\f\u001a\u00020\t8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lot1;", "Lnt1;", "Lr37;", "h0", "", "now", "Lkotlinx/coroutines/d$c;", "delayedTask", "g0", "Ljava/lang/Thread;", "e0", "()Ljava/lang/Thread;", "thread", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: ot1 */
/* compiled from: EventLoop.kt */
public abstract class ot1 extends nt1 {
    /* renamed from: e0 */
    public abstract Thread mo55565e0();

    /* renamed from: g0 */
    public void mo55566g0(long j, C7766d.C7769c cVar) {
        C7758b.f40363x.mo55591A0(j, cVar);
    }

    /* renamed from: h0 */
    public final void mo65197h0() {
        Thread e0 = mo55565e0();
        if (Thread.currentThread() != e0) {
            C7208i7.m58864a();
            LockSupport.unpark(e0);
        }
    }
}
