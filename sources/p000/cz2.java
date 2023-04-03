package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: cz2 */
/* compiled from: ItemFiatListHeaderBinding */
public final class cz2 {

    /* renamed from: a */
    public final ConstraintLayout f28001a;

    /* renamed from: b */
    public final TextView f28002b;

    public cz2(ConstraintLayout constraintLayout, TextView textView) {
        this.f28001a = constraintLayout;
        this.f28002b = textView;
    }

    /* renamed from: a */
    public static cz2 m43310a(View view) {
        TextView textView = (TextView) ca7.m11819a(view, R.id.tvText);
        if (textView != null) {
            return new cz2((ConstraintLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvText)));
    }

    /* renamed from: c */
    public static cz2 m43311c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_fiat_list_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m43310a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo41790b() {
        return this.f28001a;
    }
}
