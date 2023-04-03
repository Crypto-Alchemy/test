package p000;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo44877d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "a", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;", "coroutineScope", "lifecycle-runtime-ktx_release"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: rg3 */
/* compiled from: Lifecycle.kt */
public final class rg3 {
    /* renamed from: a */
    public static final LifecycleCoroutineScope m26183a(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        vx2.m53591g(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.f3902a.get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, qd6.m71250b((y23) null, 1, (Object) null).plus(qh1.m71266c().mo55551K()));
        } while (!ao0.m10672a(lifecycle.f3902a, (Object) null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.mo6304c();
        return lifecycleCoroutineScopeImpl;
    }
}
