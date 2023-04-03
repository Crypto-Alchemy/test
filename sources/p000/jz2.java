package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import net.safemoon.androidwallet.R;

/* renamed from: jz2 */
/* compiled from: ItemSimpleCheckboxBinding */
public final class jz2 {

    /* renamed from: a */
    public final ConstraintLayout f30669a;

    /* renamed from: b */
    public final MaterialCheckBox f30670b;

    /* renamed from: c */
    public final TextView f30671c;

    /* renamed from: d */
    public final View f30672d;

    public jz2(ConstraintLayout constraintLayout, MaterialCheckBox materialCheckBox, TextView textView, View view) {
        this.f30669a = constraintLayout;
        this.f30670b = materialCheckBox;
        this.f30671c = textView;
        this.f30672d = view;
    }

    /* renamed from: a */
    public static jz2 m46811a(View view) {
        int i = R.id.cbSelect;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) ca7.m11819a(view, R.id.cbSelect);
        if (materialCheckBox != null) {
            i = R.id.tvName;
            TextView textView = (TextView) ca7.m11819a(view, R.id.tvName);
            if (textView != null) {
                i = R.id.vDivider;
                View a = ca7.m11819a(view, R.id.vDivider);
                if (a != null) {
                    return new jz2((ConstraintLayout) view, materialCheckBox, textView, a);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static jz2 m46812c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_simple_checkbox, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m46811a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo44631b() {
        return this.f30669a;
    }
}
