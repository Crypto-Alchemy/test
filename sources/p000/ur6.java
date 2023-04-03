package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import net.safemoon.androidwallet.R;

/* renamed from: ur6 */
/* compiled from: ToolbarWithTitleAndActionOnWalletsBinding */
public final class ur6 {

    /* renamed from: a */
    public final Toolbar f34683a;

    /* renamed from: b */
    public final AppCompatImageView f34684b;

    /* renamed from: c */
    public final AppCompatImageView f34685c;

    /* renamed from: d */
    public final ImageView f34686d;

    /* renamed from: e */
    public final AppCompatImageView f34687e;

    /* renamed from: f */
    public final TextView f34688f;

    public ur6(Toolbar toolbar, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ImageView imageView, AppCompatImageView appCompatImageView3, TextView textView) {
        this.f34683a = toolbar;
        this.f34684b = appCompatImageView;
        this.f34685c = appCompatImageView2;
        this.f34686d = imageView;
        this.f34687e = appCompatImageView3;
        this.f34688f = textView;
    }

    /* renamed from: a */
    public static ur6 m52984a(View view) {
        int i = R.id.imgLinkWalletInfo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.imgLinkWalletInfo);
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
                            return new ur6((Toolbar) view, appCompatImageView, appCompatImageView2, imageView, appCompatImageView3, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
