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

/* renamed from: da */
/* compiled from: ActivityGetEmailBinding */
public final class C5728da {

    /* renamed from: a */
    public final ConstraintLayout f28065a;

    /* renamed from: b */
    public final MaterialButton f28066b;

    /* renamed from: c */
    public final ConstraintLayout f28067c;

    /* renamed from: d */
    public final AppCompatImageView f28068d;

    /* renamed from: e */
    public final TextInputLayout f28069e;

    /* renamed from: f */
    public final View f28070f;

    /* renamed from: g */
    public final TextView f28071g;

    /* renamed from: h */
    public final c36 f28072h;

    /* renamed from: i */
    public final TextView f28073i;

    public C5728da(ConstraintLayout constraintLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, TextInputLayout textInputLayout, View view, TextView textView, c36 c36, TextView textView2) {
        this.f28065a = constraintLayout;
        this.f28066b = materialButton;
        this.f28067c = constraintLayout2;
        this.f28068d = appCompatImageView;
        this.f28069e = textInputLayout;
        this.f28070f = view;
        this.f28071g = textView;
        this.f28072h = c36;
        this.f28073i = textView2;
    }

    /* renamed from: a */
    public static C5728da m43415a(View view) {
        int i = R.id.btnEmail;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnEmail);
        if (materialButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.img_logo;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.img_logo);
            if (appCompatImageView != null) {
                i = R.id.tilEmail;
                TextInputLayout textInputLayout = (TextInputLayout) ca7.m11819a(view, R.id.tilEmail);
                if (textInputLayout != null) {
                    i = R.id.tilEmailDivider;
                    View a = ca7.m11819a(view, R.id.tilEmailDivider);
                    if (a != null) {
                        i = R.id.tilEmailTxt;
                        TextView textView = (TextView) ca7.m11819a(view, R.id.tilEmailTxt);
                        if (textView != null) {
                            i = R.id.toolbar;
                            View a2 = ca7.m11819a(view, R.id.toolbar);
                            if (a2 != null) {
                                c36 a3 = c36.m32847a(a2);
                                i = R.id.tvVerifyNotice;
                                TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvVerifyNotice);
                                if (textView2 != null) {
                                    return new C5728da(constraintLayout, materialButton, constraintLayout, appCompatImageView, textInputLayout, a, textView, a3, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C5728da m43416c(LayoutInflater layoutInflater) {
        return m43417d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C5728da m43417d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_get_email, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m43415a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo41868b() {
        return this.f28065a;
    }
}
