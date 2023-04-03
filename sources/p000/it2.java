package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: it2 */
/* compiled from: IncludeSafemoonBrandBinding */
public final class it2 {

    /* renamed from: a */
    public final ConstraintLayout f30120a;

    /* renamed from: b */
    public final AppCompatImageView f30121b;

    /* renamed from: c */
    public final AppCompatImageView f30122c;

    /* renamed from: d */
    public final AppCompatImageView f30123d;

    public it2(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3) {
        this.f30120a = constraintLayout;
        this.f30121b = appCompatImageView;
        this.f30122c = appCompatImageView2;
        this.f30123d = appCompatImageView3;
    }

    /* renamed from: a */
    public static it2 m45959a(View view) {
        int i = R.id.img_logo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.img_logo);
        if (appCompatImageView != null) {
            i = R.id.img_safemoon;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view, R.id.img_safemoon);
            if (appCompatImageView2 != null) {
                i = R.id.img_wallet;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ca7.m11819a(view, R.id.img_wallet);
                if (appCompatImageView3 != null) {
                    return new it2((ConstraintLayout) view, appCompatImageView, appCompatImageView2, appCompatImageView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
