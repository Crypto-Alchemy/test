package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import net.safemoon.androidwallet.R;

/* renamed from: b36 */
/* compiled from: SimpleToolbarWithTitleBinding */
public final class b36 {

    /* renamed from: a */
    public final Toolbar f21123a;

    /* renamed from: b */
    public final AppCompatImageView f21124b;

    /* renamed from: c */
    public final ImageView f21125c;

    /* renamed from: d */
    public final TextView f21126d;

    /* renamed from: e */
    public final AppCompatTextView f21127e;

    public b36(Toolbar toolbar, AppCompatImageView appCompatImageView, ImageView imageView, TextView textView, AppCompatTextView appCompatTextView) {
        this.f21123a = toolbar;
        this.f21124b = appCompatImageView;
        this.f21125c = imageView;
        this.f21126d = textView;
        this.f21127e = appCompatTextView;
    }

    /* renamed from: a */
    public static b36 m32346a(View view) {
        int i = R.id.imgInfo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.imgInfo);
        if (appCompatImageView != null) {
            i = R.id.ivToolbarBack;
            ImageView imageView = (ImageView) ca7.m11819a(view, R.id.ivToolbarBack);
            if (imageView != null) {
                i = R.id.rightMenu;
                TextView textView = (TextView) ca7.m11819a(view, R.id.rightMenu);
                if (textView != null) {
                    i = R.id.tvToolbarTitle;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.tvToolbarTitle);
                    if (appCompatTextView != null) {
                        return new b36((Toolbar) view, appCompatImageView, imageView, textView, appCompatTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
