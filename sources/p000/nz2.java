package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import net.safemoon.androidwallet.R;

/* renamed from: nz2 */
/* compiled from: ItemWalletTokenCardBinding */
public final class nz2 {

    /* renamed from: a */
    public final CardView f32229a;

    /* renamed from: b */
    public final ImageView f32230b;

    /* renamed from: c */
    public final ImageView f32231c;

    /* renamed from: d */
    public final TextView f32232d;

    /* renamed from: e */
    public final TextView f32233e;

    /* renamed from: f */
    public final TextView f32234f;

    /* renamed from: g */
    public final TextView f32235g;

    /* renamed from: h */
    public final TextView f32236h;

    /* renamed from: i */
    public final LinearLayout f32237i;

    public nz2(CardView cardView, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout) {
        this.f32229a = cardView;
        this.f32230b = imageView;
        this.f32231c = imageView2;
        this.f32232d = textView;
        this.f32233e = textView2;
        this.f32234f = textView3;
        this.f32235g = textView4;
        this.f32236h = textView5;
        this.f32237i = linearLayout;
    }

    /* renamed from: a */
    public static nz2 m49107a(View view) {
        int i = R.id.ivPercentageDirection;
        ImageView imageView = (ImageView) ca7.m11819a(view, R.id.ivPercentageDirection);
        if (imageView != null) {
            i = R.id.ivTokenIcon;
            ImageView imageView2 = (ImageView) ca7.m11819a(view, R.id.ivTokenIcon);
            if (imageView2 != null) {
                i = R.id.tvPercentage;
                TextView textView = (TextView) ca7.m11819a(view, R.id.tvPercentage);
                if (textView != null) {
                    i = R.id.tvTokenBalance;
                    TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvTokenBalance);
                    if (textView2 != null) {
                        i = R.id.tvTokenName;
                        TextView textView3 = (TextView) ca7.m11819a(view, R.id.tvTokenName);
                        if (textView3 != null) {
                            i = R.id.tvTokenNativeBalance;
                            TextView textView4 = (TextView) ca7.m11819a(view, R.id.tvTokenNativeBalance);
                            if (textView4 != null) {
                                i = R.id.tvTokenPrice;
                                TextView textView5 = (TextView) ca7.m11819a(view, R.id.tvTokenPrice);
                                if (textView5 != null) {
                                    i = R.id.vPercentageContainer;
                                    LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view, R.id.vPercentageContainer);
                                    if (linearLayout != null) {
                                        return new nz2((CardView) view, imageView, imageView2, textView, textView2, textView3, textView4, textView5, linearLayout);
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

    /* renamed from: b */
    public CardView mo46268b() {
        return this.f32229a;
    }
}
