package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: n9 */
/* compiled from: ActivityAktConfigurationsBinding */
public final class C6276n9 {

    /* renamed from: a */
    public final ConstraintLayout f32001a;

    /* renamed from: b */
    public final MaterialButton f32002b;

    /* renamed from: c */
    public final AppCompatImageView f32003c;

    /* renamed from: d */
    public final AppCompatImageView f32004d;

    /* renamed from: e */
    public final LinearLayoutCompat f32005e;

    /* renamed from: f */
    public final LinearLayoutCompat f32006f;

    /* renamed from: g */
    public final it2 f32007g;

    /* renamed from: h */
    public final AppCompatTextView f32008h;

    /* renamed from: i */
    public final AppCompatTextView f32009i;

    public C6276n9(ConstraintLayout constraintLayout, MaterialButton materialButton, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, it2 it2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f32001a = constraintLayout;
        this.f32002b = materialButton;
        this.f32003c = appCompatImageView;
        this.f32004d = appCompatImageView2;
        this.f32005e = linearLayoutCompat;
        this.f32006f = linearLayoutCompat2;
        this.f32007g = it2;
        this.f32008h = appCompatTextView;
        this.f32009i = appCompatTextView2;
    }

    /* renamed from: a */
    public static C6276n9 m48697a(View view) {
        int i = R.id.btnContinue;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnContinue);
        if (materialButton != null) {
            i = R.id.imgSelectCurrency;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.imgSelectCurrency);
            if (appCompatImageView != null) {
                i = R.id.imgSelectLanguage;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view, R.id.imgSelectLanguage);
                if (appCompatImageView2 != null) {
                    i = R.id.layoutCurrency;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view, R.id.layoutCurrency);
                    if (linearLayoutCompat != null) {
                        i = R.id.layoutLanguage;
                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ca7.m11819a(view, R.id.layoutLanguage);
                        if (linearLayoutCompat2 != null) {
                            i = R.id.layoutSafeMoonBrand;
                            View a = ca7.m11819a(view, R.id.layoutSafeMoonBrand);
                            if (a != null) {
                                it2 a2 = it2.m45959a(a);
                                i = R.id.tvSelectCurrency;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.tvSelectCurrency);
                                if (appCompatTextView != null) {
                                    i = R.id.tvSelectLanguage;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ca7.m11819a(view, R.id.tvSelectLanguage);
                                    if (appCompatTextView2 != null) {
                                        return new C6276n9((ConstraintLayout) view, materialButton, appCompatImageView, appCompatImageView2, linearLayoutCompat, linearLayoutCompat2, a2, appCompatTextView, appCompatTextView2);
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
    public static C6276n9 m48698c(LayoutInflater layoutInflater) {
        return m48699d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C6276n9 m48699d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_akt_configurations, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48697a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo46043b() {
        return this.f32001a;
    }
}
