package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: bb2 */
/* compiled from: FragmentTokenslistBinding */
public final class bb2 {

    /* renamed from: a */
    public final ConstraintLayout f21218a;

    /* renamed from: b */
    public final AppBarLayout f21219b;

    /* renamed from: c */
    public final MaterialButton f21220c;

    /* renamed from: d */
    public final MaterialButton f21221d;

    /* renamed from: e */
    public final CollapsingToolbarLayout f21222e;

    /* renamed from: f */
    public final CoordinatorLayout f21223f;

    /* renamed from: g */
    public final LinearLayout f21224g;

    /* renamed from: h */
    public final cf3 f21225h;

    /* renamed from: i */
    public final RecyclerView f21226i;

    /* renamed from: j */
    public final SwipeRefreshLayout f21227j;

    /* renamed from: k */
    public final C5872go f21228k;

    /* renamed from: l */
    public final TextView f21229l;

    /* renamed from: m */
    public final TextView f21230m;

    /* renamed from: n */
    public final TextView f21231n;

    /* renamed from: o */
    public final TextView f21232o;

    public bb2(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, MaterialButton materialButton, MaterialButton materialButton2, CollapsingToolbarLayout collapsingToolbarLayout, CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, cf3 cf3, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, C5872go goVar, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f21218a = constraintLayout;
        this.f21219b = appBarLayout;
        this.f21220c = materialButton;
        this.f21221d = materialButton2;
        this.f21222e = collapsingToolbarLayout;
        this.f21223f = coordinatorLayout;
        this.f21224g = linearLayout;
        this.f21225h = cf3;
        this.f21226i = recyclerView;
        this.f21227j = swipeRefreshLayout;
        this.f21228k = goVar;
        this.f21229l = textView;
        this.f21230m = textView2;
        this.f21231n = textView3;
        this.f21232o = textView4;
    }

    /* renamed from: a */
    public static bb2 m32454a(View view) {
        View view2 = view;
        int i = R.id.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) ca7.m11819a(view2, R.id.appBar);
        if (appBarLayout != null) {
            i = R.id.btnReceive;
            MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnReceive);
            if (materialButton != null) {
                i = R.id.btnSend;
                MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view2, R.id.btnSend);
                if (materialButton2 != null) {
                    i = R.id.ccToolBar;
                    CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ca7.m11819a(view2, R.id.ccToolBar);
                    if (collapsingToolbarLayout != null) {
                        i = R.id.coordinator;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ca7.m11819a(view2, R.id.coordinator);
                        if (coordinatorLayout != null) {
                            i = R.id.lButtonsContainer;
                            LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view2, R.id.lButtonsContainer);
                            if (linearLayout != null) {
                                i = R.id.lSelectTokenType;
                                View a = ca7.m11819a(view2, R.id.lSelectTokenType);
                                if (a != null) {
                                    cf3 a2 = cf3.m32978a(a);
                                    i = R.id.rvMyTokenList;
                                    RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view2, R.id.rvMyTokenList);
                                    if (recyclerView != null) {
                                        i = R.id.swipeRefreshLayout;
                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ca7.m11819a(view2, R.id.swipeRefreshLayout);
                                        if (swipeRefreshLayout != null) {
                                            i = R.id.topBar;
                                            View a3 = ca7.m11819a(view2, R.id.topBar);
                                            if (a3 != null) {
                                                C5872go a4 = C5872go.m44795a(a3);
                                                i = R.id.tvMainWallet;
                                                TextView textView = (TextView) ca7.m11819a(view2, R.id.tvMainWallet);
                                                if (textView != null) {
                                                    i = R.id.tvTitle;
                                                    TextView textView2 = (TextView) ca7.m11819a(view2, R.id.tvTitle);
                                                    if (textView2 != null) {
                                                        i = R.id.tvWalletBlnc;
                                                        TextView textView3 = (TextView) ca7.m11819a(view2, R.id.tvWalletBlnc);
                                                        if (textView3 != null) {
                                                            i = R.id.txtSymbol;
                                                            TextView textView4 = (TextView) ca7.m11819a(view2, R.id.txtSymbol);
                                                            if (textView4 != null) {
                                                                return new bb2((ConstraintLayout) view2, appBarLayout, materialButton, materialButton2, collapsingToolbarLayout, coordinatorLayout, linearLayout, a2, recyclerView, swipeRefreshLayout, a4, textView, textView2, textView3, textView4);
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
    public ConstraintLayout mo29517b() {
        return this.f21218a;
    }
}
