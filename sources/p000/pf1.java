package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: pf1 */
/* compiled from: DialogResetPasswordConfirmationBinding */
public final class pf1 {

    /* renamed from: a */
    public final ConstraintLayout f32692a;

    /* renamed from: b */
    public final AppCompatTextView f32693b;

    /* renamed from: c */
    public final AppCompatTextView f32694c;

    /* renamed from: d */
    public final MaterialTextView f32695d;

    /* renamed from: e */
    public final MaterialTextView f32696e;

    public pf1(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f32692a = constraintLayout;
        this.f32693b = appCompatTextView;
        this.f32694c = appCompatTextView2;
        this.f32695d = materialTextView;
        this.f32696e = materialTextView2;
    }

    /* renamed from: a */
    public static pf1 m49910a(View view) {
        int i = R.id.btnNegative;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.btnNegative);
        if (appCompatTextView != null) {
            i = R.id.btnPositive;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ca7.m11819a(view, R.id.btnPositive);
            if (appCompatTextView2 != null) {
                i = R.id.tvDialogContent;
                MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.tvDialogContent);
                if (materialTextView != null) {
                    i = R.id.tvDialogTitle;
                    MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view, R.id.tvDialogTitle);
                    if (materialTextView2 != null) {
                        return new pf1((ConstraintLayout) view, appCompatTextView, appCompatTextView2, materialTextView, materialTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo46723b() {
        return this.f32692a;
    }
}
