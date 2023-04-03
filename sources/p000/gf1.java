package p000;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: gf1 */
/* compiled from: DialogDarkLoginConfirmBinding */
public final class gf1 {

    /* renamed from: a */
    public final CardView f29229a;

    /* renamed from: b */
    public final MaterialButton f29230b;

    /* renamed from: c */
    public final MaterialButton f29231c;

    /* renamed from: d */
    public final TextView f29232d;

    /* renamed from: e */
    public final TextView f29233e;

    public gf1(CardView cardView, MaterialButton materialButton, MaterialButton materialButton2, TextView textView, TextView textView2) {
        this.f29229a = cardView;
        this.f29230b = materialButton;
        this.f29231c = materialButton2;
        this.f29232d = textView;
        this.f29233e = textView2;
    }

    /* renamed from: a */
    public static gf1 m44713a(View view) {
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
                        return new gf1((CardView) view, materialButton, materialButton2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public CardView mo42887b() {
        return this.f29229a;
    }
}
