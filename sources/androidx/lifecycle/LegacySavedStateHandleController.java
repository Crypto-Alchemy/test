package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import p000.gl5;

public class LegacySavedStateHandleController {

    /* renamed from: androidx.lifecycle.LegacySavedStateHandleController$a */
    public static final class C0696a implements gl5.C2402a {
        /* renamed from: a */
        public void mo6294a(il5 il5) {
            if (il5 instanceof hd7) {
                gd7 viewModelStore = ((hd7) il5).getViewModelStore();
                gl5 savedStateRegistry = il5.getSavedStateRegistry();
                for (String b : viewModelStore.mo20541c()) {
                    LegacySavedStateHandleController.m5025a(viewModelStore.mo20540b(b), savedStateRegistry, il5.getLifecycle());
                }
                if (!viewModelStore.mo20541c().isEmpty()) {
                    savedStateRegistry.mo20649i(C0696a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    /* renamed from: a */
    public static void m5025a(ad7 ad7, gl5 gl5, Lifecycle lifecycle) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) ad7.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.mo6365c()) {
            savedStateHandleController.mo6363a(gl5, lifecycle);
            m5027c(gl5, lifecycle);
        }
    }

    /* renamed from: b */
    public static SavedStateHandleController m5026b(gl5 gl5, Lifecycle lifecycle, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, dl5.m15195e(gl5.mo20643b(str), bundle));
        savedStateHandleController.mo6363a(gl5, lifecycle);
        m5027c(gl5, lifecycle);
        return savedStateHandleController;
    }

    /* renamed from: c */
    public static void m5027c(final gl5 gl5, final Lifecycle lifecycle) {
        Lifecycle.State b = lifecycle.mo6296b();
        if (b == Lifecycle.State.INITIALIZED || b.isAtLeast(Lifecycle.State.STARTED)) {
            gl5.mo20649i(C0696a.class);
        } else {
            lifecycle.mo6295a(new C0715e() {
                /* renamed from: f */
                public void mo907f(ug3 ug3, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_START) {
                        Lifecycle.this.mo6297c(this);
                        gl5.mo20649i(C0696a.class);
                    }
                }
            });
        }
    }
}
