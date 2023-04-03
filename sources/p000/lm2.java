package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import net.safemoon.androidwallet.R;

/* renamed from: lm2 */
/* compiled from: HolderChooseNetworkBinding */
public final class lm2 {

    /* renamed from: a */
    public final ConstraintLayout f31334a;

    /* renamed from: b */
    public final MaterialCheckBox f31335b;

    /* renamed from: c */
    public final ConstraintLayout f31336c;

    /* renamed from: d */
    public final ImageView f31337d;

    /* renamed from: e */
    public final TextView f31338e;

    public lm2(ConstraintLayout constraintLayout, MaterialCheckBox materialCheckBox, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView) {
        this.f31334a = constraintLayout;
        this.f31335b = materialCheckBox;
        this.f31336c = constraintLayout2;
        this.f31337d = imageView;
        this.f31338e = textView;
    }

    /* renamed from: a */
    public static lm2 m47842a(View view) {
        int i = R.id.cbSelectFiat;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) ca7.m11819a(view, R.id.cbSelectFiat);
        if (materialCheckBox != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.ivChainIcon;
            ImageView imageView = (ImageView) ca7.m11819a(view, R.id.ivChainIcon);
            if (imageView != null) {
                i = R.id.tvChainName;
                TextView textView = (TextView) ca7.m11819a(view, R.id.tvChainName);
                if (textView != null) {
                    return new lm2(constraintLayout, materialCheckBox, constraintLayout, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo45448b() {
        return this.f31334a;
    }
}
