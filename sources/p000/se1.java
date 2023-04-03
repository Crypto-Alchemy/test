package p000;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import net.safemoon.androidwallet.R;

/* renamed from: se1 */
/* compiled from: DialogAlertOneButtonBinding */
public final class se1 {

    /* renamed from: a */
    public final CardView f33831a;

    /* renamed from: b */
    public final MaterialButton f33832b;

    /* renamed from: c */
    public final MaterialCheckBox f33833c;

    /* renamed from: d */
    public final MaterialButton f33834d;

    /* renamed from: e */
    public final TextView f33835e;

    /* renamed from: f */
    public final TextView f33836f;

    /* renamed from: g */
    public final RelativeLayout f33837g;

    public se1(CardView cardView, MaterialButton materialButton, MaterialCheckBox materialCheckBox, MaterialButton materialButton2, TextView textView, TextView textView2, RelativeLayout relativeLayout) {
        this.f33831a = cardView;
        this.f33832b = materialButton;
        this.f33833c = materialCheckBox;
        this.f33834d = materialButton2;
        this.f33835e = textView;
        this.f33836f = textView2;
        this.f33837g = relativeLayout;
    }

    /* renamed from: a */
    public static se1 m51726a(View view) {
        int i = R.id.btnAction;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnAction);
        if (materialButton != null) {
            i = R.id.chkDontShowMe;
            MaterialCheckBox materialCheckBox = (MaterialCheckBox) ca7.m11819a(view, R.id.chkDontShowMe);
            if (materialCheckBox != null) {
                i = R.id.dialog_cross;
                MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.dialog_cross);
                if (materialButton2 != null) {
                    i = R.id.tvDialogContent;
                    TextView textView = (TextView) ca7.m11819a(view, R.id.tvDialogContent);
                    if (textView != null) {
                        i = R.id.tvDialogTitle;
                        TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvDialogTitle);
                        if (textView2 != null) {
                            i = R.id.vDialogContentContainer;
                            RelativeLayout relativeLayout = (RelativeLayout) ca7.m11819a(view, R.id.vDialogContentContainer);
                            if (relativeLayout != null) {
                                return new se1((CardView) view, materialButton, materialCheckBox, materialButton2, textView, textView2, relativeLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public CardView mo47745b() {
        return this.f33831a;
    }
}
