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

/* renamed from: ja2 */
/* compiled from: FragmentReceiveBinding */
public final class ja2 {

    /* renamed from: a */
    public final ClipRelativeLayout f30275a;

    /* renamed from: b */
    public final AppBarLayout f30276b;

    /* renamed from: c */
    public final CollapsingToolbarLayout f30277c;

    /* renamed from: d */
    public final ImageView f30278d;

    /* renamed from: e */
    public final ConstraintLayout f30279e;

    /* renamed from: f */
    public final ClipRecyclerView f30280f;

    /* renamed from: g */
    public final ConstraintLayout f30281g;

    /* renamed from: h */
    public final TextView f30282h;

    /* renamed from: i */
    public final TextView f30283i;

    /* renamed from: j */
    public final TextView f30284j;

    /* renamed from: k */
    public final TextView f30285k;

    public ja2(ClipRelativeLayout clipRelativeLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ImageView imageView, ConstraintLayout constraintLayout, ClipRecyclerView clipRecyclerView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f30275a = clipRelativeLayout;
        this.f30276b = appBarLayout;
        this.f30277c = collapsingToolbarLayout;
        this.f30278d = imageView;
        this.f30279e = constraintLayout;
        this.f30280f = clipRecyclerView;
        this.f30281g = constraintLayout2;
        this.f30282h = textView;
        this.f30283i = textView2;
        this.f30284j = textView3;
        this.f30285k = textView4;
    }

    /* renamed from: a */
    public static ja2 m46186a(View view) {
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
                                                return new ja2((ClipRelativeLayout) view, appBarLayout, collapsingToolbarLayout, imageView, constraintLayout, clipRecyclerView, constraintLayout2, textView, textView2, textView3, textView4);
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
