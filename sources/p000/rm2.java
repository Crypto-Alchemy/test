package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: rm2 */
/* compiled from: HolderTokenListBinding */
public final class rm2 {

    /* renamed from: a */
    public final ConstraintLayout f33537a;

    /* renamed from: b */
    public final MaterialButton f33538b;

    /* renamed from: c */
    public final ImageView f33539c;

    /* renamed from: d */
    public final ImageView f33540d;

    /* renamed from: e */
    public final ConstraintLayout f33541e;

    /* renamed from: f */
    public final ConstraintLayout f33542f;

    /* renamed from: g */
    public final TextView f33543g;

    /* renamed from: h */
    public final TextView f33544h;

    /* renamed from: i */
    public final TextView f33545i;

    /* renamed from: j */
    public final TextView f33546j;

    /* renamed from: k */
    public final TextView f33547k;

    /* renamed from: l */
    public final View f33548l;

    /* renamed from: m */
    public final LinearLayout f33549m;

    public rm2(ConstraintLayout constraintLayout, MaterialButton materialButton, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view, LinearLayout linearLayout) {
        this.f33537a = constraintLayout;
        this.f33538b = materialButton;
        this.f33539c = imageView;
        this.f33540d = imageView2;
        this.f33541e = constraintLayout2;
        this.f33542f = constraintLayout3;
        this.f33543g = textView;
        this.f33544h = textView2;
        this.f33545i = textView3;
        this.f33546j = textView4;
        this.f33547k = textView5;
        this.f33548l = view;
        this.f33549m = linearLayout;
    }

    /* renamed from: a */
    public static rm2 m51158a(View view) {
        View view2 = view;
        int i = R.id.btnDelete;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnDelete);
        if (materialButton != null) {
            i = R.id.ivPercentageDirection;
            ImageView imageView = (ImageView) ca7.m11819a(view2, R.id.ivPercentageDirection);
            if (imageView != null) {
                i = R.id.ivTokenIcon;
                ImageView imageView2 = (ImageView) ca7.m11819a(view2, R.id.ivTokenIcon);
                if (imageView2 != null) {
                    i = R.id.rowBG;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view2, R.id.rowBG);
                    if (constraintLayout != null) {
                        i = R.id.rowFG;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ca7.m11819a(view2, R.id.rowFG);
                        if (constraintLayout2 != null) {
                            i = R.id.tvTokenBalance;
                            TextView textView = (TextView) ca7.m11819a(view2, R.id.tvTokenBalance);
                            if (textView != null) {
                                i = R.id.tvTokenName;
                                TextView textView2 = (TextView) ca7.m11819a(view2, R.id.tvTokenName);
                                if (textView2 != null) {
                                    i = R.id.tvTokenNativeBalance;
                                    TextView textView3 = (TextView) ca7.m11819a(view2, R.id.tvTokenNativeBalance);
                                    if (textView3 != null) {
                                        i = R.id.tvTokenPercent;
                                        TextView textView4 = (TextView) ca7.m11819a(view2, R.id.tvTokenPercent);
                                        if (textView4 != null) {
                                            i = R.id.tvTokenSymbol;
                                            TextView textView5 = (TextView) ca7.m11819a(view2, R.id.tvTokenSymbol);
                                            if (textView5 != null) {
                                                i = R.id.vDivider;
                                                View a = ca7.m11819a(view2, R.id.vDivider);
                                                if (a != null) {
                                                    i = R.id.vTokenNameContainer;
                                                    LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view2, R.id.vTokenNameContainer);
                                                    if (linearLayout != null) {
                                                        return new rm2((ConstraintLayout) view2, materialButton, imageView, imageView2, constraintLayout, constraintLayout2, textView, textView2, textView3, textView4, textView5, a, linearLayout);
                                                    }
                                                }
                                            }
                                        }
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
    public ConstraintLayout mo47434b() {
        return this.f33537a;
    }
}
