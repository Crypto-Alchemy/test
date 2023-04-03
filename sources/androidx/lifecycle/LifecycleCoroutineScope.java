package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\b\u001a\u00020\u00072\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8 X \u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo44877d2 = {"Landroidx/lifecycle/LifecycleCoroutineScope;", "Lhu0;", "Lkotlin/Function2;", "Lns0;", "Lr37;", "", "block", "Ly23;", "b", "(Lfd2;)Ly23;", "Landroidx/lifecycle/Lifecycle;", "a", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "()V", "lifecycle-runtime-ktx_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Lifecycle.kt */
public abstract class LifecycleCoroutineScope implements hu0 {
    /* renamed from: a */
    public abstract Lifecycle mo6300a();

    /* renamed from: b */
    public final y23 mo6301b(fd2<? super hu0, ? super ns0<? super r37>, ? extends Object> fd2) {
        vx2.m53591g(fd2, "block");
        return d50.m56748b(this, (CoroutineContext) null, (CoroutineStart) null, new LifecycleCoroutineScope$launchWhenCreated$1(this, fd2, (ns0<? super LifecycleCoroutineScope$launchWhenCreated$1>) null), 3, (Object) null);
    }
}
