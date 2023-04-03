package p000;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: ef1 */
/* compiled from: DialogConfirmationBinding */
public final class ef1 {

    /* renamed from: a */
    public final ConstraintLayout f28614a;

    /* renamed from: b */
    public final MaterialButton f28615b;

    /* renamed from: c */
    public final MaterialButton f28616c;

    /* renamed from: d */
    public final MaterialButton f28617d;

    /* renamed from: e */
    public final MaterialTextView f28618e;

    /* renamed from: f */
    public final MaterialTextView f28619f;

    public ef1(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f28614a = constraintLayout;
        this.f28615b = materialButton;
        this.f28616c = materialButton2;
        this.f28617d = materialButton3;
        this.f28618e = materialTextView;
        this.f28619f = materialTextView2;
    }

    /* renamed from: a */
    public static ef1 m43962a(View view) {
        int i = R.id.btnNegative;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnNegative);
        if (materialButton != null) {
            i = R.id.btnPositive;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.btnPositive);
            if (materialButton2 != null) {
                i = R.id.dialog_cross;
                MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view, R.id.dialog_cross);
                if (materialButton3 != null) {
                    i = R.id.tvDialogContent;
                    MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.tvDialogContent);
                    if (materialTextView != null) {
                        i = R.id.tvDialogTitle;
                        MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view, R.id.tvDialogTitle);
                        if (materialTextView2 != null) {
                            return new ef1((ConstraintLayout) view, materialButton, materialButton2, materialButton3, materialTextView, materialTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo42311b() {
        return this.f28614a;
    }
}
