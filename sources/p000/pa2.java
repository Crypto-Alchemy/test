package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import net.safemoon.androidwallet.R;

/* renamed from: pa2 */
/* compiled from: FragmentSelectCurrencyBinding */
public final class pa2 {

    /* renamed from: a */
    public final ConstraintLayout f32618a;

    /* renamed from: b */
    public final AppCompatEditText f32619b;

    /* renamed from: c */
    public final ProgressBar f32620c;

    /* renamed from: d */
    public final RecyclerView f32621d;

    /* renamed from: e */
    public final SwipeRefreshLayout f32622e;

    /* renamed from: f */
    public final tr6 f32623f;

    /* renamed from: g */
    public final LinearLayout f32624g;

    public pa2(ConstraintLayout constraintLayout, AppCompatEditText appCompatEditText, ProgressBar progressBar, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, tr6 tr6, LinearLayout linearLayout) {
        this.f32618a = constraintLayout;
        this.f32619b = appCompatEditText;
        this.f32620c = progressBar;
        this.f32621d = recyclerView;
        this.f32622e = swipeRefreshLayout;
        this.f32623f = tr6;
        this.f32624g = linearLayout;
    }

    /* renamed from: a */
    public static pa2 m49835a(View view) {
        int i = R.id.etSearch;
        AppCompatEditText appCompatEditText = (AppCompatEditText) ca7.m11819a(view, R.id.etSearch);
        if (appCompatEditText != null) {
            i = R.id.pbTokenList;
            ProgressBar progressBar = (ProgressBar) ca7.m11819a(view, R.id.pbTokenList);
            if (progressBar != null) {
                i = R.id.rvToken;
                RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.rvToken);
                if (recyclerView != null) {
                    i = R.id.swipeRefreshLayout;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ca7.m11819a(view, R.id.swipeRefreshLayout);
                    if (swipeRefreshLayout != null) {
                        i = R.id.toolbar;
                        View a = ca7.m11819a(view, R.id.toolbar);
                        if (a != null) {
                            tr6 a2 = tr6.m52423a(a);
                            i = R.id.vSearchContainer;
                            LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view, R.id.vSearchContainer);
                            if (linearLayout != null) {
                                return new pa2((ConstraintLayout) view, appCompatEditText, progressBar, recyclerView, swipeRefreshLayout, a2, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
