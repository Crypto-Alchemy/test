package p000;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: qe1 */
/* compiled from: DialogAlertBinding */
public final class qe1 {

    /* renamed from: a */
    public final ConstraintLayout f33069a;

    /* renamed from: b */
    public final MaterialButton f33070b;

    /* renamed from: c */
    public final MaterialButton f33071c;

    /* renamed from: d */
    public final MaterialCardView f33072d;

    /* renamed from: e */
    public final MaterialButton f33073e;

    /* renamed from: f */
    public final MaterialTextView f33074f;

    /* renamed from: g */
    public final MaterialTextView f33075g;

    public qe1(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialCardView materialCardView, MaterialButton materialButton3, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f33069a = constraintLayout;
        this.f33070b = materialButton;
        this.f33071c = materialButton2;
        this.f33072d = materialCardView;
        this.f33073e = materialButton3;
        this.f33074f = materialTextView;
        this.f33075g = materialTextView2;
    }

    /* renamed from: a */
    public static qe1 m50549a(View view) {
        int i = R.id.btnCancel;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnCancel);
        if (materialButton != null) {
            i = R.id.btnOk;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.btnOk);
            if (materialButton2 != null) {
                i = R.id.contentWrapper;
                MaterialCardView materialCardView = (MaterialCardView) ca7.m11819a(view, R.id.contentWrapper);
                if (materialCardView != null) {
                    i = R.id.dialogCross;
                    MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view, R.id.dialogCross);
                    if (materialButton3 != null) {
                        i = R.id.txtDescribe;
                        MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.txtDescribe);
                        if (materialTextView != null) {
                            i = R.id.txtTitle;
                            MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view, R.id.txtTitle);
                            if (materialTextView2 != null) {
                                return new qe1((ConstraintLayout) view, materialButton, materialButton2, materialCardView, materialButton3, materialTextView, materialTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo47078b() {
        return this.f33069a;
    }
}
