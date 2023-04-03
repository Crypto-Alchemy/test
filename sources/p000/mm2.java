package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import net.safemoon.androidwallet.R;

/* renamed from: mm2 */
/* compiled from: HolderDappBinding */
public final class mm2 {

    /* renamed from: a */
    public final ConstraintLayout f31725a;

    /* renamed from: b */
    public final MaterialButton f31726b;

    /* renamed from: c */
    public final AppCompatImageView f31727c;

    /* renamed from: d */
    public final AppCompatImageView f31728d;

    /* renamed from: e */
    public final AppCompatImageView f31729e;

    /* renamed from: f */
    public final MaterialCardView f31730f;

    /* renamed from: g */
    public final MaterialCardView f31731g;

    /* renamed from: h */
    public final AppCompatTextView f31732h;

    /* renamed from: i */
    public final AppCompatTextView f31733i;

    public mm2(ConstraintLayout constraintLayout, MaterialButton materialButton, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, MaterialCardView materialCardView, MaterialCardView materialCardView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f31725a = constraintLayout;
        this.f31726b = materialButton;
        this.f31727c = appCompatImageView;
        this.f31728d = appCompatImageView2;
        this.f31729e = appCompatImageView3;
        this.f31730f = materialCardView;
        this.f31731g = materialCardView2;
        this.f31732h = appCompatTextView;
        this.f31733i = appCompatTextView2;
    }

    /* renamed from: a */
    public static mm2 m48368a(View view) {
        int i = R.id.btnDelete;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnDelete);
        if (materialButton != null) {
            i = R.id.imgDesktop;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.imgDesktop);
            if (appCompatImageView != null) {
                i = R.id.imgRightIndicator;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view, R.id.imgRightIndicator);
                if (appCompatImageView2 != null) {
                    i = R.id.imgThumbDapp;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ca7.m11819a(view, R.id.imgThumbDapp);
                    if (appCompatImageView3 != null) {
                        i = R.id.rowBG;
                        MaterialCardView materialCardView = (MaterialCardView) ca7.m11819a(view, R.id.rowBG);
                        if (materialCardView != null) {
                            i = R.id.rowFG;
                            MaterialCardView materialCardView2 = (MaterialCardView) ca7.m11819a(view, R.id.rowFG);
                            if (materialCardView2 != null) {
                                i = R.id.txtDAppLink;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.txtDAppLink);
                                if (appCompatTextView != null) {
                                    i = R.id.txtDAppName;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ca7.m11819a(view, R.id.txtDAppName);
                                    if (appCompatTextView2 != null) {
                                        return new mm2((ConstraintLayout) view, materialButton, appCompatImageView, appCompatImageView2, appCompatImageView3, materialCardView, materialCardView2, appCompatTextView, appCompatTextView2);
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
    public static mm2 m48369c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_dapp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48368a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo45818b() {
        return this.f31725a;
    }
}
