package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.card.MaterialCardView;
import net.safemoon.androidwallet.R;

/* renamed from: ea7 */
/* compiled from: ViewChooseStatsBinding */
public final class ea7 {

    /* renamed from: a */
    public final MaterialCardView f28517a;

    /* renamed from: b */
    public final AppCompatTextView f28518b;

    /* renamed from: c */
    public final AppCompatTextView f28519c;

    public ea7(MaterialCardView materialCardView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f28517a = materialCardView;
        this.f28518b = appCompatTextView;
        this.f28519c = appCompatTextView2;
    }

    /* renamed from: a */
    public static ea7 m43872a(View view) {
        int i = R.id.txtCmcStats;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.txtCmcStats);
        if (appCompatTextView != null) {
            i = R.id.txtSwapStats;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ca7.m11819a(view, R.id.txtSwapStats);
            if (appCompatTextView2 != null) {
                return new ea7((MaterialCardView) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
