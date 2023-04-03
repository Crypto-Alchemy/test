package p000;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: re1 */
/* compiled from: DialogAlertNoTitleBinding */
public final class re1 {

    /* renamed from: a */
    public final CardView f33415a;

    /* renamed from: b */
    public final MaterialButton f33416b;

    /* renamed from: c */
    public final TextView f33417c;

    /* renamed from: d */
    public final TextView f33418d;

    public re1(CardView cardView, MaterialButton materialButton, TextView textView, TextView textView2) {
        this.f33415a = cardView;
        this.f33416b = materialButton;
        this.f33417c = textView;
        this.f33418d = textView2;
    }

    /* renamed from: a */
    public static re1 m51076a(View view) {
        int i = R.id.btnAction;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnAction);
        if (materialButton != null) {
            i = R.id.tvDialogContent;
            TextView textView = (TextView) ca7.m11819a(view, R.id.tvDialogContent);
            if (textView != null) {
                i = R.id.tvDialogTitle;
                TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvDialogTitle);
                if (textView2 != null) {
                    return new re1((CardView) view, materialButton, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public CardView mo47391b() {
        return this.f33415a;
    }
}
