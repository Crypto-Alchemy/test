package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext;

/* renamed from: fe7 */
/* compiled from: ViewSwapCardBinding */
public final class fe7 {

    /* renamed from: a */
    public final MaterialCardView f28828a;

    /* renamed from: b */
    public final Barrier f28829b;

    /* renamed from: c */
    public final MaterialButton f28830c;

    /* renamed from: d */
    public final MaterialButton f28831d;

    /* renamed from: e */
    public final MaterialButton f28832e;

    /* renamed from: f */
    public final MaterialButton f28833f;

    /* renamed from: g */
    public final MaterialButton f28834g;

    /* renamed from: h */
    public final MaterialButton f28835h;

    /* renamed from: i */
    public final AppCompatTextView f28836i;

    /* renamed from: j */
    public final FrameLayout f28837j;

    /* renamed from: k */
    public final AppCompatTextView f28838k;

    /* renamed from: l */
    public final ShapeableImageView f28839l;

    /* renamed from: m */
    public final AutofitEdittext f28840m;

    /* renamed from: n */
    public final RelativeLayout f28841n;

    /* renamed from: o */
    public final MaterialCardView f28842o;

    /* renamed from: p */
    public final MaterialTextView f28843p;

    /* renamed from: q */
    public final AppCompatTextView f28844q;

    /* renamed from: r */
    public final MaterialTextView f28845r;

    public fe7(MaterialCardView materialCardView, Barrier barrier, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialButton materialButton5, MaterialButton materialButton6, AppCompatTextView appCompatTextView, FrameLayout frameLayout, AppCompatTextView appCompatTextView2, ShapeableImageView shapeableImageView, AutofitEdittext autofitEdittext, RelativeLayout relativeLayout, MaterialCardView materialCardView2, MaterialTextView materialTextView, AppCompatTextView appCompatTextView3, MaterialTextView materialTextView2) {
        this.f28828a = materialCardView;
        this.f28829b = barrier;
        this.f28830c = materialButton;
        this.f28831d = materialButton2;
        this.f28832e = materialButton3;
        this.f28833f = materialButton4;
        this.f28834g = materialButton5;
        this.f28835h = materialButton6;
        this.f28836i = appCompatTextView;
        this.f28837j = frameLayout;
        this.f28838k = appCompatTextView2;
        this.f28839l = shapeableImageView;
        this.f28840m = autofitEdittext;
        this.f28841n = relativeLayout;
        this.f28842o = materialCardView2;
        this.f28843p = materialTextView;
        this.f28844q = appCompatTextView3;
        this.f28845r = materialTextView2;
    }

    /* renamed from: a */
    public static fe7 m44306a(View view) {
        View view2 = view;
        int i = R.id.barrierForNewValue;
        Barrier barrier = (Barrier) ca7.m11819a(view2, R.id.barrierForNewValue);
        if (barrier != null) {
            i = R.id.btnCC25;
            MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnCC25);
            if (materialButton != null) {
                i = R.id.btnCC50;
                MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view2, R.id.btnCC50);
                if (materialButton2 != null) {
                    i = R.id.btnCC75;
                    MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view2, R.id.btnCC75);
                    if (materialButton3 != null) {
                        i = R.id.btnCCMax;
                        MaterialButton materialButton4 = (MaterialButton) ca7.m11819a(view2, R.id.btnCCMax);
                        if (materialButton4 != null) {
                            i = R.id.btnClearText;
                            MaterialButton materialButton5 = (MaterialButton) ca7.m11819a(view2, R.id.btnClearText);
                            if (materialButton5 != null) {
                                i = R.id.btnSelectCurrency;
                                MaterialButton materialButton6 = (MaterialButton) ca7.m11819a(view2, R.id.btnSelectCurrency);
                                if (materialButton6 != null) {
                                    i = R.id.ccBalance;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view2, R.id.ccBalance);
                                    if (appCompatTextView != null) {
                                        i = R.id.ccBalanceParent;
                                        FrameLayout frameLayout = (FrameLayout) ca7.m11819a(view2, R.id.ccBalanceParent);
                                        if (frameLayout != null) {
                                            i = R.id.hintNewValue;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ca7.m11819a(view2, R.id.hintNewValue);
                                            if (appCompatTextView2 != null) {
                                                i = R.id.imgCoin;
                                                ShapeableImageView shapeableImageView = (ShapeableImageView) ca7.m11819a(view2, R.id.imgCoin);
                                                if (shapeableImageView != null) {
                                                    i = R.id.newValue;
                                                    AutofitEdittext autofitEdittext = (AutofitEdittext) ca7.m11819a(view2, R.id.newValue);
                                                    if (autofitEdittext != null) {
                                                        i = R.id.newValueParent;
                                                        RelativeLayout relativeLayout = (RelativeLayout) ca7.m11819a(view2, R.id.newValueParent);
                                                        if (relativeLayout != null) {
                                                            MaterialCardView materialCardView = (MaterialCardView) view2;
                                                            i = R.id.txtCurrentPrice;
                                                            MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.txtCurrentPrice);
                                                            if (materialTextView != null) {
                                                                i = R.id.txtLoader;
                                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ca7.m11819a(view2, R.id.txtLoader);
                                                                if (appCompatTextView3 != null) {
                                                                    i = R.id.txtName;
                                                                    MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view2, R.id.txtName);
                                                                    if (materialTextView2 != null) {
                                                                        return new fe7(materialCardView, barrier, materialButton, materialButton2, materialButton3, materialButton4, materialButton5, materialButton6, appCompatTextView, frameLayout, appCompatTextView2, shapeableImageView, autofitEdittext, relativeLayout, materialCardView, materialTextView, appCompatTextView3, materialTextView2);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
