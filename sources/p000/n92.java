package p000;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import net.safemoon.androidwallet.R;

/* renamed from: n92 */
/* compiled from: FragmentDefaultDateFormatBinding */
public final class n92 {

    /* renamed from: a */
    public final ConstraintLayout f32010a;

    /* renamed from: b */
    public final MaterialCardView f32011b;

    /* renamed from: c */
    public final b36 f32012c;

    /* renamed from: d */
    public final LinearLayout f32013d;

    public n92(ConstraintLayout constraintLayout, MaterialCardView materialCardView, b36 b36, LinearLayout linearLayout) {
        this.f32010a = constraintLayout;
        this.f32011b = materialCardView;
        this.f32012c = b36;
        this.f32013d = linearLayout;
    }

    /* renamed from: a */
    public static n92 m48701a(View view) {
        int i = R.id.ccWrapperDateFormat;
        MaterialCardView materialCardView = (MaterialCardView) ca7.m11819a(view, R.id.ccWrapperDateFormat);
        if (materialCardView != null) {
            i = R.id.toolbar;
            View a = ca7.m11819a(view, R.id.toolbar);
            if (a != null) {
                b36 a2 = b36.m32346a(a);
                LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view, R.id.wrapperDateFormat);
                if (linearLayout != null) {
                    return new n92((ConstraintLayout) view, materialCardView, a2, linearLayout);
                }
                i = R.id.wrapperDateFormat;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo46044b() {
        return this.f32010a;
    }
}
