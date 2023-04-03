package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: af1 */
/* compiled from: DialogAnchorSelectWalletsAddressBinding */
public final class af1 {

    /* renamed from: a */
    public final ConstraintLayout f20935a;

    /* renamed from: b */
    public final LinearLayoutCompat f20936b;

    /* renamed from: c */
    public final AppCompatTextView f20937c;

    public af1(ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView) {
        this.f20935a = constraintLayout;
        this.f20936b = linearLayoutCompat;
        this.f20937c = appCompatTextView;
    }

    /* renamed from: a */
    public static af1 m31824a(View view) {
        int i = R.id.buttonWrapper;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view, R.id.buttonWrapper);
        if (linearLayoutCompat != null) {
            i = R.id.txtTitle;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.txtTitle);
            if (appCompatTextView != null) {
                return new af1((ConstraintLayout) view, linearLayoutCompat, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
