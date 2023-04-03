package p000;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Ln56;", "T", "", "a", "()Ljava/lang/Object;", "value", "Lr37;", "b", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljp6;", "Landroidx/compose/runtime/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "map", "Ljava/lang/Object;", "writeMutex", "<init>", "()V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: n56 */
/* compiled from: ActualJvm.jvm.kt */
public final class n56<T> {

    /* renamed from: a */
    public final AtomicReference<jp6> f15360a = new AtomicReference<>(kp6.m20965a());

    /* renamed from: b */
    public final Object f15361b = new Object();

    /* renamed from: a */
    public final T mo23520a() {
        return this.f15360a.get().mo22032b(Thread.currentThread().getId());
    }

    /* renamed from: b */
    public final void mo23521b(T t) {
        long id = Thread.currentThread().getId();
        synchronized (this.f15361b) {
            jp6 jp6 = this.f15360a.get();
            if (!jp6.mo22034d(id, t)) {
                this.f15360a.set(jp6.mo22033c(id, t));
                r37 r37 = r37.f33317a;
            }
        }
    }
}
