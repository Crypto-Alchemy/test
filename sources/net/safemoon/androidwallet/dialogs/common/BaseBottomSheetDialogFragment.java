package net.safemoon.androidwallet.dialogs.common;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C4214a;
import com.google.android.material.bottomsheet.C4221b;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0017J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00108DX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/common/BaseBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "p", "Lr37;", "onStart", "Landroid/view/View;", "bottomSheet", "G", "Lcom/google/android/material/bottomsheet/a;", "bottomSheetDialog", "H", "", "E", "Lho2;", "Q", "Lef3;", "D", "()Lho2;", "iHomeInterface", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: BaseBottomSheetDialogFragment.kt */
public class BaseBottomSheetDialogFragment extends C4221b {

    /* renamed from: Q */
    public final ef3 f41844Q = C6169a.m47232a(new BaseBottomSheetDialogFragment$iHomeInterface$2(this));

    /* renamed from: F */
    public static final void m66325F(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment, DialogInterface dialogInterface) {
        vx2.m53591g(baseBottomSheetDialogFragment, "this$0");
        vx2.m53589e(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        C4214a aVar = (C4214a) dialogInterface;
        baseBottomSheetDialogFragment.mo57364H(aVar);
        View findViewById = aVar.findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            BottomSheetBehavior y = BottomSheetBehavior.m34816y(findViewById);
            vx2.m53590f(y, "from(it)");
            baseBottomSheetDialogFragment.mo57363G(findViewById);
            y.mo31876V(3);
        }
    }

    /* renamed from: D */
    public final ho2 mo57361D() {
        return (ho2) this.f41844Q.getValue();
    }

    /* renamed from: E */
    public final int mo57362E() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Activity activity = (Activity) getContext();
        vx2.m53588d(activity);
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: G */
    public final void mo57363G(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: H */
    public final void mo57364H(C4214a aVar) {
        View findViewById = aVar.findViewById(R.id.design_bottom_sheet);
        vx2.m53589e(findViewById, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        vx2.m53590f(BottomSheetBehavior.m34816y(frameLayout), "from(bottomSheet)");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        int E = mo57362E();
        if (layoutParams != null) {
            layoutParams.height = E;
        }
        frameLayout.setLayoutParams(layoutParams);
    }

    public void onStart() {
        super.onStart();
        ViewParent parent = requireView().getParent();
        vx2.m53589e(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior y = BottomSheetBehavior.m34816y((View) parent);
        vx2.m53590f(y, "from(requireView().parent as View)");
        y.mo31876V(3);
    }

    /* renamed from: p */
    public Dialog mo22273p(Bundle bundle) {
        Dialog p = super.mo22273p(bundle);
        vx2.m53590f(p, "super.onCreateDialog(savedInstanceState)");
        p.setOnShowListener(new C9650yx(this));
        return p;
    }
}
