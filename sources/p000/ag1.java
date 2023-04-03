package p000;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: ag1 */
/* compiled from: DialogUnlinkConfirmationBinding */
public final class ag1 {

    /* renamed from: a */
    public final ConstraintLayout f20939a;

    /* renamed from: b */
    public final MaterialButton f20940b;

    /* renamed from: c */
    public final MaterialButton f20941c;

    /* renamed from: d */
    public final MaterialTextView f20942d;

    /* renamed from: e */
    public final MaterialTextView f20943e;

    public ag1(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f20939a = constraintLayout;
        this.f20940b = materialButton;
        this.f20941c = materialButton2;
        this.f20942d = materialTextView;
        this.f20943e = materialTextView2;
    }

    /* renamed from: a */
    public static ag1 m31837a(View view) {
        int i = R.id.btnNegative;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnNegative);
        if (materialButton != null) {
            i = R.id.btnPositive;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.btnPositive);
            if (materialButton2 != null) {
                i = R.id.tvDialogContent;
                MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.tvDialogContent);
                if (materialTextView != null) {
                    i = R.id.tvDialogTitle;
                    MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view, R.id.tvDialogTitle);
                    if (materialTextView2 != null) {
                        return new ag1((ConstraintLayout) view, materialButton, materialButton2, materialTextView, materialTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo28966b() {
        return this.f20939a;
    }
}
