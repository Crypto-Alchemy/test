package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: ht2 */
/* compiled from: IncludeMoneyBagPercentageBinding */
public final class ht2 {

    /* renamed from: a */
    public final LinearLayoutCompat f29720a;

    /* renamed from: b */
    public final AppCompatSeekBar f29721b;

    /* renamed from: c */
    public final MaterialButton f29722c;

    /* renamed from: d */
    public final MaterialButton f29723d;

    /* renamed from: e */
    public final AppCompatTextView f29724e;

    public ht2(LinearLayoutCompat linearLayoutCompat, AppCompatSeekBar appCompatSeekBar, MaterialButton materialButton, MaterialButton materialButton2, AppCompatTextView appCompatTextView) {
        this.f29720a = linearLayoutCompat;
        this.f29721b = appCompatSeekBar;
        this.f29722c = materialButton;
        this.f29723d = materialButton2;
        this.f29724e = appCompatTextView;
    }

    /* renamed from: a */
    public static ht2 m45377a(View view) {
        int i = R.id.adjustPercentage;
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) ca7.m11819a(view, R.id.adjustPercentage);
        if (appCompatSeekBar != null) {
            i = R.id.btnConfirm;
            MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnConfirm);
            if (materialButton != null) {
                i = R.id.txtTextPercentage;
                MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.txtTextPercentage);
                if (materialButton2 != null) {
                    i = R.id.txtTitle;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.txtTitle);
                    if (appCompatTextView != null) {
                        return new ht2((LinearLayoutCompat) view, appCompatSeekBar, materialButton, materialButton2, appCompatTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
