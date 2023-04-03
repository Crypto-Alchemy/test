package p000;

import androidx.lifecycle.C0715e;
import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p000.y23;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, mo44877d2 = {"Log3;", "", "Lr37;", "b", "Landroidx/lifecycle/Lifecycle;", "a", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle$State;", "Landroidx/lifecycle/Lifecycle$State;", "minState", "Lkh1;", "c", "Lkh1;", "dispatchQueue", "Landroidx/lifecycle/e;", "d", "Landroidx/lifecycle/e;", "observer", "Ly23;", "parentJob", "<init>", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkh1;Ly23;)V", "lifecycle-runtime-ktx_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: og3 */
/* compiled from: LifecycleController.kt */
public final class og3 {

    /* renamed from: a */
    public final Lifecycle f15887a;

    /* renamed from: b */
    public final Lifecycle.State f15888b;

    /* renamed from: c */
    public final kh1 f15889c;

    /* renamed from: d */
    public final C0715e f15890d;

    public og3(Lifecycle lifecycle, Lifecycle.State state, kh1 kh1, y23 y23) {
        vx2.m53591g(lifecycle, "lifecycle");
        vx2.m53591g(state, "minState");
        vx2.m53591g(kh1, "dispatchQueue");
        vx2.m53591g(y23, "parentJob");
        this.f15887a = lifecycle;
        this.f15888b = state;
        this.f15889c = kh1;
        ng3 ng3 = new ng3(this, y23);
        this.f15890d = ng3;
        if (lifecycle.mo6296b() == Lifecycle.State.DESTROYED) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
            mo23948b();
            return;
        }
        lifecycle.mo6295a(ng3);
    }

    /* renamed from: c */
    public static final void m23811c(og3 og3, y23 y23, ug3 ug3, Lifecycle.Event event) {
        vx2.m53591g(og3, "this$0");
        vx2.m53591g(y23, "$parentJob");
        vx2.m53591g(ug3, "source");
        vx2.m53591g(event, "<anonymous parameter 1>");
        if (ug3.getLifecycle().mo6296b() == Lifecycle.State.DESTROYED) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
            og3.mo23948b();
        } else if (ug3.getLifecycle().mo6296b().compareTo(og3.f15888b) < 0) {
            og3.f15889c.mo22298h();
        } else {
            og3.f15889c.mo22299i();
        }
    }

    /* renamed from: b */
    public final void mo23948b() {
        this.f15887a.mo6297c(this.f15890d);
        this.f15889c.mo22297g();
    }
}
