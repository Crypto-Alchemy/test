package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import net.safemoon.androidwallet.R;

/* renamed from: az2 */
/* compiled from: ItemDropDownContactAddressBinding */
public final class az2 {

    /* renamed from: a */
    public final LinearLayout f21094a;

    /* renamed from: b */
    public final LinearLayout f21095b;

    /* renamed from: c */
    public final CardView f21096c;

    /* renamed from: d */
    public final ImageView f21097d;

    /* renamed from: e */
    public final TextView f21098e;

    /* renamed from: f */
    public final TextView f21099f;

    /* renamed from: g */
    public final View f21100g;

    public az2(LinearLayout linearLayout, LinearLayout linearLayout2, CardView cardView, ImageView imageView, TextView textView, TextView textView2, View view) {
        this.f21094a = linearLayout;
        this.f21095b = linearLayout2;
        this.f21096c = cardView;
        this.f21097d = imageView;
        this.f21098e = textView;
        this.f21099f = textView2;
        this.f21100g = view;
    }

    /* renamed from: a */
    public static az2 m32312a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.cvContactIconContainer;
        CardView cardView = (CardView) ca7.m11819a(view, R.id.cvContactIconContainer);
        if (cardView != null) {
            i = R.id.ivContactIcon;
            ImageView imageView = (ImageView) ca7.m11819a(view, R.id.ivContactIcon);
            if (imageView != null) {
                i = R.id.tvContactAddress;
                TextView textView = (TextView) ca7.m11819a(view, R.id.tvContactAddress);
                if (textView != null) {
                    i = R.id.tvContactName;
                    TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvContactName);
                    if (textView2 != null) {
                        i = R.id.vDivider;
                        View a = ca7.m11819a(view, R.id.vDivider);
                        if (a != null) {
                            return new az2(linearLayout, linearLayout, cardView, imageView, textView, textView2, a);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public LinearLayout mo29402b() {
        return this.f21094a;
    }
}
