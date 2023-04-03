package p000;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: da7 */
/* compiled from: ViewButtonShadowBinding */
public final class da7 {

    /* renamed from: a */
    public final CardView f28074a;

    /* renamed from: b */
    public final MaterialButton f28075b;

    /* renamed from: c */
    public final View f28076c;

    public da7(CardView cardView, MaterialButton materialButton, View view) {
        this.f28074a = cardView;
        this.f28075b = materialButton;
        this.f28076c = view;
    }

    /* renamed from: a */
    public static da7 m43419a(View view) {
        int i = R.id.button;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.button);
        if (materialButton != null) {
            i = R.id.viewButton;
            View a = ca7.m11819a(view, R.id.viewButton);
            if (a != null) {
                return new da7((CardView) view, materialButton, a);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
