package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/e;", "Lug3;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lr37;", "f", "Landroidx/lifecycle/SavedStateHandlesProvider;", "a", "Landroidx/lifecycle/SavedStateHandlesProvider;", "provider", "<init>", "(Landroidx/lifecycle/SavedStateHandlesProvider;)V", "lifecycle-viewmodel-savedstate_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: SavedStateHandleSupport.kt */
public final class SavedStateHandleAttacher implements C0715e {

    /* renamed from: a */
    public final SavedStateHandlesProvider f3928a;

    public SavedStateHandleAttacher(SavedStateHandlesProvider savedStateHandlesProvider) {
        vx2.m53591g(savedStateHandlesProvider, "provider");
        this.f3928a = savedStateHandlesProvider;
    }

    /* renamed from: f */
    public void mo907f(ug3 ug3, Lifecycle.Event event) {
        boolean z;
        vx2.m53591g(ug3, "source");
        vx2.m53591g(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ug3.getLifecycle().mo6297c(this);
            this.f3928a.mo6369d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
    }
}
