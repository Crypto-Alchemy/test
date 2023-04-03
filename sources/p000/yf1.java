package p000;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: yf1 */
/* compiled from: DialogSwapTransactionLimitBinding */
public final class yf1 {

    /* renamed from: a */
    public final ConstraintLayout f35862a;

    /* renamed from: b */
    public final MaterialButton f35863b;

    /* renamed from: c */
    public final MaterialButton f35864c;

    /* renamed from: d */
    public final MaterialTextView f35865d;

    /* renamed from: e */
    public final TextInputEditText f35866e;

    /* renamed from: f */
    public final TextInputLayout f35867f;

    /* renamed from: g */
    public final MaterialTextView f35868g;

    public yf1(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialTextView materialTextView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, MaterialTextView materialTextView2) {
        this.f35862a = constraintLayout;
        this.f35863b = materialButton;
        this.f35864c = materialButton2;
        this.f35865d = materialTextView;
        this.f35866e = textInputEditText;
        this.f35867f = textInputLayout;
        this.f35868g = materialTextView2;
    }

    /* renamed from: a */
    public static yf1 m54738a(View view) {
        int i = R.id.btnConfirm;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnConfirm);
        if (materialButton != null) {
            i = R.id.dialog_cross;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.dialog_cross);
            if (materialButton2 != null) {
                i = R.id.dialog_title;
                MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.dialog_title);
                if (materialTextView != null) {
                    i = R.id.edtTime;
                    TextInputEditText textInputEditText = (TextInputEditText) ca7.m11819a(view, R.id.edtTime);
                    if (textInputEditText != null) {
                        i = R.id.edtTimeParent;
                        TextInputLayout textInputLayout = (TextInputLayout) ca7.m11819a(view, R.id.edtTimeParent);
                        if (textInputLayout != null) {
                            i = R.id.helpPrompt;
                            MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view, R.id.helpPrompt);
                            if (materialTextView2 != null) {
                                return new yf1((ConstraintLayout) view, materialButton, materialButton2, materialTextView, textInputEditText, textInputLayout, materialTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
