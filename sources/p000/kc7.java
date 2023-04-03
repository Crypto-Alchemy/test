package p000;

import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: kc7 */
/* compiled from: ViewHolderSwapBinding */
public final class kc7 {

    /* renamed from: a */
    public final MaterialCardView f30800a;

    /* renamed from: b */
    public final ShapeableImageView f30801b;

    /* renamed from: c */
    public final MaterialTextView f30802c;

    /* renamed from: d */
    public final MaterialTextView f30803d;

    /* renamed from: e */
    public final MaterialTextView f30804e;

    /* renamed from: f */
    public final MaterialTextView f30805f;

    /* renamed from: g */
    public final MaterialTextView f30806g;

    public kc7(MaterialCardView materialCardView, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5) {
        this.f30800a = materialCardView;
        this.f30801b = shapeableImageView;
        this.f30802c = materialTextView;
        this.f30803d = materialTextView2;
        this.f30804e = materialTextView3;
        this.f30805f = materialTextView4;
        this.f30806g = materialTextView5;
    }

    /* renamed from: a */
    public static kc7 m46957a(View view) {
        int i = R.id.imgTokenLogo;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ca7.m11819a(view, R.id.imgTokenLogo);
        if (shapeableImageView != null) {
            i = R.id.txtTokenBal;
            MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.txtTokenBal);
            if (materialTextView != null) {
                i = R.id.txtTokenBalance;
                MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view, R.id.txtTokenBalance);
                if (materialTextView2 != null) {
                    i = R.id.txtTokenBalanceTitle;
                    MaterialTextView materialTextView3 = (MaterialTextView) ca7.m11819a(view, R.id.txtTokenBalanceTitle);
                    if (materialTextView3 != null) {
                        i = R.id.txtTokenName;
                        MaterialTextView materialTextView4 = (MaterialTextView) ca7.m11819a(view, R.id.txtTokenName);
                        if (materialTextView4 != null) {
                            i = R.id.txtTokenPrice;
                            MaterialTextView materialTextView5 = (MaterialTextView) ca7.m11819a(view, R.id.txtTokenPrice);
                            if (materialTextView5 != null) {
                                return new kc7((MaterialCardView) view, shapeableImageView, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public MaterialCardView mo44742b() {
        return this.f30800a;
    }
}
