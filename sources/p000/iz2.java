package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import net.safemoon.androidwallet.R;

/* renamed from: iz2 */
/* compiled from: ItemSelectSecurityQuestionBinding */
public final class iz2 {

    /* renamed from: a */
    public final LinearLayoutCompat f30169a;

    /* renamed from: b */
    public final LinearLayoutCompat f30170b;

    /* renamed from: c */
    public final TextView f30171c;

    public iz2(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, TextView textView) {
        this.f30169a = linearLayoutCompat;
        this.f30170b = linearLayoutCompat2;
        this.f30171c = textView;
    }

    /* renamed from: a */
    public static iz2 m46061a(View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        TextView textView = (TextView) ca7.m11819a(view, R.id.tvQuestion);
        if (textView != null) {
            return new iz2(linearLayoutCompat, linearLayoutCompat, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvQuestion)));
    }

    /* renamed from: c */
    public static iz2 m46062c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_select_security_question, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m46061a(inflate);
    }

    /* renamed from: b */
    public LinearLayoutCompat mo43983b() {
        return this.f30169a;
    }
}
