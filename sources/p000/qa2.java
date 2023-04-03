package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.views.ClipRecyclerView;
import net.safemoon.androidwallet.views.ClipRelativeLayout;

/* renamed from: qa2 */
/* compiled from: FragmentSendBinding */
public final class qa2 {

    /* renamed from: a */
    public final ClipRelativeLayout f33027a;

    /* renamed from: b */
    public final AppBarLayout f33028b;

    /* renamed from: c */
    public final CollapsingToolbarLayout f33029c;

    /* renamed from: d */
    public final ImageView f33030d;

    /* renamed from: e */
    public final ConstraintLayout f33031e;

    /* renamed from: f */
    public final ClipRecyclerView f33032f;

    /* renamed from: g */
    public final ConstraintLayout f33033g;

    /* renamed from: h */
    public final TextView f33034h;

    /* renamed from: i */
    public final TextView f33035i;

    /* renamed from: j */
    public final TextView f33036j;

    /* renamed from: k */
    public final TextView f33037k;

    public qa2(ClipRelativeLayout clipRelativeLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ImageView imageView, ConstraintLayout constraintLayout, ClipRecyclerView clipRecyclerView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f33027a = clipRelativeLayout;
        this.f33028b = appBarLayout;
        this.f33029c = collapsingToolbarLayout;
        this.f33030d = imageView;
        this.f33031e = constraintLayout;
        this.f33032f = clipRecyclerView;
        this.f33033g = constraintLayout2;
        this.f33034h = textView;
        this.f33035i = textView2;
        this.f33036j = textView3;
        this.f33037k = textView4;
    }

    /* renamed from: a */
    public static qa2 m50489a(View view) {
        int i = R.id.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) ca7.m11819a(view, R.id.appBar);
        if (appBarLayout != null) {
            i = R.id.ccToolBar;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ca7.m11819a(view, R.id.ccToolBar);
            if (collapsingToolbarLayout != null) {
                i = R.id.iv_back;
                ImageView imageView = (ImageView) ca7.m11819a(view, R.id.iv_back);
                if (imageView != null) {
                    i = R.id.lWalletBalance;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view, R.id.lWalletBalance);
                    if (constraintLayout != null) {
                        i = R.id.rvMyTokenList;
                        ClipRecyclerView clipRecyclerView = (ClipRecyclerView) ca7.m11819a(view, R.id.rvMyTokenList);
                        if (clipRecyclerView != null) {
                            i = R.id.topBar;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ca7.m11819a(view, R.id.topBar);
                            if (constraintLayout2 != null) {
                                i = R.id.tvMainWallet;
                                TextView textView = (TextView) ca7.m11819a(view, R.id.tvMainWallet);
                                if (textView != null) {
                                    i = R.id.tvSend;
                                    TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvSend);
                                    if (textView2 != null) {
                                        i = R.id.tvWalletBlnc;
                                        TextView textView3 = (TextView) ca7.m11819a(view, R.id.tvWalletBlnc);
                                        if (textView3 != null) {
                                            i = R.id.txtSymbol;
                                            TextView textView4 = (TextView) ca7.m11819a(view, R.id.txtSymbol);
                                            if (textView4 != null) {
                                                return new qa2((ClipRelativeLayout) view, appBarLayout, collapsingToolbarLayout, imageView, constraintLayout, clipRecyclerView, constraintLayout2, textView, textView2, textView3, textView4);
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
