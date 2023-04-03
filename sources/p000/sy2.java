package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: sy2 */
/* compiled from: ItemAddressWithCcBinding */
public final class sy2 {

    /* renamed from: a */
    public final ConstraintLayout f34057a;

    /* renamed from: b */
    public final MaterialButton f34058b;

    /* renamed from: c */
    public final TextView f34059c;

    public sy2(ConstraintLayout constraintLayout, MaterialButton materialButton, TextView textView) {
        this.f34057a = constraintLayout;
        this.f34058b = materialButton;
        this.f34059c = textView;
    }

    /* renamed from: a */
    public static sy2 m51998a(View view) {
        int i = R.id.btnCopy;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnCopy);
        if (materialButton != null) {
            i = R.id.tvWalletAddressDescription;
            TextView textView = (TextView) ca7.m11819a(view, R.id.tvWalletAddressDescription);
            if (textView != null) {
                return new sy2((ConstraintLayout) view, materialButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
