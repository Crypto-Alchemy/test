package p000;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: if1 */
/* compiled from: DialogDarkResetPasswordConfirmationBinding */
public final class if1 {

    /* renamed from: a */
    public final CardView f29917a;

    /* renamed from: b */
    public final MaterialButton f29918b;

    /* renamed from: c */
    public final MaterialButton f29919c;

    /* renamed from: d */
    public final TextView f29920d;

    /* renamed from: e */
    public final TextView f29921e;

    public if1(CardView cardView, MaterialButton materialButton, MaterialButton materialButton2, TextView textView, TextView textView2) {
        this.f29917a = cardView;
        this.f29918b = materialButton;
        this.f29919c = materialButton2;
        this.f29920d = textView;
        this.f29921e = textView2;
    }

    /* renamed from: a */
    public static if1 m45707a(View view) {
        int i = R.id.btnCancel;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnCancel);
        if (materialButton != null) {
            i = R.id.btnConfirm;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.btnConfirm);
            if (materialButton2 != null) {
                i = R.id.tvDialogContent;
                TextView textView = (TextView) ca7.m11819a(view, R.id.tvDialogContent);
                if (textView != null) {
                    i = R.id.tvDialogTitle;
                    TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvDialogTitle);
                    if (textView2 != null) {
                        return new if1((CardView) view, materialButton, materialButton2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public CardView mo43586b() {
        return this.f29917a;
    }
}
