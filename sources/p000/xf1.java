package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: xf1 */
/* compiled from: DialogSwapTransactionBinding */
public final class xf1 {

    /* renamed from: a */
    public final CardView f35615a;

    /* renamed from: b */
    public final TextView f35616b;

    /* renamed from: c */
    public final MaterialButton f35617c;

    /* renamed from: d */
    public final MaterialButton f35618d;

    /* renamed from: e */
    public final ImageView f35619e;

    /* renamed from: f */
    public final ConstraintLayout f35620f;

    /* renamed from: g */
    public final TextView f35621g;

    /* renamed from: h */
    public final TextView f35622h;

    /* renamed from: i */
    public final RelativeLayout f35623i;

    public xf1(CardView cardView, TextView textView, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, RelativeLayout relativeLayout) {
        this.f35615a = cardView;
        this.f35616b = textView;
        this.f35617c = materialButton;
        this.f35618d = materialButton2;
        this.f35619e = imageView;
        this.f35620f = constraintLayout;
        this.f35621g = textView2;
        this.f35622h = textView3;
        this.f35623i = relativeLayout;
    }

    /* renamed from: a */
    public static xf1 m54385a(View view) {
        int i = R.id.btnCopy;
        TextView textView = (TextView) ca7.m11819a(view, R.id.btnCopy);
        if (textView != null) {
            i = R.id.btnTransaction;
            MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnTransaction);
            if (materialButton != null) {
                i = R.id.dialog_cross;
                MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.dialog_cross);
                if (materialButton2 != null) {
                    i = R.id.imgAlert;
                    ImageView imageView = (ImageView) ca7.m11819a(view, R.id.imgAlert);
                    if (imageView != null) {
                        i = R.id.parentAlert;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view, R.id.parentAlert);
                        if (constraintLayout != null) {
                            i = R.id.tvDialogContent;
                            TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvDialogContent);
                            if (textView2 != null) {
                                i = R.id.tvDialogTitle;
                                TextView textView3 = (TextView) ca7.m11819a(view, R.id.tvDialogTitle);
                                if (textView3 != null) {
                                    i = R.id.vDialogContentContainer;
                                    RelativeLayout relativeLayout = (RelativeLayout) ca7.m11819a(view, R.id.vDialogContentContainer);
                                    if (relativeLayout != null) {
                                        return new xf1((CardView) view, textView, materialButton, materialButton2, imageView, constraintLayout, textView2, textView3, relativeLayout);
                                    }
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
    public CardView mo49475b() {
        return this.f35615a;
    }
}
