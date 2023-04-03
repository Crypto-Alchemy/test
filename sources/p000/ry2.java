package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import net.safemoon.androidwallet.R;

/* renamed from: ry2 */
/* compiled from: ItemAddNewTokenBinding */
public final class ry2 {

    /* renamed from: a */
    public final ConstraintLayout f33664a;

    /* renamed from: b */
    public final MaterialButton f33665b;

    /* renamed from: c */
    public final MaterialCheckBox f33666c;

    /* renamed from: d */
    public final ImageView f33667d;

    /* renamed from: e */
    public final MaterialCardView f33668e;

    /* renamed from: f */
    public final MaterialCardView f33669f;

    /* renamed from: g */
    public final TextView f33670g;

    public ry2(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialCheckBox materialCheckBox, ImageView imageView, MaterialCardView materialCardView, MaterialCardView materialCardView2, TextView textView) {
        this.f33664a = constraintLayout;
        this.f33665b = materialButton;
        this.f33666c = materialCheckBox;
        this.f33667d = imageView;
        this.f33668e = materialCardView;
        this.f33669f = materialCardView2;
        this.f33670g = textView;
    }

    /* renamed from: a */
    public static ry2 m51433a(View view) {
        int i = R.id.btnDelete;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnDelete);
        if (materialButton != null) {
            i = R.id.cbAddToken;
            MaterialCheckBox materialCheckBox = (MaterialCheckBox) ca7.m11819a(view, R.id.cbAddToken);
            if (materialCheckBox != null) {
                i = R.id.ivTokenIcon;
                ImageView imageView = (ImageView) ca7.m11819a(view, R.id.ivTokenIcon);
                if (imageView != null) {
                    i = R.id.rowBG;
                    MaterialCardView materialCardView = (MaterialCardView) ca7.m11819a(view, R.id.rowBG);
                    if (materialCardView != null) {
                        i = R.id.rowFG;
                        MaterialCardView materialCardView2 = (MaterialCardView) ca7.m11819a(view, R.id.rowFG);
                        if (materialCardView2 != null) {
                            i = R.id.tvTokenNameAndSymbol;
                            TextView textView = (TextView) ca7.m11819a(view, R.id.tvTokenNameAndSymbol);
                            if (textView != null) {
                                return new ry2((ConstraintLayout) view, materialButton, materialCheckBox, imageView, materialCardView, materialCardView2, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static ry2 m51434c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_add_new_token, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m51433a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo47565b() {
        return this.f33664a;
    }
}
