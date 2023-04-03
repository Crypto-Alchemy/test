package p000;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: hf1 */
/* compiled from: DialogDarkRegisterSuccessBinding */
public final class hf1 {

    /* renamed from: a */
    public final CardView f29561a;

    /* renamed from: b */
    public final MaterialButton f29562b;

    /* renamed from: c */
    public final TextView f29563c;

    /* renamed from: d */
    public final TextView f29564d;

    public hf1(CardView cardView, MaterialButton materialButton, TextView textView, TextView textView2) {
        this.f29561a = cardView;
        this.f29562b = materialButton;
        this.f29563c = textView;
        this.f29564d = textView2;
    }

    /* renamed from: a */
    public static hf1 m45190a(View view) {
        int i = R.id.btnAction;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnAction);
        if (materialButton != null) {
            i = R.id.tvDialogContent;
            TextView textView = (TextView) ca7.m11819a(view, R.id.tvDialogContent);
            if (textView != null) {
                i = R.id.tvDialogTitle;
                TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvDialogTitle);
                if (textView2 != null) {
                    return new hf1((CardView) view, materialButton, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public CardView mo43179b() {
        return this.f29561a;
    }
}
