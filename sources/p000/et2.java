package p000;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.slider.Slider;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext;

/* renamed from: et2 */
/* compiled from: IncludeCpNotifiyBinding */
public final class et2 {

    /* renamed from: a */
    public final ConstraintLayout f28660a;

    /* renamed from: b */
    public final MaterialCheckBox f28661b;

    /* renamed from: c */
    public final MaterialCheckBox f28662c;

    /* renamed from: d */
    public final MaterialCheckBox f28663d;

    /* renamed from: e */
    public final AutofitEdittext f28664e;

    /* renamed from: f */
    public final Slider f28665f;

    /* renamed from: g */
    public final MaterialTextView f28666g;

    /* renamed from: h */
    public final MaterialTextView f28667h;

    public et2(ConstraintLayout constraintLayout, MaterialCheckBox materialCheckBox, MaterialCheckBox materialCheckBox2, MaterialCheckBox materialCheckBox3, AutofitEdittext autofitEdittext, Slider slider, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f28660a = constraintLayout;
        this.f28661b = materialCheckBox;
        this.f28662c = materialCheckBox2;
        this.f28663d = materialCheckBox3;
        this.f28664e = autofitEdittext;
        this.f28665f = slider;
        this.f28666g = materialTextView;
        this.f28667h = materialTextView2;
    }

    /* renamed from: a */
    public static et2 m44057a(View view) {
        int i = R.id.cbEnableBox;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) ca7.m11819a(view, R.id.cbEnableBox);
        if (materialCheckBox != null) {
            i = R.id.cbEnablepriceReachesOrHigher;
            MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) ca7.m11819a(view, R.id.cbEnablepriceReachesOrHigher);
            if (materialCheckBox2 != null) {
                i = R.id.cbEnablepriceReachesOrLower;
                MaterialCheckBox materialCheckBox3 = (MaterialCheckBox) ca7.m11819a(view, R.id.cbEnablepriceReachesOrLower);
                if (materialCheckBox3 != null) {
                    i = R.id.newValue;
                    AutofitEdittext autofitEdittext = (AutofitEdittext) ca7.m11819a(view, R.id.newValue);
                    if (autofitEdittext != null) {
                        i = R.id.slider;
                        Slider slider = (Slider) ca7.m11819a(view, R.id.slider);
                        if (slider != null) {
                            i = R.id.txtPercentage;
                            MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.txtPercentage);
                            if (materialTextView != null) {
                                i = R.id.txtTitle;
                                MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view, R.id.txtTitle);
                                if (materialTextView2 != null) {
                                    return new et2((ConstraintLayout) view, materialCheckBox, materialCheckBox2, materialCheckBox3, autofitEdittext, slider, materialTextView, materialTextView2);
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
