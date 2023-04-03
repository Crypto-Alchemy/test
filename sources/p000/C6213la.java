package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputLayout;
import net.safemoon.androidwallet.R;

/* renamed from: la */
/* compiled from: ActivityLoginBinding */
public final class C6213la {

    /* renamed from: a */
    public final ConstraintLayout f31247a;

    /* renamed from: b */
    public final AppCompatImageView f31248b;

    /* renamed from: c */
    public final MaterialButton f31249c;

    /* renamed from: d */
    public final LinearLayout f31250d;

    /* renamed from: e */
    public final it2 f31251e;

    /* renamed from: f */
    public final SwitchMaterial f31252f;

    /* renamed from: g */
    public final TextInputLayout f31253g;

    /* renamed from: h */
    public final TextInputLayout f31254h;

    /* renamed from: i */
    public final c36 f31255i;

    /* renamed from: j */
    public final TextView f31256j;

    /* renamed from: k */
    public final TextView f31257k;

    /* renamed from: l */
    public final TextView f31258l;

    /* renamed from: m */
    public final TextView f31259m;

    public C6213la(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, MaterialButton materialButton, LinearLayout linearLayout, it2 it2, SwitchMaterial switchMaterial, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, c36 c36, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f31247a = constraintLayout;
        this.f31248b = appCompatImageView;
        this.f31249c = materialButton;
        this.f31250d = linearLayout;
        this.f31251e = it2;
        this.f31252f = switchMaterial;
        this.f31253g = textInputLayout;
        this.f31254h = textInputLayout2;
        this.f31255i = c36;
        this.f31256j = textView;
        this.f31257k = textView2;
        this.f31258l = textView3;
        this.f31259m = textView4;
    }

    /* renamed from: a */
    public static C6213la m47745a(View view) {
        View view2 = view;
        int i = R.id.btnBiometrics;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view2, R.id.btnBiometrics);
        if (appCompatImageView != null) {
            i = R.id.btnLogin;
            MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnLogin);
            if (materialButton != null) {
                i = R.id.content_layout;
                LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view2, R.id.content_layout);
                if (linearLayout != null) {
                    i = R.id.layoutSafeMoonBrand;
                    View a = ca7.m11819a(view2, R.id.layoutSafeMoonBrand);
                    if (a != null) {
                        it2 a2 = it2.m45959a(a);
                        i = R.id.switchTwoLayerSignInBio;
                        SwitchMaterial switchMaterial = (SwitchMaterial) ca7.m11819a(view2, R.id.switchTwoLayerSignInBio);
                        if (switchMaterial != null) {
                            i = R.id.tilPassWord;
                            TextInputLayout textInputLayout = (TextInputLayout) ca7.m11819a(view2, R.id.tilPassWord);
                            if (textInputLayout != null) {
                                i = R.id.tilUserName;
                                TextInputLayout textInputLayout2 = (TextInputLayout) ca7.m11819a(view2, R.id.tilUserName);
                                if (textInputLayout2 != null) {
                                    i = R.id.toolbar;
                                    View a3 = ca7.m11819a(view2, R.id.toolbar);
                                    if (a3 != null) {
                                        c36 a4 = c36.m32847a(a3);
                                        i = R.id.tvForgotPassword;
                                        TextView textView = (TextView) ca7.m11819a(view2, R.id.tvForgotPassword);
                                        if (textView != null) {
                                            i = R.id.tvSignInBioText;
                                            TextView textView2 = (TextView) ca7.m11819a(view2, R.id.tvSignInBioText);
                                            if (textView2 != null) {
                                                i = R.id.tvWipeData;
                                                TextView textView3 = (TextView) ca7.m11819a(view2, R.id.tvWipeData);
                                                if (textView3 != null) {
                                                    i = R.id.tv_wipe_notice;
                                                    TextView textView4 = (TextView) ca7.m11819a(view2, R.id.tv_wipe_notice);
                                                    if (textView4 != null) {
                                                        return new C6213la((ConstraintLayout) view2, appCompatImageView, materialButton, linearLayout, a2, switchMaterial, textInputLayout, textInputLayout2, a4, textView, textView2, textView3, textView4);
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static C6213la m47746c(LayoutInflater layoutInflater) {
        return m47747d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C6213la m47747d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_login, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m47745a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo45403b() {
        return this.f31247a;
    }
}
