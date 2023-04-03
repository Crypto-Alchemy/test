package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import net.safemoon.androidwallet.R;

/* renamed from: ty2 */
/* compiled from: ItemAktFiatBinding */
public final class ty2 {

    /* renamed from: a */
    public final ConstraintLayout f34417a;

    /* renamed from: b */
    public final MaterialCheckBox f34418b;

    /* renamed from: c */
    public final TextView f34419c;

    /* renamed from: d */
    public final View f34420d;

    public ty2(ConstraintLayout constraintLayout, MaterialCheckBox materialCheckBox, TextView textView, View view) {
        this.f34417a = constraintLayout;
        this.f34418b = materialCheckBox;
        this.f34419c = textView;
        this.f34420d = view;
    }

    /* renamed from: a */
    public static ty2 m52566a(View view) {
        int i = R.id.cbSelectFiat;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) ca7.m11819a(view, R.id.cbSelectFiat);
        if (materialCheckBox != null) {
            i = R.id.tvFiatName;
            TextView textView = (TextView) ca7.m11819a(view, R.id.tvFiatName);
            if (textView != null) {
                i = R.id.vDivider;
                View a = ca7.m11819a(view, R.id.vDivider);
                if (a != null) {
                    return new ty2((ConstraintLayout) view, materialCheckBox, textView, a);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo48274b() {
        return this.f34417a;
    }
}
