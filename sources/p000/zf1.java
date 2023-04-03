package p000;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: zf1 */
/* compiled from: DialogSwapTransactionSpeedBinding */
public final class zf1 {

    /* renamed from: a */
    public final ConstraintLayout f36142a;

    /* renamed from: b */
    public final MaterialButton f36143b;

    /* renamed from: c */
    public final RadioButton f36144c;

    /* renamed from: d */
    public final RadioButton f36145d;

    /* renamed from: e */
    public final RadioButton f36146e;

    /* renamed from: f */
    public final MaterialButton f36147f;

    /* renamed from: g */
    public final MaterialTextView f36148g;

    /* renamed from: h */
    public final RadioGroup f36149h;

    /* renamed from: i */
    public final MaterialTextView f36150i;

    public zf1(ConstraintLayout constraintLayout, MaterialButton materialButton, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, MaterialButton materialButton2, MaterialTextView materialTextView, RadioGroup radioGroup, MaterialTextView materialTextView2) {
        this.f36142a = constraintLayout;
        this.f36143b = materialButton;
        this.f36144c = radioButton;
        this.f36145d = radioButton2;
        this.f36146e = radioButton3;
        this.f36147f = materialButton2;
        this.f36148g = materialTextView;
        this.f36149h = radioGroup;
        this.f36150i = materialTextView2;
    }

    /* renamed from: a */
    public static zf1 m55098a(View view) {
        int i = R.id.btnConfirm;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnConfirm);
        if (materialButton != null) {
            i = R.id.chipTsFast;
            RadioButton radioButton = (RadioButton) ca7.m11819a(view, R.id.chipTsFast);
            if (radioButton != null) {
                i = R.id.chipTsLight;
                RadioButton radioButton2 = (RadioButton) ca7.m11819a(view, R.id.chipTsLight);
                if (radioButton2 != null) {
                    i = R.id.chipTsStandard;
                    RadioButton radioButton3 = (RadioButton) ca7.m11819a(view, R.id.chipTsStandard);
                    if (radioButton3 != null) {
                        i = R.id.dialog_cross;
                        MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.dialog_cross);
                        if (materialButton2 != null) {
                            i = R.id.dialog_title;
                            MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.dialog_title);
                            if (materialTextView != null) {
                                i = R.id.easyTspageGroup;
                                RadioGroup radioGroup = (RadioGroup) ca7.m11819a(view, R.id.easyTspageGroup);
                                if (radioGroup != null) {
                                    i = R.id.txtInfo;
                                    MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view, R.id.txtInfo);
                                    if (materialTextView2 != null) {
                                        return new zf1((ConstraintLayout) view, materialButton, radioButton, radioButton2, radioButton3, materialButton2, materialTextView, radioGroup, materialTextView2);
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
