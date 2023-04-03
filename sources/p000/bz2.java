package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import net.safemoon.androidwallet.R;

/* renamed from: bz2 */
/* compiled from: ItemFiatBinding */
public final class bz2 {

    /* renamed from: a */
    public final ConstraintLayout f21522a;

    /* renamed from: b */
    public final MaterialCheckBox f21523b;

    /* renamed from: c */
    public final TextView f21524c;

    /* renamed from: d */
    public final View f21525d;

    public bz2(ConstraintLayout constraintLayout, MaterialCheckBox materialCheckBox, TextView textView, View view) {
        this.f21522a = constraintLayout;
        this.f21523b = materialCheckBox;
        this.f21524c = textView;
        this.f21525d = view;
    }

    /* renamed from: a */
    public static bz2 m32804a(View view) {
        int i = R.id.cbSelectFiat;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) ca7.m11819a(view, R.id.cbSelectFiat);
        if (materialCheckBox != null) {
            i = R.id.tvCurrencyName;
            TextView textView = (TextView) ca7.m11819a(view, R.id.tvCurrencyName);
            if (textView != null) {
                i = R.id.vDivider;
                View a = ca7.m11819a(view, R.id.vDivider);
                if (a != null) {
                    return new bz2((ConstraintLayout) view, materialCheckBox, textView, a);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo29812b() {
        return this.f21522a;
    }
}
