package p000;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: lf1 */
/* compiled from: DialogNftNetworkInfomationBinding */
public final class lf1 {

    /* renamed from: a */
    public final MaterialCardView f31301a;

    /* renamed from: b */
    public final MaterialCardView f31302b;

    /* renamed from: c */
    public final MaterialButton f31303c;

    /* renamed from: d */
    public final View f31304d;

    /* renamed from: e */
    public final MaterialTextView f31305e;

    /* renamed from: f */
    public final MaterialTextView f31306f;

    public lf1(MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialButton materialButton, View view, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f31301a = materialCardView;
        this.f31302b = materialCardView2;
        this.f31303c = materialButton;
        this.f31304d = view;
        this.f31305e = materialTextView;
        this.f31306f = materialTextView2;
    }

    /* renamed from: a */
    public static lf1 m47800a(View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i = R.id.dialogCross;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.dialogCross);
        if (materialButton != null) {
            i = R.id.paddingView;
            View a = ca7.m11819a(view, R.id.paddingView);
            if (a != null) {
                i = R.id.txtHeaderDescribe;
                MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.txtHeaderDescribe);
                if (materialTextView != null) {
                    i = R.id.txtHeaderTitle;
                    MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view, R.id.txtHeaderTitle);
                    if (materialTextView2 != null) {
                        return new lf1(materialCardView, materialCardView, materialButton, a, materialTextView, materialTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
