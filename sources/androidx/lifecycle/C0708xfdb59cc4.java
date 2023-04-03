package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo44877d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/e;", "Lug3;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lr37;", "f", "lifecycle-runtime-ktx_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 */
/* compiled from: WithLifecycleState.kt */
public final class C0708xfdb59cc4 implements C0715e {

    /* renamed from: a */
    public final /* synthetic */ Lifecycle.State f3940a;

    /* renamed from: d */
    public final /* synthetic */ Lifecycle f3941d;

    /* renamed from: e */
    public final /* synthetic */ ma0<Object> f3942e;

    /* renamed from: g */
    public final /* synthetic */ pc2<Object> f3943g;

    /* renamed from: f */
    public void mo907f(ug3 ug3, Lifecycle.Event event) {
        Object obj;
        vx2.m53591g(ug3, "source");
        vx2.m53591g(event, "event");
        if (event == Lifecycle.Event.upTo(this.f3940a)) {
            this.f3941d.mo6297c(this);
            ma0<Object> ma0 = this.f3942e;
            pc2<Object> pc2 = this.f3943g;
            try {
                Result.C6167a aVar = Result.Companion;
                obj = Result.m75635constructorimpl(pc2.invoke());
            } catch (Throwable th) {
                Result.C6167a aVar2 = Result.Companion;
                obj = Result.m75635constructorimpl(hg5.m45198a(th));
            }
            ma0.resumeWith(obj);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            this.f3941d.mo6297c(this);
            ma0<Object> ma02 = this.f3942e;
            Result.C6167a aVar3 = Result.Companion;
            ma02.resumeWith(Result.m75635constructorimpl(hg5.m45198a(new LifecycleDestroyedException())));
        }
    }
}
