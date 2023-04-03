package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: pe1 */
/* compiled from: DialogAcknowledgmentWarningBinding */
public final class pe1 {

    /* renamed from: a */
    public final CardView f32664a;

    /* renamed from: b */
    public final MaterialButton f32665b;

    /* renamed from: c */
    public final MaterialButton f32666c;

    /* renamed from: d */
    public final TextView f32667d;

    /* renamed from: e */
    public final TextView f32668e;

    /* renamed from: f */
    public final TextView f32669f;

    /* renamed from: g */
    public final TextView f32670g;

    /* renamed from: h */
    public final LinearLayout f32671h;

    public pe1(CardView cardView, MaterialButton materialButton, MaterialButton materialButton2, TextView textView, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout) {
        this.f32664a = cardView;
        this.f32665b = materialButton;
        this.f32666c = materialButton2;
        this.f32667d = textView;
        this.f32668e = textView2;
        this.f32669f = textView3;
        this.f32670g = textView4;
        this.f32671h = linearLayout;
    }

    /* renamed from: a */
    public static pe1 m49884a(View view) {
        int i = R.id.btnAction;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnAction);
        if (materialButton != null) {
            i = R.id.dialog_cross;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.dialog_cross);
            if (materialButton2 != null) {
                i = R.id.tvDialogContentLine1;
                TextView textView = (TextView) ca7.m11819a(view, R.id.tvDialogContentLine1);
                if (textView != null) {
                    i = R.id.tvDialogContentLine2;
                    TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvDialogContentLine2);
                    if (textView2 != null) {
                        i = R.id.tvDialogContentLine3;
                        TextView textView3 = (TextView) ca7.m11819a(view, R.id.tvDialogContentLine3);
                        if (textView3 != null) {
                            i = R.id.tvDialogTitle;
                            TextView textView4 = (TextView) ca7.m11819a(view, R.id.tvDialogTitle);
                            if (textView4 != null) {
                                i = R.id.vDialogContentContainer;
                                LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view, R.id.vDialogContentContainer);
                                if (linearLayout != null) {
                                    return new pe1((CardView) view, materialButton, materialButton2, textView, textView2, textView3, textView4, linearLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public CardView mo46710b() {
        return this.f32664a;
    }
}
