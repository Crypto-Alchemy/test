package p000;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import net.safemoon.androidwallet.R;

/* renamed from: ya2 */
/* compiled from: FragmentSwitchWalletBinding */
public final class ya2 {

    /* renamed from: a */
    public final ConstraintLayout f35827a;

    /* renamed from: b */
    public final AppCompatImageView f35828b;

    /* renamed from: c */
    public final ConstraintLayout f35829c;

    /* renamed from: d */
    public final RecyclerView f35830d;

    /* renamed from: e */
    public final SwipeRefreshLayout f35831e;

    /* renamed from: f */
    public final ur6 f35832f;

    /* renamed from: g */
    public final TextView f35833g;

    public ya2(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, ur6 ur6, TextView textView) {
        this.f35827a = constraintLayout;
        this.f35828b = appCompatImageView;
        this.f35829c = constraintLayout2;
        this.f35830d = recyclerView;
        this.f35831e = swipeRefreshLayout;
        this.f35832f = ur6;
        this.f35833g = textView;
    }

    /* renamed from: a */
    public static ya2 m54668a(View view) {
        int i = R.id.imWalletsLink;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.imWalletsLink);
        if (appCompatImageView != null) {
            i = R.id.layoutLinkAllWallets;
            ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view, R.id.layoutLinkAllWallets);
            if (constraintLayout != null) {
                i = R.id.rvWallets;
                RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.rvWallets);
                if (recyclerView != null) {
                    i = R.id.swipeRefreshLayout;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ca7.m11819a(view, R.id.swipeRefreshLayout);
                    if (swipeRefreshLayout != null) {
                        i = R.id.toolbarParent;
                        View a = ca7.m11819a(view, R.id.toolbarParent);
                        if (a != null) {
                            ur6 a2 = ur6.m52984a(a);
                            i = R.id.txtWalletsLink;
                            TextView textView = (TextView) ca7.m11819a(view, R.id.txtWalletsLink);
                            if (textView != null) {
                                return new ya2((ConstraintLayout) view, appCompatImageView, constraintLayout, recyclerView, swipeRefreshLayout, a2, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo49619b() {
        return this.f35827a;
    }
}
