package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: fz2 */
/* compiled from: ItemManageContactBinding */
public final class fz2 {

    /* renamed from: a */
    public final ConstraintLayout f29034a;

    /* renamed from: b */
    public final ConstraintLayout f29035b;

    /* renamed from: c */
    public final ImageView f29036c;

    /* renamed from: d */
    public final ImageView f29037d;

    /* renamed from: e */
    public final TextView f29038e;

    /* renamed from: f */
    public final TextView f29039f;

    public fz2(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.f29034a = constraintLayout;
        this.f29035b = constraintLayout2;
        this.f29036c = imageView;
        this.f29037d = imageView2;
        this.f29038e = textView;
        this.f29039f = textView2;
    }

    /* renamed from: a */
    public static fz2 m44459a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.imgIndicator;
        ImageView imageView = (ImageView) ca7.m11819a(view, R.id.imgIndicator);
        if (imageView != null) {
            i = R.id.ivContactIcon;
            ImageView imageView2 = (ImageView) ca7.m11819a(view, R.id.ivContactIcon);
            if (imageView2 != null) {
                i = R.id.tvContactAddress;
                TextView textView = (TextView) ca7.m11819a(view, R.id.tvContactAddress);
                if (textView != null) {
                    i = R.id.tvContactName;
                    TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvContactName);
                    if (textView2 != null) {
                        return new fz2(constraintLayout, constraintLayout, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo42700b() {
        return this.f29034a;
    }
}
