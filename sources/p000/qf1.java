package p000;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: qf1 */
/* compiled from: DialogSendTokenConfirmationBinding */
public final class qf1 {

    /* renamed from: a */
    public final CardView f33086a;

    /* renamed from: b */
    public final MaterialButton f33087b;

    /* renamed from: c */
    public final MaterialButton f33088c;

    /* renamed from: d */
    public final TextView f33089d;

    /* renamed from: e */
    public final TextView f33090e;

    /* renamed from: f */
    public final RelativeLayout f33091f;

    public qf1(CardView cardView, MaterialButton materialButton, MaterialButton materialButton2, TextView textView, TextView textView2, RelativeLayout relativeLayout) {
        this.f33086a = cardView;
        this.f33087b = materialButton;
        this.f33088c = materialButton2;
        this.f33089d = textView;
        this.f33090e = textView2;
        this.f33091f = relativeLayout;
    }

    /* renamed from: a */
    public static qf1 m50570a(View view) {
        int i = R.id.btnAction;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnAction);
        if (materialButton != null) {
            i = R.id.dialog_cross;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.dialog_cross);
            if (materialButton2 != null) {
                i = R.id.tvDialogContentLine1;
                TextView textView = (TextView) ca7.m11819a(view, R.id.tvDialogContentLine1);
                if (textView != null) {
                    i = R.id.tvDialogTitle;
                    TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvDialogTitle);
                    if (textView2 != null) {
                        i = R.id.vDialogContentContainer;
                        RelativeLayout relativeLayout = (RelativeLayout) ca7.m11819a(view, R.id.vDialogContentContainer);
                        if (relativeLayout != null) {
                            return new qf1((CardView) view, materialButton, materialButton2, textView, textView2, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public CardView mo47098b() {
        return this.f33086a;
    }
}
