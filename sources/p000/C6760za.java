package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: za */
/* compiled from: ActivitySplashBinding */
public final class C6760za {

    /* renamed from: a */
    public final ConstraintLayout f36071a;

    /* renamed from: b */
    public final AppCompatImageView f36072b;

    /* renamed from: c */
    public final AppCompatImageView f36073c;

    /* renamed from: d */
    public final AppCompatTextView f36074d;

    /* renamed from: e */
    public final AppCompatTextView f36075e;

    /* renamed from: f */
    public final AppCompatTextView f36076f;

    /* renamed from: g */
    public final AppCompatTextView f36077g;

    public C6760za(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.f36071a = constraintLayout;
        this.f36072b = appCompatImageView;
        this.f36073c = appCompatImageView2;
        this.f36074d = appCompatTextView;
        this.f36075e = appCompatTextView2;
        this.f36076f = appCompatTextView3;
        this.f36077g = appCompatTextView4;
    }

    /* renamed from: a */
    public static C6760za m55034a(View view) {
        int i = R.id.img_logo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.img_logo);
        if (appCompatImageView != null) {
            i = R.id.img_shield_logo;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view, R.id.img_shield_logo);
            if (appCompatImageView2 != null) {
                i = R.id.tv_protect_content;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.tv_protect_content);
                if (appCompatTextView != null) {
                    i = R.id.tv_shied_content;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ca7.m11819a(view, R.id.tv_shied_content);
                    if (appCompatTextView2 != null) {
                        i = R.id.tv_shied_tm_content;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ca7.m11819a(view, R.id.tv_shied_tm_content);
                        if (appCompatTextView3 != null) {
                            i = R.id.tv_version;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ca7.m11819a(view, R.id.tv_version);
                            if (appCompatTextView4 != null) {
                                return new C6760za((ConstraintLayout) view, appCompatImageView, appCompatImageView2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C6760za m55035c(LayoutInflater layoutInflater) {
        return m55036d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C6760za m55036d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_splash, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m55034a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo49812b() {
        return this.f36071a;
    }
}
