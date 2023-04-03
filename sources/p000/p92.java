package p000;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import net.safemoon.androidwallet.R;

/* renamed from: p92 */
/* compiled from: FragmentDefaultScreenBinding */
public final class p92 {

    /* renamed from: a */
    public final ConstraintLayout f32609a;

    /* renamed from: b */
    public final MaterialCardView f32610b;

    /* renamed from: c */
    public final b36 f32611c;

    /* renamed from: d */
    public final LinearLayout f32612d;

    public p92(ConstraintLayout constraintLayout, MaterialCardView materialCardView, b36 b36, LinearLayout linearLayout) {
        this.f32609a = constraintLayout;
        this.f32610b = materialCardView;
        this.f32611c = b36;
        this.f32612d = linearLayout;
    }

    /* renamed from: a */
    public static p92 m49831a(View view) {
        int i = R.id.ccWrapperScreen;
        MaterialCardView materialCardView = (MaterialCardView) ca7.m11819a(view, R.id.ccWrapperScreen);
        if (materialCardView != null) {
            i = R.id.toolbar;
            View a = ca7.m11819a(view, R.id.toolbar);
            if (a != null) {
                b36 a2 = b36.m32346a(a);
                LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view, R.id.wrapperScreen);
                if (linearLayout != null) {
                    return new p92((ConstraintLayout) view, materialCardView, a2, linearLayout);
                }
                i = R.id.wrapperScreen;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo46669b() {
        return this.f32609a;
    }
}
