package p000;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: cf3 */
/* compiled from: LayoutSelectTokenTypeBinding */
public final class cf3 {

    /* renamed from: a */
    public final ConstraintLayout f21726a;

    /* renamed from: b */
    public final MaterialButton f21727b;

    /* renamed from: c */
    public final ConstraintLayout f21728c;

    /* renamed from: d */
    public final ImageView f21729d;

    /* renamed from: e */
    public final ImageView f21730e;

    /* renamed from: f */
    public final MaterialTextView f21731f;

    public cf3(ConstraintLayout constraintLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, MaterialTextView materialTextView) {
        this.f21726a = constraintLayout;
        this.f21727b = materialButton;
        this.f21728c = constraintLayout2;
        this.f21729d = imageView;
        this.f21730e = imageView2;
        this.f21731f = materialTextView;
    }

    /* renamed from: a */
    public static cf3 m32978a(View view) {
        int i = R.id.bnbSelectedTypeName;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.bnbSelectedTypeName);
        if (materialButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.dropDownIcon;
            ImageView imageView = (ImageView) ca7.m11819a(view, R.id.dropDownIcon);
            if (imageView != null) {
                i = R.id.iconChainImage;
                ImageView imageView2 = (ImageView) ca7.m11819a(view, R.id.iconChainImage);
                if (imageView2 != null) {
                    i = R.id.text;
                    MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view, R.id.text);
                    if (materialTextView != null) {
                        return new cf3(constraintLayout, materialButton, constraintLayout, imageView, imageView2, materialTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
