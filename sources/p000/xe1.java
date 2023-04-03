package p000;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import net.safemoon.androidwallet.R;

/* renamed from: xe1 */
/* compiled from: DialogAnchorPopUpBagBinding */
public final class xe1 {

    /* renamed from: a */
    public final ConstraintLayout f35610a;

    /* renamed from: b */
    public final CardView f35611b;

    /* renamed from: c */
    public final CardView f35612c;

    /* renamed from: d */
    public final ht2 f35613d;

    /* renamed from: e */
    public final gt2 f35614e;

    public xe1(ConstraintLayout constraintLayout, CardView cardView, CardView cardView2, ht2 ht2, gt2 gt2) {
        this.f35610a = constraintLayout;
        this.f35611b = cardView;
        this.f35612c = cardView2;
        this.f35613d = ht2;
        this.f35614e = gt2;
    }

    /* renamed from: a */
    public static xe1 m54382a(View view) {
        int i = R.id.ccManageBagItemWrapper;
        CardView cardView = (CardView) ca7.m11819a(view, R.id.ccManageBagItemWrapper);
        if (cardView != null) {
            i = R.id.ccToggleItemWrapper;
            CardView cardView2 = (CardView) ca7.m11819a(view, R.id.ccToggleItemWrapper);
            if (cardView2 != null) {
                i = R.id.includeBagPercentage;
                View a = ca7.m11819a(view, R.id.includeBagPercentage);
                if (a != null) {
                    ht2 a2 = ht2.m45377a(a);
                    i = R.id.includeMenuItem;
                    View a3 = ca7.m11819a(view, R.id.includeMenuItem);
                    if (a3 != null) {
                        return new xe1((ConstraintLayout) view, cardView, cardView2, a2, gt2.m44898a(a3));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
