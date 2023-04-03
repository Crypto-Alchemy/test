package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: sf1 */
/* compiled from: DialogSwapSlippageBinding */
public final class sf1 {

    /* renamed from: a */
    public final RelativeLayout f33850a;

    /* renamed from: b */
    public final MaterialButton f33851b;

    /* renamed from: c */
    public final RadioButton f33852c;

    /* renamed from: d */
    public final RadioButton f33853d;

    /* renamed from: e */
    public final RadioButton f33854e;

    /* renamed from: f */
    public final MaterialButton f33855f;

    /* renamed from: g */
    public final MaterialTextView f33856g;

    /* renamed from: h */
    public final RadioGroup f33857h;

    /* renamed from: i */
    public final TextInputEditText f33858i;

    /* renamed from: j */
    public final TextInputLayout f33859j;

    /* renamed from: k */
    public final MaterialButton f33860k;

    /* renamed from: l */
    public final SwitchMaterial f33861l;

    /* renamed from: m */
    public final LinearLayout f33862m;

    /* renamed from: n */
    public final MaterialTextView f33863n;

    public sf1(RelativeLayout relativeLayout, MaterialButton materialButton, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, MaterialButton materialButton2, MaterialTextView materialTextView, RadioGroup radioGroup, TextInputEditText textInputEditText, TextInputLayout textInputLayout, MaterialButton materialButton3, SwitchMaterial switchMaterial, LinearLayout linearLayout, MaterialTextView materialTextView2) {
        this.f33850a = relativeLayout;
        this.f33851b = materialButton;
        this.f33852c = radioButton;
        this.f33853d = radioButton2;
        this.f33854e = radioButton3;
        this.f33855f = materialButton2;
        this.f33856g = materialTextView;
        this.f33857h = radioGroup;
        this.f33858i = textInputEditText;
        this.f33859j = textInputLayout;
        this.f33860k = materialButton3;
        this.f33861l = switchMaterial;
        this.f33862m = linearLayout;
        this.f33863n = materialTextView2;
    }

    /* renamed from: a */
    public static sf1 m51747a(View view) {
        View view2 = view;
        int i = R.id.btnConfirm;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnConfirm);
        if (materialButton != null) {
            i = R.id.chipSlip01;
            RadioButton radioButton = (RadioButton) ca7.m11819a(view2, R.id.chipSlip01);
            if (radioButton != null) {
                i = R.id.chipSlip05;
                RadioButton radioButton2 = (RadioButton) ca7.m11819a(view2, R.id.chipSlip05);
                if (radioButton2 != null) {
                    i = R.id.chipSlip1;
                    RadioButton radioButton3 = (RadioButton) ca7.m11819a(view2, R.id.chipSlip1);
                    if (radioButton3 != null) {
                        i = R.id.dialog_cross;
                        MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view2, R.id.dialog_cross);
                        if (materialButton2 != null) {
                            i = R.id.dialog_title;
                            MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.dialog_title);
                            if (materialTextView != null) {
                                i = R.id.easySlippageGroup;
                                RadioGroup radioGroup = (RadioGroup) ca7.m11819a(view2, R.id.easySlippageGroup);
                                if (radioGroup != null) {
                                    i = R.id.edtSlippageManually;
                                    TextInputEditText textInputEditText = (TextInputEditText) ca7.m11819a(view2, R.id.edtSlippageManually);
                                    if (textInputEditText != null) {
                                        i = R.id.edtSlippageManuallyParent;
                                        TextInputLayout textInputLayout = (TextInputLayout) ca7.m11819a(view2, R.id.edtSlippageManuallyParent);
                                        if (textInputLayout != null) {
                                            i = R.id.helpPrompt;
                                            MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view2, R.id.helpPrompt);
                                            if (materialButton3 != null) {
                                                i = R.id.switchPopup;
                                                SwitchMaterial switchMaterial = (SwitchMaterial) ca7.m11819a(view2, R.id.switchPopup);
                                                if (switchMaterial != null) {
                                                    i = R.id.switchPopupLayout;
                                                    LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view2, R.id.switchPopupLayout);
                                                    if (linearLayout != null) {
                                                        i = R.id.txtSetManually;
                                                        MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view2, R.id.txtSetManually);
                                                        if (materialTextView2 != null) {
                                                            return new sf1((RelativeLayout) view2, materialButton, radioButton, radioButton2, radioButton3, materialButton2, materialTextView, radioGroup, textInputEditText, textInputLayout, materialButton3, switchMaterial, linearLayout, materialTextView2);
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
