package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import net.safemoon.androidwallet.R;

/* renamed from: sa2 */
/* compiled from: FragmentSendingBinding */
public final class sa2 {

    /* renamed from: a */
    public final FrameLayout f33805a;

    /* renamed from: b */
    public final MaterialButton f33806b;

    /* renamed from: c */
    public final FrameLayout f33807c;

    /* renamed from: d */
    public final FrameLayout f33808d;

    /* renamed from: e */
    public final ImageView f33809e;

    /* renamed from: f */
    public final ImageView f33810f;

    /* renamed from: g */
    public final MaterialCardView f33811g;

    /* renamed from: h */
    public final ConstraintLayout f33812h;

    /* renamed from: i */
    public final ConstraintLayout f33813i;

    /* renamed from: j */
    public final ProgressBar f33814j;

    /* renamed from: k */
    public final TextView f33815k;

    /* renamed from: l */
    public final TextView f33816l;

    /* renamed from: m */
    public final TextView f33817m;

    /* renamed from: n */
    public final TextView f33818n;

    /* renamed from: o */
    public final TextView f33819o;

    /* renamed from: p */
    public final View f33820p;

    public sa2(FrameLayout frameLayout, MaterialButton materialButton, FrameLayout frameLayout2, FrameLayout frameLayout3, ImageView imageView, ImageView imageView2, MaterialCardView materialCardView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view) {
        this.f33805a = frameLayout;
        this.f33806b = materialButton;
        this.f33807c = frameLayout2;
        this.f33808d = frameLayout3;
        this.f33809e = imageView;
        this.f33810f = imageView2;
        this.f33811g = materialCardView;
        this.f33812h = constraintLayout;
        this.f33813i = constraintLayout2;
        this.f33814j = progressBar;
        this.f33815k = textView;
        this.f33816l = textView2;
        this.f33817m = textView3;
        this.f33818n = textView4;
        this.f33819o = textView5;
        this.f33820p = view;
    }

    /* renamed from: a */
    public static sa2 m51633a(View view) {
        View view2 = view;
        int i = R.id.btnSendNew;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnSendNew);
        if (materialButton != null) {
            i = R.id.btnSendParent;
            FrameLayout frameLayout = (FrameLayout) ca7.m11819a(view2, R.id.btnSendParent);
            if (frameLayout != null) {
                FrameLayout frameLayout2 = (FrameLayout) view2;
                i = R.id.iv_back;
                ImageView imageView = (ImageView) ca7.m11819a(view2, R.id.iv_back);
                if (imageView != null) {
                    i = R.id.ivContactIcon;
                    ImageView imageView2 = (ImageView) ca7.m11819a(view2, R.id.ivContactIcon);
                    if (imageView2 != null) {
                        i = R.id.ivContactIconContainer;
                        MaterialCardView materialCardView = (MaterialCardView) ca7.m11819a(view2, R.id.ivContactIconContainer);
                        if (materialCardView != null) {
                            i = R.id.lWalletBalance;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view2, R.id.lWalletBalance);
                            if (constraintLayout != null) {
                                i = R.id.llItemContactCarouselContainer;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ca7.m11819a(view2, R.id.llItemContactCarouselContainer);
                                if (constraintLayout2 != null) {
                                    i = R.id.progressBar;
                                    ProgressBar progressBar = (ProgressBar) ca7.m11819a(view2, R.id.progressBar);
                                    if (progressBar != null) {
                                        i = R.id.tvAddress;
                                        TextView textView = (TextView) ca7.m11819a(view2, R.id.tvAddress);
                                        if (textView != null) {
                                            i = R.id.tvBalance;
                                            TextView textView2 = (TextView) ca7.m11819a(view2, R.id.tvBalance);
                                            if (textView2 != null) {
                                                i = R.id.tvBalanceInFiat;
                                                TextView textView3 = (TextView) ca7.m11819a(view2, R.id.tvBalanceInFiat);
                                                if (textView3 != null) {
                                                    i = R.id.tvContactText;
                                                    TextView textView4 = (TextView) ca7.m11819a(view2, R.id.tvContactText);
                                                    if (textView4 != null) {
                                                        i = R.id.tvGasPrice;
                                                        TextView textView5 = (TextView) ca7.m11819a(view2, R.id.tvGasPrice);
                                                        if (textView5 != null) {
                                                            i = R.id.viewFakeEnd;
                                                            View a = ca7.m11819a(view2, R.id.viewFakeEnd);
                                                            if (a != null) {
                                                                return new sa2(frameLayout2, materialButton, frameLayout, frameLayout2, imageView, imageView2, materialCardView, constraintLayout, constraintLayout2, progressBar, textView, textView2, textView3, textView4, textView5, a);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
