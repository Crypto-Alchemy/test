package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputLayout;
import net.safemoon.androidwallet.R;

/* renamed from: ba */
/* compiled from: ActivityEnterPasswordBinding */
public final class C3887ba {

    /* renamed from: a */
    public final ConstraintLayout f21195a;

    /* renamed from: b */
    public final AppCompatImageView f21196b;

    /* renamed from: c */
    public final LinearLayoutCompat f21197c;

    /* renamed from: d */
    public final it2 f21198d;

    /* renamed from: e */
    public final SwitchMaterial f21199e;

    /* renamed from: f */
    public final TextInputLayout f21200f;

    /* renamed from: g */
    public final TextView f21201g;

    /* renamed from: h */
    public final TextView f21202h;

    /* renamed from: i */
    public final TextView f21203i;

    /* renamed from: j */
    public final TextView f21204j;

    /* renamed from: k */
    public final TextView f21205k;

    /* renamed from: l */
    public final View f21206l;

    public C3887ba(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat, it2 it2, SwitchMaterial switchMaterial, TextInputLayout textInputLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view) {
        this.f21195a = constraintLayout;
        this.f21196b = appCompatImageView;
        this.f21197c = linearLayoutCompat;
        this.f21198d = it2;
        this.f21199e = switchMaterial;
        this.f21200f = textInputLayout;
        this.f21201g = textView;
        this.f21202h = textView2;
        this.f21203i = textView3;
        this.f21204j = textView4;
        this.f21205k = textView5;
        this.f21206l = view;
    }

    /* renamed from: a */
    public static C3887ba m32439a(View view) {
        int i = R.id.btnBiometrics;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.btnBiometrics);
        if (appCompatImageView != null) {
            i = R.id.layoutPassword;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view, R.id.layoutPassword);
            if (linearLayoutCompat != null) {
                i = R.id.layoutSafeMoonBrand;
                View a = ca7.m11819a(view, R.id.layoutSafeMoonBrand);
                if (a != null) {
                    it2 a2 = it2.m45959a(a);
                    i = R.id.switchTwoLayerSignInBio;
                    SwitchMaterial switchMaterial = (SwitchMaterial) ca7.m11819a(view, R.id.switchTwoLayerSignInBio);
                    if (switchMaterial != null) {
                        i = R.id.tilPassword;
                        TextInputLayout textInputLayout = (TextInputLayout) ca7.m11819a(view, R.id.tilPassword);
                        if (textInputLayout != null) {
                            i = R.id.tv_not;
                            TextView textView = (TextView) ca7.m11819a(view, R.id.tv_not);
                            if (textView != null) {
                                i = R.id.tvSignInBioText;
                                TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvSignInBioText);
                                if (textView2 != null) {
                                    i = R.id.tv_sign_in_header;
                                    TextView textView3 = (TextView) ca7.m11819a(view, R.id.tv_sign_in_header);
                                    if (textView3 != null) {
                                        i = R.id.tvWipeData;
                                        TextView textView4 = (TextView) ca7.m11819a(view, R.id.tvWipeData);
                                        if (textView4 != null) {
                                            i = R.id.tv_wipe_notice;
                                            TextView textView5 = (TextView) ca7.m11819a(view, R.id.tv_wipe_notice);
                                            if (textView5 != null) {
                                                i = R.id.viewPasswordDivider;
                                                View a3 = ca7.m11819a(view, R.id.viewPasswordDivider);
                                                if (a3 != null) {
                                                    return new C3887ba((ConstraintLayout) view, appCompatImageView, linearLayoutCompat, a2, switchMaterial, textInputLayout, textView, textView2, textView3, textView4, textView5, a3);
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
    public static C3887ba m32440c(LayoutInflater layoutInflater) {
        return m32441d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C3887ba m32441d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_enter_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m32439a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo29509b() {
        return this.f21195a;
    }
}
