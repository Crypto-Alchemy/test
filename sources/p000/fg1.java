package p000;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: fg1 */
/* compiled from: DialogV2HelpBinding */
public final class fg1 {

    /* renamed from: a */
    public final MaterialCardView f28857a;

    /* renamed from: b */
    public final MaterialButton f28858b;

    /* renamed from: c */
    public final MaterialButton f28859c;

    /* renamed from: d */
    public final MaterialCardView f28860d;

    /* renamed from: e */
    public final MaterialButton f28861e;

    /* renamed from: f */
    public final MaterialTextView f28862f;

    /* renamed from: g */
    public final MaterialTextView f28863g;

    /* renamed from: h */
    public final MaterialTextView f28864h;

    /* renamed from: i */
    public final MaterialTextView f28865i;

    /* renamed from: j */
    public final MaterialTextView f28866j;

    /* renamed from: k */
    public final MaterialTextView f28867k;

    /* renamed from: l */
    public final MaterialTextView f28868l;

    /* renamed from: m */
    public final MaterialTextView f28869m;

    /* renamed from: n */
    public final MaterialTextView f28870n;

    /* renamed from: o */
    public final MaterialTextView f28871o;

    /* renamed from: p */
    public final MaterialTextView f28872p;

    /* renamed from: q */
    public final MaterialTextView f28873q;

    public fg1(MaterialCardView materialCardView, MaterialButton materialButton, MaterialButton materialButton2, MaterialCardView materialCardView2, MaterialButton materialButton3, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, MaterialTextView materialTextView8, MaterialTextView materialTextView9, MaterialTextView materialTextView10, MaterialTextView materialTextView11, MaterialTextView materialTextView12) {
        this.f28857a = materialCardView;
        this.f28858b = materialButton;
        this.f28859c = materialButton2;
        this.f28860d = materialCardView2;
        this.f28861e = materialButton3;
        this.f28862f = materialTextView;
        this.f28863g = materialTextView2;
        this.f28864h = materialTextView3;
        this.f28865i = materialTextView4;
        this.f28866j = materialTextView5;
        this.f28867k = materialTextView6;
        this.f28868l = materialTextView7;
        this.f28869m = materialTextView8;
        this.f28870n = materialTextView9;
        this.f28871o = materialTextView10;
        this.f28872p = materialTextView11;
        this.f28873q = materialTextView12;
    }

    /* renamed from: a */
    public static fg1 m44310a(View view) {
        View view2 = view;
        int i = R.id.btnConsolidateNow;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnConsolidateNow);
        if (materialButton != null) {
            i = R.id.btnDontShowMe;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view2, R.id.btnDontShowMe);
            if (materialButton2 != null) {
                MaterialCardView materialCardView = (MaterialCardView) view2;
                i = R.id.dialogCross;
                MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view2, R.id.dialogCross);
                if (materialButton3 != null) {
                    i = R.id.txtAboutV2Describe;
                    MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.txtAboutV2Describe);
                    if (materialTextView != null) {
                        i = R.id.txtAboutV2Note;
                        MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view2, R.id.txtAboutV2Note);
                        if (materialTextView2 != null) {
                            i = R.id.txtAboutV2Title;
                            MaterialTextView materialTextView3 = (MaterialTextView) ca7.m11819a(view2, R.id.txtAboutV2Title);
                            if (materialTextView3 != null) {
                                i = R.id.txtAllSet;
                                MaterialTextView materialTextView4 = (MaterialTextView) ca7.m11819a(view2, R.id.txtAllSet);
                                if (materialTextView4 != null) {
                                    i = R.id.txtAllSetDescribe;
                                    MaterialTextView materialTextView5 = (MaterialTextView) ca7.m11819a(view2, R.id.txtAllSetDescribe);
                                    if (materialTextView5 != null) {
                                        i = R.id.txtFooterTitle;
                                        MaterialTextView materialTextView6 = (MaterialTextView) ca7.m11819a(view2, R.id.txtFooterTitle);
                                        if (materialTextView6 != null) {
                                            i = R.id.txtHeaderDescribe;
                                            MaterialTextView materialTextView7 = (MaterialTextView) ca7.m11819a(view2, R.id.txtHeaderDescribe);
                                            if (materialTextView7 != null) {
                                                i = R.id.txtHeaderTitle;
                                                MaterialTextView materialTextView8 = (MaterialTextView) ca7.m11819a(view2, R.id.txtHeaderTitle);
                                                if (materialTextView8 != null) {
                                                    i = R.id.txtStep1V2Title;
                                                    MaterialTextView materialTextView9 = (MaterialTextView) ca7.m11819a(view2, R.id.txtStep1V2Title);
                                                    if (materialTextView9 != null) {
                                                        i = R.id.txtStepV1Describe;
                                                        MaterialTextView materialTextView10 = (MaterialTextView) ca7.m11819a(view2, R.id.txtStepV1Describe);
                                                        if (materialTextView10 != null) {
                                                            i = R.id.txtStepV2Describe;
                                                            MaterialTextView materialTextView11 = (MaterialTextView) ca7.m11819a(view2, R.id.txtStepV2Describe);
                                                            if (materialTextView11 != null) {
                                                                i = R.id.txtStepV3Describe;
                                                                MaterialTextView materialTextView12 = (MaterialTextView) ca7.m11819a(view2, R.id.txtStepV3Describe);
                                                                if (materialTextView12 != null) {
                                                                    return new fg1(materialCardView, materialButton, materialButton2, materialCardView, materialButton3, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5, materialTextView6, materialTextView7, materialTextView8, materialTextView9, materialTextView10, materialTextView11, materialTextView12);
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
