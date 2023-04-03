package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: ke7 */
/* compiled from: ViewTokenDetailsBinding */
public final class ke7 {

    /* renamed from: a */
    public final MaterialCardView f30854a;

    /* renamed from: b */
    public final AppCompatTextView f30855b;

    /* renamed from: c */
    public final MaterialTextView f30856c;

    /* renamed from: d */
    public final AppCompatTextView f30857d;

    /* renamed from: e */
    public final AppCompatTextView f30858e;

    /* renamed from: f */
    public final AppCompatTextView f30859f;

    public ke7(MaterialCardView materialCardView, AppCompatTextView appCompatTextView, MaterialTextView materialTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.f30854a = materialCardView;
        this.f30855b = appCompatTextView;
        this.f30856c = materialTextView;
        this.f30857d = appCompatTextView2;
        this.f30858e = appCompatTextView3;
        this.f30859f = appCompatTextView4;
    }

    /* renamed from: a */
    public static ke7 m47045a(View view) {
        int i = R.id.txtCirculatingSupply;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.txtCirculatingSupply);
        if (appCompatTextView != null) {
            i = R.id.txtContractAddress;
            MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.txtContractAddress);
            if (materialTextView != null) {
                i = R.id.txtMarketCap;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ca7.m11819a(view, R.id.txtMarketCap);
                if (appCompatTextView2 != null) {
                    i = R.id.txtTotalSupply;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ca7.m11819a(view, R.id.txtTotalSupply);
                    if (appCompatTextView3 != null) {
                        i = R.id.txtVolume24h;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ca7.m11819a(view, R.id.txtVolume24h);
                        if (appCompatTextView4 != null) {
                            return new ke7((MaterialCardView) view, appCompatTextView, materialTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
