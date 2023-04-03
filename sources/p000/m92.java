package p000;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext;

/* renamed from: m92 */
/* compiled from: FragmentCryptoPriceAlertBinding */
public final class m92 {

    /* renamed from: a */
    public final MaterialCardView f31568a;

    /* renamed from: b */
    public final MaterialButton f31569b;

    /* renamed from: c */
    public final et2 f31570c;

    /* renamed from: d */
    public final AutofitEdittext f31571d;

    /* renamed from: e */
    public final et2 f31572e;

    /* renamed from: f */
    public final ShapeableImageView f31573f;

    /* renamed from: g */
    public final ShapeableImageView f31574g;

    /* renamed from: h */
    public final ShapeableImageView f31575h;

    /* renamed from: i */
    public final ShapeableImageView f31576i;

    /* renamed from: j */
    public final et2 f31577j;

    /* renamed from: k */
    public final LinearLayoutCompat f31578k;

    /* renamed from: l */
    public final HorizontalScrollView f31579l;

    /* renamed from: m */
    public final SwitchMaterial f31580m;

    /* renamed from: n */
    public final MaterialTextView f31581n;

    /* renamed from: o */
    public final SwitchMaterial f31582o;

    /* renamed from: p */
    public final MaterialTextView f31583p;

    /* renamed from: q */
    public final LinearLayout f31584q;

    public m92(MaterialCardView materialCardView, MaterialButton materialButton, et2 et2, AutofitEdittext autofitEdittext, et2 et22, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3, ShapeableImageView shapeableImageView4, et2 et23, LinearLayoutCompat linearLayoutCompat, HorizontalScrollView horizontalScrollView, SwitchMaterial switchMaterial, MaterialTextView materialTextView, SwitchMaterial switchMaterial2, MaterialTextView materialTextView2, LinearLayout linearLayout) {
        this.f31568a = materialCardView;
        this.f31569b = materialButton;
        this.f31570c = et2;
        this.f31571d = autofitEdittext;
        this.f31572e = et22;
        this.f31573f = shapeableImageView;
        this.f31574g = shapeableImageView2;
        this.f31575h = shapeableImageView3;
        this.f31576i = shapeableImageView4;
        this.f31577j = et23;
        this.f31578k = linearLayoutCompat;
        this.f31579l = horizontalScrollView;
        this.f31580m = switchMaterial;
        this.f31581n = materialTextView;
        this.f31582o = switchMaterial2;
        this.f31583p = materialTextView2;
        this.f31584q = linearLayout;
    }

    /* renamed from: a */
    public static m92 m48178a(View view) {
        View view2 = view;
        int i = R.id.clkConfirm;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.clkConfirm);
        if (materialButton != null) {
            i = R.id.decreaseOf;
            View a = ca7.m11819a(view2, R.id.decreaseOf);
            if (a != null) {
                et2 a2 = et2.m44057a(a);
                i = R.id.edtMaximum;
                AutofitEdittext autofitEdittext = (AutofitEdittext) ca7.m11819a(view2, R.id.edtMaximum);
                if (autofitEdittext != null) {
                    i = R.id.equalOf;
                    View a3 = ca7.m11819a(view2, R.id.equalOf);
                    if (a3 != null) {
                        et2 a4 = et2.m44057a(a3);
                        i = R.id.imgClose;
                        ShapeableImageView shapeableImageView = (ShapeableImageView) ca7.m11819a(view2, R.id.imgClose);
                        if (shapeableImageView != null) {
                            i = R.id.imgCpAdd;
                            ShapeableImageView shapeableImageView2 = (ShapeableImageView) ca7.m11819a(view2, R.id.imgCpAdd);
                            if (shapeableImageView2 != null) {
                                i = R.id.imgCpDelete;
                                ShapeableImageView shapeableImageView3 = (ShapeableImageView) ca7.m11819a(view2, R.id.imgCpDelete);
                                if (shapeableImageView3 != null) {
                                    i = R.id.imgTokenThumb;
                                    ShapeableImageView shapeableImageView4 = (ShapeableImageView) ca7.m11819a(view2, R.id.imgTokenThumb);
                                    if (shapeableImageView4 != null) {
                                        i = R.id.increaseOf;
                                        View a5 = ca7.m11819a(view2, R.id.increaseOf);
                                        if (a5 != null) {
                                            et2 a6 = et2.m44057a(a5);
                                            i = R.id.parentOfNavigator;
                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view2, R.id.parentOfNavigator);
                                            if (linearLayoutCompat != null) {
                                                i = R.id.scrollOfNavigator;
                                                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ca7.m11819a(view2, R.id.scrollOfNavigator);
                                                if (horizontalScrollView != null) {
                                                    i = R.id.switchPersistent;
                                                    SwitchMaterial switchMaterial = (SwitchMaterial) ca7.m11819a(view2, R.id.switchPersistent);
                                                    if (switchMaterial != null) {
                                                        i = R.id.titleAlertView;
                                                        MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.titleAlertView);
                                                        if (materialTextView != null) {
                                                            i = R.id.titleSwitch;
                                                            SwitchMaterial switchMaterial2 = (SwitchMaterial) ca7.m11819a(view2, R.id.titleSwitch);
                                                            if (switchMaterial2 != null) {
                                                                i = R.id.txtMaximumHint;
                                                                MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view2, R.id.txtMaximumHint);
                                                                if (materialTextView2 != null) {
                                                                    i = R.id.wrapperTxt;
                                                                    LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view2, R.id.wrapperTxt);
                                                                    if (linearLayout != null) {
                                                                        return new m92((MaterialCardView) view2, materialButton, a2, autofitEdittext, a4, shapeableImageView, shapeableImageView2, shapeableImageView3, shapeableImageView4, a6, linearLayoutCompat, horizontalScrollView, switchMaterial, materialTextView, switchMaterial2, materialTextView2, linearLayout);
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
