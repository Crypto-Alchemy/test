package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import net.safemoon.androidwallet.R;

/* renamed from: c36 */
/* compiled from: SimpleTransparentToolbarWithTitleBinding */
public final class c36 {

    /* renamed from: a */
    public final Toolbar f21593a;

    /* renamed from: b */
    public final ImageView f21594b;

    /* renamed from: c */
    public final TextView f21595c;

    /* renamed from: d */
    public final TextView f21596d;

    /* renamed from: e */
    public final TextView f21597e;

    public c36(Toolbar toolbar, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.f21593a = toolbar;
        this.f21594b = imageView;
        this.f21595c = textView;
        this.f21596d = textView2;
        this.f21597e = textView3;
    }

    /* renamed from: a */
    public static c36 m32847a(View view) {
        int i = R.id.ivToolbarBack;
        ImageView imageView = (ImageView) ca7.m11819a(view, R.id.ivToolbarBack);
        if (imageView != null) {
            i = R.id.leftMenu;
            TextView textView = (TextView) ca7.m11819a(view, R.id.leftMenu);
            if (textView != null) {
                i = R.id.rightMenu;
                TextView textView2 = (TextView) ca7.m11819a(view, R.id.rightMenu);
                if (textView2 != null) {
                    i = R.id.tvToolbarTitle;
                    TextView textView3 = (TextView) ca7.m11819a(view, R.id.tvToolbarTitle);
                    if (textView3 != null) {
                        return new c36((Toolbar) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public Toolbar mo29867b() {
        return this.f21593a;
    }
}
