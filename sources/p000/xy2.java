package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import net.safemoon.androidwallet.R;

/* renamed from: xy2 */
/* compiled from: ItemChangeIconAppBinding */
public final class xy2 {

    /* renamed from: a */
    public final ConstraintLayout f35724a;

    /* renamed from: b */
    public final MaterialCardView f35725b;

    /* renamed from: c */
    public final MaterialCheckBox f35726c;

    /* renamed from: d */
    public final ImageView f35727d;

    /* renamed from: e */
    public final TextView f35728e;

    /* renamed from: f */
    public final View f35729f;

    public xy2(ConstraintLayout constraintLayout, MaterialCardView materialCardView, MaterialCheckBox materialCheckBox, ImageView imageView, TextView textView, View view) {
        this.f35724a = constraintLayout;
        this.f35725b = materialCardView;
        this.f35726c = materialCheckBox;
        this.f35727d = imageView;
        this.f35728e = textView;
        this.f35729f = view;
    }

    /* renamed from: a */
    public static xy2 m54587a(View view) {
        int i = R.id.cardViewIcon;
        MaterialCardView materialCardView = (MaterialCardView) ca7.m11819a(view, R.id.cardViewIcon);
        if (materialCardView != null) {
            i = R.id.cbSelect;
            MaterialCheckBox materialCheckBox = (MaterialCheckBox) ca7.m11819a(view, R.id.cbSelect);
            if (materialCheckBox != null) {
                i = R.id.imgIcon;
                ImageView imageView = (ImageView) ca7.m11819a(view, R.id.imgIcon);
                if (imageView != null) {
                    i = R.id.tvName;
                    TextView textView = (TextView) ca7.m11819a(view, R.id.tvName);
                    if (textView != null) {
                        i = R.id.vDivider;
                        View a = ca7.m11819a(view, R.id.vDivider);
                        if (a != null) {
                            return new xy2((ConstraintLayout) view, materialCardView, materialCheckBox, imageView, textView, a);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static xy2 m54588c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_change_icon_app, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m54587a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo49569b() {
        return this.f35724a;
    }
}
