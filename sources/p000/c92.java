package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import net.safemoon.androidwallet.R;

/* renamed from: c92 */
/* compiled from: FragmentAddNewTokenBinding */
public final class c92 {

    /* renamed from: a */
    public final ConstraintLayout f21628a;

    /* renamed from: b */
    public final RecyclerView f21629b;

    /* renamed from: c */
    public final vn5 f21630c;

    /* renamed from: d */
    public final SwipeRefreshLayout f21631d;

    /* renamed from: e */
    public final tr6 f21632e;

    /* renamed from: f */
    public final TextView f21633f;

    public c92(ConstraintLayout constraintLayout, RecyclerView recyclerView, vn5 vn5, SwipeRefreshLayout swipeRefreshLayout, tr6 tr6, TextView textView) {
        this.f21628a = constraintLayout;
        this.f21629b = recyclerView;
        this.f21630c = vn5;
        this.f21631d = swipeRefreshLayout;
        this.f21632e = tr6;
        this.f21633f = textView;
    }

    /* renamed from: a */
    public static c92 m32871a(View view) {
        int i = R.id.rvTokenList;
        RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.rvTokenList);
        if (recyclerView != null) {
            i = R.id.searchBar;
            View a = ca7.m11819a(view, R.id.searchBar);
            if (a != null) {
                vn5 a2 = vn5.m53437a(a);
                i = R.id.swipeRefreshLayout;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ca7.m11819a(view, R.id.swipeRefreshLayout);
                if (swipeRefreshLayout != null) {
                    i = R.id.toolbar;
                    View a3 = ca7.m11819a(view, R.id.toolbar);
                    if (a3 != null) {
                        tr6 a4 = tr6.m52423a(a3);
                        i = R.id.tv_not;
                        TextView textView = (TextView) ca7.m11819a(view, R.id.tv_not);
                        if (textView != null) {
                            return new c92((ConstraintLayout) view, recyclerView, a2, swipeRefreshLayout, a4, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo29895b() {
        return this.f21628a;
    }
}
