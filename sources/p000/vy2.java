package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import net.safemoon.androidwallet.R;

/* renamed from: vy2 */
/* compiled from: ItemAktLanguageBinding */
public final class vy2 {

    /* renamed from: a */
    public final ConstraintLayout f35186a;

    /* renamed from: b */
    public final MaterialCheckBox f35187b;

    /* renamed from: c */
    public final TextView f35188c;

    /* renamed from: d */
    public final TextView f35189d;

    /* renamed from: e */
    public final View f35190e;

    public vy2(ConstraintLayout constraintLayout, MaterialCheckBox materialCheckBox, TextView textView, TextView textView2, View view) {
        this.f35186a = constraintLayout;
        this.f35187b = materialCheckBox;
        this.f35188c = textView;
        this.f35189d = textView2;
        this.f35190e = view;
    }

    /* renamed from: a */
    public static vy2 m53607a(View view) {
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
                        return new vy2((ConstraintLayout) view, materialCheckBox, textView, textView2, a);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo48847b() {
        return this.f35186a;
    }
}
