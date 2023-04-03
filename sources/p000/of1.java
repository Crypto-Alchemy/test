package p000;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: of1 */
/* compiled from: DialogRefreshWalletsConfirmationBinding */
public final class of1 {

    /* renamed from: a */
    public final CardView f32366a;

    /* renamed from: b */
    public final MaterialButton f32367b;

    /* renamed from: c */
    public final MaterialButton f32368c;

    /* renamed from: d */
    public final TextView f32369d;

    /* renamed from: e */
    public final TextView f32370e;

    public of1(CardView cardView, MaterialButton materialButton, MaterialButton materialButton2, TextView textView, TextView textView2) {
        this.f32366a = cardView;
        this.f32367b = materialButton;
        this.f32368c = materialButton2;
        this.f32369d = textView;
        this.f32370e = textView2;
    }

    /* renamed from: a */
    public static of1 m49290a(View view) {
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
                        return new of1((CardView) view, materialButton, materialButton2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public CardView mo46392b() {
        return this.f32366a;
    }
}
