package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import net.safemoon.androidwallet.R;

/* renamed from: kb2 */
/* compiled from: FragmentWalletBinding */
public final class kb2 {

    /* renamed from: a */
    public final ConstraintLayout f30780a;

    /* renamed from: b */
    public final ConstraintLayout f30781b;

    /* renamed from: c */
    public final FrameLayout f30782c;

    /* renamed from: d */
    public final C5872go f30783d;

    /* renamed from: e */
    public final dj7 f30784e;

    /* renamed from: f */
    public final LinearLayout f30785f;

    /* renamed from: g */
    public final LinearLayout f30786g;

    /* renamed from: h */
    public final RecyclerView f30787h;

    /* renamed from: i */
    public final RecyclerView f30788i;

    /* renamed from: j */
    public final SwipeRefreshLayout f30789j;

    /* renamed from: k */
    public final TextView f30790k;

    /* renamed from: l */
    public final TextView f30791l;

    /* renamed from: m */
    public final TextView f30792m;

    /* renamed from: n */
    public final TextView f30793n;

    /* renamed from: o */
    public final TextView f30794o;

    public kb2(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, C5872go goVar, dj7 dj7, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, SwipeRefreshLayout swipeRefreshLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f30780a = constraintLayout;
        this.f30781b = constraintLayout2;
        this.f30782c = frameLayout;
        this.f30783d = goVar;
        this.f30784e = dj7;
        this.f30785f = linearLayout;
        this.f30786g = linearLayout2;
        this.f30787h = recyclerView;
        this.f30788i = recyclerView2;
        this.f30789j = swipeRefreshLayout;
        this.f30790k = textView;
        this.f30791l = textView2;
        this.f30792m = textView3;
        this.f30793n = textView4;
        this.f30794o = textView5;
    }

    /* renamed from: a */
    public static kb2 m46947a(View view) {
        View view2 = view;
        ConstraintLayout constraintLayout = (ConstraintLayout) view2;
        int i = R.id.headerContainer;
        FrameLayout frameLayout = (FrameLayout) ca7.m11819a(view2, R.id.headerContainer);
        if (frameLayout != null) {
            i = R.id.lHeader;
            View a = ca7.m11819a(view2, R.id.lHeader);
            if (a != null) {
                C5872go a2 = C5872go.m44795a(a);
                i = R.id.lMain;
                View a3 = ca7.m11819a(view2, R.id.lMain);
                if (a3 != null) {
                    dj7 a4 = dj7.m43493a(a3);
                    i = R.id.llGainersHeader;
                    LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view2, R.id.llGainersHeader);
                    if (linearLayout != null) {
                        i = R.id.llMyTokensHeader;
                        LinearLayout linearLayout2 = (LinearLayout) ca7.m11819a(view2, R.id.llMyTokensHeader);
                        if (linearLayout2 != null) {
                            i = R.id.rvLatest;
                            RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view2, R.id.rvLatest);
                            if (recyclerView != null) {
                                i = R.id.rvYourTokens;
                                RecyclerView recyclerView2 = (RecyclerView) ca7.m11819a(view2, R.id.rvYourTokens);
                                if (recyclerView2 != null) {
                                    i = R.id.swipeRefreshLayout;
                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ca7.m11819a(view2, R.id.swipeRefreshLayout);
                                    if (swipeRefreshLayout != null) {
                                        i = R.id.tvBased;
                                        TextView textView = (TextView) ca7.m11819a(view2, R.id.tvBased);
                                        if (textView != null) {
                                            i = R.id.tvGainer;
                                            TextView textView2 = (TextView) ca7.m11819a(view2, R.id.tvGainer);
                                            if (textView2 != null) {
                                                i = R.id.tvSeeAll;
                                                TextView textView3 = (TextView) ca7.m11819a(view2, R.id.tvSeeAll);
                                                if (textView3 != null) {
                                                    i = R.id.tvSeeAllTokens;
                                                    TextView textView4 = (TextView) ca7.m11819a(view2, R.id.tvSeeAllTokens);
                                                    if (textView4 != null) {
                                                        i = R.id.tvYourTokens;
                                                        TextView textView5 = (TextView) ca7.m11819a(view2, R.id.tvYourTokens);
                                                        if (textView5 != null) {
                                                            return new kb2(constraintLayout, constraintLayout, frameLayout, a2, a4, linearLayout, linearLayout2, recyclerView, recyclerView2, swipeRefreshLayout, textView, textView2, textView3, textView4, textView5);
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
