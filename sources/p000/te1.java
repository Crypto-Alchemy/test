package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: te1 */
/* compiled from: DialogAnchorChainBalanceBinding */
public final class te1 {

    /* renamed from: a */
    public final ConstraintLayout f34245a;

    /* renamed from: b */
    public final MaterialButton f34246b;

    /* renamed from: c */
    public final MaterialButton f34247c;

    /* renamed from: d */
    public final AppCompatTextView f34248d;

    public te1(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, AppCompatTextView appCompatTextView) {
        this.f34245a = constraintLayout;
        this.f34246b = materialButton;
        this.f34247c = materialButton2;
        this.f34248d = appCompatTextView;
    }

    /* renamed from: a */
    public static te1 m52272a(View view) {
        int i = R.id.btnAllChain;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnAllChain);
        if (materialButton != null) {
            i = R.id.btnSelectedChain;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.btnSelectedChain);
            if (materialButton2 != null) {
                i = R.id.txtTitle;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.txtTitle);
                if (appCompatTextView != null) {
                    return new te1((ConstraintLayout) view, materialButton, materialButton2, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
