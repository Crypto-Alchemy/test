package p000;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: cf1 */
/* compiled from: DialogAutoSlippageBinding */
public final class cf1 {

    /* renamed from: a */
    public final MaterialCardView f21711a;

    /* renamed from: b */
    public final MaterialButton f21712b;

    /* renamed from: c */
    public final MaterialCardView f21713c;

    /* renamed from: d */
    public final MaterialButton f21714d;

    /* renamed from: e */
    public final View f21715e;

    /* renamed from: f */
    public final MaterialTextView f21716f;

    /* renamed from: g */
    public final MaterialTextView f21717g;

    /* renamed from: h */
    public final MaterialTextView f21718h;

    /* renamed from: i */
    public final MaterialTextView f21719i;

    /* renamed from: j */
    public final MaterialTextView f21720j;

    /* renamed from: k */
    public final MaterialTextView f21721k;

    /* renamed from: l */
    public final MaterialTextView f21722l;

    /* renamed from: m */
    public final MaterialTextView f21723m;

    /* renamed from: n */
    public final MaterialButton f21724n;

    /* renamed from: o */
    public final da7 f21725o;

    public cf1(MaterialCardView materialCardView, MaterialButton materialButton, MaterialCardView materialCardView2, MaterialButton materialButton2, View view, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, MaterialTextView materialTextView8, MaterialButton materialButton3, da7 da7) {
        this.f21711a = materialCardView;
        this.f21712b = materialButton;
        this.f21713c = materialCardView2;
        this.f21714d = materialButton2;
        this.f21715e = view;
        this.f21716f = materialTextView;
        this.f21717g = materialTextView2;
        this.f21718h = materialTextView3;
        this.f21719i = materialTextView4;
        this.f21720j = materialTextView5;
        this.f21721k = materialTextView6;
        this.f21722l = materialTextView7;
        this.f21723m = materialTextView8;
        this.f21724n = materialButton3;
        this.f21725o = da7;
    }

    /* renamed from: a */
    public static cf1 m32977a(View view) {
        View view2 = view;
        int i = R.id.btnDontShowMe;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnDontShowMe);
        if (materialButton != null) {
            MaterialCardView materialCardView = (MaterialCardView) view2;
            i = R.id.dialogCross;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view2, R.id.dialogCross);
            if (materialButton2 != null) {
                i = R.id.paddingView;
                View a = ca7.m11819a(view2, R.id.paddingView);
                if (a != null) {
                    i = R.id.txtAboutV2Describe;
                    MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.txtAboutV2Describe);
                    if (materialTextView != null) {
                        i = R.id.txtAboutV2Note;
                        MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view2, R.id.txtAboutV2Note);
                        if (materialTextView2 != null) {
                            i = R.id.txtAboutV2Title;
                            MaterialTextView materialTextView3 = (MaterialTextView) ca7.m11819a(view2, R.id.txtAboutV2Title);
                            if (materialTextView3 != null) {
                                i = R.id.txtHeaderDescribe;
                                MaterialTextView materialTextView4 = (MaterialTextView) ca7.m11819a(view2, R.id.txtHeaderDescribe);
                                if (materialTextView4 != null) {
                                    i = R.id.txtHeaderTitle;
                                    MaterialTextView materialTextView5 = (MaterialTextView) ca7.m11819a(view2, R.id.txtHeaderTitle);
                                    if (materialTextView5 != null) {
                                        i = R.id.txtStep1V2Title;
                                        MaterialTextView materialTextView6 = (MaterialTextView) ca7.m11819a(view2, R.id.txtStep1V2Title);
                                        if (materialTextView6 != null) {
                                            i = R.id.txtStepV1Describe;
                                            MaterialTextView materialTextView7 = (MaterialTextView) ca7.m11819a(view2, R.id.txtStepV1Describe);
                                            if (materialTextView7 != null) {
                                                i = R.id.txtStepV2Describe;
                                                MaterialTextView materialTextView8 = (MaterialTextView) ca7.m11819a(view2, R.id.txtStepV2Describe);
                                                if (materialTextView8 != null) {
                                                    i = R.id.txtTextSlippage;
                                                    MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view2, R.id.txtTextSlippage);
                                                    if (materialButton3 != null) {
                                                        i = R.id.wrapperBtnConsolidateNow;
                                                        View a2 = ca7.m11819a(view2, R.id.wrapperBtnConsolidateNow);
                                                        if (a2 != null) {
                                                            return new cf1(materialCardView, materialButton, materialCardView, materialButton2, a, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5, materialTextView6, materialTextView7, materialTextView8, materialButton3, da7.m43419a(a2));
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
