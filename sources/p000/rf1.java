package p000;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: rf1 */
/* compiled from: DialogSwapSlipHelpPromptBinding */
public final class rf1 {

    /* renamed from: a */
    public final ConstraintLayout f33421a;

    /* renamed from: b */
    public final MaterialButton f33422b;

    /* renamed from: c */
    public final MaterialTextView f33423c;

    /* renamed from: d */
    public final MaterialTextView f33424d;

    /* renamed from: e */
    public final MaterialTextView f33425e;

    public rf1(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f33421a = constraintLayout;
        this.f33422b = materialButton;
        this.f33423c = materialTextView;
        this.f33424d = materialTextView2;
        this.f33425e = materialTextView3;
    }

    /* renamed from: a */
    public static rf1 m51087a(View view) {
        int i = R.id.dialog_cross;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.dialog_cross);
        if (materialButton != null) {
            i = R.id.dialog_title;
            MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.dialog_title);
            if (materialTextView != null) {
                i = R.id.txtDescribeSlippage;
                MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view, R.id.txtDescribeSlippage);
                if (materialTextView2 != null) {
                    i = R.id.txtDescribeSlippageUse;
                    MaterialTextView materialTextView3 = (MaterialTextView) ca7.m11819a(view, R.id.txtDescribeSlippageUse);
                    if (materialTextView3 != null) {
                        return new rf1((ConstraintLayout) view, materialButton, materialTextView, materialTextView2, materialTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
