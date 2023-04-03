package p000;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: ob2 */
/* compiled from: FragmentWalletConnectSignatureRequestBinding */
public final class ob2 {

    /* renamed from: a */
    public final ConstraintLayout f32347a;

    /* renamed from: b */
    public final MaterialButton f32348b;

    /* renamed from: c */
    public final b36 f32349c;

    /* renamed from: d */
    public final MaterialTextView f32350d;

    /* renamed from: e */
    public final MaterialTextView f32351e;

    /* renamed from: f */
    public final MaterialTextView f32352f;

    public ob2(ConstraintLayout constraintLayout, MaterialButton materialButton, b36 b36, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f32347a = constraintLayout;
        this.f32348b = materialButton;
        this.f32349c = b36;
        this.f32350d = materialTextView;
        this.f32351e = materialTextView2;
        this.f32352f = materialTextView3;
    }

    /* renamed from: a */
    public static ob2 m49236a(View view) {
        int i = R.id.btnConfirm;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnConfirm);
        if (materialButton != null) {
            i = R.id.toolbarWrapper;
            View a = ca7.m11819a(view, R.id.toolbarWrapper);
            if (a != null) {
                b36 a2 = b36.m32346a(a);
                i = R.id.txtDAppLink;
                MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.txtDAppLink);
                if (materialTextView != null) {
                    i = R.id.txtData;
                    MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view, R.id.txtData);
                    if (materialTextView2 != null) {
                        i = R.id.txtWalletName;
                        MaterialTextView materialTextView3 = (MaterialTextView) ca7.m11819a(view, R.id.txtWalletName);
                        if (materialTextView3 != null) {
                            return new ob2((ConstraintLayout) view, materialButton, a2, materialTextView, materialTextView2, materialTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
