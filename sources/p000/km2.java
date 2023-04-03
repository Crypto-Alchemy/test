package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: km2 */
/* compiled from: HolderChainNetworkBinding */
public final class km2 {

    /* renamed from: a */
    public final ConstraintLayout f30926a;

    /* renamed from: b */
    public final ConstraintLayout f30927b;

    /* renamed from: c */
    public final AppCompatImageView f30928c;

    /* renamed from: d */
    public final ImageView f30929d;

    /* renamed from: e */
    public final TextView f30930e;

    public km2(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, ImageView imageView, TextView textView) {
        this.f30926a = constraintLayout;
        this.f30927b = constraintLayout2;
        this.f30928c = appCompatImageView;
        this.f30929d = imageView;
        this.f30930e = textView;
    }

    /* renamed from: a */
    public static km2 m47174a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.imgIndicator;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.imgIndicator);
        if (appCompatImageView != null) {
            i = R.id.ivChainIcon;
            ImageView imageView = (ImageView) ca7.m11819a(view, R.id.ivChainIcon);
            if (imageView != null) {
                i = R.id.tvChainName;
                TextView textView = (TextView) ca7.m11819a(view, R.id.tvChainName);
                if (textView != null) {
                    return new km2(constraintLayout, constraintLayout, appCompatImageView, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo44842b() {
        return this.f30926a;
    }
}
