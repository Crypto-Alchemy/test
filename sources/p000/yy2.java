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
import com.google.android.material.imageview.ShapeableImageView;
import net.safemoon.androidwallet.R;

/* renamed from: yy2 */
/* compiled from: ItemCheckTokenBinding */
public final class yy2 {

    /* renamed from: a */
    public final ConstraintLayout f35941a;

    /* renamed from: b */
    public final MaterialButton f35942b;

    /* renamed from: c */
    public final MaterialCheckBox f35943c;

    /* renamed from: d */
    public final ImageView f35944d;

    /* renamed from: e */
    public final MaterialCardView f35945e;

    /* renamed from: f */
    public final MaterialCardView f35946f;

    /* renamed from: g */
    public final ShapeableImageView f35947g;

    /* renamed from: h */
    public final TextView f35948h;

    public yy2(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialCheckBox materialCheckBox, ImageView imageView, MaterialCardView materialCardView, MaterialCardView materialCardView2, ShapeableImageView shapeableImageView, TextView textView) {
        this.f35941a = constraintLayout;
        this.f35942b = materialButton;
        this.f35943c = materialCheckBox;
        this.f35944d = imageView;
        this.f35945e = materialCardView;
        this.f35946f = materialCardView2;
        this.f35947g = shapeableImageView;
        this.f35948h = textView;
    }

    /* renamed from: a */
    public static yy2 m54893a(View view) {
        int i = R.id.btnDelete;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnDelete);
        if (materialButton != null) {
            i = R.id.checkableIcon;
            MaterialCheckBox materialCheckBox = (MaterialCheckBox) ca7.m11819a(view, R.id.checkableIcon);
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
                            i = R.id.statusForCheck;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) ca7.m11819a(view, R.id.statusForCheck);
                            if (shapeableImageView != null) {
                                i = R.id.tvTokenNameAndSymbol;
                                TextView textView = (TextView) ca7.m11819a(view, R.id.tvTokenNameAndSymbol);
                                if (textView != null) {
                                    return new yy2((ConstraintLayout) view, materialButton, materialCheckBox, imageView, materialCardView, materialCardView2, shapeableImageView, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static yy2 m54894c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_check_token, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m54893a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo49753b() {
        return this.f35941a;
    }
}
