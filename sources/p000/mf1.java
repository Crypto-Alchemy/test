package p000;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: mf1 */
/* compiled from: DialogProgressLoadingBinding */
public final class mf1 {

    /* renamed from: a */
    public final ConstraintLayout f31686a;

    /* renamed from: b */
    public final MaterialButton f31687b;

    /* renamed from: c */
    public final MaterialTextView f31688c;

    /* renamed from: d */
    public final MaterialTextView f31689d;

    /* renamed from: e */
    public final ShapeableImageView f31690e;

    public mf1(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialTextView materialTextView, MaterialTextView materialTextView2, ShapeableImageView shapeableImageView) {
        this.f31686a = constraintLayout;
        this.f31687b = materialButton;
        this.f31688c = materialTextView;
        this.f31689d = materialTextView2;
        this.f31690e = shapeableImageView;
    }

    /* renamed from: a */
    public static mf1 m48276a(View view) {
        int i = R.id.dialog_cross;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.dialog_cross);
        if (materialButton != null) {
            i = R.id.dialog_msg;
            MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.dialog_msg);
            if (materialTextView != null) {
                i = R.id.dialog_title;
                MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view, R.id.dialog_title);
                if (materialTextView2 != null) {
                    i = R.id.ivProgressLoading;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) ca7.m11819a(view, R.id.ivProgressLoading);
                    if (shapeableImageView != null) {
                        return new mf1((ConstraintLayout) view, materialButton, materialTextView, materialTextView2, shapeableImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
