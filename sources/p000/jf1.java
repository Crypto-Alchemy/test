package p000;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: jf1 */
/* compiled from: DialogDarkSecurityQuestionsConfirmationBinding */
public final class jf1 {

    /* renamed from: a */
    public final CardView f30483a;

    /* renamed from: b */
    public final MaterialButton f30484b;

    /* renamed from: c */
    public final MaterialButton f30485c;

    /* renamed from: d */
    public final TextView f30486d;

    /* renamed from: e */
    public final TextView f30487e;

    /* renamed from: f */
    public final TextView f30488f;

    public jf1(CardView cardView, MaterialButton materialButton, MaterialButton materialButton2, TextView textView, TextView textView2, TextView textView3) {
        this.f30483a = cardView;
        this.f30484b = materialButton;
        this.f30485c = materialButton2;
        this.f30486d = textView;
        this.f30487e = textView2;
        this.f30488f = textView3;
    }

    /* renamed from: a */
    public static jf1 m46494a(View view) {
        int i = R.id.btnCancel;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnCancel);
        if (materialButton != null) {
            i = R.id.btnConfirm;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.btnConfirm);
            if (materialButton2 != null) {
                i = R.id.tvAnswer1;
                TextView textView = (TextView) ca7.m11819a(view, R.id.tvAnswer1);
                if (textView != null) {
                    i = R.id.tvAnswer2;
                    TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvAnswer2);
                    if (textView2 != null) {
                        i = R.id.tvDialogTitle;
                        TextView textView3 = (TextView) ca7.m11819a(view, R.id.tvDialogTitle);
                        if (textView3 != null) {
                            return new jf1((CardView) view, materialButton, materialButton2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public CardView mo44459b() {
        return this.f30483a;
    }
}
