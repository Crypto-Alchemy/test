package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: hz2 */
/* compiled from: ItemMyTokensScreenBinding */
public final class hz2 {

    /* renamed from: a */
    public final ConstraintLayout f29766a;

    /* renamed from: b */
    public final ImageView f29767b;

    /* renamed from: c */
    public final ImageView f29768c;

    /* renamed from: d */
    public final ConstraintLayout f29769d;

    /* renamed from: e */
    public final TextView f29770e;

    /* renamed from: f */
    public final TextView f29771f;

    /* renamed from: g */
    public final TextView f29772g;

    /* renamed from: h */
    public final TextView f29773h;

    /* renamed from: i */
    public final TextView f29774i;

    /* renamed from: j */
    public final View f29775j;

    /* renamed from: k */
    public final LinearLayout f29776k;

    public hz2(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view, LinearLayout linearLayout) {
        this.f29766a = constraintLayout;
        this.f29767b = imageView;
        this.f29768c = imageView2;
        this.f29769d = constraintLayout2;
        this.f29770e = textView;
        this.f29771f = textView2;
        this.f29772g = textView3;
        this.f29773h = textView4;
        this.f29774i = textView5;
        this.f29775j = view;
        this.f29776k = linearLayout;
    }

    /* renamed from: a */
    public static hz2 m45422a(View view) {
        int i = R.id.ivPercentageDirection;
        ImageView imageView = (ImageView) ca7.m11819a(view, R.id.ivPercentageDirection);
        if (imageView != null) {
            i = R.id.ivTokenIcon;
            ImageView imageView2 = (ImageView) ca7.m11819a(view, R.id.ivTokenIcon);
            if (imageView2 != null) {
                i = R.id.rowFG;
                ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view, R.id.rowFG);
                if (constraintLayout != null) {
                    i = R.id.tvTokenBalance;
                    TextView textView = (TextView) ca7.m11819a(view, R.id.tvTokenBalance);
                    if (textView != null) {
                        i = R.id.tvTokenName;
                        TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvTokenName);
                        if (textView2 != null) {
                            i = R.id.tvTokenNativeBalance;
                            TextView textView3 = (TextView) ca7.m11819a(view, R.id.tvTokenNativeBalance);
                            if (textView3 != null) {
                                i = R.id.tvTokenPercent;
                                TextView textView4 = (TextView) ca7.m11819a(view, R.id.tvTokenPercent);
                                if (textView4 != null) {
                                    i = R.id.tvTokenSymbol;
                                    TextView textView5 = (TextView) ca7.m11819a(view, R.id.tvTokenSymbol);
                                    if (textView5 != null) {
                                        i = R.id.vDivider;
                                        View a = ca7.m11819a(view, R.id.vDivider);
                                        if (a != null) {
                                            i = R.id.vTokenNameContainer;
                                            LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view, R.id.vTokenNameContainer);
                                            if (linearLayout != null) {
                                                return new hz2((ConstraintLayout) view, imageView, imageView2, constraintLayout, textView, textView2, textView3, textView4, textView5, a, linearLayout);
                                            }
                                        }
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
    public ConstraintLayout mo43432b() {
        return this.f29766a;
    }
}
