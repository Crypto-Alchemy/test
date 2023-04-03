package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import net.safemoon.androidwallet.R;

/* renamed from: kt2 */
/* compiled from: IncludeWordBinding */
public final class kt2 {

    /* renamed from: a */
    public final LinearLayout f31055a;

    /* renamed from: b */
    public final TextView f31056b;

    /* renamed from: c */
    public final LinearLayout f31057c;

    public kt2(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2) {
        this.f31055a = linearLayout;
        this.f31056b = textView;
        this.f31057c = linearLayout2;
    }

    /* renamed from: a */
    public static kt2 m47519a(View view) {
        int i = R.id.index;
        TextView textView = (TextView) ca7.m11819a(view, R.id.index);
        if (textView != null) {
            i = R.id.itemParent;
            LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view, R.id.itemParent);
            if (linearLayout != null) {
                return new kt2((LinearLayout) view, textView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
