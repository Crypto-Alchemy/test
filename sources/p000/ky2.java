package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0007j\u0002`\b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\u000b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0007j\u0002`\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lky2;", "Lz23;", "", "cause", "Lr37;", "A", "(Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "k", "Lrc2;", "handler", "<init>", "(Lrc2;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: ky2 */
/* compiled from: JobSupport.kt */
public final class ky2 extends z23 {

    /* renamed from: r */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40546r = AtomicIntegerFieldUpdater.newUpdater(ky2.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: k */
    public final rc2<Throwable, r37> f40547k;

    public ky2(rc2<? super Throwable, r37> rc2) {
        this.f40547k = rc2;
    }

    /* renamed from: A */
    public void mo51481A(Throwable th) {
        if (f40546r.compareAndSet(this, 0, 1)) {
            this.f40547k.invoke(th);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo51481A((Throwable) obj);
        return r37.f33317a;
    }
}
