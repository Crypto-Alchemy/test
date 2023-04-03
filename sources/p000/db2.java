package p000;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: db2 */
/* compiled from: FragmentTransferHistoryBinding */
public final class db2 {

    /* renamed from: a */
    public final ConstraintLayout f28119a;

    /* renamed from: b */
    public final AppBarLayout f28120b;

    /* renamed from: c */
    public final MaterialButton f28121c;

    /* renamed from: d */
    public final MaterialButton f28122d;

    /* renamed from: e */
    public final MaterialButton f28123e;

    /* renamed from: f */
    public final MaterialButton f28124f;

    /* renamed from: g */
    public final CollapsingToolbarLayout f28125g;

    /* renamed from: h */
    public final ConstraintLayout f28126h;

    /* renamed from: i */
    public final CoordinatorLayout f28127i;

    /* renamed from: j */
    public final AppCompatImageView f28128j;

    /* renamed from: k */
    public final AppCompatImageView f28129k;

    /* renamed from: l */
    public final AppCompatImageView f28130l;

    /* renamed from: m */
    public final AppCompatImageView f28131m;

    /* renamed from: n */
    public final AppCompatImageView f28132n;

    /* renamed from: o */
    public final LinearLayoutCompat f28133o;

    /* renamed from: p */
    public final RecyclerView f28134p;

    /* renamed from: q */
    public final SwipeRefreshLayout f28135q;

    /* renamed from: r */
    public final tr6 f28136r;

    /* renamed from: s */
    public final TextView f28137s;

    /* renamed from: t */
    public final TextView f28138t;

    /* renamed from: u */
    public final TextView f28139u;

    /* renamed from: v */
    public final AppCompatTextView f28140v;

    public db2(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, CollapsingToolbarLayout collapsingToolbarLayout, ConstraintLayout constraintLayout2, CoordinatorLayout coordinatorLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, LinearLayoutCompat linearLayoutCompat, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, tr6 tr6, TextView textView, TextView textView2, TextView textView3, AppCompatTextView appCompatTextView) {
        this.f28119a = constraintLayout;
        this.f28120b = appBarLayout;
        this.f28121c = materialButton;
        this.f28122d = materialButton2;
        this.f28123e = materialButton3;
        this.f28124f = materialButton4;
        this.f28125g = collapsingToolbarLayout;
        this.f28126h = constraintLayout2;
        this.f28127i = coordinatorLayout;
        this.f28128j = appCompatImageView;
        this.f28129k = appCompatImageView2;
        this.f28130l = appCompatImageView3;
        this.f28131m = appCompatImageView4;
        this.f28132n = appCompatImageView5;
        this.f28133o = linearLayoutCompat;
        this.f28134p = recyclerView;
        this.f28135q = swipeRefreshLayout;
        this.f28136r = tr6;
        this.f28137s = textView;
        this.f28138t = textView2;
        this.f28139u = textView3;
        this.f28140v = appCompatTextView;
    }

    /* renamed from: a */
    public static db2 m43435a(View view) {
        View view2 = view;
        int i = R.id.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) ca7.m11819a(view2, R.id.appBar);
        if (appBarLayout != null) {
            i = R.id.btnBuy;
            MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnBuy);
            if (materialButton != null) {
                i = R.id.btnReceive;
                MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view2, R.id.btnReceive);
                if (materialButton2 != null) {
                    i = R.id.btnSend;
                    MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view2, R.id.btnSend);
                    if (materialButton3 != null) {
                        i = R.id.btnSwap;
                        MaterialButton materialButton4 = (MaterialButton) ca7.m11819a(view2, R.id.btnSwap);
                        if (materialButton4 != null) {
                            i = R.id.ccToolBar;
                            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ca7.m11819a(view2, R.id.ccToolBar);
                            if (collapsingToolbarLayout != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                                i = R.id.coordinator;
                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ca7.m11819a(view2, R.id.coordinator);
                                if (coordinatorLayout != null) {
                                    i = R.id.imgCMC;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view2, R.id.imgCMC);
                                    if (appCompatImageView != null) {
                                        i = R.id.imgDexscreener;
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view2, R.id.imgDexscreener);
                                        if (appCompatImageView2 != null) {
                                            i = R.id.imgPriceAlert;
                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) ca7.m11819a(view2, R.id.imgPriceAlert);
                                            if (appCompatImageView3 != null) {
                                                i = R.id.imgSymbol;
                                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) ca7.m11819a(view2, R.id.imgSymbol);
                                                if (appCompatImageView4 != null) {
                                                    i = R.id.imgTransactionHistoryInfo;
                                                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) ca7.m11819a(view2, R.id.imgTransactionHistoryInfo);
                                                    if (appCompatImageView5 != null) {
                                                        i = R.id.lButtonsContainer;
                                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view2, R.id.lButtonsContainer);
                                                        if (linearLayoutCompat != null) {
                                                            i = R.id.rv_trans;
                                                            RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view2, R.id.rv_trans);
                                                            if (recyclerView != null) {
                                                                i = R.id.rvTransGroup;
                                                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ca7.m11819a(view2, R.id.rvTransGroup);
                                                                if (swipeRefreshLayout != null) {
                                                                    i = R.id.toolbar;
                                                                    View a = ca7.m11819a(view2, R.id.toolbar);
                                                                    if (a != null) {
                                                                        tr6 a2 = tr6.m52423a(a);
                                                                        i = R.id.tvChainWallet;
                                                                        TextView textView = (TextView) ca7.m11819a(view2, R.id.tvChainWallet);
                                                                        if (textView != null) {
                                                                            i = R.id.tvFiatBalance;
                                                                            TextView textView2 = (TextView) ca7.m11819a(view2, R.id.tvFiatBalance);
                                                                            if (textView2 != null) {
                                                                                i = R.id.tv_not;
                                                                                TextView textView3 = (TextView) ca7.m11819a(view2, R.id.tv_not);
                                                                                if (textView3 != null) {
                                                                                    i = R.id.tvWalletBlnc;
                                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view2, R.id.tvWalletBlnc);
                                                                                    if (appCompatTextView != null) {
                                                                                        return new db2(constraintLayout, appBarLayout, materialButton, materialButton2, materialButton3, materialButton4, collapsingToolbarLayout, constraintLayout, coordinatorLayout, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, linearLayoutCompat, recyclerView, swipeRefreshLayout, a2, textView, textView2, textView3, appCompatTextView);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo41886b() {
        return this.f28119a;
    }
}
