package p000;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.views.slidetoact.SlideToActView;

/* renamed from: j92 */
/* compiled from: FragmentConfirmSwapTransactionBinding */
public final class j92 {

    /* renamed from: a */
    public final ConstraintLayout f30257a;

    /* renamed from: b */
    public final MaterialCardView f30258b;

    /* renamed from: c */
    public final SlideToActView f30259c;

    /* renamed from: d */
    public final MaterialButton f30260d;

    /* renamed from: e */
    public final MaterialTextView f30261e;

    /* renamed from: f */
    public final MaterialButton f30262f;

    /* renamed from: g */
    public final MaterialButton f30263g;

    /* renamed from: h */
    public final MaterialButton f30264h;

    /* renamed from: i */
    public final MaterialTextView f30265i;

    /* renamed from: j */
    public final MaterialTextView f30266j;

    /* renamed from: k */
    public final MaterialTextView f30267k;

    /* renamed from: l */
    public final TextInputEditText f30268l;

    /* renamed from: m */
    public final MaterialTextView f30269m;

    public j92(ConstraintLayout constraintLayout, MaterialCardView materialCardView, SlideToActView slideToActView, MaterialButton materialButton, MaterialTextView materialTextView, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, TextInputEditText textInputEditText, MaterialTextView materialTextView5) {
        this.f30257a = constraintLayout;
        this.f30258b = materialCardView;
        this.f30259c = slideToActView;
        this.f30260d = materialButton;
        this.f30261e = materialTextView;
        this.f30262f = materialButton2;
        this.f30263g = materialButton3;
        this.f30264h = materialButton4;
        this.f30265i = materialTextView2;
        this.f30266j = materialTextView3;
        this.f30267k = materialTextView4;
        this.f30268l = textInputEditText;
        this.f30269m = materialTextView5;
    }

    /* renamed from: a */
    public static j92 m46179a(View view) {
        View view2 = view;
        int i = R.id.ccWrapper;
        MaterialCardView materialCardView = (MaterialCardView) ca7.m11819a(view2, R.id.ccWrapper);
        if (materialCardView != null) {
            i = R.id.confirmSwap;
            SlideToActView slideToActView = (SlideToActView) ca7.m11819a(view2, R.id.confirmSwap);
            if (slideToActView != null) {
                i = R.id.dialog_cross;
                MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.dialog_cross);
                if (materialButton != null) {
                    i = R.id.dialog_title;
                    MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.dialog_title);
                    if (materialTextView != null) {
                        i = R.id.minimum_received;
                        MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view2, R.id.minimum_received);
                        if (materialButton2 != null) {
                            i = R.id.price_impact;
                            MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view2, R.id.price_impact);
                            if (materialButton3 != null) {
                                i = R.id.swap_fee;
                                MaterialButton materialButton4 = (MaterialButton) ca7.m11819a(view2, R.id.swap_fee);
                                if (materialButton4 != null) {
                                    i = R.id.txtLabelReceived;
                                    MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view2, R.id.txtLabelReceived);
                                    if (materialTextView2 != null) {
                                        i = R.id.txtMinimumReceived;
                                        MaterialTextView materialTextView3 = (MaterialTextView) ca7.m11819a(view2, R.id.txtMinimumReceived);
                                        if (materialTextView3 != null) {
                                            i = R.id.txtPriceImpact;
                                            MaterialTextView materialTextView4 = (MaterialTextView) ca7.m11819a(view2, R.id.txtPriceImpact);
                                            if (materialTextView4 != null) {
                                                i = R.id.txtSwapFee;
                                                TextInputEditText textInputEditText = (TextInputEditText) ca7.m11819a(view2, R.id.txtSwapFee);
                                                if (textInputEditText != null) {
                                                    i = R.id.txtWillRecalculate;
                                                    MaterialTextView materialTextView5 = (MaterialTextView) ca7.m11819a(view2, R.id.txtWillRecalculate);
                                                    if (materialTextView5 != null) {
                                                        return new j92((ConstraintLayout) view2, materialCardView, slideToActView, materialButton, materialTextView, materialButton2, materialButton3, materialButton4, materialTextView2, materialTextView3, materialTextView4, textInputEditText, materialTextView5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
