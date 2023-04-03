package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import net.safemoon.androidwallet.R;

/* renamed from: d92 */
/* compiled from: FragmentAlltokensListBinding */
public final class d92 {

    /* renamed from: a */
    public final LinearLayout f28051a;

    /* renamed from: b */
    public final TextView f28052b;

    /* renamed from: c */
    public final TextView f28053c;

    /* renamed from: d */
    public final TextView f28054d;

    /* renamed from: e */
    public final TextView f28055e;

    /* renamed from: f */
    public final TextView f28056f;

    /* renamed from: g */
    public final TextView f28057g;

    /* renamed from: h */
    public final RecyclerView f28058h;

    /* renamed from: i */
    public final vn5 f28059i;

    /* renamed from: j */
    public final SwipeRefreshLayout f28060j;

    /* renamed from: k */
    public final LinearLayout f28061k;

    /* renamed from: l */
    public final C5872go f28062l;

    /* renamed from: m */
    public final TextView f28063m;

    /* renamed from: n */
    public final TextView f28064n;

    public d92(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, RecyclerView recyclerView, vn5 vn5, SwipeRefreshLayout swipeRefreshLayout, LinearLayout linearLayout2, C5872go goVar, TextView textView7, TextView textView8) {
        this.f28051a = linearLayout;
        this.f28052b = textView;
        this.f28053c = textView2;
        this.f28054d = textView3;
        this.f28055e = textView4;
        this.f28056f = textView5;
        this.f28057g = textView6;
        this.f28058h = recyclerView;
        this.f28059i = vn5;
        this.f28060j = swipeRefreshLayout;
        this.f28061k = linearLayout2;
        this.f28062l = goVar;
        this.f28063m = textView7;
        this.f28064n = textView8;
    }

    /* renamed from: a */
    public static d92 m43412a(View view) {
        View view2 = view;
        int i = R.id.btn1h;
        TextView textView = (TextView) ca7.m11819a(view2, R.id.btn1h);
        if (textView != null) {
            i = R.id.btn24h;
            TextView textView2 = (TextView) ca7.m11819a(view2, R.id.btn24h);
            if (textView2 != null) {
                i = R.id.btn7d;
                TextView textView3 = (TextView) ca7.m11819a(view2, R.id.btn7d);
                if (textView3 != null) {
                    i = R.id.btnRecent;
                    TextView textView4 = (TextView) ca7.m11819a(view2, R.id.btnRecent);
                    if (textView4 != null) {
                        i = R.id.btnTopGainers;
                        TextView textView5 = (TextView) ca7.m11819a(view2, R.id.btnTopGainers);
                        if (textView5 != null) {
                            i = R.id.btnTopLosers;
                            TextView textView6 = (TextView) ca7.m11819a(view2, R.id.btnTopLosers);
                            if (textView6 != null) {
                                i = R.id.rView;
                                RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view2, R.id.rView);
                                if (recyclerView != null) {
                                    i = R.id.searchBar;
                                    View a = ca7.m11819a(view2, R.id.searchBar);
                                    if (a != null) {
                                        vn5 a2 = vn5.m53437a(a);
                                        i = R.id.swRefresh;
                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ca7.m11819a(view2, R.id.swRefresh);
                                        if (swipeRefreshLayout != null) {
                                            i = R.id.timesSelectLayout;
                                            LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view2, R.id.timesSelectLayout);
                                            if (linearLayout != null) {
                                                i = R.id.topBar;
                                                View a3 = ca7.m11819a(view2, R.id.topBar);
                                                if (a3 != null) {
                                                    C5872go a4 = C5872go.m44795a(a3);
                                                    i = R.id.tvNoDataMsg;
                                                    TextView textView7 = (TextView) ca7.m11819a(view2, R.id.tvNoDataMsg);
                                                    if (textView7 != null) {
                                                        i = R.id.tv_title;
                                                        TextView textView8 = (TextView) ca7.m11819a(view2, R.id.tv_title);
                                                        if (textView8 != null) {
                                                            return new d92((LinearLayout) view2, textView, textView2, textView3, textView4, textView5, textView6, recyclerView, a2, swipeRefreshLayout, linearLayout, a4, textView7, textView8);
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
