package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import net.safemoon.androidwallet.R;

/* renamed from: dz2 */
/* compiled from: ItemLanguageBinding */
public final class dz2 {

    /* renamed from: a */
    public final ConstraintLayout f28351a;

    /* renamed from: b */
    public final MaterialCheckBox f28352b;

    /* renamed from: c */
    public final TextView f28353c;

    /* renamed from: d */
    public final TextView f28354d;

    /* renamed from: e */
    public final View f28355e;

    public dz2(ConstraintLayout constraintLayout, MaterialCheckBox materialCheckBox, TextView textView, TextView textView2, View view) {
        this.f28351a = constraintLayout;
        this.f28352b = materialCheckBox;
        this.f28353c = textView;
        this.f28354d = textView2;
        this.f28355e = view;
    }

    /* renamed from: a */
    public static dz2 m43745a(View view) {
        int i = R.id.cbSelectLanguage;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) ca7.m11819a(view, R.id.cbSelectLanguage);
        if (materialCheckBox != null) {
            i = R.id.tvLanguageName;
            TextView textView = (TextView) ca7.m11819a(view, R.id.tvLanguageName);
            if (textView != null) {
                i = R.id.tvLanguageRegion;
                TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvLanguageRegion);
                if (textView2 != null) {
                    i = R.id.vDivider;
                    View a = ca7.m11819a(view, R.id.vDivider);
                    if (a != null) {
                        return new dz2((ConstraintLayout) view, materialCheckBox, textView, textView2, a);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo42096b() {
        return this.f28351a;
    }
}
