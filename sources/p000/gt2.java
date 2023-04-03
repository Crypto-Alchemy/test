package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: gt2 */
/* compiled from: IncludeMoneyBagMenuItemBinding */
public final class gt2 {

    /* renamed from: a */
    public final LinearLayoutCompat f29347a;

    /* renamed from: b */
    public final MaterialButton f29348b;

    /* renamed from: c */
    public final MaterialButton f29349c;

    /* renamed from: d */
    public final MaterialButton f29350d;

    /* renamed from: e */
    public final AppCompatTextView f29351e;

    public gt2(LinearLayoutCompat linearLayoutCompat, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, AppCompatTextView appCompatTextView) {
        this.f29347a = linearLayoutCompat;
        this.f29348b = materialButton;
        this.f29349c = materialButton2;
        this.f29350d = materialButton3;
        this.f29351e = appCompatTextView;
    }

    /* renamed from: a */
    public static gt2 m44898a(View view) {
        int i = R.id.btnBag;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnBag);
        if (materialButton != null) {
            i = R.id.btnPercentageOfBalance;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.btnPercentageOfBalance);
            if (materialButton2 != null) {
                i = R.id.btnPercentageOfTraditional;
                MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view, R.id.btnPercentageOfTraditional);
                if (materialButton3 != null) {
                    i = R.id.txtTitle;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.txtTitle);
                    if (appCompatTextView != null) {
                        return new gt2((LinearLayoutCompat) view, materialButton, materialButton2, materialButton3, appCompatTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
