package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: cb2 */
/* compiled from: FragmentTransactionNotificationDetailsBinding */
public final class cb2 {

    /* renamed from: a */
    public final ConstraintLayout f21653a;

    /* renamed from: b */
    public final ConstraintLayout f21654b;

    /* renamed from: c */
    public final CardView f21655c;

    /* renamed from: d */
    public final ImageView f21656d;

    /* renamed from: e */
    public final ProgressBar f21657e;

    /* renamed from: f */
    public final TextView f21658f;

    /* renamed from: g */
    public final b36 f21659g;

    /* renamed from: h */
    public final TextView f21660h;

    /* renamed from: i */
    public final TextView f21661i;

    /* renamed from: j */
    public final TextView f21662j;

    /* renamed from: k */
    public final TextView f21663k;

    /* renamed from: l */
    public final TextView f21664l;

    /* renamed from: m */
    public final TextView f21665m;

    /* renamed from: n */
    public final TextView f21666n;

    /* renamed from: o */
    public final MaterialTextView f21667o;

    public cb2(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, CardView cardView, ImageView imageView, ProgressBar progressBar, TextView textView, b36 b36, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, MaterialTextView materialTextView) {
        this.f21653a = constraintLayout;
        this.f21654b = constraintLayout2;
        this.f21655c = cardView;
        this.f21656d = imageView;
        this.f21657e = progressBar;
        this.f21658f = textView;
        this.f21659g = b36;
        this.f21660h = textView2;
        this.f21661i = textView3;
        this.f21662j = textView4;
        this.f21663k = textView5;
        this.f21664l = textView6;
        this.f21665m = textView7;
        this.f21666n = textView8;
        this.f21667o = materialTextView;
    }

    /* renamed from: a */
    public static cb2 m32892a(View view) {
        View view2 = view;
        int i = R.id.cl_l;
        ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view2, R.id.cl_l);
        if (constraintLayout != null) {
            i = R.id.cv_2;
            CardView cardView = (CardView) ca7.m11819a(view2, R.id.cv_2);
            if (cardView != null) {
                i = R.id.imageView2;
                ImageView imageView = (ImageView) ca7.m11819a(view2, R.id.imageView2);
                if (imageView != null) {
                    i = R.id.pbDetails;
                    ProgressBar progressBar = (ProgressBar) ca7.m11819a(view2, R.id.pbDetails);
                    if (progressBar != null) {
                        i = R.id.textView26;
                        TextView textView = (TextView) ca7.m11819a(view2, R.id.textView26);
                        if (textView != null) {
                            i = R.id.toolbar;
                            View a = ca7.m11819a(view2, R.id.toolbar);
                            if (a != null) {
                                b36 a2 = b36.m32346a(a);
                                i = R.id.tv_check;
                                TextView textView2 = (TextView) ca7.m11819a(view2, R.id.tv_check);
                                if (textView2 != null) {
                                    i = R.id.tv_date;
                                    TextView textView3 = (TextView) ca7.m11819a(view2, R.id.tv_date);
                                    if (textView3 != null) {
                                        i = R.id.tv_fee_amount;
                                        TextView textView4 = (TextView) ca7.m11819a(view2, R.id.tv_fee_amount);
                                        if (textView4 != null) {
                                            i = R.id.tv_nw_fee;
                                            TextView textView5 = (TextView) ca7.m11819a(view2, R.id.tv_nw_fee);
                                            if (textView5 != null) {
                                                i = R.id.tv_status;
                                                TextView textView6 = (TextView) ca7.m11819a(view2, R.id.tv_status);
                                                if (textView6 != null) {
                                                    i = R.id.tv_to;
                                                    TextView textView7 = (TextView) ca7.m11819a(view2, R.id.tv_to);
                                                    if (textView7 != null) {
                                                        i = R.id.tv_total;
                                                        TextView textView8 = (TextView) ca7.m11819a(view2, R.id.tv_total);
                                                        if (textView8 != null) {
                                                            i = R.id.tv_trans_status;
                                                            MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.tv_trans_status);
                                                            if (materialTextView != null) {
                                                                return new cb2((ConstraintLayout) view2, constraintLayout, cardView, imageView, progressBar, textView, a2, textView2, textView3, textView4, textView5, textView6, textView7, textView8, materialTextView);
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

    /* renamed from: b */
    public ConstraintLayout mo29913b() {
        return this.f21653a;
    }
}
