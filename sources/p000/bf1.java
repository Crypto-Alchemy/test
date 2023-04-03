package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: bf1 */
/* compiled from: DialogAnchorSwitchWalletBinding */
public final class bf1 {

    /* renamed from: a */
    public final ConstraintLayout f21273a;

    /* renamed from: b */
    public final LinearLayoutCompat f21274b;

    /* renamed from: c */
    public final AppCompatTextView f21275c;

    public bf1(ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView) {
        this.f21273a = constraintLayout;
        this.f21274b = linearLayoutCompat;
        this.f21275c = appCompatTextView;
    }

    /* renamed from: a */
    public static bf1 m32509a(View view) {
        int i = R.id.buttonWrapper;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view, R.id.buttonWrapper);
        if (linearLayoutCompat != null) {
            i = R.id.txtTitle;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.txtTitle);
            if (appCompatTextView != null) {
                return new bf1((ConstraintLayout) view, linearLayoutCompat, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
