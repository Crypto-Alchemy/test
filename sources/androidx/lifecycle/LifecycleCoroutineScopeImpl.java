package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u000e\u001a\u00020\n8\u0010X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/e;", "Lr37;", "c", "Lug3;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "f", "Landroidx/lifecycle/Lifecycle;", "a", "Landroidx/lifecycle/Lifecycle;", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlin/coroutines/CoroutineContext;", "d", "Lkotlin/coroutines/CoroutineContext;", "A", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroidx/lifecycle/Lifecycle;Lkotlin/coroutines/CoroutineContext;)V", "lifecycle-runtime-ktx_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Lifecycle.kt */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements C0715e {

    /* renamed from: a */
    public final Lifecycle f3906a;

    /* renamed from: d */
    public final CoroutineContext f3907d;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        vx2.m53591g(lifecycle, "lifecycle");
        vx2.m53591g(coroutineContext, "coroutineContext");
        this.f3906a = lifecycle;
        this.f3907d = coroutineContext;
        if (mo6300a().mo6296b() == Lifecycle.State.DESTROYED) {
            i33.m58818f(mo6303A(), (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: A */
    public CoroutineContext mo6303A() {
        return this.f3907d;
    }

    /* renamed from: a */
    public Lifecycle mo6300a() {
        return this.f3906a;
    }

    /* renamed from: c */
    public final void mo6304c() {
        y23 unused = d50.m56748b(this, qh1.m71266c().mo55551K(), (CoroutineStart) null, new LifecycleCoroutineScopeImpl$register$1(this, (ns0<? super LifecycleCoroutineScopeImpl$register$1>) null), 2, (Object) null);
    }

    /* renamed from: f */
    public void mo907f(ug3 ug3, Lifecycle.Event event) {
        vx2.m53591g(ug3, "source");
        vx2.m53591g(event, "event");
        if (mo6300a().mo6296b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            mo6300a().mo6297c(this);
            i33.m58818f(mo6303A(), (CancellationException) null, 1, (Object) null);
        }
    }
}
