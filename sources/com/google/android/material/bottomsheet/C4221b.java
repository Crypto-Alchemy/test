package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: com.google.android.material.bottomsheet.b */
/* compiled from: BottomSheetDialogFragment */
public class C4221b extends C3686ym {

    /* renamed from: P */
    public boolean f23533P;

    /* renamed from: com.google.android.material.bottomsheet.b$b */
    /* compiled from: BottomSheetDialogFragment */
    public class C4223b extends BottomSheetBehavior.C4212g {
        public C4223b() {
        }

        /* renamed from: a */
        public void mo31909a(View view, float f) {
        }

        /* renamed from: b */
        public void mo31910b(View view, int i) {
            if (i == 5) {
                C4221b.this.mo31927z();
            }
        }
    }

    /* renamed from: A */
    public final void mo31925A(BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.f23533P = z;
        if (bottomSheetBehavior.mo31857C() == 5) {
            mo31927z();
            return;
        }
        if (mo22269n() instanceof C4214a) {
            ((C4214a) mo22269n()).removeDefaultCallback();
        }
        bottomSheetBehavior.mo31888o(new C4223b());
        bottomSheetBehavior.mo31876V(5);
    }

    /* renamed from: B */
    public final boolean mo31926B(boolean z) {
        Dialog n = mo22269n();
        if (!(n instanceof C4214a)) {
            return false;
        }
        C4214a aVar = (C4214a) n;
        BottomSheetBehavior<FrameLayout> behavior = aVar.getBehavior();
        if (!behavior.mo31860F() || !aVar.getDismissWithAnimation()) {
            return false;
        }
        mo31925A(behavior, z);
        return true;
    }

    /* renamed from: k */
    public void mo22266k() {
        if (!mo31926B(false)) {
            super.mo22266k();
        }
    }

    /* renamed from: l */
    public void mo22267l() {
        if (!mo31926B(true)) {
            super.mo22267l();
        }
    }

    /* renamed from: p */
    public Dialog mo22273p(Bundle bundle) {
        return new C4214a(getContext(), mo22270o());
    }

    /* renamed from: z */
    public final void mo31927z() {
        if (this.f23533P) {
            super.mo22267l();
        } else {
            super.mo22266k();
        }
    }
}
