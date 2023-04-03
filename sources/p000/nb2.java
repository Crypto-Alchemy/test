package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: nb2 */
/* compiled from: FragmentWalletConnectInterfaceBinding */
public final class nb2 {

    /* renamed from: a */
    public final ConstraintLayout f32061a;

    /* renamed from: b */
    public final CardView f32062b;

    /* renamed from: c */
    public final MaterialCardView f32063c;

    /* renamed from: d */
    public final MaterialCardView f32064d;

    /* renamed from: e */
    public final View f32065e;

    /* renamed from: f */
    public final ShapeableImageView f32066f;

    /* renamed from: g */
    public final AppCompatImageView f32067g;

    /* renamed from: h */
    public final ShapeableImageView f32068h;

    /* renamed from: i */
    public final AppCompatTextView f32069i;

    /* renamed from: j */
    public final MaterialButton f32070j;

    /* renamed from: k */
    public final SwitchMaterial f32071k;

    /* renamed from: l */
    public final AppCompatTextView f32072l;

    /* renamed from: m */
    public final b36 f32073m;

    /* renamed from: n */
    public final MaterialTextView f32074n;

    /* renamed from: o */
    public final MaterialTextView f32075o;

    /* renamed from: p */
    public final MaterialTextView f32076p;

    /* renamed from: q */
    public final MaterialTextView f32077q;

    /* renamed from: r */
    public final MaterialTextView f32078r;

    public nb2(ConstraintLayout constraintLayout, CardView cardView, MaterialCardView materialCardView, MaterialCardView materialCardView2, View view, ShapeableImageView shapeableImageView, AppCompatImageView appCompatImageView, ShapeableImageView shapeableImageView2, AppCompatTextView appCompatTextView, MaterialButton materialButton, SwitchMaterial switchMaterial, AppCompatTextView appCompatTextView2, b36 b36, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5) {
        this.f32061a = constraintLayout;
        this.f32062b = cardView;
        this.f32063c = materialCardView;
        this.f32064d = materialCardView2;
        this.f32065e = view;
        this.f32066f = shapeableImageView;
        this.f32067g = appCompatImageView;
        this.f32068h = shapeableImageView2;
        this.f32069i = appCompatTextView;
        this.f32070j = materialButton;
        this.f32071k = switchMaterial;
        this.f32072l = appCompatTextView2;
        this.f32073m = b36;
        this.f32074n = materialTextView;
        this.f32075o = materialTextView2;
        this.f32076p = materialTextView3;
        this.f32077q = materialTextView4;
        this.f32078r = materialTextView5;
    }

    /* renamed from: a */
    public static nb2 m48717a(View view) {
        View view2 = view;
        int i = R.id.ccChainSelected;
        CardView cardView = (CardView) ca7.m11819a(view2, R.id.ccChainSelected);
        if (cardView != null) {
            i = R.id.ccWrapperApproval;
            MaterialCardView materialCardView = (MaterialCardView) ca7.m11819a(view2, R.id.ccWrapperApproval);
            if (materialCardView != null) {
                i = R.id.ccWrapperConnectionSecurity;
                MaterialCardView materialCardView2 = (MaterialCardView) ca7.m11819a(view2, R.id.ccWrapperConnectionSecurity);
                if (materialCardView2 != null) {
                    i = R.id.dividerTxtTitleSecurity;
                    View a = ca7.m11819a(view2, R.id.dividerTxtTitleSecurity);
                    if (a != null) {
                        i = R.id.imgChainSelected;
                        ShapeableImageView shapeableImageView = (ShapeableImageView) ca7.m11819a(view2, R.id.imgChainSelected);
                        if (shapeableImageView != null) {
                            i = R.id.imgRightIndicator;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view2, R.id.imgRightIndicator);
                            if (appCompatImageView != null) {
                                i = R.id.imgThumb;
                                ShapeableImageView shapeableImageView2 = (ShapeableImageView) ca7.m11819a(view2, R.id.imgThumb);
                                if (shapeableImageView2 != null) {
                                    i = R.id.linkWcInterface;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view2, R.id.linkWcInterface);
                                    if (appCompatTextView != null) {
                                        i = R.id.sessionApproval;
                                        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.sessionApproval);
                                        if (materialButton != null) {
                                            i = R.id.switchTwoLayerConfirmation;
                                            SwitchMaterial switchMaterial = (SwitchMaterial) ca7.m11819a(view2, R.id.switchTwoLayerConfirmation);
                                            if (switchMaterial != null) {
                                                i = R.id.titleWcInterface;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ca7.m11819a(view2, R.id.titleWcInterface);
                                                if (appCompatTextView2 != null) {
                                                    i = R.id.toolbarWrapper;
                                                    View a2 = ca7.m11819a(view2, R.id.toolbarWrapper);
                                                    if (a2 != null) {
                                                        b36 a3 = b36.m32346a(a2);
                                                        i = R.id.txt_request_approval;
                                                        MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.txt_request_approval);
                                                        if (materialTextView != null) {
                                                            i = R.id.txtTitleSecurity;
                                                            MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view2, R.id.txtTitleSecurity);
                                                            if (materialTextView2 != null) {
                                                                i = R.id.txtWalletAddress;
                                                                MaterialTextView materialTextView3 = (MaterialTextView) ca7.m11819a(view2, R.id.txtWalletAddress);
                                                                if (materialTextView3 != null) {
                                                                    i = R.id.txtWalletName;
                                                                    MaterialTextView materialTextView4 = (MaterialTextView) ca7.m11819a(view2, R.id.txtWalletName);
                                                                    if (materialTextView4 != null) {
                                                                        i = R.id.txt_your_wallet_balance;
                                                                        MaterialTextView materialTextView5 = (MaterialTextView) ca7.m11819a(view2, R.id.txt_your_wallet_balance);
                                                                        if (materialTextView5 != null) {
                                                                            return new nb2((ConstraintLayout) view2, cardView, materialCardView, materialCardView2, a, shapeableImageView, appCompatImageView, shapeableImageView2, appCompatTextView, materialButton, switchMaterial, appCompatTextView2, a3, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
