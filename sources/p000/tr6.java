package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import net.safemoon.androidwallet.R;

/* renamed from: tr6 */
/* compiled from: ToolbarWithTitleAndActionBinding */
public final class tr6 {

    /* renamed from: a */
    public final Toolbar f34315a;

    /* renamed from: b */
    public final AppCompatImageView f34316b;

    /* renamed from: c */
    public final AppCompatImageView f34317c;

    /* renamed from: d */
    public final ImageView f34318d;

    /* renamed from: e */
    public final AppCompatImageView f34319e;

    /* renamed from: f */
    public final TextView f34320f;

    public tr6(Toolbar toolbar, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ImageView imageView, AppCompatImageView appCompatImageView3, TextView textView) {
        this.f34315a = toolbar;
        this.f34316b = appCompatImageView;
        this.f34317c = appCompatImageView2;
        this.f34318d = imageView;
        this.f34319e = appCompatImageView3;
        this.f34320f = textView;
    }

    /* renamed from: a */
    public static tr6 m52423a(View view) {
        int i = R.id.imgInfo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.imgInfo);
        if (appCompatImageView != null) {
            i = R.id.ivToolbarAction;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view, R.id.ivToolbarAction);
            if (appCompatImageView2 != null) {
                i = R.id.ivToolbarBack;
                ImageView imageView = (ImageView) ca7.m11819a(view, R.id.ivToolbarBack);
                if (imageView != null) {
                    i = R.id.ivToolbarRefresh;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ca7.m11819a(view, R.id.ivToolbarRefresh);
                    if (appCompatImageView3 != null) {
                        i = R.id.tvToolbarTitle;
                        TextView textView = (TextView) ca7.m11819a(view, R.id.tvToolbarTitle);
                        if (textView != null) {
                            return new tr6((Toolbar) view, appCompatImageView, appCompatImageView2, imageView, appCompatImageView3, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
