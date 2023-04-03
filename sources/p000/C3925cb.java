package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import net.safemoon.androidwallet.R;

/* renamed from: cb */
/* compiled from: ActivityVerifyEmailBinding */
public final class C3925cb {

    /* renamed from: a */
    public final ConstraintLayout f21642a;

    /* renamed from: b */
    public final MaterialButton f21643b;

    /* renamed from: c */
    public final ConstraintLayout f21644c;

    /* renamed from: d */
    public final AppCompatImageView f21645d;

    /* renamed from: e */
    public final TextView f21646e;

    /* renamed from: f */
    public final TextInputLayout f21647f;

    /* renamed from: g */
    public final c36 f21648g;

    /* renamed from: h */
    public final View f21649h;

    public C3925cb(ConstraintLayout constraintLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, TextView textView, TextInputLayout textInputLayout, c36 c36, View view) {
        this.f21642a = constraintLayout;
        this.f21643b = materialButton;
        this.f21644c = constraintLayout2;
        this.f21645d = appCompatImageView;
        this.f21646e = textView;
        this.f21647f = textInputLayout;
        this.f21648g = c36;
        this.f21649h = view;
    }

    /* renamed from: a */
    public static C3925cb m32887a(View view) {
        int i = R.id.btnContinue;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnContinue);
        if (materialButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.img_logo;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.img_logo);
            if (appCompatImageView != null) {
                i = R.id.tilResendVerifyCodeTxt;
                TextView textView = (TextView) ca7.m11819a(view, R.id.tilResendVerifyCodeTxt);
                if (textView != null) {
                    i = R.id.tilVerifyCode;
                    TextInputLayout textInputLayout = (TextInputLayout) ca7.m11819a(view, R.id.tilVerifyCode);
                    if (textInputLayout != null) {
                        i = R.id.toolbar;
                        View a = ca7.m11819a(view, R.id.toolbar);
                        if (a != null) {
                            c36 a2 = c36.m32847a(a);
                            i = R.id.verifyCodeDivider;
                            View a3 = ca7.m11819a(view, R.id.verifyCodeDivider);
                            if (a3 != null) {
                                return new C3925cb(constraintLayout, materialButton, constraintLayout, appCompatImageView, textView, textInputLayout, a2, a3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C3925cb m32888c(LayoutInflater layoutInflater) {
        return m32889d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C3925cb m32889d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_verify_email, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m32887a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo29908b() {
        return this.f21642a;
    }
}
