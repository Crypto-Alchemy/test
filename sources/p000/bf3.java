package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: bf3 */
/* compiled from: LayoutPasswordRequirementsBinding */
public final class bf3 {

    /* renamed from: a */
    public final ConstraintLayout f21276a;

    /* renamed from: b */
    public final ImageView f21277b;

    /* renamed from: c */
    public final ImageView f21278c;

    /* renamed from: d */
    public final ImageView f21279d;

    /* renamed from: e */
    public final TextView f21280e;

    /* renamed from: f */
    public final TextView f21281f;

    /* renamed from: g */
    public final TextView f21282g;

    /* renamed from: h */
    public final TextView f21283h;

    /* renamed from: i */
    public final TextView f21284i;

    public bf3(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f21276a = constraintLayout;
        this.f21277b = imageView;
        this.f21278c = imageView2;
        this.f21279d = imageView3;
        this.f21280e = textView;
        this.f21281f = textView2;
        this.f21282g = textView3;
        this.f21283h = textView4;
        this.f21284i = textView5;
    }

    /* renamed from: a */
    public static bf3 m32510a(View view) {
        int i = R.id.iv_1;
        ImageView imageView = (ImageView) ca7.m11819a(view, R.id.iv_1);
        if (imageView != null) {
            i = R.id.iv_2;
            ImageView imageView2 = (ImageView) ca7.m11819a(view, R.id.iv_2);
            if (imageView2 != null) {
                i = R.id.iv_4;
                ImageView imageView3 = (ImageView) ca7.m11819a(view, R.id.iv_4);
                if (imageView3 != null) {
                    i = R.id.min_char;
                    TextView textView = (TextView) ca7.m11819a(view, R.id.min_char);
                    if (textView != null) {
                        i = R.id.tvMinPassReq;
                        TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvMinPassReq);
                        if (textView2 != null) {
                            i = R.id.tv_number;
                            TextView textView3 = (TextView) ca7.m11819a(view, R.id.tv_number);
                            if (textView3 != null) {
                                i = R.id.tvPassNotMatch;
                                TextView textView4 = (TextView) ca7.m11819a(view, R.id.tvPassNotMatch);
                                if (textView4 != null) {
                                    i = R.id.tv_special;
                                    TextView textView5 = (TextView) ca7.m11819a(view, R.id.tv_special);
                                    if (textView5 != null) {
                                        return new bf3((ConstraintLayout) view, imageView, imageView2, imageView3, textView, textView2, textView3, textView4, textView5);
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
}
