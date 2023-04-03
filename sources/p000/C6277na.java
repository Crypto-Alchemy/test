package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import net.safemoon.androidwallet.R;

/* renamed from: na */
/* compiled from: ActivityNftDetailBinding */
public final class C6277na {

    /* renamed from: a */
    public final LinearLayout f32020a;

    /* renamed from: b */
    public final AppCompatImageView f32021b;

    /* renamed from: c */
    public final AppCompatImageView f32022c;

    /* renamed from: d */
    public final AppCompatImageView f32023d;

    /* renamed from: e */
    public final AppCompatTextView f32024e;

    /* renamed from: f */
    public final ac7 f32025f;

    public C6277na(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView, ac7 ac7) {
        this.f32020a = linearLayout;
        this.f32021b = appCompatImageView;
        this.f32022c = appCompatImageView2;
        this.f32023d = appCompatImageView3;
        this.f32024e = appCompatTextView;
        this.f32025f = ac7;
    }

    /* renamed from: a */
    public static C6277na m48711a(View view) {
        int i = R.id.btnBack;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.btnBack);
        if (appCompatImageView != null) {
            i = R.id.btnOpen;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view, R.id.btnOpen);
            if (appCompatImageView2 != null) {
                i = R.id.btnShare;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ca7.m11819a(view, R.id.btnShare);
                if (appCompatImageView3 != null) {
                    i = R.id.title;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.title);
                    if (appCompatTextView != null) {
                        i = R.id.viewDetailNFC;
                        View a = ca7.m11819a(view, R.id.viewDetailNFC);
                        if (a != null) {
                            return new C6277na((LinearLayout) view, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatTextView, ac7.m31775a(a));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C6277na m48712c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_nft_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48711a(inflate);
    }

    /* renamed from: b */
    public LinearLayout mo46047b() {
        return this.f32020a;
    }
}
